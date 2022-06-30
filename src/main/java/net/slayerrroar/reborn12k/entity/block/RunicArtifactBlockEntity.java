package net.slayerrroar.reborn12k.entity.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.blocks.block_class.RunicArtifactBlock;
import net.slayerrroar.reborn12k.recipe.RunicArtifactRecipe;
import net.slayerrroar.reborn12k.screen.runic_artifact.RunicArtifactScreenHandler;
import net.slayerrroar.reborn12k.util.ImplementedInventory;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class RunicArtifactBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory, SidedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(2, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 399;
    private static final int[] INGREDIENTS_SLOTS = new int[]{0};
    private static final int[] OUTPUT_SLOTS = new int[]{1};

    public RunicArtifactBlockEntity(BlockPos pos, BlockState state) {
        super(CustomBlockEntities.RUNIC_ARTIFACT, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                return switch (index) {
                    case 0 -> RunicArtifactBlockEntity.this.progress;
                    case 1 -> RunicArtifactBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0 -> RunicArtifactBlockEntity.this.progress = value;
                    case 1 -> RunicArtifactBlockEntity.this.maxProgress = value;
                }
            }

            public int size() {
                return 2;
            }
        };
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("blockentity.runic_artifact");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new RunicArtifactScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("runic_artifact.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("runic_artifact.progress");
    }

    public static void tick(World world, BlockPos pos, BlockState state, RunicArtifactBlockEntity entity) {
        boolean bl = isCrafting(entity);
        boolean bl2 = false;
        if(hasRecipe(entity)) {
                entity.progress++;
                bl2 = true;
                if(entity.progress > entity.maxProgress) {
                    craftItem(entity);
            }
        } else {
            entity.resetProgress();
        }
        if (bl != hasRecipe(entity)) {
            bl2 = true;
            state = state.with(RunicArtifactBlock.LIT, hasRecipe(entity));
            world.setBlockState(pos, state, 3);
        }
        if (bl2) {
            AbstractFurnaceBlockEntity.markDirty(world, pos, state);
        }
    }

    private static boolean isCrafting(RunicArtifactBlockEntity entity) {
        return entity.progress > 0;
    }

    private static boolean hasRecipe(RunicArtifactBlockEntity entity) {
        World world = entity.world;
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i = 0; i < entity.inventory.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        assert world != null;
        Optional<RunicArtifactRecipe> match = world.getRecipeManager()
                .getFirstMatch(RunicArtifactRecipe.Type.INSTANCE, inventory, world);

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, match.get().getOutput());
    }

    private static void craftItem(RunicArtifactBlockEntity entity) {
        World world = entity.world;
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i = 0; i < entity.inventory.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        assert world != null;
        Optional<RunicArtifactRecipe> match = world.getRecipeManager()
                .getFirstMatch(RunicArtifactRecipe.Type.INSTANCE, inventory, world);

        if(match.isPresent()) {

            entity.setStack(1, new ItemStack(match.get().getOutput().getItem(),
                    entity.getStack(1).getCount() + match.get().getOutput().getCount()));

            entity.resetProgress();
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, ItemStack output) {
        return inventory.getStack(1).getItem() == output.getItem() || inventory.getStack(1).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(1).getMaxCount() > inventory.getStack(1).getCount();
    }

    @Override
    public int[] getAvailableSlots(Direction direction) {

        if (direction == Direction.DOWN) {
            return OUTPUT_SLOTS;
        }
        return INGREDIENTS_SLOTS;
    }

    @Override
    public boolean canInsert(int i, ItemStack itemStack, @Nullable Direction direction) {
        return this.isValid(i, itemStack);
    }

    @Override
    @SuppressWarnings("ALL")
    public boolean canExtract(int i, ItemStack itemStack, Direction direction) {
        if (direction == Direction.DOWN && i == 1) {
            return true;
        }
        return false;
    }
}