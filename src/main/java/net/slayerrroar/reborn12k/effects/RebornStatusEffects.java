package net.slayerrroar.reborn12k.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;

public class RebornStatusEffects {

    public static final StatusEffect BLEED = new BleedStatusEffect();

    public static void register() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier(Reborn12K.MOD_ID, "bleed"), BLEED);
    }

}
