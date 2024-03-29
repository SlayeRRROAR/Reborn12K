package net.slayerrroar.reborn12k.compat.rei.categories.manufactory;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.SimpleGridMenuDisplay;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.registry.RecipeManagerContext;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.RecipeEntry;
import net.slayerrroar.reborn12k.recipe.types.ManufactoryRecipe;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@SuppressWarnings({"unused","FieldMayBeFinal", "UnstableApiUsage"})
public class ManufactoryDisplay extends BasicDisplay implements SimpleGridMenuDisplay {
    private RecipeEntry<?> recipe;
    //private double cookTime;

    /*public ManufactoryDisplay(RecipeEntry<? extends ManufactoryRecipe> recipe) {
        this(EntryIngredients.ofIngredients(recipe.value().getIngredients()), Collections.singletonList(EntryIngredients.of(recipe.value().getResult(BasicDisplay.registryAccess()))),
                recipe, recipe.value().getCookingTime());
    }*/

    public ManufactoryDisplay(RecipeEntry<? extends ManufactoryRecipe> recipe) {
        this(EntryIngredients.ofIngredients(recipe.value().getIngredients()), Collections.singletonList(EntryIngredients.of(recipe.value().getResult(BasicDisplay.registryAccess()))),
                recipe);
    }

    /*public ManufactoryDisplay(List<EntryIngredient> input, List<EntryIngredient> output, NbtCompound tag) {
        this(input, output, RecipeManagerContext.getInstance().byId(tag, "location"), tag.getDouble("cookTime"));
    }*/

    public ManufactoryDisplay(List<EntryIngredient> input, List<EntryIngredient> output, NbtCompound tag) {
        this(input, output, RecipeManagerContext.getInstance().byId(tag, "location"));
    }

    /*public ManufactoryDisplay(List<EntryIngredient> input, List<EntryIngredient> output, @Nullable RecipeEntry<?> recipe, double cookTime) {
        super(input, output, Optional.ofNullable(recipe).map(RecipeEntry::id));
        this.recipe = recipe;
        this.cookTime = cookTime;
    }*/

    public ManufactoryDisplay(List<EntryIngredient> input, List<EntryIngredient> output, @Nullable RecipeEntry<?> recipe) {
        super(input, output, Optional.ofNullable(recipe).map(RecipeEntry::id));
        this.recipe = recipe;
    }

    /*public double getCookingTime() {
        return cookTime;
    }*/

    @ApiStatus.Internal
    public Optional<RecipeEntry<?>> getOptionalRecipe() {
        return Optional.ofNullable(recipe);
    }

    @Override
    public int getWidth() {
        return 1;
    }

    @Override
    public int getHeight() {
        return 1;
    }

    /*public static <R extends ManufactoryDisplay> BasicDisplay.Serializer<R> serializer(BasicDisplay.Serializer.RecipeLessConstructor<R> constructor) {
        return BasicDisplay.Serializer.ofRecipeLess(constructor, (display, tag) -> tag.putDouble("cookTime", display.getCookingTime()));
    }*/

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return ManufactoryCategory.MANUFACTORY;
    }
}
