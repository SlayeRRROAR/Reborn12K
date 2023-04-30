package net.slayerrroar.reborn12k.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.entity.projectile_entities.*;

public class RebornProjectileEntities {

    public static EntityType<SoulVesselEntity> SOUL_VESSEL_ENTITY;

    public static EntityType<VolcanicEntity> VOLCANIC_ENTITY;
    public static EntityType<ThunderboltEntity> THUNDERBOLT_ENTITY;
    public static EntityType<TerraEntity> TERRA_ENTITY;
    public static EntityType<GlacialEntity> GLACIAL_ENTITY;
    public static EntityType<CrimsonEntity> CRIMSON_ENTITY;


    public static void register() {

        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Projectile Entities");

        SOUL_VESSEL_ENTITY =  Registry.register(Registries.ENTITY_TYPE, new Identifier(Reborn12K.MOD_ID, "soul_vessel"), FabricEntityTypeBuilder
                .<SoulVesselEntity>create(SpawnGroup.MISC, SoulVesselEntity::new).dimensions(EntityDimensions.fixed(0.25f, 0.25f))
                .trackRangeBlocks(4).trackedUpdateRate(10).build());


        VOLCANIC_ENTITY =  Registry.register(Registries.ENTITY_TYPE, new Identifier(Reborn12K.MOD_ID, "volcanic_entity"), FabricEntityTypeBuilder
                .<VolcanicEntity>create(SpawnGroup.MISC, VolcanicEntity::new).dimensions(EntityDimensions.fixed(1f, 1f))
                .trackRangeBlocks(4).trackedUpdateRate(10).build());

        THUNDERBOLT_ENTITY =  Registry.register(Registries.ENTITY_TYPE, new Identifier(Reborn12K.MOD_ID, "thunderbolt_entity"), FabricEntityTypeBuilder
                .<ThunderboltEntity>create(SpawnGroup.MISC, ThunderboltEntity::new).dimensions(EntityDimensions.fixed(1f, 1f))
                .trackRangeBlocks(4).trackedUpdateRate(10).build());

        TERRA_ENTITY =  Registry.register(Registries.ENTITY_TYPE, new Identifier(Reborn12K.MOD_ID, "terra_entity"), FabricEntityTypeBuilder
                .<TerraEntity>create(SpawnGroup.MISC, TerraEntity::new).dimensions(EntityDimensions.fixed(1f, 1f))
                .trackRangeBlocks(4).trackedUpdateRate(10).build());

        GLACIAL_ENTITY =  Registry.register(Registries.ENTITY_TYPE, new Identifier(Reborn12K.MOD_ID, "glacial_entity"), FabricEntityTypeBuilder
                .<GlacialEntity>create(SpawnGroup.MISC, GlacialEntity::new).dimensions(EntityDimensions.fixed(1f, 1f))
                .trackRangeBlocks(4).trackedUpdateRate(10).build());

        CRIMSON_ENTITY =  Registry.register(Registries.ENTITY_TYPE, new Identifier(Reborn12K.MOD_ID, "crimson_entity"), FabricEntityTypeBuilder
                .<CrimsonEntity>create(SpawnGroup.MISC, CrimsonEntity::new).dimensions(EntityDimensions.fixed(1f, 1f))
                .trackRangeBlocks(4).trackedUpdateRate(10).build());

    }

}
