package net.slayerrroar.reborn12k.tools.material;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class IronMaterial implements ToolMaterial{

    public static final IronMaterial INSTANCE = new IronMaterial();

    @Override
    public float getAttackDamage() {
        return 2.0f;
    }

    @Override
    public int getDurability() {
        return 250;
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
        return 6.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }
    
}