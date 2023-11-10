package net.slayerrroar.reborn12k.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.damage_type.RebornDamageTypes;

public class BleedStatusEffect extends StatusEffect {
    protected BleedStatusEffect() {
        super(StatusEffectCategory.HARMFUL, 9044739);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        World world = entity.getWorld();
        super.applyUpdateEffect(entity, amplifier);
        entity.damage(RebornDamageTypes.of(world, RebornDamageTypes.BLEED), 1.0f);

    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i = 25 >> amplifier;
        if (i > 0) {
            return duration % i == 0;
        } else {
            return true;
        }
    }
}
