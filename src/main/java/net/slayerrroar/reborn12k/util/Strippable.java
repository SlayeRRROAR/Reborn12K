package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.slayerrroar.reborn12k.blocks.RebornBlocks;

public class Strippable {

    public static void register() {
        StrippableBlockRegistry.register(RebornBlocks.CHERRY_LOG, RebornBlocks.STRIPPED_CHERRY_LOG);
        StrippableBlockRegistry.register(RebornBlocks.CHERRY_WOOD, RebornBlocks.STRIPPED_CHERRY_WOOD);
    }

}
