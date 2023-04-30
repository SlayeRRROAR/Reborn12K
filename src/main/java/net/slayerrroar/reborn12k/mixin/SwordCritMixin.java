package net.slayerrroar.reborn12k.mixin;

import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.slayerrroar.reborn12k.items.TrinketItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@SuppressWarnings("OptionalGetWithoutIsPresent")

@Mixin(SwordItem.class)
public class SwordCritMixin {

    private boolean hasVagueLuck(LivingEntity entity) {
        return TrinketsApi.getTrinketComponent(entity).get().isEquipped(TrinketItems.VAGUE_LUCKY_CHARM);
    }
    private boolean hasMinorLuck(LivingEntity entity) {
        return TrinketsApi.getTrinketComponent(entity).get().isEquipped(TrinketItems.MINOR_LUCKY_CHARM);
    }
    private boolean hasIndelibleLuck(LivingEntity entity) {
        return TrinketsApi.getTrinketComponent(entity).get().isEquipped(TrinketItems.INDELIBLE_LUCKY_CHARM);
    }
    private boolean hasGreaterLuck(LivingEntity entity) {
        return TrinketsApi.getTrinketComponent(entity).get().isEquipped(TrinketItems.GREATER_LUCKY_CHARM);
    }
    private boolean hasRadiant(LivingEntity entity) {
        return TrinketsApi.getTrinketComponent(entity).get().isEquipped(TrinketItems.PRAYER_CANDLE);
    }

    @Inject(method = "postHit", at = @At(value = "HEAD"))
    public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker, CallbackInfoReturnable<Boolean> cir) {
        float damage = (float) attacker.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE);
        assert target != null;

        Random rand = new Random();
        int upperbound = 101;
        int int_random = rand.nextInt(upperbound);

        int vagueLuck = hasVagueLuck(attacker) ? 10 : 0;
        int minorLuck = hasMinorLuck(attacker) ? 15 : 0;
        int indelibleLuck = hasIndelibleLuck(attacker) ? 20 : 0;
        int greaterLuck = hasGreaterLuck(attacker) ? 25 : 0;
        int radiant = hasRadiant(attacker) ? 30 : 0;

        int critChance = int_random + vagueLuck + minorLuck + indelibleLuck + greaterLuck + radiant;

        if (critChance > 95) {
            float critBonus = 1.5f;
            target.damage(attacker.getDamageSources().generic(), (damage * critBonus));
            target.world.playSound(null, target.getX(), target.getY(), target.getZ(),
                    SoundEvents.ENTITY_PLAYER_ATTACK_CRIT, SoundCategory.PLAYERS, 1f, 1f);
        } else {
            target.damage(attacker.getDamageSources().generic(), (damage));
        }
    }
}
