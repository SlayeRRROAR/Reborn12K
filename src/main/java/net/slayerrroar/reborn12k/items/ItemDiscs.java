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
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;
import net.slayerrroar.reborn12k.items.custom.RebornDiscItem;
import net.slayerrroar.reborn12k.sounds.RebornSounds;

public class ItemDiscs {

    public static final Item UNRECORDED_DISC = registerItem("unrecorded_disc", new Item(new FabricItemSettings()));

    public static final Item Z115_DISC = registerItem("z115_disc", new RebornDiscItem(15, RebornSounds.Z115, new FabricItemSettings()
            .maxCount(1).rarity(Rarity.EPIC), 228));
    public static final Item DEVIL_TRIGGER_DISC = registerItem("devil_trigger_disc", new RebornDiscItem(15, RebornSounds.DEVIL_TRIGGER, new FabricItemSettings()
            .maxCount(1).rarity(Rarity.EPIC), 405));
    public static final Item BURY_THE_LIGHT_DISC = registerItem("bury_the_light_disc", new RebornDiscItem(15, RebornSounds.BURY_THE_LIGHT, new FabricItemSettings()
            .maxCount(1).rarity(Rarity.EPIC), 583));
    public static final Item FREE_BIRD_DISC = registerItem("free_bird_disc", new RebornDiscItem(15, RebornSounds.FREE_BIRD, new FabricItemSettings()
            .maxCount(1).rarity(Rarity.EPIC), 558));
    public static final Item ALKATRAZ_DISC = registerItem("alkatraz_disc", new RebornDiscItem(15, RebornSounds.ALKATRAZ, new FabricItemSettings()
            .maxCount(1).rarity(Rarity.EPIC), 216));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(Reborn12KItemGroup.REBORN12K, UNRECORDED_DISC);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, Z115_DISC);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, DEVIL_TRIGGER_DISC);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, BURY_THE_LIGHT_DISC);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, FREE_BIRD_DISC);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ALKATRAZ_DISC);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Disc Items");
    }
}
