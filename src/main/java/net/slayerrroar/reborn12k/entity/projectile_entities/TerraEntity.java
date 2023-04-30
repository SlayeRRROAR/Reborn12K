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
import net.slayerrroar.reborn12k.items.MagicItems;

public class TerraEntity extends ThrownItemEntity {
    public TerraEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public TerraEntity(World world, LivingEntity owner) {
        super(RebornProjectileEntities.TERRA_ENTITY, owner, world);
    }

    @Override
    protected Item getDefaultItem() {
        return MagicItems.TERRA_MANATITE;
    }

    private void slowTarget(EntityHitResult entityHitResult) {
        Entity entity = entityHitResult.getEntity();

        ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10, 1));
        ((LivingEntity)entity).addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*10, 4));
        world.playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.ENTITY_ALLAY_ITEM_THROWN, SoundCategory.NEUTRAL, 1f, 0f);
    }

    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        if (entity instanceof LivingEntity) {
            slowTarget(entityHitResult);
        }
    }

    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.world.isClient) {
            this.world.sendEntityStatus(this, (byte)3);
            if (hitResult.getType() != HitResult.Type.ENTITY) {
                for (Entity e : world.getOtherEntities(null, Box.of(hitResult.getPos(), 10,10,10))) {
                    if (e instanceof LivingEntity entity) {
                        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10, 0));
                        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*10, 2));
                    }
                }
                world.playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.ENTITY_ALLAY_ITEM_THROWN, SoundCategory.BLOCKS, 1f, 0f);
            }
            this.kill();
        }

    }
}