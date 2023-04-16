package net.slayerrroar.reborn12k.mixin;

import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.slayerrroar.reborn12k.items.ItemTrinkets;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@SuppressWarnings("OptionalGetWithoutIsPresent")

@Mixin(PlayerEntity.class)
public class QuiverMixin {

    @Inject(method = "getArrowType", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/PlayerEntity;abilities:Lnet/minecraft/entity/player/PlayerAbilities;"), cancellable = true)
    private void getArrowType(ItemStack weapon, CallbackInfoReturnable<ItemStack> cir) {
        if(TrinketsApi.getTrinketComponent((LivingEntity) ((Object) this)).get().isEquipped(ItemTrinkets.ENDLESS_QUIVER)) {
            cir.setReturnValue(new ItemStack(Items.ARROW));
        }
    }
}