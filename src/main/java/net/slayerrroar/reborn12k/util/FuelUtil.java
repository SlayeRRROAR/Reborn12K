package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.slayerrroar.reborn12k.items.GenericItems;

public class FuelUtil {

    public static void register() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(GenericItems.COAL_PIECE, 200);
        registry.add(GenericItems.COAL_DUST, 1600);
        registry.add(GenericItems.URANIUM_INGOT, 3200);

    }
}
