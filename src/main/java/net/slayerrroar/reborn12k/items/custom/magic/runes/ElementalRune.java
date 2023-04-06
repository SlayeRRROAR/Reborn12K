package net.slayerrroar.reborn12k.items.custom.magic.runes;

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
import net.slayerrroar.reborn12k.blocks.BlockGenerics;
import net.slayerrroar.reborn12k.items.ItemGenerics;

public class ElementalRune extends Item {
    public ElementalRune(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        assert player != null;
        ItemStack stack = context.getStack();
        BlockState block = world.getBlockState(context.getBlockPos());

        if(block.isOf(Blocks.DIAMOND_BLOCK)) {
            world.setBlockState(context.getBlockPos(), AdvancedBlocks.AIR_GEM.getDefaultState());
            stack.setCount(stack.getCount()-1);
            world.playSound(null, player.getX(), player.getY(), player.getZ(),
                    SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 0.25F, 0.25F);
            return ActionResult.SUCCESS;
        }
        if(block.isOf(Blocks.EMERALD_BLOCK)) {
            world.setBlockState(context.getBlockPos(), AdvancedBlocks.EARTH_GEM.getDefaultState());
            stack.setCount(stack.getCount()-1);
            world.playSound(null, player.getX(), player.getY(), player.getZ(),
                    SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 0.25F, 0.25F);
            return ActionResult.SUCCESS;
        }
        if(block.isOf(BlockGenerics.SAPPHIRE_BLOCK)) {
            world.setBlockState(context.getBlockPos(), AdvancedBlocks.WATER_GEM.getDefaultState());
            stack.setCount(stack.getCount()-1);
            world.playSound(null, player.getX(), player.getY(), player.getZ(),
                    SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 0.25F, 0.25F);
            return ActionResult.SUCCESS;
        }
        if(block.isOf(BlockGenerics.RUBY_BLOCK)) {
            world.setBlockState(context.getBlockPos(), AdvancedBlocks.FIRE_GEM.getDefaultState());
            stack.setCount(stack.getCount()-1);
            world.playSound(null, player.getX(), player.getY(), player.getZ(),
                    SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 0.25F, 0.25F);
            return ActionResult.SUCCESS;
        }
        if(block.isOf(BlockGenerics.SUNSTONE_BLOCK) && world.isDay()) {
            world.setBlockState(context.getBlockPos(), AdvancedBlocks.SUN_GEM.getDefaultState());
            stack.setCount(stack.getCount()-1);
            world.playSound(null, player.getX(), player.getY(), player.getZ(),
                    SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 0.25F, 0.25F);
            return ActionResult.SUCCESS;
        }
        if(block.isOf(BlockGenerics.MOONSTONE_BLOCK) && world.isNight()) {
            world.setBlockState(context.getBlockPos(), AdvancedBlocks.MOON_GEM.getDefaultState());
            stack.setCount(stack.getCount()-1);
            world.playSound(null, player.getX(), player.getY(), player.getZ(),
                    SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 0.25F, 0.25F);
            return ActionResult.SUCCESS;
        }
        return ActionResult.FAIL;
    }

}