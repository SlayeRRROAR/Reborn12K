package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.items.RebornItems;

public class CustomFuelCellSlot extends Slot {
    public CustomFuelCellSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(RebornItems.LEU_FUEL_CELL) ||
                stack.isOf(RebornItems.HEU_FUEL_CELL);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}