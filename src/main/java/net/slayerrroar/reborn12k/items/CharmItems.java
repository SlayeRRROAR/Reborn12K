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
import net.slayerrroar.reborn12k.items.item_class.GlintedItem;
import net.slayerrroar.reborn12k.items.item_class.charms.cape.*;
import net.slayerrroar.reborn12k.items.item_class.held_items.*;
import net.slayerrroar.reborn12k.items.item_class.charms.shoes.*;
import net.slayerrroar.reborn12k.items.item_class.charms.hat.*;
import net.slayerrroar.reborn12k.items.item_class.charms.belt.*;
import net.slayerrroar.reborn12k.items.item_class.charms.ring.*;
import net.slayerrroar.reborn12k.items.item_class.charms.necklace.*;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class CharmItems {

    public static final Item MAGIC_MIRROR = registerItem("magic_mirror", new MirrorItem(new FabricItemSettings().maxCount(1).maxDamage(16)));
    public static final Item ICE_MIRROR = registerItem("ice_mirror", new MirrorItem(new FabricItemSettings().maxCount(1).maxDamage(16)));
    public static final Item CELL_PHONE = registerItem("cell_phone", new MirrorItem(new FabricItemSettings().maxCount(1).maxDamage(16)));

    public static final Item MAGNET = registerItem("magnet", new MagnetItem(new FabricItemSettings().maxCount(1)));

    public static final Item YGGDRASILL_BRANCH = registerItem("yggdrasill_branch", new NatureItem(new FabricItemSettings().maxCount(1)));


    public static final Item SHADES = registerItem("shades", new ShadesCharm(new FabricItemSettings().maxCount(1)));
    public static final Item DEMON_KINGS_CROWN = registerItem("demon_kings_crown", new DemonKingsCrown(new FabricItemSettings().maxCount(1)));
    public static final Item CAT_EARS = registerItem("cat_ears", new CatEarsCharm(new FabricItemSettings().maxCount(1)));
    public static final Item COW_EARS = registerItem("cow_ears", new CowEarsCharm(new FabricItemSettings().maxCount(1)));
    public static final Item BUNNY_EARS = registerItem("bunny_ears", new BunnyEarsCharm(new FabricItemSettings().maxCount(1)));
    public static final Item MAGNIFIER_GOGGLES = registerItem("magnifier_goggles", new MagnifierGoggles(new FabricItemSettings().maxCount(1)));

    public static final Item PARACHUTE = registerItem("parachute", new Parachute(new FabricItemSettings().maxCount(1)));
    public static final Item BAT_WINGS = registerItem("bat_wings", new AngelWings(new FabricItemSettings().maxCount(1)));
    public static final Item ANGEL_WINGS = registerItem("angel_wings", new AngelWings(new FabricItemSettings().maxCount(1)));
    public static final Item DEMON_WINGS = registerItem("demon_wings", new AngelWings(new FabricItemSettings().maxCount(1)));

    public static final Item BLACK_BELT = registerItem("black_belt", new BlackBelt(new FabricItemSettings().maxCount(1)));
    public static final Item EXPERT_BELT = registerItem("expert_belt", new ExpertBelt(new FabricItemSettings().maxCount(1)));
    public static final Item CHAMPIONS_BELT = registerItem("champions_belt", new ChampionsBelt(new FabricItemSettings().maxCount(1)));
    public static final Item FOCUS_BELT = registerItem("focus_belt", new FocusBelt(new FabricItemSettings().maxCount(1)));

    public static final Item COMFY_SHOES = registerItem("comfy_shoes", new ComfyShoes(new FabricItemSettings().maxCount(1)));
    public static final Item TRAVELERS_SHOES = registerItem("travelers_shoes", new TravelersShoes(new FabricItemSettings().maxCount(1)));
    public static final Item RUNNING_SHOES = registerItem("running_shoes", new RunningShoes(new FabricItemSettings().maxCount(1)));
    public static final Item LONG_FALL_BOOTS = registerItem("long_fall_boots", new LongFallBoots(new FabricItemSettings().maxCount(1)));

    public static final Item OLD_NECKLACE = registerItem("old_necklace", new OldNecklace(new FabricItemSettings().maxCount(1)));
    public static final Item GOLDEN_NECKLACE = registerItem("golden_necklace", new GoldenNecklace(new FabricItemSettings().maxCount(1)));
    public static final Item BEJEWELED_NECKLACE = registerItem("bejewled_necklace", new BejeweledNecklace(new FabricItemSettings().maxCount(1)));
    public static final Item HEART_PENDANT = registerItem("heart_pendant", new HeartPendant(new FabricItemSettings().maxCount(1)));
    public static final Item ARCANE_PENDANT = registerItem("arcane_pendant", new ArcanePendant(new FabricItemSettings().maxCount(1)));
    public static final Item CURSED_PENDANT = registerItem("cursed_pendant", new CursedPendant(new FabricItemSettings().maxCount(1)));

    public static final Item GOLDEN_RING = registerItem("golden_ring", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.UNCOMMON)));
    public static final Item AWAKENED_GOLDEN_RING = registerItem("awakened_golden_ring", new GlintedItem(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.RARE)));

    public static final Item RING_OF_AIR = registerItem("ring_of_air", new RingAIR(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item RING_OF_EARTH = registerItem("ring_of_earth", new RingEARTH(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item RING_OF_WATER = registerItem("ring_of_water", new RingWATER(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item RING_OF_FIRE = registerItem("ring_of_fire", new RingFIRE(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item RING_OF_LIGHT = registerItem("ring_of_light", new RingLIGHT(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item RING_OF_DARKNESS = registerItem("ring_of_darkness", new RingDARKNESS(new FabricItemSettings().maxCount(1).fireproof()));

    public static final Item RING_OF_IRON = registerItem("ring_of_iron", new RingIRON(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item RING_OF_NATURE = registerItem("ring_of_nature", new RingNATURE(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item RING_OF_ICE = registerItem("ring_of_ice", new RingICE(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item RING_OF_LIGHTNING = registerItem("ring_of_lightning", new RingLIGHTNING(new FabricItemSettings().maxCount(1).fireproof()));

    public static final Item RING_OF_STRENGTH = registerItem("", new RingSTRENGTH(new FabricItemSettings().maxCount(1).fireproof()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(Reborn12KItemGroup.REBORN12K, MAGIC_MIRROR);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ICE_MIRROR);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, CELL_PHONE);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, MAGNET);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, YGGDRASILL_BRANCH);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, SHADES);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, DEMON_KINGS_CROWN);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, CAT_EARS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, COW_EARS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, BUNNY_EARS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, MAGNIFIER_GOGGLES);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, PARACHUTE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, BAT_WINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ANGEL_WINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, DEMON_WINGS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, BLACK_BELT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, EXPERT_BELT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, CHAMPIONS_BELT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, FOCUS_BELT);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Charms");
    }
}