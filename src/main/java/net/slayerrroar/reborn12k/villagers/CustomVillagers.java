package net.slayerrroar.reborn12k.villagers;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.mixin.object.builder.PointOfInterestTypeAccessor;
import net.fabricmc.fabric.mixin.object.builder.VillagerProfessionAccessor;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;

public class CustomVillagers {

    public static final PointOfInterestType DEALER_POI = registerPOI("dealerpoi", AdvancedBlocks.MARKET_TABLE);
    public static final VillagerProfession DEALER = registerProfession("dealer", DEALER_POI);

    public static final PointOfInterestType BLACKSMITH_POI = registerPOI("blacksmithpoi", Blocks.ANVIL);
    public static final VillagerProfession BLACKSMITH = registerProfession("blacksmith", BLACKSMITH_POI);


    public static VillagerProfession registerProfession(String name, PointOfInterestType type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(Reborn12K.MOD_ID, name),
                VillagerProfessionAccessor.create(name, type, ImmutableSet.of(), ImmutableSet.of(),
                        SoundEvents.ENTITY_VILLAGER_WORK_TOOLSMITH));
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return Registry.register(Registry.POINT_OF_INTEREST_TYPE, new Identifier(Reborn12K.MOD_ID, name),
                PointOfInterestTypeAccessor.callCreate(name,
                        ImmutableSet.copyOf(block.getStateManager().getStates()), 1, 1));
    }

    public static void register() {

        PointOfInterestTypeAccessor.callSetup(DEALER_POI);
        PointOfInterestTypeAccessor.callSetup(BLACKSMITH_POI);

    }
}
