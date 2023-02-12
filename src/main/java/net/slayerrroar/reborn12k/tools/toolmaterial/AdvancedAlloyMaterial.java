package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.RebornItems;

public class AdvancedAlloyMaterial implements ToolMaterial{

    public static final AdvancedAlloyMaterial INSTANCE = new AdvancedAlloyMaterial();

    @Override
    public float getAttackDamage() {
        return 3.0f;
    }

    @Override
    public int getDurability() {
        return 2437;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RebornItems.ADVANCED_ALLOY_INGOT);
    }
    
}