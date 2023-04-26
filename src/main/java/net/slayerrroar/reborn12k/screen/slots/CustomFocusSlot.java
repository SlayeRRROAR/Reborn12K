package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.items.TechnicalItems;

public class CustomFocusSlot extends Slot {
    public CustomFocusSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(TechnicalItems.COAL_LASER_FOCUS) ||
               stack.isOf(TechnicalItems.COPPER_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.IRON_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.GOLD_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.LAPIS_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.REDSTONE_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.DIAMOND_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.EMERALD_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.AMETHYST_LASER_FOCUS) ||

                stack.isOf(TechnicalItems.QUARTZ_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.NETHERITE_LASER_FOCUS) ||

                stack.isOf(TechnicalItems.TIN_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.ALUMINUM_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.SILVER_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.LEAD_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.NICKEL_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.CHROME_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.TITANIUM_LASER_FOCUS) ||

                stack.isOf(TechnicalItems.SAPPHIRE_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.RUBY_LASER_FOCUS) ||

                stack.isOf(TechnicalItems.MANATITE_LASER_FOCUS) ||

                stack.isOf(TechnicalItems.TUNGSTEN_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.VANADIUM_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.NEODYMIUM_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.URANIUM_LASER_FOCUS) ||

                stack.isOf(TechnicalItems.COBALT_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.OSMIUM_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.PLATINUM_LASER_FOCUS) ||
                stack.isOf(TechnicalItems.IRIDIUM_LASER_FOCUS);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}