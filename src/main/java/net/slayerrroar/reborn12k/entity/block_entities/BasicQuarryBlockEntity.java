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
import net.slayerrroar.reborn12k.entity.RebornBlockEntities;
import net.slayerrroar.reborn12k.items.TechnicalItems;
import net.slayerrroar.reborn12k.recipe.recipe_types.QuarryRecipe;
import net.slayerrroar.reborn12k.screen.quarry.QuarryScreenHandler;
import net.slayerrroar.reborn12k.util.ImplementedInventory;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.Optional;

@SuppressWarnings({"OptionalGetWithoutIsPresent", "deprecation"})

public class BasicQuarryBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(4, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress= 0;
    private int maxProgress = 400;

    public BasicQuarryBlockEntity(BlockPos pos, BlockState state) {
        super(RebornBlockEntities.BASIC_QUARRY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> BasicQuarryBlockEntity.this.progress;
                    case 1 -> BasicQuarryBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0 -> BasicQuarryBlockEntity.this.progress = value;
                    case 1 -> BasicQuarryBlockEntity.this.maxProgress = value;
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
        return Text.translatable("block.reborn12k.basic_laser_quarry");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new QuarryScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, inventory);
        super.writeNbt(nbt);
        nbt.putInt("quarry.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt,inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("quarry.progress");
    }

    private static boolean hasFuelInFuelSlot(BasicQuarryBlockEntity entity) {
        return !entity.getStack(0).isEmpty();
    }

    public static void tick(World world, BlockPos blockPos, BlockState state, BasicQuarryBlockEntity entity) {
        if (world.isClient()) {
            return;
        }

        if (hasRecipe(entity) && hasFuelInFuelSlot(entity)) {
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

    private static void craftItem(BasicQuarryBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<QuarryRecipe> recipe = Objects.requireNonNull(entity.getWorld()).getRecipeManager()
                .getFirstMatch(QuarryRecipe.Type.INSTANCE, inventory, entity.getWorld());

        if (hasRecipe(entity)) {

            entity.setStack(2, new ItemStack(recipe.get().getOutput().getItem(),
                    entity.getStack(2).getCount() + 1));
            if (entity.getStack(0).getDamage() < entity.getStack(0).getMaxDamage()) {
                entity.getStack(0).setDamage(entity.getStack(0).getDamage() + 1);
            } if (entity.getStack(0).getDamage() == entity.getStack(0).getMaxDamage()) {
                entity.removeStack(0);
                entity.setStack(3, new ItemStack(TechnicalItems.EMPTY_FUEL_CELL,
                        entity.getStack(3).getCount()+1));
            }

            entity.resetProgress();
        }
    }

    private static boolean hasRecipe(BasicQuarryBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<QuarryRecipe> match = Objects.requireNonNull(entity.getWorld()).getRecipeManager()
                .getFirstMatch(QuarryRecipe.Type.INSTANCE, inventory, entity.getWorld());

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, match.get().getOutput().getItem());
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(2).getItem() == output || inventory.getStack(2).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(2).getMaxCount() > inventory.getStack(2).getCount();
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction side) {

        if (side == Direction.DOWN) {
            return false;
        }
        return slot == 0;
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side) {

        if (side == Direction.DOWN) {
            return slot == 2;
        }
        return slot == 3;
    }
}
