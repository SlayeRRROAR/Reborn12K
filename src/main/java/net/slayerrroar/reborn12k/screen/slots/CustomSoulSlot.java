package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.items.RebornItems;

public class CustomSoulSlot extends Slot {
    public CustomSoulSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return  stack.isOf(RebornItems.CHICKEN_SOUL) ||
                stack.isOf(RebornItems.COW_SOUL) ||
                stack.isOf(RebornItems.FISH_SOUL) ||
                stack.isOf(RebornItems.FROG_SOUL) ||
                stack.isOf(RebornItems.MOOSHROOM_SOUL) ||
                stack.isOf(RebornItems.PIG_SOUL) ||
                stack.isOf(RebornItems.RABBIT_SOUL) ||
                stack.isOf(RebornItems.SHEEP_SOUL) ||
                stack.isOf(RebornItems.SQUID_SOUL) ||

                stack.isOf(RebornItems.BEE_SOUL) ||
                stack.isOf(RebornItems.SPIDER_SOUL) ||
                stack.isOf(RebornItems.ENDERMAN_SOUL) ||

                stack.isOf(RebornItems.BLAZE_SOUL) ||
                stack.isOf(RebornItems.CREEPER_SOUL) ||
                stack.isOf(RebornItems.DROWNED_SOUL) ||
                stack.isOf(RebornItems.GHAST_SOUL) ||
                stack.isOf(RebornItems.GUARDIAN_SOUL) ||
                stack.isOf(RebornItems.ILLAGER_SOUL) ||
                stack.isOf(RebornItems.MAGMA_CUBE_SOUL) ||
                stack.isOf(RebornItems.PHANTOM_SOUL) ||
                stack.isOf(RebornItems.SHULKER_SOUL) ||
                stack.isOf(RebornItems.SKELETON_SOUL) ||
                stack.isOf(RebornItems.SLIME_SOUL) ||
                stack.isOf(RebornItems.WITCH_SOUL) ||
                stack.isOf(RebornItems.WITHER_SKELETON_SOUL) ||
                stack.isOf(RebornItems.ZOMBIE_SOUL) ||

                stack.isOf(RebornItems.ENDER_DRAGON_SOUL) ||
                stack.isOf(RebornItems.WARDEN_SOUL) ||
                stack.isOf(RebornItems.WITHER_SOUL);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}