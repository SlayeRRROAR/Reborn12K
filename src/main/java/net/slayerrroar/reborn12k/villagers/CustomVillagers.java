package net.slayerrroar.reborn12k.villagers;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;

@SuppressWarnings("unused")

public class CustomVillagers {

    public static final PointOfInterestType DEALER_POI = registerPOI("dealerpoi", AdvancedBlocks.MARKET_TABLE);
    public static final VillagerProfession DEALER = registerProfession("dealer",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Reborn12K.MOD_ID, "dealerpoi")));

    public static final PointOfInterestType BLACKSMITH_POI = registerPOI("blacksmithpoi", AdvancedBlocks.FANCY_LAMP);
    public static final VillagerProfession BLACKSMITH = registerProfession("blacksmith",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Reborn12K.MOD_ID, "blacksmithpoi")));

    public static final PointOfInterestType HMBLE_POI = registerPOI("hmblepoi", Blocks.EMERALD_BLOCK);
    public static final VillagerProfession HMBLE = registerProfession("hmble",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Reborn12K.MOD_ID, "hmblepoi")));


    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(Reborn12K.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(Reborn12K.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_TOOLSMITH).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        Identifier id = new Identifier(Reborn12K.MOD_ID, name);
        return PointOfInterestHelper.register(id, 1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }
}





