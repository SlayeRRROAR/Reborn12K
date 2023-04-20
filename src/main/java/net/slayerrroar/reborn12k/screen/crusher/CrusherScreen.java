package net.slayerrroar.reborn12k.screen.crusher;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;

public class CrusherScreen extends HandledScreen<CrusherScreenHandler> {
    public static final Identifier TEXTURE = new Identifier
            (Reborn12K.MOD_ID,"textures/gui/crusher_gui.png");

    public CrusherScreen(CrusherScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        drawTexture(matrices, x ,y ,0 ,0, backgroundWidth, backgroundHeight);

        if (handler.isCrafting()) {
            drawTexture(matrices, x + 84, y + 35, 176, 14, handler.getScaledProgress() + 1, 19);
        }

        if(handler.hasFuel()) {
            drawTexture(matrices, x + 57, y + 36 + 12 - handler.getScaledFuelProgress(), 176,
                    12 - handler.getScaledFuelProgress(), 14, handler.getScaledFuelProgress() + 1);
        }

    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }
}
