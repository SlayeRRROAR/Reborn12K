package net.slayerrroar.reborn12k.util;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

@Environment(value = EnvType.CLIENT)

public class KeybindsUtil {
    public static final KeyBinding trinket = new KeyBinding("key.reborn12k.trinket",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_C,
            "category.reborn12k.keybinds");

    public static void registerClient() {
        KeyBindingHelper.registerKeyBinding(trinket);
    }
}