package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.items.RebornTechItems;

public class CustomFocusSlot extends Slot {
    public CustomFocusSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(RebornTechItems.COAL_LASER_FOCUS) ||
               stack.isOf(RebornTechItems.COPPER_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.IRON_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.GOLD_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.LAPIS_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.REDSTONE_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.DIAMOND_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.EMERALD_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.AMETHYST_LASER_FOCUS) ||

                stack.isOf(RebornTechItems.QUARTZ_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.NETHERITE_LASER_FOCUS) ||

                stack.isOf(RebornTechItems.TIN_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.SILVER_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.LEAD_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.NICKEL_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.URANIUM_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.CHROME_LASER_FOCUS) ||

                stack.isOf(RebornTechItems.SAPPHIRE_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.RUBY_LASER_FOCUS) ||

                stack.isOf(RebornTechItems.MANATITE_LASER_FOCUS) ||

                stack.isOf(RebornTechItems.ALUMINUM_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.TUNGSTEN_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.TITANIUM_LASER_FOCUS) ||

                stack.isOf(RebornTechItems.COBALT_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.PLATINUM_LASER_FOCUS) ||
                stack.isOf(RebornTechItems.IRIDIUM_LASER_FOCUS);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}