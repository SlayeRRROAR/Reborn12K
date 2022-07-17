package net.slayerrroar.reborn12k.villagers;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.BaseItems;
import net.slayerrroar.reborn12k.tools.Tools;

public class CustomTrades {

    public static void register() {

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.BLACKSMITH,1,                                      //Blacksmith - L1
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_INGOT, 7),
                            new ItemStack(BaseItems.CHROME_DUST, 1),
                            16,1,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COPPER_INGOT, 9),
                            new ItemStack(Items.EMERALD, 1),
                            12,1,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.QUARTZ, 12),
                            new ItemStack(Items.EMERALD, 1),
                            16,1,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(BaseItems.CHROME_DUST, 4),
                            12,2,0.12f));
                });

        TradeOfferHelper.registerVillagerOffers(net.slayerrroar.reborn12k.villagers.CustomVillagers.BLACKSMITH,2,                                      //Blacksmith - L2
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 3),
                            new ItemStack(Items.EMERALD, 1),
                            16,5,0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(BaseItems.BRONZE_INGOT, 6),
                            new ItemStack(Items.EMERALD, 1),
                            12,5,0.12f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(BaseItems.SILVER_INGOT, 2),
                            12,10,0.12f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.BLACKSMITH,3,                                      //Blacksmith - L3
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.DIAMOND, 1),
                            16,20,0.15f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(BaseItems.STEEL_INGOT, 1),
                            12,10,0.12f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.BLACKSMITH,4,                                      //Blacksmith - L4
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(BaseItems.BLAZING_STEEL_INGOT, 1),
                            new ItemStack(Items.EMERALD, 12),
                            12,30,0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(BaseItems.COBALT_INGOT, 1),
                            16,15,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(BaseItems.ALUMINUM_INGOT, 1),
                            12,15,0.2f));
                });

        TradeOfferHelper.registerVillagerOffers(net.slayerrroar.reborn12k.villagers.CustomVillagers.BLACKSMITH,5,                                      //Blacksmith - L5
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 24),
                            new ItemStack(Items.NETHERITE_SCRAP, 1),
                            12,30,0.12f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(Tools.SIGNALUM_HOE, 1),
                            3, 30, 0.2f));
                });


        Reborn12K.LOGGER.info("Registering Trade Offers for " + Reborn12K.MOD_ID);

    }

}
