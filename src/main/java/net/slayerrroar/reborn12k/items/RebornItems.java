package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.custom.*;
import net.slayerrroar.reborn12k.items.custom.magic.MirrorItem;
import net.slayerrroar.reborn12k.items.custom.magic.MobSoulItem;
import net.slayerrroar.reborn12k.items.custom.magic.SoulVesselItem;
import net.slayerrroar.reborn12k.items.custom.magic.essences.AdvancedEssenceItem;
import net.slayerrroar.reborn12k.items.custom.magic.essences.BasicEssenceItem;
import net.slayerrroar.reborn12k.items.custom.magic.essences.SpecialEssenceItem;
import net.slayerrroar.reborn12k.items.custom.magic.essences.UltimateEssenceItem;
import net.slayerrroar.reborn12k.items.custom.magic.runes.*;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.abyss.AbyssRod;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.abyss.AbyssScepter;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.abyss.AbyssStaff;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.abyss.AbyssWand;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.crimson.CrimsonRod;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.crimson.CrimsonScepter;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.crimson.CrimsonStaff;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.crimson.CrimsonWand;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.ferrum.FerrumRod;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.ferrum.FerrumScepter;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.ferrum.FerrumStaff;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.ferrum.FerrumWand;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.glacial.GlacialRod;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.glacial.GlacialScepter;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.glacial.GlacialStaff;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.glacial.GlacialWand;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.novilunium.NoviluniumRod;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.novilunium.NoviluniumScepter;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.novilunium.NoviluniumStaff;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.novilunium.NoviluniumWand;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.sunlight.SunlightRod;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.sunlight.SunlightScepter;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.sunlight.SunlightStaff;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.sunlight.SunlightWand;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.terra.TerraRod;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.terra.TerraScepter;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.terra.TerraStaff;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.terra.TerraWand;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.thunderbolt.ThunderboltRod;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.thunderbolt.ThunderboltScepter;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.thunderbolt.ThunderboltStaff;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.thunderbolt.ThunderboltWand;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.viridian.ViridianRod;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.viridian.ViridianScepter;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.viridian.ViridianStaff;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.viridian.ViridianWand;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.volcanic.VolcanicRod;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.volcanic.VolcanicScepter;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.volcanic.VolcanicStaff;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.volcanic.VolcanicWand;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.windstorm.WindstormRod;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.windstorm.WindstormScepter;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.windstorm.WindstormStaff;
import net.slayerrroar.reborn12k.items.custom.magic.staffs.windstorm.WindstormWand;
import net.slayerrroar.reborn12k.items.custom.tech.*;
import net.slayerrroar.reborn12k.sounds.RebornSounds;
import net.slayerrroar.reborn12k.util.ItemGroupUtil;

@SuppressWarnings({"unused", "SameParameterValue"})
public class RebornItems {

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

    public static final Item YELLOWCAKE_URANIUM_INGOT = registerItem("yellowcake_uranium_ingot", new Item(new FabricItemSettings()));

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


