package net.slayerrroar.reborn12k.tools.material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.ItemGenerics;

public class TungstensteelMaterial implements ToolMaterial{

    public static final TungstensteelMaterial INSTANCE = new TungstensteelMaterial();

    @Override
    public float getAttackDamage() {
        return 5.0f;
    }

    @Override
    public int getDurability() {
        return 2031;
    }

    @Override
    public int getEnchantability() {
        return 8;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemGenerics.TUNGSTENSTEEL_INGOT);
    }
    
}