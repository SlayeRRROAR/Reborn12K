package net.slayerrroar.reborn12k.items.custom.magic;

import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.util.InventoryInteractionUtil;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("ConstantConditions")
public class MirrorItem extends Item {
    public MirrorItem(Settings settings) {
        super(settings);
    }

    private boolean bedIsAvaible(World world, ItemStack stack) {
        if (getTeleportPos(stack.getOrCreateNbt()) == null) {
            return false;
        } else return world.getBlockState(getTeleportPos(stack.getOrCreateNbt())).isIn(BlockTags.BEDS);
    }

    private void setPositionAndUpdate(ServerPlayerEntity serverPlayer, BlockPos pos) {
        serverPlayer.fallDistance = 0;
        serverPlayer.teleport(serverPlayer.getServer().getWorld(serverPlayer.getSpawnPointDimension()),
                pos.getX(), pos.getY(), pos.getZ(),
                serverPlayer.getYaw(), serverPlayer.getPitch());
        serverPlayer.sleep(pos);
    }

    private void attemptTeleport(World world, PlayerEntity player) {
        ServerPlayerEntity serverPlayer = (ServerPlayerEntity) player;
        ServerWorld teleportDim = serverPlayer.getServer().getWorld(serverPlayer.getSpawnPointDimension());
        ItemStack stack = player.getStackInHand(Hand.MAIN_HAND);

        if (getTeleportPos(stack.getOrCreateNbt()) == null) {
            player.sendMessage(Text.translatable("item.reborn12k.magic_mirror.tooltip1"), true);
        } else if (!teleportDim.getBlockState(getTeleportPos(stack.getOrCreateNbt())).isIn(BlockTags.BEDS)) {
            player.sendMessage(Text.translatable("item.reborn12k.magic_mirror.tooltip1"), true);
        } else {
            world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, SoundCategory.PLAYERS, 0.25f, 0.25f);
            setPositionAndUpdate(serverPlayer, getTeleportPos(stack.getOrCreateNbt()));
            player.getStackInHand(Hand.MAIN_HAND).damage(1, world.random, serverPlayer);
            player.getItemCooldownManager().set(this, 20);
            player.sendMessage(Text.translatable("item.reborn12k.magic_mirror.tooltip2"), true);
        }
    }

    private void writeNbt(BlockPos pos, NbtCompound nbt) {
        nbt.put("TeleportPos", NbtHelper.fromBlockPos(pos));
    }

    @Nullable
    private static BlockPos getTeleportPos(NbtCompound nbt) {
        if (nbt.contains("TeleportPos")) {
            return NbtHelper.toBlockPos(nbt.getCompound("TeleportPos"));
        }
        return null;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        ItemStack stack = context.getStack();

        assert player != null;
        BlockState block = world.getBlockState(context.getBlockPos());
        BlockPos pos = context.getBlockPos();

        if (player.isSneaking() && block.isIn(BlockTags.BEDS)) {
            if (getTeleportPos(stack.getNbt()) != null) {
                stack.setNbt(new NbtCompound());
            }
            writeNbt(pos, stack.getOrCreateNbt());
            player.sendMessage(Text.translatable("item.reborn12k.magic_mirror.tooltip3"), true);
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(Hand.MAIN_HAND);

        if (!world.isClient) {
            if (hand == Hand.MAIN_HAND) {
                if (stack.getDamage() < 16) {
                    attemptTeleport(world, player);
                    return new TypedActionResult<>(ActionResult.SUCCESS, player.getStackInHand(hand));
                } else {
                    if (InventoryInteractionUtil.itemCountInInventory(player, Items.ENDER_PEARL) >= 1) {
                        InventoryInteractionUtil.removeOneItemFromInventory(player, Items.ENDER_PEARL);
                        stack.setDamage(0);
                        player.sendMessage(Text.translatable("item.reborn12k.magic_mirror.tooltip4"), true);

                        return new TypedActionResult<>(ActionResult.SUCCESS, player.getStackInHand(hand));
                    } else {
                        player.sendMessage(Text.translatable("item.reborn12k.magic_mirror.tooltip5"), true);
                    }
                }
            }
        }
        return new TypedActionResult<>(ActionResult.FAIL, player.getStackInHand(hand));
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (stack.getDamage() >= stack.getMaxDamage()) {
            tooltip.add(Text.translatable("item.reborn12k.magic_mirror.tooltip6"));
        } else if (bedIsAvaible(world, stack)) {
            tooltip.add(Text.translatable("item.reborn12k.magic_mirror.tooltip7"));
        } else {
            tooltip.add(Text.translatable("item.reborn12k.magic_mirror.tooltip8"));
        }
    }

}
