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
import net.slayerrroar.reborn12k.items.custom.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.belt.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.hat.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.necklace.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.ring.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.shoes.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.trinket.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.trinket.band.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.trinket.charm.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.trinket.claw.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.trinket.elemental_trinkets.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.trinket.medallion.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.trinket.tonic.*;
import net.slayerrroar.reborn12k.util.ItemGroupUtil;

public class ItemTrinkets {

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
    public static final Item FOCUS_BELT = registerItem("focus_belt", new FocusBelt(new FabricItemSettings().maxCount(1)));
    public static final Item EXPERT_BELT = registerItem("expert_belt", new ExpertBelt(new FabricItemSettings().maxCount(1)));
    public static final Item ANTIGRAV_BELT = registerItem("antigrav_belt", new AntiGravBelt(new FabricItemSettings().maxCount(1)));

    //Shoes

    public static final Item COMFY_LOAFERS = registerItem("comfy_loafers", new ComfyLoafers(new FabricItemSettings().maxCount(1)));
    public static final Item TRAVELER_SHOES = registerItem("traveler_shoes", new TravelerShoes(new FabricItemSettings().maxCount(1)));
    public static final Item RUNNING_SHOES = registerItem("running_shoes", new RunningShoes(new FabricItemSettings().maxCount(1)));
    public static final Item LONG_FALL_BOOTS = registerItem("long_fall_boots", new LongFallBoots(new FabricItemSettings().maxCount(1)));

    //Necklace

    public static final Item OLD_NECKLACE = registerItem("old_necklace", new OldNecklace(new FabricItemSettings().maxCount(1)));
    public static final Item GOLDEN_NECKLACE = registerItem("golden_necklace", new GoldenNecklace(new FabricItemSettings().maxCount(1)));
    public static final Item BEJEWELED_NECKLACE = registerItem("bejeweled_necklace", new BejeweledNecklace(new FabricItemSettings().maxCount(1)));
    public static final Item HEART_PENDANT = registerItem("heart_pendant", new HeartPendant(new FabricItemSettings().maxCount(1)));

    public static final Item AIR_PENDANT = registerItem("air_pendant", new AirPendant(new FabricItemSettings().maxCount(1)));
    public static final Item EARTH_PENDANT = registerItem("earth_pendant", new EarthPendant(new FabricItemSettings().maxCount(1)));
    public static final Item WATER_PENDANT = registerItem("water_pendant", new WaterPendant(new FabricItemSettings().maxCount(1)));
    public static final Item FIRE_PENDANT = registerItem("fire_pendant", new FirePendant(new FabricItemSettings().maxCount(1)));
    public static final Item LIGHT_PENDANT = registerItem("light_pendant", new LightPendant(new FabricItemSettings().maxCount(1)));
    public static final Item DARK_PENDANT = registerItem("dark_pendant", new DarkPendant(new FabricItemSettings().maxCount(1)));

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

    public static final Item VAGUE_BAND_OF_FORTITUDE = registerItem("vague_band_of_fortitude", new VagueBand(new FabricItemSettings().maxCount(1)));
    public static final Item MINOR_BAND_OF_FORTITUDE = registerItem("minor_band_of_fortitude", new MinorBand(new FabricItemSettings().maxCount(1)));
    public static final Item INDELIBLE_BAND_OF_FORTITUDE = registerItem("indelible_band_of_fortitude", new IndelibleBand(new FabricItemSettings().maxCount(1)));
    public static final Item GREATER_BAND_OF_FORTITUDE = registerItem("greater_band_of_fortitude", new GreaterBand(new FabricItemSettings().maxCount(1)));

    public static final Item VAGUE_BLOODY_CLAW = registerItem("vague_bloody_claw", new VagueClaw(new FabricItemSettings().maxCount(1)));
    public static final Item MINOR_BLOODY_CLAW = registerItem("minor_bloody_claw", new MinorClaw(new FabricItemSettings().maxCount(1)));
    public static final Item INDELIBLE_BLOODY_CLAW = registerItem("indelible_bloody_claw", new IndelibleClaw(new FabricItemSettings().maxCount(1)));
    public static final Item GREATER_BLOODY_CLAW = registerItem("greater_bloody_claw", new GreaterClaw(new FabricItemSettings().maxCount(1)));

    public static final Item VAGUE_MEDALLION = registerItem("vague_medallion", new VagueMedallion(new FabricItemSettings().maxCount(1)));
    public static final Item MINOR_MEDALLION = registerItem("minor_medallion", new MinorMedallion(new FabricItemSettings().maxCount(1)));
    public static final Item INDELIBLE_MEDALLION = registerItem("indelible_medallion", new IndelibleMedallion(new FabricItemSettings().maxCount(1)));
    public static final Item GREATER_MEDALLION = registerItem("greater_medallion", new GreaterMedallion(new FabricItemSettings().maxCount(1)));

