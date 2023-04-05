package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Rarity;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.custom.GlintedItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class ItemGenerics {

    // Resources

    public static final Item COAL_PIECE = registerItem("coal_piece", new Item(new FabricItemSettings()));
    public static final Item COAL_DUST = registerItem("coal_dust", new Item(new FabricItemSettings()));

    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));
    public static final Item RAW_ALUMINUM = registerItem("raw_aluminum", new Item(new FabricItemSettings()));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new FabricItemSettings()));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new FabricItemSettings()));
    public static final Item RAW_NICKEL = registerItem("raw_nickel", new Item(new FabricItemSettings()));
    public static final Item RAW_CHROME = registerItem("raw_chrome", new Item(new FabricItemSettings()));
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new FabricItemSettings()));

    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten", new Item(new FabricItemSettings()));
    public static final Item RAW_VANADIUM = registerItem("raw_vanadium", new Item(new FabricItemSettings()));
    public static final Item RAW_NEODYMIUM = registerItem("raw_neodymium", new Item(new FabricItemSettings()));
    public static final Item RAW_URANIUM = registerItem("raw_uranium", new Item(new FabricItemSettings()));

    public static final Item RAW_COBALT = registerItem("raw_cobalt", new Item(new FabricItemSettings()));
    public static final Item RAW_OSMIUM = registerItem("raw_osmium", new Item(new FabricItemSettings()));
    public static final Item RAW_PLATINUM = registerItem("raw_platinum", new Item(new FabricItemSettings()));
    public static final Item RAW_IRIDIUM = registerItem("raw_iridium", new Item(new FabricItemSettings()));

    public static final Item RAW_BRONZE = registerItem("raw_bronze", new Item(new FabricItemSettings()));
    public static final Item RAW_CONSTANTAN = registerItem("raw_constantan", new Item(new FabricItemSettings()));
    public static final Item RAW_INVAR = registerItem("raw_invar", new Item(new FabricItemSettings()));
    public static final Item RAW_ELECTRUM = registerItem("raw_electrum", new Item(new FabricItemSettings()));
    public static final Item RAW_SIGNALUM = registerItem("raw_signalum", new Item(new FabricItemSettings()));
    public static final Item RAW_LUMIUM = registerItem("raw_lumium", new Item(new FabricItemSettings()));
    public static final Item RAW_ENDERIUM = registerItem("raw_enderium", new Item(new FabricItemSettings()));
    public static final Item RAW_STEEL = registerItem("raw_steel", new Item(new FabricItemSettings()));
    public static final Item RAW_TUNGSTENSTEEL = registerItem("raw_tungstensteel", new Item(new FabricItemSettings()));
    public static final Item RAW_ADVANCED_ALLOY = registerItem("raw_advanced_alloy", new Item(new FabricItemSettings()));
    public static final Item RAW_IRIDIUM_ALLOY = registerItem("raw_iridium_alloy", new Item(new FabricItemSettings()));
    public static final Item RAW_ARCHEOSITE = registerItem("raw_archeosite", new Item(new FabricItemSettings()));
    public static final Item RAW_THELOSITE = registerItem("raw_thelosite", new Item(new FabricItemSettings()));


    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item ALUMINUM_INGOT = registerItem("aluminum_ingot", new Item(new FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()));
    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new FabricItemSettings()));
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", new Item(new FabricItemSettings()));
    public static final Item CHROME_INGOT = registerItem("chrome_ingot", new Item(new FabricItemSettings()));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new FabricItemSettings()));

    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

    public static final Item MANATITE = registerItem("manatite", new Item(new FabricItemSettings()));

    public static final Item SUNSTONE = registerItem("sunstone", new Item(new FabricItemSettings()));
    public static final Item MOONSTONE = registerItem("moonstone", new Item(new FabricItemSettings()));

    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", new Item(new FabricItemSettings()));
    public static final Item VANADIUM_INGOT = registerItem("vanadium_ingot", new Item(new FabricItemSettings()));
    public static final Item NEODYMIUM_INGOT = registerItem("neodymium_ingot", new Item(new FabricItemSettings()));
    public static final Item URANIUM_INGOT = registerItem("uranium_ingot", new Item(new FabricItemSettings()));

    public static final Item COBALT_INGOT = registerItem("cobalt_ingot", new Item(new FabricItemSettings()));
    public static final Item OSMIUM_INGOT = registerItem("osmium_ingot", new Item(new FabricItemSettings()));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new FabricItemSettings()));
    public static final Item IRIDIUM_INGOT = registerItem("iridium_ingot", new Item(new FabricItemSettings()));

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings()));
    public static final Item CONSTANTAN_INGOT = registerItem("constantan_ingot", new Item(new FabricItemSettings()));
    public static final Item INVAR_INGOT = registerItem("invar_ingot", new Item(new FabricItemSettings()));
    public static final Item ELECTRUM_INGOT = registerItem("electrum_ingot", new Item(new FabricItemSettings()));
    public static final Item SIGNALUM_INGOT = registerItem("signalum_ingot", new Item(new FabricItemSettings()));
    public static final Item LUMIUM_INGOT = registerItem("lumium_ingot", new Item(new FabricItemSettings()));
    public static final Item ENDERIUM_INGOT = registerItem("enderium_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item TUNGSTENSTEEL_INGOT = registerItem("tungstensteel_ingot", new Item(new FabricItemSettings()));
    public static final Item ADVANCED_ALLOY_INGOT = registerItem("advanced_alloy_ingot", new Item(new FabricItemSettings()));
    public static final Item IRIDIUM_ALLOY_INGOT = registerItem("iridium_alloy_ingot", new Item(new FabricItemSettings()));
    public static final Item THELOSITE_INGOT = registerItem("thelosite_ingot", new Item(new FabricItemSettings()));
    public static final Item ARCHEOSITE_INGOT = registerItem("archeosite_ingot", new Item(new FabricItemSettings()));

    public static final Item MAGISTEEL_INGOT = registerItem("magisteel_ingot", new Item(new FabricItemSettings()));
    public static final Item ORICHALCUM_INGOT = registerItem("orichalcum_ingot", new Item(new FabricItemSettings()));
    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot", new Item(new FabricItemSettings()));
    public static final Item DEMONIC_METAL_INGOT = registerItem("demonic_metal_ingot", new Item(new FabricItemSettings()));

    // Food

    public static final Item BANANA = registerItem("banana", new Item(new FabricItemSettings().food(new FoodComponent
            .Builder().hunger(5).saturationModifier(0.3f).build())
    ));
    public static final Item GOLDEN_BANANA = registerItem("golden_banana", new Item(new FabricItemSettings().food(new FoodComponent
            .Builder().hunger(5).saturationModifier(1.08f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*30, 3), 1f)
            .alwaysEdible().build()).rarity(Rarity.RARE)));
    public static final Item ENCHANTED_GOLDEN_BANANA = registerItem("enchanted_golden_banana", new GlintedItem(new FabricItemSettings().food(new FoodComponent
            .Builder().hunger(5).saturationModifier(1.08f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*300, 6), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*300, 3), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*180, 5), 1f)
            .alwaysEdible().build()).rarity(Rarity.EPIC)));

    public static final Item CHERRY = registerItem("cherry", new Item(new FabricItemSettings().food(new FoodComponent
            .Builder().snack().hunger(2).saturationModifier(0.2f).build())
    ));
    public static final Item GOLDEN_CHERRY = registerItem("golden_cherry", new Item(new FabricItemSettings().food(new FoodComponent
            .Builder().snack().hunger(3).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 20, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*10, 0), 0.7f)
            .alwaysEdible().build()).rarity(Rarity.RARE)));
    public static final Item ENCHANTED_GOLDEN_CHERRY = registerItem("enchanted_golden_cherry", new GlintedItem(new FabricItemSettings().food(new FoodComponent
            .Builder().snack().hunger(3).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 20, 4), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*30, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*240, 2), 0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*240, 3), 0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 20*120, 1), 0.1f)
            .alwaysEdible().build()).rarity(Rarity.EPIC)));

    public static final Item FLOUR = registerItem("flour", new Item(new FabricItemSettings().food(new FoodComponent
            .Builder().snack().hunger(1).saturationModifier(0.2f).build())
    ));

    public static final Item DOUGH = registerItem("dough", new Item(new FabricItemSettings().food(new FoodComponent
            .Builder().snack().hunger(2).saturationModifier(0.4f).build())
    ));


    // Mob Drops

    public static final Item WITHERED_STAR = registerItem("withered_star", new Item(new FabricItemSettings()));

    // Other

    public static final Item HAMMER = registerItem("hammer", new Item(new FabricItemSettings().recipeRemainder(ItemGenerics.HAMMER).maxCount(1)));

    public static final Item CRUSHING_WHEEL = registerItem("crushing_wheel", new Item(new FabricItemSettings()));

    public static final Item RED_ENGINE = registerItem("red_engine", new Item(new FabricItemSettings()));
    public static final Item CASING_MK237 = registerItem("casing_mk237", new Item(new FabricItemSettings()));
    public static final Item CERAMITE_PLATE = registerItem("ceramite_plate", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(Reborn12KItemGroup.REBORN12K, COAL_PIECE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, COAL_DUST);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_TIN);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_ALUMINUM);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_SILVER);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_LEAD);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_NICKEL);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_CHROME);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_TITANIUM);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_TUNGSTEN);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_VANADIUM);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_NEODYMIUM);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_URANIUM);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_COBALT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_OSMIUM);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_PLATINUM);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_IRIDIUM);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_BRONZE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_CONSTANTAN);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_INVAR);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_ELECTRUM);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_SIGNALUM);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_LUMIUM);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_ENDERIUM);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_STEEL);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_TUNGSTENSTEEL);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_ADVANCED_ALLOY);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_IRIDIUM_ALLOY);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_ARCHEOSITE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RAW_THELOSITE);


        addToItemGroup(Reborn12KItemGroup.REBORN12K, TIN_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ALUMINUM_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, SILVER_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, LEAD_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, NICKEL_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, CHROME_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, TITANIUM_INGOT);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, SAPPHIRE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RUBY);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, MANATITE);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, SUNSTONE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, MOONSTONE);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, TUNGSTEN_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, VANADIUM_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, NEODYMIUM_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, URANIUM_INGOT);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, COBALT_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, OSMIUM_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, PLATINUM_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, IRIDIUM_INGOT);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, BRONZE_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, CONSTANTAN_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, INVAR_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ELECTRUM_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, SIGNALUM_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, LUMIUM_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ENDERIUM_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, STEEL_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, TUNGSTENSTEEL_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ADVANCED_ALLOY_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, IRIDIUM_ALLOY_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, THELOSITE_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ARCHEOSITE_INGOT);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, MAGISTEEL_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ORICHALCUM_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, MITHRIL_INGOT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, DEMONIC_METAL_INGOT);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, BANANA);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, GOLDEN_BANANA);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ENCHANTED_GOLDEN_BANANA);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, CHERRY);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, GOLDEN_CHERRY);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ENCHANTED_GOLDEN_CHERRY);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, FLOUR);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, DOUGH);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, WITHERED_STAR);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, HAMMER);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, CRUSHING_WHEEL);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, RED_ENGINE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, CASING_MK237);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, CERAMITE_PLATE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Generic Items");
    }
}