package net.slayerrroar.reborn12k;

import net.fabricmc.api.ModInitializer;
import net.slayerrroar.reborn12k.armors.Armors;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;
import net.slayerrroar.reborn12k.blocks.BaseBlocks;
import net.slayerrroar.reborn12k.blocks.OreBlocks;
import net.slayerrroar.reborn12k.enchantments.CustomEnchantments;
import net.slayerrroar.reborn12k.entity.CustomBlockEntities;
import net.slayerrroar.reborn12k.fluids.CustomFluids;
import net.slayerrroar.reborn12k.items.*;
import net.slayerrroar.reborn12k.recipe.CustomRecipes;
import net.slayerrroar.reborn12k.screen.CustomScreenRegistry;
import net.slayerrroar.reborn12k.sounds.SoundClass;
import net.slayerrroar.reborn12k.statuses.CustomStatusEffects;
import net.slayerrroar.reborn12k.tools.Tools;
import net.slayerrroar.reborn12k.util.CustomFuels;
import net.slayerrroar.reborn12k.util.Strippable;
import net.slayerrroar.reborn12k.villagers.CustomTrades;
import net.slayerrroar.reborn12k.world.features.RebornConfiguredFeatures;
import net.slayerrroar.reborn12k.world.generation.RebornWorldGen;

public class Reborn12K implements ModInitializer {

    public static final String MOD_ID = "reborn12k";

    @Override
    public void onInitialize() {

        SoundClass.register();
        CustomStatusEffects.register();

        OreBlocks.register();
        BaseBlocks.register();
        AdvancedBlocks.register();

        BaseItems.register();
        CustomFuels.register();
        TechItems.register();
        MagicItems.register();

        CustomFluids.register();

        Rings.register();
        Staffs.register();
        Charms.register();

        SecretItems.register();

        DiscItems.register();

        Tools.register();
        Armors.register();

        CustomEnchantments.register();

        RebornConfiguredFeatures.register();
        RebornWorldGen.generate();

        Strippable.register();

        CustomTrades.register();

        CustomBlockEntities.register();

        CustomScreenRegistry.register();

        CustomRecipes.register();

    }
}
