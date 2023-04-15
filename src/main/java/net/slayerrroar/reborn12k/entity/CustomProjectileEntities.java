package net.slayerrroar.reborn12k.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.entity.projectile_entities.SoulVesselEntity;

public class CustomProjectileEntities {

    public static EntityType<SoulVesselEntity> SOUL_VESSEL_ENTITY;


    public static void register() {

        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Projectile Entities");

        SOUL_VESSEL_ENTITY =  Registry.register(Registries.ENTITY_TYPE, new Identifier(Reborn12K.MOD_ID, "soul_vessel"), FabricEntityTypeBuilder
                .<SoulVesselEntity>create(SpawnGroup.MISC, SoulVesselEntity::new).dimensions(EntityDimensions.fixed(0.25F, 0.25F))
                .trackRangeBlocks(4).trackedUpdateRate(10).build());

    }

}
