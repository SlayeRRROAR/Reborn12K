package net.slayerrroar.reborn12k.statuses;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class FrailEffect extends StatusEffect {
    public FrailEffect() {
        super(StatusEffectCategory.NEUTRAL, 0xFFFFFF);
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }

}
