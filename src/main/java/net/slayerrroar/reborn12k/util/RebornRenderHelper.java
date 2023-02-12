package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;
import net.slayerrroar.reborn12k.blocks.RebornBlocks;

public class RebornRenderHelper {
    public static void setRenderLayers() {

        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.MARKET_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.FANCY_LAMP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.ASH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.ASH_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.CHERRY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.CHERRY_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.SLIMY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.SLIMY_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.ASH_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.ASH_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.CHERRY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.CHERRY_TRAPDOOR, RenderLayer.getCutout());

    }
}
