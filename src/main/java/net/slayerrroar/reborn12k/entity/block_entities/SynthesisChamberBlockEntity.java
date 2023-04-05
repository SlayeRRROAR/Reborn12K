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
import net.slayerrroar.reborn12k.entity.CustomBlockEntities;
import net.slayerrroar.reborn12k.items.ItemTechnical;
import net.slayerrroar.reborn12k.recipe.recipe_types.SynthesisRecipe;
import net.slayerrroar.reborn12k.screen.synthesis_chamber.SynthesisChamberScreenHandler;
import net.slayerrroar.reborn12k.util.ImplementedInventory;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

@SuppressWarnings("OptionalGetWithoutIsPresent")

public class SynthesisChamberBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(5, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress= 0;
    private int maxProgress = 320;

    public SynthesisChamberBlockEntity(BlockPos pos, BlockState state) {
        super(CustomBlockEntities.SYNTHESIS_CHAMBER, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> SynthesisChamberBlockEntity.this.progress;
                    case 1 -> SynthesisChamberBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0 -> SynthesisChamberBlockEntity.this.progress = value;
                    case 1 -> SynthesisChamberBlockEntity.this.maxProgress = value;
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
        return Text.translatable("block.reborn12k.synthesis_chamber");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new SynthesisChamberScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, inventory);
        super.writeNbt(nbt);
        nbt.putInt("synthesis_chamber.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt,inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("synthesis_chamber.progress");
    }

    private static boolean hasFuelInFuelSlot(SynthesisChamberBlockEntity entity) {
        return !entity.getStack(0).isEmpty();
    }

    public static void tick(World world, BlockPos blockPos, BlockState state, SynthesisChamberBlockEntity entity) {
        if(world.isClient()) {
            return;
        }

        if(hasRecipe(entity) && hasFuelInFuelSlot(entity)) {
            entity.progress++;
            markDirty(world, blockPos, state);
            if(entity.progress >= entity.maxProgress) {
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

    private static void craftItem(SynthesisChamberBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<SynthesisRecipe> recipe = entity.getWorld().getRecipeManager()
                .getFirstMatch(SynthesisRecipe.Type.INSTANCE, inventory, entity.getWorld());

        if(hasRecipe(entity)) {

            entity.setStack(3, new ItemStack(recipe.get().getOutput().getItem(),
                    entity.getStack(3).getCount() + 1));
            if(entity.getStack(0).getDamage() < entity.getStack(0).getMaxDamage()) {
                entity.getStack(0).setDamage(entity.getStack(0).getDamage() + 1);
            } if(entity.getStack(0).getDamage() == entity.getStack(0).getMaxDamage()) {
                entity.removeStack(0);
                entity.setStack(4, new ItemStack(ItemTechnical.EMPTY_BATTERY,
                        entity.getStack(4).getCount()+1));
            }

            entity.resetProgress();
        }
    }

    private static boolean hasRecipe(SynthesisChamberBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<SynthesisRecipe> match = entity.getWorld().getRecipeManager()
                .getFirstMatch(SynthesisRecipe.Type.INSTANCE, inventory, entity.getWorld());

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

        if(side == Direction.DOWN) {
            return false;
        }
        return slot == 0;
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side) {

        if(side == Direction.DOWN) {
            return slot == 3;
        }
        return slot == 4;
    }
}