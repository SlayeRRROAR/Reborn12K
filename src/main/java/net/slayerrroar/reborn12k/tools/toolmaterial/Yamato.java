package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.BaseItems;

public class Yamato implements ToolMaterial{

    public static final Yamato INSTANCE = new Yamato();

    @Override
    public float getAttackDamage() {
        return 5.0f;
    }

    @Override
    public int getDurability() {
        return 1324;
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 14.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(BaseItems.SILVER_INGOT);
    }

}