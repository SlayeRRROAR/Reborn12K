package net.slayerrroar.reborn12k.entity.projectile;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.items.AdvancedItems;
import net.slayerrroar.reborn12k.statuses.CustomStatusEffects;

import java.util.Random;


public class RunicSnareEntity extends ThrownItemEntity {
    public RunicSnareEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public RunicSnareEntity(World world, LivingEntity attacker) {
        super(EntityType.SNOWBALL, attacker, world);
    }

    public RunicSnareEntity(World world, double x, double y, double z) {
        super(EntityType.SNOWBALL, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return AdvancedItems.RUNIC_SNARE;
    }

    @Environment(EnvType.CLIENT)
    private ParticleEffect getParticleParameters() {
        ItemStack itemStack = this.getItem();
        return itemStack.isEmpty() ? ParticleTypes.ITEM_SNOWBALL : new ItemStackParticleEffect(ParticleTypes.ITEM, itemStack);
    }

    @Override
    public void handleStatus(byte b) {
        if (b == 3) {
            ParticleEffect particleEffect = this.getParticleParameters();
            for (int i = 0; i < 8; ++i) {
                this.world.addParticle(particleEffect, this.getX(), this.getY(), this.getZ(), 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = 0;
        Random rand = new Random();
        int upperbound = 10;
        int int_random = rand.nextInt(upperbound);
        Random rand2 = new Random();
        int upperbound2 = 5;
        int int_random2 = rand2.nextInt(upperbound2);
        entity.damage(DamageSource.thrownProjectile(this, this.getOwner()), i);
        if (entity instanceof LivingEntity livingEntity && int_random2==0) {
            livingEntity.addStatusEffect((new StatusEffectInstance(CustomStatusEffects.FRAIL, (10 + int_random)*20, 0)));
        }
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.world.isClient) {
            this.world.sendEntityStatus(this, (byte)3);
            this.discard();
        }
    }
}