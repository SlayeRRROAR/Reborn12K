package net.slayerrroar.reborn12k.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

@SuppressWarnings("deprecation")

public class GemBlock extends Block {
    public GemBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape DEFAULT = java.util.Optional.of
            (Block.createCuboidShape(5, 5, 5, 11, 11, 11)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext shapeContext) {
        return DEFAULT;
    }

}
