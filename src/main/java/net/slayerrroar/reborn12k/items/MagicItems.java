package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.slayerrroar.reborn12k.Reborn12K;
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
import net.slayerrroar.reborn12k.util.ItemGroupUtil;

@SuppressWarnings("unused")

public class MagicItems {

    public static final Item MANAWEAVE = registerItem("manaweave", new Item(new FabricItemSettings()));
    public static final Item REFINED_MANATITE = registerItem("refined_manatite", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MANA_SPARK = registerItem("mana_spark", new Item(new FabricItemSettings()));
    public static final Item MAGICAL_FRAGMENT = registerItem("magical_fragment", new Item(new FabricItemSettings()));
    public static final Item ARCANE_DUST = registerItem("arcane_dust", new Item(new FabricItemSettings()));

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
    public static final Item RUNE_OF_IRON = registerItem("rune_of_iron", new Item(new FabricItemSettings()));

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
    public static final Item WINDSTORM_SCEPTER = registerItem ("windstorm_scepter", new WindstormScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item WINDSTORM_ROD = registerItem ("windstorm_rod", new WindstormRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item WINDSTORM_STAFF = registerItem ("windstorm_staff", new WindstormStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item VIRIDIAN_WAND = registerItem ("viridian_wand", new ViridianWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item VIRIDIAN_SCEPTER = registerItem ("viridian_scepter", new ViridianScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item VIRIDIAN_ROD = registerItem ("viridian_rod", new ViridianRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item VIRIDIAN_STAFF = registerItem ("viridian_staff", new ViridianStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item ABYSS_WAND = registerItem ("abyss_wand", new AbyssWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item ABYSS_SCEPTER = registerItem ("abyss_scepter", new AbyssScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item ABYSS_ROD = registerItem ("abyss_rod", new AbyssRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item ABYSS_STAFF = registerItem ("abyss_staff", new AbyssStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item VOLCANIC_WAND = registerItem ("volcanic_wand", new VolcanicWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item VOLCANIC_SCEPTER = registerItem ("volcanic_scepter", new VolcanicScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item VOLCANIC_ROD = registerItem ("volcanic_rod", new VolcanicRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item VOLCANIC_STAFF = registerItem ("volcanic_staff", new VolcanicStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item SUNLIGHT_WAND = registerItem ("sunlight_wand", new SunlightWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item SUNLIGHT_SCEPTER = registerItem ("sunlight_scepter", new SunlightScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item SUNLIGHT_ROD = registerItem ("sunlight_rod", new SunlightRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item SUNLIGHT_STAFF = registerItem ("sunlight_staff", new SunlightStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item NOVILUNIUM_WAND = registerItem ("novilunium_wand", new NoviluniumWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item NOVILUNIUM_SCEPTER = registerItem ("novilunium_scepter", new NoviluniumScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item NOVILUNIUM_ROD = registerItem ("novilunium_rod", new NoviluniumRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item NOVILUNIUM_STAFF = registerItem ("novilunium_staff", new NoviluniumStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item FERRUM_WAND = registerItem ("ferrum_wand", new FerrumWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item FERRUM_SCEPTER = registerItem ("ferrum_scepter", new FerrumScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item FERRUM_ROD = registerItem ("ferrum_rod", new FerrumRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item FERRUM_STAFF = registerItem ("ferrum_staff", new FerrumStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item TERRA_WAND = registerItem ("terra_wand", new TerraWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item TERRA_SCEPTER = registerItem ("terra_scepter", new TerraScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item TERRA_ROD = registerItem ("terra_rod", new TerraRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item TERRA_STAFF = registerItem ("terra_staff", new TerraStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item GLACIAL_WAND = registerItem ("glacial_wand", new GlacialWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item GLACIAL_SCEPTER = registerItem ("glacial_scepter", new GlacialScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item GLACIAL_ROD = registerItem ("glacial_rod", new GlacialRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item GLACIAL_STAFF = registerItem ("glacial_staff", new GlacialStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item THUNDERBOLT_WAND = registerItem ("thunderbolt_wand", new ThunderboltWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item THUNDERBOLT_SCEPTER = registerItem ("thunderbolt_scepter", new ThunderboltScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item THUNDERBOLT_ROD = registerItem ("thunderbolt_rod", new ThunderboltRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item THUNDERBOLT_STAFF = registerItem ("thunderbolt_staff", new ThunderboltStaff(new FabricItemSettings().recipeRemainder(ARCHMAGE_STAFF).maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item CRIMSON_WAND = registerItem ("crimson_wand", new CrimsonWand(new FabricItemSettings().recipeRemainder(WOODEN_WAND).maxCount(1).fireproof()));
    public static final Item CRIMSON_SCEPTER = registerItem ("crimson_scepter", new CrimsonScepter(new FabricItemSettings().recipeRemainder(SILVER_SCEPTER).maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item CRIMSON_ROD = registerItem ("crimson_rod", new CrimsonRod(new FabricItemSettings().recipeRemainder(GOLDEN_ROD).maxCount(1).fireproof().rarity(Rarity.RARE)));
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

        addToItemGroup(ItemGroupUtil.REBORN12K, MANAWEAVE);
        addToItemGroup(ItemGroupUtil.REBORN12K, REFINED_MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN12K, MANA_SPARK);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGICAL_FRAGMENT);
        addToItemGroup(ItemGroupUtil.REBORN12K, ARCANE_DUST);

        addToItemGroup(ItemGroupUtil.REBORN12K, WOODEN_WAND);
        addToItemGroup(ItemGroupUtil.REBORN12K, SILVER_SCEPTER );
        addToItemGroup(ItemGroupUtil.REBORN12K, GOLDEN_ROD);
        addToItemGroup(ItemGroupUtil.REBORN12K, ARCHMAGE_STAFF);

        addToItemGroup(ItemGroupUtil.REBORN12K, BLANK_RUNE);

        addToItemGroup(ItemGroupUtil.REBORN12K, RUNE_OF_AIR);
        addToItemGroup(ItemGroupUtil.REBORN12K, RUNE_OF_EARTH);
        addToItemGroup(ItemGroupUtil.REBORN12K, RUNE_OF_WATER);
        addToItemGroup(ItemGroupUtil.REBORN12K, RUNE_OF_FIRE);

        addToItemGroup(ItemGroupUtil.REBORN12K, RUNE_OF_LIGHT);
        addToItemGroup(ItemGroupUtil.REBORN12K, RUNE_OF_DARKNESS);

        addToItemGroup(ItemGroupUtil.REBORN12K, SUPERIOR_RUNE_OF_AIR);
        addToItemGroup(ItemGroupUtil.REBORN12K, SUPERIOR_RUNE_OF_EARTH);
        addToItemGroup(ItemGroupUtil.REBORN12K, SUPERIOR_RUNE_OF_WATER);
        addToItemGroup(ItemGroupUtil.REBORN12K, SUPERIOR_RUNE_OF_FIRE);
        addToItemGroup(ItemGroupUtil.REBORN12K, SUPERIOR_RUNE_OF_LIGHT);
        addToItemGroup(ItemGroupUtil.REBORN12K, SUPERIOR_RUNE_OF_DARKNESS);

        addToItemGroup(ItemGroupUtil.REBORN12K, RUNE_OF_LIGHTNING);
        addToItemGroup(ItemGroupUtil.REBORN12K, RUNE_OF_NATURE);
        addToItemGroup(ItemGroupUtil.REBORN12K, RUNE_OF_ICE);
        addToItemGroup(ItemGroupUtil.REBORN12K, RUNE_OF_IRON);

        addToItemGroup(ItemGroupUtil.REBORN12K, RUNE_OF_ORDER);
        addToItemGroup(ItemGroupUtil.REBORN12K, RUNE_OF_CHAOS);

        addToItemGroup(ItemGroupUtil.REBORN12K, ELEMENTAL_RUNE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ETHEREAL_RUNE);

        addToItemGroup(ItemGroupUtil.REBORN12K, RUNE_OF_STRENGTH);

        addToItemGroup(ItemGroupUtil.REBORN12K, WINDSTORM_MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN12K, VIRIDIAN_MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ABYSS_MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN12K, VOLCANIC_MANATITE);

        addToItemGroup(ItemGroupUtil.REBORN12K, SUNLIGHT_MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN12K, NOVILUNIUM_MANATITE);

        addToItemGroup(ItemGroupUtil.REBORN12K, THUNDERBOLT_MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN12K, TERRA_MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN12K, GLACIAL_MANATITE);
        addToItemGroup(ItemGroupUtil.REBORN12K, FERRUM_MANATITE);

        addToItemGroup(ItemGroupUtil.REBORN12K, CRIMSON_MANATITE);

        addToItemGroup(ItemGroupUtil.REBORN12K, MAGIC_MIRROR);
        addToItemGroup(ItemGroupUtil.REBORN12K, ICE_MIRROR);
        addToItemGroup(ItemGroupUtil.REBORN12K, CELL_PHONE);

        addToItemGroup(ItemGroupUtil.REBORN12K, SOUL_VESSEL);

        addToItemGroup(ItemGroupUtil.REBORN12K, CHICKEN_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, COW_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, FISH_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, FROG_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, MOOSHROOM_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, PIG_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, RABBIT_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, SHEEP_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, SQUID_SOUL);

        addToItemGroup(ItemGroupUtil.REBORN12K, BEE_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, SPIDER_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENDERMAN_SOUL);

        addToItemGroup(ItemGroupUtil.REBORN12K, BLAZE_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, CREEPER_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, DROWNED_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, GHAST_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, GUARDIAN_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, ILLAGER_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGMA_CUBE_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, PHANTOM_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, SHULKER_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, SKELETON_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, SLIME_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, WITCH_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, WITHER_SKELETON_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, ZOMBIE_SOUL);

        addToItemGroup(ItemGroupUtil.REBORN12K, ENDER_DRAGON_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, WARDEN_SOUL);
        addToItemGroup(ItemGroupUtil.REBORN12K, WITHER_SOUL);


        addToItemGroup(ItemGroupUtil.REBORN12K, CHICKEN_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, COW_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, FISH_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, FROG_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, MOOSHROOM_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, PIG_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, RABBIT_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, SHEEP_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, SQUID_ESSENCE);

        addToItemGroup(ItemGroupUtil.REBORN12K, BEE_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, SPIDER_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENDERMAN_ESSENCE);

        addToItemGroup(ItemGroupUtil.REBORN12K, BLAZE_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, CREEPER_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, DROWNED_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, GHAST_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, GUARDIAN_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ILLAGER_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGMA_CUBE_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, PHANTOM_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, SHULKER_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, SKELETON_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, SLIME_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, WITCH_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, WITHER_SKELETON_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ZOMBIE_ESSENCE);

        addToItemGroup(ItemGroupUtil.REBORN12K, ENDER_DRAGON_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, WARDEN_ESSENCE);
        addToItemGroup(ItemGroupUtil.REBORN12K, WITHER_ESSENCE);

    }

    private static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Magic Items");
    }
}