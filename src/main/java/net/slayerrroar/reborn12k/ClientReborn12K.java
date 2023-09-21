package net.slayerrroar.reborn12k;

import net.fabricmc.api.ClientModInitializer;
import net.slayerrroar.reborn12k.client.*;
import net.slayerrroar.reborn12k.screen.RebornScreenRegistry;
import net.slayerrroar.reborn12k.util.KeybindsUtil;

public class ClientReborn12K implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        KeybindsUtil.registerClient();
        RebornScreenRegistry.registerClient();

        RebornBlockRender.registerClient();
        RebornProjectileEntityRender.registerClient();

    }

}