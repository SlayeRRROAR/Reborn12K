package net.slayerrroar.reborn12k.recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.recipe.recipe_types.*;

public class RebornCustomRecipes {

    public static void register() {

        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Recipes");

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Reborn12K.MOD_ID, ArcaneArtifactRecipe.Serializer.ID),
                ArcaneArtifactRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Reborn12K.MOD_ID, ArcaneArtifactRecipe.Type.ID),
                ArcaneArtifactRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Reborn12K.MOD_ID, MineralManufactoryRecipe.Serializer.ID),
                MineralManufactoryRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Reborn12K.MOD_ID, MineralManufactoryRecipe.Type.ID),
                MineralManufactoryRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Reborn12K.MOD_ID, MelterRecipe.Serializer.ID),
                MelterRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Reborn12K.MOD_ID, MelterRecipe.Type.ID),
                MelterRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Reborn12K.MOD_ID, QuarryRecipe.Serializer.ID),
                QuarryRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Reborn12K.MOD_ID, QuarryRecipe.Type.ID),
                QuarryRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Reborn12K.MOD_ID, SynthesisRecipe.Serializer.ID),
                SynthesisRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Reborn12K.MOD_ID, SynthesisRecipe.Type.ID),
                SynthesisRecipe.Type.INSTANCE);

    }

}
