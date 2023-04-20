package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.items.ItemGenerics;

public class CustomMelterSlot extends Slot {
    public CustomMelterSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(ItemGenerics.DESTABILIZED_MIXTURE) ||
                stack.isOf(ItemGenerics.ENERGIZED_MIXTURE) ||
                stack.isOf(ItemGenerics.RESONANT_MIXTURE);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}