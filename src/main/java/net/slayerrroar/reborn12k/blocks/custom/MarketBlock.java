package net.slayerrroar.reborn12k.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.Stream;

@SuppressWarnings("deprecation")

public class MarketBlock extends HorizontalFacingBlock {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public MarketBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(1, 0, 13, 3, 14, 15),
            Block.createCuboidShape(0, 14, 0, 16, 16, 16),
            Block.createCuboidShape(1, 0, 1, 3, 14, 3),
            Block.createCuboidShape(13, 0, 1, 15, 14, 3),
            Block.createCuboidShape(13, 0, 13, 15, 14, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(0, 14, 0, 16, 16, 16),
            Block.createCuboidShape(13, 0, 13, 15, 14, 15),
            Block.createCuboidShape(1, 0, 13, 3, 14, 15),
            Block.createCuboidShape(1, 0, 1, 3, 14, 3),
            Block.createCuboidShape(13, 0, 1, 15, 14, 3)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(0, 14, 0, 16, 16, 16),
            Block.createCuboidShape(13, 0, 1, 15, 14, 3),
            Block.createCuboidShape(13, 0, 13, 15, 14, 15),
            Block.createCuboidShape(1, 0, 13, 3, 14, 15),
            Block.createCuboidShape(1, 0, 1, 3, 14, 3)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(0, 14, 0, 16, 16, 16),
            Block.createCuboidShape(1, 0, 1, 3, 14, 3),
            Block.createCuboidShape(13, 0, 1, 15, 14, 3),
            Block.createCuboidShape(13, 0, 13, 15, 14, 15),
            Block.createCuboidShape(1, 0, 13, 3, 14, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext shapeContext) {
        return switch (blockState.get(FACING)) {
            case WEST -> SHAPE_W;
            case SOUTH -> SHAPE_S;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
