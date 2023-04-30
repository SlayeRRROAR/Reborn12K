package net.slayerrroar.reborn12k.client;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.fluids.RebornFluids;

public class RebornFluidRender {

    public static void registerClient() {


        FluidRenderHandlerRegistry.INSTANCE.register(RebornFluids.LIQUID_MANA_STILL, RebornFluids.LIQUID_MANA_FLOWING,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA103fCCF
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
                        0xA1fFEA2D
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
