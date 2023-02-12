package net.slayerrroar.reborn12k.screen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.screen.melter.MelterScreen;
import net.slayerrroar.reborn12k.screen.melter.MelterScreenHandler;
import net.slayerrroar.reborn12k.screen.mineral_manufactory.MineralManufactoryScreen;
import net.slayerrroar.reborn12k.screen.mineral_manufactory.MineralManufactoryScreenHandler;
import net.slayerrroar.reborn12k.screen.quarry.QuarryScreen;
import net.slayerrroar.reborn12k.screen.quarry.QuarryScreenHandler;
import net.slayerrroar.reborn12k.screen.arcane_artifact.ArcaneArtifactScreen;
import net.slayerrroar.reborn12k.screen.arcane_artifact.ArcaneArtifactScreenHandler;
import net.slayerrroar.reborn12k.screen.synthesis_chamber.SynthesisChamberScreen;
import net.slayerrroar.reborn12k.screen.synthesis_chamber.SynthesisChamberScreenHandler;

public final class RebornScreenRegistry {

    public static final ScreenHandlerType<ArcaneArtifactScreenHandler> ARCANE_ARTIFACT_SCREEN_HANDLER = new ScreenHandlerType<>(
            ArcaneArtifactScreenHandler::new);
    public static final ScreenHandlerType<MineralManufactoryScreenHandler> MINERAL_MANUFACTORY_SCREEN_HANDLER = new ScreenHandlerType<>(
            MineralManufactoryScreenHandler::new);
    public static final ScreenHandlerType<MelterScreenHandler> MELTER_SCREEN_HANDLER = new ScreenHandlerType<>(
            MelterScreenHandler::new);
    public static final ScreenHandlerType<QuarryScreenHandler> QUARRY_SCREEN_HANDLER = new ScreenHandlerType<>(
            QuarryScreenHandler::new);
    public static final ScreenHandlerType<SynthesisChamberScreenHandler> SYNTHESIS_CHAMBER_SCREEN_HANDLER = new ScreenHandlerType<>(
            SynthesisChamberScreenHandler::new);

    public static void register() {

        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Screens");

        screens("arcane_artifact", ARCANE_ARTIFACT_SCREEN_HANDLER);
        screens("mineral_manufactory", MINERAL_MANUFACTORY_SCREEN_HANDLER);
        screens("melter", MELTER_SCREEN_HANDLER);
        screens("quarry", QUARRY_SCREEN_HANDLER);
        screens("synthesis_chamber", SYNTHESIS_CHAMBER_SCREEN_HANDLER);
    }

    @Environment(EnvType.CLIENT)
    public static void registerClient() {
        HandledScreens.register(ARCANE_ARTIFACT_SCREEN_HANDLER, ArcaneArtifactScreen::new);
        HandledScreens.register(MINERAL_MANUFACTORY_SCREEN_HANDLER, MineralManufactoryScreen::new);
        HandledScreens.register(MELTER_SCREEN_HANDLER, MelterScreen::new);
        HandledScreens.register(QUARRY_SCREEN_HANDLER, QuarryScreen::new);
        HandledScreens.register(SYNTHESIS_CHAMBER_SCREEN_HANDLER, SynthesisChamberScreen::new);

    }

    private static void screens(String reborn12k, ScreenHandlerType<?> type) {
        Registry.register(Registries.SCREEN_HANDLER, reborn12k, type);
    }

}