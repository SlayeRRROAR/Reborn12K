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
import net.slayerrroar.reborn12k.entity.CustomProjectileEntities;
import net.slayerrroar.reborn12k.items.ItemMagic;

public class SoulThingmabobEntity extends ThrownItemEntity {
    public SoulThingmabobEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public SoulThingmabobEntity(World world, LivingEntity owner) {
        super(CustomProjectileEntities.SOUL_THINGMABOB_ENTITY, owner, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ItemMagic.SOUL_THINGMABOB;
    }

    private void removeAndPlaySound(EntityHitResult entityHitResult) {
        Entity entity = entityHitResult.getEntity();
        entity.remove(RemovalReason.DISCARDED);
        world.playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.NEUTRAL, 0.25f, 0.25f);
    }

    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        if(entity instanceof LivingEntity && !(entity instanceof PlayerEntity)) {

            //Passive

            if(entity instanceof ChickenEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.CHICKEN_SOUL);
            }
            if(entity instanceof CowEntity && !(entity instanceof MooshroomEntity)) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.COW_SOUL);
            }
            if(entity instanceof FishEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.FISH_SOUL);
            }
            if(entity instanceof MooshroomEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.MOOSHROOM_SOUL);
            }
            if(entity instanceof PigEntity || entity instanceof HoglinEntity || entity instanceof ZoglinEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.PIG_SOUL);
            }
            if(entity instanceof RabbitEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.RABBIT_SOUL);
            }
            if(entity instanceof SheepEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.SHEEP_SOUL);
            }
            if(entity instanceof SquidEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.SQUID_SOUL);
            }

            //Neutrals


            if(entity instanceof BeeEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.BEE_SOUL);
            }
            if(entity instanceof SpiderEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.SPIDER_SOUL);
            }
            if(entity instanceof EndermanEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.ENDERMAN_SOUL);
            }

            //Hostile

            if(entity instanceof BlazeEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.BLAZE_SOUL);
            }
            if(entity instanceof CreeperEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.CREEPER_SOUL);
            }
            if(entity instanceof DrownedEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.DROWNED_SOUL);
            }
            if(entity instanceof GhastEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.GHAST_SOUL);
            }
            if(entity instanceof GuardianEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.GUARDIAN_SOUL);
            }
            if(entity instanceof IllagerEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.ILLAGER_SOUL);
            }
            if(entity instanceof MagmaCubeEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.MAGMA_CUBE_SOUL);
            }
            if(entity instanceof PhantomEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.PHANTOM_SOUL);
            }
            if(entity instanceof ShulkerEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.SHULKER_SOUL);
            }
            if(entity instanceof SkeletonEntity || entity instanceof StrayEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.SKELETON_SOUL);
            }
            if(entity instanceof SlimeEntity && !(entity instanceof MagmaCubeEntity)) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.SLIME_SOUL);
            }
            if(entity instanceof WitchEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.WITCH_SOUL);
            }
            if(entity instanceof WitherSkeletonEntity) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.WITHER_SKELETON_SOUL);
            }
            if(entity instanceof ZombieEntity && !(entity instanceof DrownedEntity)) {
                removeAndPlaySound(entityHitResult);
                entity.dropItem(ItemMagic.ZOMBIE_SOUL);
            }

            //Bosses

            if(entity instanceof EnderDragonEntity) {
                entity.dropItem(ItemMagic.ENDER_DRAGON_SOUL);
            }
            if(entity instanceof WardenEntity) {
                entity.dropItem(ItemMagic.WARDEN_SOUL);
            }
            if(entity instanceof WitherEntity) {
                entity.dropItem(ItemMagic.WITHER_SOUL);
            }

        }
    }

    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if(!this.world.isClient) {
            this.world.sendEntityStatus(this, (byte)3);
            if(hitResult.getType() != HitResult.Type.ENTITY) {
                world.playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.BLOCK_GLASS_BREAK, SoundCategory.BLOCKS, 0.25f, 0.25f);
            }
            this.kill();
        }

    }
}