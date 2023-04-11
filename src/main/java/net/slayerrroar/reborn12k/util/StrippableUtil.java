package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.slayerrroar.reborn12k.blocks.BlockGenerics;

public class StrippableUtil {

    public static void register() {
        StrippableBlockRegistry.register(BlockGenerics.ASH_LOG, BlockGenerics.STRIPPED_ASH_LOG);
        StrippableBlockRegistry.register(BlockGenerics.ASH_WOOD, BlockGenerics.STRIPPED_ASH_WOOD);

        StrippableBlockRegistry.register(BlockGenerics.CHERRY_LOG, BlockGenerics.STRIPPED_CHERRY_LOG);
        StrippableBlockRegistry.register(BlockGenerics.CHERRY_WOOD, BlockGenerics.STRIPPED_CHERRY_WOOD);
    }

}
