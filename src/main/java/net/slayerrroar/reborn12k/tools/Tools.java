package net.slayerrroar.reborn12k.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.tools.toolmaterial.*;
import net.slayerrroar.reborn12k.tools.tooltype.*;

public class Tools {

    public static ToolItem BRONZE_SWORD = new BaseSword(BronzeMaterial.INSTANCE, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem BRONZE_SHOVEL = new BaseShovel(BronzeMaterial.INSTANCE, 2, -3.0f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem BRONZE_PICKAXE = new BasePickaxe(BronzeMaterial.INSTANCE, 1, -2.8f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem BRONZE_AXE = new BaseAxe(BronzeMaterial.INSTANCE, 7, -3.1f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem BRONZE_HOE = new BaseHoe(BronzeMaterial.INSTANCE, -1, -1.0f, new Item.Settings().group(ItemGroup.TOOLS));
    
    public static ToolItem CARBON_STEEL_SWORD = new BaseSword(CarbonSteelMaterial.INSTANCE, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem CARBON_STEEL_SHOVEL = new BaseShovel(CarbonSteelMaterial.INSTANCE, 1, -3.0f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem CARBON_STEEL_PICKAXE = new BasePickaxe(CarbonSteelMaterial.INSTANCE, 1, -2.8f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem CARBON_STEEL_AXE = new BaseAxe(CarbonSteelMaterial.INSTANCE, 5, -3.0f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem CARBON_STEEL_HOE = new BaseHoe(CarbonSteelMaterial.INSTANCE, -4, 0.0f, new Item.Settings().group(ItemGroup.TOOLS));
    
    public static ToolItem BLAZING_STEEL_SWORD = new BaseSword(BlazingSteelMaterial.INSTANCE, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static ToolItem BLAZING_STEEL_SHOVEL = new BaseShovel(BlazingSteelMaterial.INSTANCE, 1, -3.0f, new Item.Settings().group(ItemGroup.TOOLS).fireproof());
    public static ToolItem BLAZING_STEEL_PICKAXE = new BasePickaxe(BlazingSteelMaterial.INSTANCE, 1, -2.8f, new Item.Settings().group(ItemGroup.TOOLS).fireproof());
    public static ToolItem BLAZING_STEEL_AXE = new BaseAxe(BlazingSteelMaterial.INSTANCE, 5, -3.0f, new Item.Settings().group(ItemGroup.TOOLS).fireproof());
    public static ToolItem BLAZING_STEEL_HOE = new BaseHoe(BlazingSteelMaterial.INSTANCE, -5, 0.0f, new Item.Settings().group(ItemGroup.TOOLS).fireproof());
    
    public static ToolItem ARCHEOSITE_SWORD = new BaseSword(ArcheositeMaterial.INSTANCE, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static ToolItem ARCHEOSITE_SHOVEL = new BaseShovel(ArcheositeMaterial.INSTANCE, 1, -3.0f, new Item.Settings().group(ItemGroup.TOOLS).fireproof());
    public static ToolItem ARCHEOSITE_PICKAXE = new BasePickaxe(ArcheositeMaterial.INSTANCE, 1, -2.8f, new Item.Settings().group(ItemGroup.TOOLS).fireproof());
    public static ToolItem ARCHEOSITE_AXE = new BaseAxe(ArcheositeMaterial.INSTANCE, 5, -3.0f, new Item.Settings().group(ItemGroup.TOOLS).fireproof());
    public static ToolItem ARCHEOSITE_HOE = new BaseHoe(ArcheositeMaterial.INSTANCE, -5, 0.0f, new Item.Settings().group(ItemGroup.TOOLS).fireproof());
    
    public static ToolItem THELOSITE_SWORD = new BaseSword(ThelositeMaterial.INSTANCE, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static ToolItem THELOSITE_SHOVEL = new BaseShovel(ThelositeMaterial.INSTANCE, 1, -3.0f, new Item.Settings().group(ItemGroup.TOOLS).fireproof());
    public static ToolItem THELOSITE_PICKAXE = new BasePickaxe(ThelositeMaterial.INSTANCE, 1, -2.8f, new Item.Settings().group(ItemGroup.TOOLS).fireproof());
    public static ToolItem THELOSITE_AXE = new BaseAxe(ThelositeMaterial.INSTANCE, 5, -3.0f, new Item.Settings().group(ItemGroup.TOOLS).fireproof());
    public static ToolItem THELOSITE_HOE = new BaseHoe(ThelositeMaterial.INSTANCE, -6, 0.0f, new Item.Settings().group(ItemGroup.TOOLS).fireproof());

    public static ToolItem SILVER_CLAYMORE = new BaseSword(SilverMaterial.INSTANCE, 6, -3.2f, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static ToolItem CUTTER_237 = new Cutter(DueTreSette.INSTANCE, 3, -1.2f, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static ToolItem YAMATO = new BaseSword(Yamato.INSTANCE, 1, -1.6f, new Item.Settings().group(ItemGroup.COMBAT).fireproof());
    public static ToolItem POWER_SWORD = new BaseSword(PowerMaterial.INSTANCE, 1, -2.4f, new Item.Settings().group(ItemGroup.COMBAT).fireproof());

    
    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("reborn12k", "bronze_sword"), BRONZE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "bronze_shovel"), BRONZE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "bronze_pickaxe"), BRONZE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "bronze_axe"), BRONZE_AXE);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "bronze_hoe"), BRONZE_HOE);
        
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "carbon_steel_sword"), CARBON_STEEL_SWORD);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "carbon_steel_shovel"), CARBON_STEEL_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "carbon_steel_pickaxe"), CARBON_STEEL_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "carbon_steel_axe"), CARBON_STEEL_AXE);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "carbon_steel_hoe"), CARBON_STEEL_HOE);
        
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "blazing_steel_sword"), BLAZING_STEEL_SWORD);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "blazing_steel_shovel"), BLAZING_STEEL_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "blazing_steel_pickaxe"), BLAZING_STEEL_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "blazing_steel_axe"), BLAZING_STEEL_AXE);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "blazing_steel_hoe"), BLAZING_STEEL_HOE);
        
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "archeosite_sword"), ARCHEOSITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "archeosite_shovel"), ARCHEOSITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "archeosite_pickaxe"), ARCHEOSITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "archeosite_axe"), ARCHEOSITE_AXE);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "archeosite_hoe"), ARCHEOSITE_HOE);
        
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "thelosite_sword"), THELOSITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "thelosite_shovel"), THELOSITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "thelosite_pickaxe"), THELOSITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "thelosite_axe"), THELOSITE_AXE);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "thelosite_hoe"), THELOSITE_HOE);

        Registry.register(Registry.ITEM, new Identifier("reborn12k", "silver_claymore"), SILVER_CLAYMORE);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "cutter_237"), CUTTER_237);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "yamato"), YAMATO);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "power_sword"), POWER_SWORD);


    }


}
