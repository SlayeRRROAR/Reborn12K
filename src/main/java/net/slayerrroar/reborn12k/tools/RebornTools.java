package net.slayerrroar.reborn12k.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.tools.toolmaterial.*;
import net.slayerrroar.reborn12k.tools.tooltype.*;

public class RebornTools {


    public static Item BRONZE_SWORD = registerItem("bronze_sword", new BaseSword(BronzeMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings()));
    public static Item BRONZE_SHOVEL = registerItem("bronze_shovel", new BaseShovel(BronzeMaterial.INSTANCE, 2, -3.0f, new FabricItemSettings()));
    public static Item BRONZE_PICKAXE = registerItem("bronze_pickaxe", new BasePickaxe(BronzeMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings()));
    public static Item BRONZE_AXE = registerItem("bronze_axe", new BaseAxe(BronzeMaterial.INSTANCE, 7, -3.1f, new FabricItemSettings()));
    public static Item BRONZE_HOE = registerItem("bronze_hoe", new BaseHoe(BronzeMaterial.INSTANCE, -1, -1.0f, new FabricItemSettings()));

    public static Item TITANIUM_SWORD = registerItem("titanium_sword", new BaseSword(TitaniumMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings()));
    public static Item TITANIUM_SHOVEL = registerItem("titanium_shovel", new BaseShovel(TitaniumMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings()));
    public static Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe", new BasePickaxe(TitaniumMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings()));
    public static Item TITANIUM_AXE = registerItem("titanium_axe", new BaseAxe(TitaniumMaterial.INSTANCE, 6, -3.0f, new FabricItemSettings()));
    public static Item TITANIUM_HOE = registerItem("titanium_hoe", new BaseHoe(TitaniumMaterial.INSTANCE, -2, 0.0f, new FabricItemSettings()));

    public static Item ELECTRUM_SWORD = registerItem("electrum_sword", new BaseSword(ElectrumMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings()));
    public static Item ELECTRUM_SHOVEL = registerItem("electrum_shovel", new BaseShovel(ElectrumMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings()));
    public static Item ELECTRUM_PICKAXE = registerItem("electrum_pickaxe", new BasePickaxe(ElectrumMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings()));
    public static Item ELECTRUM_AXE = registerItem("electrum_axe", new BaseAxe(ElectrumMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings()));
    public static Item ELECTRUM_HOE = registerItem("electrum_hoe", new BaseHoe(ElectrumMaterial.INSTANCE, -1, 0.0f, new FabricItemSettings()));

    public static Item STEEL_SWORD = registerItem("steel_sword", new BaseSword(SteelMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings()));
    public static Item STEEL_SHOVEL = registerItem("steel_shovel", new BaseShovel(SteelMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings()));
    public static Item STEEL_PICKAXE = registerItem("steel_pickaxe", new BasePickaxe(SteelMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings()));
    public static Item STEEL_AXE = registerItem("steel_axe", new BaseAxe(SteelMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings()));
    public static Item STEEL_HOE = registerItem("steel_hoe", new BaseHoe(SteelMaterial.INSTANCE, -4, 0.0f, new FabricItemSettings()));

    public static Item SIGNALUM_SWORD = registerItem("signalum_sword", new BaseSword(SignalumMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings()));
    public static Item SIGNALUM_SHOVEL = registerItem("signalum_shovel", new BaseShovel(SignalumMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings()));
    public static Item SIGNALUM_PICKAXE = registerItem("signalum_pickaxe", new BasePickaxe(SignalumMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings()));
    public static Item SIGNALUM_AXE = registerItem("signalum_axe", new BaseAxe(SignalumMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings()));
    public static Item SIGNALUM_HOE = registerItem("signalum_hoe", new BaseHoe(SignalumMaterial.INSTANCE, -4, 0.0f, new FabricItemSettings()));

