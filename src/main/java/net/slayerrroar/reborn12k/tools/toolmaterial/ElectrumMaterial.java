package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.RebornItems;

public class ElectrumMaterial implements ToolMaterial{

    public static final ElectrumMaterial INSTANCE = new ElectrumMaterial();

    @Override
    public float getAttackDamage() {
        return 3.0f;
    }

    @Override
    public int getDurability() {
        return 1249;
    }

    @Override
    public int getEnchantability() {
        return 17;
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
        return Ingredient.ofItems(RebornItems.ELECTRUM_INGOT);
    }
    
}