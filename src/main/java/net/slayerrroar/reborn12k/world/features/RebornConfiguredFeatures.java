package net.slayerrroar.reborn12k.world.features;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.RebornBlocks;
import net.slayerrroar.reborn12k.blocks.RebornOres;

import java.util.List;

public class RebornConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?,?>> ASH_KEY = registerKey("ash");
    public static final RegistryKey<ConfiguredFeature<?,?>> ASH_SPAWN_KEY = registerKey("ash_spawn");

    public static final RegistryKey<ConfiguredFeature<?,?>> SLIMY_KEY = registerKey("slimy");
    public static final RegistryKey<ConfiguredFeature<?,?>> SLIMY_SPAWN_KEY = registerKey("slimy_spawn");


    public static final RegistryKey<ConfiguredFeature<?,?>> TIN_ORE_KEY = registerKey("tin_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> ALUMINUM_ORE_KEY = registerKey("aluminum_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> SILVER_ORE_KEY = registerKey("silver_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> LEAD_ORE_KEY = registerKey("lead_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> NICKEL_ORE_KEY = registerKey("nickel_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> CHROMITE_ORE_KEY = registerKey("chromite_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> TITANIUM_ORE_KEY = registerKey("titanium_ore");

    public static final RegistryKey<ConfiguredFeature<?,?>> SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> SAPPHIRE_ORE_LARGE_KEY = registerKey("sapphire_ore_large");
    public static final RegistryKey<ConfiguredFeature<?,?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> RUBY_ORE_LARGE_KEY = registerKey("ruby_ore_large");
    public static final RegistryKey<ConfiguredFeature<?,?>> MANATITE_ORE_KEY = registerKey("manatite_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> MANATITE_ORE_LARGE_KEY = registerKey("manatite_ore_large");

    public static final RegistryKey<ConfiguredFeature<?,?>> NETHER_TUNGSTEN_ORE_KEY = registerKey("nether_tungsten_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> NETHER_VANADIUM_ORE_KEY = registerKey("nether_vanadium_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> NETHER_NEODYMIUM_ORE_KEY = registerKey("nether_neodymium_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> NETHER_URANIUM_ORE_KEY = registerKey("nether_uranium_ore");

    public static final RegistryKey<ConfiguredFeature<?,?>> END_COBALT_ORE_KEY = registerKey("end_cobalt_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> END_OSMIUM_ORE_KEY = registerKey("end_osmium_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> END_PLATINUM_ORE_KEY = registerKey("end_platinum_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> END_IRIDIUM_ORE_KEY = registerKey("end_iridium_ore");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        var placedFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endstoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        //OVERWORLD ORES

        List<OreFeatureConfig.Target> overworldTinOres = List.of(OreFeatureConfig.createTarget(stoneReplaceables, RebornOres.TIN_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, RebornOres.DEEPSLATE_TIN_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldAluminumOres = List.of(OreFeatureConfig.createTarget(stoneReplaceables, RebornOres.ALUMINUM_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, RebornOres.DEEPSLATE_ALUMINUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSilverOres = List.of(OreFeatureConfig.createTarget(stoneReplaceables, RebornOres.SILVER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, RebornOres.DEEPSLATE_SILVER_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldLeadOres = List.of(OreFeatureConfig.createTarget(stoneReplaceables, RebornOres.LEAD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, RebornOres.DEEPSLATE_LEAD_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldNickelOres = List.of(OreFeatureConfig.createTarget(stoneReplaceables, RebornOres.NICKEL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, RebornOres.DEEPSLATE_NICKEL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldChromiteOres = List.of(OreFeatureConfig.createTarget(stoneReplaceables, RebornOres.CHROMITE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, RebornOres.DEEPSLATE_CHROMITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTitaniumOres = List.of(OreFeatureConfig.createTarget(stoneReplaceables, RebornOres.TITANIUM_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, RebornOres.DEEPSLATE_TITANIUM_ORE.getDefaultState()));


        List<OreFeatureConfig.Target> overworldSapphireOres = List.of(OreFeatureConfig.createTarget(stoneReplaceables, RebornOres.SAPPHIRE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, RebornOres.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldRubyOres = List.of(OreFeatureConfig.createTarget(stoneReplaceables, RebornOres.RUBY_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, RebornOres.DEEPSLATE_RUBY_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldManatiteOres = List.of(OreFeatureConfig.createTarget(stoneReplaceables, RebornOres.MANATITE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, RebornOres.DEEPSLATE_MANATITE_ORE.getDefaultState()));

        //NETHER ORES

        List<OreFeatureConfig.Target> netherTungestenOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, RebornOres.NETHER_TUNGSTEN_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherVanadiumOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, RebornOres.NETHER_VANADIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherNeodymiumOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, RebornOres.NETHER_NEODYMIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherUraniumOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, RebornOres.NETHER_URANIUM_ORE.getDefaultState()));

        //END ORES

        List<OreFeatureConfig.Target> endCobaltOres =
                List.of(OreFeatureConfig.createTarget(endstoneReplaceables, RebornOres.END_COBALT_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endOsmiumOres =
                List.of(OreFeatureConfig.createTarget(endstoneReplaceables, RebornOres.END_OSMIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endPlatinumOres =
                List.of(OreFeatureConfig.createTarget(endstoneReplaceables, RebornOres.END_PLATINUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endIridiumOres =
                List.of(OreFeatureConfig.createTarget(endstoneReplaceables, RebornOres.END_IRIDIUM_ORE.getDefaultState()));


        register(context, ASH_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(RebornBlocks.ASH_LOG),
                new StraightTrunkPlacer(6, 4, 0),
                BlockStateProvider.of(RebornBlocks.ASH_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, ASH_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(placedFeatureRegistryEntryLookup.getOrThrow(RebornPlacedFeatures.ASH_PLACED_KEY),
                        0.5f)), placedFeatureRegistryEntryLookup.getOrThrow(RebornPlacedFeatures.ASH_PLACED_KEY)));

        register(context, SLIMY_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(RebornBlocks.SLIMY_LOG),
                new StraightTrunkPlacer(5, 2, 1),
                BlockStateProvider.of(RebornBlocks.SLIMY_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, SLIMY_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(placedFeatureRegistryEntryLookup.getOrThrow(RebornPlacedFeatures.SLIMY_PLACED_KEY),
                        0.1f)), placedFeatureRegistryEntryLookup.getOrThrow(RebornPlacedFeatures.SLIMY_PLACED_KEY)));

        register(context, TIN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTinOres, 9));
        register(context, ALUMINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAluminumOres, 9));
        register(context, SILVER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSilverOres, 9));
        register(context, LEAD_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldLeadOres, 9));
        register(context, NICKEL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldNickelOres, 9));
        register(context, CHROMITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldChromiteOres, 9));
        register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTitaniumOres, 9));

        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres, 7, 0.5f));
        register(context, SAPPHIRE_ORE_LARGE_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres, 12, 0.3f));
        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 7, 0.5f));
        register(context, RUBY_ORE_LARGE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 12, 0.3f));
        register(context, MANATITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldManatiteOres, 9, 0.5f));
        register(context, MANATITE_ORE_LARGE_KEY, Feature.ORE, new OreFeatureConfig(overworldManatiteOres, 12, 0.7f));

        register(context, NETHER_TUNGSTEN_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherTungestenOres, 7));
        register(context, NETHER_VANADIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherVanadiumOres, 4));
        register(context, NETHER_NEODYMIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherNeodymiumOres, 3));
        register(context, NETHER_URANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherUraniumOres, 9));

        register(context, END_COBALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(endCobaltOres, 9));
        register(context, END_OSMIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endOsmiumOres, 4));
        register(context, END_PLATINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endPlatinumOres, 4));
        register(context, END_IRIDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endIridiumOres, 7));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Reborn12K.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
            RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}