    public static final Item VAGUE_FRENZY_TONIC = registerItem("vague_frenzy_tonic", new VagueTonic(new FabricItemSettings().maxCount(1)));
    public static final Item MINOR_FRENZY_TONIC = registerItem("minor_frenzy_tonic", new MinorTonic(new FabricItemSettings().maxCount(1)));
    public static final Item INDELIBLE_FRENZY_TONIC = registerItem("indelible_frenzy_tonic", new IndelibleTonic(new FabricItemSettings().maxCount(1)));
    public static final Item GREATER_FRENZY_TONIC = registerItem("greater_frenzy_tonic", new GreaterTonic(new FabricItemSettings().maxCount(1)));

    public static final Item VAGUE_LUCKY_CHARM = registerItem("vague_lucky_charm", new VagueLuckyItem(new FabricItemSettings().maxCount(1)));
    public static final Item MINOR_LUCKY_CHARM = registerItem("minor_lucky_charm", new MinorLuckyItem(new FabricItemSettings().maxCount(1)));
    public static final Item INDELIBLE_LUCKY_CHARM = registerItem("indelible_lucky_charm", new IndelibleLuckyItem(new FabricItemSettings().maxCount(1)));
    public static final Item GREATER_LUCKY_CHARM = registerItem("greater_lucky_charm", new GreaterLuckyItem(new FabricItemSettings().maxCount(1)));

    public static final Item JETPACK = registerItem("jetpack", new Jetpack(new FabricItemSettings().maxCount(1)));
    public static final Item ANGEL_WINGS = registerItem("angel_wings", new AngelWings(new FabricItemSettings().maxCount(1)));
    public static final Item DEMON_WINGS = registerItem("demon_wings", new AngelWings(new FabricItemSettings().maxCount(1)));
    public static final Item BAT_WINGS = registerItem("bat_wings", new AngelWings(new FabricItemSettings().maxCount(1)));

    public static final Item GOLD_POUCH = registerItem("gold_pouch", new GoldPouch(new FabricItemSettings().maxCount(1)));
    public static final Item WEAK_SPRING = registerItem("weak_spring", new WeakSpring(new FabricItemSettings().maxCount(1)));
    public static final Item FF_SPRING = registerItem("ff_spring", new FFSpring(new FabricItemSettings().maxCount(1)));
    public static final Item BLOODY_ROSE = registerItem("bloody_rose", new BloodyRose(new FabricItemSettings().maxCount(1)));
    public static final Item ENDLESS_QUIVER = registerItem("endless_quiver", new EndlessQuiver(new FabricItemSettings().maxCount(1)));
    public static final Item MAGNIFYING_GLASS = registerItem("magnifying_glass", new MagnifyingGlass(new FabricItemSettings().maxCount(1)));
    public static final Item MAGNET = registerItem("magnet", new Magnet(new FabricItemSettings().maxCount(1)));
    public static final Item PHOENIX_PLUME = registerItem("phoenix_plume", new PhoenixPlume(new FabricItemSettings().maxCount(1)));

    public static final Item GRIFFIN_FEATHER = registerItem("griffin_feather", new GriffinFeather(new FabricItemSettings().maxCount(1)));
    public static final Item GOLEM_CORE = registerItem("golem_core", new GolemCore(new FabricItemSettings().maxCount(1)));
    public static final Item LEVIATHAN_EYE = registerItem("leviathan_eye", new LeviathanEye(new FabricItemSettings().maxCount(1)));
    public static final Item DRAGON_FANG = registerItem("dragon_fang", new DragonFang(new FabricItemSettings().maxCount(1)));
    public static final Item ANGEL_TEAR = registerItem("angel_tear", new RadiantTrinket(new FabricItemSettings().maxCount(1)));
    public static final Item BASILISK_TOOTH = registerItem("basilisk_tooth", new BasiliskTooth(new FabricItemSettings().maxCount(1)));


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
        addToItemGroup(ItemGroupUtil.REBORN12K, FOCUS_BELT);
        addToItemGroup(ItemGroupUtil.REBORN12K, EXPERT_BELT);
        addToItemGroup(ItemGroupUtil.REBORN12K, ANTIGRAV_BELT);

        addToItemGroup(ItemGroupUtil.REBORN12K, COMFY_LOAFERS);
        addToItemGroup(ItemGroupUtil.REBORN12K, TRAVELER_SHOES);
        addToItemGroup(ItemGroupUtil.REBORN12K, RUNNING_SHOES);
        addToItemGroup(ItemGroupUtil.REBORN12K, LONG_FALL_BOOTS);

        addToItemGroup(ItemGroupUtil.REBORN12K, OLD_NECKLACE);
        addToItemGroup(ItemGroupUtil.REBORN12K, GOLDEN_NECKLACE);
        addToItemGroup(ItemGroupUtil.REBORN12K, BEJEWELED_NECKLACE);
        addToItemGroup(ItemGroupUtil.REBORN12K, HEART_PENDANT);

