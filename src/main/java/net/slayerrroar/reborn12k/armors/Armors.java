package net.slayerrroar.reborn12k.armors;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.armors.armor_material.*;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class Armors {

    public static final ArmorMaterial TITANIUM_ARMOR = new TitaniumArmor();
    public static final ArmorMaterial BRONZE_ARMOR = new BronzeArmor();
    public static final ArmorMaterial ELECTRUM_ARMOR = new ElectrumArmor();
    public static final ArmorMaterial STEEL_ARMOR = new SteelArmor();
    public static final ArmorMaterial SIGNALUM_ARMOR = new SignalumArmor();
    public static final ArmorMaterial ADVANCED_ALLOY_ARMOR = new AdvancedAlloyArmor();
    public static final ArmorMaterial BLAZING_STEEL_ARMOR = new BlazingSteelArmor();
    public static final ArmorMaterial ENDERIUM_ARMOR = new EnderiumArmor();
    public static final ArmorMaterial IRIDIUM_ALLOY_ARMOR = new IridiumAlloyArmor();
    public static final ArmorMaterial THELOSITE_ARMOR = new ThelositeArmor();
    public static final ArmorMaterial ARCHEOSITE_ARMOR = new ArcheositeArmor();
    public static final ArmorMaterial LONG_FALL_ARMOR = new LongFallArmor();

    public static final Item TITANIUM_HELMET = new ArmorItem(TITANIUM_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item TITANIUM_CHESTPLATE = new ArmorItem(TITANIUM_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item TITANIUM_LEGGINGS = new ArmorItem(TITANIUM_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item TITANIUM_BOOTS = new ArmorItem(TITANIUM_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item BRONZE_HELMET = new ArmorItem(BRONZE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item BRONZE_CHESTPLATE = new ArmorItem(BRONZE_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item BRONZE_LEGGINGS = new ArmorItem(BRONZE_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item BRONZE_BOOTS = new ArmorItem(BRONZE_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item ELECTRUM_HELMET = new ArmorItem(ELECTRUM_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ELECTRUM_CHESTPLATE = new ArmorItem(ELECTRUM_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ELECTRUM_LEGGINGS = new ArmorItem(ELECTRUM_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ELECTRUM_BOOTS = new ArmorItem(ELECTRUM_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item STEEL_HELMET = new ArmorItem(STEEL_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item STEEL_CHESTPLATE = new ArmorItem(STEEL_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item STEEL_LEGGINGS = new ArmorItem(STEEL_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item STEEL_BOOTS = new ArmorItem(STEEL_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item SIGNALUM_HELMET = new ArmorItem(SIGNALUM_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item SIGNALUM_CHESTPLATE = new ArmorItem(SIGNALUM_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item SIGNALUM_LEGGINGS = new ArmorItem(SIGNALUM_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item SIGNALUM_BOOTS = new ArmorItem(SIGNALUM_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item ADVANCED_ALLOY_HELMET = new ArmorItem(ADVANCED_ALLOY_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ADVANCED_ALLOY_CHESTPLATE = new ArmorItem(ADVANCED_ALLOY_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ADVANCED_ALLOY_LEGGINGS = new ArmorItem(ADVANCED_ALLOY_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ADVANCED_ALLOY_BOOTS = new ArmorItem(ADVANCED_ALLOY_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item BLAZING_STEEL_HELMET = new ArmorItem(BLAZING_STEEL_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item BLAZING_STEEL_CHESTPLATE = new ArmorItem(BLAZING_STEEL_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item BLAZING_STEEL_LEGGINGS = new ArmorItem(BLAZING_STEEL_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item BLAZING_STEEL_BOOTS = new ArmorItem(BLAZING_STEEL_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item ENDERIUM_HELMET = new ArmorItem(ENDERIUM_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ENDERIUM_CHESTPLATE = new ArmorItem(ENDERIUM_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ENDERIUM_LEGGINGS = new ArmorItem(ENDERIUM_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ENDERIUM_BOOTS = new ArmorItem(ENDERIUM_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item IRIDIUM_ALLOY_HELMET = new ArmorItem(IRIDIUM_ALLOY_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item IRIDIUM_ALLOY_CHESTPLATE = new ArmorItem(IRIDIUM_ALLOY_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item IRIDIUM_ALLOY_LEGGINGS = new ArmorItem(IRIDIUM_ALLOY_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item IRIDIUM_ALLOY_BOOTS = new ArmorItem(IRIDIUM_ALLOY_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item THELOSITE_HELMET = new ArmorItem(THELOSITE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item THELOSITE_CHESTPLATE = new ArmorItem(THELOSITE_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item THELOSITE_LEGGINGS = new ArmorItem(THELOSITE_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item THELOSITE_BOOTS = new ArmorItem(THELOSITE_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item ARCHEOSITE_HELMET = new ArmorItem(ARCHEOSITE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ARCHEOSITE_CHESTPLATE = new ArmorItem(ARCHEOSITE_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ARCHEOSITE_LEGGINGS = new ArmorItem(ARCHEOSITE_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ARCHEOSITE_BOOTS = new ArmorItem(ARCHEOSITE_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));


    public static final Item LONG_FALL_BOOTS = new ArmorItem(LONG_FALL_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Reborn12KItemGroup.REBORN12K));


    public static void register() {

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "titanium_helmet"), TITANIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "titanium_chestplate"), TITANIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "titanium_leggings"), TITANIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "titanium_boots"), TITANIUM_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_helmet"), BRONZE_HELMET);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_chestplate"), BRONZE_CHESTPLATE);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_leggings"), BRONZE_LEGGINGS);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_boots"), BRONZE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "electrum_helmet"), ELECTRUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "electrum_chestplate"), ELECTRUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "electrum_leggings"), ELECTRUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "electrum_boots"), ELECTRUM_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "steel_helmet"), STEEL_HELMET);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "steel_chestplate"), STEEL_CHESTPLATE);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "steel_leggings"), STEEL_LEGGINGS);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "steel_boots"), STEEL_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "signalum_helmet"), SIGNALUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "signalum_chestplate"), SIGNALUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "signalum_leggings"), SIGNALUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "signalum_boots"), SIGNALUM_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "advanced_alloy_helmet"), ADVANCED_ALLOY_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "advanced_alloy_chestplate"), ADVANCED_ALLOY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "advanced_alloy_leggings"), ADVANCED_ALLOY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "advanced_alloy_boots"), ADVANCED_ALLOY_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_helmet"), BLAZING_STEEL_HELMET);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_chestplate"), BLAZING_STEEL_CHESTPLATE);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_leggings"), BLAZING_STEEL_LEGGINGS);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_boots"), BLAZING_STEEL_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "enderium_helmet"), ENDERIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "enderium_chestplate"), ENDERIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "enderium_leggings"), ENDERIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "enderium_boots"), ENDERIUM_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "iridium_alloy_helmet"), IRIDIUM_ALLOY_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "iridium_alloy_chestplate"), IRIDIUM_ALLOY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "iridium_alloy_leggings"), IRIDIUM_ALLOY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "iridium_alloy_boots"), IRIDIUM_ALLOY_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_helmet"), THELOSITE_HELMET);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_chestplate"), THELOSITE_CHESTPLATE);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_leggings"), THELOSITE_LEGGINGS);
	    Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_boots"), THELOSITE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_helmet"), ARCHEOSITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_chestplate"), ARCHEOSITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_leggings"), ARCHEOSITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_boots"), ARCHEOSITE_BOOTS);
        

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "long_fall_boots"), LONG_FALL_BOOTS);

        Reborn12K.LOGGER.info("Registering Armors for " + Reborn12K.MOD_ID);

    }


}
