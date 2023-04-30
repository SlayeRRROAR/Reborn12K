package net.slayerrroar.reborn12k.villagers;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;

@SuppressWarnings({"deprecation", "unused"})

public class RebornVillagers {

    public static final PointOfInterestType JEWELER_POI = registerPOI("jewelerpoi", AdvancedBlocks.MARKET_TABLE);
    public static final VillagerProfession JEWELER = registerProfession("jeweler",
            RegistryKey.of(Registries.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(Reborn12K.MOD_ID, "jewelerpoi")));

    public static final PointOfInterestType BLACKSMITH_POI = registerPOI("blacksmithpoi", AdvancedBlocks.MELTER);
    public static final VillagerProfession BLACKSMITH = registerProfession("blacksmith",
            RegistryKey.of(Registries.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(Reborn12K.MOD_ID, "blacksmithpoi")));

    public static final PointOfInterestType MANASMITH_POI = registerPOI("manasmithpoi", AdvancedBlocks.ALCHEMIC_TABLE);
    public static final VillagerProfession MANASMITH = registerProfession("manasmith",
            RegistryKey.of(Registries.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(Reborn12K.MOD_ID, "manasmithpoi")));

    public static final PointOfInterestType HOARDER_POI = registerPOI("hoarderpoi", Blocks.EMERALD_BLOCK);
    public static final VillagerProfession HOARDER = registerProfession("hoarder",
            RegistryKey.of(Registries.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(Reborn12K.MOD_ID, "hoarderpoi")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(Reborn12K.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(Reborn12K.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_TOOLSMITH).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        Identifier id = new Identifier(Reborn12K.MOD_ID, name);
        return PointOfInterestHelper.register(id, 1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

}





