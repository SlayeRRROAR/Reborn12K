package net.slayerrroar.reborn12k.tools.tooltype;

import net.minecraft.item.BowItem;

public class CompoundBow extends BowItem {
    public CompoundBow(Settings settings) {
        super(settings);
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public int getRange() {
        return 24;
    }
}
