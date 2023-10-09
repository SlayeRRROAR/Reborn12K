package net.slayerrroar.reborn12k.screen.crusher;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.blocks.custom.entities.CrusherBlockEntity;
import net.slayerrroar.reborn12k.screen.RebornScreenRegistry;
import net.slayerrroar.reborn12k.screen.slots.CustomFuelSlot;
import net.slayerrroar.reborn12k.screen.slots.CustomResultSlot;

public class CrusherScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    private final PropertyDelegate propertyDelegate;
    public final CrusherBlockEntity blockEntity;

    public CrusherScreenHandler(int syncId, PlayerInventory inventory, PacketByteBuf buf) {
        this(syncId, inventory, inventory.player.getWorld().getBlockEntity(buf.readBlockPos()), new ArrayPropertyDelegate(4));
    }

    public CrusherScreenHandler(int syncId, PlayerInventory playerInventory, BlockEntity entity, PropertyDelegate delegate) {
        super(RebornScreenRegistry.CRUSHER_SCREEN_HANDLER, syncId);
        checkSize(((Inventory) entity), 3);
        this.inventory = ((Inventory) entity);
        inventory.onOpen(playerInventory.player);
        this.propertyDelegate = delegate;
        this.blockEntity = ((CrusherBlockEntity) entity);

        this.addSlot(new CustomFuelSlot(inventory, 0, 56, 53));
        this.addSlot(new Slot(inventory, 1, 56, 17));
        this.addSlot(new CustomResultSlot(inventory, 2, 116, 35));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);

        addProperties(delegate);

    }

    public boolean isCrafting() {
        return propertyDelegate.get(0) > 0;
    }

    public boolean hasFuel() {
        return propertyDelegate.get(2) > 0;
    }

    public int getScaledProgress() {
        int progress = this.propertyDelegate.get(0);
        int maxProgress = this.propertyDelegate.get(1);
        int progressArrowSize = 16;

        return maxProgress != 0 && progress != 0 ? progress * progressArrowSize / maxProgress : 0;
    }

    public int getScaledFuelProgress() {
        int fuelProgress = this.propertyDelegate.get(3);
        int fuelProgressSize = 13;

        if (fuelProgress == 0) {
            fuelProgress = 200;
        }
        return this.propertyDelegate.get(2) * fuelProgressSize / fuelProgress;
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);

        int entitySize = 3;
        int resultSlots = 1;
        int inventorySize = entitySize + 27;
        int hotbarSize = entitySize + 36;

        if(slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();

            /*
            invSlots are all the slots avaible starting from 0 to (x + 36),
            where x is the number of slots in the blockentity

            blockentity slots are 0 to (x - 1)
            inventory slots are x to (x + inventory slots - 1)
            hotbar slots are (x + inventory slots) to (x + inventory slots + hotbar slots - 1)
            */

            //transfers from blockentity to inventory and hotbar
            if (invSlot < entitySize) {
                if (invSlot == 2) {
                    //results go from last to first slot
                    if (!this.insertItem(originalStack, entitySize, hotbarSize, true)) {
                        return ItemStack.EMPTY;
                    }

                    slot.onQuickTransfer(originalStack, newStack);
                }
                //all rest goest from first to last slot
                else if (!this.insertItem(originalStack, entitySize, hotbarSize, false)) {
                    return ItemStack.EMPTY;
                }
            } else {
                //transfers from inventory to blockentity or hotbar
                if (invSlot < inventorySize) {
                    //checks if blockentity avaible
                    if (!this.insertItem(originalStack, 0, entitySize - resultSlots, false)) {
                        return ItemStack.EMPTY;
                    }
                    //checks if hotbar avaible
                    if (!this.insertItem(originalStack, inventorySize, hotbarSize, false)) {
                        return ItemStack.EMPTY;
                    }
                }
                //transfers from hotbar to blockentity or inventory
                else if (invSlot < hotbarSize) {
                    //checks if blockentity avaible
                    if (!this.insertItem(originalStack, 0, entitySize - resultSlots, false)) {
                        return ItemStack.EMPTY;
                    }
                    //checks if inventory avaible
                    if (!this.insertItem(originalStack, entitySize, inventorySize, false)) {
                        return ItemStack.EMPTY;
                    }
                }
            }

            if(originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }
        return newStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }

}
