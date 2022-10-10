package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.SecretItems;

public class DueTreSette implements ToolMaterial{

    public static final DueTreSette INSTANCE = new DueTreSette();

    @Override
    public float getAttackDamage() {
        return 6.0f;
    }

    @Override
    public int getDurability() {
        return 2370;
    }

    @Override
    public int getEnchantability() {
        return 18;
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
        return Ingredient.ofItems(SecretItems.CRYPTOBLADE_PIECE);
    }

}