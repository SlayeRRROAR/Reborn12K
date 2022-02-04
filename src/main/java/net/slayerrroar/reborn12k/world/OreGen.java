package net.slayerrroar.reborn12k.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.OreBlocks;

public class OreGen {

    private static final ConfiguredFeature<?, ?> TOPAZ_ORE =                                    //Topaz Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.TOPAZ_ORE.getDefaultState(),
                    4));                                                                        //Blocks per vein

    private static final PlacedFeature TOPAZ_ORE_PLACED = TOPAZ_ORE
            .withPlacement(CountPlacementModifier.of(2),                                        //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.fixed(-64),                                                 //Min generation Y level
                            YOffset.fixed(16)));                                                //Max generation Y level


    private static final ConfiguredFeature<?, ?> OPAL_ORE =                                     //Opal Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.OPAL_ORE.getDefaultState(),
                    4));                                                                        //Blocks per vein

    private static final PlacedFeature OPAL_ORE_PLACED = OPAL_ORE
            .withPlacement(CountPlacementModifier.of(2),                                        //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.fixed(-64),                                                 //Min generation Y level
                            YOffset.fixed(16)));                                                //Max generation Y level


    private static final ConfiguredFeature<?, ?> RUBY_ORE =                                     //Topaz Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.RUBY_ORE.getDefaultState(),
                    4));                                                                        //Blocks per vein

    private static final PlacedFeature RUBY_ORE_PLACED = RUBY_ORE
            .withPlacement(CountPlacementModifier.of(2),                                        //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.fixed(-64),                                                 //Min generation Y level
                            YOffset.fixed(16)));                                                //Max generation Y level


    private static final ConfiguredFeature<?, ?> SAPPHIRE_ORE =                                     //Opal Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.SAPPHIRE_ORE.getDefaultState(),
                    4));                                                                        //Blocks per vein

    private static final PlacedFeature SAPPHIRE_ORE_PLACED = SAPPHIRE_ORE
            .withPlacement(CountPlacementModifier.of(2),                                        //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.fixed(-64),                                                 //Min generation Y level
                            YOffset.fixed(16)));                                                //Max generation Y level



    private static final ConfiguredFeature<?, ?> DEEP_TOPAZ_ORE =                               //Deepslate Topaz Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_TOPAZ_ORE.getDefaultState(),
                    4));                                                                        //Blocks per vein

    private static final PlacedFeature DEEP_TOPAZ_ORE_PLACED = DEEP_TOPAZ_ORE
            .withPlacement(CountPlacementModifier.of(4),                                        //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.fixed(-64),                                                 //Min generation Y level
                            YOffset.fixed(16)));                                                //Max generation Y level


    private static final ConfiguredFeature<?, ?> DEEP_OPAL_ORE =                                //Deepslate Opal Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_OPAL_ORE.getDefaultState(),
                    4));                                                                        //Blocks per vein

    private static final PlacedFeature DEEP_OPAL_ORE_PLACED = DEEP_OPAL_ORE
            .withPlacement(CountPlacementModifier.of(4),                                        //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.fixed(-64),                                                 //Min generation Y level
                            YOffset.fixed(16)));                                                //Max generation Y level


    private static final ConfiguredFeature<?, ?> DEEP_RUBY_ORE =                               //Deepslate Topaz Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_RUBY_ORE.getDefaultState(),
                    4));                                                                        //Blocks per vein

    private static final PlacedFeature DEEP_RUBY_ORE_PLACED = DEEP_RUBY_ORE
            .withPlacement(CountPlacementModifier.of(4),                                        //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.fixed(-64),                                                 //Min generation Y level
                            YOffset.fixed(16)));                                                //Max generation Y level


    private static final ConfiguredFeature<?, ?> DEEP_SAPPHIRE_ORE =                            //Deepslate Opal Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState(),
                    4));                                                                        //Blocks per vein

    private static final PlacedFeature DEEP_SAPPHIRE_ORE_PLACED = DEEP_SAPPHIRE_ORE
            .withPlacement(CountPlacementModifier.of(4),                                        //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.fixed(-64),                                                 //Min generation Y level
                            YOffset.fixed(16)));                                                //Max generation Y level



    private static final ConfiguredFeature<?, ?> MANATITE_ORE =                                 //Manatite Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.MANATITE_ORE.getDefaultState(),
                    3));                                                                        //Blocks per vein

    private static final PlacedFeature MANATITE_ORE_PLACED = MANATITE_ORE
            .withPlacement(CountPlacementModifier.of(1),                                        //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.fixed(-64),                                                 //Min generation Y level
                            YOffset.fixed(16)));                                                //Max generation Y level


    private static final ConfiguredFeature<?, ?> DEEP_MANATITE_ORE =                            //Deepslate Manatite Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_MANATITE_ORE.getDefaultState(),
                    3));                                                                        //Blocks per vein

    private static final PlacedFeature DEEP_MANATITE_ORE_PLACED = DEEP_MANATITE_ORE
            .withPlacement(CountPlacementModifier.of(3),                                        //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.fixed(-64),                                                 //Min generation Y level
                            YOffset.fixed(16)));                                                //Max generation Y level


    private static final ConfiguredFeature<?, ?> DEEP_ELEMENT_115_ORE =                         //Deepslate Element 115 Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_MANATITE_ORE.getDefaultState(),
                    2));                                                                        //Blocks per vein

    private static final PlacedFeature DEEP_ELEMENT_115_ORE_PLACED = DEEP_ELEMENT_115_ORE
            .withPlacement(CountPlacementModifier.of(4),                                        //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.fixed(-64),                                                 //Min generation Y level
                            YOffset.fixed(-32)));                                               //Max generation Y level



    private static final ConfiguredFeature<?, ?> TIN_ORE =                                      //Tin Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.TIN_ORE.getDefaultState(),
                    9));                                                                        //Blocks per vein

    private static final PlacedFeature TIN_ORE_PLACED = TIN_ORE
            .withPlacement(CountPlacementModifier.of(16),                                       //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.uniform(
                            YOffset.fixed(0),                                                   //Min generation Y level
                            YOffset.fixed(112)));                                               //Max generation Y level



    private static final ConfiguredFeature<?, ?> CHROMITE_ORE =                                 //Chromite Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.CHROMITE_ORE.getDefaultState(),
                    7));                                                                        //Blocks per vein

    private static final PlacedFeature CHROMITE_ORE_PLACED = CHROMITE_ORE
            .withPlacement(CountPlacementModifier.of(12),                                       //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.fixed(-64),                                                 //Min generation Y level
                            YOffset.fixed(42)));                                                //Max generation Y level


    private static final ConfiguredFeature<?, ?> DEEP_CHROMITE_ORE =                            //Deepslate Chromite Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_CHROMITE_ORE.getDefaultState(),
                    7));                                                                        //Blocks per vein

    private static final PlacedFeature DEEP_CHROMITE_ORE_PLACED = DEEP_CHROMITE_ORE
            .withPlacement(CountPlacementModifier.of(12),                                       //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.fixed(-64),                                                 //Min generation Y level
                            YOffset.fixed(42)));                                                //Max generation Y level



    private static final ConfiguredFeature<?, ?> SILVER_ORE =                                   //Silver Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    OreBlocks.SILVER_ORE.getDefaultState(),
                    7));                                                                        //Blocks per vein

    private static final PlacedFeature SILVER_ORE_PLACED = SILVER_ORE
            .withPlacement(CountPlacementModifier.of(8),                                        //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.fixed(-64),                                                 //Min generation Y level
                            YOffset.fixed(32)));                                                //Max generation Y level


    private static final ConfiguredFeature<?, ?> DEEP_SILVER_ORE =                              //Silver Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_SILVER_ORE.getDefaultState(),
                    7));                                                                        //Blocks per vein

    private static final PlacedFeature DEEP_SILVER_ORE_PLACED = DEEP_SILVER_ORE
            .withPlacement(CountPlacementModifier.of(8),                                        //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.fixed(-64),                                                 //Min generation Y level
                            YOffset.fixed(32)));                                                //Max generation Y level



    private static final ConfiguredFeature<?, ?> DEEP_URANIUM_ORE =                             //Deepslate Uranium Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    OreBlocks.DEEPSLATE_URANIUM_ORE.getDefaultState(),
                    3));                                                                        //Blocks per vein

    private static final PlacedFeature DEEP_URANIUM_ORE_PLACED = DEEP_URANIUM_ORE
            .withPlacement(CountPlacementModifier.of(3),                                        //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.trapezoid(
                            YOffset.fixed(-64),                                                 //Min generation Y level
                            YOffset.fixed(0)));                                                 //Max generation Y level



    private static final ConfiguredFeature<?, ?> NETHER_URANIUM_ORE =                           //Nether Uranium Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    OreConfiguredFeatures.NETHERRACK,
                    OreBlocks.NETHER_URANIUM_ORE.getDefaultState(),
                    13));                                                                       //Blocks per vein

    public static PlacedFeature NETHER_URANIUM_ORE_PLACED = NETHER_URANIUM_ORE
            .withPlacement(CountPlacementModifier.of(32),                                       //Veins per chunk
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(
                    YOffset.fixed(10),                                                          //Min generation Y level
                    YOffset.fixed(120)));                                                       //Max generation Y level



    private static final ConfiguredFeature<?, ?> END_COBALT_ORE =                               //End Cobalt Ore
            Feature.ORE.configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    OreBlocks.END_COBALT_ORE.getDefaultState(),
                    9));                                                                        //Blocks per vein

    private static final PlacedFeature END_COBALT_ORE_PLACED = END_COBALT_ORE
            .withPlacement(CountPlacementModifier.of(12),                                       //Veins per chunk
                    SquarePlacementModifier.of(),                                               //Horizontal spread
                    HeightRangePlacementModifier.uniform(
                            YOffset.fixed(32),                                                  //Min generation Y level
                            YOffset.fixed(70)));                                                //Max generation Y level


    public static void register() {

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "topaz_ore"), TOPAZ_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "topaz_ore"), TOPAZ_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "topaz_ore")));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "opal_ore"), OPAL_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "opal_ore"), OPAL_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "opal_ore")));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "ruby_ore"), RUBY_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "ruby_ore")));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "sapphire_ore")));


        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_topaz_ore"), DEEP_TOPAZ_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_topaz_ore"), DEEP_TOPAZ_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "deep_topaz_ore")));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_opal_ore"), DEEP_OPAL_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_opal_ore"), DEEP_OPAL_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "deep_opal_ore")));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_ruby_ore"), DEEP_RUBY_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_ruby_ore"), DEEP_RUBY_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "deep_ruby_ore")));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_sapphire_ore"), DEEP_SAPPHIRE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_sapphire_ore"), DEEP_SAPPHIRE_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "deep_sapphire_ore")));


        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "manatite_ore"), MANATITE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "manatite_ore"), MANATITE_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "manatite_ore")));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_manatite_ore"), DEEP_MANATITE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_manatite_ore"), DEEP_MANATITE_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "deep_manatite_ore")));


        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_element_115_ore"), DEEP_ELEMENT_115_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_element_115_ore"), DEEP_ELEMENT_115_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "deep_element_115_ore")));


        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "tin_ore"), TIN_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "tin_ore"), TIN_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "tin_ore")));


        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "chromite_ore"), CHROMITE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "chromite_ore"), CHROMITE_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "chromite_ore")));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_chromite_ore"), DEEP_CHROMITE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_chromite_ore"), DEEP_CHROMITE_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "deep_chromite_ore")));


        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "silver_ore"), SILVER_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "silver_ore"), SILVER_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "silver_ore")));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_silver_ore"), DEEP_SILVER_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_silver_ore"), DEEP_SILVER_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "deep_silver_ore")));


        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_uranium_ore"), DEEP_URANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "deep_uranium_ore"), DEEP_URANIUM_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "deep_uranium_ore")));


        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "nether_uranium_ore"), NETHER_URANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "nether_uranium_ore"), NETHER_URANIUM_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "nether_uranium_ore")));


        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "end_cobalt_ore"), END_COBALT_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Reborn12K.MOD_ID, "end_cobalt_ore"), END_COBALT_ORE_PLACED);
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Reborn12K.MOD_ID, "end_cobalt_ore")));

        Reborn12K.LOGGER.info("Registering Ore Generation for " + Reborn12K.MOD_ID);

    }

}
