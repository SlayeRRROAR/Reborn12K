package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;

public class CustomRockSlot extends Slot {
    public CustomRockSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(Items.COBBLESTONE) ||
                stack.isOf(Items.STONE) ||
                stack.isOf(Items.ANDESITE) ||
                stack.isOf(Items.DIORITE) ||
                stack.isOf(Items.GRANITE) ||
                stack.isOf(Items.CALCITE) ||
                stack.isOf(Items.TUFF) ||
                stack.isOf(Items.DEEPSLATE) ||
                stack.isOf(Items.COBBLED_DEEPSLATE) ||
                stack.isOf(Items.NETHERRACK) ||
                stack.isOf(Items.BLACKSTONE) ||
                stack.isOf(Items.BASALT) ||
                stack.isOf(Items.END_STONE);

    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}