package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.slayerrroar.reborn12k.blocks.GenericBlocks;

public class StrippableUtil {

    public static void register() {
        StrippableBlockRegistry.register(GenericBlocks.ASH_LOG, GenericBlocks.STRIPPED_ASH_LOG);
        StrippableBlockRegistry.register(GenericBlocks.ASH_WOOD, GenericBlocks.STRIPPED_ASH_WOOD);

        StrippableBlockRegistry.register(GenericBlocks.CHERRY_LOG, GenericBlocks.STRIPPED_CHERRY_LOG);
        StrippableBlockRegistry.register(GenericBlocks.CHERRY_WOOD, GenericBlocks.STRIPPED_CHERRY_WOOD);
    }

}
