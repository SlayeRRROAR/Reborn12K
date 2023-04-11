package net.slayerrroar.reborn12k;

import net.fabricmc.api.ModInitializer;
import net.slayerrroar.reborn12k.armors.RebornArmors;
import net.slayerrroar.reborn12k.blocks.*;
import net.slayerrroar.reborn12k.enchantments.RebornEnchantments;
import net.slayerrroar.reborn12k.entity.CustomBlockEntities;
import net.slayerrroar.reborn12k.fluids.RebornFluids;
import net.slayerrroar.reborn12k.items.*;
import net.slayerrroar.reborn12k.recipe.RebornCustomRecipes;
import net.slayerrroar.reborn12k.screen.RebornScreenRegistry;
import net.slayerrroar.reborn12k.sounds.RebornSounds;
import net.slayerrroar.reborn12k.tools.RebornTools;
import net.slayerrroar.reborn12k.util.*;
import net.slayerrroar.reborn12k.villagers.RebornCustomTrades;

import net.slayerrroar.reborn12k.world.generation.RebornWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reborn12K implements ModInitializer {

    public static final String MOD_ID = "reborn12k";
    public static final Logger LOGGER = LoggerFactory.getLogger("reborn12k");

    @Override
    public void onInitialize() {

        ItemGroupUtil.registerItemGroups();

        RebornSounds.register();

        OreBlocks.register();
        GenericBlocks.register();
        AdvancedBlocks.register();

        ItemGenerics.register();

        RebornFluids.register();
        FuelUtil.register();

        ItemTechnical.register();
        ItemMagic.register();

        ItemTrinkets.register();

        ItemDiscs.register();

        RebornTools.register();
        RebornArmors.register();

        RebornEnchantments.register();

        RebornWorldGen.generate();

        StrippableUtil.register();

        RebornCustomTrades.register();

        CustomBlockEntities.register();

        RebornScreenRegistry.register();

        RebornCustomRecipes.register();

    }
}
