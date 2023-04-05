package net.slayerrroar.reborn12k.tools.material;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NetheriteMaterial implements ToolMaterial{

    public static final NetheriteMaterial INSTANCE = new NetheriteMaterial();

    @Override
    public float getAttackDamage() {
        return 4.0f;
    }

    @Override
    public int getDurability() {
        return 2031;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    }
    
}