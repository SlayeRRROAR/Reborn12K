package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.items.RebornItems;

public class CustomFocusSlot extends Slot {
    public CustomFocusSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(RebornItems.COAL_LASER_FOCUS) ||
               stack.isOf(RebornItems.COPPER_LASER_FOCUS) ||
                stack.isOf(RebornItems.IRON_LASER_FOCUS) ||
                stack.isOf(RebornItems.GOLD_LASER_FOCUS) ||
                stack.isOf(RebornItems.LAPIS_LASER_FOCUS) ||
                stack.isOf(RebornItems.REDSTONE_LASER_FOCUS) ||
                stack.isOf(RebornItems.DIAMOND_LASER_FOCUS) ||
                stack.isOf(RebornItems.EMERALD_LASER_FOCUS) ||
                stack.isOf(RebornItems.AMETHYST_LASER_FOCUS) ||

                stack.isOf(RebornItems.QUARTZ_LASER_FOCUS) ||
                stack.isOf(RebornItems.NETHERITE_LASER_FOCUS) ||

                stack.isOf(RebornItems.TIN_LASER_FOCUS) ||
                stack.isOf(RebornItems.ALUMINUM_LASER_FOCUS) ||
                stack.isOf(RebornItems.SILVER_LASER_FOCUS) ||
                stack.isOf(RebornItems.LEAD_LASER_FOCUS) ||
                stack.isOf(RebornItems.NICKEL_LASER_FOCUS) ||
                stack.isOf(RebornItems.CHROME_LASER_FOCUS) ||
                stack.isOf(RebornItems.TITANIUM_LASER_FOCUS) ||

                stack.isOf(RebornItems.SAPPHIRE_LASER_FOCUS) ||
                stack.isOf(RebornItems.RUBY_LASER_FOCUS) ||

                stack.isOf(RebornItems.MANATITE_LASER_FOCUS) ||

                stack.isOf(RebornItems.TUNGSTEN_LASER_FOCUS) ||
                stack.isOf(RebornItems.VANADIUM_LASER_FOCUS) ||
                stack.isOf(RebornItems.NEODYMIUM_LASER_FOCUS) ||
                stack.isOf(RebornItems.URANIUM_LASER_FOCUS) ||

                stack.isOf(RebornItems.COBALT_LASER_FOCUS) ||
                stack.isOf(RebornItems.OSMIUM_LASER_FOCUS) ||
                stack.isOf(RebornItems.PLATINUM_LASER_FOCUS) ||
                stack.isOf(RebornItems.IRIDIUM_LASER_FOCUS);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}