package net.slayerrroar.reborn12k.world.generation;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.world.features.RebornPlacedFeatures;

@SuppressWarnings("ALL")
public class RebornTreeGen {

    public static void generateTrees() {

        if(!Reborn12K.CONFIG.enableCherryTreeGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                    GenerationStep.Feature.VEGETAL_DECORATION, RebornPlacedFeatures.CHERRY_PLACED_KEY);
        }
        if(!Reborn12K.CONFIG.enableAshTreeGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP),
                    GenerationStep.Feature.VEGETAL_DECORATION, RebornPlacedFeatures.SLIMY_PLACED_KEY);
        }
        if(!Reborn12K.CONFIG.enableSlimyTreeGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_TAIGA, BiomeKeys.TAIGA),
                    GenerationStep.Feature.VEGETAL_DECORATION, RebornPlacedFeatures.ASH_PLACED_KEY);
        }

    }

}