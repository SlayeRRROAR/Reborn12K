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
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.entity.RebornProjectileEntities;
import net.slayerrroar.reborn12k.items.RebornItems;

public class SoulVesselEntity extends ThrownItemEntity {
    public SoulVesselEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public SoulVesselEntity(World world, LivingEntity owner) {
        super(RebornProjectileEntities.SOUL_VESSEL_ENTITY, owner, world);
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }

    @Override
    protected Item getDefaultItem() {
        return RebornItems.SOUL_VESSEL;
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
                entity.dropItem(RebornItems.CHICKEN_SOUL);
            }
            if (entity instanceof CowEntity && !(entity instanceof MooshroomEntity)) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.COW_SOUL);
            }
            if (entity instanceof FishEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.FISH_SOUL);
            }
            if (entity instanceof FrogEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.FROG_SOUL);
            }
            if (entity instanceof MooshroomEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.MOOSHROOM_SOUL);
            }
            if (entity instanceof PigEntity || entity instanceof HoglinEntity || entity instanceof ZoglinEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.PIG_SOUL);
            }
            if (entity instanceof RabbitEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.RABBIT_SOUL);
            }
            if (entity instanceof SheepEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.SHEEP_SOUL);
            }
            if (entity instanceof SquidEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.SQUID_SOUL);
            }

            //Neutrals


            if (entity instanceof BeeEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.BEE_SOUL);
            }
            if (entity instanceof SpiderEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.SPIDER_SOUL);
            }
            if (entity instanceof EndermanEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.ENDERMAN_SOUL);
            }

            //Hostile

            if (entity instanceof BlazeEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.BLAZE_SOUL);
            }
            if (entity instanceof CreeperEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.CREEPER_SOUL);
            }
            if (entity instanceof DrownedEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.DROWNED_SOUL);
            }
            if (entity instanceof GhastEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.GHAST_SOUL);
            }
            if (entity instanceof GuardianEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.GUARDIAN_SOUL);
            }
            if (entity instanceof IllagerEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.ILLAGER_SOUL);
            }
            if (entity instanceof MagmaCubeEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.MAGMA_CUBE_SOUL);
            }
            if (entity instanceof PhantomEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.PHANTOM_SOUL);
            }
            if (entity instanceof ShulkerEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.SHULKER_SOUL);
            }
            if (entity instanceof SkeletonEntity || entity instanceof StrayEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.SKELETON_SOUL);
            }
            if (entity instanceof SlimeEntity && !(entity instanceof MagmaCubeEntity)) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.SLIME_SOUL);
            }
            if (entity instanceof WitchEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.WITCH_SOUL);
            }
            if (entity instanceof WitherSkeletonEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.WITHER_SKELETON_SOUL);
            }
            if (entity instanceof ZombieEntity && !(entity instanceof DrownedEntity)) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(RebornItems.ZOMBIE_SOUL);
            }

            //Bosses

            if (entity instanceof EnderDragonEntity) {
                entity.dropItem(RebornItems.ENDER_DRAGON_SOUL);
            }
            if (entity instanceof WardenEntity) {
                entity.dropItem(RebornItems.WARDEN_SOUL);
            }
            if (entity instanceof WitherEntity) {
                entity.dropItem(RebornItems.WITHER_SOUL);
            }

        }
    }

    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            this.getWorld().sendEntityStatus(this, (byte)3);
            if (hitResult.getType() != HitResult.Type.ENTITY) {
                getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.BLOCK_GLASS_BREAK, SoundCategory.BLOCKS, 0.25f, 1f);
            }
            this.kill();
        }

    }
}