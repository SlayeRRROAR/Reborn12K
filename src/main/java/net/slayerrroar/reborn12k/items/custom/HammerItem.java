package net.slayerrroar.reborn12k.items.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.slayerrroar.reborn12k.items.GenericItems;

public class HammerItem extends Item {
    public HammerItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isDamageable() {
        return true;
    }

    @Override
    public boolean hasRecipeRemainder() {
        return true;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return new ItemStack(GenericItems.HAMMER);
    }
}
