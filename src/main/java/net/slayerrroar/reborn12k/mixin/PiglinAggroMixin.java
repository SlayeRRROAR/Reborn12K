package net.slayerrroar.reborn12k.mixin;

import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.slayerrroar.reborn12k.items.ItemTrinkets;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@SuppressWarnings("OptionalGetWithoutIsPresent")
@Mixin(PiglinBrain.class)
public class PiglinAggroMixin {

        @Inject(method = "wearsGoldArmor", at = @At("HEAD"), cancellable = true)
        private static void wearsGoldArmor(LivingEntity entity, CallbackInfoReturnable<Boolean> ci) {
            if(TrinketsApi.getTrinketComponent(entity).get().isEquipped(ItemTrinkets.GOLD_POUCH)) ci.setReturnValue(true);
        }

}
