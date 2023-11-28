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

public class QuarryRecipe implements Recipe<SimpleInventory> {

    private final ItemStack output;
    private final List<Ingredient> recipeItems;
    //private final int cookingTime;

    /*public QuarryRecipe(List<Ingredient> ingredients, ItemStack itemStack, int cookingTime) {
        this.output = itemStack;
        this.recipeItems = ingredients;
        this.cookingTime = cookingTime;
    }*/

    public QuarryRecipe(List<Ingredient> ingredients, ItemStack itemStack) {
        this.output = itemStack;
        this.recipeItems = ingredients;
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

        return recipeItems.get(0).test(inventory.getStack(0)) &&
                recipeItems.get(1).test(inventory.getStack(1));
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

    /*public int getCookingTime() {
        return this.cookingTime;
    }*/

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<QuarryRecipe> {
        public static final Type INSTANCE = new Type();
        public static final String ID = "quarry";
    }

    public static class Serializer implements RecipeSerializer<QuarryRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "quarry";

        public static final Codec<QuarryRecipe> CODEC = RecordCodecBuilder.create(in -> in.group(
                validateAmount().fieldOf("ingredients").forGetter(QuarryRecipe::getIngredients),
                RecipeCodecs.CRAFTING_RESULT.fieldOf("output").forGetter(r -> r.output) /*,
                Codec.INT.fieldOf("cookingtime").orElse(200).forGetter(r -> r.cookingTime)*/
        ).apply(in, QuarryRecipe::new));

        private static Codec<List<Ingredient>> validateAmount() {
            return Codecs.validate(Codecs.validate(
                    Ingredient.DISALLOW_EMPTY_CODEC.listOf(), list -> list.size() > 9 ? DataResult.error(() -> "Recipe has too many ingredients!") : DataResult.success(list)
            ), list -> list.isEmpty() ? DataResult.error(() -> "Recipe has no ingredients!") : DataResult.success(list));
        }

        @Override
        public Codec<QuarryRecipe> codec() {
            return CODEC;
        }

        /*@Override
        public QuarryRecipe read(PacketByteBuf buf) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);

            for(int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromPacket(buf));
            }

            ItemStack output = buf.readItemStack();
            int cookingTime = buf.readVarInt();
            return new QuarryRecipe(inputs, output, cookingTime);
        }*/

        @Override
        public QuarryRecipe read(PacketByteBuf buf) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);

            for(int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromPacket(buf));
            }

            ItemStack output = buf.readItemStack();
            return new QuarryRecipe(inputs, output);
        }

        @Override
        public void write(PacketByteBuf buf, QuarryRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());

            for (Ingredient ingredient : recipe.getIngredients()) {
                ingredient.write(buf);
            }

            buf.writeItemStack(recipe.getResult(null));
            //buf.writeInt(recipe.cookingTime);
        }
    }
}