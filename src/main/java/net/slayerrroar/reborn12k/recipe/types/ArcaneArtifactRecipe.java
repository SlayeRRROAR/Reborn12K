package net.slayerrroar.reborn12k.recipe.types;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.world.World;

import java.util.List;

public class ArcaneArtifactRecipe implements Recipe<SimpleInventory> {

    private final ItemStack output;
    private final List<Ingredient> recipeItems;
    private final int cookingTime;

    public ArcaneArtifactRecipe(List<Ingredient> ingredients, ItemStack itemStack, int cookingTime) {
        this.output = itemStack;
        this.recipeItems = ingredients;
        this.cookingTime = cookingTime;
    }

    @Override
    public boolean isIgnoredInRecipeBook() {
        return true;
    }

    @Override
    public boolean matches(SimpleInventory inventory, World world) {
        if(world.isClient()) {
            return false;
        }

        return recipeItems.get(0).test(inventory.getStack(0));
    }

    @Override
    public ItemStack craft(SimpleInventory inventory, DynamicRegistryManager registryManager) {
        return output;
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResult(DynamicRegistryManager registryManager) {
        return output;
    }

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.ofSize(this.recipeItems.size());
        list.addAll(recipeItems);
        return list;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ArcaneArtifactRecipe.Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return ArcaneArtifactRecipe.Type.INSTANCE;
    }

    public static class Type implements RecipeType<ArcaneArtifactRecipe> {
        public static final ArcaneArtifactRecipe.Type INSTANCE = new ArcaneArtifactRecipe.Type();
        public static final String ID = "arcane_artifact";
    }

    public static class Serializer implements RecipeSerializer<ArcaneArtifactRecipe> {
        public static final ArcaneArtifactRecipe.Serializer INSTANCE = new ArcaneArtifactRecipe.Serializer();
        public static final String ID = "arcane_artifact";

        public static final Codec<ArcaneArtifactRecipe> CODEC = RecordCodecBuilder.create(in -> in.group(
                validateAmount().fieldOf("ingredients").forGetter(ArcaneArtifactRecipe::getIngredients),
                RecipeCodecs.CRAFTING_RESULT.fieldOf("output").forGetter(r -> r.output),
                Codec.INT.fieldOf("cookingtime").orElse(200).forGetter(r -> r.cookingTime)
        ).apply(in, ArcaneArtifactRecipe::new));

        private static Codec<List<Ingredient>> validateAmount() {
            return Codecs.validate(Codecs.validate(
                    Ingredient.DISALLOW_EMPTY_CODEC.listOf(), list -> list.size() > 9 ? DataResult.error(() -> "Recipe has too many ingredients!") : DataResult.success(list)
            ), list -> list.isEmpty() ? DataResult.error(() -> "Recipe has no ingredients!") : DataResult.success(list));
        }

        @Override
        public Codec<ArcaneArtifactRecipe> codec() {
            return CODEC;
        }

        @Override
        public ArcaneArtifactRecipe read(PacketByteBuf buf) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);

            for(int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromPacket(buf));
            }

            ItemStack output = buf.readItemStack();
            int cookingTime = buf.readVarInt();
            return new ArcaneArtifactRecipe(inputs, output, cookingTime);
        }

        @Override
        public void write(PacketByteBuf buf, ArcaneArtifactRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());

            for (Ingredient ingredient : recipe.getIngredients()) {
                ingredient.write(buf);
            }

            buf.writeItemStack(recipe.getResult(null));
            buf.writeInt(recipe.cookingTime);
        }
    }
}