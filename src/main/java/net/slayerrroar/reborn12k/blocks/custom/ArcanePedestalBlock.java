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

public class ArcanePedestalBlock extends Block {
    public ArcanePedestalBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape DEFAULT = Stream.of(
            Block.createCuboidShape(2, 0, 2, 14, 2, 14),
            Block.createCuboidShape(4, 2, 4, 12, 14, 12),
            Block.createCuboidShape(3, 14, 3, 13, 16, 13)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext shapeContext) {
        return DEFAULT;
    }

}
