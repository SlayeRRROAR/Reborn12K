package net.slayerrroar.reborn12k.screen.runic_artifact;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;

public class RunicArtifactScreen extends HandledScreen<RunicArtifactScreenHandler> {

    public static final Identifier TEXTURE =
            new Identifier(Reborn12K.MOD_ID, "textures/gui/runic_artifact_gui.png");

    public RunicArtifactScreen(RunicArtifactScreenHandler screenHandler, PlayerInventory playerInventory, Text text) {
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
            drawTexture(matrixStack, x + 65, y + 34, 176, 0, handler.getScaledProgress(), 36);
        }

    }

    @Override
    public void render(MatrixStack matrixStack, int i, int j, float f) {
        renderBackground(matrixStack);
        super.render(matrixStack, i, j, f);
        drawMouseoverTooltip(matrixStack, i, j);
    }
}
