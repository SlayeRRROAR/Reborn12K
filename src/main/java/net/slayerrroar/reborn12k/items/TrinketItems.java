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
import net.slayerrroar.reborn12k.items.custom.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.belt.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.hat.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.necklace.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.ring.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.shoes.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.trinket.*;
import net.slayerrroar.reborn12k.util.ItemGroupUtil;

public class TrinketItems {

    //Key

    public static final Item STRONGBOX_KEY = registerItem("strongbox_key", new KeyItem(new FabricItemSettings()));

    //Hat

    public static final Item SHADES = registerItem("shades", new Shades(new FabricItemSettings().maxCount(1)));
    public static final Item IRON_CROWN = registerItem("iron_crown", new IronCrown(new FabricItemSettings().maxCount(1)));
    public static final Item CAT_EARS = registerItem("cat_ears", new CatEars(new FabricItemSettings().maxCount(1)));
    public static final Item COW_EARS = registerItem("cow_ears", new CowEars(new FabricItemSettings().maxCount(1)));
    public static final Item BUNNY_EARS = registerItem("bunny_ears", new BunnyEars(new FabricItemSettings().maxCount(1)));

    //Belt

    public static final Item GREEN_BELT = registerItem("green_belt", new GreenBelt(new FabricItemSettings().maxCount(1)));
    public static final Item RED_BELT = registerItem("red_belt", new RedBelt(new FabricItemSettings().maxCount(1)));
    public static final Item BLACK_BELT = registerItem("black_belt", new BlackBelt(new FabricItemSettings().maxCount(1)));
    public static final Item EXPERT_BELT = registerItem("expert_belt", new ExpertBelt(new FabricItemSettings().maxCount(1)));
    public static final Item ANTIGRAV_BUCKLE = registerItem("antigrav_buckle", new AntiGravBuckle(new FabricItemSettings().maxCount(1)));

    //Shoes

    public static final Item COMFY_SLIPPERS = registerItem("comfy_slippers", new ComfySlippers(new FabricItemSettings().maxCount(1)));
    public static final Item LOAFERS = registerItem("loafers", new Loafers(new FabricItemSettings().maxCount(1)));
    public static final Item TRAVELER_SHOES = registerItem("traveler_shoes", new TravelerShoes(new FabricItemSettings().maxCount(1)));
    public static final Item RUNNING_SHOES = registerItem("running_shoes", new RunningShoes(new FabricItemSettings().maxCount(1)));
    public static final Item LONG_FALL_BOOTS = registerItem("long_fall_boots", new LongFallBoots(new FabricItemSettings().maxCount(1)));
    public static final Item WINGED_SHOES = registerItem("winged_shoes", new WingedShoes(new FabricItemSettings().maxCount(1)));

    //Necklace

    public static final Item IRON_NECKLACE = registerItem("iron_necklace", new IronNecklace(new FabricItemSettings().maxCount(1)));
    public static final Item GOLDEN_NECKLACE = registerItem("golden_necklace", new GoldenNecklace(new FabricItemSettings().maxCount(1)));
    public static final Item BEJEWELED_NECKLACE = registerItem("bejeweled_necklace", new BejeweledNecklace(new FabricItemSettings().maxCount(1)));
    public static final Item HEART_PENDANT = registerItem("heart_pendant", new HeartPendant(new FabricItemSettings().maxCount(1)));

    //Ring

