package net.slayerrroar.reborn12k.armors;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.ItemGenerics;
import net.slayerrroar.reborn12k.items.ItemMagic;

public enum CustomArmorMaterials implements ArmorMaterial {

    ARCHEOSITE("archeosite", 42, new int[] {5, 9, 11, 6}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            5.0F, 0.2F, ItemGenerics.ARCHEOSITE_INGOT),
    BRONZE("bronze", 19, new int[] {1, 4, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0F, 0.0F, ItemGenerics.BRONZE_INGOT),
    STEEL("steel", 33, new int[] {3, 6, 8, 3}, 5, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            3.0F, 0.0F, ItemGenerics.STEEL_INGOT),
    TUNGSTENSTEEL("tungstensteel", 37, new int[] {3, 6, 8, 3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            4.0F, 0.2F, ItemGenerics.TUNGSTENSTEEL_INGOT),
    THELOSITE("bronze", 42, new int[] {5, 9, 11, 6}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            6.0F, 0.2F, ItemGenerics.THELOSITE_INGOT),
    TITANIUM("titanium", 36, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0.0F, 0.0F, ItemGenerics.TITANIUM_INGOT),
    ADVANCED_ALLOY("advanced_alloy", 41, new int[] {3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            2.0F, 0.2F, ItemGenerics.ADVANCED_ALLOY_INGOT),
    IRIDIUM_ALLOY("iridium_alloy", 46, new int[] {5, 9, 11, 6}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            4.0F, 0.2F, ItemGenerics.IRIDIUM_ALLOY_INGOT),
    ELECTRUM("electrum", 29, new int[] {3, 6, 8, 3}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0F, 0.0F, ItemGenerics.ELECTRUM_INGOT),
    SIGNALUM("signalum", 34, new int[] {3, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3.0F, 0.2F, ItemGenerics.SIGNALUM_INGOT),
    ENDERIUM("enderium", 38, new int[] {5, 9, 11, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            5.0F, 0.2F, ItemGenerics.ENDERIUM_INGOT),

    MAGISTEEL("magisteel", 36, new int[] {3, 6, 8, 3}, 17, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            2.0F, 0.0F, ItemGenerics.MAGISTEEL_INGOT),
    ORICHALCUM("orichalcum", 41, new int[] {3, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3.0F, 0.2F, ItemGenerics.ORICHALCUM_INGOT),
    MITHRIL("mithril", 46, new int[] {5, 9, 11, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            5.0F, 0.2F, ItemGenerics.MITHRIL_INGOT),

    MAGE("mage", 38, new int[] {3, 6, 8, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
            2.0F, 0.2F, ItemMagic.MANAWEAVE),
    POWER("power", 50, new int[] {5, 9, 11, 6}, 12, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            7.0F, 0.4F, ItemGenerics.CERAMITE_PLATE);

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private final String name;
    private final int durability, enchantability;
    private final int[] protectionValues;
    private final SoundEvent sound;
    private final float toughness, knockbackRes;
    private final Item repairIngredient;

    CustomArmorMaterials(String name, int durability, int[] protectionValues, int enchantability, SoundEvent sound, float toughness, float knockbackRes, Item repairIngredient) {
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