package net.slayerrroar.reborn12k.mixin;

import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.items.CharmItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndermanEntity.class)
public abstract class ShadesMixin extends HostileEntity {


    protected ShadesMixin (EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }
    @Inject(method = "isPlayerStaring", at = @At(value = "RETURN", target = "Lnet/minecraft/entity/mob/EndermanEntity;isPlayerStaring(Lnet/minecraft/entity/player/PlayerEntity;)Z"), cancellable = true)
    public void isPlayerStaring(PlayerEntity player, CallbackInfoReturnable<Boolean> cir) {
        if(TrinketsApi.getTrinketComponent((LivingEntity) player).get().isEquipped(CharmItems.SHADES)){
            cir.setReturnValue(false);
        }
    }
}