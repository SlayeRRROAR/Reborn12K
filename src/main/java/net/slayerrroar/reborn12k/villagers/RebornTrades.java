package net.slayerrroar.reborn12k.villagers;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.RebornBlocks;
import net.slayerrroar.reborn12k.items.RebornItems;
import net.slayerrroar.reborn12k.items.TrinketItems;

import java.util.Random;

public class RebornTrades {

    public static void register() {

        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Trade Offers");

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 1, //Jeweler L1
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 3),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(RebornItems.SILVER_INGOT, 2),
                            16, 1, 0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 2, //Jeweler L2
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(RebornItems.RUBY, 1),
                            9, 5, 0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(RebornItems.SAPPHIRE, 1),
                            9, 5, 0.03f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 3, //Jeweler L3
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(Items.DIAMOND, 1),
                            9, 10, 0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 9),
                            new ItemStack(RebornItems.MANATITE, 1),
                            12, 10, 0.03f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 4, //Jeweler L4
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.AMETHYST_SHARD, 16),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.QUARTZ, 5),
                            12, 15, 0f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 5, //Jeweler L5
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 33),
                            new ItemStack(TrinketItems.IRON_NECKLACE, 1),
                            3, 30, 0f));
                    factories.add((entity, random) -> trims());
                });


        TradeOfferHelper.registerVillagerOffers(RebornVillagers.BLACKSMITH, 1,  //Blacksmith L1
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COPPER_INGOT, 8),
                            new ItemStack(Items.EMERALD, 1),
                            12, 1, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(RebornItems.TIN_INGOT, 7),
                            new ItemStack(Items.EMERALD, 1),
                            12, 1, 0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.BLACKSMITH, 2,  //Blacksmith L2
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_INGOT, 4),
                            new ItemStack(Items.EMERALD, 1),
                            12, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COAL, 15),
                            new ItemStack(Items.EMERALD, 1),
                            16, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.BLACKSMITH, 3,  //Blacksmith L3
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 43),
                            new ItemStack(RebornItems.UNIVERSAL_SMITHING_TEMPLATE, 5),
                            3, 20, 0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(RebornItems.TITANIUM_INGOT, 3),
                            new ItemStack(Items.EMERALD, 1),
                            12, 20, 0.03f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.BLACKSMITH, 4,  //Blacksmith L4
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(RebornItems.VANADIUM_INGOT, 2),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0f));
                    factories.add((entity, random) -> trims());
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.BLACKSMITH, 5,  //Blacksmith L5
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 25),
                            new ItemStack(TrinketItems.GREEN_BELT, 1),
                            3, 30, 0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 39),
                            new ItemStack(Items.NETHERITE_SCRAP, 1),
                            3, 30, 0f));
                });


        TradeOfferHelper.registerVillagerOffers(RebornVillagers.MANASMITH, 1,   //Manasmith L1
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(RebornItems.BLANK_RUNE, 1),
                            12, 1, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(RebornBlocks.ASH_LOG, 16),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.MANASMITH, 2,   //Manasmith L2
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.GOLD_INGOT, 1),
                            16, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.AMETHYST_SHARD, 16),
                            new ItemStack(Items.EMERALD, 1),
                            12, 10, 0.3f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.MANASMITH, 3,   //Manasmith L3
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(RebornItems.RUNE_OF_ORDER, 1),
                            new ItemStack(RebornItems.SOUL_VESSEL, 4),
                            9, 20, 0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.QUARTZ, 5),
                            16, 10, 0f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.MANASMITH, 4,   //Manasmith L4
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(RebornItems.MANA_SPARK, 1),
                            16, 15, 0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(RebornItems.MANAWEAVE, 1),
                            12, 15, 0f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.MANASMITH, 5,   //Manasmith L5
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(RebornItems.MAGICAL_FRAGMENT, 1),
                            new ItemStack(Items.EMERALD, 7),
                            12, 30, 0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(TrinketItems.COMFY_SLIPPERS, 1),
                            3, 30, 0f));
                });


        TradeOfferHelper.registerVillagerOffers(RebornVillagers.HOARDER, 1,   //Hoarder L1
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PAPER, 24),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(TrinketItems.STRONGBOX_KEY, 1),
                            16, 1, 0.08f));
                });


        TradeOfferHelper.registerVillagerOffers(RebornVillagers.HOARDER, 2,   //Hoarder L2
                factories -> {
                    factories.add((entity, random) -> baseTrinket());
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.POTATO, 26),
                            new ItemStack(Items.EMERALD, 1),
                            16, 10, 0.05f));
                });


        TradeOfferHelper.registerVillagerOffers(RebornVillagers.HOARDER, 3,   //Hoarder L3
                factories -> {
                    factories.add((entity, random) -> hatTrinket());
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(RebornItems.LEAD_INGOT, 6),
                            new ItemStack(Items.EMERALD, 1),
                            12, 10, 0.03f));
                });


        TradeOfferHelper.registerVillagerOffers(RebornVillagers.HOARDER, 4,   //Hoarder L4
                factories -> {
                    factories.add((entity, random) -> greaterTrinket());
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Blocks.GLASS, 2),
                            12, 15, 0.3f));
                });


        TradeOfferHelper.registerVillagerOffers(RebornVillagers.HOARDER, 5,   //Hoarder L5
                factories -> {
                    factories.add((entity, random) -> strongbox());
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 39),
                            new ItemStack(Items.NETHERITE_SCRAP, 1),
                            3, 30, 0f));
                });

    }

    private static TradeOffer createTrinketOffer(String name, int giveEmeralds, int maxUses, int merchantExperience) {

        return switch (name) {
            case "strongboxKey" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.STRONGBOX_KEY, 1),
                    maxUses, merchantExperience, 0f);
            case "shades" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.SHADES, 1),
                    maxUses, merchantExperience, 0f);
            case "ironCrown" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.IRON_CROWN, 1),
                    maxUses, merchantExperience, 0f);
            case "catEars" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.CAT_EARS, 1),
                    maxUses, merchantExperience, 0f);
            case "cowEars" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.COW_EARS, 1),
                    maxUses, merchantExperience, 0f);
            case "bunnyEars" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.BUNNY_EARS, 1),
                    maxUses, merchantExperience, 0f);
            case "greenBelt" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.GREEN_BELT, 1),
                    maxUses, merchantExperience, 0f);
            case "redBelt" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.RED_BELT, 1),
                    maxUses, merchantExperience, 0f);
            case "blackBelt" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.BLACK_BELT, 1),
                    maxUses, merchantExperience, 0f);
            case "antigravBuckle" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.ANTIGRAV_BUCKLE, 1),
                    maxUses, merchantExperience, 0f);
            case "expertBelt" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.EXPERT_BELT, 1),
                    maxUses, merchantExperience, 0f);
            case "comfySlippers" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.COMFY_SLIPPERS, 1),
                    maxUses, merchantExperience, 0f);
            case "loafers" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.LOAFERS, 1),
                    maxUses, merchantExperience, 0f);
            case "travelerShoes" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.TRAVELER_SHOES, 1),
                    maxUses, merchantExperience, 0f);
            case "longFallBoots" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.LONG_FALL_BOOTS, 1),
                    maxUses, merchantExperience, 0f);
            case "wingedShoes" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.WINGED_SHOES, 1),
                    maxUses, merchantExperience, 0f);
            case "runningShoes" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.RUNNING_SHOES, 1),
                    maxUses, merchantExperience, 0f);
            case "ironNecklace" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.IRON_NECKLACE, 1),
                    maxUses, merchantExperience, 0f);
            case "goldenNecklace" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.GOLDEN_NECKLACE, 1),
                    maxUses, merchantExperience, 0f);
            case "bejeweledNecklace" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.BEJEWELED_NECKLACE, 1),
                    maxUses, merchantExperience, 0f);
            case "heartPendant" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.HEART_PENDANT, 1),
                    maxUses, merchantExperience, 0f);
            case "baseBand" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.BAND_OF_FORTITUDE, 1),
                    maxUses, merchantExperience, 0f);
            case "greaterBand" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.GREATER_BAND_OF_FORTITUDE, 1),
                    maxUses, merchantExperience, 0f);
            case "monsterClaw" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.MONSTER_CLAW, 1),
                    maxUses, merchantExperience, 0f);
            case "bloodyClaw" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.BLOODY_CLAW, 1),
                    maxUses, merchantExperience, 0f);
            case "tarnishedMedallion" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.TARNISHED_MEDALLION, 1),
                    maxUses, merchantExperience, 0f);
            case "goldenMedallion" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.GOLDEN_MEDALLION, 1),
                    maxUses, merchantExperience, 0f);
            case "wornCharm" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.WORN_CHARM, 1),
                    maxUses, merchantExperience, 0f);
            case "luckyCharm" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.LUCKY_CHARM, 1),
                    maxUses, merchantExperience, 0f);
            case "jetpack" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.JETPACK, 1),
                    maxUses, merchantExperience, 0f);
            case "goldPouch" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.GOLD_POUCH, 1),
                    maxUses, merchantExperience, 0f);
            case "strongSpring" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.STRONG_SPRING, 1),
                    maxUses, merchantExperience, 0f);
            case "bloodyRose" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.BLOODY_ROSE, 1),
                    maxUses, merchantExperience, 0f);
            case "endlessQuiver" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.ENDLESS_QUIVER, 1),
                    maxUses, merchantExperience, 0f);
            case "magnifyingGlass" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.MAGNIFYING_GLASS, 1),
                    maxUses, merchantExperience, 0f);
            default -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(Items.EMERALD, 1),
                    1, 0, 0f);
        };

    }

    private static TradeOffer baseTrinket() {
        Random randomBaseTrinket = new Random();
        int baseUpperbound = 4;
        int baseTrinketInt = randomBaseTrinket.nextInt(baseUpperbound);

        if (baseTrinketInt == 0) {
            return createTrinketOffer("baseBand", 21, 3, 5);
        }
        if (baseTrinketInt == 1) {
            return createTrinketOffer("monsterClaw", 21, 3, 5);
        }
        if (baseTrinketInt == 2) {
            return createTrinketOffer("tarnishedMedallion", 21, 3, 5);
        }
        return createTrinketOffer("wornCharm", 21, 3, 5);
    }

    private static TradeOffer greaterTrinket() {
        Random randomGreaterTrinket = new Random();
        int greaterUpperbound = 4;
        int greaterTrinketInt = randomGreaterTrinket.nextInt(greaterUpperbound);

        if (greaterTrinketInt == 0) {
            return createTrinketOffer("greaterBand", 63,  1, 30);
        }
        if (greaterTrinketInt == 1) {
            return createTrinketOffer("bloodyClaw", 63,  1, 30);
        }
        if (greaterTrinketInt == 2) {
            return createTrinketOffer("goldenMedallion", 63,  1, 30);
        }
        return createTrinketOffer("luckyCharm", 63,  1, 30);
    }

    private static TradeOffer hatTrinket() {
        Random randomhatTrinket = new Random();
        int hatUpperbound = 5;
        int hatTrinketInt = randomhatTrinket.nextInt(hatUpperbound);

        if (hatTrinketInt == 0) {
            return createTrinketOffer("shades", 19, 3, 10);
        }
        if (hatTrinketInt == 1) {
            return createTrinketOffer("ironCrown", 19, 3, 10);
        }
        if (hatTrinketInt == 2) {
            return createTrinketOffer("catEars", 19, 3, 10);
        }
        if (hatTrinketInt == 3) {
            return createTrinketOffer("cowEars", 19, 3, 10);
        }
        return createTrinketOffer("bunnyEars", 19, 3, 10);
    }

    private static TradeOffer trims() {
        Random randomTrim = new Random();
        int trimUpperbound = 16;
        int trimInt = randomTrim.nextInt(trimUpperbound);

        if (trimInt == 0) {
            return new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.COAST_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    9, 30, 0f);
        }
        if (trimInt == 1) {
            return new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    9, 30, 0f);
        }
        if (trimInt == 2) {
            return new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.EYE_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    9, 30, 0f);
        }
        if (trimInt == 3) {
            return new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.HOST_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    9, 30, 0f);
        }
        if (trimInt == 4) {
            return new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    9, 30, 0f);
        }
        if (trimInt == 5) {
            return new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.RIB_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    9, 30, 0f);
        }
        if (trimInt == 6) {
            return new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    9, 30, 0f);
        }
        if (trimInt == 7) {
            return new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    9, 30, 0f);
        }
        if (trimInt == 8) {
            return new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    9, 30, 0f);
        }
        if (trimInt == 9) {
            return new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    9, 30, 0f);
        }
        if (trimInt == 10) {
            return new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    9, 30, 0f);
        }
        if (trimInt == 11) {
            return new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    9, 30, 0f);
        }
        if (trimInt == 12) {
            return new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.VEX_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    9, 30, 0f);
        }
        if (trimInt == 13) {
            return new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.WARD_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    9, 30, 0f);
        }
        if (trimInt == 14) {
            return new TradeOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                    9, 30, 0f);
        }
        return new TradeOffer(
                new ItemStack(Items.EMERALD, 16),
                new ItemStack(Items.WILD_ARMOR_TRIM_SMITHING_TEMPLATE, 1),
                9, 30, 0f);
    }

    private static TradeOffer strongbox() {
        Random randomStrongbox = new Random();
        int strongboxUpperbound = 2;
        int strongboxInt = randomStrongbox.nextInt(strongboxUpperbound);

        if (strongboxInt == 0) {
            return new TradeOffer(
                    new ItemStack(Items.EMERALD, 35),
                    new ItemStack(RebornBlocks.STRONGBOX, 1),
                    5, 30, 0f);
        }
        return new TradeOffer(
                new ItemStack(Items.EMERALD, 59),
                new ItemStack(RebornBlocks.PRISTINE_STRONGBOX, 1),
                3, 30, 0f);
    }

}