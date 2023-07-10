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

public class AlchemicTableBlock extends Block {
    public AlchemicTableBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape DEFAULT = Stream.of(
            Block.createCuboidShape(0, 12, 0, 16, 16, 16),
            Block.createCuboidShape(4, 11, 4, 12, 12, 12),
            Block.createCuboidShape(5, 3, 5, 11, 11, 11),
            Block.createCuboidShape(4, 2, 4, 12, 3, 12),
            Block.createCuboidShape(2, 0, 2, 14, 2, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext shapeContext) {
        return DEFAULT;
    }
}
