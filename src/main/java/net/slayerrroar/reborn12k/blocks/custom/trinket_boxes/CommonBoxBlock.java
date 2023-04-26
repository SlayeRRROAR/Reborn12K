package net.slayerrroar.reborn12k.blocks.custom.trinket_boxes;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.items.TrinketItems;
import net.slayerrroar.reborn12k.util.StrongboxUtil;

import java.util.Random;
import java.util.stream.Stream;

@SuppressWarnings("deprecation")

public class CommonBoxBlock extends HorizontalFacingBlock {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public CommonBoxBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!player.isSneaking()) {
            if (player.getStackInHand(Hand.MAIN_HAND).isOf(TrinketItems.STRONGBOX_KEY)) {
                if (player.isCreative()) {
                    world.breakBlock(pos, false, player);
                }
                if (!player.isCreative()) {
                    world.breakBlock(pos, false, player);
                    player.getStackInHand(Hand.MAIN_HAND).decrement(1);
                }
                randomRarityLoot(player);
                return ActionResult.SUCCESS;
            }
            player.sendMessage(Text.translatable("item.reborn12k.locked_strongbox.tooltip"), true);
            return ActionResult.FAIL;
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }

    private void randomRarityLoot(PlayerEntity player) {
        Random rarityRand = new Random();
        int upperbound = 101;
        int rarity_int = rarityRand.nextInt(upperbound);

        if (rarity_int < 80) {
            StrongboxUtil.randomCommon(player);
            player.sendMessage(Text.translatable("item.reborn12k.locked_strongbox.common"), true);
        }
        if (rarity_int < 95 && rarity_int > 79) {
            StrongboxUtil.randomRare(player);
            player.sendMessage(Text.translatable("item.reborn12k.locked_strongbox.rare"), true);
        }
        if (rarity_int < 99 && rarity_int > 94) {
            StrongboxUtil.randomEpic(player);
            player.sendMessage(Text.translatable("item.reborn12k.locked_strongbox.epic"), true);
        }
        if (rarity_int == 100) {
            StrongboxUtil.randomLegendary(player);
            player.sendMessage(Text.translatable("item.reborn12k.locked_strongbox.legendary"), true);
        }
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(1, 0, 1, 15, 14, 15),
            Block.createCuboidShape(15, 8, 5, 16, 10, 11),
            Block.createCuboidShape(0, 8, 5, 1, 10, 11),
            Block.createCuboidShape(7, 8, 0, 9, 11, 1)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(1, 0, 1, 15, 14, 15),
            Block.createCuboidShape(5, 8, 0, 11, 10, 1),
            Block.createCuboidShape(5, 8, 15, 11, 10, 16),
            Block.createCuboidShape(0, 8, 7, 1, 11, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(1, 0, 1, 15, 14, 15),
            Block.createCuboidShape(0, 8, 5, 1, 10, 11),
            Block.createCuboidShape(15, 8, 5, 16, 10, 11),
            Block.createCuboidShape(7, 8, 15, 9, 11, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(1, 0, 1, 15, 14, 15),
            Block.createCuboidShape(5, 8, 15, 11, 10, 16),
            Block.createCuboidShape(5, 8, 0, 11, 10, 1),
            Block.createCuboidShape(15, 8, 7, 16, 11, 9)
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
