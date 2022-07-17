package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.BaseItems;

public class EnderiumMaterial implements ToolMaterial{

    public static final EnderiumMaterial INSTANCE = new EnderiumMaterial();

    @Override
    public float getAttackDamage() {
        return 6.0f;
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
        return 12.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(BaseItems.ENDERIUM_INGOT);
    }
    
}