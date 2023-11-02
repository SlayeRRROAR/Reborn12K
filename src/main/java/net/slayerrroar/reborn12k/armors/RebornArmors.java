package net.slayerrroar.reborn12k.armors;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.armors.custom.MageArmorItem;
import net.slayerrroar.reborn12k.util.ItemGroupUtil;

@SuppressWarnings({"unused", "SameParameterValue"})
public class RebornArmors {

    public static final Item ARCHEOSITE_HELMET = registerItem("archeosite_helmet", new ArmorItem(RebornArmorMaterials.ARCHEOSITE, ArmorItem.Type.HELMET, (new Item.Settings().fireproof())));
    public static final Item ARCHEOSITE_CHESTPLATE = registerItem("archeosite_chestplate", new ArmorItem(RebornArmorMaterials.ARCHEOSITE, ArmorItem.Type.CHESTPLATE, (new Item.Settings().fireproof())));
    public static final Item ARCHEOSITE_LEGGINGS = registerItem("archeosite_leggings", new ArmorItem(RebornArmorMaterials.ARCHEOSITE, ArmorItem.Type.LEGGINGS, (new Item.Settings().fireproof())));
    public static final Item ARCHEOSITE_BOOTS = registerItem("archeosite_boots", new ArmorItem(RebornArmorMaterials.ARCHEOSITE, ArmorItem.Type.BOOTS, (new Item.Settings().fireproof())));

