package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.items.RebornAiItems;

public class CustomChipSlot extends Slot {
    public CustomChipSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(RebornAiItems.BUTCHERING_CHIP) ||
                stack.isOf(RebornAiItems.SHEARING_CHIP) ||
                stack.isOf(RebornAiItems.SEVERING_CHIP) ||
                stack.isOf(RebornAiItems.DECAPITATION_CHIP) ||
                stack.isOf(RebornAiItems.EXTRACTION_CHIP) ||
                stack.isOf(RebornAiItems.RECOMBINATION_CHIP) ||
                stack.isOf(RebornAiItems.EXP_DRAIN_CHIP) ||
                stack.isOf(RebornAiItems.S_REP_CHIP);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}