package net.slayerrroar.reborn12k;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.slayerrroar.reborn12k.datagen.CustomLootTableGen;
import net.slayerrroar.reborn12k.datagen.CustomModelProvider;
import net.slayerrroar.reborn12k.datagen.CustomWorldGen;
import net.slayerrroar.reborn12k.world.features.RebornConfiguredFeatures;
import net.slayerrroar.reborn12k.world.features.RebornPlacedFeatures;

public class Reborn12KDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(CustomLootTableGen::new);
        pack.addProvider(CustomModelProvider::new);
        pack.addProvider(CustomWorldGen::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, RebornConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, RebornPlacedFeatures::bootstrap);
    }
}