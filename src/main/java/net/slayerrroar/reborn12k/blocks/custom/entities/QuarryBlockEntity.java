package net.slayerrroar.reborn12k.blocks.custom.entities;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.entity.RebornBlockEntities;
import net.slayerrroar.reborn12k.items.RebornItems;
import net.slayerrroar.reborn12k.recipe.recipe_types.QuarryRecipe;
import net.slayerrroar.reborn12k.screen.quarry.QuarryScreenHandler;
import net.slayerrroar.reborn12k.util.ImplementedInventory;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

@SuppressWarnings({"OptionalGetWithoutIsPresent", "unused"})

public class QuarryBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(3, ItemStack.EMPTY);

    private static final int FUEL_SLOT = 0;
    private static final int INPUT_SLOT = 1;
    private static final int OUTPUT_SLOT = 2;

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 200;

    public QuarryBlockEntity(BlockPos blockPos, BlockState state) {
        super(RebornBlockEntities.QUARRY, blockPos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> QuarryBlockEntity.this.progress;
                    case 1 -> QuarryBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0 -> QuarryBlockEntity.this.progress = value;
                    case 1 -> QuarryBlockEntity.this.maxProgress = value;
                }
            }

            public int size() {
                return 2;
            }
        };
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("block.reborn12k.quarry");
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("quarry.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
        progress = nbt.getInt("quarry.progress");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new QuarryScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    public void tick(World world, BlockPos pos, BlockState state) {
        if (world.isClient()) {
            return;
        }

        boolean isCrafting = this.hasRecipe() && this.hasFuelInFuelSlot(this);

        state = state.with(ArcaneArtifactBlock.LIT, isCrafting);
        world.setBlockState(pos, state,3);

        if (isOutputSlotEmptyOrReceivable()) {
            if (this.hasRecipe() && this.hasFuelInFuelSlot(this)) {
                this.increaseCraftProgress();
                markDirty(world, pos, state);

                if (hasCraftingFinished()) {
                    this.craftItem();
                    this.resetProgress();
                }
            } else {
                this.resetProgress();
            }
        } else {
            this.resetProgress();
            markDirty(world, pos, state);
        }
    }

    private boolean hasCorrectFuel(QuarryBlockEntity entity) {
        return this.getStack(FUEL_SLOT).isOf(RebornItems.SEU_FUEL_CELL) ||
                this.getStack(FUEL_SLOT).isOf(RebornItems.LEU_FUEL_CELL) ||
                this.getStack(FUEL_SLOT).isOf(RebornItems.HEU_FUEL_CELL);
    }

    private boolean hasFuelInFuelSlot(QuarryBlockEntity entity) {
        return hasCorrectFuel(entity) && this.getStack(FUEL_SLOT).getMaxDamage() >= 0;
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private void craftItem() {
        Optional<RecipeEntry<QuarryRecipe>> recipe = getCurrentRecipe();

        this.setStack(OUTPUT_SLOT, new ItemStack(recipe.get().value().getResult(null).getItem(),
                getStack(OUTPUT_SLOT).getCount() + recipe.get().value().getResult(null).getCount()));

        if (this.getStack(FUEL_SLOT).getDamage() < this.getStack(FUEL_SLOT).getMaxDamage()) {
            this.getStack(FUEL_SLOT).setDamage(this.getStack(FUEL_SLOT).getDamage() + 1);
        }
        if (this.getStack(FUEL_SLOT).getDamage() >= this.getStack(FUEL_SLOT).getMaxDamage()) {
            this.removeStack(FUEL_SLOT);
            this.setStack(FUEL_SLOT, new ItemStack(RebornItems.EMPTY_FUEL_CELL, 1));
        }
    }

    private boolean hasCraftingFinished() {
        return progress >= maxProgress;
    }

    private void increaseCraftProgress() {
        progress++;
    }

    private boolean hasRecipe() {
        Optional<RecipeEntry<QuarryRecipe>> recipe = getCurrentRecipe();

        return recipe.isPresent() && canInsertAmountIntoOutputSlot(recipe.get().value().getResult(null))
                && canInsertItemIntoOutputSlot(recipe.get().value().getResult(null).getItem());
    }

    private Optional<RecipeEntry<QuarryRecipe>> getCurrentRecipe() {
        SimpleInventory inv = new SimpleInventory(this.size());
        for(int i = 0; i < this.size(); i++) {
            inv.setStack(i, this.getStack(i));
        }

        return getWorld().getRecipeManager().getFirstMatch(QuarryRecipe.Type.INSTANCE, inv, getWorld());
    }

    private boolean canInsertItemIntoOutputSlot(Item item) {
        return this.getStack(OUTPUT_SLOT).getItem() == item || this.getStack(OUTPUT_SLOT).isEmpty();
    }

    private boolean canInsertAmountIntoOutputSlot(ItemStack result) {
        return this.getStack(OUTPUT_SLOT).getCount() + result.getCount() <= getStack(OUTPUT_SLOT).getMaxCount();
    }

    private boolean isOutputSlotEmptyOrReceivable() {
        return this.getStack(OUTPUT_SLOT).isEmpty() || this.getStack(OUTPUT_SLOT).getCount() < this.getStack(OUTPUT_SLOT).getMaxCount();
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction side) {

        if (side == Direction.DOWN) {
            return false;
        }
        if (side == Direction.UP) {
            return slot == INPUT_SLOT;
        }
        return slot == FUEL_SLOT;
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side) {

        if (side == Direction.DOWN) {
            if (slot == FUEL_SLOT) {
                return stack.isOf(RebornItems.EMPTY_FUEL_CELL);
            }
            return slot == OUTPUT_SLOT;
        }
        return false;
    }

}
