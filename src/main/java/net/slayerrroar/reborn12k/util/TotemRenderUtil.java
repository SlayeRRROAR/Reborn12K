package net.slayerrroar.reborn12k.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;

public class TotemRenderUtil {

    public static void renderTotem(ItemStack stack) {
        MinecraftClient.getInstance().gameRenderer.showFloatingItem(stack);
    }

}
