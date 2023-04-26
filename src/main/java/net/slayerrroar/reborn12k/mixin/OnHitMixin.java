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
import net.slayerrroar.reborn12k.items.TrinketItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Random;

@SuppressWarnings({"OptionalGetWithoutIsPresent", "Unused"})

@Mixin(LivingEntity.class)
public abstract class OnHitMixin extends Entity {

    @Shadow public abstract boolean addStatusEffect(StatusEffectInstance effect);

    public OnHitMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "damage", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/damage/DamageSource;getAttacker()Lnet/minecraft/entity/Entity;", shift = At.Shift.AFTER), locals = LocalCapture.CAPTURE_FAILSOFT)
    public void damage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir, float f, boolean bl, float g, boolean bl2) {
        Entity attacker = source.getAttacker();

        Random rand = new Random();
        int upperbound = 4;
        int int_random = rand.nextInt(upperbound);

        if (TrinketsApi.getTrinketComponent((LivingEntity) ((Object) this)).get().isEquipped(TrinketItems.BLOODY_ROSE) && attacker != null && !(attacker instanceof PlayerEntity)) {
            attacker.damage(((LivingEntity) ((Object) this)).getDamageSources().thorns(attacker), 2);
        }
        if (TrinketsApi.getTrinketComponent((LivingEntity) ((Object) this)).get().isEquipped(TrinketItems.GRIFFIN_FEATHER) && attacker != null && !(attacker instanceof PlayerEntity)) {
            ((LivingEntity) attacker).addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 20 * 5, 0));
        }
        if (TrinketsApi.getTrinketComponent((LivingEntity) ((Object) this)).get().isEquipped(TrinketItems.DEADLY_NIGHTSHADE) && attacker != null && !(attacker instanceof PlayerEntity)) {
            ((LivingEntity) attacker).addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 20 * 7, 0));
        }
        if (TrinketsApi.getTrinketComponent((LivingEntity) ((Object) this)).get().isEquipped(TrinketItems.LEVIATHAN_EYE) && attacker != null && !(attacker instanceof PlayerEntity)) {
            ((LivingEntity) attacker).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 7, 0));
        }
        if (TrinketsApi.getTrinketComponent((LivingEntity) ((Object) this)).get().isEquipped(TrinketItems.CRYSTALIZED_FIRE) && attacker != null && !(attacker instanceof PlayerEntity)) {
            attacker.setOnFireFor(4 + int_random);
        }
        if (TrinketsApi.getTrinketComponent((LivingEntity) ((Object) this)).get().isEquipped(TrinketItems.PRAYER_CANDLE) && attacker != null && !(attacker instanceof PlayerEntity)) {
            ((LivingEntity) attacker).addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20 * 7, 0));
        }
        if (TrinketsApi.getTrinketComponent((LivingEntity) ((Object) this)).get().isEquipped(TrinketItems.BASILISK_FANG) && attacker != null && !(attacker instanceof PlayerEntity)) {
            ((LivingEntity) attacker).addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20 * 5, 0));
        }
    }
}
