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

public class BlackTableBlock extends Block {
    public BlackTableBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape DEFAULT = Stream.of(
            Block.createCuboidShape(0, 12, 0, 16, 16, 16),
            Block.createCuboidShape(5, 2, 5, 11, 12, 11),
            Block.createCuboidShape(3, 0, 3, 13, 2, 13)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext shapeContext) {
        return DEFAULT;
    }
}
