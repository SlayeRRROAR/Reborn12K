package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.BaseItems;

public class BlazingSteelMaterial implements ToolMaterial{

    public static final BlazingSteelMaterial INSTANCE = new BlazingSteelMaterial();

    @Override
    public float getAttackDamage() {
        return 5.0f;
    }

    @Override
    public int getDurability() {
        return 2370;
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 11.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(BaseItems.BLAZING_STEEL_INGOT);
    }
    
}