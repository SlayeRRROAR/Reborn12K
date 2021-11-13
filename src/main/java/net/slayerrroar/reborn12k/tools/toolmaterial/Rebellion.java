package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.BaseItems;

public class Rebellion implements ToolMaterial{

    public static final Rebellion INSTANCE = new Rebellion();

    @Override
    public float getAttackDamage() {
        return 6.0f;
    }

    @Override
    public int getDurability() {
        return 1689;
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 14.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(BaseItems.CARBON_STEEL_INGOT);
    }

}