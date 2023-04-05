package net.slayerrroar.reborn12k.mixin;

import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.slayerrroar.reborn12k.items.ItemTrinkets;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@SuppressWarnings("OptionalGetWithoutIsPresent")

@Mixin(ServerPlayerEntity.class)
public abstract class LongFallBootsMixin {

    @Shadow
    public ServerPlayNetworkHandler networkHandler;

    @Inject(method = "tick()V", at = @At("TAIL"))
    private void tick(CallbackInfo info) {
        ServerPlayerEntity player = this.networkHandler.player;
        if(TrinketsApi.getTrinketComponent(player).get().isEquipped(ItemTrinkets.LONG_FALL_BOOTS)){
            player.handleFall(0, true);
        }
    }
}