package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;
import net.slayerrroar.reborn12k.blocks.BaseBlocks;

public class RebornRenderHelper {
    public static void setRenderLayers() {

        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.MARKET_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.STAR_GENERATOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BaseBlocks.CHERRY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BaseBlocks.CHERRY_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BaseBlocks.SLIMY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BaseBlocks.SLIMY_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BaseBlocks.CHERRY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BaseBlocks.CHERRY_TRAPDOOR, RenderLayer.getCutout());

    }
}
