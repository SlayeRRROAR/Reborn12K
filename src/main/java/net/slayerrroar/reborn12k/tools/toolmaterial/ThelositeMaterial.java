package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.RebornItems;

public class ThelositeMaterial implements ToolMaterial{

    public static final ThelositeMaterial INSTANCE = new ThelositeMaterial();

    @Override
    public float getAttackDamage() {
        return 8.0f;
    }

    @Override
    public int getDurability() {
        return 2640;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 16.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RebornItems.THELOSITE_INGOT);
    }
    
}