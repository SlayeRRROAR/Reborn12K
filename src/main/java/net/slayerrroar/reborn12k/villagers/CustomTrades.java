package net.slayerrroar.reborn12k.villagers;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.slayerrroar.reborn12k.items.MagicItems;
import net.slayerrroar.reborn12k.items.BaseItems;
import net.slayerrroar.reborn12k.tools.Tools;

public class CustomTrades {

    public static void register() {

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.JEWELER, 1,                                        //Jeweler
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 3),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(BaseItems.SILVER_INGOT, 2),
                            16, 1, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.JEWELER, 2,
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

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.JEWELER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(BaseItems.OPAL, 1),
                            12, 10, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(BaseItems.RUBY, 1),
                            12, 10, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(BaseItems.OPAL, 1),
                            12, 10, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 7),
                            new ItemStack(BaseItems.MANATITE, 1),
                            12, 10, 0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.JEWELER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 41),
                            new ItemStack(MagicItems.REFINED_MANATITE, 1),
                            3, 15, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ECHO_SHARD, 1),
                            new ItemStack(Items.EMERALD, 11),
                            8, 30, 0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.JEWELER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(BaseItems.DEMONIC_METAL_INGOT, 1),
                            3, 30, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 17),
                            new ItemStack(MagicItems.MANAWEAVE, 1),
                            8, 30, 0.08f));
                });


        TradeOfferHelper.registerVillagerOffers(CustomVillagers.BLACKSMITH, 1,                                     //Blacksmith
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
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(BaseItems.ELECTRUM_INGOT, 1),
                            12, 1, 0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.BLACKSMITH, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 3),
                            new ItemStack(Items.EMERALD, 1),
                            12, 10, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(BaseItems.TIN_INGOT, 7),
                            new ItemStack(Items.EMERALD, 1),
                            12, 10, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(BaseItems.TITANIUM_INGOT, 1),
                            new ItemStack(Items.EMERALD, 1),
                            12, 10, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(BaseItems.CHROME_DUST, 3),
                            12, 5, 0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.BLACKSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(BaseItems.TUNGSTENSTEEL_INGOT, 1),
                            new ItemStack(Items.EMERALD, 5),
                            12, 10, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(BaseItems.ALUMINUM_INGOT, 3),
                            new ItemStack(Items.EMERALD, 1),
                            12, 10, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.QUARTZ, 12),
                            new ItemStack(BaseItems.TITANIUM_INGOT, 1),
                            8, 20, 0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.BLACKSMITH, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(BaseItems.COBALT_INGOT, 1),
                            new ItemStack(Items.EMERALD, 5),
                            8, 15, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(BaseItems.IRIDIUM_INGOT, 1),
                            new ItemStack(Items.EMERALD, 6),
                            8, 15, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DRAGON_EGG, 1),
                            new ItemStack(Items.EMERALD, 36),
                            3, 30, 0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(CustomVillagers.BLACKSMITH, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(Tools.MURASAMA, 1),
                            3, 30, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 38),
                            new ItemStack(Items.SHULKER_SHELL, 1),
                            3, 30, 0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 55),
                            new ItemStack(Items.NETHERITE_SCRAP, 1),
                            3, 30, 0.08f));
                });

    }
}
