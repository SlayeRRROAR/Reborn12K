package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.slayerrroar.reborn12k.items.RebornItems;

public class FuelUtil {

    public static void register() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(RebornItems.COAL_PIECE, 200);
        registry.add(RebornItems.COAL_DUST, 1600);
        registry.add(RebornItems.URANIUM_INGOT, 3200);

    }
}
