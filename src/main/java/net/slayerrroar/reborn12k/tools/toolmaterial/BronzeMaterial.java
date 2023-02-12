package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.RebornItems;

public class BronzeMaterial implements ToolMaterial{

    public static final BronzeMaterial INSTANCE = new BronzeMaterial();

    @Override
    public float getAttackDamage() {
        return 1.0f;
    }

    @Override
    public int getDurability() {
        return 325;
    }

    @Override
    public int getEnchantability() {
        return 14;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RebornItems.BRONZE_INGOT);
    }
    
}