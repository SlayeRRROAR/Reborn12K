package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.fluids.RebornFluids;

public class CustomReagentSlot extends Slot {
    public CustomReagentSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(Items.WATER_BUCKET) ||
                stack.isOf(RebornFluids.ENERGIZED_GLOWSTONE_BUCKET) ||
                stack.isOf(RebornFluids.RESONANT_ENDER_BUCKET);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}