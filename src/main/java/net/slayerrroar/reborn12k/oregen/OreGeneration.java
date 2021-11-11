package net.slayerrroar.reborn12k.oregen;

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
import net.minecraft.world.gen.feature.*;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.OreBlocks;

public class OreGeneration {

        // Overworld Ores

        public static ConfiguredFeature<?, ?> ORE_TOPAZ = Feature.ORE
        .configure(new OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                OreBlocks.TOPAZ_ORE.getDefaultState(),
                5)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(15))
        .spreadHorizontally()
        .repeat(5); // number of veins per chunk

        public static ConfiguredFeature<?, ?> ORE_OPAL = Feature.ORE
        .configure(new OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                OreBlocks.OPAL_ORE.getDefaultState(),
                5)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(15))
        .spreadHorizontally()
        .repeat(5); // number of veins per chunk

        public static ConfiguredFeature<?, ?> ORE_RUBY = Feature.ORE
        .configure(new OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                OreBlocks.RUBY_ORE.getDefaultState(),
                5)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(15))
        .spreadHorizontally()
        .repeat(5); // number of veins per chunk

        public static ConfiguredFeature<?, ?> ORE_SAPPHIRE = Feature.ORE
        .configure(new OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                OreBlocks.SAPPHIRE_ORE.getDefaultState(),
                5)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(15))
        .spreadHorizontally()
        .repeat(5); // number of veins per chunk

        public static ConfiguredFeature<?, ?> ORE_MANATITE = Feature.ORE
                .configure(new OreFeatureConfig(
                        OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                        OreBlocks.MANATITE_ORE.getDefaultState(),
                        4)) // vein size
                .uniformRange(YOffset.fixed(0), YOffset.fixed(15))
                .spreadHorizontally()
                .repeat(4); // number of veins per chunk

        public static ConfiguredFeature<?, ?> ORE_CHROMITE = Feature.ORE
        .configure(new OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                OreBlocks.CHROMITE_ORE.getDefaultState(),
                6)) // vein size
        .uniformRange(YOffset.fixed(22), YOffset.fixed(42))
        .spreadHorizontally()
        .repeat(6); // number of veins per chunk

        public static ConfiguredFeature<?, ?> ORE_TIN = Feature.ORE
        .configure(new OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                OreBlocks.TIN_ORE.getDefaultState(),
                8)) // vein size
        .uniformRange(YOffset.fixed(32), YOffset.fixed(96))
        .spreadHorizontally()
        .repeat(12); // number of veins per chunk

        public static ConfiguredFeature<?, ?> ORE_SILVER = Feature.ORE
        .configure(new OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                OreBlocks.SILVER_ORE.getDefaultState(),
                8)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(38))
        .spreadHorizontally()
        .repeat(8); // number of veins per chunk

        // Deepslate Ores (ONLY URANIUM ENABLED)

        public static ConfiguredFeature<?, ?> DEEP_ORE_TOPAZ = Feature.ORE
        .configure(new OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                OreBlocks.DEEPSLATE_TOPAZ_ORE.getDefaultState(),
                0)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(0))
        .spreadHorizontally()
        .repeat(0); // number of veins per chunk

        public static ConfiguredFeature<?, ?> DEEP_ORE_OPAL = Feature.ORE
        .configure(new OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                OreBlocks.DEEPSLATE_OPAL_ORE.getDefaultState(),
                0)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(0))
        .spreadHorizontally()
        .repeat(0); // number of veins per chunk

        public static ConfiguredFeature<?, ?> DEEP_ORE_RUBY = Feature.ORE
        .configure(new OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                OreBlocks.DEEPSLATE_RUBY_ORE.getDefaultState(),
                0)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(0))
        .spreadHorizontally()
        .repeat(0); // number of veins per chunk

        public static ConfiguredFeature<?, ?> DEEP_ORE_SAPPHIRE = Feature.ORE
        .configure(new OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                OreBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState(),
                0)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(0))
        .spreadHorizontally()
        .repeat(0); // number of veins per chunk

        public static ConfiguredFeature<?, ?> DEEP_ORE_MANATITE = Feature.ORE
                .configure(new OreFeatureConfig(
                        OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                        OreBlocks.DEEPSLATE_MANATITE_ORE.getDefaultState(),
                        3)) // vein size
                .uniformRange(YOffset.fixed(0), YOffset.fixed(15))
                .spreadHorizontally()
                .repeat(0); // number of veins per chunk

        public static ConfiguredFeature<?, ?> DEEP_ORE_URANIUM = Feature.ORE
        .configure(new OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                OreBlocks.DEEPSLATE_URANIUM_ORE.getDefaultState(),
                3)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(9))
        .spreadHorizontally()
        .repeat(2); // number of veins per chunk

        public static ConfiguredFeature<?, ?> DEEP_ORE_SILVER = Feature.ORE
        .configure(new OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                OreBlocks.DEEPSLATE_SILVER_ORE.getDefaultState(),
                0)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(0))
        .spreadHorizontally()
        .repeat(0); // number of veins per chunk

        // Nether Ores

        public static ConfiguredFeature<?, ?> NETHER_ORE_URANIUM = Feature.ORE
        .configure(new OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_NETHER,
                OreBlocks.NETHER_URANIUM_ORE.getDefaultState(),
                12)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(128))
        .spreadHorizontally()
        .repeat(16); // number of veins per chunk

        // End Ores

        public static ConfiguredFeature<?, ?> END_ORE_COBALT = Feature.ORE
    .configure(new OreFeatureConfig(
      new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
      OreBlocks.END_COBALT_ORE.getDefaultState(),
      10)) // vein size
        .uniformRange(YOffset.fixed(0), YOffset.fixed(120))
        .spreadHorizontally()
        .repeat(15); // number of veins per chunk



    
