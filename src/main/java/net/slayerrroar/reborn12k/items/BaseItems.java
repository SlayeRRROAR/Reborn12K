package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.slayerrroar.reborn12k.items.item_class.EnchantedGoldenBanana;
import net.slayerrroar.reborn12k.items.item_class.GoldenBanana;
import net.slayerrroar.reborn12k.items.item_class.UraniumItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BaseItems {

    // Resources

    public static final Item TOPAZ = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item OPAL = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item RUBY = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item SAPPHIRE = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    public static final Item CHROME_DUST = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item URANIUM = new UraniumItem(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item COBALT = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    public static final Item MANATITE = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    public static final Item RAW_TIN = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item RAW_SILVER = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item RAW_BRONZE = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item RAW_STEEL = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    public static final Item TIN_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item SILVER_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item BRONZE_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    
    public static final Item CARBON_STEEL_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item BLAZING_STEEL_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    public static final Item THELOSITE_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item ARCHEOSITE_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    // Mob Drops



    // Food

    public static final Item BANANA = new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build()).group(ItemGroup.FOOD));
    public static final Item GOLDEN_BANANA = new GoldenBanana(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(1.08f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*30, 3), 1f).alwaysEdible().build()).group(ItemGroup.FOOD));
    public static final Item ENCHANTED_GOLDEN_BANANA = new EnchantedGoldenBanana(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(1.08f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*300, 6), 1f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*300, 3), 1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*180, 5), 1f).alwaysEdible().build()).group(ItemGroup.FOOD));

    
public static void register() {
        
    // Resources
        
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "topaz"), TOPAZ);
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "opal"), OPAL);
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "ruby"), RUBY);
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "sapphire"), SAPPHIRE);

    Registry.register(Registry.ITEM, new Identifier("reborn12k", "manatite"), MANATITE);
        
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "chrome_dust"), CHROME_DUST);
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "uranium"), URANIUM);
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "cobalt"), COBALT);
        
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "raw_tin"), RAW_TIN);
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "raw_silver"), RAW_SILVER);
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "raw_bronze"), RAW_BRONZE);
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "raw_steel"), RAW_STEEL);
        
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "tin_ingot"), TIN_INGOT);
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "silver_ingot"), SILVER_INGOT);
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "bronze_ingot"), BRONZE_INGOT);
        
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "carbon_steel_ingot"), CARBON_STEEL_INGOT);
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "blazing_steel_ingot"), BLAZING_STEEL_INGOT);
        
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "thelosite_ingot"), THELOSITE_INGOT);
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "archeosite_ingot"), ARCHEOSITE_INGOT);

    // Mob Drops

    
    
    // Food

    Registry.register(Registry.ITEM, new Identifier("reborn12k", "banana"), BANANA);
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "golden_banana"), GOLDEN_BANANA);
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "enchanted_golden_banana"), ENCHANTED_GOLDEN_BANANA);


    }
}