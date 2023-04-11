package net.slayerrroar.reborn12k.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.slayerrroar.reborn12k.util.ItemGroupUtil;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.tools.material.*;
import net.slayerrroar.reborn12k.tools.type.*;

@SuppressWarnings("unused") //todo: for Magisteel, Orichalcum and Mithril -> adjust values of tool materials

public class RebornTools {

    public static Item WOODEN_KATANA = registerItem("wooden_katana", new Katana(WoodMaterial.INSTANCE, 1, -1.6f, new FabricItemSettings()));
    public static Item STONE_KATANA = registerItem("stone_katana", new Katana(StoneMaterial.INSTANCE, 1, -1.6f, new FabricItemSettings()));
    public static Item IRON_KATANA = registerItem("iron_katana", new Katana(IronMaterial.INSTANCE, 1, -1.6f, new FabricItemSettings()));
    public static Item DIAMOND_KATANA = registerItem("diamond_katana", new Katana(DiamondMaterial.INSTANCE, 0, -1.6f, new FabricItemSettings()));
    public static Item NETHERITE_KATANA = registerItem("netherite_katana", new Katana(NetheriteMaterial.INSTANCE, 0, -1.6f, new FabricItemSettings().fireproof()));
    public static Item GOLDEN_KATANA = registerItem("golden_katana", new Katana(GoldMaterial.INSTANCE, 1, -1.6f, new FabricItemSettings()));

