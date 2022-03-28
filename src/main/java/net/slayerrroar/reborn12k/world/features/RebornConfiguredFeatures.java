package net.slayerrroar.reborn12k.world.features;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.BaseBlocks;
import net.slayerrroar.reborn12k.blocks.OreBlocks;

import java.util.List;

public class RebornConfiguredFeatures {

    public static final RuleTest ENDSTONE;

    static {
        ENDSTONE = new BlockMatchRuleTest(Blocks.END_STONE);
    }


    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> CHERRY_TREE =                            //CHERRY TREE
            ConfiguredFeatures.register("cherry_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(BaseBlocks.CHERRY_LOG),
                    new StraightTrunkPlacer(5, 2, 1),
                    BlockStateProvider.of(BaseBlocks.CHERRY_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> CHERRY_CHECKED =
            PlacedFeatures.register("cherry_checked", CHERRY_TREE,
                    PlacedFeatures.wouldSurvive(BaseBlocks.CHERRY_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> CHERRY_SPAWN =
            ConfiguredFeatures.register("cherry_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(CHERRY_CHECKED, 0.3f)),
                            CHERRY_CHECKED));


    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> SLIMY_TREE =                             //SLIMY TREE
            ConfiguredFeatures.register("slimy_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(BaseBlocks.SLIMY_LOG),
                    new StraightTrunkPlacer(5, 2, 1),
                    BlockStateProvider.of(BaseBlocks.SLIMY_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> SLIMY_CHECKED =
            PlacedFeatures.register("slimy_checked", SLIMY_TREE,
                    PlacedFeatures.wouldSurvive(BaseBlocks.SLIMY_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> SLIMY_SPAWN =
            ConfiguredFeatures.register("slimy_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(SLIMY_CHECKED, 0.3f)),
                            SLIMY_CHECKED));


    public static final List<OreFeatureConfig.Target> OVERWORLD_TOPAZ_ORES = List.of(                                   //TOPAZ ORES
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.TOPAZ_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_TOPAZ_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TOPAZ_ORE_SMALL =
            ConfiguredFeatures.register("topaz_ore_small",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_TOPAZ_ORES, 8, 0.3f));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TOPAZ_ORE_LARGE =
            ConfiguredFeatures.register("topaz_ore_large",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_TOPAZ_ORES, 12, 0.5f));


    public static final List<OreFeatureConfig.Target> OVERWORLD_OPAL_ORES = List.of(                                    //OPAL ORES
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.OPAL_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_OPAL_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OPAL_ORE_SMALL =
            ConfiguredFeatures.register("opal_ore_small",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_OPAL_ORES, 8, 0.3f));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OPAL_ORE_LARGE =
            ConfiguredFeatures.register("opal_ore_large",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_OPAL_ORES, 12, 0.5f));


    public static final List<OreFeatureConfig.Target> OVERWORLD_RUBY_ORES = List.of(                                    //RUBY ORES
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.RUBY_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE_SMALL =
            ConfiguredFeatures.register("ruby_ore_small",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_RUBY_ORES, 8, 0.3f));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE_LARGE =
            ConfiguredFeatures.register("ruby_ore_large",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_RUBY_ORES, 12, 0.5f));


    public static final List<OreFeatureConfig.Target> OVERWORLD_SAPPHIRE_ORES = List.of(                                //SAPPHIRE ORES
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.SAPPHIRE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAPPHIRE_ORE_SMALL =
            ConfiguredFeatures.register("sapphire_ore_small",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_SAPPHIRE_ORES, 8, 0.3f));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAPPHIRE_ORE_LARGE =
            ConfiguredFeatures.register("sapphire_ore_large",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_SAPPHIRE_ORES, 12, 0.5f));


    public static final List<OreFeatureConfig.Target> OVERWORLD_MANATITE_ORES = List.of(                                //MANATITE ORES
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.MANATITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_MANATITE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MANATITE_ORE_SMALL =
            ConfiguredFeatures.register("manatite_ore_small",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_MANATITE_ORES, 8, 0.5f));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MANATITE_ORE_LARGE =
            ConfiguredFeatures.register("manatite_ore_large",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_OPAL_ORES, 12, 0.7f));


    public static final List<OreFeatureConfig.Target> OVERWORLD_E115_ORES = List.of(                                    //E115 ORE
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_ELEMENT_115_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> E115_ORE =
            ConfiguredFeatures.register("e115_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_E115_ORES, 8, 0.7f));


    public static final List<OreFeatureConfig.Target> OVERWORLD_URANIUM_ORES = List.of(                                 //URANIUM ORE
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_URANIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> URANIUM_ORE =
            ConfiguredFeatures.register("uranium_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_URANIUM_ORES, 8, 0.5f));


    public static final List<OreFeatureConfig.Target> OVERWORLD_TIN_ORES = List.of(                                     //TIN ORES
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.TIN_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TIN_ORE =
            ConfiguredFeatures.register("tin_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_TIN_ORES, 8));


    public static final List<OreFeatureConfig.Target> OVERWORLD_CHROMITE_ORES = List.of(                                //CHROMITE ORES
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.CHROMITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_CHROMITE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CHROMITE_ORE =
            ConfiguredFeatures.register("chromite_ore",Feature.ORE,
                new OreFeatureConfig(OVERWORLD_CHROMITE_ORES, 8));


    public static final List<OreFeatureConfig.Target> OVERWORLD_SILVER_ORES = List.of(                                  //SILVER ORES
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.SILVER_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_SILVER_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SILVER_ORE =
            ConfiguredFeatures.register("silver_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_SILVER_ORES, 8));


    public static final List<OreFeatureConfig.Target> NETHER_URANIUM_ORES = List.of(                                    //NETHER URANIUM ORES
            OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK,
                    OreBlocks.NETHER_URANIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_URANIUM_ORE =
            ConfiguredFeatures.register("nether_uranium_ore",Feature.ORE,
                    new OreFeatureConfig(NETHER_URANIUM_ORES, 12));


    public static final List<OreFeatureConfig.Target> END_COBALT_ORES = List.of(                                        //END COBALT ORES
            OreFeatureConfig.createTarget(RebornConfiguredFeatures.ENDSTONE,
                    OreBlocks.END_COBALT_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_COBALT_ORE =
            ConfiguredFeatures.register("end_cobalt_ore",Feature.ORE,
                    new OreFeatureConfig(END_COBALT_ORES, 8));


    public static void register() {

        System.out.println("Registering Configured Features for " + Reborn12K.MOD_ID);

    }
}