package net.slayerrroar.reborn12k.screen.slots;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.slayerrroar.reborn12k.items.ItemMagic;

public class CustomSoulSlot extends Slot {
    public CustomSoulSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(ItemMagic.CHICKEN_SOUL) ||
                stack.isOf(ItemMagic.COW_SOUL) ||
                stack.isOf(ItemMagic.FISH_SOUL) ||
                stack.isOf(ItemMagic.MOOSHROOM_SOUL) ||
                stack.isOf(ItemMagic.PIG_SOUL) ||
                stack.isOf(ItemMagic.RABBIT_SOUL) ||
                stack.isOf(ItemMagic.SHEEP_SOUL) ||
                stack.isOf(ItemMagic.SQUID_SOUL) ||

                stack.isOf(ItemMagic.BEE_SOUL) ||
                stack.isOf(ItemMagic.SPIDER_SOUL) ||
                stack.isOf(ItemMagic.ENDERMAN_SOUL) ||

                stack.isOf(ItemMagic.BLAZE_SOUL) ||
                stack.isOf(ItemMagic.CREEPER_SOUL) ||
                stack.isOf(ItemMagic.DROWNED_SOUL) ||
                stack.isOf(ItemMagic.GHAST_SOUL) ||
                stack.isOf(ItemMagic.GUARDIAN_SOUL) ||
                stack.isOf(ItemMagic.ILLAGER_SOUL) ||
                stack.isOf(ItemMagic.MAGMA_CUBE_SOUL) ||
                stack.isOf(ItemMagic.PHANTOM_SOUL) ||
                stack.isOf(ItemMagic.SHULKER_SOUL) ||
                stack.isOf(ItemMagic.SKELETON_SOUL) ||
                stack.isOf(ItemMagic.SLIME_SOUL) ||
                stack.isOf(ItemMagic.WITCH_SOUL) ||
                stack.isOf(ItemMagic.WITHER_SKELETON_SOUL) ||
                stack.isOf(ItemMagic.ZOMBIE_SOUL) ||

                stack.isOf(ItemMagic.ENDER_DRAGON_SOUL) ||
                stack.isOf(ItemMagic.WARDEN_SOUL) ||
                stack.isOf(ItemMagic.WITHER_SOUL);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return super.getMaxItemCount(stack);
    }
}