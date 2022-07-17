package net.slayerrroar.reborn12k.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.tools.toolmaterial.*;
import net.slayerrroar.reborn12k.tools.tooltype.*;

public class Tools {


    public static ToolItem BRONZE_SWORD = new BaseSword(BronzeMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem BRONZE_SHOVEL = new BaseShovel(BronzeMaterial.INSTANCE, 2, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem BRONZE_PICKAXE = new BasePickaxe(BronzeMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem BRONZE_AXE = new BaseAxe(BronzeMaterial.INSTANCE, 7, -3.1f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem BRONZE_HOE = new BaseHoe(BronzeMaterial.INSTANCE, -1, -1.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static ToolItem TITANIUM_SWORD = new BaseSword(TitaniumMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem TITANIUM_SHOVEL = new BaseShovel(TitaniumMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem TITANIUM_PICKAXE = new BasePickaxe(TitaniumMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem TITANIUM_AXE = new BaseAxe(TitaniumMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem TITANIUM_HOE = new BaseHoe(TitaniumMaterial.INSTANCE, -2, 0.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static ToolItem ELECTRUM_SWORD = new BaseSword(ElectrumMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem ELECTRUM_SHOVEL = new BaseShovel(ElectrumMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem ELECTRUM_PICKAXE = new BasePickaxe(ElectrumMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem ELECTRUM_AXE = new BaseAxe(ElectrumMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem ELECTRUM_HOE = new BaseHoe(ElectrumMaterial.INSTANCE, -1, 0.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static ToolItem STEEL_SWORD = new BaseSword(SteelMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem STEEL_SHOVEL = new BaseShovel(SteelMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem STEEL_PICKAXE = new BasePickaxe(SteelMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem STEEL_AXE = new BaseAxe(SteelMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem STEEL_HOE = new BaseHoe(SteelMaterial.INSTANCE, -4, 0.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static ToolItem SIGNALUM_SWORD = new BaseSword(SignalumMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem SIGNALUM_SHOVEL = new BaseShovel(SignalumMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem SIGNALUM_PICKAXE = new BasePickaxe(SignalumMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem SIGNALUM_AXE = new BaseAxe(SignalumMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem SIGNALUM_HOE = new BaseHoe(SignalumMaterial.INSTANCE, -4, 0.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static ToolItem ADVANCED_ALLOY_SWORD = new BaseSword(AdvancedAlloyMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem ADVANCED_ALLOY_SHOVEL = new BaseShovel(AdvancedAlloyMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem ADVANCED_ALLOY_PICKAXE = new BasePickaxe(AdvancedAlloyMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem ADVANCED_ALLOY_AXE = new BaseAxe(AdvancedAlloyMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem ADVANCED_ALLOY_HOE = new BaseHoe(AdvancedAlloyMaterial.INSTANCE, -3, 0.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static ToolItem BLAZING_STEEL_SWORD = new BaseSword(BlazingSteelMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).fireproof());
    public static ToolItem BLAZING_STEEL_SHOVEL = new BaseShovel(BlazingSteelMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).fireproof());
    public static ToolItem BLAZING_STEEL_PICKAXE = new BasePickaxe(BlazingSteelMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).fireproof());
    public static ToolItem BLAZING_STEEL_AXE = new BaseAxe(BlazingSteelMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).fireproof());
    public static ToolItem BLAZING_STEEL_HOE = new BaseHoe(BlazingSteelMaterial.INSTANCE, -5, 0.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).fireproof());

    public static ToolItem ENDERIUM_SWORD = new BaseSword(EnderiumMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem ENDERIUM_SHOVEL = new BaseShovel(EnderiumMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem ENDERIUM_PICKAXE = new BasePickaxe(EnderiumMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem ENDERIUM_AXE = new BaseAxe(EnderiumMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem ENDERIUM_HOE = new BaseHoe(EnderiumMaterial.INSTANCE, -3, 0.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static ToolItem IRIDIUM_ALLOY_SWORD = new BaseSword(IridiumAlloyMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem IRIDIUM_ALLOY_SHOVEL = new BaseShovel(IridiumAlloyMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem IRIDIUM_ALLOY_PICKAXE = new BasePickaxe(IridiumAlloyMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem IRIDIUM_ALLOY_AXE = new BaseAxe(IridiumAlloyMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static ToolItem IRIDIUM_ALLOY_HOE = new BaseHoe(IridiumAlloyMaterial.INSTANCE, -4, 0.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static ToolItem THELOSITE_SWORD = new BaseSword(ThelositeMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).fireproof());
    public static ToolItem THELOSITE_SHOVEL = new BaseShovel(ThelositeMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).fireproof());
    public static ToolItem THELOSITE_PICKAXE = new BasePickaxe(ThelositeMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).fireproof());
    public static ToolItem THELOSITE_AXE = new BaseAxe(ThelositeMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).fireproof());
    public static ToolItem THELOSITE_HOE = new BaseHoe(ThelositeMaterial.INSTANCE, -6, 0.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).fireproof());

    public static ToolItem ARCHEOSITE_SWORD = new BaseSword(ArcheositeMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).fireproof());
    public static ToolItem ARCHEOSITE_SHOVEL = new BaseShovel(ArcheositeMaterial.INSTANCE, 1, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).fireproof());
    public static ToolItem ARCHEOSITE_PICKAXE = new BasePickaxe(ArcheositeMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).fireproof());
    public static ToolItem ARCHEOSITE_AXE = new BaseAxe(ArcheositeMaterial.INSTANCE, 5, -3.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).fireproof());
    public static ToolItem ARCHEOSITE_HOE = new BaseHoe(ArcheositeMaterial.INSTANCE, -5, 0.0f, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).fireproof());

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_sword"), BRONZE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_shovel"), BRONZE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_pickaxe"), BRONZE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_axe"), BRONZE_AXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_hoe"), BRONZE_HOE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "titanium_sword"), TITANIUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "titanium_shovel"), TITANIUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "titanium_pickaxe"), TITANIUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "titanium_axe"), TITANIUM_AXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "titanium_hoe"), TITANIUM_HOE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "electrum_sword"), ELECTRUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "electrum_shovel"), ELECTRUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "electrum_pickaxe"), ELECTRUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "electrum_axe"), ELECTRUM_AXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "electrum_hoe"), ELECTRUM_HOE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "steel_sword"), STEEL_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "steel_shovel"), STEEL_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "steel_pickaxe"), STEEL_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "steel_axe"), STEEL_AXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "steel_hoe"), STEEL_HOE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "signalum_sword"), SIGNALUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "signalum_shovel"), SIGNALUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "signalum_pickaxe"), SIGNALUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "signalum_axe"), SIGNALUM_AXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "signalum_hoe"), SIGNALUM_HOE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "advanced_alloy_sword"), ADVANCED_ALLOY_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "advanced_alloy_shovel"), ADVANCED_ALLOY_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "advanced_alloy_pickaxe"), ADVANCED_ALLOY_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "advanced_alloy_axe"), ADVANCED_ALLOY_AXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "advanced_alloy_hoe"), ADVANCED_ALLOY_HOE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_sword"), BLAZING_STEEL_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_shovel"), BLAZING_STEEL_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_pickaxe"), BLAZING_STEEL_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_axe"), BLAZING_STEEL_AXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_hoe"), BLAZING_STEEL_HOE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "enderium_sword"), ENDERIUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "enderium_shovel"), ENDERIUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "enderium_pickaxe"), ENDERIUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "enderium_axe"), ENDERIUM_AXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "enderium_hoe"), ENDERIUM_HOE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "iridium_alloy_sword"), IRIDIUM_ALLOY_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "iridium_alloy_shovel"), IRIDIUM_ALLOY_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "iridium_alloy_pickaxe"), IRIDIUM_ALLOY_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "iridium_alloy_axe"), IRIDIUM_ALLOY_AXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "iridium_alloy_hoe"), IRIDIUM_ALLOY_HOE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_sword"), THELOSITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_shovel"), THELOSITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_pickaxe"), THELOSITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_axe"), THELOSITE_AXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_hoe"), THELOSITE_HOE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_sword"), ARCHEOSITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_shovel"), ARCHEOSITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_pickaxe"), ARCHEOSITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_axe"), ARCHEOSITE_AXE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_hoe"), ARCHEOSITE_HOE);

        Reborn12K.LOGGER.info("Registering Tools for " + Reborn12K.MOD_ID);


    }
}
