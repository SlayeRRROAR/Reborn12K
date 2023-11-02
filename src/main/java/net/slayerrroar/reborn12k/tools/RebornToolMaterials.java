package net.slayerrroar.reborn12k.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.slayerrroar.reborn12k.items.RebornItems;

public enum RebornToolMaterials implements ToolMaterial {

    ARCHEOSITE(5, 2640, 14f, 7f, 22, RebornItems.ARCHEOSITE_INGOT),
    BRONZE(2, 325, 5f, 1f, 14, RebornItems.BRONZE_INGOT),
    STEEL(3, 1561, 9f, 4f, 5, RebornItems.STEEL_INGOT),
    TUNGSTENSTEEL(4, 2031, 10f, 5f, 8, RebornItems.TUNGSTENSTEEL_INGOT),
    THELOSITE(5, 2640, 15f, 8f, 15, RebornItems.THELOSITE_INGOT),
    TITANIUM(3, 1874, 7f, 2f, 10, RebornItems.TITANIUM_INGOT),
    ADVANCED_ALLOY(4, 2437, 8f, 3f, 15, RebornItems.ADVANCED_ALLOY_INGOT),
    IRIDIUM_ALLOY(5, 3168, 13f, 6f, 22, RebornItems.IRIDIUM_ALLOY_INGOT),
    ELECTRUM(3, 1249, 8f, 3f, 17, RebornItems.ELECTRUM_INGOT),
    SIGNALUM(4, 1625, 9f, 4f, 22, RebornItems.SIGNALUM_INGOT),
    ENDERIUM(5, 2112, 14f, 7f, 30, RebornItems.ENDERIUM_INGOT),

    MAGISTEEL(3, 1874, 8f, 3f, 17, RebornItems.MAGISTEEL_INGOT),
    ORICHALCUM(4, 2437, 9f, 4f, 22, RebornItems.ORICHALCUM_INGOT),
    MITHRIL(5, 3168, 14f, 7f, 30, RebornItems.MITHRIL_INGOT),

    SILVER(3, 1689, 6f, 2f, 18, RebornItems.SILVER_INGOT),
    CUTTER237(4, 2370, 8f, 6f, 18, RebornItems.CASING_MK237),
    DMC(4, 1930, 8f, 6f, 18, RebornItems.DEMONIC_METAL_INGOT),
    HFB(4, 1689, 8f, 5f, 8, RebornItems.LUMIUM_INGOT),
    POWER(4, 2222, 8f, 5f, 12, RebornItems.CERAMITE_PLATE);

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