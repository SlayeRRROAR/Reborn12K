package net.slayerrroar.reborn12k.screen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.screen.arcane_artifact.ArcaneArtifactScreen;
import net.slayerrroar.reborn12k.screen.arcane_artifact.ArcaneArtifactScreenHandler;
import net.slayerrroar.reborn12k.screen.crusher.CrusherScreen;
import net.slayerrroar.reborn12k.screen.crusher.CrusherScreenHandler;
import net.slayerrroar.reborn12k.screen.mana_condenser.ManaCondenserScreen;
import net.slayerrroar.reborn12k.screen.mana_condenser.ManaCondenserScreenHandler;
import net.slayerrroar.reborn12k.screen.melter.MelterScreen;
import net.slayerrroar.reborn12k.screen.melter.MelterScreenHandler;
import net.slayerrroar.reborn12k.screen.manufactory.ManufactoryScreen;
import net.slayerrroar.reborn12k.screen.manufactory.ManufactoryScreenHandler;
import net.slayerrroar.reborn12k.screen.quarry.QuarryScreen;
import net.slayerrroar.reborn12k.screen.quarry.QuarryScreenHandler;

//TODO: fix screen crash

public final class RebornScreenRegistry {

    public static final ScreenHandlerType<ArcaneArtifactScreenHandler> ARCANE_ARTIFACT_SCREEN_HANDLER = new ScreenHandlerType<>(
            ArcaneArtifactScreenHandler::new, FeatureFlags.DEFAULT_ENABLED_FEATURES);
    public static final ScreenHandlerType<ManaCondenserScreenHandler> MANA_CONDENSER_SCREEN_HANDLER = new ScreenHandlerType<>(
            ManaCondenserScreenHandler::new, FeatureFlags.DEFAULT_ENABLED_FEATURES);
    public static final ScreenHandlerType<CrusherScreenHandler> CRUSHER_SCREEN_HANDLER = new ScreenHandlerType<>(
            CrusherScreenHandler::new, FeatureFlags.DEFAULT_ENABLED_FEATURES);
    public static final ScreenHandlerType<ManufactoryScreenHandler> MANUFACTORY_SCREEN_HANDLER = new ScreenHandlerType<>(
            ManufactoryScreenHandler::new, FeatureFlags.DEFAULT_ENABLED_FEATURES);
    public static final ScreenHandlerType<MelterScreenHandler> MELTER_SCREEN_HANDLER = new ScreenHandlerType<>(
            MelterScreenHandler::new, FeatureFlags.DEFAULT_ENABLED_FEATURES);
    public static final ScreenHandlerType<QuarryScreenHandler> QUARRY_SCREEN_HANDLER = new ScreenHandlerType<>(
            QuarryScreenHandler::new, FeatureFlags.DEFAULT_ENABLED_FEATURES);

    public static void register() {

        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Screens");

        registerScreens("arcane_artifact", ARCANE_ARTIFACT_SCREEN_HANDLER);
        registerScreens("mana_condenser", MANA_CONDENSER_SCREEN_HANDLER);
        registerScreens("crusher", CRUSHER_SCREEN_HANDLER);
        registerScreens("manufactory", MANUFACTORY_SCREEN_HANDLER);
        registerScreens("melter", MELTER_SCREEN_HANDLER);
        registerScreens("quarry", QUARRY_SCREEN_HANDLER);
    }

    @Environment(EnvType.CLIENT)
    public static void registerClient() {
        HandledScreens.register(ARCANE_ARTIFACT_SCREEN_HANDLER, ArcaneArtifactScreen::new);
        HandledScreens.register(MANA_CONDENSER_SCREEN_HANDLER, ManaCondenserScreen::new);
        HandledScreens.register(CRUSHER_SCREEN_HANDLER, CrusherScreen::new);
        HandledScreens.register(MANUFACTORY_SCREEN_HANDLER, ManufactoryScreen::new);
        HandledScreens.register(MELTER_SCREEN_HANDLER, MelterScreen::new);
        HandledScreens.register(QUARRY_SCREEN_HANDLER, QuarryScreen::new);

    }

    private static void registerScreens(String reborn12k, ScreenHandlerType<?> type) {
        Registry.register(Registries.SCREEN_HANDLER, reborn12k, type);
    }

}