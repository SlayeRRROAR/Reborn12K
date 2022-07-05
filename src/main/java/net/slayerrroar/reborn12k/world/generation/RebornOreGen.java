package net.slayerrroar.reborn12k.world.generation;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.slayerrroar.reborn12k.world.features.RebornPlacedFeatures;

@SuppressWarnings("OptionalGetWithoutIsPresent")

public class RebornOreGen {
    public static void generateOres() {

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.TOPAZ_ORE_SMALL_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.TOPAZ_ORE_LARGE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.OPAL_ORE_SMALL_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.OPAL_ORE_LARGE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.RUBY_ORE_SMALL_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.RUBY_ORE_LARGE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.SAPPHIRE_ORE_SMALL_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.SAPPHIRE_ORE_LARGE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.MANATITE_ORE_SMALL_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.MANATITE_ORE_LARGE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.E115_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.TIN_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.CHROMITE_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.SILVER_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.NETHER_CHROMITE_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.END_COBALT_ORE_PLACED.getKey().get());

    }
}
