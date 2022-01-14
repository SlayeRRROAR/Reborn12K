package net.slayerrroar.reborn12k.sounds;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;

public class SoundClass {

    public static final SoundEvent Z115 = registerSound("z115");

    private static SoundEvent registerSound(String string) {
        Identifier id = new Identifier(Reborn12K.MOD_ID, string);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void register() {
        System.out.println("Registering Sounds for " + Reborn12K.MOD_ID);
    }
}
