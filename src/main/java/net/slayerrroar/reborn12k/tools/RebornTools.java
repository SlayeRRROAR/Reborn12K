package net.slayerrroar.reborn12k.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.tools.type.*;
import net.slayerrroar.reborn12k.tools.type.custom.*;
import net.slayerrroar.reborn12k.util.ItemGroupUtil;

@SuppressWarnings({"unused", "SameParameterValue"})
public class RebornTools {

    public static Item WOODEN_KATANA = registerItem("wooden_katana", new BaseSword(ToolMaterials.WOOD, 1, -1.6f, new FabricItemSettings()));
    public static Item STONE_KATANA = registerItem("stone_katana", new BaseSword(ToolMaterials.STONE, 1, -1.6f, new FabricItemSettings()));
    public static Item IRON_KATANA = registerItem("iron_katana", new BaseSword(ToolMaterials.IRON, 1, -1.6f, new FabricItemSettings()));
    public static Item GOLDEN_KATANA = registerItem("golden_katana", new BaseSword(ToolMaterials.GOLD, 1, -1.6f, new FabricItemSettings()));
    public static Item DIAMOND_KATANA = registerItem("diamond_katana", new BaseSword(ToolMaterials.DIAMOND, 0, -1.6f, new FabricItemSettings()));
    public static Item NETHERITE_KATANA = registerItem("netherite_katana", new BaseSword(ToolMaterials.NETHERITE, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item ARCHEOSITE_SWORD = registerItem("archeosite_sword", new BaseSword(RebornToolMaterials.ARCHEOSITE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_SHOVEL = registerItem("archeosite_shovel", new BaseShovel(RebornToolMaterials.ARCHEOSITE, 1, -3f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_PICKAXE = registerItem("archeosite_pickaxe", new BasePickaxe(RebornToolMaterials.ARCHEOSITE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_AXE = registerItem("archeosite_axe", new BaseAxe(RebornToolMaterials.ARCHEOSITE, 5, -3f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_HOE = registerItem("archeosite_hoe", new BaseHoe(RebornToolMaterials.ARCHEOSITE, -7, 0f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_KATANA = registerItem("archeosite_katana", new BaseSword(RebornToolMaterials.ARCHEOSITE, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item BRONZE_SWORD = registerItem("bronze_sword", new BaseSword(RebornToolMaterials.BRONZE, 3, -2.4f, new FabricItemSettings()));
    public static Item BRONZE_SHOVEL = registerItem("bronze_shovel", new BaseShovel(RebornToolMaterials.BRONZE, 2, -3f, new FabricItemSettings()));
    public static Item BRONZE_PICKAXE = registerItem("bronze_pickaxe", new BasePickaxe(RebornToolMaterials.BRONZE, 1, -2.8f, new FabricItemSettings()));
    public static Item BRONZE_AXE = registerItem("bronze_axe", new BaseAxe(RebornToolMaterials.BRONZE, 7, -3.1f, new FabricItemSettings()));
    public static Item BRONZE_HOE = registerItem("bronze_hoe", new BaseHoe(RebornToolMaterials.BRONZE, -1, -1f, new FabricItemSettings()));
    public static Item BRONZE_KATANA = registerItem("bronze_katana", new BaseSword(RebornToolMaterials.BRONZE, 1, -1.6f, new FabricItemSettings()));

    public static Item STEEL_SWORD = registerItem("steel_sword", new BaseSword(RebornToolMaterials.STEEL, 3, -2.4f, new FabricItemSettings()));
    public static Item STEEL_SHOVEL = registerItem("steel_shovel", new BaseShovel(RebornToolMaterials.STEEL, 1, -3f, new FabricItemSettings()));
    public static Item STEEL_PICKAXE = registerItem("steel_pickaxe", new BasePickaxe(RebornToolMaterials.STEEL, 1, -2.8f, new FabricItemSettings()));
    public static Item STEEL_AXE = registerItem("steel_axe", new BaseAxe(RebornToolMaterials.STEEL, 5, -3f, new FabricItemSettings()));
    public static Item STEEL_HOE = registerItem("steel_hoe", new BaseHoe(RebornToolMaterials.STEEL, -4, 0f, new FabricItemSettings()));
    public static Item STEEL_KATANA = registerItem("steel_katana", new BaseSword(RebornToolMaterials.STEEL, 0, -1.6f, new FabricItemSettings()));

    public static Item TUNGSTENSTEEL_SWORD = registerItem("tungstensteel_sword", new BaseSword(RebornToolMaterials.TUNGSTENSTEEL, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_SHOVEL = registerItem("tungstensteel_shovel", new BaseShovel(RebornToolMaterials.TUNGSTENSTEEL, 1, -3f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_PICKAXE = registerItem("tungstensteel_pickaxe", new BasePickaxe(RebornToolMaterials.TUNGSTENSTEEL, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_AXE = registerItem("tungstensteel_axe", new BaseAxe(RebornToolMaterials.TUNGSTENSTEEL, 5, -3f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_HOE = registerItem("tungstensteel_hoe", new BaseHoe(RebornToolMaterials.TUNGSTENSTEEL, -5, 0f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_KATANA = registerItem("tungstensteel_katana", new BaseSword(RebornToolMaterials.TUNGSTENSTEEL, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item THELOSITE_SWORD = registerItem("thelosite_sword", new BaseSword(RebornToolMaterials.THELOSITE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item THELOSITE_SHOVEL = registerItem("thelosite_shovel", new BaseShovel(RebornToolMaterials.THELOSITE, 1, -3f, new FabricItemSettings().fireproof()));
    public static Item THELOSITE_PICKAXE = registerItem("thelosite_pickaxe", new BasePickaxe(RebornToolMaterials.THELOSITE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item THELOSITE_AXE = registerItem("thelosite_axe", new BaseAxe(RebornToolMaterials.THELOSITE, 5, -3f, new FabricItemSettings().fireproof()));
    public static Item THELOSITE_HOE = registerItem("thelosite_hoe", new BaseHoe(RebornToolMaterials.THELOSITE, -8, 0f, new FabricItemSettings().fireproof()));
    public static Item THELOSITE_KATANA = registerItem("thelosite_katana", new BaseSword(RebornToolMaterials.THELOSITE, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item TITANIUM_SWORD = registerItem("titanium_sword", new BaseSword(RebornToolMaterials.TITANIUM, 3, -2.4f, new FabricItemSettings()));
    public static Item TITANIUM_SHOVEL = registerItem("titanium_shovel", new BaseShovel(RebornToolMaterials.TITANIUM, 1, -3f, new FabricItemSettings()));
    public static Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe", new BasePickaxe(RebornToolMaterials.TITANIUM, 1, -2.8f, new FabricItemSettings()));
    public static Item TITANIUM_AXE = registerItem("titanium_axe", new BaseAxe(RebornToolMaterials.TITANIUM, 6, -3f, new FabricItemSettings()));
    public static Item TITANIUM_HOE = registerItem("titanium_hoe", new BaseHoe(RebornToolMaterials.TITANIUM, -2, 0f, new FabricItemSettings()));
    public static Item TITANIUM_KATANA = registerItem("titanium_katana", new BaseSword(RebornToolMaterials.TITANIUM, 0, -1.6f, new FabricItemSettings()));

    public static Item ADVANCED_ALLOY_SWORD = registerItem("advanced_alloy_sword", new BaseSword(RebornToolMaterials.ADVANCED_ALLOY, 3, -2.4f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_SHOVEL = registerItem("advanced_alloy_shovel", new BaseShovel(RebornToolMaterials.ADVANCED_ALLOY, 1, -3f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_PICKAXE = registerItem("advanced_alloy_pickaxe", new BasePickaxe(RebornToolMaterials.ADVANCED_ALLOY, 1, -2.8f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_AXE = registerItem("advanced_alloy_axe", new BaseAxe(RebornToolMaterials.ADVANCED_ALLOY, 5, -3f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_HOE = registerItem("advanced_alloy_hoe", new BaseHoe(RebornToolMaterials.ADVANCED_ALLOY, -3, 0f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_KATANA = registerItem("advanced_alloy_katana", new BaseSword(RebornToolMaterials.ADVANCED_ALLOY, 0, -1.6f, new FabricItemSettings()));

    public static Item IRIDIUM_ALLOY_SWORD = registerItem("iridium_alloy_sword", new BaseSword(RebornToolMaterials.IRIDIUM_ALLOY, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_SHOVEL = registerItem("iridium_alloy_shovel", new BaseShovel(RebornToolMaterials.IRIDIUM_ALLOY, 1, -3f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_PICKAXE = registerItem("iridium_alloy_pickaxe", new BasePickaxe(RebornToolMaterials.IRIDIUM_ALLOY, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_AXE = registerItem("iridium_alloy_axe", new BaseAxe(RebornToolMaterials.IRIDIUM_ALLOY, 5, -3f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_HOE = registerItem("iridium_alloy_hoe", new BaseHoe(RebornToolMaterials.IRIDIUM_ALLOY, -6, 0f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_KATANA = registerItem("iridium_alloy_katana", new BaseSword(RebornToolMaterials.IRIDIUM_ALLOY, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item ELECTRUM_SWORD = registerItem("electrum_sword", new BaseSword(RebornToolMaterials.ELECTRUM, 3, -2.4f, new FabricItemSettings()));
    public static Item ELECTRUM_SHOVEL = registerItem("electrum_shovel", new BaseShovel(RebornToolMaterials.ELECTRUM, 1, -3f, new FabricItemSettings()));
    public static Item ELECTRUM_PICKAXE = registerItem("electrum_pickaxe", new BasePickaxe(RebornToolMaterials.ELECTRUM, 1, -2.8f, new FabricItemSettings()));
    public static Item ELECTRUM_AXE = registerItem("electrum_axe", new BaseAxe(RebornToolMaterials.ELECTRUM, 5, -3f, new FabricItemSettings()));
    public static Item ELECTRUM_HOE = registerItem("electrum_hoe", new BaseHoe(RebornToolMaterials.ELECTRUM, -3, 0f, new FabricItemSettings()));
    public static Item ELECTRUM_KATANA = registerItem("electrum_katana", new BaseSword(RebornToolMaterials.ELECTRUM, 0, -1.6f, new FabricItemSettings()));

    public static Item SIGNALUM_SWORD = registerItem("signalum_sword", new BaseSword(RebornToolMaterials.SIGNALUM, 3, -2.4f, new FabricItemSettings()));
    public static Item SIGNALUM_SHOVEL = registerItem("signalum_shovel", new BaseShovel(RebornToolMaterials.SIGNALUM, 1, -3f, new FabricItemSettings()));
    public static Item SIGNALUM_PICKAXE = registerItem("signalum_pickaxe", new BasePickaxe(RebornToolMaterials.SIGNALUM, 1, -2.8f, new FabricItemSettings()));
    public static Item SIGNALUM_AXE = registerItem("signalum_axe", new BaseAxe(RebornToolMaterials.SIGNALUM, 5, -3f, new FabricItemSettings()));
    public static Item SIGNALUM_HOE = registerItem("signalum_hoe", new BaseHoe(RebornToolMaterials.SIGNALUM, -4, 0f, new FabricItemSettings()));
    public static Item SIGNALUM_KATANA = registerItem("signalum_katana", new BaseSword(RebornToolMaterials.SIGNALUM, 0, -1.6f, new FabricItemSettings()));

    public static Item ENDERIUM_SWORD = registerItem("enderium_sword", new BaseSword(RebornToolMaterials.ENDERIUM, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_SHOVEL = registerItem("enderium_shovel", new BaseShovel(RebornToolMaterials.ENDERIUM, 1, -3f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_PICKAXE = registerItem("enderium_pickaxe", new BasePickaxe(RebornToolMaterials.ENDERIUM, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_AXE = registerItem("enderium_axe", new BaseAxe(RebornToolMaterials.ENDERIUM, 5, -3f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_HOE = registerItem("enderium_hoe", new BaseHoe(RebornToolMaterials.ENDERIUM, -7, 0f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_KATANA = registerItem("enderium_katana", new BaseSword(RebornToolMaterials.ENDERIUM, 0, -1.6f, new FabricItemSettings().fireproof()));


    public static Item SHIBUICHI_ALLOY_SWORD = registerItem("shibuichi_alloy_sword", new BaseSword(RebornToolMaterials.SHIBUICHI_ALLOY, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item SHIBUICHI_ALLOY_SHOVEL = registerItem("shibuichi_alloy_shovel", new BaseShovel(RebornToolMaterials.SHIBUICHI_ALLOY, 1, -3f, new FabricItemSettings().fireproof()));
    public static Item SHIBUICHI_ALLOY_PICKAXE = registerItem("shibuichi_alloy_pickaxe", new BasePickaxe(RebornToolMaterials.SHIBUICHI_ALLOY, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item SHIBUICHI_ALLOY_AXE = registerItem("shibuichi_alloy_axe", new BaseAxe(RebornToolMaterials.SHIBUICHI_ALLOY, 5, -3f, new FabricItemSettings().fireproof()));
    public static Item SHIBUICHI_ALLOY_HOE = registerItem("shibuichi_alloy_hoe", new BaseHoe(RebornToolMaterials.SHIBUICHI_ALLOY, -2, 0f, new FabricItemSettings().fireproof()));
    public static Item SHIBUICHI_ALLOY_KATANA = registerItem("shibuichi_alloy_katana", new BaseSword(RebornToolMaterials.SHIBUICHI_ALLOY, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item MAGISTEEL_SWORD = registerItem("magisteel_sword", new BaseSword(RebornToolMaterials.MAGISTEEL, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item MAGISTEEL_SHOVEL = registerItem("magisteel_shovel", new BaseShovel(RebornToolMaterials.MAGISTEEL, 1, -3f, new FabricItemSettings().fireproof()));
    public static Item MAGISTEEL_PICKAXE = registerItem("magisteel_pickaxe", new BasePickaxe(RebornToolMaterials.MAGISTEEL, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item MAGISTEEL_AXE = registerItem("magisteel_axe", new BaseAxe(RebornToolMaterials.MAGISTEEL, 5, -3f, new FabricItemSettings().fireproof()));
    public static Item MAGISTEEL_HOE = registerItem("magisteel_hoe", new BaseHoe(RebornToolMaterials.MAGISTEEL, -3, 0f, new FabricItemSettings().fireproof()));
    public static Item MAGISTEEL_KATANA = registerItem("magisteel_katana", new BaseSword(RebornToolMaterials.MAGISTEEL, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item ORICHALCUM_SWORD = registerItem("orichalcum_sword", new BaseSword(RebornToolMaterials.ORICHALCUM, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item ORICHALCUM_SHOVEL = registerItem("orichalcum_shovel", new BaseShovel(RebornToolMaterials.ORICHALCUM, 1, -3f, new FabricItemSettings().fireproof()));
    public static Item ORICHALCUM_PICKAXE = registerItem("orichalcum_pickaxe", new BasePickaxe(RebornToolMaterials.ORICHALCUM, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item ORICHALCUM_AXE = registerItem("orichalcum_axe", new BaseAxe(RebornToolMaterials.ORICHALCUM, 5, -3f, new FabricItemSettings().fireproof().fireproof()));
    public static Item ORICHALCUM_HOE = registerItem("orichalcum_hoe", new BaseHoe(RebornToolMaterials.ORICHALCUM, -3, 0f, new FabricItemSettings().fireproof().fireproof()));
    public static Item ORICHALCUM_KATANA = registerItem("orichalcum_katana", new BaseSword(RebornToolMaterials.ORICHALCUM, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item MITHRIL_SWORD = registerItem("mithril_sword", new BaseSword(RebornToolMaterials.MITHRIL, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item MITHRIL_SHOVEL = registerItem("mithril_shovel", new BaseShovel(RebornToolMaterials.MITHRIL, 1, -3f, new FabricItemSettings().fireproof()));
    public static Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe", new BasePickaxe(RebornToolMaterials.MITHRIL, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item MITHRIL_AXE = registerItem("mithril_axe", new BaseAxe(RebornToolMaterials.MITHRIL, 5, -3f, new FabricItemSettings().fireproof()));
    public static Item MITHRIL_HOE = registerItem("mithril_hoe", new BaseHoe(RebornToolMaterials.MITHRIL, -3, 0f, new FabricItemSettings().fireproof()));
    public static Item MITHRIL_KATANA = registerItem("mithril_katana", new BaseSword(RebornToolMaterials.MITHRIL, 0, -1.6f, new FabricItemSettings().fireproof()));


    public static Item SILVER_CLAYMORE = registerItem("silver_claymore", new BaseSword(RebornToolMaterials.SILVER, 2, -3f, new FabricItemSettings()));
    public static Item CUTTER_237 = registerItem("cutter_237", new BaseSword(RebornToolMaterials.CUTTER237, 3, -1.8f, new FabricItemSettings().fireproof()));
    public static Item REBELLION = registerItem("rebellion", new BaseSword(RebornToolMaterials.DMC, 4, -2.6f, new FabricItemSettings().fireproof()));
    public static Item YAMATO = registerItem("yamato", new YamatoSword(RebornToolMaterials.DMC, -1, -1.6f, new FabricItemSettings().fireproof()));
    public static Item RED_QUEEN = registerItem("red_queen", new ExceedSword(RebornToolMaterials.DMC, 2 , -2.4f, new FabricItemSettings().fireproof()));
    public static Item MURASAMA = registerItem("murasama", new BaseSword(RebornToolMaterials.HFB, 3, -1.6f, new FabricItemSettings()));
    public static Item BLADEWOLF = registerItem("bladewolf", new BaseSword(RebornToolMaterials.HFB, 5, -2.4f, new FabricItemSettings()));
    public static Item POWER_SWORD = registerItem("power_sword", new PowerSword(RebornToolMaterials.POWER, 5, -2.4f, new FabricItemSettings()));
    public static Item SILENCE = registerItem("silence", new BaseSword(RebornToolMaterials.POWER, 8, -2.8f, new FabricItemSettings().fireproof()));


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


        addToItemGroup(ItemGroupUtil.REBORN12K, SHIBUICHI_ALLOY_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, SHIBUICHI_ALLOY_SHOVEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, SHIBUICHI_ALLOY_PICKAXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, SHIBUICHI_ALLOY_AXE);
        addToItemGroup(ItemGroupUtil.REBORN12K, SHIBUICHI_ALLOY_HOE);
        addToItemGroup(ItemGroupUtil.REBORN12K, SHIBUICHI_ALLOY_KATANA);

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

    private static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Tools");
    }
}
