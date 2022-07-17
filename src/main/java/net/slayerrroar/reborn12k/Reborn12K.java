package net.slayerrroar.reborn12k;

import net.fabricmc.api.ModInitializer;
import net.slayerrroar.reborn12k.armors.Armors;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;
import net.slayerrroar.reborn12k.blocks.BaseBlocks;
import net.slayerrroar.reborn12k.blocks.OreBlocks;
import net.slayerrroar.reborn12k.items.*;
import net.slayerrroar.reborn12k.tools.Tools;
import net.slayerrroar.reborn12k.util.Strippable;
import net.slayerrroar.reborn12k.villagers.CustomTrades;
import net.slayerrroar.reborn12k.world.features.RebornConfiguredFeatures;
import net.slayerrroar.reborn12k.world.generation.RebornWorldGen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Reborn12K implements ModInitializer {

    public static final String MOD_ID = "reborn12k";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {


        AdvancedBlocks.register();
        BaseBlocks.register();
        OreBlocks.register();

        BaseItems.register();
        AdvancedItems.register();

        Tools.register();
        Armors.register();

        RebornConfiguredFeatures.register();
        RebornWorldGen.generate();

        Strippable.register();

        CustomTrades.register();

    }
}
