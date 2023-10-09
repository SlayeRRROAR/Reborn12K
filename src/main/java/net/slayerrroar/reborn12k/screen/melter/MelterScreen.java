package net.slayerrroar.reborn12k.screen.melter;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;

public class MelterScreen extends HandledScreen<MelterScreenHandler> {
    public static final Identifier TEXTURE = new Identifier
            (Reborn12K.MOD_ID,"textures/gui/melter_gui.png");

    public MelterScreen(MelterScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        context.drawTexture(TEXTURE, x ,y ,0 ,0, backgroundWidth, backgroundHeight);

        if (handler.isCrafting()) {
            context.drawTexture(TEXTURE, x + 89, y + 34, 176, 14, handler.getScaledProgress() + 1, 15);
        }

        if (handler.hasFuel()) {
            context.drawTexture(TEXTURE, x + 32, y + 36 + 12 - handler.getScaledFuelProgress(), 176,
                    12 - handler.getScaledFuelProgress(), 14, handler.getScaledFuelProgress() + 1);
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
