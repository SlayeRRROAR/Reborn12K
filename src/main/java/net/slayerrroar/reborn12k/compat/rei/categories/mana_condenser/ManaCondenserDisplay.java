package net.slayerrroar.reborn12k.compat.rei.categories.mana_condenser;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.SimpleGridMenuDisplay;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.registry.RecipeManagerContext;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.RecipeEntry;
import net.slayerrroar.reborn12k.recipe.types.ManaCondenserRecipe;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@SuppressWarnings({"unused","FieldMayBeFinal", "UnstableApiUsage"})
public class ManaCondenserDisplay extends BasicDisplay implements SimpleGridMenuDisplay {
    private RecipeEntry<?> recipe;
    private double cookTime;

    public ManaCondenserDisplay(RecipeEntry<? extends ManaCondenserRecipe> recipe) {
        this(EntryIngredients.ofIngredients(recipe.value().getIngredients()), Collections.singletonList(EntryIngredients.of(recipe.value().getResult(BasicDisplay.registryAccess()))),
                recipe, recipe.value().getCookingTime());
    }

    public ManaCondenserDisplay(List<EntryIngredient> input, List<EntryIngredient> output, NbtCompound tag) {
        this(input, output, RecipeManagerContext.getInstance().byId(tag, "location"), tag.getDouble("cookTime"));
    }

    public ManaCondenserDisplay(List<EntryIngredient> input, List<EntryIngredient> output, @Nullable RecipeEntry<?> recipe, double cookTime) {
        super(input, output, Optional.ofNullable(recipe).map(RecipeEntry::id));
        this.recipe = recipe;
        this.cookTime = cookTime;
    }

    public double getCookingTime() {
        return cookTime;
    }

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

    public static <R extends ManaCondenserDisplay> BasicDisplay.Serializer<R> serializer(BasicDisplay.Serializer.RecipeLessConstructor<R> constructor) {
        return BasicDisplay.Serializer.ofRecipeLess(constructor, (display, tag) -> tag.putDouble("cookTime", display.getCookingTime()));
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return ManaCondenserCategory.MANA_CONDENSER;
    }
}
