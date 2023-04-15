package net.slayerrroar.reborn12k;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.entity.CustomProjectileEntities;
import net.slayerrroar.reborn12k.fluids.RebornFluids;
import net.slayerrroar.reborn12k.screen.RebornScreenRegistry;
import net.slayerrroar.reborn12k.util.KeybindsUtil;
import net.slayerrroar.reborn12k.util.RenderHelperUtil;

@Environment(EnvType.CLIENT)

public class ClientReborn12K implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        KeybindsUtil.registerClient();
        RenderHelperUtil.setRenderLayers();
        RebornScreenRegistry.registerClient();

        EntityRendererRegistry.register(CustomProjectileEntities.SOUL_VESSEL_ENTITY, FlyingItemEntityRenderer::new);

        FluidRenderHandlerRegistry.INSTANCE.register(RebornFluids.LIQUID_MANA_STILL, RebornFluids.LIQUID_MANA_FLOWING,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA103FCCF
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                RebornFluids.LIQUID_MANA_STILL, RebornFluids.LIQUID_MANA_FLOWING);

        FluidRenderHandlerRegistry.INSTANCE.register(RebornFluids.DESTABILIZED_REDSTONE_STILL, RebornFluids.DESTABILIZED_REDSTONE_FLOWING,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA1BA0008
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                RebornFluids.DESTABILIZED_REDSTONE_STILL, RebornFluids.DESTABILIZED_REDSTONE_FLOWING);

        FluidRenderHandlerRegistry.INSTANCE.register(RebornFluids.ENERGIZED_GLOWSTONE_STILL, RebornFluids.ENERGIZED_GLOWSTONE_FLOWING,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA1FFEA2D
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                RebornFluids.RESONANT_ENDER_STILL, RebornFluids.RESONANT_ENDER_FLOWING);

        FluidRenderHandlerRegistry.INSTANCE.register(RebornFluids.RESONANT_ENDER_STILL, RebornFluids.RESONANT_ENDER_FLOWING,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA90B4D42
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                RebornFluids.RESONANT_ENDER_STILL, RebornFluids.RESONANT_ENDER_FLOWING);

    }

}