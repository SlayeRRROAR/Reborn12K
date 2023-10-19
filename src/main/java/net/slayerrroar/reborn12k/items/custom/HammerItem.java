package net.slayerrroar.reborn12k.items.custom;

import net.minecraft.item.Item;

public class HammerItem extends Item {
    public HammerItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isDamageable() {
        return true;
    }

}
