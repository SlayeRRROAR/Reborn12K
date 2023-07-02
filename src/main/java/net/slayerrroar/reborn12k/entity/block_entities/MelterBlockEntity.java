package net.slayerrroar.reborn12k.entity.block_entities;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.blocks.custom.block_entities.MelterBlock;
import net.slayerrroar.reborn12k.entity.RebornBlockEntities;
import net.slayerrroar.reborn12k.recipe.recipe_types.MelterRecipe;
import net.slayerrroar.reborn12k.screen.melter.MelterScreenHandler;
import net.slayerrroar.reborn12k.util.ImplementedInventory;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.Optional;

@SuppressWarnings({"OptionalGetWithoutIsPresent", "deprecation"})

public class MelterBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(4, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 200;
    private int fuelTime = 0;
    private int maxFuelTime = 0;

    public MelterBlockEntity(BlockPos pos, BlockState state) {
        super(RebornBlockEntities.MELTER, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> MelterBlockEntity.this.progress;
                    case 1 -> MelterBlockEntity.this.maxProgress;
                    case 2 -> MelterBlockEntity.this.fuelTime;
                    case 3 -> MelterBlockEntity.this.maxFuelTime;
                    default -> 0;
                };
            }


            public void set(int index, int value) {
                switch (index) {
                    case 0 -> MelterBlockEntity.this.progress = value;
                    case 1 -> MelterBlockEntity.this.maxProgress = value;
                    case 2 -> MelterBlockEntity.this.fuelTime = value;
                    case 3 -> MelterBlockEntity.this.maxFuelTime = value;
                }
            }

            public int size() {
                return 4;
            }
        };
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("block.reborn12k.melter");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new MelterScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, inventory);
        super.writeNbt(nbt);
        nbt.putInt("melter.progress", progress);
        nbt.putInt("melter.fueltime", fuelTime);
        nbt.putInt("melter.maxfueltime", maxFuelTime);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt,inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("melter.progress");
        fuelTime = nbt.getInt("melter.fueltime");
        maxFuelTime = nbt.getInt("melter.maxfueltime");
    }

    private void consumeFuel() {
        if (!getStack(0).isEmpty()) {
            this.fuelTime = FuelRegistry.INSTANCE.get(this.removeStack(0, 1).getItem());
            this.maxFuelTime = this.fuelTime;
        }
    }

    public static void tick(World world, BlockPos blockPos, BlockState state, MelterBlockEntity entity) {
        if (world.isClient()) {
            return;
        }

        state = state.with(MelterBlock.LIT, isConsumingFuel(entity));
        world.setBlockState(blockPos, state,3);

        if (isConsumingFuel(entity)) {
            entity.fuelTime--;
        }
        if (!isConsumingFuel(entity) && entity.progress > 0) {
            entity.progress--;
        }
        if (hasRecipe(entity)) {
            if (hasFuelInFuelSlot(entity) && !isConsumingFuel(entity)) {
                if (entity.getStack(0).isOf(Items.LAVA_BUCKET)) {
                    entity.consumeFuel();
                    entity.setStack(0, new ItemStack(Items.BUCKET, 1));
                } else entity.consumeFuel();
            }
            if (isConsumingFuel(entity)) {
                entity.progress++;
                markDirty(world, blockPos, state);
                if (entity.progress >= entity.maxProgress) {
                    craftItem(entity);
                }
            }
        } else {
            entity.resetProgress();
            markDirty(world, blockPos, state);
        }
    }

    private static boolean hasFuelInFuelSlot(MelterBlockEntity entity) {
        return !entity.getStack(0).isEmpty();
    }

    private static boolean isConsumingFuel(MelterBlockEntity entity) {
        return entity.fuelTime > 0;
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static void craftItem(MelterBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<MelterRecipe> recipe = Objects.requireNonNull(entity.getWorld()).getRecipeManager()
                .getFirstMatch(MelterRecipe.Type.INSTANCE, inventory, entity.getWorld());

        if (hasRecipe(entity)) {

            entity.removeStack(1,1);
            entity.removeStack(2,1);

            entity.setStack(3, new ItemStack(recipe.get().getOutput().getItem(),
                    entity.getStack(3).getCount() + 1));

            entity.resetProgress();
        }
    }

    private static boolean hasRecipe(MelterBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<MelterRecipe> match = Objects.requireNonNull(entity.getWorld()).getRecipeManager()
                .getFirstMatch(MelterRecipe.Type.INSTANCE, inventory, entity.getWorld());

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

        if (side == Direction.DOWN) {
            return false;
        }
        if (side == Direction.UP) {
            return slot == 1 || slot == 2;
        }
        return slot == 0;

    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side) {

        if (side == Direction.DOWN) {
            if (slot == 0) {
                return stack.isOf(Items.BUCKET);
            }
            return slot == 3;
        }
        return false;
    }
}
