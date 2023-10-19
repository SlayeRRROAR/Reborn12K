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
import net.slayerrroar.reborn12k.items.RebornItems;

import java.util.Random;

import static net.minecraft.block.Block.dropStack;

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
        BlockPos pos = context.getBlockPos();


        if (block.isOf(Blocks.BLUE_ORCHID)) {
            world.breakBlock(pos, false);
            decreaseStackAndPlaySound(stack, world, player);
            dropStack(world, pos, new ItemStack(RebornItems.SUPERIOR_RUNE_OF_AIR, 1));
            return ActionResult.SUCCESS;
        }
        if (block.isOf(Blocks.OXEYE_DAISY)) {
            world.breakBlock(pos, false);
            decreaseStackAndPlaySound(stack, world, player);
            dropStack(world, pos, new ItemStack(RebornItems.SUPERIOR_RUNE_OF_EARTH, 1));
            return ActionResult.SUCCESS;
        }
        if (block.isOf(Blocks.CORNFLOWER)) {
            world.breakBlock(pos, false);
            decreaseStackAndPlaySound(stack, world, player);
            dropStack(world, pos, new ItemStack(RebornItems.SUPERIOR_RUNE_OF_WATER, 1));
            return ActionResult.SUCCESS;
        }
        if (block.isOf(Blocks.POPPY)) {
            world.breakBlock(pos, false);
            decreaseStackAndPlaySound(stack, world, player);
            dropStack(world, pos, new ItemStack(RebornItems.SUPERIOR_RUNE_OF_FIRE, 1));
            return ActionResult.SUCCESS;
        }
        if (block.isOf(Blocks.SUNFLOWER) && world.getBlockState(pos.up()).isOf(Blocks.SUNFLOWER)) {
            world.breakBlock(pos, false);
            decreaseStackAndPlaySound(stack, world, player);
            dropStack(world, pos, new ItemStack(RebornItems.SUPERIOR_RUNE_OF_LIGHT, 1));
            return ActionResult.SUCCESS;
        }
        if (block.isOf(Blocks.SUNFLOWER) && !world.getBlockState(pos.up()).isOf(Blocks.SUNFLOWER)) {
            world.breakBlock(pos.down(), false);
            decreaseStackAndPlaySound(stack, world, player);
            dropStack(world, pos, new ItemStack(RebornItems.SUPERIOR_RUNE_OF_LIGHT, 1));
            return ActionResult.SUCCESS;
        }
        if (block.isOf(Blocks.ALLIUM)) {
            world.breakBlock(pos, false);
            decreaseStackAndPlaySound(stack, world, player);
            dropStack(world, pos, new ItemStack(RebornItems.SUPERIOR_RUNE_OF_DARKNESS, 1));
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
