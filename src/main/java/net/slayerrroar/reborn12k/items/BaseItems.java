package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
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

    public static final Item COAL_PIECE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item COAL_DUST = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));

    public static final Item RAW_TIN = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_SILVER = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_LEAD = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_NICKEL = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_TITANIUM = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));

    public static final Item RAW_ALUMINUM = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_TUNGSTEN = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_URANIUM = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));

    public static final Item RAW_COBALT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_PLATINUM = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_IRIDIUM = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));

    public static final Item RAW_BRONZE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_CONSTANTAN = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_INVAR = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_ELECTRUM =  new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_SIGNALUM = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_LUMIUM = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_ENDERIUM = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_STEEL = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_TUNGSTENSTEEL = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_ADVANCED_ALLOY = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_IRIDIUM_ALLOY = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_THELOSITE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RAW_ARCHEOSITE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));

    public static final Item TIN_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item SILVER_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item LEAD_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item NICKEL_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item TITANIUM_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item CHROME_DUST = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));

    public static final Item SAPPHIRE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item RUBY = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item OPAL = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));

    public static final Item MANATITE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));

    public static final Item ALUMINUM_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item TUNGSTEN_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item URANIUM_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));

    public static final Item COBALT_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item PLATINUM_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item IRIDIUM_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));

    public static final Item BRONZE_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item CONSTANTAN_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item INVAR_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item ELECTRUM_INGOT =  new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item SIGNALUM_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item LUMIUM_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item ENDERIUM_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item STEEL_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item TUNGSTENSTEEL_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item ADVANCED_ALLOY_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item IRIDIUM_ALLOY_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item THELOSITE_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));
    public static final Item ARCHEOSITE_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));

    public static final Item DEMONIC_METAL_INGOT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));

    // Food

    public static final Item BANANA = new Item(new FabricItemSettings().food(new FoodComponent
            .Builder().hunger(5).saturationModifier(0.3f).build())
            .group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.FOOD));
    public static final Item GOLDEN_BANANA = new Item(new FabricItemSettings().food(new FoodComponent
            .Builder().hunger(5).saturationModifier(1.08f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*30, 3), 1f)
            .alwaysEdible().build()).group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.FOOD).rarity(Rarity.RARE));
    public static final Item ENCHANTED_GOLDEN_BANANA = new GlintedItem(new FabricItemSettings().food(new FoodComponent
            .Builder().hunger(5).saturationModifier(1.08f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*300, 6), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*300, 3), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*180, 5), 1f)
            .alwaysEdible().build()).group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.FOOD).rarity(Rarity.EPIC));

    public static final Item CHERRY = new Item(new FabricItemSettings().food(new FoodComponent
            .Builder().snack().hunger(2).saturationModifier(0.2f).build())
            .group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.FOOD));
    public static final Item GOLDEN_CHERRY = new Item(new FabricItemSettings().food(new FoodComponent
            .Builder().snack().hunger(3).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 20, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*10, 0), 0.7f)
            .alwaysEdible().build()).group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.FOOD).rarity(Rarity.RARE));
    public static final Item ENCHANTED_GOLDEN_CHERRY = new GlintedItem(new FabricItemSettings().food(new FoodComponent
            .Builder().snack().hunger(3).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 20, 4), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*30, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*240, 2), 0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*240, 3), 0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 20*120, 1), 0.1f)
            .alwaysEdible().build()).group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.FOOD).rarity(Rarity.EPIC));


    // Mob Drops

    public static final Item DEVIL_BRINGER = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));

    public static final Item WITHERED_STAR = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.MISC));

    // Tools

    public static final Item HAMMER = new Item(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.TOOLS));


    public static void register() {

        // Resources

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "coal_piece"), COAL_PIECE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "coal_dust"), COAL_DUST);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_tin"), RAW_TIN);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_silver"), RAW_SILVER);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_lead"), RAW_LEAD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_nickel"), RAW_NICKEL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_titanium"), RAW_TITANIUM);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_aluminum"), RAW_ALUMINUM);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_tungsten"), RAW_TUNGSTEN);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_uranium"), RAW_URANIUM);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_cobalt"), RAW_COBALT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_platinum"), RAW_PLATINUM);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_iridium"), RAW_IRIDIUM);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_bronze"), RAW_BRONZE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_constantan"), RAW_CONSTANTAN);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_invar"), RAW_INVAR);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_electrum"), RAW_ELECTRUM);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_signalum"), RAW_SIGNALUM);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_lumium"), RAW_LUMIUM);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_enderium"), RAW_ENDERIUM);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_steel"), RAW_STEEL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_tungstensteel"), RAW_TUNGSTENSTEEL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_advanced_alloy"), RAW_ADVANCED_ALLOY);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_iridium_alloy"), RAW_IRIDIUM_ALLOY);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_archeosite"), RAW_ARCHEOSITE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_thelosite"), RAW_THELOSITE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "tin_ingot"), TIN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "lead_ingot"), LEAD_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "nickel_ingot"), NICKEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "titanium_ingot"), TITANIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "chrome_dust"), CHROME_DUST);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "sapphire"), SAPPHIRE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "opal"), OPAL);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "manatite"), MANATITE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "aluminum_ingot"), ALUMINUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "tungsten_ingot"), TUNGSTEN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "uranium_ingot"), URANIUM_INGOT);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cobalt_ingot"), COBALT_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "platinum_ingot"), PLATINUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "iridium_ingot"), IRIDIUM_INGOT);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_ingot"), BRONZE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "constantan_ingot"), CONSTANTAN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "invar_ingot"), INVAR_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "electrum_ingot"), ELECTRUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "signalum_ingot"), SIGNALUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "lumium_ingot"), LUMIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "enderium_ingot"), ENDERIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "steel_ingot"), STEEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "tungstensteel_ingot"), TUNGSTENSTEEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "advanced_alloy_ingot"), ADVANCED_ALLOY_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "iridium_alloy_ingot"), IRIDIUM_ALLOY_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_ingot"), ARCHEOSITE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_ingot"), THELOSITE_INGOT);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "demonic_metal_ingot"), DEMONIC_METAL_INGOT);

        // Food

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "banana"), BANANA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "golden_banana"), GOLDEN_BANANA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "enchanted_golden_banana"), ENCHANTED_GOLDEN_BANANA);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cherry"), CHERRY);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "golden_cherry"), GOLDEN_CHERRY);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "enchanted_golden_cherry"), ENCHANTED_GOLDEN_CHERRY);

        // Mob Drops

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "devil_bringer"), DEVIL_BRINGER);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "withered_star"), WITHERED_STAR);

        // Tools

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "hammer"), HAMMER);


    }
}