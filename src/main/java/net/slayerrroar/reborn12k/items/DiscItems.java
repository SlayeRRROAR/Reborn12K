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
import net.slayerrroar.reborn12k.items.custom.RebornDiscItem;
import net.slayerrroar.reborn12k.sounds.RebornSounds;
import net.slayerrroar.reborn12k.util.ItemGroupUtil;

public class DiscItems {

    public static final Item UNRECORDED_DISC = registerItem("unrecorded_disc", new Item(new FabricItemSettings()));

    public static final Item ALKATRAZ_DISC = registerItem("alkatraz_disc", new RebornDiscItem(15, RebornSounds.ALKATRAZ, new FabricItemSettings()
            .maxCount(1).rarity(Rarity.EPIC), 216));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(ItemGroupUtil.REBORN12K, UNRECORDED_DISC);

        addToItemGroup(ItemGroupUtil.REBORN12K, ALKATRAZ_DISC);
    }

    private static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Disc Items");
    }
}
