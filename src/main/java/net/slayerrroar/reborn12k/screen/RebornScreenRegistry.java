package net.slayerrroar.reborn12k.screen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.screen.crusher.*;
import net.slayerrroar.reborn12k.screen.mana_condenser.*;
import net.slayerrroar.reborn12k.screen.melter.*;
import net.slayerrroar.reborn12k.screen.mineral_manufactory.*;
import net.slayerrroar.reborn12k.screen.quarry.*;
import net.slayerrroar.reborn12k.screen.arcane_artifact.*;

public final class RebornScreenRegistry {

    public static final ScreenHandlerType<ArcaneArtifactScreenHandler> ARCANE_ARTIFACT_SCREEN_HANDLER = new ScreenHandlerType<>(
            ArcaneArtifactScreenHandler::new);
    public static final ScreenHandlerType<ManaCondenserScreenHandler> MANA_CONDENSER_SCREEN_HANDLER = new ScreenHandlerType<>(
            ManaCondenserScreenHandler::new);
    public static final ScreenHandlerType<CrusherScreenHandler> CRUSHER_SCREEN_HANDLER = new ScreenHandlerType<>(
            CrusherScreenHandler::new);
    public static final ScreenHandlerType<MineralManufactoryScreenHandler> MINERAL_MANUFACTORY_SCREEN_HANDLER = new ScreenHandlerType<>(
            MineralManufactoryScreenHandler::new);
    public static final ScreenHandlerType<MelterScreenHandler> MELTER_SCREEN_HANDLER = new ScreenHandlerType<>(
            MelterScreenHandler::new);
    public static final ScreenHandlerType<QuarryScreenHandler> QUARRY_SCREEN_HANDLER = new ScreenHandlerType<>(
            QuarryScreenHandler::new);

    public static void register() {

        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Screens");

        registerScreens("arcane_artifact", ARCANE_ARTIFACT_SCREEN_HANDLER);
        registerScreens("mana_condenser", MANA_CONDENSER_SCREEN_HANDLER);
        registerScreens("crusher", CRUSHER_SCREEN_HANDLER);
        registerScreens("mineral_manufactory", MINERAL_MANUFACTORY_SCREEN_HANDLER);
        registerScreens("melter", MELTER_SCREEN_HANDLER);
        registerScreens("quarry", QUARRY_SCREEN_HANDLER);
    }

    @Environment(EnvType.CLIENT)
    public static void registerClient() {
        HandledScreens.register(ARCANE_ARTIFACT_SCREEN_HANDLER, ArcaneArtifactScreen::new);
        HandledScreens.register(MANA_CONDENSER_SCREEN_HANDLER, ManaCondenserScreen::new);
        HandledScreens.register(CRUSHER_SCREEN_HANDLER, CrusherScreen::new);
        HandledScreens.register(MINERAL_MANUFACTORY_SCREEN_HANDLER, MineralManufactoryScreen::new);
        HandledScreens.register(MELTER_SCREEN_HANDLER, MelterScreen::new);
        HandledScreens.register(QUARRY_SCREEN_HANDLER, QuarryScreen::new);

    }

    private static void registerScreens(String reborn12k, ScreenHandlerType<?> type) {
        Registry.register(Registries.SCREEN_HANDLER, reborn12k, type);
    }

}