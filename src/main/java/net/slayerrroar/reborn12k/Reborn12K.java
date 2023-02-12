package net.slayerrroar.reborn12k;

import net.fabricmc.api.ModInitializer;
import net.slayerrroar.reborn12k.armors.RebornArmors;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;
import net.slayerrroar.reborn12k.blocks.RebornBlocks;
import net.slayerrroar.reborn12k.blocks.RebornOreBlocks;
import net.slayerrroar.reborn12k.enchantments.RebornEnchantments;
import net.slayerrroar.reborn12k.entity.CustomBlockEntities;
import net.slayerrroar.reborn12k.fluids.RebornFluids;
import net.slayerrroar.reborn12k.items.*;
import net.slayerrroar.reborn12k.recipe.RebornCustomRecipes;
import net.slayerrroar.reborn12k.screen.RebornScreenRegistry;
import net.slayerrroar.reborn12k.sounds.RebornSounds;
import net.slayerrroar.reborn12k.tools.RebornTools;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;
import net.slayerrroar.reborn12k.util.RebornFuelUtil;
import net.slayerrroar.reborn12k.util.Strippable;
import net.slayerrroar.reborn12k.villagers.RebornCustomTrades;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reborn12K implements ModInitializer {

    public static final String MOD_ID = "reborn12k";
    public static final Logger LOGGER = LoggerFactory.getLogger("reborn12k");

    @Override
    public void onInitialize() {
        Reborn12KItemGroup.registerItemGroups();

        RebornSounds.register();

        RebornOreBlocks.register();
        RebornBlocks.register();
        AdvancedBlocks.register();

        RebornItems.register();

        RebornFluids.register();
        RebornFuelUtil.register();

        RebornTechItems.register();
        RebornAiItems.register();
        MagicItems.register();

        StaffItems.register();
        CharmItems.register();

        SecretItems.register();

        DiscItems.register();

        RebornTools.register();
        RebornArmors.register();

        RebornEnchantments.register();

        //RebornWorldGen.generate();

        Strippable.register();

        RebornCustomTrades.register();

        CustomBlockEntities.register();

        RebornScreenRegistry.register();

        RebornCustomRecipes.register();

    }
}
