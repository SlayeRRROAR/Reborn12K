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

public class ManaCondenserRecipe implements Recipe<SimpleInventory> {

    private final ItemStack output;
    private final List<Ingredient> recipeItems;
    private final int cookingTime;

    public ManaCondenserRecipe(List<Ingredient> ingredients, ItemStack itemStack, int cookingTime) {
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
        return ManaCondenserRecipe.Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return ManaCondenserRecipe.Type.INSTANCE;
    }

    public static class Type implements RecipeType<ManaCondenserRecipe> {
        public static final ManaCondenserRecipe.Type INSTANCE = new ManaCondenserRecipe.Type();
        public static final String ID = "mana_condenser";
    }

    public static class Serializer implements RecipeSerializer<ManaCondenserRecipe> {
        public static final ManaCondenserRecipe.Serializer INSTANCE = new ManaCondenserRecipe.Serializer();
        public static final String ID = "mana_condenser";

        public static final Codec<ManaCondenserRecipe> CODEC = RecordCodecBuilder.create(in -> in.group(
                validateAmount(Ingredient.DISALLOW_EMPTY_CODEC, 9).fieldOf("ingredients").forGetter(ManaCondenserRecipe::getIngredients),
                RecipeCodecs.CRAFTING_RESULT.fieldOf("output").forGetter(r -> r.output),
                Codec.INT.fieldOf("cookingtime").orElse(200).forGetter(r -> r.cookingTime)
        ).apply(in, ManaCondenserRecipe::new));

        private static Codec<List<Ingredient>> validateAmount(Codec<Ingredient> delegate, int max) {
            return Codecs.validate(Codecs.validate(
                    delegate.listOf(), list -> list.size() > max ? DataResult.error(() -> "Recipe has too many ingredients!") : DataResult.success(list)
            ), list -> list.isEmpty() ? DataResult.error(() -> "Recipe has no ingredients!") : DataResult.success(list));
        }

        @Override
        public Codec<ManaCondenserRecipe> codec() {
            return CODEC;
        }

        @Override
        public ManaCondenserRecipe read(PacketByteBuf buf) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);

            for(int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromPacket(buf));
            }

            ItemStack output = buf.readItemStack();
            int cookingTime = buf.readVarInt();
            return new ManaCondenserRecipe(inputs, output, cookingTime);
        }

        @Override
        public void write(PacketByteBuf buf, ManaCondenserRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());

            for (Ingredient ingredient : recipe.getIngredients()) {
                ingredient.write(buf);
            }

            buf.writeItemStack(recipe.getResult(null));
            buf.writeInt(recipe.cookingTime);
        }
    }
}