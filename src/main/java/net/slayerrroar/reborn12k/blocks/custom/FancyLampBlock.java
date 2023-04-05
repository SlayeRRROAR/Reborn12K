package net.slayerrroar.reborn12k.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.Stream;

@SuppressWarnings("deprecation")

public class FancyLampBlock extends Block {
    public FancyLampBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape DEFAULT = Stream.of(
            Block.createCuboidShape(0, 14, 2, 2, 16, 16),
            Block.createCuboidShape(2, 2, 2, 14, 14, 14),
            Block.createCuboidShape(0, 0, 0, 2, 2, 14),
            Block.createCuboidShape(0, 0, 14, 14, 2, 16),

            Block.createCuboidShape(2, 0, 0, 16, 2, 2),
            Block.createCuboidShape(14, 0, 2, 16, 2, 16),
            Block.createCuboidShape(0, 2, 0, 2, 14, 2),
            Block.createCuboidShape(0, 2, 14, 2, 14, 16),
            Block.createCuboidShape(14, 2, 0, 16, 14, 2),
            Block.createCuboidShape(14, 2, 14, 16, 14, 16),
            Block.createCuboidShape(0, 14, 0, 14, 16, 2),
            Block.createCuboidShape(14, 14, 0, 16, 16, 14),
            Block.createCuboidShape(2, 14, 14, 16, 16, 16),
            Block.createCuboidShape(4, 4, 4, 12, 12, 12)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext shapeContext) {
        return DEFAULT;
    }
}
