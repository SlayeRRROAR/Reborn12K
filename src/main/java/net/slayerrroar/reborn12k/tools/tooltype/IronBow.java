package net.slayerrroar.reborn12k.tools.tooltype;

import net.minecraft.item.BowItem;

public class IronBow extends BowItem {
    public IronBow(Settings settings) {
        super(settings);
    }

    @Override
    public int getEnchantability() {
        return 5;
    }

    @Override
    public int getRange() {
        return 19;
    }
}
