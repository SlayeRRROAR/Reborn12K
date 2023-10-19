package net.slayerrroar.reborn12k.entity.projectile_entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.entity.RebornProjectileEntities;
import net.slayerrroar.reborn12k.items.RebornItems;

public class VolcanicEntity extends ThrownItemEntity {
    public VolcanicEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public VolcanicEntity(World world, LivingEntity owner) {
        super(RebornProjectileEntities.VOLCANIC_ENTITY, owner, world);
    }

    @Override
    protected Item getDefaultItem() {
        return RebornItems.VOLCANIC_MANATITE;
    }

    private void setTargetOnFire(EntityHitResult entityHitResult) {
        Entity entity = entityHitResult.getEntity();
        entity.setOnFireFor(10);

        ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20*10, 2));
        entity.getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.ENTITY_BLAZE_SHOOT, SoundCategory.NEUTRAL, 0.75f, 1f);
    }

    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        if (entity instanceof LivingEntity) {
            setTargetOnFire(entityHitResult);
        }
    }

    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            this.getWorld().sendEntityStatus(this, (byte)3);
            if (hitResult.getType() != HitResult.Type.ENTITY) {
                for (Entity e : getWorld().getOtherEntities(null, Box.of(hitResult.getPos(), 10,10,10))) {
                    if (e instanceof LivingEntity entity) {
                        entity.setOnFireFor(5);
                        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20*20, 0));
                    }
                }
                getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.ENTITY_BLAZE_SHOOT, SoundCategory.BLOCKS, 0.75f, 1f);
            }
            this.kill();
        }

    }
}