    public static final Item COAL_DUST = registerItem("coal_dust", new Item(new FabricItemSettings()));
    public static final Item COPPER_DUST = registerItem("copper_dust", new Item(new FabricItemSettings()));
    public static final Item IRON_DUST = registerItem("iron_dust", new Item(new FabricItemSettings()));
    public static final Item GOLD_DUST = registerItem("gold_dust", new Item(new FabricItemSettings()));
    public static final Item LAPIS_DUST = registerItem("lapis_dust", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_DUST = registerItem("diamond_dust", new Item(new FabricItemSettings()));
    public static final Item EMERALD_DUST = registerItem("emerald_dust", new Item(new FabricItemSettings()));
    public static final Item AMETHYST_DUST = registerItem("amethyst_dust", new Item(new FabricItemSettings()));
    public static final Item QUARTZ_DUST = registerItem("quartz_dust", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_DUST = registerItem("netherite_dust", new Item(new FabricItemSettings()));

    public static final Item TIN_DUST = registerItem("tin_dust", new Item(new FabricItemSettings()));
    public static final Item ALUMINUM_DUST = registerItem("aluminum_dust", new Item(new FabricItemSettings()));
    public static final Item SILVER_DUST = registerItem("silver_dust", new Item(new FabricItemSettings()));
    public static final Item LEAD_DUST = registerItem("lead_dust", new Item(new FabricItemSettings()));
    public static final Item NICKEL_DUST = registerItem("nickel_dust", new Item(new FabricItemSettings()));
    public static final Item CHROME_DUST = registerItem("chrome_dust", new Item(new FabricItemSettings()));
    public static final Item TITANIUM_DUST = registerItem("titanium_dust", new Item(new FabricItemSettings()));

    public static final Item SAPPHIRE_DUST = registerItem("sapphire_dust", new Item(new FabricItemSettings()));
    public static final Item RUBY_DUST = registerItem("ruby_dust", new Item(new FabricItemSettings()));
    public static final Item MANATITE_DUST = registerItem("manatite_dust", new Item(new FabricItemSettings()));

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

    public static final Item YELLOWCAKE_URANIUM_DUST = registerItem("yellowcake_uranium_dust", new Item(new FabricItemSettings()));

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


    // Mob Drops

    public static final Item WITHER_SKULL_FRAGMENT = registerItem("wither_skull_fragment", new Item(new FabricItemSettings()));
    public static final Item WITHERED_SHARD = registerItem("withered_shard", new Item(new FabricItemSettings()));


    // Music Discs

    public static final Item UNRECORDED_DISC = registerItem("unrecorded_disc", new Item(new FabricItemSettings()));
    public static final Item ALKATRAZ_DISC = registerItem("alkatraz_disc", new RebornDiscItem(15, RebornSounds.ALKATRAZ, new FabricItemSettings()
            .maxCount(1).rarity(Rarity.EPIC), 216));
    

    // Other

    public static final Item UNIVERSAL_SMITHING_TEMPLATE = registerItem("universal_smithing_template", new UniversalTemplate(new FabricItemSettings()));

    public static final Item STONE_HAMMER = registerItem("stone_hammer", new HammerItem(new FabricItemSettings().maxDamage(64)));
    public static final Item IRON_HAMMER = registerItem("iron_hammer", new HammerItem(new FabricItemSettings().maxDamage(128)));
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer", new HammerItem(new FabricItemSettings().maxDamage(512)));

    public static final Item CASING_MK237 = registerItem("casing_mk237", new Item(new FabricItemSettings()));
    public static final Item CERAMITE_PLATE = registerItem("ceramite_plate", new Item(new FabricItemSettings()));


    // Tech

    public static final Item DESTABILIZED_REDSTONE_BUCKET = registerItem("destabilized_redstone_bucket", new DangerousBucketItem(new FabricItemSettings().maxCount(16).recipeRemainder(Items.BUCKET)));
    public static final Item ENERGIZED_GLOWSTONE_BUCKET = registerItem("energized_glowstone_bucket", new DangerousBucketItem(new FabricItemSettings().maxCount(16).recipeRemainder(Items.BUCKET)));
    public static final Item RESONANT_ENDER_BUCKET = registerItem("resonant_ender_bucket", new DangerousBucketItem(new FabricItemSettings().maxCount(16).recipeRemainder(Items.BUCKET)));
    public static final Item LIQUID_MANA_BUCKET = registerItem("liquid_mana_bucket", new DangerousBucketItem(new FabricItemSettings().maxCount(16).recipeRemainder(Items.BUCKET)));

    public static final Item MAGNET = registerItem("magnet", new Magnet(new FabricItemSettings().maxCount(1)));

    public static final Item EMPTY_MACHINE_CASING = registerItem("empty_machine_casing", new Item(new FabricItemSettings()));

    public static final Item COOLING_ASSEMBLY = registerItem("cooling_assembly", new Item(new FabricItemSettings()));
    public static final Item POWER_SUPPLY_MODULE = registerItem("power_supply_module", new Item(new FabricItemSettings()));
    public static final Item HFR_COIL = registerItem("hfr_coil", new Item(new FabricItemSettings()));
    public static final Item UHF_LASER_EMITTER = registerItem("uhf_laser_emitter", new Item(new FabricItemSettings()));
    public static final Item COLLIMATED_LASER_ARRAY = registerItem("collimated_laser_array", new Item(new FabricItemSettings()));

    public static final Item EMPTY_FUEL_CELL = registerItem("empty_fuel_cell", new Item(new FabricItemSettings()));
    public static final Item LEU_FUEL_CELL = registerItem("leu_fuel_cell", new FuelCell(new FabricItemSettings().maxDamage(16)));
    public static final Item HEU_FUEL_CELL = registerItem("heu_fuel_cell", new FuelCell(new FabricItemSettings().maxDamage(64)));

    public static final Item LASER_FOCUS = registerItem("laser_focus", new UnsetFocusItem(new FabricItemSettings()));

    public static final Item COAL_LASER_FOCUS = registerItem("coal_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item COPPER_LASER_FOCUS = registerItem("copper_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item IRON_LASER_FOCUS = registerItem("iron_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item GOLD_LASER_FOCUS = registerItem("gold_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item LAPIS_LASER_FOCUS = registerItem("lapis_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item REDSTONE_LASER_FOCUS = registerItem("redstone_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item DIAMOND_LASER_FOCUS = registerItem("diamond_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item EMERALD_LASER_FOCUS = registerItem("emerald_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item AMETHYST_LASER_FOCUS = registerItem("amethyst_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item QUARTZ_LASER_FOCUS = registerItem("quartz_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item NETHERITE_LASER_FOCUS = registerItem("netherite_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item TIN_LASER_FOCUS = registerItem("tin_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item ALUMINUM_LASER_FOCUS = registerItem("aluminum_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item SILVER_LASER_FOCUS = registerItem("silver_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item LEAD_LASER_FOCUS = registerItem("lead_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item NICKEL_LASER_FOCUS = registerItem("nickel_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item CHROME_LASER_FOCUS = registerItem("chrome_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item TITANIUM_LASER_FOCUS = registerItem("titanium_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item SAPPHIRE_LASER_FOCUS = registerItem("sapphire_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item RUBY_LASER_FOCUS = registerItem("ruby_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MANATITE_LASER_FOCUS = registerItem("manatite_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item TUNGSTEN_LASER_FOCUS = registerItem("tungsten_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item VANADIUM_LASER_FOCUS = registerItem("vanadium_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item NEODYMIUM_LASER_FOCUS = registerItem("neodymium_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item URANIUM_LASER_FOCUS = registerItem("uranium_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item COBALT_LASER_FOCUS = registerItem("cobalt_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item OSMIUM_LASER_FOCUS = registerItem("osmium_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item PLATINUM_LASER_FOCUS = registerItem("platinum_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item IRIDIUM_LASER_FOCUS = registerItem("iridium_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));


    // Magic

    public static final Item MANAWEAVE = registerItem("manaweave", new Item(new FabricItemSettings()));
    public static final Item REFINED_MANATITE = registerItem("refined_manatite", new Item(new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item WOODEN_WAND = registerItem ("wooden_wand", new Item(new FabricItemSettings()));
    public static final Item SILVER_SCEPTER = registerItem ("silver_scepter", new Item(new FabricItemSettings()));
    public static final Item GOLDEN_ROD = registerItem ("golden_rod", new Item(new FabricItemSettings()));
    public static final Item ARCHMAGE_STAFF = registerItem ("archmage_staff", new Item(new FabricItemSettings()));


    public static final Item BLANK_RUNE = registerItem("blank_rune", new BlankRune(new FabricItemSettings()));

    public static final Item RUNE_OF_AIR = registerItem("rune_of_air", new Item(new FabricItemSettings()));
    public static final Item RUNE_OF_EARTH = registerItem("rune_of_earth", new Item(new FabricItemSettings()));
    public static final Item RUNE_OF_WATER = registerItem("rune_of_water", new Item(new FabricItemSettings()));
    public static final Item RUNE_OF_FIRE = registerItem("rune_of_fire", new Item(new FabricItemSettings()));

    public static final Item RUNE_OF_LIGHT = registerItem("rune_of_light", new Item(new FabricItemSettings()));
    public static final Item RUNE_OF_DARKNESS= registerItem("rune_of_darkness", new Item(new FabricItemSettings()));

    public static final Item SUPERIOR_RUNE_OF_AIR = registerItem("superior_rune_of_air", new SuperiorRuneAir(new FabricItemSettings()));
    public static final Item SUPERIOR_RUNE_OF_EARTH = registerItem("superior_rune_of_earth", new SuperiorRuneEarth(new FabricItemSettings()));
    public static final Item SUPERIOR_RUNE_OF_WATER = registerItem("superior_rune_of_water", new SuperiorRuneWater(new FabricItemSettings()));
    public static final Item SUPERIOR_RUNE_OF_FIRE = registerItem("superior_rune_of_fire", new SuperiorRuneFire(new FabricItemSettings()));
    public static final Item SUPERIOR_RUNE_OF_LIGHT = registerItem("superior_rune_of_light", new SuperiorRuneLight(new FabricItemSettings()));
    public static final Item SUPERIOR_RUNE_OF_DARKNESS= registerItem("superior_rune_of_darkness", new SuperiorRuneDarkness(new FabricItemSettings()));

    public static final Item RUNE_OF_LIGHTNING = registerItem("rune_of_lightning", new Item(new FabricItemSettings()));
    public static final Item RUNE_OF_NATURE = registerItem("rune_of_nature", new Item(new FabricItemSettings()));
    public static final Item RUNE_OF_ICE = registerItem("rune_of_ice", new Item(new FabricItemSettings()));
    public static final Item RUNE_OF_IRON = registerItem("rune_of_iron", new RuneIron(new FabricItemSettings()));

    public static final Item RUNE_OF_ORDER = registerItem("rune_of_order", new Item(new FabricItemSettings()));
    public static final Item RUNE_OF_CHAOS = registerItem("rune_of_chaos", new Item(new FabricItemSettings()));

    public static final Item ELEMENTAL_RUNE = registerItem("elemental_rune", new ElementalRune(new FabricItemSettings()));
    public static final Item ETHEREAL_RUNE = registerItem("ethereal_rune", new EtherealRune(new FabricItemSettings()));

    public static final Item RUNE_OF_STRENGTH = registerItem("rune_of_strength", new Item(new FabricItemSettings()));


    public static final Item WINDSTORM_MANATITE = registerItem("windstorm_manatite", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item VIRIDIAN_MANATITE = registerItem("viridian_manatite", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item ABYSS_MANATITE = registerItem("abyss_manatite", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item VOLCANIC_MANATITE = registerItem("volcanic_manatite", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));

    public static final Item SUNLIGHT_MANATITE = registerItem("sunlight_manatite", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item NOVILUNIUM_MANATITE = registerItem("novilunium_manatite", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));

    public static final Item THUNDERBOLT_MANATITE = registerItem("thunderbolt_manatite", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item TERRA_MANATITE = registerItem("terra_manatite", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item GLACIAL_MANATITE = registerItem("glacial_manatite", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item FERRUM_MANATITE = registerItem("ferrum_manatite", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));

    public static final Item CRIMSON_MANATITE = registerItem("crimson_manatite", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));


    public static final Item WINDSTORM_WAND = registerItem ("windstorm_wand", new WindstormWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item VIRIDIAN_WAND = registerItem ("viridian_wand", new ViridianWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item ABYSS_WAND = registerItem ("abyss_wand", new AbyssWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item VOLCANIC_WAND = registerItem ("volcanic_wand", new VolcanicWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item SUNLIGHT_WAND = registerItem ("sunlight_wand", new SunlightWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item NOVILUNIUM_WAND = registerItem ("novilunium_wand", new NoviluniumWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item THUNDERBOLT_WAND = registerItem ("thunderbolt_wand", new ThunderboltWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item TERRA_WAND = registerItem ("terra_wand", new TerraWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item GLACIAL_WAND = registerItem ("glacial_wand", new GlacialWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item FERRUM_WAND = registerItem ("ferrum_wand", new FerrumWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item CRIMSON_WAND = registerItem ("crimson_wand", new CrimsonWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));

    public static final Item WINDSTORM_SCEPTER = registerItem ("windstorm_scepter", new WindstormScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item VIRIDIAN_SCEPTER = registerItem ("viridian_scepter", new ViridianScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item ABYSS_SCEPTER = registerItem ("abyss_scepter", new AbyssScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item VOLCANIC_SCEPTER = registerItem ("volcanic_scepter", new VolcanicScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item SUNLIGHT_SCEPTER = registerItem ("sunlight_scepter", new SunlightScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item NOVILUNIUM_SCEPTER = registerItem ("novilunium_scepter", new NoviluniumScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item THUNDERBOLT_SCEPTER = registerItem ("thunderbolt_scepter", new ThunderboltScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item TERRA_SCEPTER = registerItem ("terra_scepter", new TerraScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item GLACIAL_SCEPTER = registerItem ("glacial_scepter", new GlacialScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item FERRUM_SCEPTER = registerItem ("ferrum_scepter", new FerrumScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item CRIMSON_SCEPTER = registerItem ("crimson_scepter", new CrimsonScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));

    public static final Item WINDSTORM_ROD = registerItem ("windstorm_rod", new WindstormRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item VIRIDIAN_ROD = registerItem ("viridian_rod", new ViridianRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item ABYSS_ROD = registerItem ("abyss_rod", new AbyssRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item VOLCANIC_ROD = registerItem ("volcanic_rod", new VolcanicRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item SUNLIGHT_ROD = registerItem ("sunlight_rod", new SunlightRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item NOVILUNIUM_ROD = registerItem ("novilunium_rod", new NoviluniumRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item THUNDERBOLT_ROD = registerItem ("thunderbolt_rod", new ThunderboltRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item TERRA_ROD = registerItem ("terra_rod", new TerraRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item GLACIAL_ROD = registerItem ("glacial_rod", new GlacialRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item FERRUM_ROD = registerItem ("ferrum_rod", new FerrumRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item CRIMSON_ROD = registerItem ("crimson_rod", new CrimsonRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));

    public static final Item WINDSTORM_STAFF = registerItem ("windstorm_staff", new WindstormStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item VIRIDIAN_STAFF = registerItem ("viridian_staff", new ViridianStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item ABYSS_STAFF = registerItem ("abyss_staff", new AbyssStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item VOLCANIC_STAFF = registerItem ("volcanic_staff", new VolcanicStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item SUNLIGHT_STAFF = registerItem ("sunlight_staff", new SunlightStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item NOVILUNIUM_STAFF = registerItem ("novilunium_staff", new NoviluniumStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item THUNDERBOLT_STAFF = registerItem ("thunderbolt_staff", new ThunderboltStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item TERRA_STAFF = registerItem ("terra_staff", new TerraStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item GLACIAL_STAFF = registerItem ("glacial_staff", new GlacialStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item FERRUM_STAFF = registerItem ("ferrum_staff", new FerrumStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item CRIMSON_STAFF = registerItem ("crimson_staff", new CrimsonStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));


    public static final Item MAGIC_MIRROR = registerItem("magic_mirror", new MirrorItem(new FabricItemSettings().maxCount(1).maxDamage(16)));
    public static final Item ICE_MIRROR = registerItem("ice_mirror", new MirrorItem(new FabricItemSettings().maxCount(1).maxDamage(16)));
    public static final Item CELL_PHONE = registerItem("cell_phone", new MirrorItem(new FabricItemSettings().maxCount(1).maxDamage(16)));

    public static final Item SOUL_VESSEL = registerItem("soul_vessel", new SoulVesselItem(new FabricItemSettings().maxCount(1)));

    public static final Item CHICKEN_SOUL = registerItem("chicken_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item COW_SOUL = registerItem("cow_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item FISH_SOUL = registerItem("fish_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item FROG_SOUL = registerItem("frog_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item MOOSHROOM_SOUL = registerItem("mooshroom_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item PIG_SOUL = registerItem("pig_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item RABBIT_SOUL = registerItem("rabbit_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item SHEEP_SOUL = registerItem("sheep_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item SQUID_SOUL = registerItem("squid_soul", new MobSoulItem(new FabricItemSettings()));

    public static final Item BEE_SOUL = registerItem("bee_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item SPIDER_SOUL = registerItem("spider_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item ENDERMAN_SOUL = registerItem("enderman_soul", new MobSoulItem(new FabricItemSettings()));

    public static final Item BLAZE_SOUL = registerItem("blaze_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item CREEPER_SOUL = registerItem("creeper_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item DROWNED_SOUL = registerItem("drowned_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item GHAST_SOUL = registerItem("ghast_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item GUARDIAN_SOUL = registerItem("guardian_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item ILLAGER_SOUL = registerItem("illager_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item MAGMA_CUBE_SOUL = registerItem("magma_cube_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item PHANTOM_SOUL = registerItem("phantom_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item SHULKER_SOUL = registerItem("shulker_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item SKELETON_SOUL = registerItem("skeleton_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item SLIME_SOUL = registerItem("slime_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item WITCH_SOUL = registerItem("witch_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item WITHER_SKELETON_SOUL = registerItem("wither_skeleton_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item ZOMBIE_SOUL = registerItem("zombie_soul", new MobSoulItem(new FabricItemSettings()));

    public static final Item ENDER_DRAGON_SOUL = registerItem("ender_dragon_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item WARDEN_SOUL = registerItem("warden_soul", new MobSoulItem(new FabricItemSettings()));
    public static final Item WITHER_SOUL = registerItem("wither_soul", new MobSoulItem(new FabricItemSettings()));


    public static final Item CHICKEN_ESSENCE = registerItem("chicken_essence", new BasicEssenceItem(new FabricItemSettings()));
    public static final Item COW_ESSENCE = registerItem("cow_essence", new BasicEssenceItem(new FabricItemSettings()));
    public static final Item FISH_ESSENCE = registerItem("fish_essence", new BasicEssenceItem(new FabricItemSettings()));
    public static final Item FROG_ESSENCE = registerItem("frog_essence", new BasicEssenceItem(new FabricItemSettings()));
    public static final Item MOOSHROOM_ESSENCE = registerItem("mooshroom_essence", new BasicEssenceItem(new FabricItemSettings()));
    public static final Item PIG_ESSENCE = registerItem("pig_essence", new BasicEssenceItem(new FabricItemSettings()));
    public static final Item RABBIT_ESSENCE = registerItem("rabbit_essence", new BasicEssenceItem(new FabricItemSettings()));
    public static final Item SHEEP_ESSENCE = registerItem("sheep_essence", new BasicEssenceItem(new FabricItemSettings()));
    public static final Item SQUID_ESSENCE = registerItem("squid_essence", new BasicEssenceItem(new FabricItemSettings()));

    public static final Item BEE_ESSENCE = registerItem("bee_essence", new BasicEssenceItem(new FabricItemSettings()));
    public static final Item SPIDER_ESSENCE = registerItem("spider_essence", new AdvancedEssenceItem(new FabricItemSettings()));
    public static final Item ENDERMAN_ESSENCE = registerItem("enderman_essence", new UltimateEssenceItem(new FabricItemSettings()));

    public static final Item BLAZE_ESSENCE = registerItem("blaze_essence", new AdvancedEssenceItem(new FabricItemSettings()));
    public static final Item CREEPER_ESSENCE = registerItem("creeper_essence", new AdvancedEssenceItem(new FabricItemSettings()));
    public static final Item DROWNED_ESSENCE = registerItem("drowned_essence", new AdvancedEssenceItem(new FabricItemSettings()));
    public static final Item GHAST_ESSENCE = registerItem("ghast_essence", new AdvancedEssenceItem(new FabricItemSettings()));
    public static final Item GUARDIAN_ESSENCE = registerItem("guardian_essence", new AdvancedEssenceItem(new FabricItemSettings()));
    public static final Item ILLAGER_ESSENCE = registerItem("illager_essence", new AdvancedEssenceItem(new FabricItemSettings()));
    public static final Item MAGMA_CUBE_ESSENCE = registerItem("magma_cube_essence", new AdvancedEssenceItem(new FabricItemSettings()));
    public static final Item PHANTOM_ESSENCE = registerItem("phantom_essence", new AdvancedEssenceItem(new FabricItemSettings()));
    public static final Item SHULKER_ESSENCE = registerItem("shulker_essence", new UltimateEssenceItem(new FabricItemSettings()));
    public static final Item SKELETON_ESSENCE = registerItem("skeleton_essence", new AdvancedEssenceItem(new FabricItemSettings()));
    public static final Item SLIME_ESSENCE = registerItem("slime_essence", new AdvancedEssenceItem(new FabricItemSettings()));
    public static final Item WITCH_ESSENCE = registerItem("witch_essence", new AdvancedEssenceItem(new FabricItemSettings()));
    public static final Item WITHER_SKELETON_ESSENCE = registerItem("wither_skeleton_essence", new UltimateEssenceItem(new FabricItemSettings()));
    public static final Item ZOMBIE_ESSENCE = registerItem("zombie_essence", new AdvancedEssenceItem(new FabricItemSettings()));

    public static final Item ENDER_DRAGON_ESSENCE = registerItem("ender_dragon_essence", new SpecialEssenceItem(new FabricItemSettings()));
    public static final Item WARDEN_ESSENCE = registerItem("warden_essence", new SpecialEssenceItem(new FabricItemSettings()));
    public static final Item WITHER_ESSENCE = registerItem("wither_essence", new SpecialEssenceItem(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, COAL_PIECE);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, TIN_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, ALUMINUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, SILVER_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, LEAD_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, NICKEL_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, CHROME_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, TITANIUM_INGOT);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, TUNGSTEN_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, VANADIUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, NEODYMIUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, URANIUM_INGOT);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, COBALT_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, OSMIUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, PLATINUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, IRIDIUM_INGOT);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, ARCHEOSITE_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, BRONZE_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, CONSTANTAN_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, INVAR_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, STEEL_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, TUNGSTENSTEEL_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, THELOSITE_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, ADVANCED_ALLOY_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, IRIDIUM_ALLOY_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, ELECTRUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, SIGNALUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, LUMIUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, ENDERIUM_INGOT);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, YELLOWCAKE_URANIUM_INGOT);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, MAGISTEEL_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, ORICHALCUM_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, MITHRIL_INGOT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, DEMONIC_METAL_INGOT);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, SAPPHIRE);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RUBY);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, SUNSTONE);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, MOONSTONE);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_TIN);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_ALUMINUM);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_SILVER);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_LEAD);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_NICKEL);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_CHROME);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_TITANIUM);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_TUNGSTEN);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_VANADIUM);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_NEODYMIUM);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_URANIUM);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_COBALT);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_OSMIUM);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_PLATINUM);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_IRIDIUM);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_ARCHEOSITE);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_BRONZE);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_CONSTANTAN);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_INVAR);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_STEEL);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_TUNGSTENSTEEL);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_THELOSITE);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_ADVANCED_ALLOY);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_IRIDIUM_ALLOY);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_ELECTRUM);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_SIGNALUM);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_LUMIUM);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RAW_ENDERIUM);


        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, COAL_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, COPPER_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, IRON_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, GOLD_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, LAPIS_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, DIAMOND_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, EMERALD_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, AMETHYST_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, QUARTZ_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, NETHERITE_DUST);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, TIN_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, ALUMINUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, SILVER_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, LEAD_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, NICKEL_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, CHROME_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, TITANIUM_DUST);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, SAPPHIRE_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RUBY_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, MANATITE_DUST);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, TUNGSTEN_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, VANADIUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, NEODYMIUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, URANIUM_DUST);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, COBALT_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, OSMIUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, PLATINUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, IRIDIUM_DUST);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, ARCHEOSITE_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, BRONZE_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, CONSTANTAN_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, INVAR_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, STEEL_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, TUNGSTENSTEEL_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, THELOSITE_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, ADVANCED_ALLOY_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, IRIDIUM_ALLOY_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, ELECTRUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, SIGNALUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, LUMIUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, ENDERIUM_DUST);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, YELLOWCAKE_URANIUM_DUST);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, MAGISTEEL_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, ORICHALCUM_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, MITHRIL_DUST);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, DEMONIC_METAL_DUST);

        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, ENDER_DUST);


        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, DESTABILIZED_MIXTURE);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, ENERGIZED_MIXTURE);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RESONANT_MIXTURE);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, MANA_RICH_MIXTURE);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, BANANA);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, GOLDEN_BANANA);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, ENCHANTED_GOLDEN_BANANA);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, CHERRY);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, GOLDEN_CHERRY);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, ENCHANTED_GOLDEN_CHERRY);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, WITHERED_SHARD);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, WITHER_SKULL_FRAGMENT);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, UNRECORDED_DISC);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, ALKATRAZ_DISC);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, UNIVERSAL_SMITHING_TEMPLATE);

        addToItemGroup(ItemGroupUtil.REBORN_TOOLS, STONE_HAMMER);
        addToItemGroup(ItemGroupUtil.REBORN_TOOLS, IRON_HAMMER);
        addToItemGroup(ItemGroupUtil.REBORN_TOOLS, DIAMOND_HAMMER);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, CASING_MK237);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, CERAMITE_PLATE);


        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, DESTABILIZED_REDSTONE_BUCKET);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, ENERGIZED_GLOWSTONE_BUCKET);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, RESONANT_ENDER_BUCKET);
        addToItemGroup(ItemGroupUtil.REBORN_MATERIALS, LIQUID_MANA_BUCKET);

        addToItemGroup(ItemGroupUtil.REBORN_TOOLS, MAGNET);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, EMPTY_MACHINE_CASING);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, COOLING_ASSEMBLY);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, POWER_SUPPLY_MODULE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, HFR_COIL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, UHF_LASER_EMITTER);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, COLLIMATED_LASER_ARRAY);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, EMPTY_FUEL_CELL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, LEU_FUEL_CELL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, HEU_FUEL_CELL);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, LASER_FOCUS);


        addToItemGroup(ItemGroupUtil.REBORN_STUFF, MANAWEAVE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, REFINED_MANATITE);

        addToItemGroup(ItemGroupUtil.REBORN_TOOLS, WOODEN_WAND);
        addToItemGroup(ItemGroupUtil.REBORN_TOOLS, SILVER_SCEPTER );
        addToItemGroup(ItemGroupUtil.REBORN_TOOLS, GOLDEN_ROD);
        addToItemGroup(ItemGroupUtil.REBORN_TOOLS, ARCHMAGE_STAFF);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, BLANK_RUNE);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, RUNE_OF_AIR);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, RUNE_OF_EARTH);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, RUNE_OF_WATER);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, RUNE_OF_FIRE);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, RUNE_OF_LIGHT);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, RUNE_OF_DARKNESS);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SUPERIOR_RUNE_OF_AIR);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SUPERIOR_RUNE_OF_EARTH);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SUPERIOR_RUNE_OF_WATER);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SUPERIOR_RUNE_OF_FIRE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SUPERIOR_RUNE_OF_LIGHT);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SUPERIOR_RUNE_OF_DARKNESS);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, RUNE_OF_LIGHTNING);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, RUNE_OF_NATURE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, RUNE_OF_ICE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, RUNE_OF_IRON);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, RUNE_OF_ORDER);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, RUNE_OF_CHAOS);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, ELEMENTAL_RUNE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, ETHEREAL_RUNE);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, RUNE_OF_STRENGTH);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, WINDSTORM_MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, VIRIDIAN_MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, ABYSS_MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, VOLCANIC_MANATITE);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SUNLIGHT_MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, NOVILUNIUM_MANATITE);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, THUNDERBOLT_MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, TERRA_MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, GLACIAL_MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, FERRUM_MANATITE);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, CRIMSON_MANATITE);

        addToItemGroup(ItemGroupUtil.REBORN_TOOLS, MAGIC_MIRROR);
        addToItemGroup(ItemGroupUtil.REBORN_TOOLS, ICE_MIRROR);
        addToItemGroup(ItemGroupUtil.REBORN_TOOLS, CELL_PHONE);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SOUL_VESSEL);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, CHICKEN_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, COW_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, FISH_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, FROG_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, MOOSHROOM_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, PIG_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, RABBIT_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SHEEP_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SQUID_SOUL);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, BEE_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SPIDER_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, ENDERMAN_SOUL);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, BLAZE_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, CREEPER_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, DROWNED_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, GHAST_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, GUARDIAN_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, ILLAGER_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, MAGMA_CUBE_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, PHANTOM_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SHULKER_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SKELETON_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SLIME_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, WITCH_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, WITHER_SKELETON_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, ZOMBIE_SOUL);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, ENDER_DRAGON_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, WARDEN_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, WITHER_SOUL);


        addToItemGroup(ItemGroupUtil.REBORN_STUFF, CHICKEN_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, COW_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, FISH_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, FROG_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, MOOSHROOM_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, PIG_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, RABBIT_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SHEEP_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SQUID_ESSENCE);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, BEE_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SPIDER_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, ENDERMAN_ESSENCE);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, BLAZE_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, CREEPER_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, DROWNED_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, GHAST_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, GUARDIAN_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, ILLAGER_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, MAGMA_CUBE_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, PHANTOM_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SHULKER_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SKELETON_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, SLIME_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, WITCH_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, WITHER_SKELETON_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, ZOMBIE_ESSENCE);

        addToItemGroup(ItemGroupUtil.REBORN_STUFF, ENDER_DRAGON_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, WARDEN_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN_STUFF, WITHER_ESSENCE);

    }

    private static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Reborn12K Items");
    }
}