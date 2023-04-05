package net.slayerrroar.reborn12k.tools.material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.ItemGenerics;

public class TitaniumMaterial implements ToolMaterial{

    public static final TitaniumMaterial INSTANCE = new TitaniumMaterial();

    @Override
    public float getAttackDamage() {
        return 2.0f;
    }

    @Override
    public int getDurability() {
        return 1874;
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemGenerics.TITANIUM_INGOT);
    }
    
}