package net.slayerrroar.reborn12k.items.custom.magic.runes;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;
import net.slayerrroar.reborn12k.blocks.GenericBlocks;

import java.util.Random;

public class ElementalRune extends Item {
    public ElementalRune(Settings settings) {
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
        BlockState block = world.getBlockState(context.getBlockPos());

        if (block.isOf(Blocks.DIAMOND_BLOCK) && player.getY() > 310) {
            world.setBlockState(context.getBlockPos(), AdvancedBlocks.AIR_GEM.getDefaultState());
            decreaseStackAndPlaySound(stack, world, player);
            return ActionResult.SUCCESS;
        }
        if (block.isOf(Blocks.EMERALD_BLOCK) && player.getY() < -54) {
            world.setBlockState(context.getBlockPos(), AdvancedBlocks.EARTH_GEM.getDefaultState());
            decreaseStackAndPlaySound(stack, world, player);
            return ActionResult.SUCCESS;
        }
        if (block.isOf(GenericBlocks.SAPPHIRE_BLOCK) && player.isSubmergedInWater()) {
            world.setBlockState(context.getBlockPos(), AdvancedBlocks.WATER_GEM.getDefaultState());
            return ActionResult.SUCCESS;
        }
        if (block.isOf(GenericBlocks.RUBY_BLOCK) && world.getRegistryKey() == (World.NETHER)) {
            world.setBlockState(context.getBlockPos(), AdvancedBlocks.FIRE_GEM.getDefaultState());
            decreaseStackAndPlaySound(stack, world, player);
            return ActionResult.SUCCESS;
        }
        if (block.isOf(GenericBlocks.SUNSTONE_BLOCK) && world.isDay()) {
            world.setBlockState(context.getBlockPos(), AdvancedBlocks.SUN_GEM.getDefaultState());
            decreaseStackAndPlaySound(stack, world, player);
            return ActionResult.SUCCESS;
        }
        if (block.isOf(GenericBlocks.MOONSTONE_BLOCK) && world.isNight()) {
            world.setBlockState(context.getBlockPos(), AdvancedBlocks.MOON_GEM.getDefaultState());
            decreaseStackAndPlaySound(stack, world, player);
            return ActionResult.SUCCESS;
        }

        player.sendMessage(Text.translatable(randomMessage()), true);
        return ActionResult.SUCCESS;
    }

    private static String randomMessage() {
        Random randomMessage = new Random();
        int messageUpperbound = 4;
        int messageInt = randomMessage.nextInt(messageUpperbound);

        if (messageInt == 0) {
            return "item.reborn12k.elemental_rune.tooltip1";
        }
        if (messageInt == 1) {
            return "item.reborn12k.elemental_rune.tooltip2";
        }
        if (messageInt == 2) {
            return "item.reborn12k.elemental_rune.tooltip3";
        }
        return "item.reborn12k.elemental_rune.tooltip4";
    }

}
