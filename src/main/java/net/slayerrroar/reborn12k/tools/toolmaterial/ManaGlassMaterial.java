package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.AdvancedItems;

public class ManaGlassMaterial implements ToolMaterial {

    public static final ManaGlassMaterial INSTANCE = new ManaGlassMaterial();

    @Override
    public float getAttackDamage() {
        return 0.0f;
    }

    @Override
    public int getDurability() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(AdvancedItems.REFINED_MANATITE);
    }

}