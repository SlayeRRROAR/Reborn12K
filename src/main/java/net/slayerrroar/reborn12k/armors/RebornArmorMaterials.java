package net.slayerrroar.reborn12k.armors;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.RebornItems;
import net.slayerrroar.reborn12k.util.RebornTagsUtil;

import java.util.function.Supplier;

@SuppressWarnings({"deprecation", "rawtypes"})
public enum RebornArmorMaterials implements ArmorMaterial {

    ARCHEOSITE("archeosite", 42, new int[] {5, 9, 11, 6}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            5f, 0.2f, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.ARCHEOSITE_INGOTS); }),
    BRONZE("bronze", 19, new int[] {1, 4, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0f, 0f, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.BRONZE_INGOTS); }),
    STEEL("steel", 33, new int[] {3, 6, 8, 3}, 5, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            3f, 0f, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.STEEL_INGOTS); }),
    TUNGSTENSTEEL("tungstensteel", 37, new int[] {3, 6, 8, 3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            4f, 0.2f, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.TUNGSTENSTEEL_INGOTS); }),
    THELOSITE("thelosite", 42, new int[] {5, 9, 11, 6}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            6f, 0.2f, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.THELOSITE_INGOTS); }),
    TITANIUM("titanium", 36, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0f, 0f, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.TITANIUM_INGOTS); }),
    ADVANCED_ALLOY("advanced_alloy", 41, new int[] {3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            2f, 0.2f, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.ADVANCED_ALLOY_INGOTS); }),
    IRIDIUM_ALLOY("iridium_alloy", 46, new int[] {5, 9, 11, 6}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            4f, 0.2f, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.IRIDIUM_ALLOY_INGOTS); }),
    ELECTRUM("electrum", 29, new int[] {3, 6, 8, 3}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2f, 0f, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.ELECTRUM_INGOTS); }),
    SIGNALUM("signalum", 34, new int[] {3, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3f, 0.2f, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.SIGNALUM_INGOTS); }),
    ENDERIUM("enderium", 38, new int[] {5, 9, 11, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            5f, 0.2f, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.ENDERIUM_INGOTS); }),

    MAGISTEEL("magisteel", 36, new int[] {3, 6, 8, 3}, 17, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            2f, 0f, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.MAGISTEEL_INGOTS); }),
    ORICHALCUM("orichalcum", 41, new int[] {3, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3f, 0.2f, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.ORICHALCUM_INGOTS); }),
    MITHRIL("mithril", 46, new int[] {5, 9, 11, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            5f, 0.2f, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.MITHRIL_INGOTS); }),

    EMETAL("emetal", 34, new int[] {3, 6, 8, 3}, 7, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            4f, 0.2f, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.EMETAL_INGOTS); }),
    DARK_ALLOY("dark_alloy", 38, new int[] {5, 9, 11, 6}, 13, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            6f, 0.4f, () -> { return Ingredient.fromTag(RebornTagsUtil.Items.DARK_ALLOY_INGOTS); }),

    MAGE("mage", 38, new int[] {3, 6, 8, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
            2f, 0.2f, () -> { return Ingredient.ofItems(RebornItems.MANAWEAVE); }),
    POWER("power", 50, new int[] {5, 9, 11, 6}, 12, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3f, 0.4f, () -> { return Ingredient.ofItems(RebornItems.CERAMITE_PLATE); });

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private final String name;
    private final int durability, enchantability;
    private final int[] protectionValues;
    private final SoundEvent sound;
    private final float toughness, knockbackRes;
    private final Lazy<Ingredient> repairIngredient;

    RebornArmorMaterials(String name, int durability, int[] protectionValues, int enchantability, SoundEvent sound, float toughness, float knockbackRes, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durability = durability;
        this.protectionValues = protectionValues;
        this.enchantability = enchantability;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackRes = knockbackRes;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()] * this.durability;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return this.protectionValues[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return Reborn12K.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackRes;
    }
}