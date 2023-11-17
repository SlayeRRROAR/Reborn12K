package net.slayerrroar.reborn12k.compat.rei;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.slayerrroar.reborn12k.blocks.RebornBlocks;
import net.slayerrroar.reborn12k.compat.rei.categories.arcane_artifact.*;
import net.slayerrroar.reborn12k.compat.rei.categories.crusher.*;
import net.slayerrroar.reborn12k.compat.rei.categories.mana_condenser.*;
import net.slayerrroar.reborn12k.compat.rei.categories.manufactory.*;
import net.slayerrroar.reborn12k.compat.rei.categories.melter.*;
import net.slayerrroar.reborn12k.compat.rei.categories.quarry.*;
import net.slayerrroar.reborn12k.recipe.types.*;
import net.slayerrroar.reborn12k.screen.arcane_artifact.ArcaneArtifactScreen;
import net.slayerrroar.reborn12k.screen.crusher.CrusherScreen;
import net.slayerrroar.reborn12k.screen.mana_condenser.ManaCondenserScreen;
import net.slayerrroar.reborn12k.screen.manufactory.ManufactoryScreen;
import net.slayerrroar.reborn12k.screen.melter.MelterScreen;
import net.slayerrroar.reborn12k.screen.quarry.QuarryScreen;

public class ReiClientIntegration implements REIClientPlugin {

    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(
                new ArcaneArtifactCategory(),
                new CrusherCategory(),
                new ManaCondenserCategory(),
                new ManufactoryCategory(),
                new MelterCategory(),
                new QuarryCategory()
        );

        registry.addWorkstations(ArcaneArtifactCategory.ARCANE_ARTIFACT, EntryStacks.of(RebornBlocks.ARCANE_ARTIFACT));
        registry.addWorkstations(CrusherCategory.CRUSHER, EntryStacks.of(RebornBlocks.CRUSHER));
        registry.addWorkstations(ManaCondenserCategory.MANA_CONDENSER, EntryStacks.of(RebornBlocks.MANA_CONDENSER));
        registry.addWorkstations(ManufactoryCategory.MANUFACTORY, EntryStacks.of(RebornBlocks.MANUFACTORY));
        registry.addWorkstations(MelterCategory.MELTER, EntryStacks.of(RebornBlocks.MELTER));
        registry.addWorkstations(QuarryCategory.QUARRY, EntryStacks.of(RebornBlocks.QUARRY));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(ArcaneArtifactRecipe.class, ArcaneArtifactRecipe.Type.INSTANCE,
                ArcaneArtifactDisplay::new);
        registry.registerRecipeFiller(CrusherRecipe.class, CrusherRecipe.Type.INSTANCE,
                CrusherDisplay::new);
        registry.registerRecipeFiller(ManaCondenserRecipe.class, ManaCondenserRecipe.Type.INSTANCE,
                ManaCondenserDisplay::new);
        registry.registerRecipeFiller(ManufactoryRecipe.class, ManufactoryRecipe.Type.INSTANCE,
                ManufactoryDisplay::new);
        registry.registerRecipeFiller(MelterRecipe.class, MelterRecipe.Type.INSTANCE,
                MelterDisplay::new);
        registry.registerRecipeFiller(QuarryRecipe.class, QuarryRecipe.Type.INSTANCE,
                QuarryDisplay::new);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(78, 32, 28, 23), ArcaneArtifactScreen.class,
                ArcaneArtifactCategory.ARCANE_ARTIFACT);
        registry.registerClickArea(screen -> new Rectangle(78, 32, 28, 23), CrusherScreen.class,
                CrusherCategory.CRUSHER);
        registry.registerClickArea(screen -> new Rectangle(78, 32, 28, 23), ManaCondenserScreen.class,
                ManaCondenserCategory.MANA_CONDENSER);
        registry.registerClickArea(screen -> new Rectangle(78, 32, 28, 23), ManufactoryScreen.class,
                ManufactoryCategory.MANUFACTORY);
        registry.registerClickArea(screen -> new Rectangle(78, 32, 28, 23), MelterScreen.class,
                MelterCategory.MELTER);
        registry.registerClickArea(screen -> new Rectangle(78, 32, 28, 23), QuarryScreen.class,
                QuarryCategory.QUARRY);
    }
}
