package net.slayerrroar.reborn12k.mixin;

import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Item.class)
public interface CustomItemAccessor {
    @Accessor
    void setRecipeRemainder(final Item recipeRemainder);
}
