package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.RebornItems;

public class SteelMaterial implements ToolMaterial{

    public static final SteelMaterial INSTANCE = new SteelMaterial();

    @Override
    public float getAttackDamage() {
        return 4.0f;
    }

    @Override
    public int getDurability() {
        return 1561;
    }

    @Override
    public int getEnchantability() {
        return 5;
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
        return Ingredient.ofItems(RebornItems.STEEL_INGOT);
    }
    
}