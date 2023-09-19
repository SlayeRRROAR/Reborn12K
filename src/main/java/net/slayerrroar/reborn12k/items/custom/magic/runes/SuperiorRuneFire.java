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
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;
import net.slayerrroar.reborn12k.blocks.GenericBlocks;

import java.util.Random;

import static net.minecraft.block.Block.dropStack;

public class SuperiorRuneFire extends Item {
    public SuperiorRuneFire(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
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
        BlockPos pos = context.getBlockPos();

        if (block.isOf(GenericBlocks.RUBY_BLOCK) && world.getBlockState(pos.up()).isOf(Blocks.FIRE)) {
            world.breakBlock(pos, false);
            dropStack(world, pos, new ItemStack(AdvancedBlocks.FIRE_GEM));
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
            return "item.reborn12k.magic_error.tooltip1";
        }
        if (messageInt == 1) {
            return "item.reborn12k.magic_error.tooltip2";
        }
        if (messageInt == 2) {
            return "item.reborn12k.magic_error.tooltip3";
        }
        return "item.reborn12k.magic_error.tooltip4";
    }

}
