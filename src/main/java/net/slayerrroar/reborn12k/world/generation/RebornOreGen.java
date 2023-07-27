package net.slayerrroar.reborn12k.world.generation;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.world.features.RebornPlacedFeatures;

public class RebornOreGen {
    public static void generateOres() {

        if (Reborn12K.CONFIG.enableOverworldGeneration) {

            if (Reborn12K.CONFIG.enableTinOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.TIN_ORE_PLACED_KEY);
            }
            if (Reborn12K.CONFIG.enableAluminumOreGeneration){
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.ALUMINUM_ORE_PLACED_KEY);
            }
            if (Reborn12K.CONFIG.enableSilverOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.SILVER_ORE_PLACED_KEY);
            }
            if (Reborn12K.CONFIG.enableLeadOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.LEAD_ORE_PLACED_KEY);
            }
            if (Reborn12K.CONFIG.enableNickelOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.NICKEL_ORE_PLACED_KEY);
            }
            if (Reborn12K.CONFIG.enableChromiteOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.CHROMITE_ORE_PLACED_KEY);
            }
            if (Reborn12K.CONFIG.enableTitaniumOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.TITANIUM_ORE_PLACED_KEY);
            }
            if (Reborn12K.CONFIG.enableSapphireOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY);
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.SAPPHIRE_ORE_LARGE_PLACED_KEY);
            }
            if (Reborn12K.CONFIG.enableRubyOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.RUBY_ORE_PLACED_KEY);
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.RUBY_ORE_LARGE_PLACED_KEY);
            }
            if (Reborn12K.CONFIG.enableManatiteOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.MANATITE_ORE_PLACED_KEY);
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.MANATITE_ORE_LARGE_PLACED_KEY);
            }
        }

        if (Reborn12K.CONFIG.enableNetherGeneration) {

            if (Reborn12K.CONFIG.enableTungstenOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.NETHER_TUNGSTEN_ORE_PLACED_KEY);
            }
            if (Reborn12K.CONFIG.enableVanadiumOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.NETHER_VANADIUM_ORE_PLACED_KEY);
            }
            if (Reborn12K.CONFIG.enableNeodymiumOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.NETHER_NEODYMIUM_ORE_PLACED_KEY);
            }
            if (Reborn12K.CONFIG.enableUraniumOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.NETHER_URANIUM_ORE_PLACED_KEY);
            }
        }

        if (Reborn12K.CONFIG.enableEndGeneration) {

            if (Reborn12K.CONFIG.enableCobaltOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.END_COBALT_ORE_PLACED_KEY);
            }
            if (Reborn12K.CONFIG.enableOsmiumOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.END_OSMIUM_ORE_PLACED_KEY);
            }
            if (Reborn12K.CONFIG.enablePlatinumOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.END_PLATINUM_ORE_PLACED_KEY);
            }
            if (Reborn12K.CONFIG.enableIridiumOreGeneration) {
                BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                        GenerationStep.Feature.UNDERGROUND_ORES, RebornPlacedFeatures.END_IRIDIUM_ORE_PLACED_KEY);
            }
        }

    }

}
