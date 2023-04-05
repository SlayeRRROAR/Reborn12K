package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.items.ItemTechnical;

public class CustomAISlot extends Slot {
    public CustomAISlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(ItemTechnical.BEE_AI_MODULE) ||
                stack.isOf(ItemTechnical.CHICKEN_AI_MODULE) ||
                stack.isOf(ItemTechnical.COW_AI_MODULE) ||
                stack.isOf(ItemTechnical.FISH_AI_MODULE) ||
                stack.isOf(ItemTechnical.PIG_AI_MODULE) ||
                stack.isOf(ItemTechnical.RABBIT_AI_MODULE) ||
                stack.isOf(ItemTechnical.SHEEP_AI_MODULE) ||
                stack.isOf(ItemTechnical.SQUID_AI_MODULE) ||
                stack.isOf(ItemTechnical.CREEPER_AI_MODULE) ||
                stack.isOf(ItemTechnical.ZOMBIE_AI_MODULE) ||
                stack.isOf(ItemTechnical.SLIME_AI_MODULE) ||
                stack.isOf(ItemTechnical.SKELETON_AI_MODULE) ||
                stack.isOf(ItemTechnical.WITCH_AI_MODULE) ||
                stack.isOf(ItemTechnical.SPIDER_AI_MODULE) ||
                stack.isOf(ItemTechnical.IRON_GOLEM_AI_MODULE) ||
                stack.isOf(ItemTechnical.ILLAGER_AI_MODULE) ||
                stack.isOf(ItemTechnical.GUARDIAN_AI_MODULE) ||
                stack.isOf(ItemTechnical.ENDERMAN_AI_MODULE) ||
                stack.isOf(ItemTechnical.SHULKER_AI_MODULE) ||
                stack.isOf(ItemTechnical.GHAST_AI_MODULE) ||
                stack.isOf(ItemTechnical.BLAZE_AI_MODULE) ||
                stack.isOf(ItemTechnical.WITHER_SKELETON_AI_MODULE) ||
                stack.isOf(ItemTechnical.PHANTOM_AI_MODULE) ||
                stack.isOf(ItemTechnical.WITHER_AI_MODULE) ||
                stack.isOf(ItemTechnical.ENDER_DRAGON_AI_MODULE);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}