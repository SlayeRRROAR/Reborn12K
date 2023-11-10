package net.slayerrroar.reborn12k.potions;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.effects.RebornStatusEffects;

public class RebornPotions {

    public static final Potion BLEED_POTION =
            Registry.register(Registries.POTION, new Identifier(Reborn12K.MOD_ID, "bleed"),
                    new Potion(new StatusEffectInstance(RebornStatusEffects.BLEED, 45*20, 0)));
    public static final Potion BLEED_POTION_EXTENDED =
            Registry.register(Registries.POTION, new Identifier(Reborn12K.MOD_ID, "bleed_extended"),
                    new Potion(new StatusEffectInstance(RebornStatusEffects.BLEED, 90*20, 0)));
    public static final Potion BLEED_POTION_2 =
            Registry.register(Registries.POTION, new Identifier(Reborn12K.MOD_ID, "bleed_2"),
                    new Potion(new StatusEffectInstance(RebornStatusEffects.BLEED, 21*20, 1)));

    public static void register() {
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.ROTTEN_FLESH, RebornPotions.BLEED_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(RebornPotions.BLEED_POTION, Items.REDSTONE, RebornPotions.BLEED_POTION_EXTENDED);
        BrewingRecipeRegistry.registerPotionRecipe(RebornPotions.BLEED_POTION, Items.GLOWSTONE, RebornPotions.BLEED_POTION_2);
    }
}
