package net.slayerrroar.reborn12k.items.item_class.usable.runes;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;
import net.slayerrroar.reborn12k.blocks.RebornBlocks;
import net.slayerrroar.reborn12k.items.MagicItems;

public class BlankRune extends Item {
    public BlankRune(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity playerEntity = context.getPlayer();
        assert playerEntity != null;
        ItemStack stack = context.getStack();
        BlockState block = world.getBlockState(context.getBlockPos());
        BlockState catalyst = world.getBlockState(context.getBlockPos().down());

        if(block.isOf(AdvancedBlocks.ARCANE_PEDESTAL) && catalyst.isOf(Blocks.DIAMOND_BLOCK)) {
            playerEntity.dropItem(MagicItems.RUNE_OF_AIR, 1);
            stack.setCount(stack.getCount()-1);
            world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 0.25F, 0.25F);
            return ActionResult.SUCCESS;
        }
        if(block.isOf(AdvancedBlocks.ARCANE_PEDESTAL) && catalyst.isOf(Blocks.EMERALD_BLOCK)) {
            playerEntity.dropItem(MagicItems.RUNE_OF_EARTH, 1);
            stack.setCount(stack.getCount()-1);
            world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 0.25F, 0.25F);
            return ActionResult.SUCCESS;
        }
        if(block.isOf(AdvancedBlocks.ARCANE_PEDESTAL) && catalyst.isOf(RebornBlocks.SAPPHIRE_BLOCK)) {
            playerEntity.dropItem(MagicItems.RUNE_OF_WATER, 1);
            stack.setCount(stack.getCount()-1);
            world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 0.25F, 0.25F);
            return ActionResult.SUCCESS;
        }
        if(block.isOf(AdvancedBlocks.ARCANE_PEDESTAL) && catalyst.isOf(RebornBlocks.RUBY_BLOCK)) {
            playerEntity.dropItem(MagicItems.RUNE_OF_FIRE, 1);
            stack.setCount(stack.getCount()-1);
            world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 0.25F, 0.25F);
            return ActionResult.SUCCESS;
        }
        if(block.isOf(AdvancedBlocks.ARCANE_PEDESTAL) && catalyst.isOf(RebornBlocks.SUNSTONE_BLOCK)) {
            playerEntity.dropItem(MagicItems.RUNE_OF_LIGHT, 1);
            stack.setCount(stack.getCount()-1);
            world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 0.25F, 0.25F);
            return ActionResult.SUCCESS;
        }
        if(block.isOf(AdvancedBlocks.ARCANE_PEDESTAL) && catalyst.isOf(RebornBlocks.MOONSTONE_BLOCK)) {
            playerEntity.dropItem(MagicItems.RUNE_OF_DARKNESS, 1);
            stack.setCount(stack.getCount()-1);
            world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 0.25F, 0.25F);
            return ActionResult.SUCCESS;
        }
        return ActionResult.FAIL;
    }

}
