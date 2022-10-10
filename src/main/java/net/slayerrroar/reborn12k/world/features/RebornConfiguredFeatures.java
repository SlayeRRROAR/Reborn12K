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
import net.slayerrroar.reborn12k.blocks.BaseBlocks;
import net.slayerrroar.reborn12k.blocks.OreBlocks;

import java.util.List;

public class RebornConfiguredFeatures {

    public static final RuleTest ENDSTONE;

    static {
        ENDSTONE = new BlockMatchRuleTest(Blocks.END_STONE);
    }


    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> ASH_TREE =                            //ASH TREE
            ConfiguredFeatures.register("ash_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(BaseBlocks.ASH_LOG),
                    new StraightTrunkPlacer(6, 4, 0),
                    BlockStateProvider.of(BaseBlocks.ASH_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> ASH_CHECKED =
            PlacedFeatures.register("ash_checked", ASH_TREE,
                    PlacedFeatures.wouldSurvive(BaseBlocks.ASH_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> ASH_SPAWN =
            ConfiguredFeatures.register("ash_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(ASH_CHECKED, 0.5f)),
                            ASH_CHECKED));


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
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(CHERRY_CHECKED, 0.5f)),
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
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(SLIMY_CHECKED, 0.1f)),
                            SLIMY_CHECKED));


    public static final List<OreFeatureConfig.Target> OVERWORLD_TIN_ORES = List.of(                                     //TIN ORES
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.TIN_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TIN_ORE =
            ConfiguredFeatures.register("tin_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_TIN_ORES, 9));


    public static final List<OreFeatureConfig.Target> OVERWORLD_CHROMITE_ORES = List.of(                                //CHROMITE ORES
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.CHROMITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_CHROMITE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CHROMITE_ORE =
            ConfiguredFeatures.register("chromite_ore",Feature.ORE,
                new OreFeatureConfig(OVERWORLD_CHROMITE_ORES, 9));


    public static final List<OreFeatureConfig.Target> OVERWORLD_SILVER_ORES = List.of(                                  //SILVER ORES
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.SILVER_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_SILVER_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SILVER_ORE =
            ConfiguredFeatures.register("silver_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_SILVER_ORES, 9));


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

    public static final List<OreFeatureConfig.Target> MOUNTAIN_OPAL_ORES = List.of(                                     //MOUNTAIN OPAL ORES
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.OPAL_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_OPAL_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OPAL_ORE_MOUNTAIN =
            ConfiguredFeatures.register("opal_ore_mountain",Feature.ORE,
                    new OreFeatureConfig(MOUNTAIN_OPAL_ORES, 8, 0f));


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

    public static final List<OreFeatureConfig.Target> LAVA_RUBY_ORES = List.of(                                         //LAVA RUBY ORES
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.RUBY_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE_LAVA =
            ConfiguredFeatures.register("ruby_ore_lava",Feature.ORE,
                    new OreFeatureConfig(LAVA_RUBY_ORES, 16, 0.9f));


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

    public static final List<OreFeatureConfig.Target> OCEAN_SAPPHIRE_ORES = List.of(                                    //OCEAN SAPPHIRE ORES
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.SAPPHIRE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAPPHIRE_ORE_OCEAN =
            ConfiguredFeatures.register("sapphire_ore_ocean",Feature.ORE,
                    new OreFeatureConfig(OCEAN_SAPPHIRE_ORES, 8, 0f));


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
                    new OreFeatureConfig(OVERWORLD_MANATITE_ORES, 12, 0.7f));


    public static final List<OreFeatureConfig.Target> NETHER_ALUMINUM_ORES = List.of(                                    //NETHER ALUMINUM ORES
            OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK,
                    OreBlocks.NETHER_ALUMINUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_ALUMINUM_ORE =
            ConfiguredFeatures.register("nether_aluminum_ore",Feature.ORE,
                    new OreFeatureConfig(NETHER_ALUMINUM_ORES, 9));


    public static final List<OreFeatureConfig.Target> END_COBALT_ORES = List.of(                                        //END COBALT ORES
            OreFeatureConfig.createTarget(RebornConfiguredFeatures.ENDSTONE,
                    OreBlocks.END_COBALT_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_COBALT_ORE =
            ConfiguredFeatures.register("end_cobalt_ore",Feature.ORE,
                    new OreFeatureConfig(END_COBALT_ORES, 9));


    public static final List<OreFeatureConfig.Target> END_IRIDIUM_ORES = List.of(                                        //END COBALT ORES
            OreFeatureConfig.createTarget(RebornConfiguredFeatures.ENDSTONE,
                    OreBlocks.END_IRIDIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_IRIDIUM_ORE =
            ConfiguredFeatures.register("end_iridium_ore",Feature.ORE,
                    new OreFeatureConfig(END_IRIDIUM_ORES, 4));


    public static void register() {

    }
}