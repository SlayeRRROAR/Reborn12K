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
import net.slayerrroar.reborn12k.items.item_class.staffs.abyss.*;
import net.slayerrroar.reborn12k.items.item_class.staffs.ferrum.*;
import net.slayerrroar.reborn12k.items.item_class.staffs.glacial.*;
import net.slayerrroar.reborn12k.items.item_class.staffs.crimson.*;
import net.slayerrroar.reborn12k.items.item_class.staffs.novilunium.*;
import net.slayerrroar.reborn12k.items.item_class.staffs.sunlight.*;
import net.slayerrroar.reborn12k.items.item_class.staffs.terra.*;
import net.slayerrroar.reborn12k.items.item_class.staffs.thunderbolt.*;
import net.slayerrroar.reborn12k.items.item_class.staffs.viridian.*;
import net.slayerrroar.reborn12k.items.item_class.staffs.volcanic.*;
import net.slayerrroar.reborn12k.items.item_class.staffs.windstorm.*;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class StaffItems {

    public static final Item WOODEN_WAND = registerItem ("wooden_wand", new Item(new FabricItemSettings()));
    public static final Item SILVER_SCEPTER = registerItem ("silver_scepter", new Item(new FabricItemSettings()));
    public static final Item GOLDEN_ROD = registerItem ("golden_rod", new Item(new FabricItemSettings()));
    public static final Item ARCHMAGE_STAFF = registerItem ("archmage_staff", new Item(new FabricItemSettings()));


    public static final Item WINDSTORM_WAND = registerItem ("windstorm_wand", new WindstormWand(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item WINDSTORM_SCEPTER = registerItem ("windstorm_scepter", new WindstormScepter(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item WINDSTORM_ROD = registerItem ("windstorm_rod", new WindstormRod(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item WINDSTORM_STAFF = registerItem ("windstorm_staff", new WindstormStaff(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item VIRIDIAN_WAND = registerItem ("viridian_wand", new ViridianWand(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item VIRIDIAN_SCEPTER = registerItem ("viridian_scepter", new ViridianScepter(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item VIRIDIAN_ROD = registerItem ("viridian_rod", new ViridianRod(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item VIRIDIAN_STAFF = registerItem ("viridian_staff", new ViridianStaff(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item ABYSS_WAND = registerItem ("abyss_wand", new AbyssWand(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item ABYSS_SCEPTER = registerItem ("abyss_scepter", new AbyssScepter(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item ABYSS_ROD = registerItem ("abyss_rod", new AbyssRod(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item ABYSS_STAFF = registerItem ("abyss_staff", new AbyssStaff(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item VOLCANIC_WAND = registerItem ("volcanic_wand", new VolcanicWand(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item VOLCANIC_SCEPTER = registerItem ("volcanic_scepter", new VolcanicScepter(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item VOLCANIC_ROD = registerItem ("volcanic_rod", new VolcanicRod(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item VOLCANIC_STAFF = registerItem ("volcanic_staff", new VolcanicStaff(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item SUNLIGHT_WAND = registerItem ("sunlight_wand", new SunlightWand(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item SUNLIGHT_SCEPTER = registerItem ("sunlight_scepter", new SunlightScepter(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item SUNLIGHT_ROD = registerItem ("sunlight_rod", new SunlightRod(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item SUNLIGHT_STAFF = registerItem ("sunlight_staff", new SunlightStaff(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item NOVILUNIUM_WAND = registerItem ("novilunium_wand", new NoviluniumWand(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item NOVILUNIUM_SCEPTER = registerItem ("novilunium_scepter", new NoviluniumScepter(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item NOVILUNIUM_ROD = registerItem ("novilunium_rod", new NoviluniumRod(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item NOVILUNIUM_STAFF = registerItem ("novilunium_staff", new NoviluniumStaff(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item FERRUM_WAND = registerItem ("ferrum_wand", new FerrumWand(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item FERRUM_SCEPTER = registerItem ("ferrum_scepter", new FerrumScepter(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item FERRUM_ROD = registerItem ("ferrum_rod", new FerrumRod(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item FERRUM_STAFF = registerItem ("ferrum_staff", new FerrumStaff(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item TERRA_WAND = registerItem ("terra_wand", new TerraWand(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item TERRA_SCEPTER = registerItem ("terra_scepter", new TerraScepter(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item TERRA_ROD = registerItem ("terra_rod", new TerraRod(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item TERRA_STAFF = registerItem ("terra_staff", new TerraStaff(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item GLACIAL_WAND = registerItem ("glacial_wand", new GlacialWand(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item GLACIAL_SCEPTER = registerItem ("glacial_scepter", new GlacialScepter(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item GLACIAL_ROD = registerItem ("glacial_rod", new GlacialRod(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item GLACIAL_STAFF = registerItem ("glacial_staff", new GlacialStaff(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item THUNDERBOLT_WAND = registerItem ("thunderbolt_wand", new ThunderboltWand(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item THUNDERBOLT_SCEPTER = registerItem ("thunderbolt_scepter", new ThunderboltScepter(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item THUNDERBOLT_ROD = registerItem ("thunderbolt_rod", new ThunderboltRod(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item THUNDERBOLT_STAFF = registerItem ("thunderbolt_staff", new ThunderboltStaff(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static final Item CRIMSON_WAND = registerItem ("crimson_wand", new CrimsonWand(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item CRIMSON_SCEPTER = registerItem ("crimson_scepter", new CrimsonScepter(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item CRIMSON_ROD = registerItem ("crimson_rod", new CrimsonRod(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.RARE)));
    public static final Item CRIMSON_STAFF = registerItem ("crimson_staff", new CrimsonStaff(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.EPIC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(Reborn12KItemGroup.REBORN12K, WOODEN_WAND);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, SILVER_SCEPTER );
        addToItemGroup(Reborn12KItemGroup.REBORN12K, GOLDEN_ROD);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ARCHMAGE_STAFF);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Staffs");
    }
}
