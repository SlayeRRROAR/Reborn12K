package net.slayerrroar.reborn12k.items.custom.magic.runes;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;
import net.slayerrroar.reborn12k.items.MagicItems;

public class BlankRune extends Item {
    public BlankRune(Settings settings) {
        super(settings);
    }

    private void decreaseStackAndPlaySound(ItemStack stack, World world, PlayerEntity player) {
        stack.setCount(stack.getCount()-1);
        world.playSound(null, player.getX(), player.getY(), player.getZ(),
                SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 0.25f, 0.25f);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        assert player != null;
        ItemStack stack = context.getStack();
        BlockState catalyst = world.getBlockState(context.getBlockPos());
        BlockState pedestal = world.getBlockState(context.getBlockPos().down());

        if (catalyst.isOf(AdvancedBlocks.AIR_GEM) && pedestal.isOf(AdvancedBlocks.ARCANE_PEDESTAL)) {
            player.dropItem(MagicItems.RUNE_OF_AIR, 1);
            decreaseStackAndPlaySound(stack, world, player);
            return ActionResult.SUCCESS;
        }
        if (catalyst.isOf(AdvancedBlocks.EARTH_GEM) && pedestal.isOf(AdvancedBlocks.ARCANE_PEDESTAL)) {
            player.dropItem(MagicItems.RUNE_OF_EARTH, 1);
            decreaseStackAndPlaySound(stack, world, player);
            return ActionResult.SUCCESS;
        }
        if (catalyst.isOf(AdvancedBlocks.WATER_GEM) && pedestal.isOf(AdvancedBlocks.ARCANE_PEDESTAL)) {
            player.dropItem(MagicItems.RUNE_OF_WATER, 1);
            decreaseStackAndPlaySound(stack, world, player);
            return ActionResult.SUCCESS;
        }
        if (catalyst.isOf(AdvancedBlocks.FIRE_GEM) && pedestal.isOf(AdvancedBlocks.ARCANE_PEDESTAL)) {
            player.dropItem(MagicItems.RUNE_OF_FIRE, 1);
            decreaseStackAndPlaySound(stack, world, player);
            return ActionResult.SUCCESS;
        }
        if (catalyst.isOf(AdvancedBlocks.SUN_GEM) && pedestal.isOf(AdvancedBlocks.ARCANE_PEDESTAL)) {
            player.dropItem(MagicItems.RUNE_OF_LIGHT, 1);
            decreaseStackAndPlaySound(stack, world, player);
            return ActionResult.SUCCESS;
        }
        if (catalyst.isOf(AdvancedBlocks.MOON_GEM) && pedestal.isOf(AdvancedBlocks.ARCANE_PEDESTAL)) {
            player.dropItem(MagicItems.RUNE_OF_DARKNESS, 1);
            decreaseStackAndPlaySound(stack, world, player);
            return ActionResult.SUCCESS;
        }
        return ActionResult.FAIL;
    }

}
