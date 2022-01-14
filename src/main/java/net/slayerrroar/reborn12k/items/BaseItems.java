package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.item_class.EnchantedGoldenBanana;
import net.slayerrroar.reborn12k.items.item_class.GoldenBanana;
import net.slayerrroar.reborn12k.items.item_class.UraniumItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class BaseItems {

    // Resources

    public static final Item TOPAZ = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item OPAL = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item RUBY = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item SAPPHIRE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item CHROME_DUST = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item URANIUM = new UraniumItem(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item COBALT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item MANATITE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item ELEMENT_115 = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item RAW_TIN = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item RAW_SILVER = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item RAW_BRONZE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item RAW_STEEL = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item TIN_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item SILVER_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item BRONZE_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item CARBON_STEEL_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item BLAZING_STEEL_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item THELOSITE_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ARCHEOSITE_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    // Mob Drops



    // Food

    public static final Item BANANA = new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build()).group(Reborn12KItemGroup.REBORN12K));
    public static final Item GOLDEN_BANANA = new GoldenBanana(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(1.08f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*30, 3), 1f).alwaysEdible().build()).group(Reborn12KItemGroup.REBORN12K));
    public static final Item ENCHANTED_GOLDEN_BANANA = new EnchantedGoldenBanana(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(1.08f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*300, 6), 1f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*300, 3), 1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*180, 5), 1f).alwaysEdible().build()).group(Reborn12KItemGroup.REBORN12K));


    public static void register() {

        // Resources

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "topaz"), TOPAZ);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "opal"), OPAL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "sapphire"), SAPPHIRE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "manatite"), MANATITE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "element_115"), ELEMENT_115);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "chrome_dust"), CHROME_DUST);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "uranium"), URANIUM);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cobalt"), COBALT);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_tin"), RAW_TIN);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_silver"), RAW_SILVER);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_bronze"), RAW_BRONZE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_steel"), RAW_STEEL);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "tin_ingot"), TIN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_ingot"), BRONZE_INGOT);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "carbon_steel_ingot"), CARBON_STEEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_ingot"), BLAZING_STEEL_INGOT);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_ingot"), THELOSITE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_ingot"), ARCHEOSITE_INGOT);

        // Mob Drops



        // Food

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "banana"), BANANA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "golden_banana"), GOLDEN_BANANA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "enchanted_golden_banana"), ENCHANTED_GOLDEN_BANANA);

        Reborn12K.LOGGER.info("Registering Base Items for " + Reborn12K.MOD_ID);


    }
}