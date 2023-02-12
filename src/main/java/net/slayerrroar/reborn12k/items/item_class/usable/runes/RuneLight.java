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
import net.slayerrroar.reborn12k.blocks.RebornOreBlocks;

public class RuneLight extends Item {
    public RuneLight(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity playerEntity = context.getPlayer();
        assert playerEntity != null;
        ItemStack stack = context.getStack();
        BlockState block = world.getBlockState(context.getBlockPos());

        if(block.isOf(Blocks.IRON_ORE) || block.isOf(Blocks.DEEPSLATE_IRON_ORE)) {
            world.setBlockState(context.getBlockPos(), RebornOreBlocks.NICHIRIN_ORE.getDefaultState());
            stack.setCount(stack.getCount()-1);
            world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 0.25F, 0.25F);
            return ActionResult.SUCCESS;
        }
        return ActionResult.FAIL;
    }

}
