package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.items.MagicItems;

public class CustomCatalystSlot extends Slot {
    public CustomCatalystSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(MagicItems.BLESSED_CATALYST) ||
                stack.isOf(MagicItems.CURSED_CATALYST) ||
                stack.isOf(MagicItems.NETHER_CATALYST) ||
                stack.isOf(MagicItems.ENDER_CATALYST) ||
                stack.isOf(MagicItems.WITHERED_CATALYST) ||
                stack.isOf(MagicItems.DRACONIC_CATALYST);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}