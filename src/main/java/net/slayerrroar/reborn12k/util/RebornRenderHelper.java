package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.slayerrroar.reborn12k.blocks.BaseBlocks;

public class RebornRenderHelper {
    public static void setRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(BaseBlocks.CHERRY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BaseBlocks.CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BaseBlocks.CHERRY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BaseBlocks.CHERRY_TRAPDOOR, RenderLayer.getCutout());
    }
}