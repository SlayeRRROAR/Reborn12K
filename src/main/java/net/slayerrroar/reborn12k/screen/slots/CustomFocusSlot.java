package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.items.TechItems;

public class CustomFocusSlot extends Slot {
    public CustomFocusSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(TechItems.COAL_LASER_FOCUS) ||
               stack.isOf(TechItems.COPPER_LASER_FOCUS) ||
                stack.isOf(TechItems.IRON_LASER_FOCUS) ||
                stack.isOf(TechItems.GOLD_LASER_FOCUS) ||
                stack.isOf(TechItems.LAPIS_LASER_FOCUS) ||
                stack.isOf(TechItems.REDSTONE_LASER_FOCUS) ||
                stack.isOf(TechItems.DIAMOND_LASER_FOCUS) ||
                stack.isOf(TechItems.EMERALD_LASER_FOCUS) ||
                stack.isOf(TechItems.AMETHYST_LASER_FOCUS) ||

                stack.isOf(TechItems.QUARTZ_LASER_FOCUS) ||
                stack.isOf(TechItems.NETHERITE_LASER_FOCUS) ||

                stack.isOf(TechItems.TIN_LASER_FOCUS) ||
                stack.isOf(TechItems.SILVER_LASER_FOCUS) ||
                stack.isOf(TechItems.LEAD_LASER_FOCUS) ||
                stack.isOf(TechItems.NICKEL_LASER_FOCUS) ||
                stack.isOf(TechItems.URANIUM_LASER_FOCUS) ||
                stack.isOf(TechItems.CHROME_LASER_FOCUS) ||

                stack.isOf(TechItems.SAPPHIRE_LASER_FOCUS) ||
                stack.isOf(TechItems.RUBY_LASER_FOCUS) ||
                stack.isOf(TechItems.OPAL_LASER_FOCUS) ||

                stack.isOf(TechItems.MANATITE_LASER_FOCUS) ||

                stack.isOf(TechItems.ALUMINUM_LASER_FOCUS) ||
                stack.isOf(TechItems.TUNGSTEN_LASER_FOCUS) ||
                stack.isOf(TechItems.TITANIUM_LASER_FOCUS) ||

                stack.isOf(TechItems.COBALT_LASER_FOCUS) ||
                stack.isOf(TechItems.PLATINUM_LASER_FOCUS) ||
                stack.isOf(TechItems.IRIDIUM_LASER_FOCUS);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}