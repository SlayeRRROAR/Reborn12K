package net.slayerrroar.reborn12k.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.tools.type.*;
import net.slayerrroar.reborn12k.util.ItemGroupUtil;

@SuppressWarnings("unused")         //todo: add new textures for some katanas

public class RebornTools {

    public static Item WOODEN_KATANA = registerItem("wooden_katana", new BaseSword(ToolMaterials.WOOD, 1, -1.6f, new FabricItemSettings()));
    public static Item STONE_KATANA = registerItem("stone_katana", new BaseSword(ToolMaterials.STONE, 1, -1.6f, new FabricItemSettings()));
    public static Item IRON_KATANA = registerItem("iron_katana", new BaseSword(ToolMaterials.IRON, 1, -1.6f, new FabricItemSettings()));
    public static Item DIAMOND_KATANA = registerItem("diamond_katana", new BaseSword(ToolMaterials.DIAMOND, 0, -1.6f, new FabricItemSettings()));
    public static Item NETHERITE_KATANA = registerItem("netherite_katana", new BaseSword(ToolMaterials.NETHERITE, 0, -1.6f, new FabricItemSettings().fireproof()));
    public static Item GOLDEN_KATANA = registerItem("golden_katana", new BaseSword(ToolMaterials.GOLD, 1, -1.6f, new FabricItemSettings()));

