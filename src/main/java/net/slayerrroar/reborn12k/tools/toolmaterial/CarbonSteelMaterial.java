package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.BaseItems;

public class CarbonSteelMaterial implements ToolMaterial{

    public static final CarbonSteelMaterial INSTANCE = new CarbonSteelMaterial();

    @Override
    public float getAttackDamage() {
        return 4.0f;
    }

    @Override
    public int getDurability() {
        return 1324;
    }

    @Override
    public int getEnchantability() {
        return 9;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(BaseItems.CARBON_STEEL_INGOT);
    }
    
}