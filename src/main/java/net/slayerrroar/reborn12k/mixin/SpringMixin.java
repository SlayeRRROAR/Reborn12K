package net.slayerrroar.reborn12k.mixin;

import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.slayerrroar.reborn12k.items.ItemTrinkets;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@SuppressWarnings("OptionalGetWithoutIsPresent")

@Mixin(EnchantmentHelper.class)
public abstract class SpringMixin {

    @Inject(method = "getKnockback", at = @At("RETURN"), cancellable = true)
    private static void getKnockback(LivingEntity entity, CallbackInfoReturnable<Integer> cir) {

        if(TrinketsApi.getTrinketComponent(entity).get().isEquipped(ItemTrinkets.WEAK_SPRING)) {
            cir.setReturnValue(Math.max(cir.getReturnValueI() + 1, 0));
        }
        if(TrinketsApi.getTrinketComponent(entity).get().isEquipped(ItemTrinkets.STRONG_SPRING)) {
            cir.setReturnValue(Math.max(cir.getReturnValueI() + 2, 0));
        }
        if(TrinketsApi.getTrinketComponent(entity).get().isEquipped(ItemTrinkets.ENCHANTED_SPRING)) {
            cir.setReturnValue(Math.max(cir.getReturnValueI() + 3, 0));
        }

    }
}