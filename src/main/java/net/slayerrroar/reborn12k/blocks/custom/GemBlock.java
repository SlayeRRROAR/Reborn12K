package net.slayerrroar.reborn12k.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

@SuppressWarnings("deprecation")

public class GemBlock extends Block {
    public GemBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape DEFAULT = java.util.Optional.of(Block.createCuboidShape(3, 3, 3, 13, 13, 13)).get();

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(player.isSneaking() && player.getStackInHand(Hand.MAIN_HAND).isEmpty()) {
            if(player.isCreative()) {
                world.breakBlock(pos, false, player);
            }
            if(!player.isCreative()) {
                world.breakBlock(pos, true, player);
            }
            return ActionResult.SUCCESS;
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext shapeContext) {
        return DEFAULT;
    }

}
