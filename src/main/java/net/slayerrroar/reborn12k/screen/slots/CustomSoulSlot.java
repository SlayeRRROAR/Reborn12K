package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.items.MagicItems;

public class CustomSoulSlot extends Slot {
    public CustomSoulSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(MagicItems.CHICKEN_SOUL) ||
                stack.isOf(MagicItems.COW_SOUL) ||
                stack.isOf(MagicItems.FISH_SOUL) ||
                stack.isOf(MagicItems.MOOSHROOM_SOUL) ||
                stack.isOf(MagicItems.PIG_SOUL) ||
                stack.isOf(MagicItems.RABBIT_SOUL) ||
                stack.isOf(MagicItems.SHEEP_SOUL) ||
                stack.isOf(MagicItems.SQUID_SOUL) ||

                stack.isOf(MagicItems.BEE_SOUL) ||
                stack.isOf(MagicItems.SPIDER_SOUL) ||
                stack.isOf(MagicItems.ENDERMAN_SOUL) ||

                stack.isOf(MagicItems.BLAZE_SOUL) ||
                stack.isOf(MagicItems.CREEPER_SOUL) ||
                stack.isOf(MagicItems.DROWNED_SOUL) ||
                stack.isOf(MagicItems.GHAST_SOUL) ||
                stack.isOf(MagicItems.GUARDIAN_SOUL) ||
                stack.isOf(MagicItems.ILLAGER_SOUL) ||
                stack.isOf(MagicItems.MAGMA_CUBE_SOUL) ||
                stack.isOf(MagicItems.PHANTOM_SOUL) ||
                stack.isOf(MagicItems.SHULKER_SOUL) ||
                stack.isOf(MagicItems.SKELETON_SOUL) ||
                stack.isOf(MagicItems.SLIME_SOUL) ||
                stack.isOf(MagicItems.WITCH_SOUL) ||
                stack.isOf(MagicItems.WITHER_SKELETON_SOUL) ||
                stack.isOf(MagicItems.ZOMBIE_SOUL) ||

                stack.isOf(MagicItems.ENDER_DRAGON_SOUL) ||
                stack.isOf(MagicItems.WARDEN_SOUL) ||
                stack.isOf(MagicItems.WITHER_SOUL);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}