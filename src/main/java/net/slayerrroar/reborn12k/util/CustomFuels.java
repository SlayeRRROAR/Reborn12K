package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.slayerrroar.reborn12k.items.BaseItems;

public class CustomFuels {

    public static void register() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(BaseItems.COAL_PIECE, 200);
        registry.add(BaseItems.COAL_DUST, 1600);
        registry.add(BaseItems.URANIUM_INGOT, 3200);

    }
}
