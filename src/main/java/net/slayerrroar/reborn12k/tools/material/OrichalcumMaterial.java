package net.slayerrroar.reborn12k.tools.material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.ItemGenerics;

public class OrichalcumMaterial implements ToolMaterial{

    public static final OrichalcumMaterial INSTANCE = new OrichalcumMaterial();

    @Override
    public float getAttackDamage() {
        return 3.0f;
    }

    @Override
    public int getDurability() {
        return 1237;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemGenerics.ORICHALCUM_INGOT);
    }
    
}