package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.custom.*;
import net.slayerrroar.reborn12k.util.ItemGroupUtil;

public class GenericItems {

    // Resources

    public static final Item COAL_PIECE = registerItem("coal_piece", new Item(new FabricItemSettings()));

    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item ALUMINUM_INGOT = registerItem("aluminum_ingot", new Item(new FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()));
    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new FabricItemSettings()));
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", new Item(new FabricItemSettings()));
    public static final Item CHROME_INGOT = registerItem("chrome_ingot", new Item(new FabricItemSettings()));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new FabricItemSettings()));

    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", new Item(new FabricItemSettings()));
    public static final Item VANADIUM_INGOT = registerItem("vanadium_ingot", new Item(new FabricItemSettings()));
    public static final Item NEODYMIUM_INGOT = registerItem("neodymium_ingot", new Item(new FabricItemSettings()));
    public static final Item URANIUM_INGOT = registerItem("uranium_ingot", new Item(new FabricItemSettings()));

    public static final Item COBALT_INGOT = registerItem("cobalt_ingot", new Item(new FabricItemSettings()));
    public static final Item OSMIUM_INGOT = registerItem("osmium_ingot", new Item(new FabricItemSettings()));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new FabricItemSettings()));
    public static final Item IRIDIUM_INGOT = registerItem("iridium_ingot", new Item(new FabricItemSettings()));

    public static final Item ARCHEOSITE_INGOT = registerItem("archeosite_ingot", new Item(new FabricItemSettings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings()));
    public static final Item CONSTANTAN_INGOT = registerItem("constantan_ingot", new Item(new FabricItemSettings()));
    public static final Item INVAR_INGOT = registerItem("invar_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item TUNGSTENSTEEL_INGOT = registerItem("tungstensteel_ingot", new Item(new FabricItemSettings()));
    public static final Item THELOSITE_INGOT = registerItem("thelosite_ingot", new Item(new FabricItemSettings()));
    public static final Item ADVANCED_ALLOY_INGOT = registerItem("advanced_alloy_ingot", new Item(new FabricItemSettings()));
    public static final Item IRIDIUM_ALLOY_INGOT = registerItem("iridium_alloy_ingot", new Item(new FabricItemSettings()));
    public static final Item ELECTRUM_INGOT = registerItem("electrum_ingot", new Item(new FabricItemSettings()));
    public static final Item SIGNALUM_INGOT = registerItem("signalum_ingot", new Item(new FabricItemSettings()));
    public static final Item LUMIUM_INGOT = registerItem("lumium_ingot", new Item(new FabricItemSettings()));
    public static final Item ENDERIUM_INGOT = registerItem("enderium_ingot", new Item(new FabricItemSettings()));

    public static final Item SHIBUICHI_ALLOY_INGOT = registerItem("shibuichi_alloy_ingot", new Item(new FabricItemSettings()));
    public static final Item MAGISTEEL_INGOT = registerItem("magisteel_ingot", new Item(new FabricItemSettings()));
    public static final Item ORICHALCUM_INGOT = registerItem("orichalcum_ingot", new Item(new FabricItemSettings()));
    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot", new Item(new FabricItemSettings()));
    public static final Item DEMONIC_METAL_INGOT = registerItem("demonic_metal_ingot", new Item(new FabricItemSettings()));

    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item MANATITE = registerItem("manatite", new Item(new FabricItemSettings()));
    public static final Item SUNSTONE = registerItem("sunstone", new Item(new FabricItemSettings()));
    public static final Item MOONSTONE = registerItem("moonstone", new Item(new FabricItemSettings()));


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

    public static final Item RAW_ARCHEOSITE = registerItem("raw_archeosite", new Item(new FabricItemSettings()));
    public static final Item RAW_BRONZE = registerItem("raw_bronze", new Item(new FabricItemSettings()));
    public static final Item RAW_CONSTANTAN = registerItem("raw_constantan", new Item(new FabricItemSettings()));
    public static final Item RAW_INVAR = registerItem("raw_invar", new Item(new FabricItemSettings()));
    public static final Item RAW_STEEL = registerItem("raw_steel", new Item(new FabricItemSettings()));
    public static final Item RAW_TUNGSTENSTEEL = registerItem("raw_tungstensteel", new Item(new FabricItemSettings()));
    public static final Item RAW_THELOSITE = registerItem("raw_thelosite", new Item(new FabricItemSettings()));
    public static final Item RAW_ADVANCED_ALLOY = registerItem("raw_advanced_alloy", new Item(new FabricItemSettings()));
    public static final Item RAW_IRIDIUM_ALLOY = registerItem("raw_iridium_alloy", new Item(new FabricItemSettings()));
    public static final Item RAW_ELECTRUM = registerItem("raw_electrum", new Item(new FabricItemSettings()));
    public static final Item RAW_SIGNALUM = registerItem("raw_signalum", new Item(new FabricItemSettings()));
    public static final Item RAW_LUMIUM = registerItem("raw_lumium", new Item(new FabricItemSettings()));
    public static final Item RAW_ENDERIUM = registerItem("raw_enderium", new Item(new FabricItemSettings()));

    public static final Item RAW_SHIBUICHI_ALLOY = registerItem("raw_shibuichi_alloy", new Item(new FabricItemSettings()));


    public static final Item COAL_DUST = registerItem("coal_dust", new Item(new FabricItemSettings()));
    public static final Item COPPER_DUST = registerItem("copper_dust", new Item(new FabricItemSettings()));
    public static final Item IRON_DUST = registerItem("iron_dust", new Item(new FabricItemSettings()));
    public static final Item GOLD_DUST = registerItem("gold_dust", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_DUST = registerItem("diamond_dust", new Item(new FabricItemSettings()));
    public static final Item EMERALD_DUST = registerItem("emerald_dust", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_DUST = registerItem("netherite_dust", new Item(new FabricItemSettings()));

    public static final Item TIN_DUST = registerItem("tin_dust", new Item(new FabricItemSettings()));
    public static final Item ALUMINUM_DUST = registerItem("aluminum_dust", new Item(new FabricItemSettings()));
    public static final Item SILVER_DUST = registerItem("silver_dust", new Item(new FabricItemSettings()));
    public static final Item LEAD_DUST = registerItem("lead_dust", new Item(new FabricItemSettings()));
    public static final Item NICKEL_DUST = registerItem("nickel_dust", new Item(new FabricItemSettings()));
    public static final Item CHROME_DUST = registerItem("chrome_dust", new Item(new FabricItemSettings()));
    public static final Item TITANIUM_DUST = registerItem("titanium_dust", new Item(new FabricItemSettings()));

    public static final Item TUNGSTEN_DUST = registerItem("tungsten_dust", new Item(new FabricItemSettings()));
    public static final Item VANADIUM_DUST = registerItem("vanadium_dust", new Item(new FabricItemSettings()));
    public static final Item NEODYMIUM_DUST = registerItem("neodymium_dust", new Item(new FabricItemSettings()));
    public static final Item URANIUM_DUST = registerItem("uranium_dust", new Item(new FabricItemSettings()));

    public static final Item COBALT_DUST = registerItem("cobalt_dust", new Item(new FabricItemSettings()));
    public static final Item OSMIUM_DUST = registerItem("osmium_dust", new Item(new FabricItemSettings()));
    public static final Item PLATINUM_DUST = registerItem("platinum_dust", new Item(new FabricItemSettings()));
    public static final Item IRIDIUM_DUST = registerItem("iridium_dust", new Item(new FabricItemSettings()));

    public static final Item ARCHEOSITE_DUST = registerItem("archeosite_dust", new Item(new FabricItemSettings()));
    public static final Item BRONZE_DUST = registerItem("bronze_dust", new Item(new FabricItemSettings()));
    public static final Item CONSTANTAN_DUST = registerItem("constantan_dust", new Item(new FabricItemSettings()));
    public static final Item INVAR_DUST = registerItem("invar_dust", new Item(new FabricItemSettings()));
    public static final Item STEEL_DUST = registerItem("steel_dust", new Item(new FabricItemSettings()));
    public static final Item TUNGSTENSTEEL_DUST = registerItem("tungstensteel_dust", new Item(new FabricItemSettings()));
    public static final Item THELOSITE_DUST = registerItem("thelosite_dust", new Item(new FabricItemSettings()));
    public static final Item ADVANCED_ALLOY_DUST = registerItem("advanced_alloy_dust", new Item(new FabricItemSettings()));
    public static final Item IRIDIUM_ALLOY_DUST = registerItem("iridium_alloy_dust", new Item(new FabricItemSettings()));
    public static final Item ELECTRUM_DUST = registerItem("electrum_dust", new Item(new FabricItemSettings()));
    public static final Item SIGNALUM_DUST = registerItem("signalum_dust", new Item(new FabricItemSettings()));
    public static final Item LUMIUM_DUST = registerItem("lumium_dust", new Item(new FabricItemSettings()));
    public static final Item ENDERIUM_DUST = registerItem("enderium_dust", new Item(new FabricItemSettings()));

    public static final Item SHIBUICHI_ALLOY_DUST = registerItem("shibuichi_alloy_dust", new Item(new FabricItemSettings()));
    public static final Item MAGISTEEL_DUST = registerItem("magisteel_dust", new Item(new FabricItemSettings()));
    public static final Item ORICHALCUM_DUST = registerItem("orichalcum_dust", new Item(new FabricItemSettings()));
    public static final Item MITHRIL_DUST = registerItem("mithril_dust", new Item(new FabricItemSettings()));
    public static final Item DEMONIC_METAL_DUST = registerItem("demonic_metal_dust", new Item(new FabricItemSettings()));

    public static final Item ENDER_DUST = registerItem("ender_dust", new Item(new FabricItemSettings()));

    public static final Item DESTABILIZED_MIXTURE = registerItem("destabilized_mixture", new Item(new FabricItemSettings()));
    public static final Item ENERGIZED_MIXTURE = registerItem("energized_mixture", new Item(new FabricItemSettings()));
    public static final Item RESONANT_MIXTURE = registerItem("resonant_mixture", new Item(new FabricItemSettings()));
    public static final Item MANA_RICH_MIXTURE = registerItem("mana_rich_mixture", new Item(new FabricItemSettings()));


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

    public static final Item WITHER_SKULL_FRAGMENT = registerItem("wither_skull_fragment", new Item(new FabricItemSettings()));
    public static final Item WITHERED_SHARD = registerItem("withered_shard", new Item(new FabricItemSettings()));
    

    // Other

    public static final Item UNIVERSAL_SMITHING_TEMPLATE = registerItem("universal_smithing_template", new UniversalTemplate(new FabricItemSettings()));

    public static final Item STONE_HAMMER = registerItem("stone_hammer", new HammerItem(new FabricItemSettings().maxDamage(64)));
    public static final Item IRON_HAMMER = registerItem("iron_hammer", new HammerItem(new FabricItemSettings().maxDamage(128)));
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer", new HammerItem(new FabricItemSettings().maxDamage(512)));

    public static final Item CASING_MK237 = registerItem("casing_mk237", new Item(new FabricItemSettings()));
    public static final Item CERAMITE_PLATE = registerItem("ceramite_plate", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(ItemGroupUtil.REBORN12K, COAL_PIECE);

        addToItemGroup(ItemGroupUtil.REBORN12K, TIN_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, ALUMINUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, SILVER_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, LEAD_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, NICKEL_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, CHROME_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, TITANIUM_INGOT);

        addToItemGroup(ItemGroupUtil.REBORN12K, TUNGSTEN_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, VANADIUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, NEODYMIUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, URANIUM_INGOT);

        addToItemGroup(ItemGroupUtil.REBORN12K, COBALT_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, OSMIUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, PLATINUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, IRIDIUM_INGOT);

        addToItemGroup(ItemGroupUtil.REBORN12K, ARCHEOSITE_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, BRONZE_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, CONSTANTAN_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, INVAR_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, STEEL_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, TUNGSTENSTEEL_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, THELOSITE_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, ADVANCED_ALLOY_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, IRIDIUM_ALLOY_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, ELECTRUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, SIGNALUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, LUMIUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENDERIUM_INGOT);


        addToItemGroup(ItemGroupUtil.REBORN12K, SHIBUICHI_ALLOY_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGISTEEL_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, ORICHALCUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, MITHRIL_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN12K, DEMONIC_METAL_INGOT);

        addToItemGroup(ItemGroupUtil.REBORN12K, SAPPHIRE);
        addToItemGroup(ItemGroupUtil.REBORN12K, RUBY);
        addToItemGroup(ItemGroupUtil.REBORN12K, MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN12K, SUNSTONE);
        addToItemGroup(ItemGroupUtil.REBORN12K, MOONSTONE);

        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_TIN);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_ALUMINUM);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_SILVER);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_LEAD);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_NICKEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_CHROME);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_TITANIUM);

        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_TUNGSTEN);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_VANADIUM);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_NEODYMIUM);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_URANIUM);

        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_COBALT);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_OSMIUM);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_PLATINUM);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_IRIDIUM);

        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_ARCHEOSITE);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_BRONZE);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_CONSTANTAN);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_INVAR);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_STEEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_TUNGSTENSTEEL);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_THELOSITE);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_ADVANCED_ALLOY);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_IRIDIUM_ALLOY);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_ELECTRUM);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_SIGNALUM);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_LUMIUM);
        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_ENDERIUM);

        addToItemGroup(ItemGroupUtil.REBORN12K, RAW_SHIBUICHI_ALLOY);


        addToItemGroup(ItemGroupUtil.REBORN12K, COAL_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, COPPER_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, IRON_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, GOLD_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, DIAMOND_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, EMERALD_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, NETHERITE_DUST);

        addToItemGroup(ItemGroupUtil.REBORN12K, TIN_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, ALUMINUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, SILVER_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, LEAD_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, NICKEL_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, CHROME_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, TITANIUM_DUST);

        addToItemGroup(ItemGroupUtil.REBORN12K, TUNGSTEN_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, VANADIUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, NEODYMIUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, URANIUM_DUST);

        addToItemGroup(ItemGroupUtil.REBORN12K, COBALT_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, OSMIUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, PLATINUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, IRIDIUM_DUST);

        addToItemGroup(ItemGroupUtil.REBORN12K, ARCHEOSITE_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, BRONZE_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, CONSTANTAN_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, INVAR_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, STEEL_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, TUNGSTENSTEEL_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, THELOSITE_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, ADVANCED_ALLOY_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, IRIDIUM_ALLOY_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, ELECTRUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, SIGNALUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, LUMIUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENDERIUM_DUST);

        addToItemGroup(ItemGroupUtil.REBORN12K, SHIBUICHI_ALLOY_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGISTEEL_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, ORICHALCUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, MITHRIL_DUST);
        addToItemGroup(ItemGroupUtil.REBORN12K, DEMONIC_METAL_DUST);

        addToItemGroup(ItemGroupUtil.REBORN12K, ENDER_DUST);


        addToItemGroup(ItemGroupUtil.REBORN12K, DESTABILIZED_MIXTURE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENERGIZED_MIXTURE);
        addToItemGroup(ItemGroupUtil.REBORN12K, RESONANT_MIXTURE);
        addToItemGroup(ItemGroupUtil.REBORN12K, MANA_RICH_MIXTURE);

        addToItemGroup(ItemGroupUtil.REBORN12K, BANANA);
        addToItemGroup(ItemGroupUtil.REBORN12K, GOLDEN_BANANA);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENCHANTED_GOLDEN_BANANA);

        addToItemGroup(ItemGroupUtil.REBORN12K, CHERRY);
        addToItemGroup(ItemGroupUtil.REBORN12K, GOLDEN_CHERRY);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENCHANTED_GOLDEN_CHERRY);

        addToItemGroup(ItemGroupUtil.REBORN12K, FLOUR);
        addToItemGroup(ItemGroupUtil.REBORN12K, DOUGH);

        addToItemGroup(ItemGroupUtil.REBORN12K, WITHERED_SHARD);
        addToItemGroup(ItemGroupUtil.REBORN12K, WITHER_SKULL_FRAGMENT);

        addToItemGroup(ItemGroupUtil.REBORN12K, UNIVERSAL_SMITHING_TEMPLATE);

        addToItemGroup(ItemGroupUtil.REBORN12K, STONE_HAMMER);
        addToItemGroup(ItemGroupUtil.REBORN12K, IRON_HAMMER);
        addToItemGroup(ItemGroupUtil.REBORN12K, DIAMOND_HAMMER);

        addToItemGroup(ItemGroupUtil.REBORN12K, CASING_MK237);
        addToItemGroup(ItemGroupUtil.REBORN12K, CERAMITE_PLATE);
    }

    private static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Generic Items");
    }
}