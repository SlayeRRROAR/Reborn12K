package net.slayerrroar.reborn12k.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.ItemGenerics;

public enum CustomToolMaterials implements ToolMaterial {

    ARCHEOSITE(5, 2640, 14.0f, 7.0f, 22, ItemGenerics.ARCHEOSITE_INGOT),
    BRONZE(2, 325, 5.0f, 1.0f, 14, ItemGenerics.BRONZE_INGOT),
    STEEL(3, 1561, 9.0f, 4.0f, 5, ItemGenerics.STEEL_INGOT),
    TUNGSTENSTEEL(4, 2031, 10.0f, 5.0f, 8, ItemGenerics.TUNGSTENSTEEL_INGOT),
    THELOSITE(5, 2640, 15.0f, 8.0f, 15, ItemGenerics.THELOSITE_INGOT),
    TITANIUM(3, 1874, 7.0f, 2.0f, 10, ItemGenerics.TITANIUM_INGOT),
    ADVANCED_ALLOY(4, 2437, 8.0f, 3.0f, 15, ItemGenerics.ADVANCED_ALLOY_INGOT),
    IRIDIUM_ALLOY(5, 3168, 13.0f, 6.0f, 22, ItemGenerics.IRIDIUM_ALLOY_INGOT),
    ELECTRUM(3, 1249, 8.0f, 3.0f, 17, ItemGenerics.ELECTRUM_INGOT),
    SIGNALUM(4, 1625, 9.0f, 4.0f, 22, ItemGenerics.SIGNALUM_INGOT),
    ENDERIUM(5, 2112, 14.0f, 7.0f, 30, ItemGenerics.ENDERIUM_INGOT),

    MAGISTEEL(3, 1874, 8.0f, 3.0f, 17, ItemGenerics.MAGISTEEL_INGOT),
    ORICHALCUM(4, 2437, 9.0f, 4.0f, 22, ItemGenerics.ORICHALCUM_INGOT),
    MITHRIL(5, 3168, 14.0f, 7.0f, 30, ItemGenerics.MITHRIL_INGOT),

    SILVER(3, 1689, 6.0f, 2.0f, 18, ItemGenerics.SILVER_INGOT),
    CUTTER237(4, 2370, 8.0f, 6.0f, 18, ItemGenerics.CASING_MK237),
    DMC(4, 1930, 8.0f, 6.0f, 18, ItemGenerics.DEMONIC_METAL_INGOT),
    HFB(4, 1689, 8.0f, 5.0f, 8, ItemGenerics.LUMIUM_INGOT),
    POWER(4, 2222, 8.0f, 5.0f, 12, ItemGenerics.CERAMITE_PLATE);

    private final int durability, enchantability, miningLevel;
    private final float attackDamage, miningSpeedMultiplier;
    private final Item repairIngredient;

    CustomToolMaterials(int miningLevel, int durability, float miningSpeedMultiplier, float attackDamage, int enchantability, Item repairIngredient) {
        this.attackDamage = attackDamage;
        this.durability = durability;
        this.miningLevel = miningLevel;
        this.enchantability = enchantability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofStacks(this.repairIngredient.getDefaultStack());
    }

}