    public static final Item GOLDEN_RING = registerItem("golden_ring", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.UNCOMMON)));
    public static final Item AWAKENED_GOLDEN_RING = registerItem("awakened_golden_ring", new GlintedItem(new FabricItemSettings().maxCount(1).fireproof().rarity(Rarity.RARE)));

    public static final Item RING_OF_AIR = registerItem("ring_of_air", new AirRing(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item RING_OF_EARTH = registerItem("ring_of_earth", new EarthRing(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item RING_OF_WATER = registerItem("ring_of_water", new WaterRing(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item RING_OF_FIRE = registerItem("ring_of_fire", new FireRing(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item RING_OF_LIGHT = registerItem("ring_of_light", new LightRing(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item RING_OF_DARKNESS = registerItem("ring_of_darkness", new DarkRing(new FabricItemSettings().maxCount(1).fireproof()));

    public static final Item RING_OF_STRENGTH = registerItem("ring_of_strength", new StrengthRing(new FabricItemSettings().maxCount(1).fireproof()));

    //Trinket

    public static final Item BAND_OF_FORTITUDE = registerItem("band_of_fortitude", new BaseBand(new FabricItemSettings().maxCount(1)));
    public static final Item GREATER_BAND_OF_FORTITUDE = registerItem("greater_band_of_fortitude", new GreaterBand(new FabricItemSettings().maxCount(1)));

    public static final Item MONSTER_CLAW = registerItem("monster_claw", new MonsterClaw(new FabricItemSettings().maxCount(1)));
    public static final Item BLOODY_CLAW = registerItem("bloody_claw", new BloodyClaw(new FabricItemSettings().maxCount(1)));

    public static final Item TARNISHED_MEDALLION = registerItem("tarnished_medallion", new TarnishedMedallion(new FabricItemSettings().maxCount(1)));
    public static final Item GOLDEN_MEDALLION = registerItem("golden_medallion", new GoldenMedallion(new FabricItemSettings().maxCount(1)));

    public static final Item WORN_CHARM = registerItem("worn_charm", new WornCharm(new FabricItemSettings().maxCount(1)));
    public static final Item LUCKY_CHARM = registerItem("lucky_charm", new LuckyCharm(new FabricItemSettings().maxCount(1)));

    public static final Item JETPACK = registerItem("jetpack", new Jetpack(new FabricItemSettings().maxCount(1)));
    public static final Item ANGEL_WINGS = registerItem("angel_wings", new AngelWings(new FabricItemSettings().maxCount(1)));
    public static final Item DEMON_WINGS = registerItem("demon_wings", new AngelWings(new FabricItemSettings().maxCount(1)));
    public static final Item BAT_WINGS = registerItem("bat_wings", new AngelWings(new FabricItemSettings().maxCount(1)));

    public static final Item GOLD_POUCH = registerItem("gold_pouch", new GoldPouch(new FabricItemSettings().maxCount(1)));
    public static final Item STRONG_SPRING = registerItem("strong_spring", new StrongSpring(new FabricItemSettings().maxCount(1)));
    public static final Item BLOODY_ROSE = registerItem("bloody_rose", new BloodyRose(new FabricItemSettings().maxCount(1)));
    public static final Item ENDLESS_QUIVER = registerItem("endless_quiver", new EndlessQuiver(new FabricItemSettings().maxCount(1)));
    public static final Item MAGNIFYING_GLASS = registerItem("magnifying_glass", new MagnifyingGlass(new FabricItemSettings().maxCount(1)));
    public static final Item PHOENIX_PLUME = registerItem("phoenix_plume", new PhoenixPlume(new FabricItemSettings().maxCount(1)));

    public static final Item GRIFFIN_FEATHER = registerItem("griffin_feather", new GriffinFeather(new FabricItemSettings().maxCount(1)));
    public static final Item ACONITUM = registerItem("aconitum", new Aconitum(new FabricItemSettings().maxCount(1)));
    public static final Item LEVIATHAN_EYE = registerItem("leviathan_eye", new LeviathanEye(new FabricItemSettings().maxCount(1)));
    public static final Item CRYSTALIZED_EMBER = registerItem("crystalized_ember", new CrystalizedEmber(new FabricItemSettings().maxCount(1)));
    public static final Item LOADED_DICE = registerItem("loaded_dice", new LoadedDice(new FabricItemSettings().maxCount(1)));
    public static final Item BASILISK_FANG = registerItem("basilisk_fang", new BasiliskFang(new FabricItemSettings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(ItemGroupUtil.REBORN12K, STRONGBOX_KEY);

        addToItemGroup(ItemGroupUtil.REBORN12K, SHADES);
        addToItemGroup(ItemGroupUtil.REBORN12K, IRON_CROWN);
        addToItemGroup(ItemGroupUtil.REBORN12K, CAT_EARS);
        addToItemGroup(ItemGroupUtil.REBORN12K, COW_EARS);
        addToItemGroup(ItemGroupUtil.REBORN12K, BUNNY_EARS);

        addToItemGroup(ItemGroupUtil.REBORN12K, GREEN_BELT);
        addToItemGroup(ItemGroupUtil.REBORN12K, RED_BELT);
        addToItemGroup(ItemGroupUtil.REBORN12K, BLACK_BELT);
        addToItemGroup(ItemGroupUtil.REBORN12K, EXPERT_BELT);
        addToItemGroup(ItemGroupUtil.REBORN12K, ANTIGRAV_BUCKLE);


        addToItemGroup(ItemGroupUtil.REBORN12K, COMFY_SLIPPERS);
        addToItemGroup(ItemGroupUtil.REBORN12K, LOAFERS);
        addToItemGroup(ItemGroupUtil.REBORN12K, TRAVELER_SHOES);
        addToItemGroup(ItemGroupUtil.REBORN12K, RUNNING_SHOES);
        addToItemGroup(ItemGroupUtil.REBORN12K, LONG_FALL_BOOTS);
        addToItemGroup(ItemGroupUtil.REBORN12K, WINGED_SHOES);


        addToItemGroup(ItemGroupUtil.REBORN12K, IRON_NECKLACE);
        addToItemGroup(ItemGroupUtil.REBORN12K, GOLDEN_NECKLACE);
        addToItemGroup(ItemGroupUtil.REBORN12K, BEJEWELED_NECKLACE);
        addToItemGroup(ItemGroupUtil.REBORN12K, HEART_PENDANT);


        addToItemGroup(ItemGroupUtil.REBORN12K, GOLDEN_RING);
        addToItemGroup(ItemGroupUtil.REBORN12K, AWAKENED_GOLDEN_RING);

        addToItemGroup(ItemGroupUtil.REBORN12K, RING_OF_AIR);
        addToItemGroup(ItemGroupUtil.REBORN12K, RING_OF_EARTH);
        addToItemGroup(ItemGroupUtil.REBORN12K, RING_OF_WATER);
        addToItemGroup(ItemGroupUtil.REBORN12K, RING_OF_FIRE);
        addToItemGroup(ItemGroupUtil.REBORN12K, RING_OF_LIGHT);
        addToItemGroup(ItemGroupUtil.REBORN12K, RING_OF_DARKNESS);

        addToItemGroup(ItemGroupUtil.REBORN12K, RING_OF_STRENGTH);

        addToItemGroup(ItemGroupUtil.REBORN12K, BAND_OF_FORTITUDE);
        addToItemGroup(ItemGroupUtil.REBORN12K, GREATER_BAND_OF_FORTITUDE);

        addToItemGroup(ItemGroupUtil.REBORN12K, MONSTER_CLAW);
        addToItemGroup(ItemGroupUtil.REBORN12K, BLOODY_CLAW);

        addToItemGroup(ItemGroupUtil.REBORN12K, TARNISHED_MEDALLION);
        addToItemGroup(ItemGroupUtil.REBORN12K, GOLDEN_MEDALLION);

        addToItemGroup(ItemGroupUtil.REBORN12K, WORN_CHARM);
        addToItemGroup(ItemGroupUtil.REBORN12K, LUCKY_CHARM);

        addToItemGroup(ItemGroupUtil.REBORN12K, JETPACK);
        addToItemGroup(ItemGroupUtil.REBORN12K, ANGEL_WINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, DEMON_WINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, BAT_WINGS);

        addToItemGroup(ItemGroupUtil.REBORN12K, GOLD_POUCH);
        addToItemGroup(ItemGroupUtil.REBORN12K, STRONG_SPRING);
        addToItemGroup(ItemGroupUtil.REBORN12K, BLOODY_ROSE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENDLESS_QUIVER);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGNIFYING_GLASS);
        addToItemGroup(ItemGroupUtil.REBORN12K, PHOENIX_PLUME);

        addToItemGroup(ItemGroupUtil.REBORN12K, GRIFFIN_FEATHER);
        addToItemGroup(ItemGroupUtil.REBORN12K, ACONITUM);
        addToItemGroup(ItemGroupUtil.REBORN12K, LEVIATHAN_EYE);
        addToItemGroup(ItemGroupUtil.REBORN12K, CRYSTALIZED_EMBER);
        addToItemGroup(ItemGroupUtil.REBORN12K, LOADED_DICE);
        addToItemGroup(ItemGroupUtil.REBORN12K, BASILISK_FANG);
    }

    private static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Trinket Items");
    }
}