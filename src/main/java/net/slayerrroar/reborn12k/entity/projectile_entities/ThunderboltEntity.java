package net.slayerrroar.reborn12k.entity.projectile_entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.entity.RebornProjectileEntities;
import net.slayerrroar.reborn12k.items.RebornItems;

public class ThunderboltEntity extends ThrownItemEntity {
    public ThunderboltEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public ThunderboltEntity(World world, LivingEntity owner) {
        super(RebornProjectileEntities.THUNDERBOLT_ENTITY, owner, world);
    }

    @Override
    protected Item getDefaultItem() {
        return RebornItems.THUNDERBOLT_MANATITE;
    }

    private void summonLightning(EntityHitResult entityHitResult) {
        World world = entityHitResult.getEntity().getWorld();
        Vec3d entity = entityHitResult.getEntity().getPos();

        LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(world);
        assert lightningEntity != null;

        lightningEntity.refreshPositionAfterTeleport(entity.getX(), entity.getY(), entity.getZ());
        world.spawnEntity(lightningEntity);
    }

    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        if (entity instanceof LivingEntity) {
            summonLightning(entityHitResult);
        }
    }

    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            this.getWorld().sendEntityStatus(this, (byte)3);
            if (hitResult.getType() != HitResult.Type.ENTITY) {
                Vec3d pos = hitResult.getPos();

                LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(getWorld());
                assert lightningEntity != null;

                lightningEntity.refreshPositionAfterTeleport(pos.getX(), pos.getY(), pos.getZ());
                getWorld().spawnEntity(lightningEntity);
            }
            this.kill();
        }

    }
}