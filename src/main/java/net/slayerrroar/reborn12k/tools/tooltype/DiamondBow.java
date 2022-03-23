package net.slayerrroar.reborn12k.tools.tooltype;

import net.minecraft.item.BowItem;

public class DiamondBow extends BowItem {
    public DiamondBow(Settings settings) {
        super(settings);
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public int getRange() {
        return 30;
    }
}