        addToItemGroup(ItemGroupUtil.REBORN12K, AIR_PENDANT);
        addToItemGroup(ItemGroupUtil.REBORN12K, EARTH_PENDANT);
        addToItemGroup(ItemGroupUtil.REBORN12K, WATER_PENDANT);
        addToItemGroup(ItemGroupUtil.REBORN12K, FIRE_PENDANT);
        addToItemGroup(ItemGroupUtil.REBORN12K, LIGHT_PENDANT);
        addToItemGroup(ItemGroupUtil.REBORN12K, DARK_PENDANT);

        addToItemGroup(ItemGroupUtil.REBORN12K, GOLDEN_RING);
        addToItemGroup(ItemGroupUtil.REBORN12K, AWAKENED_GOLDEN_RING);

        addToItemGroup(ItemGroupUtil.REBORN12K, RING_OF_AIR);
        addToItemGroup(ItemGroupUtil.REBORN12K, RING_OF_EARTH);
        addToItemGroup(ItemGroupUtil.REBORN12K, RING_OF_WATER);
        addToItemGroup(ItemGroupUtil.REBORN12K, RING_OF_FIRE);
        addToItemGroup(ItemGroupUtil.REBORN12K, RING_OF_LIGHT);
        addToItemGroup(ItemGroupUtil.REBORN12K, RING_OF_DARKNESS);

        addToItemGroup(ItemGroupUtil.REBORN12K, RING_OF_STRENGTH);

        addToItemGroup(ItemGroupUtil.REBORN12K, VAGUE_BAND_OF_FORTITUDE);
        addToItemGroup(ItemGroupUtil.REBORN12K, MINOR_BAND_OF_FORTITUDE);
        addToItemGroup(ItemGroupUtil.REBORN12K, INDELIBLE_BAND_OF_FORTITUDE);
        addToItemGroup(ItemGroupUtil.REBORN12K, GREATER_BAND_OF_FORTITUDE);

        addToItemGroup(ItemGroupUtil.REBORN12K, VAGUE_BLOODY_CLAW);
        addToItemGroup(ItemGroupUtil.REBORN12K, MINOR_BLOODY_CLAW);
        addToItemGroup(ItemGroupUtil.REBORN12K, INDELIBLE_BLOODY_CLAW);
        addToItemGroup(ItemGroupUtil.REBORN12K, GREATER_BLOODY_CLAW);

        addToItemGroup(ItemGroupUtil.REBORN12K, VAGUE_MEDALLION);
        addToItemGroup(ItemGroupUtil.REBORN12K, MINOR_MEDALLION);
        addToItemGroup(ItemGroupUtil.REBORN12K, INDELIBLE_MEDALLION);
        addToItemGroup(ItemGroupUtil.REBORN12K, GREATER_MEDALLION);

        addToItemGroup(ItemGroupUtil.REBORN12K, VAGUE_FRENZY_TONIC);
        addToItemGroup(ItemGroupUtil.REBORN12K, MINOR_FRENZY_TONIC);
        addToItemGroup(ItemGroupUtil.REBORN12K, INDELIBLE_FRENZY_TONIC);
        addToItemGroup(ItemGroupUtil.REBORN12K, GREATER_FRENZY_TONIC);

        addToItemGroup(ItemGroupUtil.REBORN12K, VAGUE_LUCKY_CHARM);
        addToItemGroup(ItemGroupUtil.REBORN12K, MINOR_LUCKY_CHARM);
        addToItemGroup(ItemGroupUtil.REBORN12K, INDELIBLE_LUCKY_CHARM);
        addToItemGroup(ItemGroupUtil.REBORN12K, GREATER_LUCKY_CHARM);

        addToItemGroup(ItemGroupUtil.REBORN12K, JETPACK);
        addToItemGroup(ItemGroupUtil.REBORN12K, ANGEL_WINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, DEMON_WINGS);
        addToItemGroup(ItemGroupUtil.REBORN12K, BAT_WINGS);

        addToItemGroup(ItemGroupUtil.REBORN12K, GOLD_POUCH);
        addToItemGroup(ItemGroupUtil.REBORN12K, WEAK_SPRING);
        addToItemGroup(ItemGroupUtil.REBORN12K, FF_SPRING);
        addToItemGroup(ItemGroupUtil.REBORN12K, BLOODY_ROSE);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENDLESS_QUIVER);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGNIFYING_GLASS);
        addToItemGroup(ItemGroupUtil.REBORN12K, MAGNET);
        addToItemGroup(ItemGroupUtil.REBORN12K, PHOENIX_PLUME);

        addToItemGroup(ItemGroupUtil.REBORN12K, GRIFFIN_FEATHER);
        addToItemGroup(ItemGroupUtil.REBORN12K, GOLEM_CORE);
        addToItemGroup(ItemGroupUtil.REBORN12K, LEVIATHAN_EYE);
        addToItemGroup(ItemGroupUtil.REBORN12K, DRAGON_FANG);
        addToItemGroup(ItemGroupUtil.REBORN12K, ANGEL_TEAR);
        addToItemGroup(ItemGroupUtil.REBORN12K, BASILISK_TOOTH);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Trinket Items");
    }
}