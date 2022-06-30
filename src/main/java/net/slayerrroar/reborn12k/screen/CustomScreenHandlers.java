package net.slayerrroar.reborn12k.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.screen.alloy_furnace.AlloyFurnaceScreenHandler;
import net.slayerrroar.reborn12k.screen.runic_artifact.RunicArtifactScreenHandler;

@SuppressWarnings("ALL")
public class CustomScreenHandlers {

    public static ScreenHandlerType<AlloyFurnaceScreenHandler> ALLOY_FURNACE_SCREEN_HANDLER;

    public static ScreenHandlerType<RunicArtifactScreenHandler> RUNIC_ARTIFACT_SCREEN_HANDLER;

    public static void register() {

        ALLOY_FURNACE_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Reborn12K.MOD_ID, "alloy_furnace"),
                AlloyFurnaceScreenHandler::new);

        RUNIC_ARTIFACT_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(Reborn12K.MOD_ID, "runic_artifact"),
                RunicArtifactScreenHandler::new);

    }
}
