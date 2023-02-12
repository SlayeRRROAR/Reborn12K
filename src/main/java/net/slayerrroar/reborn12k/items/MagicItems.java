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
import net.slayerrroar.reborn12k.items.item_class.usable.runes.*;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class MagicItems {

    public static final Item MANAWEAVE = registerItem("manaweave", new Item(new FabricItemSettings()));
    public static final Item REFINED_MANATITE = registerItem("refined_manatite", new Item(new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item BLANK_RUNE = registerItem("blank_rune", new BlankRune(new FabricItemSettings()));

    public static final Item RUNE_OF_AIR = registerItem("rune_of_air", new Item(new FabricItemSettings()));
    public static final Item RUNE_OF_EARTH = registerItem("rune_of_earth", new Item(new FabricItemSettings()));
    public static final Item RUNE_OF_WATER = registerItem("rune_of_water", new Item(new FabricItemSettings()));
    public static final Item RUNE_OF_FIRE = registerItem("rune_of_fire", new Item(new FabricItemSettings()));

    public static final Item RUNE_OF_LIGHT = registerItem("rune_of_light", new RuneLight(new FabricItemSettings()));
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


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(Reborn12KItemGroup.REBORN12K, MANAWEAVE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, REFINED_MANATITE);

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
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Magic Items");
    }
}