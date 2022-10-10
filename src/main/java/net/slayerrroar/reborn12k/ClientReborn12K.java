package net.slayerrroar.reborn12k;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.fluids.CustomFluids;
import net.slayerrroar.reborn12k.screen.CustomScreenRegistry;
import net.slayerrroar.reborn12k.util.RebornRenderHelper;

@Environment(EnvType.CLIENT)

public class ClientReborn12K implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        RebornRenderHelper.setRenderLayers();

        CustomScreenRegistry.registerClient();

        FluidRenderHandlerRegistry.INSTANCE.register(CustomFluids.LIQUID_MANA_STILL, CustomFluids.LIQUID_MANA_FLOWING,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA103FCCF
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                CustomFluids.LIQUID_MANA_STILL, CustomFluids.LIQUID_MANA_FLOWING);

        FluidRenderHandlerRegistry.INSTANCE.register(CustomFluids.DESTABILIZED_REDSTONE_STILL, CustomFluids.DESTABILIZED_REDSTONE_FLOWING,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA1BA0008
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                CustomFluids.DESTABILIZED_REDSTONE_STILL, CustomFluids.DESTABILIZED_REDSTONE_FLOWING);

        FluidRenderHandlerRegistry.INSTANCE.register(CustomFluids.ENERGIZED_GLOWSTONE_STILL, CustomFluids.ENERGIZED_GLOWSTONE_FLOWING,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA1FFEA2D
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                CustomFluids.RESONANT_ENDER_STILL, CustomFluids.RESONANT_ENDER_FLOWING);

        FluidRenderHandlerRegistry.INSTANCE.register(CustomFluids.RESONANT_ENDER_STILL, CustomFluids.RESONANT_ENDER_FLOWING,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA90B4D42
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                CustomFluids.RESONANT_ENDER_STILL, CustomFluids.RESONANT_ENDER_FLOWING);

    }

}