public static void register() {

        // Overworld Ores

        RegistryKey<ConfiguredFeature<?, ?>> oreTopaz = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(Reborn12K.MOD_ID, "ore_topaz"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTopaz.getValue(), ORE_TOPAZ);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTopaz);

        RegistryKey<ConfiguredFeature<?, ?>> oreOpal = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(Reborn12K.MOD_ID, "ore_opal"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreOpal.getValue(), ORE_OPAL);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreOpal);

        RegistryKey<ConfiguredFeature<?, ?>> oreRuby = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(Reborn12K.MOD_ID, "ore_ruby"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRuby.getValue(), ORE_RUBY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreRuby);

        RegistryKey<ConfiguredFeature<?, ?>> oreSapphire = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(Reborn12K.MOD_ID, "ore_sapphire"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSapphire.getValue(), ORE_SAPPHIRE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSapphire);

        RegistryKey<ConfiguredFeature<?, ?>> oreManatite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(Reborn12K.MOD_ID, "ore_manatite"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreManatite.getValue(), ORE_MANATITE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreManatite);

        RegistryKey<ConfiguredFeature<?, ?>> oreChromite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(Reborn12K.MOD_ID, "ore_chromite"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreChromite.getValue(), ORE_CHROMITE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreChromite);

        RegistryKey<ConfiguredFeature<?, ?>> oreTin = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(Reborn12K.MOD_ID, "ore_tin"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTin.getValue(), ORE_TIN);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTin);

        RegistryKey<ConfiguredFeature<?, ?>> oreSilver = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(Reborn12K.MOD_ID, "ore_silver"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSilver.getValue(), ORE_SILVER);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSilver);

        // Deepslate Ores

        RegistryKey<ConfiguredFeature<?, ?>> oreDeepTopaz = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(Reborn12K.MOD_ID, "deep_ore_topaz"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDeepTopaz.getValue(), DEEP_ORE_TOPAZ);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreDeepTopaz);

        RegistryKey<ConfiguredFeature<?, ?>> oreDeepOpal = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(Reborn12K.MOD_ID, "deep_ore_opal"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDeepOpal.getValue(), DEEP_ORE_OPAL);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreDeepOpal);

        RegistryKey<ConfiguredFeature<?, ?>> oreDeepRuby = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(Reborn12K.MOD_ID, "deep_ore_ruby"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDeepRuby.getValue(), DEEP_ORE_RUBY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreDeepRuby);

        RegistryKey<ConfiguredFeature<?, ?>> oreDeepSapphire = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(Reborn12K.MOD_ID, "deep_ore_sapphire"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDeepSapphire.getValue(), DEEP_ORE_SAPPHIRE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreDeepSapphire);

        RegistryKey<ConfiguredFeature<?, ?>> oreDeepManatite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(Reborn12K.MOD_ID, "deep_ore_manatite"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDeepManatite.getValue(), DEEP_ORE_MANATITE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreDeepManatite);

        RegistryKey<ConfiguredFeature<?, ?>> oreDeepUranium = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(Reborn12K.MOD_ID, "deep_ore_uranium"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDeepUranium.getValue(), DEEP_ORE_URANIUM);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreDeepUranium);

        RegistryKey<ConfiguredFeature<?, ?>> oreDeepSilver = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(Reborn12K.MOD_ID, "deep_ore_silver"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDeepSilver.getValue(), DEEP_ORE_SILVER);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreDeepSilver);

        // Nether Ores

        RegistryKey<ConfiguredFeature<?, ?>> oreNetherUranium = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
        new Identifier(Reborn12K.MOD_ID, "nether_ore_uranium"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreNetherUranium.getValue(), NETHER_ORE_URANIUM);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreNetherUranium);

        // End Ores

        RegistryKey<ConfiguredFeature<?, ?>> oreEndCobalt = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
        new Identifier(Reborn12K.MOD_ID, "end_ore_cobalt"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreEndCobalt.getValue(), END_ORE_COBALT);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreEndCobalt);
    
    }
}
