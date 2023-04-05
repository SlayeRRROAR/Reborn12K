package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.slayerrroar.reborn12k.blocks.BlockGenerics;

public class Strippable {

    public static void register() {
        StrippableBlockRegistry.register(BlockGenerics.CHERRY_LOG, BlockGenerics.STRIPPED_CHERRY_LOG);
        StrippableBlockRegistry.register(BlockGenerics.CHERRY_WOOD, BlockGenerics.STRIPPED_CHERRY_WOOD);
    }

}
