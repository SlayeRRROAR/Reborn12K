package net.slayerrroar.reborn12k.tools.material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.ItemGenerics;

public class EnderiumMaterial implements ToolMaterial{

    public static final EnderiumMaterial INSTANCE = new EnderiumMaterial();

    @Override
    public float getAttackDamage() {
        return 7.0f;
    }

    @Override
    public int getDurability() {
        return 2112;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 14.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemGenerics.ENDERIUM_INGOT);
    }
    
}