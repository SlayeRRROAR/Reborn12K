package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.slayerrroar.reborn12k.blocks.BaseBlocks;
import net.slayerrroar.reborn12k.items.BaseItems;

public class Fuels {

    public static void register() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(BaseItems.URANIUM, 12800);

    }
}
