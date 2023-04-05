package net.slayerrroar.reborn12k.tools.material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;

public class StoneMaterial implements ToolMaterial{

    public static final StoneMaterial INSTANCE = new StoneMaterial();

    @Override
    public float getAttackDamage() {
        return 1.0f;
    }

    @Override
    public int getDurability() {
        return 131;
    }

    @Override
    public int getEnchantability() {
        return 5;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS);
    }
    
}