    public static Item ARCHEOSITE_SWORD = registerItem("archeosite_sword", new BaseSword(CustomToolMaterials.ARCHEOSITE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_SHOVEL = registerItem("archeosite_shovel", new BaseShovel(CustomToolMaterials.ARCHEOSITE, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_PICKAXE = registerItem("archeosite_pickaxe", new BasePickaxe(CustomToolMaterials.ARCHEOSITE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_AXE = registerItem("archeosite_axe", new BaseAxe(CustomToolMaterials.ARCHEOSITE, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_HOE = registerItem("archeosite_hoe", new BaseHoe(CustomToolMaterials.ARCHEOSITE, -7, 0.0f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_KATANA = registerItem("archeosite_katana", new BaseSword(CustomToolMaterials.ARCHEOSITE, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item BRONZE_SWORD = registerItem("bronze_sword", new BaseSword(CustomToolMaterials.BRONZE, 3, -2.4f, new FabricItemSettings()));
    public static Item BRONZE_SHOVEL = registerItem("bronze_shovel", new BaseShovel(CustomToolMaterials.BRONZE, 2, -3.0f, new FabricItemSettings()));
    public static Item BRONZE_PICKAXE = registerItem("bronze_pickaxe", new BasePickaxe(CustomToolMaterials.BRONZE, 1, -2.8f, new FabricItemSettings()));
    public static Item BRONZE_AXE = registerItem("bronze_axe", new BaseAxe(CustomToolMaterials.BRONZE, 7, -3.1f, new FabricItemSettings()));
    public static Item BRONZE_HOE = registerItem("bronze_hoe", new BaseHoe(CustomToolMaterials.BRONZE, -1, -1.0f, new FabricItemSettings()));
    public static Item BRONZE_KATANA = registerItem("bronze_katana", new BaseSword(CustomToolMaterials.BRONZE, 1, -1.6f, new FabricItemSettings()));

    public static Item STEEL_SWORD = registerItem("steel_sword", new BaseSword(CustomToolMaterials.STEEL, 3, -2.4f, new FabricItemSettings()));
    public static Item STEEL_SHOVEL = registerItem("steel_shovel", new BaseShovel(CustomToolMaterials.STEEL, 1, -3.0f, new FabricItemSettings()));
    public static Item STEEL_PICKAXE = registerItem("steel_pickaxe", new BasePickaxe(CustomToolMaterials.STEEL, 1, -2.8f, new FabricItemSettings()));
    public static Item STEEL_AXE = registerItem("steel_axe", new BaseAxe(CustomToolMaterials.STEEL, 5, -3.0f, new FabricItemSettings()));
    public static Item STEEL_HOE = registerItem("steel_hoe", new BaseHoe(CustomToolMaterials.STEEL, -4, 0.0f, new FabricItemSettings()));
    public static Item STEEL_KATANA = registerItem("steel_katana", new BaseSword(CustomToolMaterials.STEEL, 0, -1.6f, new FabricItemSettings()));

    public static Item TUNGSTENSTEEL_SWORD = registerItem("tungstensteel_sword", new BaseSword(CustomToolMaterials.TUNGSTENSTEEL, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_SHOVEL = registerItem("tungstensteel_shovel", new BaseShovel(CustomToolMaterials.TUNGSTENSTEEL, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_PICKAXE = registerItem("tungstensteel_pickaxe", new BasePickaxe(CustomToolMaterials.TUNGSTENSTEEL, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_AXE = registerItem("tungstensteel_axe", new BaseAxe(CustomToolMaterials.TUNGSTENSTEEL, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_HOE = registerItem("tungstensteel_hoe", new BaseHoe(CustomToolMaterials.TUNGSTENSTEEL, -5, 0.0f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_KATANA = registerItem("tungstensteel_katana", new BaseSword(CustomToolMaterials.TUNGSTENSTEEL, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item THELOSITE_SWORD = registerItem("thelosite_sword", new BaseSword(CustomToolMaterials.THELOSITE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item THELOSITE_SHOVEL = registerItem("thelosite_shovel", new BaseShovel(CustomToolMaterials.THELOSITE, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item THELOSITE_PICKAXE = registerItem("thelosite_pickaxe", new BasePickaxe(CustomToolMaterials.THELOSITE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item THELOSITE_AXE = registerItem("thelosite_axe", new BaseAxe(CustomToolMaterials.THELOSITE, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item THELOSITE_HOE = registerItem("thelosite_hoe", new BaseHoe(CustomToolMaterials.THELOSITE, -8, 0.0f, new FabricItemSettings().fireproof()));
    public static Item THELOSITE_KATANA = registerItem("thelosite_katana", new BaseSword(CustomToolMaterials.THELOSITE, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item TITANIUM_SWORD = registerItem("titanium_sword", new BaseSword(CustomToolMaterials.TITANIUM, 3, -2.4f, new FabricItemSettings()));
    public static Item TITANIUM_SHOVEL = registerItem("titanium_shovel", new BaseShovel(CustomToolMaterials.TITANIUM, 1, -3.0f, new FabricItemSettings()));
    public static Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe", new BasePickaxe(CustomToolMaterials.TITANIUM, 1, -2.8f, new FabricItemSettings()));
    public static Item TITANIUM_AXE = registerItem("titanium_axe", new BaseAxe(CustomToolMaterials.TITANIUM, 6, -3.0f, new FabricItemSettings()));
    public static Item TITANIUM_HOE = registerItem("titanium_hoe", new BaseHoe(CustomToolMaterials.TITANIUM, -2, 0.0f, new FabricItemSettings()));
    public static Item TITANIUM_KATANA = registerItem("titanium_katana", new BaseSword(CustomToolMaterials.TITANIUM, 0, -1.6f, new FabricItemSettings()));

    public static Item ADVANCED_ALLOY_SWORD = registerItem("advanced_alloy_sword", new BaseSword(CustomToolMaterials.ADVANCED_ALLOY, 3, -2.4f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_SHOVEL = registerItem("advanced_alloy_shovel", new BaseShovel(CustomToolMaterials.ADVANCED_ALLOY, 1, -3.0f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_PICKAXE = registerItem("advanced_alloy_pickaxe", new BasePickaxe(CustomToolMaterials.ADVANCED_ALLOY, 1, -2.8f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_AXE = registerItem("advanced_alloy_axe", new BaseAxe(CustomToolMaterials.ADVANCED_ALLOY, 5, -3.0f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_HOE = registerItem("advanced_alloy_hoe", new BaseHoe(CustomToolMaterials.ADVANCED_ALLOY, -3, 0.0f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_KATANA = registerItem("advanced_alloy_katana", new BaseSword(CustomToolMaterials.ADVANCED_ALLOY, 0, -1.6f, new FabricItemSettings()));

    public static Item IRIDIUM_ALLOY_SWORD = registerItem("iridium_alloy_sword", new BaseSword(CustomToolMaterials.IRIDIUM_ALLOY, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_SHOVEL = registerItem("iridium_alloy_shovel", new BaseShovel(CustomToolMaterials.IRIDIUM_ALLOY, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_PICKAXE = registerItem("iridium_alloy_pickaxe", new BasePickaxe(CustomToolMaterials.IRIDIUM_ALLOY, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_AXE = registerItem("iridium_alloy_axe", new BaseAxe(CustomToolMaterials.IRIDIUM_ALLOY, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_HOE = registerItem("iridium_alloy_hoe", new BaseHoe(CustomToolMaterials.IRIDIUM_ALLOY, -6, 0.0f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_KATANA = registerItem("iridium_alloy_katana", new BaseSword(CustomToolMaterials.IRIDIUM_ALLOY, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item ELECTRUM_SWORD = registerItem("electrum_sword", new BaseSword(CustomToolMaterials.ELECTRUM, 3, -2.4f, new FabricItemSettings()));
    public static Item ELECTRUM_SHOVEL = registerItem("electrum_shovel", new BaseShovel(CustomToolMaterials.ELECTRUM, 1, -3.0f, new FabricItemSettings()));
    public static Item ELECTRUM_PICKAXE = registerItem("electrum_pickaxe", new BasePickaxe(CustomToolMaterials.ELECTRUM, 1, -2.8f, new FabricItemSettings()));
    public static Item ELECTRUM_AXE = registerItem("electrum_axe", new BaseAxe(CustomToolMaterials.ELECTRUM, 5, -3.0f, new FabricItemSettings()));
    public static Item ELECTRUM_HOE = registerItem("electrum_hoe", new BaseHoe(CustomToolMaterials.ELECTRUM, -3, 0.0f, new FabricItemSettings()));
    public static Item ELECTRUM_KATANA = registerItem("electrum_katana", new BaseSword(CustomToolMaterials.ELECTRUM, 0, -1.6f, new FabricItemSettings()));

    public static Item SIGNALUM_SWORD = registerItem("signalum_sword", new BaseSword(CustomToolMaterials.SIGNALUM, 3, -2.4f, new FabricItemSettings()));
    public static Item SIGNALUM_SHOVEL = registerItem("signalum_shovel", new BaseShovel(CustomToolMaterials.SIGNALUM, 1, -3.0f, new FabricItemSettings()));
    public static Item SIGNALUM_PICKAXE = registerItem("signalum_pickaxe", new BasePickaxe(CustomToolMaterials.SIGNALUM, 1, -2.8f, new FabricItemSettings()));
    public static Item SIGNALUM_AXE = registerItem("signalum_axe", new BaseAxe(CustomToolMaterials.SIGNALUM, 5, -3.0f, new FabricItemSettings()));
    public static Item SIGNALUM_HOE = registerItem("signalum_hoe", new BaseHoe(CustomToolMaterials.SIGNALUM, -4, 0.0f, new FabricItemSettings()));
    public static Item SIGNALUM_KATANA = registerItem("signalum_katana", new BaseSword(CustomToolMaterials.SIGNALUM, 0, -1.6f, new FabricItemSettings()));

    public static Item ENDERIUM_SWORD = registerItem("enderium_sword", new BaseSword(CustomToolMaterials.ENDERIUM, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_SHOVEL = registerItem("enderium_shovel", new BaseShovel(CustomToolMaterials.ENDERIUM, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_PICKAXE = registerItem("enderium_pickaxe", new BasePickaxe(CustomToolMaterials.ENDERIUM, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_AXE = registerItem("enderium_axe", new BaseAxe(CustomToolMaterials.ENDERIUM, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_HOE = registerItem("enderium_hoe", new BaseHoe(CustomToolMaterials.ENDERIUM, -7, 0.0f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_KATANA = registerItem("enderium_katana", new BaseSword(CustomToolMaterials.ENDERIUM, 0, -1.6f, new FabricItemSettings().fireproof()));


    public static Item MAGISTEEL_SWORD = registerItem("magisteel_sword", new BaseSword(CustomToolMaterials.MAGISTEEL, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item MAGISTEEL_SHOVEL = registerItem("magisteel_shovel", new BaseShovel(CustomToolMaterials.MAGISTEEL, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item MAGISTEEL_PICKAXE = registerItem("magisteel_pickaxe", new BasePickaxe(CustomToolMaterials.MAGISTEEL, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item MAGISTEEL_AXE = registerItem("magisteel_axe", new BaseAxe(CustomToolMaterials.MAGISTEEL, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item MAGISTEEL_HOE = registerItem("magisteel_hoe", new BaseHoe(CustomToolMaterials.MAGISTEEL, -3, 0.0f, new FabricItemSettings().fireproof()));
    public static Item MAGISTEEL_KATANA = registerItem("magisteel_katana", new BaseSword(CustomToolMaterials.MAGISTEEL, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item ORICHALCUM_SWORD = registerItem("orichalcum_sword", new BaseSword(CustomToolMaterials.ORICHALCUM, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item ORICHALCUM_SHOVEL = registerItem("orichalcum_shovel", new BaseShovel(CustomToolMaterials.ORICHALCUM, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item ORICHALCUM_PICKAXE = registerItem("orichalcum_pickaxe", new BasePickaxe(CustomToolMaterials.ORICHALCUM, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item ORICHALCUM_AXE = registerItem("orichalcum_axe", new BaseAxe(CustomToolMaterials.ORICHALCUM, 5, -3.0f, new FabricItemSettings().fireproof().fireproof()));
    public static Item ORICHALCUM_HOE = registerItem("orichalcum_hoe", new BaseHoe(CustomToolMaterials.ORICHALCUM, -3, 0.0f, new FabricItemSettings().fireproof().fireproof()));
    public static Item ORICHALCUM_KATANA = registerItem("orichalcum_katana", new BaseSword(CustomToolMaterials.ORICHALCUM, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item MITHRIL_SWORD = registerItem("mithril_sword", new BaseSword(CustomToolMaterials.MITHRIL, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item MITHRIL_SHOVEL = registerItem("mithril_shovel", new BaseShovel(CustomToolMaterials.MITHRIL, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe", new BasePickaxe(CustomToolMaterials.MITHRIL, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item MITHRIL_AXE = registerItem("mithril_axe", new BaseAxe(CustomToolMaterials.MITHRIL, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item MITHRIL_HOE = registerItem("mithril_hoe", new BaseHoe(CustomToolMaterials.MITHRIL, -3, 0.0f, new FabricItemSettings().fireproof()));
    public static Item MITHRIL_KATANA = registerItem("mithril_katana", new BaseSword(CustomToolMaterials.MITHRIL, 0, -1.6f, new FabricItemSettings().fireproof()));


    public static Item SILVER_CLAYMORE = registerItem("silver_claymore", new BaseSword(CustomToolMaterials.SILVER, 2, -3.0f, new FabricItemSettings()));
    public static Item CUTTER_237 = registerItem("cutter_237", new Cutter(CustomToolMaterials.CUTTER237, 3, -1.8f, new FabricItemSettings().fireproof()));
    public static Item REBELLION = registerItem("rebellion", new BaseSword(CustomToolMaterials.DMC, 5, -2.6f, new FabricItemSettings().fireproof()));
    public static Item YAMATO = registerItem("yamato", new BaseSword(CustomToolMaterials.DMC, 1, -1.6f, new FabricItemSettings().fireproof()));
    public static Item RED_QUEEN = registerItem("red_queen", new ExceedSword(CustomToolMaterials.DMC, 5 , -2.4f, new FabricItemSettings().fireproof()));
    public static Item MURASAMA = registerItem("murasama", new BaseSword(CustomToolMaterials.HFB, 3, -1.6f, new FabricItemSettings()));
    public static Item BLADEWOLF = registerItem("bladewolf", new BaseSword(CustomToolMaterials.HFB, 5, -2.4f, new FabricItemSettings()));
    public static Item POWER_SWORD = registerItem("power_sword", new BaseSword(CustomToolMaterials.POWER, 5, -2.4f, new FabricItemSettings()));
    public static Item SILENCE = registerItem("silence", new BaseSword(CustomToolMaterials.POWER, 8, -2.8f, new FabricItemSettings().fireproof()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(ItemGroupUtil.REBORN12K, WOODEN_KATANA);
        addToItemGroup(ItemGroupUtil.REBORN12K, STONE_KATANA);
        addToItemGroup(ItemGroupUtil.REBORN12K, IRON_KATANA);
        addToItemGroup(ItemGroupUtil.REBORN12K, DIAMOND_KATANA);
        addToItemGroup(ItemGroupUtil.REBORN12K, NETHERITE_KATANA);
        addToItemGroup(ItemGroupUtil.REBORN12K, GOLDEN_KATANA);

        addToItemGroup(ItemGroupUtil.REBORN12K, ARCHEOSITE_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, ARCHEOSITE_SHOVEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, ARCHEOSITE_PICKAXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ARCHEOSITE_AXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ARCHEOSITE_HOE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ARCHEOSITE_KATANA);

        addToItemGroup(ItemGroupUtil.REBORN12K, BRONZE_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, BRONZE_SHOVEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, BRONZE_PICKAXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, BRONZE_AXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, BRONZE_HOE);
        addToItemGroup(ItemGroupUtil.REBORN12K, BRONZE_KATANA);

        addToItemGroup(ItemGroupUtil.REBORN12K, STEEL_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, STEEL_SHOVEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, STEEL_PICKAXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, STEEL_AXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, STEEL_HOE);
        addToItemGroup(ItemGroupUtil.REBORN12K, STEEL_KATANA);

        addToItemGroup(ItemGroupUtil.REBORN12K, TUNGSTENSTEEL_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, TUNGSTENSTEEL_SHOVEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, TUNGSTENSTEEL_PICKAXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, TUNGSTENSTEEL_AXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, TUNGSTENSTEEL_HOE);
        addToItemGroup(ItemGroupUtil.REBORN12K, TUNGSTENSTEEL_KATANA);

        addToItemGroup(ItemGroupUtil.REBORN12K, THELOSITE_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, THELOSITE_SHOVEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, THELOSITE_PICKAXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, THELOSITE_AXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, THELOSITE_HOE);
        addToItemGroup(ItemGroupUtil.REBORN12K, THELOSITE_KATANA);

        addToItemGroup(ItemGroupUtil.REBORN12K, TITANIUM_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, TITANIUM_SHOVEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, TITANIUM_PICKAXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, TITANIUM_AXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, TITANIUM_HOE);
        addToItemGroup(ItemGroupUtil.REBORN12K, TITANIUM_KATANA);

        addToItemGroup(ItemGroupUtil.REBORN12K, ADVANCED_ALLOY_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, ADVANCED_ALLOY_SHOVEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, ADVANCED_ALLOY_PICKAXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ADVANCED_ALLOY_AXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ADVANCED_ALLOY_HOE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ADVANCED_ALLOY_KATANA);

        addToItemGroup(ItemGroupUtil.REBORN12K, IRIDIUM_ALLOY_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, IRIDIUM_ALLOY_SHOVEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, IRIDIUM_ALLOY_PICKAXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, IRIDIUM_ALLOY_AXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, IRIDIUM_ALLOY_HOE);
        addToItemGroup(ItemGroupUtil.REBORN12K, IRIDIUM_ALLOY_KATANA);

        addToItemGroup(ItemGroupUtil.REBORN12K, ELECTRUM_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, ELECTRUM_SHOVEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, ELECTRUM_PICKAXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ELECTRUM_AXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ELECTRUM_HOE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ELECTRUM_KATANA);

        addToItemGroup(ItemGroupUtil.REBORN12K, SIGNALUM_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, SIGNALUM_SHOVEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, SIGNALUM_PICKAXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, SIGNALUM_AXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, SIGNALUM_HOE);
        addToItemGroup(ItemGroupUtil.REBORN12K, SIGNALUM_KATANA);

        addToItemGroup(ItemGroupUtil.REBORN12K, ENDERIUM_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENDERIUM_SHOVEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENDERIUM_PICKAXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENDERIUM_AXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENDERIUM_HOE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENDERIUM_KATANA);


        addToItemGroup(ItemGroupUtil.REBORN12K, MAGISTEEL_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGISTEEL_SHOVEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGISTEEL_PICKAXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGISTEEL_AXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGISTEEL_HOE);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGISTEEL_KATANA);

        addToItemGroup(ItemGroupUtil.REBORN12K, ORICHALCUM_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, ORICHALCUM_SHOVEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, ORICHALCUM_PICKAXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ORICHALCUM_AXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ORICHALCUM_HOE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ORICHALCUM_KATANA);

        addToItemGroup(ItemGroupUtil.REBORN12K, MITHRIL_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, MITHRIL_SHOVEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, MITHRIL_PICKAXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, MITHRIL_AXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, MITHRIL_HOE);
        addToItemGroup(ItemGroupUtil.REBORN12K, MITHRIL_KATANA);

        addToItemGroup(ItemGroupUtil.REBORN12K, SILVER_CLAYMORE);
        addToItemGroup(ItemGroupUtil.REBORN12K, CUTTER_237);
        addToItemGroup(ItemGroupUtil.REBORN12K, REBELLION);
        addToItemGroup(ItemGroupUtil.REBORN12K, YAMATO);
        addToItemGroup(ItemGroupUtil.REBORN12K, RED_QUEEN);
        addToItemGroup(ItemGroupUtil.REBORN12K, MURASAMA);
        addToItemGroup(ItemGroupUtil.REBORN12K, BLADEWOLF);
        addToItemGroup(ItemGroupUtil.REBORN12K, POWER_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, SILENCE);

    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Tools");
    }
}
