package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.AdvancedItems;
import net.slayerrroar.reborn12k.items.BaseItems;

public class HFBMaterial implements ToolMaterial {

    public static final HFBMaterial INSTANCE = new HFBMaterial();

    @Override
    public float getAttackDamage() {
        return 5.0f;
    }

    @Override
    public int getDurability() {
        return 2014;
    }

    @Override
    public int getEnchantability() {
        return 17;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(BaseItems.COBALT);
    }


}
