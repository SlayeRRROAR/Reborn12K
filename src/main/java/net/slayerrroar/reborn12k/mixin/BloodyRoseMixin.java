package net.slayerrroar.reborn12k.mixin;

import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.items.ItemTrinkets;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@SuppressWarnings("OptionalGetWithoutIsPresent")

@Mixin(LivingEntity.class)
public abstract class BloodyRoseMixin extends Entity {

    public BloodyRoseMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "damage", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/damage/DamageSource;getAttacker()Lnet/minecraft/entity/Entity;", shift = At.Shift.AFTER), locals = LocalCapture.CAPTURE_FAILSOFT)
    public void damage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir, float f, boolean bl, float g, boolean bl2){
        Entity attacker = source.getAttacker();
        if(TrinketsApi.getTrinketComponent((LivingEntity) ((Object) this)).get().isEquipped(ItemTrinkets.BLOODY_ROSE) && attacker != null){
            attacker.damage(DamageSource.thorns((LivingEntity) ((Object) this)), 2);
        }
    }
}
