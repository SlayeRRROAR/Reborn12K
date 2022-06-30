package net.slayerrroar.reborn12k.statuses;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;

public class CustomStatusEffects {

    public static StatusEffect FRAIL;

    public static StatusEffect registerEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(Reborn12K.MOD_ID, name),
                new FrailEffect());
    }

    public static void register() {

        FRAIL = registerEffect("frail");

        Reborn12K.LOGGER.info("Registering Status Effects for " + Reborn12K.MOD_ID);

    }
}