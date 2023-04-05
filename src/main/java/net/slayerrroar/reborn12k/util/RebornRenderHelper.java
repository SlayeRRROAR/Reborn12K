package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;
import net.slayerrroar.reborn12k.blocks.BlockGenerics;

public class RebornRenderHelper {
    public static void setRenderLayers() {

        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.MARKET_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.FANCY_LAMP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.AIR_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.EARTH_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.WATER_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.FIRE_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.SUN_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.MOON_GEM, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockGenerics.ASH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockGenerics.ASH_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockGenerics.CHERRY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockGenerics.CHERRY_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockGenerics.SLIMY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockGenerics.SLIMY_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockGenerics.ASH_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockGenerics.ASH_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockGenerics.CHERRY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockGenerics.CHERRY_TRAPDOOR, RenderLayer.getCutout());

    }
}
