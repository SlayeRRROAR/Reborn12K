package net.slayerrroar.reborn12k.armors;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.armors.armor_item.MageArmorItem;
import net.slayerrroar.reborn12k.armors.armor_material.*;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class RebornArmors {

    public static final ArmorMaterial TITANIUM_ARMOR = new TitaniumArmor();
    public static final ArmorMaterial BRONZE_ARMOR = new BronzeArmor();
    public static final ArmorMaterial ELECTRUM_ARMOR = new ElectrumArmor();
    public static final ArmorMaterial STEEL_ARMOR = new SteelArmor();
    public static final ArmorMaterial SIGNALUM_ARMOR = new SignalumArmor();
    public static final ArmorMaterial ADVANCED_ALLOY_ARMOR = new AdvancedAlloyArmor();
    public static final ArmorMaterial TUNGSTENSTEEL_ARMOR = new TungstensteelArmor();
    public static final ArmorMaterial ENDERIUM_ARMOR = new EnderiumArmor();
    public static final ArmorMaterial IRIDIUM_ALLOY_ARMOR = new IridiumAlloyArmor();
    public static final ArmorMaterial THELOSITE_ARMOR = new ThelositeArmor();
    public static final ArmorMaterial ARCHEOSITE_ARMOR = new ArcheositeArmor();

    public static final ArmorMaterial NICHIRIN_ARMOR = new NichirinArmor();
    public static final ArmorMaterial MAGE_ARMOR = new MageArmor();
    public static final ArmorMaterial POWER_ARMOR = new PowerArmor();

    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet", new ArmorItem(TITANIUM_ARMOR, EquipmentSlot.HEAD, new Item.Settings()));
    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate", new ArmorItem(TITANIUM_ARMOR, EquipmentSlot.CHEST, new Item.Settings()));
    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings", new ArmorItem(TITANIUM_ARMOR, EquipmentSlot.LEGS, new Item.Settings()));
    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots", new ArmorItem(TITANIUM_ARMOR, EquipmentSlot.FEET, new Item.Settings()));

    public static final Item BRONZE_HELMET = registerItem("bronze_helmet", new ArmorItem(BRONZE_ARMOR, EquipmentSlot.HEAD, new Item.Settings()));
    public static final Item BRONZE_CHESTPLATE = registerItem("bronze_chestplate", new ArmorItem(BRONZE_ARMOR, EquipmentSlot.CHEST, new Item.Settings()));
    public static final Item BRONZE_LEGGINGS = registerItem("bronze_leggings", new ArmorItem(BRONZE_ARMOR, EquipmentSlot.LEGS, new Item.Settings()));
    public static final Item BRONZE_BOOTS = registerItem("bronze_boots", new ArmorItem(BRONZE_ARMOR, EquipmentSlot.FEET, new Item.Settings()));

    public static final Item ELECTRUM_HELMET = registerItem("electrum_helmet", new ArmorItem(ELECTRUM_ARMOR, EquipmentSlot.HEAD, new Item.Settings()));
    public static final Item ELECTRUM_CHESTPLATE = registerItem("electrum_chestplate", new ArmorItem(ELECTRUM_ARMOR, EquipmentSlot.CHEST, new Item.Settings()));
    public static final Item ELECTRUM_LEGGINGS = registerItem("electrum_leggings", new ArmorItem(ELECTRUM_ARMOR, EquipmentSlot.LEGS, new Item.Settings()));
    public static final Item ELECTRUM_BOOTS = registerItem("electrum_boots", new ArmorItem(ELECTRUM_ARMOR, EquipmentSlot.FEET, new Item.Settings()));

    public static final Item STEEL_HELMET = registerItem("steel_helmet", new ArmorItem(STEEL_ARMOR, EquipmentSlot.HEAD, new Item.Settings()));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate", new ArmorItem(STEEL_ARMOR, EquipmentSlot.CHEST, new Item.Settings()));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings", new ArmorItem(STEEL_ARMOR, EquipmentSlot.LEGS, new Item.Settings()));
    public static final Item STEEL_BOOTS = registerItem("steel_boots", new ArmorItem(STEEL_ARMOR, EquipmentSlot.FEET, new Item.Settings()));

    public static final Item SIGNALUM_HELMET = registerItem("signalum_helmet", new ArmorItem(SIGNALUM_ARMOR, EquipmentSlot.HEAD, new Item.Settings()));
    public static final Item SIGNALUM_CHESTPLATE = registerItem("signalum_chestplate", new ArmorItem(SIGNALUM_ARMOR, EquipmentSlot.CHEST, new Item.Settings()));
    public static final Item SIGNALUM_LEGGINGS = registerItem("signalum_leggings", new ArmorItem(SIGNALUM_ARMOR, EquipmentSlot.LEGS, new Item.Settings()));
    public static final Item SIGNALUM_BOOTS = registerItem("signalum_boots", new ArmorItem(SIGNALUM_ARMOR, EquipmentSlot.FEET, new Item.Settings()));

    public static final Item ADVANCED_ALLOY_HELMET = registerItem("advanced_alloy_helmet", new ArmorItem(ADVANCED_ALLOY_ARMOR, EquipmentSlot.HEAD, new Item.Settings()));
    public static final Item ADVANCED_ALLOY_CHESTPLATE = registerItem("advanced_alloy_chestplate", new ArmorItem(ADVANCED_ALLOY_ARMOR, EquipmentSlot.CHEST, new Item.Settings()));
    public static final Item ADVANCED_ALLOY_LEGGINGS = registerItem("advanced_alloy_leggings", new ArmorItem(ADVANCED_ALLOY_ARMOR, EquipmentSlot.LEGS, new Item.Settings()));
    public static final Item ADVANCED_ALLOY_BOOTS = registerItem("advanced_alloy_boots", new ArmorItem(ADVANCED_ALLOY_ARMOR, EquipmentSlot.FEET, new Item.Settings()));

    public static final Item TUNGSTENSTEEL_HELMET = registerItem("tungstensteel_helmet", new ArmorItem(TUNGSTENSTEEL_ARMOR, EquipmentSlot.HEAD, new Item.Settings().fireproof()));
    public static final Item TUNGSTENSTEEL_CHESTPLATE = registerItem("tungstensteel_chestplate", new ArmorItem(TUNGSTENSTEEL_ARMOR, EquipmentSlot.CHEST, new Item.Settings().fireproof()));
    public static final Item TUNGSTENSTEEL_LEGGINGS = registerItem("tungstensteel_leggings", new ArmorItem(TUNGSTENSTEEL_ARMOR, EquipmentSlot.LEGS, new Item.Settings().fireproof()));
    public static final Item TUNGSTENSTEEL_BOOTS = registerItem("tungstensteel_boots", new ArmorItem(TUNGSTENSTEEL_ARMOR, EquipmentSlot.FEET, new Item.Settings().fireproof()));

    public static final Item ENDERIUM_HELMET = registerItem("enderium_helmet", new ArmorItem(ENDERIUM_ARMOR, EquipmentSlot.HEAD, new Item.Settings().fireproof()));
    public static final Item ENDERIUM_CHESTPLATE = registerItem("enderium_chestplate", new ArmorItem(ENDERIUM_ARMOR, EquipmentSlot.CHEST, new Item.Settings().fireproof()));
    public static final Item ENDERIUM_LEGGINGS = registerItem("enderium_leggings", new ArmorItem(ENDERIUM_ARMOR, EquipmentSlot.LEGS, new Item.Settings().fireproof()));
    public static final Item ENDERIUM_BOOTS = registerItem("enderium_boots", new ArmorItem(ENDERIUM_ARMOR, EquipmentSlot.FEET, new Item.Settings().fireproof()));

    public static final Item IRIDIUM_ALLOY_HELMET = registerItem("iridium_alloy_helmet", new ArmorItem(IRIDIUM_ALLOY_ARMOR, EquipmentSlot.HEAD, new Item.Settings().fireproof()));
    public static final Item IRIDIUM_ALLOY_CHESTPLATE = registerItem("iridium_alloy_chestplate", new ArmorItem(IRIDIUM_ALLOY_ARMOR, EquipmentSlot.CHEST, new Item.Settings().fireproof()));
    public static final Item IRIDIUM_ALLOY_LEGGINGS = registerItem("iridium_alloy_leggings", new ArmorItem(IRIDIUM_ALLOY_ARMOR, EquipmentSlot.LEGS, new Item.Settings().fireproof()));
    public static final Item IRIDIUM_ALLOY_BOOTS = registerItem("iridium_alloy_boots", new ArmorItem(IRIDIUM_ALLOY_ARMOR, EquipmentSlot.FEET, new Item.Settings().fireproof()));

    public static final Item ARCHEOSITE_HELMET = registerItem("archeosite_helmet", new ArmorItem(ARCHEOSITE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().fireproof()));
    public static final Item ARCHEOSITE_CHESTPLATE = registerItem("archeosite_chestplate", new ArmorItem(ARCHEOSITE_ARMOR, EquipmentSlot.CHEST, new Item.Settings().fireproof()));
    public static final Item ARCHEOSITE_LEGGINGS = registerItem("archeosite_leggings", new ArmorItem(ARCHEOSITE_ARMOR, EquipmentSlot.LEGS, new Item.Settings().fireproof()));
    public static final Item ARCHEOSITE_BOOTS = registerItem("archeosite_boots", new ArmorItem(ARCHEOSITE_ARMOR, EquipmentSlot.FEET, new Item.Settings().fireproof()));

    public static final Item THELOSITE_HELMET = registerItem("thelosite_helmet", new ArmorItem(THELOSITE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().fireproof()));
    public static final Item THELOSITE_CHESTPLATE = registerItem("thelosite_chestplate", new ArmorItem(THELOSITE_ARMOR, EquipmentSlot.CHEST, new Item.Settings().fireproof()));
    public static final Item THELOSITE_LEGGINGS = registerItem("thelosite_leggings", new ArmorItem(THELOSITE_ARMOR, EquipmentSlot.LEGS, new Item.Settings().fireproof()));
    public static final Item THELOSITE_BOOTS = registerItem("thelosite_boots", new ArmorItem(THELOSITE_ARMOR, EquipmentSlot.FEET, new Item.Settings().fireproof()));


    public static final Item NICHIRIN_HELMET = registerItem("nichirin_helmet", new ArmorItem(NICHIRIN_ARMOR, EquipmentSlot.HEAD, new Item.Settings().fireproof()));
    public static final Item NICHIRIN_CHESTPLATE = registerItem("nichirin_chestplate", new ArmorItem(NICHIRIN_ARMOR, EquipmentSlot.CHEST, new Item.Settings().fireproof()));
    public static final Item NICHIRIN_LEGGINGS = registerItem("nichirin_leggings", new ArmorItem(NICHIRIN_ARMOR, EquipmentSlot.LEGS, new Item.Settings().fireproof()));
    public static final Item NICHIRIN_BOOTS = registerItem("nichirin_boots", new ArmorItem(NICHIRIN_ARMOR, EquipmentSlot.FEET, new Item.Settings().fireproof()));

    public static final Item MAGE_HELMET = registerItem("mage_helmet", new MageArmorItem(MAGE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().fireproof()));
    public static final Item MAGE_CHESTPLATE = registerItem("mage_chestplate", new MageArmorItem(MAGE_ARMOR, EquipmentSlot.CHEST, new Item.Settings().fireproof()));
    public static final Item MAGE_LEGGINGS = registerItem("mage_leggings", new MageArmorItem(MAGE_ARMOR, EquipmentSlot.LEGS, new Item.Settings().fireproof()));
    public static final Item MAGE_BOOTS = registerItem("mage_boots", new MageArmorItem(MAGE_ARMOR, EquipmentSlot.FEET, new Item.Settings().fireproof()));

    public static final Item POWER_HELMET = registerItem("power_helmet", new ArmorItem(POWER_ARMOR, EquipmentSlot.HEAD, new Item.Settings().fireproof()));
    public static final Item POWER_CHESTPLATE = registerItem("power_chestplate", new ArmorItem(POWER_ARMOR, EquipmentSlot.CHEST, new Item.Settings().fireproof()));
    public static final Item POWER_LEGGINGS = registerItem("power_leggings", new ArmorItem(POWER_ARMOR, EquipmentSlot.LEGS, new Item.Settings().fireproof()));
    public static final Item POWER_BOOTS = registerItem("power_boots", new ArmorItem(POWER_ARMOR, EquipmentSlot.FEET, new Item.Settings().fireproof()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(Reborn12KItemGroup.REBORN12K, TITANIUM_HELMET);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, TITANIUM_CHESTPLATE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, TITANIUM_LEGGINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, TITANIUM_BOOTS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, BRONZE_HELMET);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, BRONZE_CHESTPLATE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, BRONZE_LEGGINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, BRONZE_BOOTS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, ELECTRUM_HELMET);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ELECTRUM_CHESTPLATE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ELECTRUM_LEGGINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ELECTRUM_BOOTS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, STEEL_HELMET);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, STEEL_CHESTPLATE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, STEEL_LEGGINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, STEEL_BOOTS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, SIGNALUM_HELMET);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, SIGNALUM_CHESTPLATE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, SIGNALUM_LEGGINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, SIGNALUM_BOOTS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, ADVANCED_ALLOY_HELMET);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ADVANCED_ALLOY_CHESTPLATE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ADVANCED_ALLOY_LEGGINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ADVANCED_ALLOY_BOOTS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, TUNGSTENSTEEL_HELMET);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, TUNGSTENSTEEL_CHESTPLATE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, TUNGSTENSTEEL_LEGGINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, TUNGSTENSTEEL_BOOTS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, ENDERIUM_HELMET);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ENDERIUM_CHESTPLATE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ENDERIUM_LEGGINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ENDERIUM_BOOTS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, IRIDIUM_ALLOY_HELMET);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, IRIDIUM_ALLOY_CHESTPLATE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, IRIDIUM_ALLOY_LEGGINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, IRIDIUM_ALLOY_BOOTS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, ARCHEOSITE_HELMET);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ARCHEOSITE_CHESTPLATE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ARCHEOSITE_LEGGINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ARCHEOSITE_BOOTS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, THELOSITE_HELMET);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, THELOSITE_CHESTPLATE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, THELOSITE_LEGGINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, THELOSITE_BOOTS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, NICHIRIN_HELMET);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, NICHIRIN_CHESTPLATE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, NICHIRIN_LEGGINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, NICHIRIN_BOOTS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, MAGE_HELMET);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, MAGE_CHESTPLATE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, MAGE_LEGGINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, MAGE_BOOTS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, POWER_HELMET);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, POWER_CHESTPLATE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, POWER_LEGGINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, POWER_BOOTS);

    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Armors");
    }
}