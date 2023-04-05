package net.slayerrroar.reborn12k.items.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GlintedItem extends Item {
    public GlintedItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
