package net.slayerrroar.reborn12k.client;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;
import net.slayerrroar.reborn12k.blocks.GenericBlocks;

public class RebornBlockRender {

    public static void registerClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.MARKET_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.ALCHEMIC_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.SHADY_TABLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.FANCY_LAMP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.ARCANE_ARTIFACT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.MANA_CONDENSER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.WORN_STRONGBOX, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.STRONGBOX, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.PRISTINE_STRONGBOX, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.LEGENDARY_STRONGBOX, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.AIR_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.EARTH_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.WATER_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.FIRE_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.SUN_GEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AdvancedBlocks.MOON_GEM, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(GenericBlocks.ASH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GenericBlocks.ASH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GenericBlocks.POTTED_ASH_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(GenericBlocks.SLIMY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GenericBlocks.SLIMY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GenericBlocks.POTTED_SLIMY_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(GenericBlocks.ASH_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GenericBlocks.ASH_TRAPDOOR, RenderLayer.getCutout());

    }
}
