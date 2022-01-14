package net.slayerrroar.reborn12k.armors;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.armors.armor_item.MageArmorItem;
import net.slayerrroar.reborn12k.armors.armor_material.*;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class Armors {

    public static final ArmorMaterial BRONZE_ARMOR = new BronzeArmor();
    public static final ArmorMaterial CARBON_STEEL_ARMOR = new CarbonSteelArmor();
    public static final ArmorMaterial BLAZING_STEEL_ARMOR = new BlazingSteelArmor();
    public static final ArmorMaterial ARCHEOSITE_ARMOR = new ArcheositeArmor();
    public static final ArmorMaterial THELOSITE_ARMOR = new ThelositeArmor();
    public static final ArmorMaterial MAGE_ARMOR = new MageArmor();
    public static final ArmorMaterial POWER_ARMOR = new PowerArmor();
    public static final ArmorMaterial LONG_FALL_ARMOR = new LongFallArmor();

    public static final Item BRONZE_HELMET = new ArmorItem(BRONZE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item BRONZE_CHESTPLATE = new ArmorItem(BRONZE_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item BRONZE_LEGGINGS = new ArmorItem(BRONZE_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item BRONZE_BOOTS = new ArmorItem(BRONZE_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    
    public static final Item CARBON_STEEL_HELMET = new ArmorItem(CARBON_STEEL_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item CARBON_STEEL_CHESTPLATE = new ArmorItem(CARBON_STEEL_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item CARBON_STEEL_LEGGINGS = new ArmorItem(CARBON_STEEL_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item CARBON_STEEL_BOOTS = new ArmorItem(CARBON_STEEL_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    
    public static final Item BLAZING_STEEL_HELMET = new ArmorItem(BLAZING_STEEL_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item BLAZING_STEEL_CHESTPLATE = new ArmorItem(BLAZING_STEEL_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item BLAZING_STEEL_LEGGINGS = new ArmorItem(BLAZING_STEEL_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item BLAZING_STEEL_BOOTS = new ArmorItem(BLAZING_STEEL_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item ARCHEOSITE_HELMET = new ArmorItem(ARCHEOSITE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ARCHEOSITE_CHESTPLATE = new ArmorItem(ARCHEOSITE_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ARCHEOSITE_LEGGINGS = new ArmorItem(ARCHEOSITE_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ARCHEOSITE_BOOTS = new ArmorItem(ARCHEOSITE_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    
    public static final Item THELOSITE_HELMET = new ArmorItem(THELOSITE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item THELOSITE_CHESTPLATE = new ArmorItem(THELOSITE_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item THELOSITE_LEGGINGS = new ArmorItem(THELOSITE_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item THELOSITE_BOOTS = new ArmorItem(THELOSITE_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));

    
    
    public static final Item MAGE_HELMET = new MageArmorItem(MAGE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item MAGE_CHESTPLATE = new MageArmorItem(MAGE_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item MAGE_LEGGINGS = new MageArmorItem(MAGE_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item MAGE_BOOTS = new MageArmorItem(MAGE_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item POWER_HELMET = new ArmorItem(POWER_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item POWER_CHESTPLATE = new ArmorItem(POWER_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item POWER_LEGGINGS = new ArmorItem(POWER_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item POWER_BOOTS = new ArmorItem(POWER_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item LONG_FALL_BOOTS = new ArmorItem(LONG_FALL_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));

    public static void register(){

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_helmet"), BRONZE_HELMET);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_chestplate"), BRONZE_CHESTPLATE);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_leggings"), BRONZE_LEGGINGS);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_boots"), BRONZE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "carbon_steel_helmet"), CARBON_STEEL_HELMET);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "carbon_steel_chestplate"), CARBON_STEEL_CHESTPLATE);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "carbon_steel_leggings"), CARBON_STEEL_LEGGINGS);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "carbon_steel_boots"), CARBON_STEEL_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_helmet"), BLAZING_STEEL_HELMET);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_chestplate"), BLAZING_STEEL_CHESTPLATE);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_leggings"), BLAZING_STEEL_LEGGINGS);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_boots"), BLAZING_STEEL_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_helmet"), ARCHEOSITE_HELMET);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_chestplate"), ARCHEOSITE_CHESTPLATE);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_leggings"), ARCHEOSITE_LEGGINGS);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_boots"), ARCHEOSITE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_helmet"), THELOSITE_HELMET);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_chestplate"), THELOSITE_CHESTPLATE);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_leggings"), THELOSITE_LEGGINGS);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_boots"), THELOSITE_BOOTS);
        

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "mage_helmet"), MAGE_HELMET);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "mage_chestplate"), MAGE_CHESTPLATE);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "mage_leggings"), MAGE_LEGGINGS);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "mage_boots"), MAGE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "power_helmet"), POWER_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "power_chestplate"), POWER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "power_leggings"), POWER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "power_boots"), POWER_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "long_fall_boots"), LONG_FALL_BOOTS);

        Reborn12K.LOGGER.info("Registering Armors for " + Reborn12K.MOD_ID);

    }


}
