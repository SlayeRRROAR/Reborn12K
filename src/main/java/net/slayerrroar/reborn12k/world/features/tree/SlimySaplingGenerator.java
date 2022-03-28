package net.slayerrroar.reborn12k.world.features.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.slayerrroar.reborn12k.world.features.RebornConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class SlimySaplingGenerator extends SaplingGenerator {

    @Nullable
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return RebornConfiguredFeatures.SLIMY_TREE;
    }
}