    public static final Item BRONZE_HELMET = registerItem("bronze_helmet", new ArmorItem(RebornArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item BRONZE_CHESTPLATE = registerItem("bronze_chestplate", new ArmorItem(RebornArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item BRONZE_LEGGINGS = registerItem("bronze_leggings", new ArmorItem(RebornArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item BRONZE_BOOTS = registerItem("bronze_boots", new ArmorItem(RebornArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static final Item STEEL_HELMET = registerItem("steel_helmet", new ArmorItem(RebornArmorMaterials.STEEL, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate", new ArmorItem(RebornArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings", new ArmorItem(RebornArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item STEEL_BOOTS = registerItem("steel_boots", new ArmorItem(RebornArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static final Item TUNGSTENSTEEL_HELMET = registerItem("tungstensteel_helmet", new ArmorItem(RebornArmorMaterials.TUNGSTENSTEEL, ArmorItem.Type.HELMET, new Item.Settings().fireproof()));
    public static final Item TUNGSTENSTEEL_CHESTPLATE = registerItem("tungstensteel_chestplate", new ArmorItem(RebornArmorMaterials.TUNGSTENSTEEL, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()));
    public static final Item TUNGSTENSTEEL_LEGGINGS = registerItem("tungstensteel_leggings", new ArmorItem(RebornArmorMaterials.TUNGSTENSTEEL, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()));
    public static final Item TUNGSTENSTEEL_BOOTS = registerItem("tungstensteel_boots", new ArmorItem(RebornArmorMaterials.TUNGSTENSTEEL, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()));

    public static final Item THELOSITE_HELMET = registerItem("thelosite_helmet", new ArmorItem(RebornArmorMaterials.THELOSITE, ArmorItem.Type.HELMET, new Item.Settings().fireproof()));
    public static final Item THELOSITE_CHESTPLATE = registerItem("thelosite_chestplate", new ArmorItem(RebornArmorMaterials.THELOSITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()));
    public static final Item THELOSITE_LEGGINGS = registerItem("thelosite_leggings", new ArmorItem(RebornArmorMaterials.THELOSITE, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()));
    public static final Item THELOSITE_BOOTS = registerItem("thelosite_boots", new ArmorItem(RebornArmorMaterials.THELOSITE, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()));

    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet", new ArmorItem(RebornArmorMaterials.TITANIUM, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate", new ArmorItem(RebornArmorMaterials.TITANIUM, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings", new ArmorItem(RebornArmorMaterials.TITANIUM, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots", new ArmorItem(RebornArmorMaterials.TITANIUM, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static final Item ADVANCED_ALLOY_HELMET = registerItem("advanced_alloy_helmet", new ArmorItem(RebornArmorMaterials.ADVANCED_ALLOY, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item ADVANCED_ALLOY_CHESTPLATE = registerItem("advanced_alloy_chestplate", new ArmorItem(RebornArmorMaterials.ADVANCED_ALLOY, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item ADVANCED_ALLOY_LEGGINGS = registerItem("advanced_alloy_leggings", new ArmorItem(RebornArmorMaterials.ADVANCED_ALLOY, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item ADVANCED_ALLOY_BOOTS = registerItem("advanced_alloy_boots", new ArmorItem(RebornArmorMaterials.ADVANCED_ALLOY, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static final Item IRIDIUM_ALLOY_HELMET = registerItem("iridium_alloy_helmet", new ArmorItem(RebornArmorMaterials.IRIDIUM_ALLOY, ArmorItem.Type.HELMET, new Item.Settings().fireproof()));
    public static final Item IRIDIUM_ALLOY_CHESTPLATE = registerItem("iridium_alloy_chestplate", new ArmorItem(RebornArmorMaterials.IRIDIUM_ALLOY, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()));
    public static final Item IRIDIUM_ALLOY_LEGGINGS = registerItem("iridium_alloy_leggings", new ArmorItem(RebornArmorMaterials.IRIDIUM_ALLOY, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()));
    public static final Item IRIDIUM_ALLOY_BOOTS = registerItem("iridium_alloy_boots", new ArmorItem(RebornArmorMaterials.IRIDIUM_ALLOY, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()));

    public static final Item ELECTRUM_HELMET = registerItem("electrum_helmet", new ArmorItem(RebornArmorMaterials.ELECTRUM, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item ELECTRUM_CHESTPLATE = registerItem("electrum_chestplate", new ArmorItem(RebornArmorMaterials.ELECTRUM, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item ELECTRUM_LEGGINGS = registerItem("electrum_leggings", new ArmorItem(RebornArmorMaterials.ELECTRUM, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item ELECTRUM_BOOTS = registerItem("electrum_boots", new ArmorItem(RebornArmorMaterials.ELECTRUM, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static final Item SIGNALUM_HELMET = registerItem("signalum_helmet", new ArmorItem(RebornArmorMaterials.SIGNALUM, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item SIGNALUM_CHESTPLATE = registerItem("signalum_chestplate", new ArmorItem(RebornArmorMaterials.SIGNALUM, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item SIGNALUM_LEGGINGS = registerItem("signalum_leggings", new ArmorItem(RebornArmorMaterials.SIGNALUM, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item SIGNALUM_BOOTS = registerItem("signalum_boots", new ArmorItem(RebornArmorMaterials.SIGNALUM, ArmorItem.Type.BOOTS, new Item.Settings()));

    public static final Item ENDERIUM_HELMET = registerItem("enderium_helmet", new ArmorItem(RebornArmorMaterials.ENDERIUM, ArmorItem.Type.HELMET, new Item.Settings().fireproof()));
    public static final Item ENDERIUM_CHESTPLATE = registerItem("enderium_chestplate", new ArmorItem(RebornArmorMaterials.ENDERIUM, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()));
    public static final Item ENDERIUM_LEGGINGS = registerItem("enderium_leggings", new ArmorItem(RebornArmorMaterials.ENDERIUM, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()));
    public static final Item ENDERIUM_BOOTS = registerItem("enderium_boots", new ArmorItem(RebornArmorMaterials.ENDERIUM, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()));

    public static final Item MAGISTEEL_HELMET = registerItem("magisteel_helmet", new ArmorItem(RebornArmorMaterials.MAGISTEEL, ArmorItem.Type.HELMET, new Item.Settings().fireproof()));
    public static final Item MAGISTEEL_CHESTPLATE = registerItem("magisteel_chestplate", new ArmorItem(RebornArmorMaterials.MAGISTEEL, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()));
    public static final Item MAGISTEEL_LEGGINGS = registerItem("magisteel_leggings", new ArmorItem(RebornArmorMaterials.MAGISTEEL, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()));
    public static final Item MAGISTEEL_BOOTS = registerItem("magisteel_boots", new ArmorItem(RebornArmorMaterials.MAGISTEEL, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()));

    public static final Item ORICHALCUM_HELMET = registerItem("orichalcum_helmet", new ArmorItem(RebornArmorMaterials.ORICHALCUM, ArmorItem.Type.HELMET, new Item.Settings().fireproof()));
    public static final Item ORICHALCUM_CHESTPLATE = registerItem("orichalcum_chestplate", new ArmorItem(RebornArmorMaterials.ORICHALCUM, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()));
    public static final Item ORICHALCUM_LEGGINGS = registerItem("orichalcum_leggings", new ArmorItem(RebornArmorMaterials.ORICHALCUM, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()));
    public static final Item ORICHALCUM_BOOTS = registerItem("orichalcum_boots", new ArmorItem(RebornArmorMaterials.ORICHALCUM, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()));

    public static final Item MITHRIL_HELMET = registerItem("mithril_helmet", new ArmorItem(RebornArmorMaterials.MITHRIL, ArmorItem.Type.HELMET, new Item.Settings().fireproof()));
    public static final Item MITHRIL_CHESTPLATE = registerItem("mithril_chestplate", new ArmorItem(RebornArmorMaterials.MITHRIL, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()));
    public static final Item MITHRIL_LEGGINGS = registerItem("mithril_leggings", new ArmorItem(RebornArmorMaterials.MITHRIL, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()));
    public static final Item MITHRIL_BOOTS = registerItem("mithril_boots", new ArmorItem(RebornArmorMaterials.MITHRIL, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()));


    public static final Item MAGE_HELMET = registerItem("mage_helmet", new MageArmorItem(RebornArmorMaterials.MAGE, ArmorItem.Type.HELMET, new Item.Settings().fireproof()));
    public static final Item MAGE_CHESTPLATE = registerItem("mage_chestplate", new MageArmorItem(RebornArmorMaterials.MAGE, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()));
    public static final Item MAGE_LEGGINGS = registerItem("mage_leggings", new MageArmorItem(RebornArmorMaterials.MAGE, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()));
    public static final Item MAGE_BOOTS = registerItem("mage_boots", new MageArmorItem(RebornArmorMaterials.MAGE, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()));

    public static final Item POWER_HELMET = registerItem("power_helmet", new ArmorItem(RebornArmorMaterials.POWER, ArmorItem.Type.HELMET, new Item.Settings().fireproof()));
    public static final Item POWER_CHESTPLATE = registerItem("power_chestplate", new ArmorItem(RebornArmorMaterials.POWER, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()));
    public static final Item POWER_LEGGINGS = registerItem("power_leggings", new ArmorItem(RebornArmorMaterials.POWER, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()));
    public static final Item POWER_BOOTS = registerItem("power_boots", new ArmorItem(RebornArmorMaterials.POWER, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(ItemGroupUtil.REBORN12K, ARCHEOSITE_HELMET);
        addToItemGroup(ItemGroupUtil.REBORN12K, ARCHEOSITE_CHESTPLATE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ARCHEOSITE_LEGGINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, ARCHEOSITE_BOOTS);

        addToItemGroup(ItemGroupUtil.REBORN12K, BRONZE_HELMET);
        addToItemGroup(ItemGroupUtil.REBORN12K, BRONZE_CHESTPLATE);
        addToItemGroup(ItemGroupUtil.REBORN12K, BRONZE_LEGGINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, BRONZE_BOOTS);

        addToItemGroup(ItemGroupUtil.REBORN12K, STEEL_HELMET);
        addToItemGroup(ItemGroupUtil.REBORN12K, STEEL_CHESTPLATE);
        addToItemGroup(ItemGroupUtil.REBORN12K, STEEL_LEGGINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, STEEL_BOOTS);

        addToItemGroup(ItemGroupUtil.REBORN12K, TUNGSTENSTEEL_HELMET);
        addToItemGroup(ItemGroupUtil.REBORN12K, TUNGSTENSTEEL_CHESTPLATE);
        addToItemGroup(ItemGroupUtil.REBORN12K, TUNGSTENSTEEL_LEGGINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, TUNGSTENSTEEL_BOOTS);

        addToItemGroup(ItemGroupUtil.REBORN12K, THELOSITE_HELMET);
        addToItemGroup(ItemGroupUtil.REBORN12K, THELOSITE_CHESTPLATE);
        addToItemGroup(ItemGroupUtil.REBORN12K, THELOSITE_LEGGINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, THELOSITE_BOOTS);

        addToItemGroup(ItemGroupUtil.REBORN12K, TITANIUM_HELMET);
        addToItemGroup(ItemGroupUtil.REBORN12K, TITANIUM_CHESTPLATE);
        addToItemGroup(ItemGroupUtil.REBORN12K, TITANIUM_LEGGINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, TITANIUM_BOOTS);

        addToItemGroup(ItemGroupUtil.REBORN12K, ADVANCED_ALLOY_HELMET);
        addToItemGroup(ItemGroupUtil.REBORN12K, ADVANCED_ALLOY_CHESTPLATE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ADVANCED_ALLOY_LEGGINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, ADVANCED_ALLOY_BOOTS);

        addToItemGroup(ItemGroupUtil.REBORN12K, IRIDIUM_ALLOY_HELMET);
        addToItemGroup(ItemGroupUtil.REBORN12K, IRIDIUM_ALLOY_CHESTPLATE);
        addToItemGroup(ItemGroupUtil.REBORN12K, IRIDIUM_ALLOY_LEGGINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, IRIDIUM_ALLOY_BOOTS);

        addToItemGroup(ItemGroupUtil.REBORN12K, ELECTRUM_HELMET);
        addToItemGroup(ItemGroupUtil.REBORN12K, ELECTRUM_CHESTPLATE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ELECTRUM_LEGGINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, ELECTRUM_BOOTS);

        addToItemGroup(ItemGroupUtil.REBORN12K, SIGNALUM_HELMET);
        addToItemGroup(ItemGroupUtil.REBORN12K, SIGNALUM_CHESTPLATE);
        addToItemGroup(ItemGroupUtil.REBORN12K, SIGNALUM_LEGGINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, SIGNALUM_BOOTS);

        addToItemGroup(ItemGroupUtil.REBORN12K, ENDERIUM_HELMET);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENDERIUM_CHESTPLATE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENDERIUM_LEGGINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENDERIUM_BOOTS);


        addToItemGroup(ItemGroupUtil.REBORN12K, MAGISTEEL_HELMET);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGISTEEL_CHESTPLATE);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGISTEEL_LEGGINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGISTEEL_BOOTS);

        addToItemGroup(ItemGroupUtil.REBORN12K, ORICHALCUM_HELMET);
        addToItemGroup(ItemGroupUtil.REBORN12K, ORICHALCUM_CHESTPLATE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ORICHALCUM_LEGGINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, ORICHALCUM_BOOTS);

        addToItemGroup(ItemGroupUtil.REBORN12K, MITHRIL_HELMET);
        addToItemGroup(ItemGroupUtil.REBORN12K, MITHRIL_CHESTPLATE);
        addToItemGroup(ItemGroupUtil.REBORN12K, MITHRIL_LEGGINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, MITHRIL_BOOTS);


        addToItemGroup(ItemGroupUtil.REBORN12K, MAGE_HELMET);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGE_CHESTPLATE);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGE_LEGGINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGE_BOOTS);

        addToItemGroup(ItemGroupUtil.REBORN12K, POWER_HELMET);
        addToItemGroup(ItemGroupUtil.REBORN12K, POWER_CHESTPLATE);
        addToItemGroup(ItemGroupUtil.REBORN12K, POWER_LEGGINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, POWER_BOOTS);

    }

    private static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Armors");
    }
}