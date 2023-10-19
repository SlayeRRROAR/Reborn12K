package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.slayerrroar.reborn12k.blocks.RebornBlocks;

public class StrippableUtil {

    public static void register() {
        StrippableBlockRegistry.register(RebornBlocks.ASH_LOG, RebornBlocks.STRIPPED_ASH_LOG);
        StrippableBlockRegistry.register(RebornBlocks.ASH_WOOD, RebornBlocks.STRIPPED_ASH_WOOD);
    }

}