    public static Item ARCHEOSITE_SWORD = registerItem("archeosite_sword", new BaseSword(ArcheositeMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_SHOVEL = registerItem("archeosite_shovel", new BaseShovel(ArcheositeMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_PICKAXE = registerItem("archeosite_pickaxe", new BasePickaxe(ArcheositeMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_AXE = registerItem("archeosite_axe", new BaseAxe(ArcheositeMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_HOE = registerItem("archeosite_hoe", new BaseHoe(ArcheositeMaterial.INSTANCE, -7, 0.0f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_KATANA = registerItem("archeosite_katana", new Katana(ArcheositeMaterial.INSTANCE, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item BRONZE_SWORD = registerItem("bronze_sword", new BaseSword(BronzeMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings()));
    public static Item BRONZE_SHOVEL = registerItem("bronze_shovel", new BaseShovel(BronzeMaterial.INSTANCE, 2, -3.0f, new FabricItemSettings()));
    public static Item BRONZE_PICKAXE = registerItem("bronze_pickaxe", new BasePickaxe(BronzeMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings()));
    public static Item BRONZE_AXE = registerItem("bronze_axe", new BaseAxe(BronzeMaterial.INSTANCE, 7, -3.1f, new FabricItemSettings()));
    public static Item BRONZE_HOE = registerItem("bronze_hoe", new BaseHoe(BronzeMaterial.INSTANCE, -1, -1.0f, new FabricItemSettings()));
    public static Item BRONZE_KATANA = registerItem("bronze_katana", new Katana(BronzeMaterial.INSTANCE, 1, -1.6f, new FabricItemSettings()));

    public static Item STEEL_SWORD = registerItem("steel_sword", new BaseSword(SteelMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings()));
    public static Item STEEL_SHOVEL = registerItem("steel_shovel", new BaseShovel(SteelMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings()));
    public static Item STEEL_PICKAXE = registerItem("steel_pickaxe", new BasePickaxe(SteelMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings()));
    public static Item STEEL_AXE = registerItem("steel_axe", new BaseAxe(SteelMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings()));
    public static Item STEEL_HOE = registerItem("steel_hoe", new BaseHoe(SteelMaterial.INSTANCE, -4, 0.0f, new FabricItemSettings()));
    public static Item STEEL_KATANA = registerItem("steel_katana", new Katana(SteelMaterial.INSTANCE, 0, -1.6f, new FabricItemSettings()));

    public static Item TUNGSTENSTEEL_SWORD = registerItem("tungstensteel_sword", new BaseSword(TungstensteelMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_SHOVEL = registerItem("tungstensteel_shovel", new BaseShovel(TungstensteelMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_PICKAXE = registerItem("tungstensteel_pickaxe", new BasePickaxe(TungstensteelMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_AXE = registerItem("tungstensteel_axe", new BaseAxe(TungstensteelMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_HOE = registerItem("tungstensteel_hoe", new BaseHoe(TungstensteelMaterial.INSTANCE, -5, 0.0f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_KATANA = registerItem("tungstensteel_katana", new Katana(TungstensteelMaterial.INSTANCE, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item THELOSITE_SWORD = registerItem("thelosite_sword", new BaseSword(ThelositeMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item THELOSITE_SHOVEL = registerItem("thelosite_shovel", new BaseShovel(ThelositeMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item THELOSITE_PICKAXE = registerItem("thelosite_pickaxe", new BasePickaxe(ThelositeMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item THELOSITE_AXE = registerItem("thelosite_axe", new BaseAxe(ThelositeMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item THELOSITE_HOE = registerItem("thelosite_hoe", new BaseHoe(ThelositeMaterial.INSTANCE, -8, 0.0f, new FabricItemSettings().fireproof()));
    public static Item THELOSITE_KATANA = registerItem("thelosite_katana", new Katana(ThelositeMaterial.INSTANCE, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item TITANIUM_SWORD = registerItem("titanium_sword", new BaseSword(TitaniumMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings()));
    public static Item TITANIUM_SHOVEL = registerItem("titanium_shovel", new BaseShovel(TitaniumMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings()));
    public static Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe", new BasePickaxe(TitaniumMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings()));
    public static Item TITANIUM_AXE = registerItem("titanium_axe", new BaseAxe(TitaniumMaterial.INSTANCE, 6, -3.0f, new FabricItemSettings()));
    public static Item TITANIUM_HOE = registerItem("titanium_hoe", new BaseHoe(TitaniumMaterial.INSTANCE, -2, 0.0f, new FabricItemSettings()));
    public static Item TITANIUM_KATANA = registerItem("titanium_katana", new Katana(TitaniumMaterial.INSTANCE, 0, -1.6f, new FabricItemSettings()));

    public static Item ADVANCED_ALLOY_SWORD = registerItem("advanced_alloy_sword", new BaseSword(AdvancedAlloyMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_SHOVEL = registerItem("advanced_alloy_shovel", new BaseShovel(AdvancedAlloyMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_PICKAXE = registerItem("advanced_alloy_pickaxe", new BasePickaxe(AdvancedAlloyMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_AXE = registerItem("advanced_alloy_axe", new BaseAxe(AdvancedAlloyMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_HOE = registerItem("advanced_alloy_hoe", new BaseHoe(AdvancedAlloyMaterial.INSTANCE, -3, 0.0f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_KATANA = registerItem("advanced_alloy_katana", new Katana(AdvancedAlloyMaterial.INSTANCE, 0, -1.6f, new FabricItemSettings()));

    public static Item IRIDIUM_ALLOY_SWORD = registerItem("iridium_alloy_sword", new BaseSword(IridiumAlloyMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_SHOVEL = registerItem("iridium_alloy_shovel", new BaseShovel(IridiumAlloyMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_PICKAXE = registerItem("iridium_alloy_pickaxe", new BasePickaxe(IridiumAlloyMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_AXE = registerItem("iridium_alloy_axe", new BaseAxe(IridiumAlloyMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_HOE = registerItem("iridium_alloy_hoe", new BaseHoe(IridiumAlloyMaterial.INSTANCE, -6, 0.0f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_KATANA = registerItem("iridium_alloy_katana", new Katana(IridiumAlloyMaterial.INSTANCE, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item ELECTRUM_SWORD = registerItem("electrum_sword", new BaseSword(ElectrumMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings()));
    public static Item ELECTRUM_SHOVEL = registerItem("electrum_shovel", new BaseShovel(ElectrumMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings()));
    public static Item ELECTRUM_PICKAXE = registerItem("electrum_pickaxe", new BasePickaxe(ElectrumMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings()));
    public static Item ELECTRUM_AXE = registerItem("electrum_axe", new BaseAxe(ElectrumMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings()));
    public static Item ELECTRUM_HOE = registerItem("electrum_hoe", new BaseHoe(ElectrumMaterial.INSTANCE, -3, 0.0f, new FabricItemSettings()));
    public static Item ELECTRUM_KATANA = registerItem("electrum_katana", new Katana(ElectrumMaterial.INSTANCE, 0, -1.6f, new FabricItemSettings()));

    public static Item SIGNALUM_SWORD = registerItem("signalum_sword", new BaseSword(SignalumMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings()));
    public static Item SIGNALUM_SHOVEL = registerItem("signalum_shovel", new BaseShovel(SignalumMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings()));
    public static Item SIGNALUM_PICKAXE = registerItem("signalum_pickaxe", new BasePickaxe(SignalumMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings()));
    public static Item SIGNALUM_AXE = registerItem("signalum_axe", new BaseAxe(SignalumMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings()));
    public static Item SIGNALUM_HOE = registerItem("signalum_hoe", new BaseHoe(SignalumMaterial.INSTANCE, -4, 0.0f, new FabricItemSettings()));
    public static Item SIGNALUM_KATANA = registerItem("signalum_katana", new Katana(SignalumMaterial.INSTANCE, 0, -1.6f, new FabricItemSettings()));

    public static Item ENDERIUM_SWORD = registerItem("enderium_sword", new BaseSword(EnderiumMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_SHOVEL = registerItem("enderium_shovel", new BaseShovel(EnderiumMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_PICKAXE = registerItem("enderium_pickaxe", new BasePickaxe(EnderiumMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_AXE = registerItem("enderium_axe", new BaseAxe(EnderiumMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_HOE = registerItem("enderium_hoe", new BaseHoe(EnderiumMaterial.INSTANCE, -7, 0.0f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_KATANA = registerItem("enderium_katana", new Katana(EnderiumMaterial.INSTANCE, 0, -1.6f, new FabricItemSettings().fireproof()));


    public static Item MAGISTEEL_SWORD = registerItem("magisteel_sword", new BaseSword(MagisteelMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item MAGISTEEL_SHOVEL = registerItem("magisteel_shovel", new BaseShovel(MagisteelMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item MAGISTEEL_PICKAXE = registerItem("magisteel_pickaxe", new BasePickaxe(MagisteelMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item MAGISTEEL_AXE = registerItem("magisteel_axe", new BaseAxe(MagisteelMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item MAGISTEEL_HOE = registerItem("magisteel_hoe", new BaseHoe(MagisteelMaterial.INSTANCE, -3, 0.0f, new FabricItemSettings().fireproof()));
    public static Item MAGISTEEL_KATANA = registerItem("magisteel_katana", new Katana(MagisteelMaterial.INSTANCE, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item ORICHALCUM_SWORD = registerItem("orichalcum_sword", new BaseSword(OrichalcumMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item ORICHALCUM_SHOVEL = registerItem("orichalcum_shovel", new BaseShovel(OrichalcumMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item ORICHALCUM_PICKAXE = registerItem("orichalcum_pickaxe", new BasePickaxe(OrichalcumMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item ORICHALCUM_AXE = registerItem("orichalcum_axe", new BaseAxe(OrichalcumMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().fireproof().fireproof()));
    public static Item ORICHALCUM_HOE = registerItem("orichalcum_hoe", new BaseHoe(OrichalcumMaterial.INSTANCE, -3, 0.0f, new FabricItemSettings().fireproof().fireproof()));
    public static Item ORICHALCUM_KATANA = registerItem("orichalcum_katana", new Katana(OrichalcumMaterial.INSTANCE, 0, -1.6f, new FabricItemSettings().fireproof()));

    public static Item MITHRIL_SWORD = registerItem("mithril_sword", new BaseSword(MithrilMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item MITHRIL_SHOVEL = registerItem("mithril_shovel", new BaseShovel(MithrilMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe", new BasePickaxe(MithrilMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item MITHRIL_AXE = registerItem("mithril_axe", new BaseAxe(MithrilMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item MITHRIL_HOE = registerItem("mithril_hoe", new BaseHoe(MithrilMaterial.INSTANCE, -3, 0.0f, new FabricItemSettings().fireproof()));
    public static Item MITHRIL_KATANA = registerItem("mithril_katana", new Katana(MithrilMaterial.INSTANCE, 0, -1.6f, new FabricItemSettings().fireproof()));


    public static Item SILVER_CLAYMORE = registerItem("silver_claymore", new BaseSword(SilverMaterial.INSTANCE, 2, -3.0f, new FabricItemSettings()));
    public static Item CUTTER_237 = registerItem("cutter_237", new Cutter(DueTreSette.INSTANCE, 3, -1.8f, new FabricItemSettings().fireproof()));
    public static Item YAMATO = registerItem("yamato", new Katana(YamatoMaterial.INSTANCE, 1, -1.6f, new FabricItemSettings().fireproof()));
    public static Item POWER_SWORD = registerItem("power_sword", new BaseSword(PowerMaterial.INSTANCE, 5, -2.4f, new FabricItemSettings()));
    public static Item MURASAMA = registerItem("murasama", new Katana(HFBMaterial.INSTANCE, 3, -1.6f, new FabricItemSettings()));
    public static Item BLADEWOLF = registerItem("bladewolf", new BaseSword(HFBMaterial.INSTANCE, 5, -2.4f, new FabricItemSettings()));
    public static Item REBELLION = registerItem("rebellion", new BaseSword(RebellionMaterial.INSTANCE, 5, -2.6f, new FabricItemSettings().fireproof()));
    public static Item RED_QUEEN = registerItem("red_queen", new ExceedSword(RedQueen.INSTANCE, 5 , -2.4f, new FabricItemSettings().fireproof()));
    public static Item SILENCE = registerItem("silence", new BaseSword(SilenceMaterial.INSTANCE, 3, -2.8f, new FabricItemSettings().fireproof()));


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
        addToItemGroup(ItemGroupUtil.REBORN12K, YAMATO);
        addToItemGroup(ItemGroupUtil.REBORN12K, POWER_SWORD);
        addToItemGroup(ItemGroupUtil.REBORN12K, MURASAMA);
        addToItemGroup(ItemGroupUtil.REBORN12K, BLADEWOLF);
        addToItemGroup(ItemGroupUtil.REBORN12K, REBELLION);
        addToItemGroup(ItemGroupUtil.REBORN12K, RED_QUEEN);
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
