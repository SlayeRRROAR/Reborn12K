package net.slayerrroar.reborn12k.recipe;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;

public class CustomRecipes {

    public static void register() {

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Reborn12K.MOD_ID, AlloyFurnaceRecipe.Serializer.ID),
                AlloyFurnaceRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Reborn12K.MOD_ID, AlloyFurnaceRecipe.Type.ID),
                AlloyFurnaceRecipe.Type.INSTANCE);

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Reborn12K.MOD_ID, RunicArtifactRecipe.Serializer.ID),
                RunicArtifactRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Reborn12K.MOD_ID, RunicArtifactRecipe.Type.ID),
                RunicArtifactRecipe.Type.INSTANCE);

        Reborn12K.LOGGER.info("Registering Custom Recipes for " + Reborn12K.MOD_ID);

    }

}
