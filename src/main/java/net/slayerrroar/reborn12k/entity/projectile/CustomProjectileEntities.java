package net.slayerrroar.reborn12k.entity.projectile;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;

public class CustomProjectileEntities {

    public static void register() {

        EntityType<RunicSnareEntity> RunicSnareEntity = Registry.register(
                Registry.ENTITY_TYPE, new Identifier(Reborn12K.MOD_ID, "runic_snare"),
                FabricEntityTypeBuilder.<RunicSnareEntity>create(SpawnGroup.MISC, RunicSnareEntity::new)
                        .dimensions(EntityDimensions.fixed(0.25f, 0.25f))
                        .trackRangeBlocks(4).trackedUpdateRate(10)
                        .build());

    }

}
