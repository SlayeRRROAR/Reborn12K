package net.slayerrroar.reborn12k.client;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.slayerrroar.reborn12k.blocks.RebornBlocks;

public class RebornBlockRender {

    public static void registerClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.MARKET_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.ALCHEMIC_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.SHADY_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.FANCY_LAMP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.ARCANE_ARTIFACT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.MANA_CONDENSER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.WORN_STRONGBOX, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.STRONGBOX, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.PRISTINE_STRONGBOX, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.LEGENDARY_STRONGBOX, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.AIR_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.EARTH_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.WATER_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.FIRE_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.SUN_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.MOON_GEM, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.ASH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.ASH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.POTTED_ASH_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.SLIMY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.SLIMY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.POTTED_SLIMY_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.ASH_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RebornBlocks.ASH_TRAPDOOR, RenderLayer.getCutout());

    }
}
