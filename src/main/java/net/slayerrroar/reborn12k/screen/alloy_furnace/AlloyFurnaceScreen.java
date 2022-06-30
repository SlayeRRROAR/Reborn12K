package net.slayerrroar.reborn12k.screen.alloy_furnace;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;

public class AlloyFurnaceScreen extends HandledScreen<AlloyFurnaceScreenHandler> {

    public static final Identifier TEXTURE =
            new Identifier(Reborn12K.MOD_ID, "textures/gui/alloy_furnace_gui.png");

    public AlloyFurnaceScreen(AlloyFurnaceScreenHandler screenHandler, PlayerInventory playerInventory, Text text) {
        super(screenHandler, playerInventory, text);
    }

    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }

    @Override
    protected void drawBackground(MatrixStack matrixStack, float f, int i, int j) {

        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        drawTexture(matrixStack, x, y, 0, 0, backgroundWidth, backgroundHeight);

        if(handler.isCrafting()) {
            drawTexture(matrixStack, x + 95, y + 23, 176, 14, handler.getScaledProgress(), 36);
        }

        if(handler.hasFuel()) {
            drawTexture(matrixStack, x + 62, y + 41 + 14 - handler.getScaledFuelProgress(), 176,
                    12 - handler.getScaledFuelProgress(), 14, handler.getScaledFuelProgress() + 1);
        }

    }

    @Override
    public void render(MatrixStack matrixStack, int i, int j, float f) {
        renderBackground(matrixStack);
        super.render(matrixStack, i, j, f);
        drawMouseoverTooltip(matrixStack, i, j);
    }
}
