package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.items.ItemTechnical;

public class CustomFocusSlot extends Slot {
    public CustomFocusSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(ItemTechnical.COAL_LASER_FOCUS) ||
               stack.isOf(ItemTechnical.COPPER_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.IRON_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.GOLD_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.LAPIS_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.REDSTONE_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.DIAMOND_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.EMERALD_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.AMETHYST_LASER_FOCUS) ||

                stack.isOf(ItemTechnical.QUARTZ_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.NETHERITE_LASER_FOCUS) ||

                stack.isOf(ItemTechnical.TIN_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.ALUMINUM_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.SILVER_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.LEAD_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.NICKEL_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.CHROME_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.TITANIUM_LASER_FOCUS) ||

                stack.isOf(ItemTechnical.SAPPHIRE_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.RUBY_LASER_FOCUS) ||

                stack.isOf(ItemTechnical.MANATITE_LASER_FOCUS) ||

                stack.isOf(ItemTechnical.TUNGSTEN_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.VANADIUM_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.NEODYMIUM_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.URANIUM_LASER_FOCUS) ||

                stack.isOf(ItemTechnical.COBALT_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.OSMIUM_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.PLATINUM_LASER_FOCUS) ||
                stack.isOf(ItemTechnical.IRIDIUM_LASER_FOCUS);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}