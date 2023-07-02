package net.slayerrroar.reborn12k.entity.block_entities;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
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
import net.slayerrroar.reborn12k.blocks.custom.block_entities.ManufactoryBlock;
import net.slayerrroar.reborn12k.entity.RebornBlockEntities;
import net.slayerrroar.reborn12k.recipe.recipe_types.ManufactoryRecipe;
import net.slayerrroar.reborn12k.screen.manufactory.ManufactoryScreenHandler;
import net.slayerrroar.reborn12k.util.ImplementedInventory;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.Optional;

@SuppressWarnings({"OptionalGetWithoutIsPresent", "deprecation"})

public class ManufactoryBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(4, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 160;

    public ManufactoryBlockEntity(BlockPos pos, BlockState state) {
        super(RebornBlockEntities.MANUFACTORY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> ManufactoryBlockEntity.this.progress;
                    case 1 -> ManufactoryBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0 -> ManufactoryBlockEntity.this.progress = value;
                    case 1 -> ManufactoryBlockEntity.this.maxProgress = value;
                }
            }

            public int size() {
                return 2;
            }
        };
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }
    @Override
    public Text getDisplayName() {
        return Text.translatable("block.reborn12k.manufactory");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new ManufactoryScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, inventory);
        super.writeNbt(nbt);
        nbt.putInt("manufactory.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt,inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("manufactory.progress");
    }

    public static void tick(World world, BlockPos blockPos, BlockState state, ManufactoryBlockEntity entity) {
        if (world.isClient()) {
            return;
        }

        state = state.with(ManufactoryBlock.LIT, hasRecipe(entity));
        world.setBlockState(blockPos, state,3);

        if (hasRecipe(entity)) {
            entity.progress++;
            markDirty(world, blockPos, state);
            if (entity.progress >= entity.maxProgress) {
                craftItem(entity);
            }
        } else {
            entity.resetProgress();
            markDirty(world, blockPos, state);
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static void craftItem(ManufactoryBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<ManufactoryRecipe> recipe = Objects.requireNonNull(entity.getWorld()).getRecipeManager()
                .getFirstMatch(ManufactoryRecipe.Type.INSTANCE, inventory, entity.getWorld());

        if (hasRecipe(entity)) {

            entity.setStack(3, new ItemStack(recipe.get().getOutput().getItem(),
                    entity.getStack(3).getCount() + 1));

            entity.resetProgress();
        }
    }

    private static boolean hasRecipe(ManufactoryBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<ManufactoryRecipe> match = Objects.requireNonNull(entity.getWorld()).getRecipeManager()
                .getFirstMatch(ManufactoryRecipe.Type.INSTANCE, inventory, entity.getWorld());

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, match.get().getOutput().getItem());
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(3).getItem() == output || inventory.getStack(3).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(3).getMaxCount() > inventory.getStack(3).getCount();
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction side) {
            return false;
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side) {

        if (side == Direction.DOWN) {
            return slot == 3;
        }
        return false;
    }
}
