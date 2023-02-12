package net.slayerrroar.reborn12k.villagers;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.RebornBlocks;
import net.slayerrroar.reborn12k.items.*;
import net.slayerrroar.reborn12k.tools.RebornTools;

import java.util.Random;

public class RebornCustomTrades {

    public static void register() {

        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Trade Offers");

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 1,                                        //Jeweler
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 3),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(RebornItems.SILVER_INGOT, 2),
                            16, 1, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.QUARTZ, 12),
                            new ItemStack(Items.EMERALD, 1),
                            12, 10, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.AMETHYST_SHARD, 16),
                            new ItemStack(Items.EMERALD, 1),
                            12, 10, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.LAPIS_LAZULI, 3),
                            new ItemStack(Items.EMERALD, 1),
                            8, 10, 0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 3,
                factories -> {
                    factories.add(((entity, random) -> choseRandomManaGem()));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ECHO_SHARD, 1),
                            new ItemStack(Items.EMERALD, 11),
                            8, 20, 0.03f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(RebornItems.RAW_NICHIRIN, 1),
                            12, 15, 0.00f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 41),
                            new ItemStack(MagicItems.REFINED_MANATITE, 1),
                            3, 15, 0.03f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 17),
                            new ItemStack(MagicItems.MANAWEAVE, 1),
                            8, 30, 0.00f));
                    factories.add((entity, random) -> choseRandomNecklace());
                });


        TradeOfferHelper.registerVillagerOffers(RebornVillagers.BLACKSMITH, 1,                                     //Blacksmith
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_INGOT, 4),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COPPER_INGOT, 8),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COAL, 15),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(RebornItems.TIN_INGOT, 7),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.BLACKSMITH, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 3),
                            new ItemStack(Items.EMERALD, 1),
                            12, 10, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(RebornItems.ELECTRUM_INGOT, 1),
                            12, 5, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(RebornItems.TITANIUM_INGOT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 10, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(RebornItems.CHROME_INGOT, 3),
                            12, 5, 0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.BLACKSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Blocks.END_STONE, 13),
                            new ItemStack(Items.EMERALD, 1),
                            12, 20, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(RebornItems.URANIUM_INGOT, 1),
                            new ItemStack(Items.EMERALD, 3),
                            12, 20, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.QUARTZ, 16),
                            new ItemStack(RebornItems.TITANIUM_INGOT, 1),
                            8, 10, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.BLACKSMITH, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(RebornItems.TUNGSTEN_INGOT, 1),
                            8, 20, 0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(RebornItems.NICKEL_INGOT, 1),
                            8, 20, 0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 63),
                            new ItemStack(Items.DRAGON_EGG, 1),
                            3, 15, 0.00f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.BLACKSMITH, 5,
                factories -> {
                    factories.add((entity, random) -> choseRandomSword());
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 38),
                            new ItemStack(Items.SHULKER_SHELL, 1),
                            3, 30, 0.00f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 52),
                            new ItemStack(Items.NETHERITE_SCRAP, 1),
                            3, 30, 0.0f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.MANASMITH, 1,                                      //Manasmith
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(RebornItems.SAPPHIRE, 1),
                            12, 1, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(RebornBlocks.ASH_LOG, 16),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.03f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.MANASMITH, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(RebornItems.RUBY, 1),
                            12, 5, 0.05f));
                    factories.add((entity, random) -> choseRandomBasicRune());
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.MANASMITH, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(RebornItems.SUNSTONE, 5),
                            12, 10, 0.05f));
                    factories.add((entity, random) ->  new TradeOffer(
                            new ItemStack(Items.EMERALD, 7),
                            new ItemStack(RebornItems.MANATITE, 1),
                            12, 15, 0.03f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.MANASMITH, 4,
                factories -> {
                    factories.add((entity, random) ->  new TradeOffer(
                            new ItemStack(Items.EMERALD, 41),
                            new ItemStack(MagicItems.REFINED_MANATITE, 1),
                            3, 15, 0.03f));
                    factories.add((entity, random) -> choseRandomAdvancedRune());
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.MANASMITH, 5,
                factories -> {
                    factories.add((entity, random) -> choseRandomBeltL5());
                    factories.add(((entity, random) -> choseRandomRing()));
                });


        TradeOfferHelper.registerVillagerOffers(RebornVillagers.HMBLE, 1,                                          //Hmble
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PAPER, 24),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Blocks.GLASS_PANE, 11),
                            12, 1, 0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.HMBLE, 2,
                factories -> {
                    factories.add((entity, random) -> choseRandomShoes());
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 11),
                            new ItemStack(Items.TNT, 1),
                            12, 10, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.HMBLE, 3,
                factories -> {
                    factories.add(((entity, random) -> choseRandomManaGem()));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(RebornItems.BANANA, 12),
                            12, 10, 0.03f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.HMBLE, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(RebornItems.RAW_NICHIRIN, 1),
                            12, 30, 0.00f));
                    factories.add((entity, random) -> choseRandomBeltL4());
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.HMBLE, 5,
                factories -> {
                    factories.add((entity, random) -> choseRandomSword());
                    factories.add((entity, random) -> choseRandomBestCharm());
                });

    }

    private static TradeOffer choseRandomRing() {

        TradeOffer ringAir = new TradeOffer(new ItemStack(Items.EMERALD, 59),
                new ItemStack(CharmItems.RING_OF_AIR,1),
                1, 30, 0.0f);
        TradeOffer ringEarth = new TradeOffer(new ItemStack(Items.EMERALD, 58),
                new ItemStack(CharmItems.RING_OF_EARTH,1),
                1, 30, 0.0f);
        TradeOffer ringWater = new TradeOffer(new ItemStack(Items.EMERALD, 54),
                new ItemStack(CharmItems.RING_OF_WATER,1),
                1, 30, 0.0f);
        TradeOffer ringFire = new TradeOffer(new ItemStack(Items.EMERALD, 52),
                new ItemStack(CharmItems.RING_OF_FIRE,1),
                1, 30, 0.0f);
        TradeOffer ringLight = new TradeOffer(new ItemStack(Items.EMERALD, 62),
                new ItemStack(CharmItems.RING_OF_LIGHT,1),
                1, 30, 0.0f);
        TradeOffer ringDark = new TradeOffer(new ItemStack(Items.EMERALD, 62),
                new ItemStack(CharmItems.RING_OF_DARKNESS,1),
                1, 30, 0.0f);
        TradeOffer ringIron = new TradeOffer(new ItemStack(Items.EMERALD, 56),
                new ItemStack(CharmItems.RING_OF_ICE,1),
                1, 30, 0.0f);
        TradeOffer ringNature = new TradeOffer(new ItemStack(Items.EMERALD, 58),
                new ItemStack(CharmItems.RING_OF_EARTH,1),
                1, 30, 0.0f);
        TradeOffer ringIce = new TradeOffer(new ItemStack(Items.EMERALD, 53),
                new ItemStack(CharmItems.RING_OF_ICE,1),
                1, 30, 0.0f);
        TradeOffer ringLightning = new TradeOffer(new ItemStack(Items.EMERALD, 56),
                new ItemStack(CharmItems.RING_OF_LIGHTNING,1),
                1, 30, 0.0f);

        Random rand = new Random();
        int upperbound = 10;
        int int_random = rand.nextInt(upperbound);

        if(int_random == 0) {
            return ringAir;
        }
        if(int_random == 1) {
            return ringEarth;
        }
        if(int_random == 2) {
            return ringWater;
        }
        if(int_random == 3) {
            return ringFire;
        }
        if(int_random == 4) {
            return ringLight;
        }
        if(int_random == 5) {
            return ringDark;
        }
        if(int_random == 6) {
            return ringIron;
        }
        if(int_random == 7) {
            return ringNature;
        }
        if(int_random == 8) {
            return ringIce;
        }
        return ringLightning;

    }
    private static TradeOffer choseRandomNecklace() {

        TradeOffer neckOld = new TradeOffer(new ItemStack(Items.EMERALD, 59),
                new ItemStack(CharmItems.OLD_NECKLACE,1),
                1, 30, 0.0f);
        TradeOffer neckGolden = new TradeOffer(new ItemStack(Items.EMERALD, 58),
                new ItemStack(CharmItems.GOLDEN_NECKLACE,1),
                1, 30, 0.0f);
        TradeOffer neckBejeweled = new TradeOffer(new ItemStack(Items.EMERALD, 56),
                new ItemStack(CharmItems.BEJEWELED_NECKLACE,1),
                1, 30, 0.0f);

        Random rand = new Random();
        int upperbound = 8;
        int int_random = rand.nextInt(upperbound);

        if(int_random > 2) {
            return neckOld;
        }if(int_random > 0) {
            return neckGolden;
        } return neckBejeweled;

    }
    private static TradeOffer choseRandomBeltL4() {
        TradeOffer beltBlack = new TradeOffer(new ItemStack(Items.EMERALD, 13),
                new ItemStack(CharmItems.BLACK_BELT,1),
                3, 15, 0.0f);
        TradeOffer beltExpert = new TradeOffer(new ItemStack(Items.EMERALD, 22),
                new ItemStack(CharmItems.EXPERT_BELT,1),
                3, 15, 0.0f);
        TradeOffer beltFocus = new TradeOffer(new ItemStack(Items.EMERALD, 35),
                new ItemStack(CharmItems.FOCUS_BELT,1),
                1, 15, 0.0f);
        TradeOffer beltChamp = new TradeOffer(new ItemStack(Items.EMERALD, 49),
                new ItemStack(CharmItems.CHAMPIONS_BELT,1),
                1, 15, 0.0f);

        Random rand = new Random();
        int upperbound = 11;
        int int_random = rand.nextInt(upperbound);

        if(int_random > 7) {
            return beltExpert;
        }if(int_random > 5) {
            return beltFocus;
        }if(int_random > 0) {
            return beltBlack;
        } return beltChamp;
    }
    private static TradeOffer choseRandomBeltL5() {
        TradeOffer beltBlack = new TradeOffer(new ItemStack(Items.EMERALD, 13),
                new ItemStack(CharmItems.BLACK_BELT,1),
                3, 30, 0.0f);
        TradeOffer beltExpert = new TradeOffer(new ItemStack(Items.EMERALD, 22),
                new ItemStack(CharmItems.EXPERT_BELT,1),
                3, 30, 0.0f);
        TradeOffer beltFocus = new TradeOffer(new ItemStack(Items.EMERALD, 35),
                new ItemStack(CharmItems.FOCUS_BELT,1),
                1, 30, 0.0f);
        TradeOffer beltChamp = new TradeOffer(new ItemStack(Items.EMERALD, 49),
                new ItemStack(CharmItems.CHAMPIONS_BELT,1),
                1, 30, 0.0f);

        Random rand = new Random();
        int upperbound = 11;
        int int_random = rand.nextInt(upperbound);

        if(int_random > 7) {
            return beltExpert;
        }
        if(int_random > 5) {
            return beltFocus;
        }
        if(int_random > 0) {
            return beltBlack;
        }
        return beltChamp;
    }
    private static TradeOffer choseRandomManaGem() {

        TradeOffer sapphire = new TradeOffer(
                new ItemStack(Items.EMERALD, 5),
                new ItemStack(RebornItems.SAPPHIRE, 1),
                12, 10, 0.05f);
        TradeOffer ruby = new TradeOffer(
                new ItemStack(Items.EMERALD, 5),
                new ItemStack(RebornItems.RUBY, 1),
                12, 10, 0.05f);
        TradeOffer sunstone = new TradeOffer(
                new ItemStack(Items.EMERALD, 7),
                new ItemStack(RebornItems.SUNSTONE, 1),
                12, 10, 0.05f);
        TradeOffer manatite = new TradeOffer(
                new ItemStack(Items.EMERALD, 7),
                new ItemStack(RebornItems.MANATITE, 1),
                12, 10, 0.05f);

        Random rand = new Random();
        int upperbound = 7;
        int int_random = rand.nextInt(upperbound);

        if(int_random == 0) {
            return manatite;
        }
        if(int_random == 1 || int_random == 2) {
            return sapphire;
        }
        if(int_random == 3 || int_random == 4) {
            return ruby;
        }
        return sunstone;

    }
    private static TradeOffer choseRandomBasicRune() {

        TradeOffer runeAir = new TradeOffer(new ItemStack(Items.EMERALD, 9),
                new ItemStack(MagicItems.RUNE_OF_AIR,1),
                12, 5, 0.0f);
        TradeOffer runeEarth = new TradeOffer(new ItemStack(Items.EMERALD, 9),
                new ItemStack(MagicItems.RUNE_OF_EARTH,1),
                12, 5, 0.0f);
        TradeOffer runeWater = new TradeOffer(new ItemStack(Items.EMERALD, 9),
                new ItemStack(MagicItems.RUNE_OF_WATER,1),
                12, 5, 0.0f);
        TradeOffer runeFire = new TradeOffer(new ItemStack(Items.EMERALD, 9),
                new ItemStack(MagicItems.RUNE_OF_FIRE,1),
                12, 5, 0.0f);
        TradeOffer runeLight = new TradeOffer(new ItemStack(Items.EMERALD, 10),
                new ItemStack(MagicItems.RUNE_OF_LIGHT,1),
                12, 5, 0.0f);
        TradeOffer runeDark = new TradeOffer(new ItemStack(Items.EMERALD, 10),
                new ItemStack(MagicItems.RUNE_OF_DARKNESS,1),
                12, 5, 0.0f);

        Random rand = new Random();
        int upperbound = 6;
        int int_random = rand.nextInt(upperbound);

        if(int_random == 0) {
            return runeAir;
        }
        if(int_random == 1) {
            return runeEarth;
        }
        if(int_random == 2) {
            return runeWater;
        }
        if(int_random == 3) {
            return runeFire;
        }
        if(int_random == 4) {
            return runeLight;
        }
        return runeDark;

    }
    private static TradeOffer choseRandomAdvancedRune() {

        TradeOffer runeIron = new TradeOffer(new ItemStack(Items.EMERALD, 24),
                new ItemStack(MagicItems.RUNE_OF_IRON, 1),
                8, 15, 0.0f);
        TradeOffer runeNature = new TradeOffer(new ItemStack(Items.EMERALD, 24),
                new ItemStack(MagicItems.RUNE_OF_NATURE, 1),
                8, 15, 0.0f);
        TradeOffer runeIce = new TradeOffer(new ItemStack(Items.EMERALD, 24),
                new ItemStack(MagicItems.RUNE_OF_ICE, 1),
                8, 15, 0.0f);
        TradeOffer runeLightning = new TradeOffer(new ItemStack(Items.EMERALD, 24),
                new ItemStack(MagicItems.RUNE_OF_LIGHTNING, 1),
                8, 15, 0.0f);

        Random rand = new Random();
        int upperbound = 4;
        int int_random = rand.nextInt(upperbound);

        if(int_random == 0) {
            return runeIce;
        }
        if(int_random == 1) {
            return runeIron;
        }
        if(int_random == 2) {
            return runeNature;
        }
        return runeLightning;

    }
    private static TradeOffer choseRandomShoes() {
        TradeOffer comfy = new TradeOffer(new ItemStack(Items.EMERALD, 19),
                new ItemStack(CharmItems.COMFY_SHOES,1),
                8, 10, 0.3f);
        TradeOffer traveler = new TradeOffer(new ItemStack(Items.EMERALD, 25),
                new ItemStack(CharmItems.TRAVELERS_SHOES,1),
                8, 10, 0.3f);
        TradeOffer running = new TradeOffer(new ItemStack(Items.EMERALD, 38),
                new ItemStack(CharmItems.RUNNING_SHOES,1),
                8, 10, 0.3f);

        Random rand = new Random();
        int upperbound = 9;
        int int_random = rand.nextInt(upperbound);

        if(int_random > 3) {
            return comfy;
        }
        if(int_random > 0) {
            return traveler;
        }
        return running;
    }
    private static TradeOffer choseRandomBestCharm() {

        TradeOffer batWings = new TradeOffer(new ItemStack(Items.NETHER_STAR, 5),
                new ItemStack(CharmItems.BAT_WINGS,1),
                1, 30, 0.0f);
        TradeOffer goggles = new TradeOffer(new ItemStack(Items.EMERALD, 64),
                new ItemStack(CharmItems.MAGNIFIER_GOGGLES,1),
                1, 30, 0.0f);
        TradeOffer demonKingsCrown = new TradeOffer(new ItemStack(Items.EMERALD, 49),
                new ItemStack(CharmItems.DEMON_KINGS_CROWN,1),
                1, 30, 0.0f);
        TradeOffer heartPendant = new TradeOffer(new ItemStack(Items.EMERALD, 53),
                new ItemStack(CharmItems.HEART_PENDANT,1),
                1, 30, 0.0f);
        TradeOffer longFall = new TradeOffer(new ItemStack(Items.EMERALD, 34),
                new ItemStack(CharmItems.LONG_FALL_BOOTS,1),
                1, 30, 0.0f);

        Random rand = new Random();
        int upperbound = 11;
        int int_random = rand.nextInt(upperbound);

        if(int_random > 8) {
            return demonKingsCrown;
        }
        if(int_random > 5) {
            return heartPendant;
        }
        if(int_random > 2) {
            return longFall;
        }
        if(int_random > 0) {
            return goggles;
        }
        return batWings;

    }
    private static TradeOffer choseRandomSword() {

        TradeOffer murasama = new TradeOffer(new ItemStack(Items.EMERALD, 64),
                new ItemStack(RebornTools.MURASAMA,1),
                1, 30, 0.0f);
        TradeOffer bladewolf = new TradeOffer(new ItemStack(Items.EMERALD, 64),
                new ItemStack(RebornTools.BLADEWOLF,1),
                1, 30, 0.0f);
        TradeOffer powerSword = new TradeOffer(new ItemStack(Items.EMERALD, 64),
                new ItemStack(RebornTools.POWER_SWORD,1),
                1, 30, 0.0f);
        TradeOffer cutter = new TradeOffer(new ItemStack(Items.EMERALD, 64),
                new ItemStack(RebornTools.CUTTER_237,1),
                1, 30, 0.0f);
        TradeOffer rebellion = new TradeOffer(new ItemStack(Items.EMERALD, 64),
                new ItemStack(RebornTools.REBELLION,1),
                1, 30, 0.0f);
        TradeOffer yamato = new TradeOffer(new ItemStack(Items.EMERALD, 64),
                new ItemStack(RebornTools.YAMATO,1),
                1, 30, 0.0f);

        Random rand = new Random();
        int upperbound = 6;
        int int_random = rand.nextInt(upperbound);

        if(int_random == 0) {
            return murasama;
        }
        if(int_random == 1) {
            return bladewolf;
        }
        if(int_random == 2) {
            return powerSword;
        }
        if(int_random == 3) {
            return cutter;
        }
        if(int_random == 4) {
            return rebellion;
        }
        return yamato;

    }

}
