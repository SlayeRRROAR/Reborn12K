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
import net.slayerrroar.reborn12k.items.custom.GlintedItem;
import net.slayerrroar.reborn12k.items.custom.trinkets.trinket.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.belt.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.hat.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.necklace.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.ring.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.shoes.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.trinket.band.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.trinket.claw.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.trinket.impulses.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.trinket.medallion.*;
import net.slayerrroar.reborn12k.items.custom.trinkets.trinket.tonic.*;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class ItemTrinkets {

    //Hat

    public static final Item SHADES = registerItem("shades", new ShadesCharm(new FabricItemSettings().maxCount(1)));
    public static final Item IRON_CROWN = registerItem("iron_crown", new IronCrown(new FabricItemSettings().maxCount(1)));
    public static final Item CAT_EARS = registerItem("cat_ears", new CatEarsCharm(new FabricItemSettings().maxCount(1)));
    public static final Item COW_EARS = registerItem("cow_ears", new CowEarsCharm(new FabricItemSettings().maxCount(1)));
    public static final Item BUNNY_EARS = registerItem("bunny_ears", new BunnyEarsCharm(new FabricItemSettings().maxCount(1)));

    //Belt

    public static final Item BLACK_BELT = registerItem("black_belt", new BlackBelt(new FabricItemSettings().maxCount(1)));
    public static final Item EXPERT_BELT = registerItem("expert_belt", new ExpertBelt(new FabricItemSettings().maxCount(1)));
    public static final Item CHAMPION_BELT = registerItem("champion_belt", new ChampionBelt(new FabricItemSettings().maxCount(1)));
    public static final Item FOCUS_BELT = registerItem("focus_belt", new FocusBelt(new FabricItemSettings().maxCount(1)));

    //Shoes

    public static final Item COMFY_SHOES = registerItem("comfy_shoes", new ComfyShoes(new FabricItemSettings().maxCount(1)));
    public static final Item TRAVELER_SHOES = registerItem("traveler_shoes", new TravelerShoes(new FabricItemSettings().maxCount(1)));
    public static final Item RUNNING_SHOES = registerItem("running_shoes", new RunningShoes(new FabricItemSettings().maxCount(1)));
    public static final Item LONG_FALL_BOOTS = registerItem("long_fall_boots", new LongFallBoots(new FabricItemSettings().maxCount(1)));

    //Necklace

    public static final Item OLD_NECKLACE = registerItem("old_necklace", new OldNecklace(new FabricItemSettings().maxCount(1)));
    public static final Item GOLDEN_NECKLACE = registerItem("golden_necklace", new GoldenNecklace(new FabricItemSettings().maxCount(1)));
    public static final Item BEJEWELED_NECKLACE = registerItem("bejeweled_necklace", new BejeweledNecklace(new FabricItemSettings().maxCount(1)));
    public static final Item HEART_PENDANT = registerItem("heart_pendant", new HeartPendant(new FabricItemSettings().maxCount(1)));
    public static final Item GRIFFIN_FEATHER = registerItem("griffin_feather", new AirPendant(new FabricItemSettings().maxCount(1)));
    public static final Item GOLEM_CORE = registerItem("golem_core", new EarthPendant(new FabricItemSettings().maxCount(1)));
    public static final Item LEVIATHAN_EYE = registerItem("leviathan_eye", new WaterPendant(new FabricItemSettings().maxCount(1)));
    public static final Item DRAGON_FANG = registerItem("dragon_fang", new FirePendant(new FabricItemSettings().maxCount(1)));
    public static final Item ANGEL_TEAR = registerItem("angel_tear", new LightPendant(new FabricItemSettings().maxCount(1)));
    public static final Item BASILISK_TOOTH = registerItem("basilisk_tooth", new DarkPendant(new FabricItemSettings().maxCount(1)));

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

    public static final Item VAGUE_WAR_MEDALLION = registerItem("vague_war_medallion", new VagueMedallion(new FabricItemSettings().maxCount(1)));
    public static final Item MINOR_WAR_MEDALLION = registerItem("minor_war_medallion", new MinorMedallion(new FabricItemSettings().maxCount(1)));
    public static final Item INDELIBLE_WAR_MEDALLION = registerItem("indelible_war_medallion", new IndelibleMedallion(new FabricItemSettings().maxCount(1)));
    public static final Item GREATER_WAR_MEDALLION = registerItem("greater_war_medallion", new GreaterMedallion(new FabricItemSettings().maxCount(1)));

    public static final Item VAGUE_FRENZY_TONIC = registerItem("vague_frenzy_tonic", new VagueTonic(new FabricItemSettings().maxCount(1)));
    public static final Item MINOR_FRENZY_TONIC = registerItem("minor_frenzy_tonic", new MinorTonic(new FabricItemSettings().maxCount(1)));
    public static final Item INDELIBLE_FRENZY_TONIC = registerItem("indelible_frenzy_tonic", new IndelibleTonic(new FabricItemSettings().maxCount(1)));
    public static final Item GREATER_FRENZY_TONIC = registerItem("greater_frenzy_tonic", new GreaterTonic(new FabricItemSettings().maxCount(1)));

    public static final Item AIR_IMPULSE = registerItem("air_impulse", new AirImpulse(new FabricItemSettings().maxCount(1)));
    public static final Item EARTH_IMPULSE = registerItem("earth_impulse", new EarthImpulse(new FabricItemSettings().maxCount(1)));
    public static final Item WATER_IMPULSE = registerItem("water_impulse", new WaterImpulse(new FabricItemSettings().maxCount(1)));
    public static final Item FIRE_IMPULSE = registerItem("fire_impulse", new FireImpulse(new FabricItemSettings().maxCount(1)));
    public static final Item LIGHT_IMPULSE = registerItem("light_impulse", new LightImpulse(new FabricItemSettings().maxCount(1)));
    public static final Item DARK_IMPULSE = registerItem("dark_impulse", new DarkImpulse(new FabricItemSettings().maxCount(1)));

    public static final Item JETPACK = registerItem("jetpack", new JetpackItem(new FabricItemSettings().maxCount(1)));
    public static final Item BAT_WINGS = registerItem("bat_wings", new WingsItem(new FabricItemSettings().maxCount(1)));
    public static final Item ANGEL_WINGS = registerItem("angel_wings", new WingsItem(new FabricItemSettings().maxCount(1)));
    public static final Item DEMON_WINGS = registerItem("demon_wings", new WingsItem(new FabricItemSettings().maxCount(1)));

    public static final Item GOLD_POUCH = registerItem("gold_pouch", new GoldPouchItem(new FabricItemSettings().maxCount(1)));
    public static final Item BLOODY_ROSE = registerItem("bloody_rose", new BloodyRoseItem(new FabricItemSettings().maxCount(1)));
    public static final Item MAGNIFYING_GLASS = registerItem("magnifying_glass", new MagnifyingGlass(new FabricItemSettings().maxCount(1)));
    public static final Item MAGNET = registerItem("magnet", new MagnetItem(new FabricItemSettings().maxCount(1)));
    public static final Item PHOENIX_PLUME = registerItem("phoenix_plume", new PhoenixPlume(new FabricItemSettings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(Reborn12KItemGroup.REBORN12K, SHADES);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, IRON_CROWN);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, CAT_EARS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, COW_EARS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, BUNNY_EARS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, BLACK_BELT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, EXPERT_BELT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, CHAMPION_BELT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, FOCUS_BELT);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, COMFY_SHOES);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, TRAVELER_SHOES);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RUNNING_SHOES);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, LONG_FALL_BOOTS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, OLD_NECKLACE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, GOLDEN_NECKLACE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, BEJEWELED_NECKLACE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, HEART_PENDANT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, GRIFFIN_FEATHER);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, GOLEM_CORE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, LEVIATHAN_EYE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, DRAGON_FANG);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ANGEL_TEAR);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, BASILISK_TOOTH);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, GOLDEN_RING);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, AWAKENED_GOLDEN_RING);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, RING_OF_AIR);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RING_OF_EARTH);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RING_OF_WATER);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RING_OF_FIRE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RING_OF_LIGHT);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RING_OF_DARKNESS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, RING_OF_STRENGTH);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, VAGUE_BAND_OF_FORTITUDE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, MINOR_BAND_OF_FORTITUDE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, INDELIBLE_BAND_OF_FORTITUDE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, GREATER_BAND_OF_FORTITUDE);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, VAGUE_BLOODY_CLAW);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, MINOR_BLOODY_CLAW);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, INDELIBLE_BLOODY_CLAW);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, GREATER_BLOODY_CLAW);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, VAGUE_WAR_MEDALLION);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, MINOR_WAR_MEDALLION);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, INDELIBLE_WAR_MEDALLION);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, GREATER_WAR_MEDALLION);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, VAGUE_FRENZY_TONIC);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, MINOR_FRENZY_TONIC);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, INDELIBLE_FRENZY_TONIC);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, GREATER_FRENZY_TONIC);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, AIR_IMPULSE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, EARTH_IMPULSE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, WATER_IMPULSE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, FIRE_IMPULSE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, LIGHT_IMPULSE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, DARK_IMPULSE);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, JETPACK);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, BAT_WINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ANGEL_WINGS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, DEMON_WINGS);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, GOLD_POUCH);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, BLOODY_ROSE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, MAGNIFYING_GLASS);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, MAGNET);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, PHOENIX_PLUME);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Trinket Items");
    }
}