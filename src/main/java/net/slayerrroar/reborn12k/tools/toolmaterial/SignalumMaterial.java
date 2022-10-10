package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.BaseItems;

public class SignalumMaterial implements ToolMaterial{

    public static final SignalumMaterial INSTANCE = new SignalumMaterial();

    @Override
    public float getAttackDamage() {
        return 4.0f;
    }

    @Override
    public int getDurability() {
        return 1625;
    }

    @Override
    public int getEnchantability() {
        return 22;
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
        return Ingredient.ofItems(BaseItems.SIGNALUM_INGOT);
    }
    
}