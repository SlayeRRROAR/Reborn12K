package net.slayerrroar.reborn12k.world.features;

import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.BaseBlocks;

import java.util.function.BiConsumer;

public class TreeGeneration {
    public static ConfiguredFeature<TreeFeatureConfig, ?> CHERRY_TREE_FEATURE;
    public static PlacedFeature CHERRY_TREE_PLACED_FEATURE;

    public static ConfiguredFeature<RandomPatchFeatureConfig, ?> CHERRY_TREE_PATCH_FEATURE;
    public static PlacedFeature CHERRY_TREE_PATCH_PLACED_FEATURE;

    public static void register() {
        registerTreeDecorators();

        BiomeModifications.create(new Identifier(Reborn12K.MOD_ID, "features"))
                .add(ModificationPhase.ADDITIONS, BiomeSelectors.categories(Biome.Category.FOREST), cherryTreeModifier());
    }

    private static void registerTreeDecorators() {
        Identifier treeId = new Identifier(Reborn12K.MOD_ID, "cherry_tree");
        Identifier patchId = new Identifier(Reborn12K.MOD_ID, "cherry_tree_patch");

        CHERRY_TREE_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, treeId,
                Feature.TREE.configure(cherry().build())
        );
        CHERRY_TREE_PLACED_FEATURE = Registry.register(BuiltinRegistries.PLACED_FEATURE, treeId,
                CHERRY_TREE_FEATURE.withWouldSurviveFilter(BaseBlocks.CHERRY_SAPLING)
        );

        CHERRY_TREE_PATCH_FEATURE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, patchId,
                Feature.RANDOM_PATCH.configure(
                        ConfiguredFeatures.createRandomPatchFeatureConfig(6, CHERRY_TREE_PLACED_FEATURE)
                )
        );

        CHERRY_TREE_PATCH_PLACED_FEATURE = Registry.register(BuiltinRegistries.PLACED_FEATURE, patchId,
                CHERRY_TREE_PATCH_FEATURE.withPlacement(
                        RarityFilterPlacementModifier.of(3),
                        SquarePlacementModifier.of(),
                        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                        BiomePlacementModifier.of()
                )
        );
    }

    private static BiConsumer<BiomeSelectionContext, BiomeModificationContext> cherryTreeModifier() {

        final RegistryKey<PlacedFeature> registryKey = BuiltinRegistries.PLACED_FEATURE.getKey(CHERRY_TREE_PATCH_PLACED_FEATURE).orElseThrow();

        return (biomeSelectionContext, biomeModificationContext) ->
                biomeModificationContext.getGenerationSettings().addFeature(GenerationStep.Feature.VEGETAL_DECORATION, registryKey);
    }

    private static TreeFeatureConfig.Builder cherry() {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BaseBlocks.CHERRY_LOG.getDefaultState()),
                new StraightTrunkPlacer(5, 2, 1),
                BlockStateProvider.of(BaseBlocks.CHERRY_LEAVES.getDefaultState()),
                new BlobFoliagePlacer(
                        ConstantIntProvider.create(3),
                        ConstantIntProvider.create(0),
                        3
                ),
                new TwoLayersFeatureSize(
                        1,
                        0,
                        2)
        );
    }
}
