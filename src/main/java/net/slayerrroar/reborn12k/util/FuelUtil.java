package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.slayerrroar.reborn12k.items.ItemGenerics;

public class FuelUtil {

    public static void register() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ItemGenerics.COAL_PIECE, 200);
        registry.add(ItemGenerics.COAL_DUST, 1600);
        registry.add(ItemGenerics.URANIUM_INGOT, 3200);

    }
}
