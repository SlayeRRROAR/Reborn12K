package net.slayerrroar.reborn12k.screen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.screen.melter.MelterScreen;
import net.slayerrroar.reborn12k.screen.melter.MelterScreenHandler;
import net.slayerrroar.reborn12k.screen.quarry.QuarryScreen;
import net.slayerrroar.reborn12k.screen.quarry.QuarryScreenHandler;
import net.slayerrroar.reborn12k.screen.runic_artifact.RunicArtifactScreen;
import net.slayerrroar.reborn12k.screen.runic_artifact.RunicArtifactScreenHandler;

public final class CustomScreenRegistry {

    public static final ScreenHandlerType<RunicArtifactScreenHandler> RUNIC_ARTIFACT_SCREEN_HANDLER = new ScreenHandlerType<>(
            RunicArtifactScreenHandler::new);
    public static final ScreenHandlerType<MelterScreenHandler> MELTER_SCREEN_HANDLER = new ScreenHandlerType<>(
            MelterScreenHandler::new);
    public static final ScreenHandlerType<QuarryScreenHandler> QUARRY_SCREEN_HANDLER = new ScreenHandlerType<>(
            QuarryScreenHandler::new);

    public static void register() {
        screens("runic_artifact", RUNIC_ARTIFACT_SCREEN_HANDLER);
        screens("melter", MELTER_SCREEN_HANDLER);
        screens("quarry", QUARRY_SCREEN_HANDLER);
    }

    @Environment(EnvType.CLIENT)
    public static void registerClient() {
        HandledScreens.register(RUNIC_ARTIFACT_SCREEN_HANDLER, RunicArtifactScreen::new);
        HandledScreens.register(MELTER_SCREEN_HANDLER, MelterScreen::new);
        HandledScreens.register(QUARRY_SCREEN_HANDLER, QuarryScreen::new);

    }

    private static void screens(String reborn12k, ScreenHandlerType<?> type) {
        Registry.register(Registry.SCREEN_HANDLER, reborn12k, type);
    }

}