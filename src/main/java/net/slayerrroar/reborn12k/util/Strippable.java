package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.slayerrroar.reborn12k.blocks.BaseBlocks;

public class Strippable {

    public static void register() {
        StrippableBlockRegistry.register(BaseBlocks.CHERRY_LOG, BaseBlocks.STRIPPED_CHERRY_LOG);
        StrippableBlockRegistry.register(BaseBlocks.CHERRY_WOOD, BaseBlocks.STRIPPED_CHERRY_WOOD);
    }

}
