package net.slayerrroar.reborn12k.util;

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

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 5,                                     //Butcher - Bladewolf
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 64),
                        new ItemStack(Tools.BLADEWOLF, 1),
                        3, 30, 0.2f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 5,                                   //Librarian - Power Sword
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 64),
                        new ItemStack(Tools.POWER_SWORD, 1),
                        3, 30, 0.2f)));


        Reborn12K.LOGGER.info("Registering Trade Offers for " + Reborn12K.MOD_ID);

    }

}
