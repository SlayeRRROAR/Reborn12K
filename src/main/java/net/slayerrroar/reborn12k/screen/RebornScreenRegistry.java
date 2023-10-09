package net.slayerrroar.reborn12k.screen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.screen.arcane_artifact.*;
import net.slayerrroar.reborn12k.screen.crusher.*;
import net.slayerrroar.reborn12k.screen.mana_condenser.*;
import net.slayerrroar.reborn12k.screen.manufactory.*;
import net.slayerrroar.reborn12k.screen.melter.*;
import net.slayerrroar.reborn12k.screen.quarry.*;

public final class RebornScreenRegistry {

    public static final ScreenHandlerType<ArcaneArtifactScreenHandler> ARCANE_ARTIFACT_SCREEN_HANDLER = Registry.register(Registries.SCREEN_HANDLER,
            new Identifier(Reborn12K.MOD_ID, "arcane_artifact"), new ExtendedScreenHandlerType<>(ArcaneArtifactScreenHandler::new));
    public static final ScreenHandlerType<ManaCondenserScreenHandler> MANA_CONDENSER_SCREEN_HANDLER = Registry.register(Registries.SCREEN_HANDLER,
            new Identifier(Reborn12K.MOD_ID, "mana_condenser"), new ExtendedScreenHandlerType<>(ManaCondenserScreenHandler::new));
    public static final ScreenHandlerType<CrusherScreenHandler> CRUSHER_SCREEN_HANDLER = Registry.register(Registries.SCREEN_HANDLER,
            new Identifier(Reborn12K.MOD_ID, "crusher"), new ExtendedScreenHandlerType<>(CrusherScreenHandler::new));
    public static final ScreenHandlerType<ManufactoryScreenHandler> MANUFACTORY_SCREEN_HANDLER = Registry.register(Registries.SCREEN_HANDLER,
            new Identifier(Reborn12K.MOD_ID, "manufactory"), new ExtendedScreenHandlerType<>(ManufactoryScreenHandler::new));
    public static final ScreenHandlerType<MelterScreenHandler> MELTER_SCREEN_HANDLER = Registry.register(Registries.SCREEN_HANDLER,
            new Identifier(Reborn12K.MOD_ID, "melter"), new ExtendedScreenHandlerType<>(MelterScreenHandler::new));
    public static final ScreenHandlerType<QuarryScreenHandler> QUARRY_SCREEN_HANDLER = Registry.register(Registries.SCREEN_HANDLER,
            new Identifier(Reborn12K.MOD_ID, "quarry"), new ExtendedScreenHandlerType<>(QuarryScreenHandler::new));

    public static void register() {
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Screens");
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
}