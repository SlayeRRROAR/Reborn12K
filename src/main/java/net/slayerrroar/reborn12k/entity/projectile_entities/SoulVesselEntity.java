package net.slayerrroar.reborn12k.entity.projectile_entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.entity.RebornProjectileEntities;
import net.slayerrroar.reborn12k.items.MagicItems;

public class SoulVesselEntity extends ThrownItemEntity {
    public SoulVesselEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public SoulVesselEntity(World world, LivingEntity owner) {
        super(RebornProjectileEntities.SOUL_VESSEL_ENTITY, owner, world);
    }

    @Override
    protected Item getDefaultItem() {
        return MagicItems.SOUL_VESSEL;
    }

    private void removeAndPlaySound(EntityHitResult entityHitResult) {
        Entity entity = entityHitResult.getEntity();
        entity.remove(RemovalReason.DISCARDED);
        entity.getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.NEUTRAL, 0.25f, 0.25f);
    }

    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        if (entity instanceof LivingEntity && !(entity instanceof PlayerEntity)) {

            //Passive

            if (entity instanceof ChickenEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.CHICKEN_SOUL);
            }
            if (entity instanceof CowEntity && !(entity instanceof MooshroomEntity)) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.COW_SOUL);
            }
            if (entity instanceof FishEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.FISH_SOUL);
            }
            if (entity instanceof MooshroomEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.MOOSHROOM_SOUL);
            }
            if (entity instanceof PigEntity || entity instanceof HoglinEntity || entity instanceof ZoglinEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.PIG_SOUL);
            }
            if (entity instanceof RabbitEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.RABBIT_SOUL);
            }
            if (entity instanceof SheepEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.SHEEP_SOUL);
            }
            if (entity instanceof SquidEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.SQUID_SOUL);
            }

            //Neutrals


            if (entity instanceof BeeEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.BEE_SOUL);
            }
            if (entity instanceof SpiderEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.SPIDER_SOUL);
            }
            if (entity instanceof EndermanEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.ENDERMAN_SOUL);
            }

            //Hostile

            if (entity instanceof BlazeEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.BLAZE_SOUL);
            }
            if (entity instanceof CreeperEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.CREEPER_SOUL);
            }
            if (entity instanceof DrownedEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.DROWNED_SOUL);
            }
            if (entity instanceof GhastEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.GHAST_SOUL);
            }
            if (entity instanceof GuardianEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.GUARDIAN_SOUL);
            }
            if (entity instanceof IllagerEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.ILLAGER_SOUL);
            }
            if (entity instanceof MagmaCubeEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.MAGMA_CUBE_SOUL);
            }
            if (entity instanceof PhantomEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.PHANTOM_SOUL);
            }
            if (entity instanceof ShulkerEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.SHULKER_SOUL);
            }
            if (entity instanceof SkeletonEntity || entity instanceof StrayEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.SKELETON_SOUL);
            }
            if (entity instanceof SlimeEntity && !(entity instanceof MagmaCubeEntity)) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.SLIME_SOUL);
            }
            if (entity instanceof WitchEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.WITCH_SOUL);
            }
            if (entity instanceof WitherSkeletonEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.WITHER_SKELETON_SOUL);
            }
            if (entity instanceof ZombieEntity && !(entity instanceof DrownedEntity)) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(MagicItems.ZOMBIE_SOUL);
            }

            //Bosses

            if (entity instanceof EnderDragonEntity) {
                entity.dropItem(MagicItems.ENDER_DRAGON_SOUL);
            }
            if (entity instanceof WardenEntity) {
                entity.dropItem(MagicItems.WARDEN_SOUL);
            }
            if (entity instanceof WitherEntity) {
                entity.dropItem(MagicItems.WITHER_SOUL);
            }

        }
    }

    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            this.getWorld().sendEntityStatus(this, (byte)3);
            if (hitResult.getType() != HitResult.Type.ENTITY) {
                getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.BLOCK_GLASS_BREAK, SoundCategory.BLOCKS, 0.25f, 0f);
            }
            this.kill();
        }

    }
}