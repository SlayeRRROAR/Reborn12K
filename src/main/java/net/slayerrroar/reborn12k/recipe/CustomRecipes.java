package net.slayerrroar.reborn12k.recipe;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;

public class CustomRecipes {

    public static void register() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Reborn12K.MOD_ID, RunicArtifactRecipe.Serializer.ID),
                RunicArtifactRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Reborn12K.MOD_ID, RunicArtifactRecipe.Type.ID),
                RunicArtifactRecipe.Type.INSTANCE);

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Reborn12K.MOD_ID, MelterRecipe.Serializer.ID),
                MelterRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Reborn12K.MOD_ID, MelterRecipe.Type.ID),
                MelterRecipe.Type.INSTANCE);

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Reborn12K.MOD_ID, QuarryRecipe.Serializer.ID),
                QuarryRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Reborn12K.MOD_ID, QuarryRecipe.Type.ID),
                QuarryRecipe.Type.INSTANCE);

    }

}
