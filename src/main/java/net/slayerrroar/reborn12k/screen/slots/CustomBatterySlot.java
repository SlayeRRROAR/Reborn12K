package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.items.ItemTechnical;

public class CustomBatterySlot extends Slot {
    public CustomBatterySlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(ItemTechnical.LV_BATTERY) ||
                stack.isOf(ItemTechnical.MV_BATTERY) ||
                stack.isOf(ItemTechnical.HV_BATTERY);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}