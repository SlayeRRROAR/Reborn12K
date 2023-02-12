package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.items.RebornAiItems;

public class CustomAISlot extends Slot {
    public CustomAISlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(RebornAiItems.BEE_AI_MODULE) ||
                stack.isOf(RebornAiItems.CHICKEN_AI_MODULE) ||
                stack.isOf(RebornAiItems.COW_AI_MODULE) ||
                stack.isOf(RebornAiItems.FISH_AI_MODULE) ||
                stack.isOf(RebornAiItems.PIG_AI_MODULE) ||
                stack.isOf(RebornAiItems.RABBIT_AI_MODULE) ||
                stack.isOf(RebornAiItems.SHEEP_AI_MODULE) ||
                stack.isOf(RebornAiItems.SQUID_AI_MODULE) ||
                stack.isOf(RebornAiItems.CREEPER_AI_MODULE) ||
                stack.isOf(RebornAiItems.ZOMBIE_AI_MODULE) ||
                stack.isOf(RebornAiItems.SLIME_AI_MODULE) ||
                stack.isOf(RebornAiItems.SKELETON_AI_MODULE) ||
                stack.isOf(RebornAiItems.WITCH_AI_MODULE) ||
                stack.isOf(RebornAiItems.SPIDER_AI_MODULE) ||
                stack.isOf(RebornAiItems.IRON_GOLEM_AI_MODULE) ||
                stack.isOf(RebornAiItems.ILLAGER_AI_MODULE) ||
                stack.isOf(RebornAiItems.GUARDIAN_AI_MODULE) ||
                stack.isOf(RebornAiItems.ENDERMAN_AI_MODULE) ||
                stack.isOf(RebornAiItems.SHULKER_AI_MODULE) ||
                stack.isOf(RebornAiItems.GHAST_AI_MODULE) ||
                stack.isOf(RebornAiItems.BLAZE_AI_MODULE) ||
                stack.isOf(RebornAiItems.WITHER_SKELETON_AI_MODULE) ||
                stack.isOf(RebornAiItems.PHANTOM_AI_MODULE) ||
                stack.isOf(RebornAiItems.WITHER_AI_MODULE) ||
                stack.isOf(RebornAiItems.ENDER_DRAGON_AI_MODULE);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}