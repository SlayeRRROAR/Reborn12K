package net.slayerrroar.reborn12k.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.slayerrroar.reborn12k.entity.RebornProjectileEntities;

@Environment(EnvType.CLIENT)
public class RebornProjectileEntityRender {

    public static void registerClient() {

        EntityRendererRegistry.register(RebornProjectileEntities.SOUL_VESSEL_ENTITY, FlyingItemEntityRenderer::new);

        EntityRendererRegistry.register(RebornProjectileEntities.VOLCANIC_ENTITY, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(RebornProjectileEntities.THUNDERBOLT_ENTITY, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(RebornProjectileEntities.TERRA_ENTITY, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(RebornProjectileEntities.GLACIAL_ENTITY, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(RebornProjectileEntities.CRIMSON_ENTITY, FlyingItemEntityRenderer::new);

    }
}
