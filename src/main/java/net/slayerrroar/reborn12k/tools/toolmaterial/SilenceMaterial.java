package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.RebornItems;

public class SilenceMaterial implements ToolMaterial{

    public static final SilenceMaterial INSTANCE = new SilenceMaterial();

    @Override
    public float getAttackDamage() {
        return 10.0f;
    }

    @Override
    public int getDurability() {
        return 2379;
    }

    @Override
    public int getEnchantability() {
        return 5;
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
        return Ingredient.ofItems(RebornItems.DEMONIC_METAL_INGOT);
    }
    
}