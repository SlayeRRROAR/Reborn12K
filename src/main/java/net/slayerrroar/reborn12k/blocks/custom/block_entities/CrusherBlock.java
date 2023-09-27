package net.slayerrroar.reborn12k.blocks.custom.block_entities;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.entity.RebornBlockEntities;
import net.slayerrroar.reborn12k.entity.block_entities.CrusherBlockEntity;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("deprecation")
public class CrusherBlock extends BlockWithEntity implements BlockEntityProvider {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    public static BooleanProperty LIT = AbstractFurnaceBlock.LIT;

    public CrusherBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(LIT, false));
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
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
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, LIT);
    }

    /* BLOCK ENTITY STUFF */

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof CrusherBlockEntity) {
                ItemScatterer.spawn(world, pos, (CrusherBlockEntity)blockEntity);
                world.updateComparators(pos, this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            NamedScreenHandlerFactory screenHandlerFactory = state.createScreenHandlerFactory(world, pos);

            if (screenHandlerFactory != null) {
                player.openHandledScreen(screenHandlerFactory);
            }
        }
        return ActionResult.SUCCESS;
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (state.get(LIT)) {
            double x = (double) pos.getX() + 0.5D;
            double y = pos.getY();
            double z = (double) pos.getZ() + 0.5D;

            if (random.nextDouble() < 0.1D) {
                world.playSound(x, y, z, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
            }

            Direction direction_1 = state.get(FACING);
            Direction.Axis direction$Axis_1 = direction_1.getAxis();

            double double_5 = random.nextDouble() * 0.6D - 0.3D;
            double double_6 = direction$Axis_1 == Direction.Axis.X ? (double) direction_1.getOffsetX() * 0.52D : double_5;
            double double_7 = random.nextDouble() * 6.0D / 16.0D;
            double double_8 = direction$Axis_1 == Direction.Axis.Z ? (double) direction_1.getOffsetZ() * 0.52D : double_5;

            world.addParticle(ParticleTypes.SMOKE, x + double_6, y + double_7, z + double_8, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, x + double_6, y + double_7, z + double_8, 0.0D, 0.0D, 0.0D);
        }
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CrusherBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return validateTicker(type, RebornBlockEntities.CRUSHER, CrusherBlockEntity::tick);
    }
}
