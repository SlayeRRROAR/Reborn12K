package net.slayerrroar.reborn12k.blocks.custom_blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

@SuppressWarnings("deprecation")

public class MarketBlock extends Block {
    public static final DirectionProperty FACING = Properties.HOPPER_FACING;

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

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext itemPlacementContext) {
        return this.getDefaultState().with(FACING, itemPlacementContext.getPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState blockState, BlockRotation blockRotation) {
        return blockState.with(FACING, blockRotation.rotate(blockState.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState blockState, BlockMirror blockMirror) {
        return blockState.rotate(blockMirror.getRotation(blockState.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
