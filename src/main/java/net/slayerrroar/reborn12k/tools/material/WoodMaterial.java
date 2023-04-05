package net.slayerrroar.reborn12k.tools.material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.slayerrroar.reborn12k.items.ItemGenerics;

public class WoodMaterial implements ToolMaterial{

    public static final WoodMaterial INSTANCE = new WoodMaterial();

    @Override
    public float getAttackDamage() {
        return 0.0f;
    }

    @Override
    public int getDurability() {
        return 59;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 2.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.fromTag(ItemTags.PLANKS);
    }
    
}