package net.slayerrroar.reborn12k.sounds;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;

public class RebornSounds {

    public static final SoundEvent Z115 = registerSound("z115");
    public static final SoundEvent DEVIL_TRIGGER = registerSound("devil_trigger");
    public static final SoundEvent BURY_THE_LIGHT = registerSound("bury_the_light");
    public static final SoundEvent FREE_BIRD = registerSound("free_bird");
    public static final SoundEvent ALKATRAZ = registerSound("alkatraz");

    private static SoundEvent registerSound(String string) {
        Identifier id = new Identifier(Reborn12K.MOD_ID, string);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void register() {
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Sounds");
    }
}
