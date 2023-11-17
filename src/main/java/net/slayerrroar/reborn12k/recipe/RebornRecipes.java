package net.slayerrroar.reborn12k.recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.recipe.types.*;

public class RebornRecipes {

    public static void register() {

        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Recipes");

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Reborn12K.MOD_ID, ArcaneArtifactRecipe.Serializer.ID),
                ArcaneArtifactRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Reborn12K.MOD_ID, ArcaneArtifactRecipe.Type.ID),
                ArcaneArtifactRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Reborn12K.MOD_ID, ManaCondenserRecipe.Serializer.ID),
                ManaCondenserRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Reborn12K.MOD_ID, ManaCondenserRecipe.Type.ID),
                ManaCondenserRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Reborn12K.MOD_ID, CrusherRecipe.Serializer.ID),
                CrusherRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Reborn12K.MOD_ID, CrusherRecipe.Type.ID),
                CrusherRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Reborn12K.MOD_ID, ManufactoryRecipe.Serializer.ID),
                ManufactoryRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Reborn12K.MOD_ID, ManufactoryRecipe.Type.ID),
                ManufactoryRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Reborn12K.MOD_ID, MelterRecipe.Serializer.ID),
                MelterRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Reborn12K.MOD_ID, MelterRecipe.Type.ID),
                MelterRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Reborn12K.MOD_ID, QuarryRecipe.Serializer.ID),
                QuarryRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Reborn12K.MOD_ID, QuarryRecipe.Type.ID),
                QuarryRecipe.Type.INSTANCE);

    }

}
