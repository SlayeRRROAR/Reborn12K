package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GlassMaterial implements ToolMaterial {

    public static final GlassMaterial INSTANCE = new GlassMaterial();

    @Override
    public float getAttackDamage() {
        return 0.0f;
    }

    @Override
    public int getDurability() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.GLASS);
    }

}