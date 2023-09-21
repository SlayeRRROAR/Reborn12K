package net.slayerrroar.reborn12k.items.custom.magic.runes;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.blocks.GenericBlocks;
import net.slayerrroar.reborn12k.items.GenericItems;

import static net.minecraft.block.Block.dropStack;

public class EtherealRune extends Item {
    public EtherealRune(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        assert player != null;
        ItemStack stack = context.getStack();
        BlockState block = world.getBlockState(context.getBlockPos());
        BlockPos pos = context.getBlockPos();

        if (block.isOf(GenericBlocks.STEEL_BLOCK)) {
            world.breakBlock(pos, false);
            stack.setCount(stack.getCount()-1);
            dropStack(world, pos, new ItemStack(GenericItems.MAGISTEEL_INGOT));
            world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 0.25f, 0.25f);
            return ActionResult.SUCCESS;
        }
        return ActionResult.FAIL;
    }

}
