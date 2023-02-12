package net.slayerrroar.reborn12k.world.features.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.slayerrroar.reborn12k.world.features.RebornConfiguredFeatures;

public class CherrySaplingGenerator extends SaplingGenerator {

    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return RebornConfiguredFeatures.CHERRY_KEY;
    }
}