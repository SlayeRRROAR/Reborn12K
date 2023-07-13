package net.slayerrroar.reborn12k.villagers;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.block.AbstractBannerBlock;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;
import net.slayerrroar.reborn12k.blocks.GenericBlocks;
import net.slayerrroar.reborn12k.items.GenericItems;
import net.slayerrroar.reborn12k.items.MagicItems;
import net.slayerrroar.reborn12k.items.TrinketItems;

import java.awt.*;
import java.util.Random;

public class RebornTrades {

    public static void register() {     //todo: Finish adding trade createTrinketOffer

        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Trade Offers");

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 1, //Jeweler L1
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 3),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(GenericItems.SILVER_INGOT, 2),
                            16, 1, 0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 2, //Jeweler L2
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(GenericItems.RUBY, 1),
                            9, 5, 0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(GenericItems.SAPPHIRE, 1),
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
                            new ItemStack(GenericItems.MANATITE, 1),
                            12, 10, 0.03f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 4, //Jeweler L4
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.AMETHYST_SHARD, 16),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0f));
                    factories.add(((entity, random) -> trims()));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 5, //Jeweler L5
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 33),
                            new ItemStack(TrinketItems.IRON_NECKLACE, 1),
                            3, 30, 0f));
                    factories.add((entity, random) -> greaterTrinket());
                });


        TradeOfferHelper.registerVillagerOffers(RebornVillagers.BLACKSMITH, 1,  //Blacksmith L1
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COPPER_INGOT, 8),
                            new ItemStack(Items.EMERALD, 1),
                            12, 1, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(GenericItems.TIN_INGOT, 7),
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
                            new ItemStack(Items.EMERALD, 37),
                            new ItemStack(GenericItems.UNIVERSAL_SMITHING_TEMPLATE, 5),
                            3, 20, 0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(GenericItems.TITANIUM_INGOT, 3),
                            new ItemStack(Items.EMERALD, 1),
                            12, 20, 0.03f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.BLACKSMITH, 4,  //Blacksmith L4
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(GenericItems.VANADIUM_INGOT, 2),
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
                            new ItemStack(MagicItems.BLANK_RUNE, 1),
                            12, 1, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(GenericBlocks.ASH_LOG, 16),
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
                            new ItemStack(MagicItems.RUNE_OF_ORDER, 1),
                            new ItemStack(MagicItems.SOUL_VESSEL, 4),
                            9, 20, 0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.QUARTZ, 12),
                            16, 10, 0f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.MANASMITH, 4,   //Manasmith L4
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(MagicItems.MANA_SPARK, 1),
                            16, 15, 0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(MagicItems.MANAWEAVE, 1),
                            12, 15, 0f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.MANASMITH, 5,   //Manasmith L5
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DRAGON_EGG, 1),
                            new ItemStack(Items.EMERALD, 21),
                            3, 30, 0f));
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
                            new ItemStack(GenericItems.LEAD_INGOT, 6),
                            new ItemStack(Items.EMERALD, 1),
                            12, 20, 0.03f));
                });


        TradeOfferHelper.registerVillagerOffers(RebornVillagers.HOARDER, 4,   //Hoarder L4
                factories -> {
                    factories.add((entity, random) -> indelibleTrinket());
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Blocks.GLASS, 2),
                            12, 15, 0.3f));
                });


        TradeOfferHelper.registerVillagerOffers(RebornVillagers.HOARDER, 5,   //Hoarder L5
                factories -> {
                    factories.add((entity, random) -> strongbox());
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(GenericItems.HEART_OF_DARKNESS, 1),
                            new ItemStack(Items.EMERALD, 44),
                            5, 30, 0f));
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
            case "antigrav_belt" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.ANTIGRAV_BELT, 1),
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
            case "indelibleBand" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.INDELIBLE_BAND_OF_FORTITUDE, 1),
                    maxUses, merchantExperience, 0f);
            case "greaterBand" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.GREATER_BAND_OF_FORTITUDE, 1),
                    maxUses, merchantExperience, 0f);
            case "baseBloodyClaw" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.BLOODY_CLAW, 1),
                    maxUses, merchantExperience, 0f);
            case "indelibleBloodyClaw" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.INDELIBLE_BLOODY_CLAW, 1),
                    maxUses, merchantExperience, 0f);
            case "greaterBloodyClaw" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.GREATER_BLOODY_CLAW, 1),
                    maxUses, merchantExperience, 0f);
            case "baseMedallion" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.MEDALLION, 1),
                    maxUses, merchantExperience, 0f);
            case "indelibleMedallion" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.INDELIBLE_MEDALLION, 1),
                    maxUses, merchantExperience, 0f);
            case "greaterMedallion" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.GREATER_MEDALLION, 1),
                    maxUses, merchantExperience, 0f);
            case "baseTonic" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.FRENZY_TONIC, 1),
                    maxUses, merchantExperience, 0f);
            case "indelibleTonic" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.INDELIBLE_FRENZY_TONIC, 1),
                    maxUses, merchantExperience, 0f);
            case "greaterTonic" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.GREATER_FRENZY_TONIC, 1),
                    maxUses, merchantExperience, 0f);
            case "baseCharm" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.LUCKY_CHARM, 1),
                    maxUses, merchantExperience, 0f);
            case "indelibleCharm" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.INDELIBLE_LUCKY_CHARM, 1),
                    maxUses, merchantExperience, 0f);
            case "greaterCharm" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.GREATER_LUCKY_CHARM, 1),
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
            case "enchantedSpring" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.ENCHANTED_SPRING, 1),
                    maxUses, merchantExperience, 0f);
            case "bloodyRose" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.BLOODY_ROSE, 1),
                    maxUses, merchantExperience, 0f);
            case "endlessQuiver" -> new TradeOffer(
                    new ItemStack(Items.EMERALD, giveEmeralds),
                    new ItemStack(TrinketItems.ENDLESS_QUIVER, 1),
                    maxUses, merchantExperience, 0f);
            default -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(Items.EMERALD, 1),
                    1, 0, 0f);
        };

    }

    private static TradeOffer baseTrinket() {
        Random randomBaseTrinket = new Random();
        int baseUpperbound = 5;
        int baseTrinketInt = randomBaseTrinket.nextInt(baseUpperbound);

        if (baseTrinketInt == 0) {
            return createTrinketOffer("baseBand", 21, 3, 5);
        }
        if (baseTrinketInt == 1) {
            return createTrinketOffer("baseBloodyClaw", 21, 3, 5);
        }
        if (baseTrinketInt == 2) {
            return createTrinketOffer("baseMedallion", 21, 3, 5);
        }
        if (baseTrinketInt == 3) {
            return createTrinketOffer("baseTonic", 21, 3, 5);
        }
        return createTrinketOffer("baseCharm", 21, 3, 5);
    }

    private static TradeOffer indelibleTrinket() {
        Random randomIndelibleTrinket = new Random();
        int indelibleUpperbound = 5;
        int indelibleTrinketInt = randomIndelibleTrinket.nextInt(indelibleUpperbound);

        if (indelibleTrinketInt == 0) {
            return createTrinketOffer("indelibleBand", 41,  1, 15);
        }
        if (indelibleTrinketInt == 1) {
            return createTrinketOffer("indelibleBloodyClaw", 41,  1, 15);
        }
        if (indelibleTrinketInt == 2) {
            return createTrinketOffer("indelibleMedallion", 41,  1, 15);
        }
        if (indelibleTrinketInt == 3) {
            return createTrinketOffer("indelibleTonic", 41,  1, 15);
        }
        return createTrinketOffer("indelibleCharm", 41,  1, 15);
    }

    private static TradeOffer greaterTrinket() {
        Random randomGreaterTrinket = new Random();
        int greaterUpperbound = 16;
        int greaterTrinketInt = randomGreaterTrinket.nextInt(greaterUpperbound);

        if (greaterTrinketInt == 0) {
            return createTrinketOffer("greaterBand", 63,  1, 30);
        }
        if (greaterTrinketInt == 1) {
            return createTrinketOffer("greaterBloodyClaw", 63,  1, 30);
        }
        if (greaterTrinketInt == 2) {
            return createTrinketOffer("greaterMedallion", 63,  1, 30);
        }
        if (greaterTrinketInt == 3) {
            return createTrinketOffer("greaterTonic", 63,  1, 30);
        }
        return createTrinketOffer("greaterCharm", 63,  1, 30);
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
                    new ItemStack(AdvancedBlocks.STRONGBOX, 1),
                    3, 30, 0f);
        }
        return new TradeOffer(
                new ItemStack(Items.EMERALD, 59),
                new ItemStack(AdvancedBlocks.PRISTINE_STRONGBOX, 1),
                1, 30, 0f);
    }

}
