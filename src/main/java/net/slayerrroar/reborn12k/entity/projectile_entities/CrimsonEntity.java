package net.slayerrroar.reborn12k.entity.projectile_entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.entity.RebornProjectileEntities;
import net.slayerrroar.reborn12k.items.MagicItems;

public class CrimsonEntity extends ThrownItemEntity {
    public CrimsonEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public CrimsonEntity(World world, LivingEntity owner) {
        super(RebornProjectileEntities.CRIMSON_ENTITY, owner, world);
    }

    @Override
    protected Item getDefaultItem() {
        return MagicItems.CRIMSON_MANATITE;
    }

    private void explode(EntityHitResult entityHitResult) {
        World world = entityHitResult.getEntity().getWorld();
        Vec3d pos = entityHitResult.getEntity().getPos();

        world.createExplosion(this.getOwner(), pos.getX(), pos.getY(), pos.getZ(), 6f, false, World.ExplosionSourceType.NONE);
    }

    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        if (entity instanceof LivingEntity) {
            explode(entityHitResult);
        }
    }

    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            this.getWorld().sendEntityStatus(this, (byte)3);
            if (hitResult.getType() != HitResult.Type.ENTITY) {
                Vec3d pos = hitResult.getPos();

                getWorld().createExplosion(this.getOwner(), pos.getX(), pos.getY(), pos.getZ(), 3f, false, World.ExplosionSourceType.NONE);
            }
            this.kill();
        }

    }
}