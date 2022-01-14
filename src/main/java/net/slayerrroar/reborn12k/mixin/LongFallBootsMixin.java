package net.slayerrroar.reborn12k.mixin;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.slayerrroar.reborn12k.armors.Armors;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayerEntity.class)
public abstract class LongFallBootsMixin
{
    @Shadow
    public ServerPlayNetworkHandler networkHandler;

    @Inject(method = "tick()V", at = @At("TAIL"))
    private void tick(CallbackInfo info)
    {
        ServerPlayerEntity player = this.networkHandler.player;
        ItemStack equippedStack = player.getEquippedStack(EquipmentSlot.FEET);

        if (equippedStack.getItem().equals(Armors.LONG_FALL_BOOTS))
        {
            player.handleFall(0, true);
        }
    }
}