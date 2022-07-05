package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Rarity;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.item_class.GlintedItem;
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
    public static final Item COBALT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item MANATITE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item ELEMENT_115 = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item RAW_TIN = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item RAW_SILVER = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item RAW_BRONZE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item TIN_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item SILVER_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item BRONZE_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item CARBON_STEEL_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item BLAZING_STEEL_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item THELOSITE_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ARCHEOSITE_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    // Mob Drops

    public static final Item DEVIL_BRINGER = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item WITHERED_STAR = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    // Food

    public static final Item BANANA = new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build()).group(Reborn12KItemGroup.REBORN12K));
    public static final Item GOLDEN_BANANA = new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(1.08f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*30, 3), 1f)
            .alwaysEdible().build()).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item ENCHANTED_GOLDEN_BANANA = new GlintedItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(1.08f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*300, 6), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*300, 3), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*180, 5), 1f)
            .alwaysEdible().build()).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));

    public static final Item CHERRY = new Item(new FabricItemSettings().food(new FoodComponent.Builder().snack().hunger(2).saturationModifier(0.2f).build()).group(Reborn12KItemGroup.REBORN12K));
    public static final Item GOLDEN_CHERRY = new Item(new FabricItemSettings().food(new FoodComponent.Builder().snack().hunger(3).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 20*1, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*10, 0), 0.7f)
            .alwaysEdible().build()).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item ENCHANTED_GOLDEN_CHERRY = new GlintedItem(new FabricItemSettings().food(new FoodComponent.Builder().snack().hunger(3).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 20*1, 4), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*30, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*240, 2), 0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*240, 3), 0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 20*120, 1), 0.1f)
            .alwaysEdible().build()).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));


    public static void register() {

        // Resources

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "topaz"), TOPAZ);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "opal"), OPAL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "sapphire"), SAPPHIRE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "manatite"), MANATITE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "element_115"), ELEMENT_115);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "chrome_dust"), CHROME_DUST);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cobalt"), COBALT);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_tin"), RAW_TIN);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_silver"), RAW_SILVER);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_bronze"), RAW_BRONZE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "tin_ingot"), TIN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_ingot"), BRONZE_INGOT);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "carbon_steel_ingot"), CARBON_STEEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_ingot"), BLAZING_STEEL_INGOT);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_ingot"), THELOSITE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_ingot"), ARCHEOSITE_INGOT);

        // Mob Drops

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "devil_bringer"), DEVIL_BRINGER);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "withered_star"), WITHERED_STAR);

        // Food

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "banana"), BANANA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "golden_banana"), GOLDEN_BANANA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "enchanted_golden_banana"), ENCHANTED_GOLDEN_BANANA);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cherry"), CHERRY);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "golden_cherry"), GOLDEN_CHERRY);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "enchanted_golden_cherry"), ENCHANTED_GOLDEN_CHERRY);

        Reborn12K.LOGGER.info("Registering Base Items for " + Reborn12K.MOD_ID);


    }
}