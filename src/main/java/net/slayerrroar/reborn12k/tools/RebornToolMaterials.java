package net.slayerrroar.reborn12k.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.GenericItems;

public enum RebornToolMaterials implements ToolMaterial {

    ARCHEOSITE(5, 2640, 14.0f, 7.0f, 22, GenericItems.ARCHEOSITE_INGOT),
    BRONZE(2, 325, 5.0f, 1.0f, 14, GenericItems.BRONZE_INGOT),
    STEEL(3, 1561, 9.0f, 4.0f, 5, GenericItems.STEEL_INGOT),
    TUNGSTENSTEEL(4, 2031, 10.0f, 5.0f, 8, GenericItems.TUNGSTENSTEEL_INGOT),
    THELOSITE(5, 2640, 15.0f, 8.0f, 15, GenericItems.THELOSITE_INGOT),
    TITANIUM(3, 1874, 7.0f, 2.0f, 10, GenericItems.TITANIUM_INGOT),
    ADVANCED_ALLOY(4, 2437, 8.0f, 3.0f, 15, GenericItems.ADVANCED_ALLOY_INGOT),
    IRIDIUM_ALLOY(5, 3168, 13.0f, 6.0f, 22, GenericItems.IRIDIUM_ALLOY_INGOT),
    ELECTRUM(3, 1249, 8.0f, 3.0f, 17, GenericItems.ELECTRUM_INGOT),
    SIGNALUM(4, 1625, 9.0f, 4.0f, 22, GenericItems.SIGNALUM_INGOT),
    ENDERIUM(5, 2112, 14.0f, 7.0f, 30, GenericItems.ENDERIUM_INGOT),

    MAGISTEEL(3, 1874, 8.0f, 3.0f, 17, GenericItems.MAGISTEEL_INGOT),
    ORICHALCUM(4, 2437, 9.0f, 4.0f, 22, GenericItems.ORICHALCUM_INGOT),
    MITHRIL(5, 3168, 14.0f, 7.0f, 30, GenericItems.MITHRIL_INGOT),

    SILVER(3, 1689, 6.0f, 2.0f, 18, GenericItems.SILVER_INGOT),
    CUTTER237(4, 2370, 8.0f, 6.0f, 18, GenericItems.CASING_MK237),
    DMC(4, 1930, 8.0f, 6.0f, 18, GenericItems.DEMONIC_METAL_INGOT),
    HFB(4, 1689, 8.0f, 5.0f, 8, GenericItems.LUMIUM_INGOT),
    POWER(4, 2222, 8.0f, 5.0f, 12, GenericItems.CERAMITE_PLATE);

    private final int durability, enchantability, miningLevel;
    private final float attackDamage, miningSpeedMultiplier;
    private final Item repairIngredient;

    RebornToolMaterials(int miningLevel, int durability, float miningSpeedMultiplier, float attackDamage, int enchantability, Item repairIngredient) {
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