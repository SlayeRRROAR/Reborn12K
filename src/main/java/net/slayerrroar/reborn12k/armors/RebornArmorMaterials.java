package net.slayerrroar.reborn12k.armors;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.GenericItems;
import net.slayerrroar.reborn12k.items.MagicItems;

public enum RebornArmorMaterials implements ArmorMaterial {

    ARCHEOSITE("archeosite", 42, new int[] {5, 9, 11, 6}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            5f, 0.2f, GenericItems.ARCHEOSITE_INGOT),
    BRONZE("bronze", 19, new int[] {1, 4, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0f, 0f, GenericItems.BRONZE_INGOT),
    STEEL("steel", 33, new int[] {3, 6, 8, 3}, 5, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            3f, 0f, GenericItems.STEEL_INGOT),
    TUNGSTENSTEEL("tungstensteel", 37, new int[] {3, 6, 8, 3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            4f, 0.2f, GenericItems.TUNGSTENSTEEL_INGOT),
    THELOSITE("bronze", 42, new int[] {5, 9, 11, 6}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            6f, 0.2f, GenericItems.THELOSITE_INGOT),
    TITANIUM("titanium", 36, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0f, 0f, GenericItems.TITANIUM_INGOT),
    ADVANCED_ALLOY("advanced_alloy", 41, new int[] {3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            2f, 0.2f, GenericItems.ADVANCED_ALLOY_INGOT),
    IRIDIUM_ALLOY("iridium_alloy", 46, new int[] {5, 9, 11, 6}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            4f, 0.2f, GenericItems.IRIDIUM_ALLOY_INGOT),
    ELECTRUM("electrum", 29, new int[] {3, 6, 8, 3}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2f, 0f, GenericItems.ELECTRUM_INGOT),
    SIGNALUM("signalum", 34, new int[] {3, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3f, 0.2f, GenericItems.SIGNALUM_INGOT),
    ENDERIUM("enderium", 38, new int[] {5, 9, 11, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            5f, 0.2f, GenericItems.ENDERIUM_INGOT),

    MAGISTEEL("magisteel", 36, new int[] {3, 6, 8, 3}, 17, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            2f, 0f, GenericItems.MAGISTEEL_INGOT),
    ORICHALCUM("orichalcum", 41, new int[] {3, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3f, 0.2f, GenericItems.ORICHALCUM_INGOT),
    MITHRIL("mithril", 46, new int[] {5, 9, 11, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            5f, 0.2f, GenericItems.MITHRIL_INGOT),

    MAGE("mage", 38, new int[] {3, 6, 8, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
            2f, 0.2f, MagicItems.MANAWEAVE),
    POWER("power", 50, new int[] {5, 9, 11, 6}, 12, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            7f, 0.4f, GenericItems.CERAMITE_PLATE);

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private final String name;
    private final int durability, enchantability;
    private final int[] protectionValues;
    private final SoundEvent sound;
    private final float toughness, knockbackRes;
    private final Item repairIngredient;

    RebornArmorMaterials(String name, int durability, int[] protectionValues, int enchantability, SoundEvent sound, float toughness, float knockbackRes, Item repairIngredient) {
        this.name = name;
        this.durability = durability;
        this.protectionValues = protectionValues;
        this.enchantability = enchantability;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackRes = knockbackRes;
        this.repairIngredient = repairIngredient;
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
        return Ingredient.ofStacks(this.repairIngredient.getDefaultStack());
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