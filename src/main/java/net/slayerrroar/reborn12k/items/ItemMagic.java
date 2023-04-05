package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.custom.magic.*;
import net.slayerrroar.reborn12k.items.custom.staffs.abyss.*;
import net.slayerrroar.reborn12k.items.custom.staffs.crimson.*;
import net.slayerrroar.reborn12k.items.custom.staffs.ferrum.*;
import net.slayerrroar.reborn12k.items.custom.staffs.glacial.*;
import net.slayerrroar.reborn12k.items.custom.staffs.novilunium.*;
import net.slayerrroar.reborn12k.items.custom.staffs.sunlight.*;
import net.slayerrroar.reborn12k.items.custom.staffs.terra.*;
import net.slayerrroar.reborn12k.items.custom.staffs.thunderbolt.*;
import net.slayerrroar.reborn12k.items.custom.staffs.viridian.*;
import net.slayerrroar.reborn12k.items.custom.staffs.volcanic.*;
import net.slayerrroar.reborn12k.items.custom.staffs.windstorm.*;
import net.slayerrroar.reborn12k.items.custom.magic.runes.*;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

@SuppressWarnings("unused")

public class ItemMagic {

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

    public static final Item RUNE_OF_LIGHT = registerItem("rune_of_light", new RuneEthereal(new FabricItemSettings()));
    public static final Item RUNE_OF_DARKNESS= registerItem("rune_of_darkness", new Item(new FabricItemSettings()));

    public static final Item RUNE_OF_LIGHTNING = registerItem("rune_of_lightning", new Item(new FabricItemSettings()));
    public static final Item RUNE_OF_NATURE = registerItem("rune_of_nature", new Item(new FabricItemSettings()));
    public static final Item RUNE_OF_ICE = registerItem("rune_of_ice", new Item(new FabricItemSettings()));
    public static final Item RUNE_OF_IRON = registerItem("rune_of_iron", new Item(new FabricItemSettings()));

    public static final Item RUNE_OF_ORDER = registerItem("rune_of_order", new Item(new FabricItemSettings()));
    public static final Item RUNE_OF_CHAOS = registerItem("rune_of_chaos", new Item(new FabricItemSettings()));

    public static final Item ELEMENTAL_RUNE = registerItem("elemental_rune", new Item(new FabricItemSettings()));
    public static final Item ETHEREAL_RUNE = registerItem("ethereal_rune", new Item(new FabricItemSettings()));

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

    public static final Item YGGDRASILL_BRANCH = registerItem("yggdrasill_branch", new YggdrasillItem(new FabricItemSettings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(Reborn12KItemGroup.REBORN12K, MANAWEAVE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, REFINED_MANATITE);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, WOODEN_WAND);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, SILVER_SCEPTER );
        addToItemGroup(Reborn12KItemGroup.REBORN12K, GOLDEN_ROD);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ARCHMAGE_STAFF);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, BLANK_RUNE);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, RUNE_OF_AIR);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RUNE_OF_EARTH);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RUNE_OF_WATER);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RUNE_OF_FIRE);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, RUNE_OF_LIGHT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RUNE_OF_DARKNESS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, RUNE_OF_LIGHTNING);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RUNE_OF_NATURE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RUNE_OF_ICE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RUNE_OF_IRON);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, RUNE_OF_ORDER);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RUNE_OF_CHAOS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, ELEMENTAL_RUNE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ETHEREAL_RUNE);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, RUNE_OF_STRENGTH);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, WINDSTORM_MANATITE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, VIRIDIAN_MANATITE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ABYSS_MANATITE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, VOLCANIC_MANATITE);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, SUNLIGHT_MANATITE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, NOVILUNIUM_MANATITE);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, THUNDERBOLT_MANATITE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, TERRA_MANATITE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, GLACIAL_MANATITE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, FERRUM_MANATITE);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, CRIMSON_MANATITE);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, MAGIC_MIRROR);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ICE_MIRROR);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, CELL_PHONE);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, YGGDRASILL_BRANCH);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Magic Items");
    }
}