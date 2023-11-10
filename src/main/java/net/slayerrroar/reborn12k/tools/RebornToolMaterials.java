package net.slayerrroar.reborn12k.tools;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;
import net.slayerrroar.reborn12k.items.RebornItems;
import net.slayerrroar.reborn12k.util.RebornTagsUtil;

import java.util.function.Supplier;

@SuppressWarnings({"deprecation", "rawtypes"})
public enum RebornToolMaterials implements ToolMaterial {

    ARCHEOSITE(5, 2640, 14f, 7f, 22, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.ARCHEOSITE_INGOTS); }),
    BRONZE(2, 325, 5f, 1f, 14, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.BRONZE_INGOTS); }),
    STEEL(3, 1561, 9f, 4f, 5, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.STEEL_INGOTS); }),
    TUNGSTENSTEEL(4, 2031, 10f, 5f, 8, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.TUNGSTENSTEEL_INGOTS); }),
    THELOSITE(5, 2640, 15f, 8f, 15, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.THELOSITE_INGOTS); }),
    TITANIUM(3, 1874, 7f, 2f, 10, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.TITANIUM_INGOTS); }),
    ADVANCED_ALLOY(4, 2437, 8f, 3f, 15, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.ADVANCED_ALLOY_INGOTS); }),
    IRIDIUM_ALLOY(5, 3168, 13f, 6f, 22, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.IRIDIUM_ALLOY_INGOTS); }),
    ELECTRUM(3, 1249, 8f, 3f, 17, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.ELECTRUM_INGOTS); }),
    SIGNALUM(4, 1625, 9f, 4f, 22, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.SIGNALUM_INGOTS); }),
    ENDERIUM(5, 2112, 14f, 7f, 30, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.ENDERIUM_INGOTS); }),

    MAGISTEEL(3, 1874, 8f, 3f, 17, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.MAGISTEEL_INGOTS); }),
    ORICHALCUM(4, 2437, 9f, 4f, 22, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.ORICHALCUM_INGOTS); }),
    MITHRIL(5, 3168, 14f, 7f, 30, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.MITHRIL_INGOTS); }),

    EMETAL(4, 1874, 9f, 7f, 7, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.EMETAL_INGOTS); }),
    DARK_ALLOY(5, 2112, 13f, 9f, 13, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.DARK_ALLOY_INGOTS); }),

    SILVER(3, 1689, 6f, 2f, 18, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.SILVER_INGOTS); }),
    CUTTER237(4, 2370, 8f, 6f, 18, () -> { return Ingredient.ofItems(RebornItems.CASING_MK237); }),
    DMC(4, 1930, 8f, 6f, 18, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.EMETAL_INGOTS); }),
    HFB(4, 1689, 8f, 5f, 8, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.LUMIUM_INGOTS); }),
    POWER(4, 2222, 8f, 5f, 12, () -> { return Ingredient.ofItems(RebornItems.CERAMITE_PLATE); });

    private final int durability, enchantability, miningLevel;
    private final float attackDamage, miningSpeedMultiplier;
    private final Lazy<Ingredient> repairIngredient;

    RebornToolMaterials(int miningLevel, int durability, float miningSpeedMultiplier, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.attackDamage = attackDamage;
        this.durability = durability;
        this.miningLevel = miningLevel;
        this.enchantability = enchantability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.repairIngredient = new Lazy(repairIngredient);
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
        return this.repairIngredient.get();
    }

}