    public static Item ADVANCED_ALLOY_SWORD = registerItem("advanced_alloy_sword", new BaseSword(AdvancedAlloyMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_SHOVEL = registerItem("advanced_alloy_shovel", new BaseShovel(AdvancedAlloyMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_PICKAXE = registerItem("advanced_alloy_pickaxe", new BasePickaxe(AdvancedAlloyMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_AXE = registerItem("advanced_alloy_axe", new BaseAxe(AdvancedAlloyMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings()));
    public static Item ADVANCED_ALLOY_HOE = registerItem("advanced_alloy_hoe", new BaseHoe(AdvancedAlloyMaterial.INSTANCE, -3, 0.0f, new FabricItemSettings()));

    public static Item TUNGSTENSTEEL_SWORD = registerItem("tungstensteel_sword", new BaseSword(TungstensteelMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_SHOVEL = registerItem("tungstensteel_shovel", new BaseShovel(TungstensteelMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_PICKAXE = registerItem("tungstensteel_pickaxe", new BasePickaxe(TungstensteelMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_AXE = registerItem("tungstensteel_axe", new BaseAxe(TungstensteelMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item TUNGSTENSTEEL_HOE = registerItem("tungstensteel_hoe", new BaseHoe(TungstensteelMaterial.INSTANCE, -5, 0.0f, new FabricItemSettings().fireproof()));

    public static Item ENDERIUM_SWORD = registerItem("enderium_sword", new BaseSword(EnderiumMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_SHOVEL = registerItem("enderium_shovel", new BaseShovel(EnderiumMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_PICKAXE = registerItem("enderium_pickaxe", new BasePickaxe(EnderiumMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_AXE = registerItem("enderium_axe", new BaseAxe(EnderiumMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item ENDERIUM_HOE = registerItem("enderium_hoe", new BaseHoe(EnderiumMaterial.INSTANCE, -7, 0.0f, new FabricItemSettings().fireproof()));

    public static Item IRIDIUM_ALLOY_SWORD = registerItem("iridium_alloy_sword", new BaseSword(IridiumAlloyMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_SHOVEL = registerItem("iridium_alloy_shovel", new BaseShovel(IridiumAlloyMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_PICKAXE = registerItem("iridium_alloy_pickaxe", new BasePickaxe(IridiumAlloyMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_AXE = registerItem("iridium_alloy_axe", new BaseAxe(IridiumAlloyMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item IRIDIUM_ALLOY_HOE = registerItem("iridium_alloy_hoe", new BaseHoe(IridiumAlloyMaterial.INSTANCE, -6, 0.0f, new FabricItemSettings().fireproof()));

    public static Item ARCHEOSITE_SWORD = registerItem("archeosite_sword", new BaseSword(ArcheositeMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_SHOVEL = registerItem("archeosite_shovel", new BaseShovel(ArcheositeMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_PICKAXE = registerItem("archeosite_pickaxe", new BasePickaxe(ArcheositeMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_AXE = registerItem("archeosite_axe", new BaseAxe(ArcheositeMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item ARCHEOSITE_HOE = registerItem("archeosite_hoe", new BaseHoe(ArcheositeMaterial.INSTANCE, -7, 0.0f, new FabricItemSettings().fireproof()));

    public static Item THELOSITE_SWORD = registerItem("thelosite_sword", new BaseSword(ThelositeMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings()));
    public static Item THELOSITE_SHOVEL = registerItem("thelosite_shovel", new BaseShovel(ThelositeMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings()));
    public static Item THELOSITE_PICKAXE = registerItem("thelosite_pickaxe", new BasePickaxe(ThelositeMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings()));
    public static Item THELOSITE_AXE = registerItem("thelosite_axe", new BaseAxe(ThelositeMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings()));
    public static Item THELOSITE_HOE = registerItem("thelosite_hoe", new BaseHoe(ThelositeMaterial.INSTANCE, -1, 0.0f, new FabricItemSettings()));


    public static Item NICHIRIN_SWORD = registerItem("nichirin_sword", new BaseSword(NichirinMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static Item NICHIRIN_SHOVEL = registerItem("nichirin_shovel", new BaseShovel(NichirinMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().fireproof()));
    public static Item NICHIRIN_PICKAXE = registerItem("nichirin_pickaxe", new BasePickaxe(NichirinMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static Item NICHIRIN_AXE = registerItem("nichirin_axe", new BaseAxe(NichirinMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().fireproof()));
    public static Item NICHIRIN_HOE = registerItem("nichirin_hoe", new BaseHoe(NichirinMaterial.INSTANCE, -3, 0.0f, new FabricItemSettings().fireproof()));


    public static Item SILVER_CLAYMORE = registerItem("silver_claymore", new BaseSword(SilverMaterial.INSTANCE, 2, -3.0f, new FabricItemSettings()));
    public static Item CUTTER_237 = registerItem("cutter_237", new Cutter(DueTreSette.INSTANCE, 3, -1.8f, new FabricItemSettings().fireproof()));
    public static Item YAMATO = registerItem("yamato", new BaseSword(YamatoMaterial.INSTANCE, 1, -1.6f, new FabricItemSettings().fireproof()));
    public static Item POWER_SWORD = registerItem("power_sword", new BaseSword(PowerMaterial.INSTANCE, 5, -2.4f, new FabricItemSettings()));
    public static Item MURASAMA = registerItem("murasama", new BaseSword(HFBMaterial.INSTANCE, 3, -1.6f, new FabricItemSettings()));
    public static Item BLADEWOLF = registerItem("bladewolf", new BaseSword(HFBMaterial.INSTANCE, 5, -2.4f, new FabricItemSettings()));
    public static Item REBELLION = registerItem("rebellion", new BaseSword(RebellionMaterial.INSTANCE, 5, -2.6f, new FabricItemSettings().fireproof()));
    public static Item RED_QUEEN = registerItem("red_queen", new ExceedSword(RedQueen.INSTANCE, 5 , -2.4f, new FabricItemSettings().fireproof()));
    public static Item SILENCE = registerItem("silence", new BaseSword(SilenceMaterial.INSTANCE, 5, -2.8f, new FabricItemSettings().fireproof()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(Reborn12KItemGroup.REBORN12K, BRONZE_SWORD);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Tools");
    }
}
