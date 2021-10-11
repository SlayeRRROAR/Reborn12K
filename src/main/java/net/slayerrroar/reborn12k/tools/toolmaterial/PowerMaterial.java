package net.slayerrroar.reborn12k.tools.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.AdvancedItems;
import net.slayerrroar.reborn12k.items.BaseItems;

public class PowerMaterial implements ToolMaterial {

    public static final Yamato INSTANCE = new Yamato();

    @Override
    public float getAttackDamage() {
        return 5.0f;
    }

    @Override
    public int getDurability() {
        return 2222;
    }

    @Override
    public int getEnchantability() {
        return 20;
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
        return Ingredient.ofItems(AdvancedItems.CERAMITE_PLATE);
    }


}
