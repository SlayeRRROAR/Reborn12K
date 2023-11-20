package net.slayerrroar.reborn12k.items.custom.magic;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.util.InventoryInteractionUtil;

public class MirrorItem extends Item {
    public MirrorItem(Settings settings) {
        super(settings);
    }

    static BlockPos teleportPos = null;

    public void setPositionAndUpdate(ServerPlayerEntity player, BlockPos teleportPos) {
        player.teleport(teleportPos.getX() + 0.5f, teleportPos.getY() + 0.6F, teleportPos.getZ() + 0.5f);
        player.fallDistance = 0;
    }

    private void attemptTeleport(World world, PlayerEntity player) {
        ServerPlayerEntity serverPlayer = (ServerPlayerEntity) player;

        if (teleportPos == null) {
            player.sendMessage(Text.translatable("item.reborn12k.magic_mirror.tooltip1"), true);
        } else {
            setPositionAndUpdate(serverPlayer, teleportPos);
            world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25f, 0.25f);
            player.getStackInHand(Hand.MAIN_HAND).damage(1, world.random, serverPlayer);
            player.getItemCooldownManager().set(this, 20);
            player.sendMessage(Text.translatable("item.reborn12k.magic_mirror.tooltip2"), true);
        }
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();

        assert player != null;
        BlockState block = world.getBlockState(context.getBlockPos());
        BlockPos pos = context.getBlockPos();

        if (player.isSneaking() && block.isIn(BlockTags.BEDS)) {
            teleportPos = pos;
            player.sendMessage(Text.translatable("item.reborn12k.magic_mirror.tooltip3"), true);

            return ActionResult.SUCCESS;
        } else {
            return ActionResult.PASS;
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(Hand.MAIN_HAND);

        if (!world.isClient) {
            if (hand == Hand.MAIN_HAND) {
                if (world.getRegistryKey() == World.OVERWORLD) {
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
                } else {
                    player.sendMessage(Text.translatable("item.reborn12k.magic_mirror.tooltip6"), true);
                }
            }
        }
        return new TypedActionResult<>(ActionResult.FAIL, player.getStackInHand(hand));
    }

}
