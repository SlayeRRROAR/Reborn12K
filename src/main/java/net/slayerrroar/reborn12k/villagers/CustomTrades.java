package net.slayerrroar.reborn12k.villagers;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.AdvancedItems;
import net.slayerrroar.reborn12k.items.BaseItems;
import net.slayerrroar.reborn12k.tools.Tools;

public class CustomTrades {

    public static void register() {

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 3,                                      //Cleric - Manatite
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(BaseItems.MANATITE, 1),
                        new ItemStack(Items.EMERALD, 3),
                        16, 20, 0.08f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 4,                                      //Cleric - Manaweave
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 7),
                        new ItemStack(AdvancedItems.MANAWEAVE, 1),
                        12, 30, 0.12f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 5,                                      //Cleric - Refined Manatite
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 22),
                        new ItemStack(AdvancedItems.REFINED_MANATITE, 1),
                        3, 30, 0.2f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 5,                                      //Farmer - Golden Apple
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 26),
                        new ItemStack(Items.GOLDEN_APPLE, 1),
                        3, 30, 0.2f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 5,                                      //Farmer - Golden Banana
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 26),
                        new ItemStack(BaseItems.GOLDEN_BANANA, 1),
                        3, 30, 0.2f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,                                 //Weaponsmith - Chrome Dust
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(BaseItems.CHROME_DUST, 6),
                        new ItemStack(Items.EMERALD, 1),
                        16, 2, 0.08f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 3,                                 //Weaponsmith - E115
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(BaseItems.ELEMENT_115, 1),
                        new ItemStack(Items.EMERALD, 5),
                        16, 20, 0.12f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 3,                                 //Weaponsmith - Carbon Steel
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(BaseItems.CARBON_STEEL_INGOT, 1),
                        new ItemStack(Items.EMERALD, 2),
                        16, 20, 0.12f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 5,                                 //Weaponsmith - Cutter 237
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 64),
                        new ItemStack(Tools.MURASAMA, 1),
                        3, 30, 0.2f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,                                   //Toolsmith - Chrome Dust
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(BaseItems.CHROME_DUST, 6),
                        new ItemStack(Items.EMERALD, 1),
                        16, 2, 0.08f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2,                                   //Toolsmith - Bronze Ingot
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(BaseItems.BRONZE_INGOT, 4),
                        new ItemStack(Items.EMERALD, 1),
                        16, 2, 0.08f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 5,                                   //Toolsmith - Netherite Scrap
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 52),
                        new ItemStack(Items.NETHERITE_SCRAP, 1),
                        3, 30, 0.2f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,                                     //Armorer - Chrome Dust
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(BaseItems.CHROME_DUST, 6),
                        new ItemStack(Items.EMERALD, 1),
                        16, 2, 0.08f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2,                                     //Armorer - Bronze Ingot
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(BaseItems.BRONZE_INGOT, 4),
                        new ItemStack(Items.EMERALD, 1),
                        12, 10, 0.08f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1,                                       //Mason - Coal
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(Items.COAL, 6),
                        16, 1, 0.05f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5,                                       //Mason - Cobblestone
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.COBBLESTONE, 64),
                        new ItemStack(Items.EMERALD, 1),
                        16, 30, 0.05f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5,                                       //Mason - Cobbled Deepslate
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.COBBLED_DEEPSLATE, 64),
                        new ItemStack(Items.EMERALD, 1),
                        16, 30, 0.05f)));



        TradeOfferHelper.registerVillagerOffers(CustomVillagers.DEALER,1,                                          //Dealer - L1
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.LEATHER, 6),
                            new ItemStack(Items.EMERALD, 1),
                            12,1,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BONE, 8),
                            new ItemStack(Items.EMERALD, 1),
                            12,1,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ROTTEN_FLESH, 32),
                            new ItemStack(Items.EMERALD, 1),
                            16,2,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SPIDER_EYE, 4),
                            new ItemStack(Items.EMERALD, 1),
                            12,1,0.12f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.DEALER,2,                                          //Dealer - L2
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GUNPOWDER, 16),
                            new ItemStack(Items.EMERALD, 1),
                            16,5,0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ENDER_PEARL, 1),
                            new ItemStack(Items.EMERALD, 3),
                            12,5,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PHANTOM_MEMBRANE, 3),
                            new ItemStack(Items.EMERALD, 1),
                            12,5,0.12f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SLIME_BALL, 8),
                            new ItemStack(Items.EMERALD, 1),
                            12,5,0.12f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.DEALER,3,                                          //Dealer - L3
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BLAZE_ROD, 3),
                            new ItemStack(Items.EMERALD, 1),
                            16,10,0.15f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GLOW_INK_SAC, 7),
                            new ItemStack(Items.EMERALD, 1),
                            12,10,0.12f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 9),
                            new ItemStack(Items.GHAST_TEAR, 1),
                            12,20,0.12f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.DEALER,4,                                          //Dealer - L4
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.MAGMA_CREAM, 3),
                            new ItemStack(Items.EMERALD, 1),
                            12,15,0.12f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 29),
                            new ItemStack(Items.DRAGON_BREATH, 1),
                            12,30,0.12f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(Items.WITHER_SKELETON_SKULL, 1),
                            9,30,0.2f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.DEALER,5,                                          //Dealer - L5
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHER_STAR, 1),
                            new ItemStack(Items.TOTEM_OF_UNDYING, 1),
                            8,30,0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(Tools.BLADEWOLF, 1),
                            3,30,0.2f));
                });


        TradeOfferHelper.registerVillagerOffers(CustomVillagers.BLACKSMITH,1,                                      //Blacksmith - L1
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.REDSTONE, 16),
                            new ItemStack(Items.EMERALD, 1),
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

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.BLACKSMITH,2,                                      //Blacksmith - L2
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
                            new ItemStack(BaseItems.CARBON_STEEL_INGOT, 1),
                            12,10,0.12f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 7),
                            new ItemStack(BaseItems.ELEMENT_115, 1),
                            12,20,0.12f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.BLACKSMITH,4,                                      //Blacksmith - L4
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(BaseItems.BLAZING_STEEL_INGOT, 1),
                            new ItemStack(Items.EMERALD, 12),
                            12,30,0.2f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(BaseItems.COBALT, 1),
                            16,15,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(BaseItems.MANATITE, 1),
                            12,15,0.2f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.BLACKSMITH,5,                                      //Blacksmith - L5
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(Items.NETHERITE_SCRAP, 1),
                            12,30,0.12f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(Tools.POWER_SWORD, 1),
                            3, 30, 0.2f));
                });


        Reborn12K.LOGGER.info("Registering Trade Offers for " + Reborn12K.MOD_ID);

    }

}
