package net.slayerrroar.reborn12k.items.custom.magic;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("ConstantConditions")
public class WarpScrollItem extends Item {
    public WarpScrollItem(Settings settings) {
        super(settings);
    }

    private boolean hasCoordinatesStored(NbtCompound nbt) {
        return getTeleportPos(nbt) != null;
    }

    private void setPositionAndUpdate(ServerPlayerEntity serverPlayer, BlockPos pos) {
        serverPlayer.fallDistance = 0;
        serverPlayer.teleport(serverPlayer.getServer().getWorld(serverPlayer.getSpawnPointDimension()),
                pos.getX() + 0.5f, pos.getY() + 0.063f, pos.getZ() + 0.5f,
                serverPlayer.getYaw(), serverPlayer.getPitch());
        serverPlayer.sleep(pos);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return stack.hasNbt();
    }

    private void attemptTeleport(World world, PlayerEntity player) {
        ServerPlayerEntity serverPlayer = (ServerPlayerEntity) player;
        ItemStack stack = player.getStackInHand(Hand.MAIN_HAND);

        if (getTeleportPos(stack.getOrCreateNbt()) == null) {
            player.sendMessage(Text.translatable("item.reborn12k.warp_scroll.tooltip1"), true);
        } else {
            world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, SoundCategory.PLAYERS, 0.25f, 0.25f);
            setPositionAndUpdate(serverPlayer, getTeleportPos(stack.getOrCreateNbt()));
            player.getStackInHand(Hand.MAIN_HAND).decrement(1);
            player.getItemCooldownManager().set(this, 20);
            player.sendMessage(Text.translatable("item.reborn12k.warp_scroll.tooltip2"), true);
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
        PlayerEntity player = context.getPlayer();
        ItemStack stack = context.getStack();

        assert player != null;
        BlockPos pos = context.getBlockPos();

        if (player.isSneaking()) {
            if (hasCoordinatesStored(stack.getOrCreateNbt())) {
                player.sendMessage(Text.translatable("item.reborn12k.warp_scroll.tooltip3"), true);

                return ActionResult.FAIL;
            } else {
                writeNbt(pos.up(), stack.getOrCreateNbt());
                player.sendMessage(Text.translatable("item.reborn12k.warp_scroll.tooltip4"), true);

                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (!world.isClient) {
            if (hand == Hand.MAIN_HAND) {
                attemptTeleport(world, player);

                return new TypedActionResult<>(ActionResult.SUCCESS, player.getStackInHand(hand));
            }
        }
        return new TypedActionResult<>(ActionResult.FAIL, player.getStackInHand(hand));
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (hasCoordinatesStored(stack.getOrCreateNbt())) {
            tooltip.add(Text.translatable("item.reborn12k.warp_scroll.tooltip5"));
        } else {
            tooltip.add(Text.translatable("item.reborn12k.warp_scroll.tooltip6"));
        }
    }

}
