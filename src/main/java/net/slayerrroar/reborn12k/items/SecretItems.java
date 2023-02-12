package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class SecretItems {

    public static final Item RED_ENGINE = registerItem("red_engine", new Item(new FabricItemSettings()));

    public static final Item CASING_MK237 = registerItem("casing_mk237", new Item(new FabricItemSettings()));

    public static final Item CERAMITE_PLATE = registerItem("ceramite_plate", new Item(new FabricItemSettings()));
    public static final Item STURDY_FABRIC = registerItem("sturdy_fabric", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(Reborn12KItemGroup.REBORN12K, RED_ENGINE);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, CASING_MK237);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, CERAMITE_PLATE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, STURDY_FABRIC);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Secret Items");
    }
}