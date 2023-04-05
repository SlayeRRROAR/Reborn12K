package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.items.ItemTechnical;

public class CustomChipSlot extends Slot {
    public CustomChipSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(ItemTechnical.BUTCHERING_CHIP) ||
                stack.isOf(ItemTechnical.SHEARING_CHIP) ||
                stack.isOf(ItemTechnical.SEVERING_CHIP) ||
                stack.isOf(ItemTechnical.DECAPITATION_CHIP) ||
                stack.isOf(ItemTechnical.EXTRACTION_CHIP) ||
                stack.isOf(ItemTechnical.RECOMBINATION_CHIP) ||
                stack.isOf(ItemTechnical.EXP_DRAIN_CHIP) ||
                stack.isOf(ItemTechnical.S_REP_CHIP);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}