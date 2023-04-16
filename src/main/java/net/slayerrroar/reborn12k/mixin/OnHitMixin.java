package net.slayerrroar.reborn12k.mixin;

import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.items.ItemTrinkets;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Random;

@SuppressWarnings("OptionalGetWithoutIsPresent")

@Mixin(LivingEntity.class)
public abstract class OnHitMixin extends Entity {

    @Shadow public abstract boolean addStatusEffect(StatusEffectInstance effect);

    @Shadow private @Nullable LivingEntity attacker;

    public OnHitMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "damage", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/damage/DamageSource;getAttacker()Lnet/minecraft/entity/Entity;", shift = At.Shift.AFTER), locals = LocalCapture.CAPTURE_FAILSOFT)
    public void damage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir, float f, boolean bl, float g, boolean bl2) {
        Entity attacker = source.getAttacker();

        Random rand = new Random();
        int upperbound = 4;
        int int_random = rand.nextInt(upperbound);

        if(TrinketsApi.getTrinketComponent((LivingEntity) ((Object) this)).get().isEquipped(ItemTrinkets.BLOODY_ROSE) && attacker != null && !(attacker instanceof PlayerEntity)) {
            attacker.damage(DamageSource.thorns((LivingEntity) ((Object) this)), 2);
        }
        if(TrinketsApi.getTrinketComponent((LivingEntity) ((Object) this)).get().isEquipped(ItemTrinkets.BOTTLE_OF_WIND) && attacker != null && !(attacker instanceof PlayerEntity)) {
            ((LivingEntity) attacker).addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 20 * 5, 0));
        }
        if(TrinketsApi.getTrinketComponent((LivingEntity) ((Object) this)).get().isEquipped(ItemTrinkets.NIGHTSHADE) && attacker != null && !(attacker instanceof PlayerEntity)) {
            ((LivingEntity) attacker).addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 20 * 7, 1));
        }
        if(TrinketsApi.getTrinketComponent((LivingEntity) ((Object) this)).get().isEquipped(ItemTrinkets.FLASK_OF_UNDERTOW) && attacker != null && !(attacker instanceof PlayerEntity)) {
            ((LivingEntity) attacker).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 7, 1));
        }
        if(TrinketsApi.getTrinketComponent((LivingEntity) ((Object) this)).get().isEquipped(ItemTrinkets.CRYSTALIZED_FIRE) && attacker != null && !(attacker instanceof PlayerEntity)) {
            attacker.setOnFireFor(4 + int_random);
        }
        if(TrinketsApi.getTrinketComponent((LivingEntity) ((Object) this)).get().isEquipped(ItemTrinkets.PRAYER_CANDLE) && attacker != null && !(attacker instanceof PlayerEntity)) {
            ((LivingEntity) attacker).addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20 * 7, 1));
        }
        if(TrinketsApi.getTrinketComponent((LivingEntity) ((Object) this)).get().isEquipped(ItemTrinkets.ESSENCE_OF_DECAY) && attacker != null && !(attacker instanceof PlayerEntity)) {
            ((LivingEntity) attacker).addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20 * 5, 1));
        }
    }
}
