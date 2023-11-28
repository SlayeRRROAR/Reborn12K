package net.slayerrroar.reborn12k.blocks.custom.entities;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
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
import net.slayerrroar.reborn12k.recipe.types.CrusherRecipe;
import net.slayerrroar.reborn12k.screen.crusher.CrusherScreenHandler;
import net.slayerrroar.reborn12k.util.ImplementedInventory;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

@SuppressWarnings({"OptionalGetWithoutIsPresent", "unused", "ConstantConditions"})

public class CrusherBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(3, ItemStack.EMPTY);

    private static final int FUEL_SLOT = 0;
    private static final int INPUT_SLOT = 1;
    private static final int OUTPUT_SLOT = 2;

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 200;
    private int fuelTime = 0;
    private int maxFuelTime = 0;
    private static final int[] TOP_SLOTS = new int[]{1};
    private static final int[] BOTTOM_SLOTS = new int[]{2, 0};
    private static final int[] SIDE_SLOTS = new int[]{0};

    public CrusherBlockEntity(BlockPos pos, BlockState state) {
        super(RebornBlockEntities.CRUSHER, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> CrusherBlockEntity.this.progress;
                    case 1 -> CrusherBlockEntity.this.maxProgress;
                    case 2 -> CrusherBlockEntity.this.fuelTime;
                    case 3 -> CrusherBlockEntity.this.maxFuelTime;
                    default -> 0;
                };
            }


            public void set(int index, int value) {
                switch (index) {
                    case 0 -> CrusherBlockEntity.this.progress = value;
                    case 1 -> CrusherBlockEntity.this.maxProgress = value;
                    case 2 -> CrusherBlockEntity.this.fuelTime = value;
                    case 3 -> CrusherBlockEntity.this.maxFuelTime = value;
                }
            }

            public int size() {
                return 4;
            }
        };
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("block.reborn12k.crusher");
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("crusher.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
        progress = nbt.getInt("crusher.progress");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new CrusherScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    public void tick(World world, BlockPos pos, BlockState state) {
        if (world.isClient()) {
            return;
        }

        state = state.with(CrusherBlock.LIT, isConsumingFuel(this));
        world.setBlockState(pos, state, 3);

        /*if (hasRecipe()) {
            this.maxProgress = setCookingTime();
        } else {
            resetProgress();
        }

        if (isConsumingFuel(this)) {
            this.fuelTime--;
        }*/

        if (isOutputSlotEmptyOrReceivable()) {
            if (this.hasRecipe()) {
                if (hasFuelInFuelSlot(this) && !isConsumingFuel(this)) {
                    if (this.getStack(0).isOf(Items.LAVA_BUCKET)) {
                        this.consumeFuel();
                        this.setStack(0, new ItemStack(Items.BUCKET, 1));
                    } else this.consumeFuel();
                }
                if (!hasFuelInFuelSlot(this) && !isConsumingFuel(this) && this.progress > 0) {
                    this.progress--;
                }
                if (isConsumingFuel(this)) {
                    this.increaseCraftProgress();
                    markDirty(world, pos, state);

                    if (hasCraftingFinished()) {
                        this.craftItem();
                        this.resetProgress();
                    }
                }
            } else {
                this.resetProgress();
                markDirty(world, pos, state);
            }
        }
    }

    private boolean hasFuelInFuelSlot(CrusherBlockEntity entity) {
        return !this.getStack(FUEL_SLOT).isEmpty();
    }

    private boolean isConsumingFuel(CrusherBlockEntity entity) {
        return this.fuelTime > 0;
    }

    private void consumeFuel() {
        if (!getStack(0).isEmpty()) {
            this.fuelTime = FuelRegistry.INSTANCE.get(this.removeStack(0, 1).getItem());
            this.maxFuelTime = this.fuelTime;
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    /*private int setCookingTime() {
        return getCurrentRecipe().get().value().getCookingTime();
    }*/

    private void craftItem() {
        Optional<RecipeEntry<CrusherRecipe>> recipe = getCurrentRecipe();

        this.removeStack(INPUT_SLOT, 1);

        this.setStack(OUTPUT_SLOT, new ItemStack(recipe.get().value().getResult(null).getItem(),
                getStack(OUTPUT_SLOT).getCount() + recipe.get().value().getResult(null).getCount()));
    }

    private boolean hasCraftingFinished() {
        return progress >= maxProgress;
    }

    private void increaseCraftProgress() {
        progress++;
    }

    private boolean hasRecipe() {
        Optional<RecipeEntry<CrusherRecipe>> recipe = getCurrentRecipe();

        return recipe.isPresent() && canInsertAmountIntoOutputSlot(recipe.get().value().getResult(null))
                && canInsertItemIntoOutputSlot(recipe.get().value().getResult(null).getItem());
    }

    private Optional<RecipeEntry<CrusherRecipe>> getCurrentRecipe() {
        SimpleInventory inv = new SimpleInventory(this.size());
        for(int i = 0; i < this.size(); i++) {
            inv.setStack(i, this.getStack(i));
        }

        return getWorld().getRecipeManager().getFirstMatch(CrusherRecipe.Type.INSTANCE, inv, getWorld());
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

    public int[] getAvailableSlots(Direction side) {
        if (side == Direction.DOWN) {
            return BOTTOM_SLOTS;
        }
        else {
            return side == Direction.UP ? TOP_SLOTS : SIDE_SLOTS;
        }
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction side) {
        return this.isValid(slot, stack);
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side) {

        if (side == Direction.DOWN) {
            if (slot == FUEL_SLOT) {
                return stack.isOf(Items.BUCKET);
            }
            return slot == OUTPUT_SLOT;
        }
        return false;
    }

    public static boolean canUseAsFuel(ItemStack stack) {
        return AbstractFurnaceBlockEntity.canUseAsFuel(stack);
    }

    public boolean isValid(int slot, ItemStack stack) {
        if (slot == OUTPUT_SLOT) {
            return false;
        } else if (slot != FUEL_SLOT) {
            return true;
        } else {
            ItemStack itemStack = this.inventory.get(FUEL_SLOT);
            return canUseAsFuel(stack) || stack.isOf(Items.BUCKET) && !itemStack.isOf(Items.BUCKET);
        }
    }

}