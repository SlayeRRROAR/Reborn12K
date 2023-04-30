package net.slayerrroar.reborn12k.mixin;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Pair;
import net.slayerrroar.reborn12k.items.TrinketItems;
import net.slayerrroar.reborn12k.items.custom.trinkets.trinket.PhoenixPlume;
import net.slayerrroar.reborn12k.util.TotemRenderUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(LivingEntity.class)
public class PhoenixPlumeMixin {

    @Inject(at = @At("HEAD"), method = "tryUseTotem", cancellable = true)
    private void tryUseTotem(DamageSource source, CallbackInfoReturnable<Boolean> info) {
        LivingEntity entity = (LivingEntity) (Object) this;
        if (entity instanceof ServerPlayerEntity player) {
            ItemStack stack = null;
            if (TrinketsApi.getTrinketComponent(player).isPresent()) {
                List<Pair<SlotReference, ItemStack>> hasPlume = TrinketsApi.getTrinketComponent(player).get().getEquipped(TrinketItems.PHOENIX_PLUME);
                if (hasPlume.size() > 0) stack = hasPlume.get(0).getRight();
            }
            if (stack != null && stack.getItem() instanceof PhoenixPlume) {
                if (!player.getItemCooldownManager().isCoolingDown(stack.getItem())) {
                    ((PhoenixPlume) stack.getItem()).setCooldown(player, stack);
                    player.setHealth(1f);
                    player.clearStatusEffects();
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 4));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 60 * 20, 0));
                    player.world.sendEntityStatus(player, (byte) 35);
                    if (player.world.isClient) TotemRenderUtil.renderTotem(stack);
                    info.setReturnValue(true);
                }
            }
        }
    }
}
