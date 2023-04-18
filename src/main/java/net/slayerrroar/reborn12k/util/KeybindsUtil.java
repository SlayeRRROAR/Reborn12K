package net.slayerrroar.reborn12k.util;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

@Environment(value = EnvType.CLIENT)

public class KeybindsUtil {

    public static KeyBinding trinketKey;
    public static final String KEY_CATEGORY = "category.reborn12k.keybinds";
    public static final String KEY_TRINKET = "key.reborn12k.trinket";

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {});
    }

    public static void registerClient() {

        trinketKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(KEY_TRINKET, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_C, KEY_CATEGORY));

        registerKeyInputs();
    }
}