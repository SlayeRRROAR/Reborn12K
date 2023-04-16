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
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.blocks.custom.with_entities.CrusherBlock;
import net.slayerrroar.reborn12k.entity.CustomBlockEntities;
import net.slayerrroar.reborn12k.recipe.recipe_types.CrusherRecipe;
import net.slayerrroar.reborn12k.screen.crusher.CrusherScreenHandler;
import net.slayerrroar.reborn12k.util.ImplementedInventory;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.Optional;

@SuppressWarnings("OptionalGetWithoutIsPresent")

public class CrusherBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(3, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress= 0;
    private int maxProgress = 199;
    private int fuelTime= 0;
    private int maxFuelTime= 0;

    public CrusherBlockEntity(BlockPos pos, BlockState state) {
        super(CustomBlockEntities.CRUSHER, pos, state);
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
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("block.reborn12k.crusher");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new CrusherScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, inventory);
        super.writeNbt(nbt);
        nbt.putInt("crusher.progress", progress);
        nbt.putInt("crusher.fueltime", fuelTime);
        nbt.putInt("crusher.maxfueltime", maxFuelTime);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt,inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("crusher.progress");
        fuelTime = nbt.getInt("crusher.fueltime");
        maxFuelTime = nbt.getInt("crusher.maxfueltime");
    }

    private void consumeFuel() {
        if(!getStack(0).isEmpty()) {
            this.fuelTime = FuelRegistry.INSTANCE.get(this.removeStack(0, 1).getItem());
            this.maxFuelTime = this.fuelTime;
        }
    }

    public static void tick(World world, BlockPos blockPos, BlockState state, CrusherBlockEntity entity) {
        if(world.isClient()) {
            return;
        }
        if(isConsumingFuel(entity)) {
            entity.fuelTime--;
        }
        if(!isConsumingFuel(entity) && entity.progress > 0) {
            entity.progress--;
        }
        if(hasRecipe(entity)) {
            if(hasFuelInFuelSlot(entity) && !isConsumingFuel(entity)) {
                entity.consumeFuel();
            }
            if(isConsumingFuel(entity)) {
                entity.progress++;
                markDirty(world, blockPos, state);
                if(entity.progress >= entity.maxProgress) {
                    craftItem(entity);
                }
            }
        } else {
            entity.resetProgress();
            markDirty(world, blockPos, state);
        }
    }

    private static boolean hasFuelInFuelSlot(CrusherBlockEntity entity) {
        return !entity.getStack(0).isEmpty();
    }

    private static boolean isConsumingFuel(CrusherBlockEntity entity) {
        return entity.fuelTime > 0;
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static void craftItem(CrusherBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for(int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<CrusherRecipe> recipe = entity.getWorld().getRecipeManager()
                .getFirstMatch(CrusherRecipe.Type.INSTANCE, inventory, entity.getWorld());

        if(hasRecipe(entity)) {

            entity.removeStack(1,1);

            entity.setStack(2, new ItemStack(recipe.get().getOutput().getItem(),
                    entity.getStack(2).getCount() + 1));

            entity.resetProgress();
        }
    }

    private static boolean hasRecipe(CrusherBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for(int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<CrusherRecipe> match = entity.getWorld().getRecipeManager()
                .getFirstMatch(CrusherRecipe.Type.INSTANCE, inventory, entity.getWorld());

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
        Direction localDir = this.getWorld().getBlockState(this.pos).get(CrusherBlock.FACING);

        if(side == Direction.DOWN) {
            return false;
        }

        return switch (localDir) {
            default ->
                    Objects.requireNonNull(side).getOpposite() == Direction.DOWN && slot == 1 ||
                            side.getOpposite() == Direction.NORTH && slot == 0 ||
                            side.getOpposite() == Direction.EAST && slot == 0 ||
                            side.getOpposite() == Direction.WEST && slot == 0;
            case EAST ->
                    Objects.requireNonNull(side).getOpposite() == Direction.DOWN && slot == 1 ||
                            side.rotateYClockwise() == Direction.NORTH && slot == 0 ||
                            side.rotateYClockwise() == Direction.EAST && slot == 0 ||
                            side.rotateYClockwise() == Direction.WEST && slot == 0;
            case SOUTH ->
                    Objects.requireNonNull(side).getOpposite() == Direction.DOWN && slot == 1 ||
                            side == Direction.NORTH && slot == 0 ||
                            side == Direction.EAST && slot == 0 ||
                            side == Direction.WEST && slot == 0;
            case WEST ->
                    Objects.requireNonNull(side).getOpposite() == Direction.DOWN && slot == 1 ||
                            side.rotateYCounterclockwise() == Direction.NORTH && slot == 0 ||
                            side.rotateYCounterclockwise() == Direction.EAST && slot == 0 ||
                            side.rotateYCounterclockwise() == Direction.WEST && slot == 0;
        };
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side) {

        if(side == Direction.DOWN) {
            return slot == 2;
        }
        return false;
    }
}
