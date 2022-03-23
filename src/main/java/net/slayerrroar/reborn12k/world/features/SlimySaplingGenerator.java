package net.slayerrroar.reborn12k.world.features;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class SlimySaplingGenerator extends SaplingGenerator {

    private final ConfiguredFeature<TreeFeatureConfig, ?> feature;

    public SlimySaplingGenerator(ConfiguredFeature<?, ?> feature) {
        this.feature = (ConfiguredFeature<TreeFeatureConfig, ?>) feature;
    }

    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
        return TreeGeneration.SLIMY_TREE_FEATURE;
    }
}
