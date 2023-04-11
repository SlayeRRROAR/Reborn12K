package net.slayerrroar.reborn12k.villagers;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.GenericBlocks;
import net.slayerrroar.reborn12k.items.ItemGenerics;
import net.slayerrroar.reborn12k.items.ItemTrinkets;

import java.util.Random;

public class RebornCustomTrades {

    public static void register() {     //todo: Finish adding trade offers

        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Trade Offers");

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 1, //Jeweler L1
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 3),
                            new ItemStack(Items.EMERALD, 1),
                            12, 1, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ItemGenerics.SILVER_INGOT, 2),
                            16, 2, 0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 2, //Jeweler L2
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ItemGenerics.RUBY, 5),
                            9, 10, 0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ItemGenerics.SAPPHIRE, 1),
                            9, 10, 0.03f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 3, //Jeweler L3
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(Items.DIAMOND, 1),
                            9, 20, 0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 9),
                            new ItemStack(ItemGenerics.MANATITE, 1),
                            12, 20, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 4, //Jeweler L4
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 41),
                            new ItemStack(ItemGenerics.PLATINUM_INGOT, 1),
                            9, 30, 0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 35),
                            new ItemStack(ItemGenerics.COBALT_INGOT, 1),
                            9, 30, 0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 41),
                            new ItemStack(ItemGenerics.PLATINUM_INGOT, 1),
                            9, 30, 0f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 35),
                            new ItemStack(ItemGenerics.COBALT_INGOT, 1),
                            9, 30, 0f));
                });

        TradeOfferHelper.registerVillagerOffers(RebornVillagers.JEWELER, 5, //Jeweler L5
                factories -> {
                    factories.add((entity, random) -> jewelerLight5());
                    factories.add((entity, random) -> jewelerShadow5());
                });


        TradeOfferHelper.registerVillagerOffers(RebornVillagers.BLACKSMITH, 1,  //Blacksmith
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
                            new ItemStack(ItemGenerics.TIN_INGOT, 7),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.08f));
                });


        TradeOfferHelper.registerVillagerOffers(RebornVillagers.MANASMITH, 1,   //Manasmith
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(ItemGenerics.SAPPHIRE, 1),
                            12, 1, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(GenericBlocks.ASH_LOG, 16),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.03f));
                });


        TradeOfferHelper.registerVillagerOffers(RebornVillagers.HOARDER, 1,   //Hmble
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

    }

    private static TradeOffer jewelerLight5() {

        TradeOffer band = new TradeOffer(
                new ItemStack(ItemTrinkets.ANGEL_TEAR, 1),
                new ItemStack(ItemTrinkets.GREATER_BAND_OF_FORTITUDE, 1),
                1, 30, 0f);
        TradeOffer claw = new TradeOffer(
                new ItemStack(ItemTrinkets.ANGEL_TEAR, 1),
                new ItemStack(ItemTrinkets.GREATER_BLOODY_CLAW, 1),
                1, 30, 0f);
        TradeOffer medallion = new TradeOffer(
                new ItemStack(ItemTrinkets.ANGEL_TEAR, 1),
                new ItemStack(ItemTrinkets.GREATER_WAR_MEDALLION, 1),
                1, 30, 0f);
        TradeOffer tonic = new TradeOffer(
                new ItemStack(ItemTrinkets.ANGEL_TEAR, 1),
                new ItemStack(ItemTrinkets.GREATER_FRENZY_TONIC, 1),
                1, 30, 0f);

        Random rand = new Random();
        int upperbound = 4;
        int int_random = rand.nextInt(upperbound);

        if(int_random == 0) {
            return band;
        }
        if(int_random == 1) {
            return claw;
        }
        if(int_random == 2) {
            return medallion;
        }
        return tonic;

    }
    private static TradeOffer jewelerShadow5() {

        TradeOffer band = new TradeOffer(
                new ItemStack(ItemTrinkets.BASILISK_TOOTH, 1),
                new ItemStack(ItemTrinkets.GREATER_BAND_OF_FORTITUDE, 1),
                1, 30, 0f);
        TradeOffer claw = new TradeOffer(
                new ItemStack(ItemTrinkets.BASILISK_TOOTH, 1),
                new ItemStack(ItemTrinkets.GREATER_BLOODY_CLAW, 1),
                1, 30, 0f);
        TradeOffer medallion = new TradeOffer(
                new ItemStack(ItemTrinkets.BASILISK_TOOTH, 1),
                new ItemStack(ItemTrinkets.GREATER_WAR_MEDALLION, 1),
                1, 30, 0f);
        TradeOffer tonic = new TradeOffer(
                new ItemStack(ItemTrinkets.BASILISK_TOOTH, 1),
                new ItemStack(ItemTrinkets.GREATER_FRENZY_TONIC, 1),
                1, 30, 0f);

        Random rand = new Random();
        int upperbound = 4;
        int int_random = rand.nextInt(upperbound);

        if(int_random == 0) {
            return band;
        }
        if(int_random == 1) {
            return claw;
        }
        if(int_random == 2) {
            return medallion;
        }
        return tonic;

    }

}
