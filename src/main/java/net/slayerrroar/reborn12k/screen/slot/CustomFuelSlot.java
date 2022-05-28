package net.slayerrroar.reborn12k.screen.slot;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;

public class CustomFuelSlot extends Slot {
    public CustomFuelSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack itemStack) {
        return AbstractFurnaceBlockEntity.canUseAsFuel(itemStack) || CustomFuelSlot.isBucket(itemStack);
    }

    @Override
    public int getMaxItemCount(ItemStack itemStack) {
        return CustomFuelSlot.isBucket(itemStack) ? 1 : super.getMaxItemCount(itemStack);
    }

    public static boolean isBucket(ItemStack itemStack) {
        return itemStack.isOf(Items.BUCKET);
    }
}