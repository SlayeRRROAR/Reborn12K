package net.slayerrroar.reborn12k.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.FrogEntity;
import net.minecraft.entity.projectile.thrown.EggEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.items.ItemTrinkets;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EggEntity.class)
public class EggEntityMixin {

    @Inject(method = "onEntityHit", at = @At("HEAD"), cancellable = true)
    public void onEntityHit(EntityHitResult entityHitResult, CallbackInfo ci) {
        Entity entity = entityHitResult.getEntity();
        if(entity instanceof FrogEntity) {
            entityHitResult.getEntity().kill();
            entity.dropItem(ItemTrinkets.BASILISK_TOOTH, 1);
            ci.cancel();
        }
    }
}