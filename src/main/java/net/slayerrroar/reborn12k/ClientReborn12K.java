package net.slayerrroar.reborn12k;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.slayerrroar.reborn12k.util.CustomModelPredicateProvider;
import net.slayerrroar.reborn12k.util.RebornRenderHelper;

@SuppressWarnings("deprecation")
@Environment(EnvType.CLIENT)

public class ClientReborn12K implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

       RebornRenderHelper.setRenderLayers();
       CustomModelPredicateProvider.registerCustomModels();

    }
}
