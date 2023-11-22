package net.slayerrroar.reborn12k.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;

@SuppressWarnings("unused")

public class RebornTagsUtil {
    public static class Blocks {

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registries.BLOCK.getKey(), new Identifier("c", name));
        }

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registries.BLOCK.getKey(), new Identifier(Reborn12K.MOD_ID, name));
        }

        public static final TagKey<Block> PAXEL_MINEABLES = createTag("paxel_mineables");

        public static final TagKey<Block> GLASS = createCommonTag("glass");

        public static final TagKey<Block> COAL_ORES = createCommonTag("coal_ores");
        public static final TagKey<Block> COAL_BLOCKS = createCommonTag("coal_ores");

        public static final TagKey<Block> COPPER_ORES = createCommonTag("copper_ores");
        public static final TagKey<Block> RAW_COPPER_BLOCKS = createCommonTag("raw_copper_blocks");
        public static final TagKey<Block> COPPER_BLOCKS = createCommonTag("copper_blocks");

        public static final TagKey<Block> IRON_ORES = createCommonTag("iron_ores");
        public static final TagKey<Block> RAW_IRON_BLOCKS = createCommonTag("raw_iron_blocks");
        public static final TagKey<Block> IRON_BLOCKS = createCommonTag("iron_blocks");

        public static final TagKey<Block> GOLD_ORES = createCommonTag("gold_ores");
        public static final TagKey<Block> RAW_GOLD_BLOCKS = createCommonTag("raw_gold_blocks");
        public static final TagKey<Block> GOLD_BLOCKS = createCommonTag("gold_blocks");

        public static final TagKey<Block> LAPIS_ORES = createCommonTag("lapis_ores");
        public static final TagKey<Block> LAPIS_BLOCKS = createCommonTag("lapis_blocks");

        public static final TagKey<Block> DIAMOND_ORES = createCommonTag("diamond_ores");
        public static final TagKey<Block> DIAMOND_BLOCKS = createCommonTag("diamond_blocks");

        public static final TagKey<Block> EMERALD_ORES = createCommonTag("emerald_ores");
        public static final TagKey<Block> EMERALD_BLOCKS = createCommonTag("emerald_blocks");

        public static final TagKey<Block> AMETHYST_BLOCKS = createCommonTag("amethyst_blocks");

        public static final TagKey<Block> QUARTZ_ORES = createCommonTag("quartz_ores");
        public static final TagKey<Block> QUARTZ_BLOCKS = createCommonTag("quartz_blocks");

        public static final TagKey<Block> NETHERITE_ORES = createCommonTag("netherite_ores");
        public static final TagKey<Block> NETHERITE_BLOCKS = createCommonTag("netherite_blocks");

        public static final TagKey<Block> TIN_ORES = createCommonTag("tin_ores");
        public static final TagKey<Block> RAW_TIN_BLOCKS = createCommonTag("raw_tin_blocks");
        public static final TagKey<Block> TIN_BLOCKS = createCommonTag("tin_blocks");

        public static final TagKey<Block> ALUMINUM_ORES = createCommonTag("aluminum_ores");
        public static final TagKey<Block> RAW_ALUMINUM_BLOCKS = createCommonTag("raw_aluminum_blocks");
        public static final TagKey<Block> ALUMINUM_BLOCKS = createCommonTag("aluminum_blocks");

        public static final TagKey<Block> SILVER_ORES = createCommonTag("silver_ores");
        public static final TagKey<Block> RAW_SILVER_BLOCKS = createCommonTag("raw_silver_blocks");
        public static final TagKey<Block> SILVER_BLOCKS = createCommonTag("silver_blocks");

        public static final TagKey<Block> LEAD_ORES = createCommonTag("lead_ores");
        public static final TagKey<Block> RAW_LEAD_BLOCKS = createCommonTag("raw_lead_blocks");
        public static final TagKey<Block> LEAD_BLOCKS = createCommonTag("lead_blocks");

        public static final TagKey<Block> NICKEL_ORES = createCommonTag("nickel_ores");
        public static final TagKey<Block> RAW_NICKEL_BLOCKS = createCommonTag("raw_nickel_blocks");
        public static final TagKey<Block> NICKEL_BLOCKS = createCommonTag("nickel_blocks");

        public static final TagKey<Block> CHROME_ORES = createCommonTag("chrome_ores");
        public static final TagKey<Block> RAW_CHROME_BLOCKS = createCommonTag("raw_chrome_blocks");
        public static final TagKey<Block> CHROME_BLOCKS = createCommonTag("chrome_blocks");

        public static final TagKey<Block> TITANIUM_ORES = createCommonTag("titanium_ores");
        public static final TagKey<Block> RAW_TITANIUM_BLOCKS = createCommonTag("raw_titanium_blocks");
        public static final TagKey<Block> TITANIUM_BLOCKS = createCommonTag("titanium_blocks");


        public static final TagKey<Block> TUNGSTEN_ORES = createCommonTag("tungsten_ores");
        public static final TagKey<Block> RAW_TUNGSTEN_BLOCKS = createCommonTag("raw_tungsten_blocks");
        public static final TagKey<Block> TUNGSTEN_BLOCKS = createCommonTag("tungsten_blocks");

        public static final TagKey<Block> VANADIUM_ORES = createCommonTag("vanadium_ores");
        public static final TagKey<Block> RAW_VANADIUM_BLOCKS = createCommonTag("raw_vanadium_blocks");
        public static final TagKey<Block> VANADIUM_BLOCKS = createCommonTag("vanadium_blocks");

        public static final TagKey<Block> NEODYMIUM_ORES = createCommonTag("neodymium_ores");
        public static final TagKey<Block> RAW_NEODYMIUM_BLOCKS = createCommonTag("raw_neodymium_blocks");
        public static final TagKey<Block> NEODYMIUM_BLOCKS = createCommonTag("neodymium_blocks");

        public static final TagKey<Block> URANIUM_ORES = createCommonTag("uranium_ores");
        public static final TagKey<Block> RAW_URANIUM_BLOCKS = createCommonTag("raw_uranium_blocks");
        public static final TagKey<Block> URANIUM_BLOCKS = createCommonTag("uranium_blocks");


        public static final TagKey<Block> COBALT_ORES = createCommonTag("cobalt_ores");
        public static final TagKey<Block> RAW_COBALT_BLOCKS = createCommonTag("raw_cobalt_blocks");
        public static final TagKey<Block> COBALT_BLOCKS = createCommonTag("cobalt_blocks");

        public static final TagKey<Block> OSMIUM_ORES = createCommonTag("osmium_ores");
        public static final TagKey<Block> RAW_OSMIUM_BLOCKS = createCommonTag("raw_osmium_blocks");
        public static final TagKey<Block> OSMIUM_BLOCKS = createCommonTag("osmium_blocks");

        public static final TagKey<Block> PLATINUM_ORES = createCommonTag("platinum_ores");
        public static final TagKey<Block> RAW_PLATINUM_BLOCKS = createCommonTag("raw_platinum_blocks");
        public static final TagKey<Block> PLATINUM_BLOCKS = createCommonTag("platinum_blocks");

        public static final TagKey<Block> IRIDIUM_ORES = createCommonTag("iridium_ores");
        public static final TagKey<Block> RAW_IRIDIUM_BLOCKS = createCommonTag("raw_iridium_blocks");
        public static final TagKey<Block> IRIDIUM_BLOCKS = createCommonTag("iridium_blocks");


        public static final TagKey<Block> RAW_ARCHEOSITE_BLOCKS = createCommonTag("raw_archeosite_blocks");
        public static final TagKey<Block> ARCHEOSITE_BLOCKS = createCommonTag("archeosite_blocks");

        public static final TagKey<Block> RAW_BRONZE_BLOCKS = createCommonTag("raw_bronze_blocks");
        public static final TagKey<Block> BRONZE_BLOCKS = createCommonTag("bronze_blocks");

        public static final TagKey<Block> RAW_CONSTANTAN_BLOCKS = createCommonTag("raw_constantan_blocks");
        public static final TagKey<Block> CONSTANTAN_BLOCKS = createCommonTag("constantan_blocks");

        public static final TagKey<Block> RAW_INVAR_BLOCKS = createCommonTag("raw_invar_blocks");
        public static final TagKey<Block> INVAR_BLOCKS = createCommonTag("invar_blocks");

        public static final TagKey<Block> RAW_STEEL_BLOCKS = createCommonTag("raw_steel_blocks");
        public static final TagKey<Block> STEEL_BLOCKS = createCommonTag("steel_blocks");

        public static final TagKey<Block> RAW_TUNGSTENSTEEL_BLOCKS = createCommonTag("raw_tungstensteel_blocks");
        public static final TagKey<Block> TUNGSTENSTEEL_BLOCKS = createCommonTag("tungstensteel_blocks");

        public static final TagKey<Block> RAW_THELOSITE_BLOCKS = createCommonTag("raw_thelosite_blocks");
        public static final TagKey<Block> THELOSITE_BLOCKS = createCommonTag("thelosite_blocks");

        public static final TagKey<Block> RAW_ADVANCED_ALLOY_BLOCKS = createCommonTag("raw_advanced_alloy_blocks");
        public static final TagKey<Block> ADVANCED_ALLOY_BLOCKS = createCommonTag("advanced_alloy_blocks");

        public static final TagKey<Block> RAW_IRIDIUM_ALLOY_BLOCKS = createCommonTag("raw_iridium_alloy_blocks");
        public static final TagKey<Block> IRIDIUM_ALLOY_BLOCKS = createCommonTag("iridium_alloy_blocks");

        public static final TagKey<Block> RAW_ELECTRUM_BLOCKS = createCommonTag("raw_electrum_blocks");
        public static final TagKey<Block> ELECTRUM_BLOCKS = createCommonTag("electrum_blocks");

        public static final TagKey<Block> RAW_SIGNALUM_BLOCKS = createCommonTag("raw_signalum_blocks");
        public static final TagKey<Block> SIGNALUM_BLOCKS = createCommonTag("signalum_blocks");

        public static final TagKey<Block> RAW_LUMIUM_BLOCKS = createCommonTag("raw_lumium_blocks");
        public static final TagKey<Block> LUMIUM_BLOCKS = createCommonTag("lumium_blocks");

        public static final TagKey<Block> RAW_ENDERIUM_BLOCKS = createCommonTag("raw_enderium_blocks");
        public static final TagKey<Block> ENDERIUM_BLOCKS = createCommonTag("enderium_blocks");

        public static final TagKey<Block> MAGISTEEL_BLOCKS = createCommonTag("magisteel_blocks");
        public static final TagKey<Block> ORICHALCUM_BLOCKS = createCommonTag("orichalcum_blocks");
        public static final TagKey<Block> MITHRIL_BLOCKS = createCommonTag("mithril_blocks");

        public static final TagKey<Block> EMETAL_BLOCKS = createCommonTag("emetal_blocks");
        public static final TagKey<Block> DARK_ALLOY_BLOCKS = createCommonTag("dark_alloy_blocks");


        public static final TagKey<Block> SAPPHIRE_ORES = createCommonTag("sapphire_ores");
        public static final TagKey<Block> SAPPHIRE_BLOCKS = createCommonTag("sapphire_blocks");

        public static final TagKey<Block> RUBY_ORES = createCommonTag("ruby_ores");
        public static final TagKey<Block> RUBY_BLOCKS = createCommonTag("ruby_blocks");

        public static final TagKey<Block> MANATITE_ORES = createCommonTag("manatite_ores");
        public static final TagKey<Block> MANATITE_BLOCKS = createCommonTag("manatite_blocks");


        public static final TagKey<Block> ASH_LOGS = createTag("ash_logs");
        public static final TagKey<Block> ASH_PLANKS = createTag("ash_planks");


    }

    public static class Items {


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registries.ITEM.getKey(), new Identifier(Reborn12K.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registries.ITEM.getKey(), new Identifier("c", name));
        }

        public static final TagKey<Item> GLASS = createCommonTag("glass");

        public static final TagKey<Item> ENDER_PEARL_DUSTS = createCommonTag("ender_pearl_dusts");

        public static final TagKey<Item> COAL_ORES = createCommonTag("coal_ores");
        public static final TagKey<Item> COAL_BLOCKS = createCommonTag("coal_blocks");
        public static final TagKey<Item> COAL_DUSTS = createCommonTag("coal_dusts");

        public static final TagKey<Item> COPPER_ORES = createCommonTag("copper_ores");
        public static final TagKey<Item> RAW_COPPER_ORES = createCommonTag("raw_gold_ores");
        public static final TagKey<Item> RAW_COPPER_BLOCKS = createCommonTag("raw_copper_blocks");
        public static final TagKey<Item> COPPER_DUSTS = createCommonTag("copper_dusts");
        public static final TagKey<Item> COPPER_INGOTS = createCommonTag("copper_ingots");
        public static final TagKey<Item> COPPER_BLOCKS = createCommonTag("copper_blocks");

        public static final TagKey<Item> IRON_ORES = createCommonTag("iron_ores");
        public static final TagKey<Item> RAW_IRON_ORES = createCommonTag("raw_gold_ores");
        public static final TagKey<Item> RAW_IRON_BLOCKS = createCommonTag("raw_iron_blocks");
        public static final TagKey<Item> IRON_DUSTS = createCommonTag("iron_dusts");
        public static final TagKey<Item> IRON_NUGGETS = createCommonTag("iron_nuggets");
        public static final TagKey<Item> IRON_INGOTS = createCommonTag("iron_ingots");
        public static final TagKey<Item> IRON_BLOCKS = createCommonTag("iron_blocks");

        public static final TagKey<Item> GOLD_ORES = createCommonTag("gold_ores");
        public static final TagKey<Item> RAW_GOLD_ORES = createCommonTag("raw_gold_ores");
        public static final TagKey<Item> RAW_GOLD_BLOCKS = createCommonTag("raw_gold_blocks");
        public static final TagKey<Item> GOLD_DUSTS = createCommonTag("gold_dusts");
        public static final TagKey<Item> GOLD_NUGGETS = createCommonTag("gold_nuggets");
        public static final TagKey<Item> GOLD_INGOTS = createCommonTag("gold_ingots");
        public static final TagKey<Item> GOLD_BLOCKS = createCommonTag("gold_blocks");

        public static final TagKey<Item> LAPIS_ORES = createCommonTag("lapis_ores");
        public static final TagKey<Item> LAPIS_DUSTS = createCommonTag("lapis_dusts");
        public static final TagKey<Item> LAPISES = createCommonTag("lapises");
        public static final TagKey<Item> LAPIS_BLOCKS = createCommonTag("lapis_blocks");

        public static final TagKey<Item> DIAMOND_ORES = createCommonTag("diamond_ores");
        public static final TagKey<Item> DIAMOND_DUSTS = createCommonTag("diamond_dusts");
        public static final TagKey<Item> DIAMONDS = createCommonTag("diamonds");
        public static final TagKey<Item> DIAMOND_BLOCKS = createCommonTag("diamond_blocks");

        public static final TagKey<Item> EMERALD_ORES = createCommonTag("emerald_ores");
        public static final TagKey<Item> EMERALD_DUSTS = createCommonTag("emerald_dusts");
        public static final TagKey<Item> EMERALDS = createCommonTag("emeralds");
        public static final TagKey<Item> EMERALD_BLOCKS = createCommonTag("emerald_blocks");

        public static final TagKey<Item> AMETHYST_BLOCKS = createCommonTag("amethyst_blocks");
        public static final TagKey<Item> AMETHYST_DUSTS = createCommonTag("amethyst_dusts");
        public static final TagKey<Item> AMETHYSTS = createCommonTag("amethysts");

        public static final TagKey<Item> QUARTZ_ORES = createCommonTag("quartz_ores");
        public static final TagKey<Item> QUARTZ_DUSTS = createCommonTag("quartz_dusts");
        public static final TagKey<Item> QUARTZES = createCommonTag("quartzes");
        public static final TagKey<Item> QUARTZ_BLOCKS = createCommonTag("quartz_blocks");

        public static final TagKey<Item> NETHERITE_ORES = createCommonTag("netherite_ores");
        public static final TagKey<Item> NETHERITE_DUSTS = createCommonTag("netherite_dusts");
        public static final TagKey<Item> NETHERITE_INGOTS = createCommonTag("netherite_ingots");
        public static final TagKey<Item> NETHERITE_BLOCKS = createCommonTag("netherite_blocks");

        public static final TagKey<Item> TIN_ORES = createCommonTag("tin_ores");
        public static final TagKey<Item> RAW_TIN_ORES = createCommonTag("raw_tin_ores");
        public static final TagKey<Item> RAW_TIN_BLOCKS = createCommonTag("raw_tin_blocks");
        public static final TagKey<Item> TIN_DUSTS = createCommonTag("tin_dusts");
        public static final TagKey<Item> TIN_INGOTS = createCommonTag("tin_ingots");
        public static final TagKey<Item> TIN_BLOCKS = createCommonTag("tin_blocks");

        public static final TagKey<Item> ALUMINUM_ORES = createCommonTag("aluminum_ores");
        public static final TagKey<Item> RAW_ALUMINUM_ORES = createCommonTag("raw_aluminum_ores");
        public static final TagKey<Item> RAW_ALUMINUM_BLOCKS = createCommonTag("raw_aluminum_blocks");
        public static final TagKey<Item> ALUMINUM_DUSTS = createCommonTag("aluminum_dusts");
        public static final TagKey<Item> ALUMINUM_INGOTS = createCommonTag("aluminum_ingots");
        public static final TagKey<Item> ALUMINUM_BLOCKS = createCommonTag("aluminum_blocks");

        public static final TagKey<Item> SILVER_ORES = createCommonTag("silver_ores");
        public static final TagKey<Item> RAW_SILVER_ORES = createCommonTag("raw_silver_ores");
        public static final TagKey<Item> RAW_SILVER_BLOCKS = createCommonTag("raw_silver_blocks");
        public static final TagKey<Item> SILVER_DUSTS = createCommonTag("silver_dusts");
        public static final TagKey<Item> SILVER_INGOTS = createCommonTag("silver_ingots");
        public static final TagKey<Item> SILVER_BLOCKS = createCommonTag("silver_blocks");

        public static final TagKey<Item> LEAD_ORES = createCommonTag("lead_ores");
        public static final TagKey<Item> RAW_LEAD_ORES = createCommonTag("raw_lead_ores");
        public static final TagKey<Item> RAW_LEAD_BLOCKS = createCommonTag("raw_lead_blocks");
        public static final TagKey<Item> LEAD_DUSTS = createCommonTag("lead_dusts");
        public static final TagKey<Item> LEAD_INGOTS = createCommonTag("lead_ingots");
        public static final TagKey<Item> LEAD_BLOCKS = createCommonTag("lead_blocks");

        public static final TagKey<Item> NICKEL_ORES = createCommonTag("nickel_ores");
        public static final TagKey<Item> RAW_NICKEL_ORES = createCommonTag("raw_nickel_ores");
        public static final TagKey<Item> RAW_NICKEL_BLOCKS = createCommonTag("raw_nickel_blocks");
        public static final TagKey<Item> NICKEL_DUSTS = createCommonTag("nickel_dusts");
        public static final TagKey<Item> NICKEL_INGOTS = createCommonTag("nickel_ingots");
        public static final TagKey<Item> NICKEL_BLOCKS = createCommonTag("nickel_blocks");

        public static final TagKey<Item> CHROME_ORES = createCommonTag("chrome_ores");
        public static final TagKey<Item> RAW_CHROME_ORES = createCommonTag("raw_chrome_ores");
        public static final TagKey<Item> RAW_CHROME_BLOCKS = createCommonTag("raw_chrome_blocks");
        public static final TagKey<Item> CHROME_DUSTS = createCommonTag("chrome_dusts");
        public static final TagKey<Item> CHROME_INGOTS = createCommonTag("chrome_ingots");
        public static final TagKey<Item> CHROME_BLOCKS = createCommonTag("chrome_blocks");

        public static final TagKey<Item> TITANIUM_ORES = createCommonTag("titanium_ores");
        public static final TagKey<Item> RAW_TITANIUM_ORES = createCommonTag("raw_titanium_ores");
        public static final TagKey<Item> RAW_TITANIUM_BLOCKS = createCommonTag("raw_titanium_blocks");
        public static final TagKey<Item> TITANIUM_DUSTS = createCommonTag("titanium_dusts");
        public static final TagKey<Item> TITANIUM_INGOTS = createCommonTag("titanium_ingots");
        public static final TagKey<Item> TITANIUM_BLOCKS = createCommonTag("titanium_blocks");


        public static final TagKey<Item> TUNGSTEN_ORES = createCommonTag("tungsten_ores");
        public static final TagKey<Item> RAW_TUNGSTEN_ORES = createCommonTag("raw_tungsten_ores");
        public static final TagKey<Item> RAW_TUNGSTEN_BLOCKS = createCommonTag("raw_tungsten_blocks");
        public static final TagKey<Item> TUNGSTEN_DUSTS = createCommonTag("tungsten_dusts");
        public static final TagKey<Item> TUNGSTEN_INGOTS = createCommonTag("tungsten_ingots");
        public static final TagKey<Item> TUNGSTEN_BLOCKS = createCommonTag("tungsten_blocks");

        public static final TagKey<Item> VANADIUM_ORES = createCommonTag("vanadium_ores");
        public static final TagKey<Item> RAW_VANADIUM_ORES = createCommonTag("raw_vanadium_ores");
        public static final TagKey<Item> RAW_VANADIUM_BLOCKS = createCommonTag("raw_vanadium_blocks");
        public static final TagKey<Item> VANADIUM_DUSTS = createCommonTag("vanadium_dusts");
        public static final TagKey<Item> VANADIUM_INGOTS = createCommonTag("vanadium_ingots");
        public static final TagKey<Item> VANADIUM_BLOCKS = createCommonTag("vanadium_blocks");

        public static final TagKey<Item> NEODYMIUM_ORES = createCommonTag("neodymium_ores");
        public static final TagKey<Item> RAW_NEODYMIUM_ORES = createCommonTag("raw_neodymium_ores");
        public static final TagKey<Item> RAW_NEODYMIUM_BLOCKS = createCommonTag("raw_neodymium_blocks");
        public static final TagKey<Item> NEODYMIUM_DUSTS = createCommonTag("neodymium_dusts");
        public static final TagKey<Item> NEODYMIUM_INGOTS = createCommonTag("neodymium_ingots");
        public static final TagKey<Item> NEODYMIUM_BLOCKS = createCommonTag("neodymium_blocks");

        public static final TagKey<Item> URANIUM_ORES = createCommonTag("uranium_ores");
        public static final TagKey<Item> RAW_URANIUM_ORES = createCommonTag("raw_uranium_ores");
        public static final TagKey<Item> RAW_URANIUM_BLOCKS = createCommonTag("raw_uranium_blocks");
        public static final TagKey<Item> URANIUM_DUSTS = createCommonTag("uranium_dusts");
        public static final TagKey<Item> URANIUM_INGOTS = createCommonTag("uranium_ingots");
        public static final TagKey<Item> URANIUM_BLOCKS = createCommonTag("uranium_blocks");


        public static final TagKey<Item> COBALT_ORES = createCommonTag("cobalt_ores");
        public static final TagKey<Item> RAW_COBALT_ORES = createCommonTag("raw_cobalt_ores");
        public static final TagKey<Item> RAW_COBALT_BLOCKS = createCommonTag("raw_cobalt_blocks");
        public static final TagKey<Item> COBALT_DUSTS = createCommonTag("cobalt_dusts");
        public static final TagKey<Item> COBALT_INGOTS = createCommonTag("cobalt_ingots");
        public static final TagKey<Item> COBALT_BLOCKS = createCommonTag("cobalt_blocks");

        public static final TagKey<Item> OSMIUM_ORES = createCommonTag("osmium_ores");
        public static final TagKey<Item> RAW_OSMIUM_ORES = createCommonTag("raw_osmium_ores");
        public static final TagKey<Item> RAW_OSMIUM_BLOCKS = createCommonTag("raw_osmium_blocks");
        public static final TagKey<Item> OSMIUM_DUSTS = createCommonTag("osmium_dusts");
        public static final TagKey<Item> OSMIUM_INGOTS = createCommonTag("osmium_ingots");
        public static final TagKey<Item> OSMIUM_BLOCKS = createCommonTag("osmium_blocks");

        public static final TagKey<Item> PLATINUM_ORES = createCommonTag("platinum_ores");
        public static final TagKey<Item> RAW_PLATINUM_ORES = createCommonTag("raw_platinum_ores");
        public static final TagKey<Item> RAW_PLATINUM_BLOCKS = createCommonTag("raw_platinum_blocks");
        public static final TagKey<Item> PLATINUM_DUSTS = createCommonTag("platinum_dusts");
        public static final TagKey<Item> PLATINUM_INGOTS = createCommonTag("platinum_ingots");
        public static final TagKey<Item> PLATINUM_BLOCKS = createCommonTag("platinum_blocks");

        public static final TagKey<Item> IRIDIUM_ORES = createCommonTag("iridium_ores");
        public static final TagKey<Item> RAW_IRIDIUM_ORES = createCommonTag("raw_iridium_ores");
        public static final TagKey<Item> RAW_IRIDIUM_BLOCKS = createCommonTag("raw_iridium_blocks");
        public static final TagKey<Item> IRIDIUM_DUSTS = createCommonTag("iridium_dusts");
        public static final TagKey<Item> IRIDIUM_INGOTS = createCommonTag("iridium_ingots");
        public static final TagKey<Item> IRIDIUM_BLOCKS = createCommonTag("iridium_blocks");


        public static final TagKey<Item> RAW_ARCHEOSITE_ORES = createCommonTag("raw_archeosite_ores");
        public static final TagKey<Item> RAW_ARCHEOSITE_BLOCKS = createCommonTag("raw_archeosite_blocks");
        public static final TagKey<Item> ARCHEOSITE_DUSTS = createCommonTag("archeosite_dusts");
        public static final TagKey<Item> ARCHEOSITE_INGOTS = createCommonTag("archeosite_ingots");
        public static final TagKey<Item> ARCHEOSITE_BLOCKS = createCommonTag("archeosite_blocks");

        public static final TagKey<Item> RAW_BRONZE_ORES = createCommonTag("raw_bronze_ores");
        public static final TagKey<Item> RAW_BRONZE_BLOCKS = createCommonTag("raw_bronze_blocks");
        public static final TagKey<Item> BRONZE_DUSTS = createCommonTag("bronze_dusts");
        public static final TagKey<Item> BRONZE_INGOTS = createCommonTag("bronze_ingots");
        public static final TagKey<Item> BRONZE_BLOCKS = createCommonTag("bronze_blocks");

        public static final TagKey<Item> RAW_CONSTANTAN_ORES = createCommonTag("raw_constantan_ores");
        public static final TagKey<Item> RAW_CONSTANTAN_BLOCKS = createCommonTag("raw_constantan_blocks");
        public static final TagKey<Item> CONSTANTAN_DUSTS = createCommonTag("constantan_dusts");
        public static final TagKey<Item> CONSTANTAN_INGOTS = createCommonTag("constantan_ingots");
        public static final TagKey<Item> CONSTANTAN_BLOCKS = createCommonTag("constantan_blocks");

        public static final TagKey<Item> RAW_INVAR_ORES = createCommonTag("raw_invar_ores");
        public static final TagKey<Item> RAW_INVAR_BLOCKS = createCommonTag("raw_invar_blocks");
        public static final TagKey<Item> INVAR_DUSTS = createCommonTag("invar_dusts");
        public static final TagKey<Item> INVAR_INGOTS = createCommonTag("invar_ingots");
        public static final TagKey<Item> INVAR_BLOCKS = createCommonTag("invar_blocks");

        public static final TagKey<Item> RAW_STEEL_ORES = createCommonTag("raw_steel_ores");
        public static final TagKey<Item> RAW_STEEL_BLOCKS = createCommonTag("raw_steel_blocks");
        public static final TagKey<Item> STEEL_DUSTS = createCommonTag("steel_dusts");
        public static final TagKey<Item> STEEL_INGOTS = createCommonTag("steel_ingots");
        public static final TagKey<Item> STEEL_BLOCKS = createCommonTag("steel_blocks");

        public static final TagKey<Item> RAW_TUNGSTENSTEEL_ORES = createCommonTag("raw_tungstensteel_ores");
        public static final TagKey<Item> RAW_TUNGSTENSTEEL_BLOCKS = createCommonTag("raw_tungstensteel_blocks");
        public static final TagKey<Item> TUNGSTENSTEEL_DUSTS = createCommonTag("tungstensteel_dusts");
        public static final TagKey<Item> TUNGSTENSTEEL_INGOTS = createCommonTag("tungstensteel_ingots");
        public static final TagKey<Item> TUNGSTENSTEEL_BLOCKS = createCommonTag("tungstensteel_blocks");

        public static final TagKey<Item> RAW_THELOSITE_ORES = createCommonTag("raw_thelosite_ores");
        public static final TagKey<Item> RAW_THELOSITE_BLOCKS = createCommonTag("raw_thelosite_blocks");
        public static final TagKey<Item> THELOSITE_DUSTS = createCommonTag("thelosite_dusts");
        public static final TagKey<Item> THELOSITE_INGOTS = createCommonTag("thelosite_ingots");
        public static final TagKey<Item> THELOSITE_BLOCKS = createCommonTag("thelosite_blocks");

        public static final TagKey<Item> RAW_ADVANCED_ALLOY_ORES = createCommonTag("raw_advanced_alloy_ores");
        public static final TagKey<Item> RAW_ADVANCED_ALLOY_BLOCKS = createCommonTag("raw_advanced_alloy_blocks");
        public static final TagKey<Item> ADVANCED_ALLOY_DUSTS = createCommonTag("advanced_alloy_dusts");
        public static final TagKey<Item> ADVANCED_ALLOY_INGOTS = createCommonTag("advanced_alloy_ingots");
        public static final TagKey<Item> ADVANCED_ALLOY_BLOCKS = createCommonTag("advanced_alloy_blocks");

        public static final TagKey<Item> RAW_IRIDIUM_ALLOY_ORES = createCommonTag("raw_iridium_alloy_ores");
        public static final TagKey<Item> RAW_IRIDIUM_ALLOY_BLOCKS = createCommonTag("raw_iridium_alloy_blocks");
        public static final TagKey<Item> IRIDIUM_ALLOY_DUSTS = createCommonTag("iridium_dusts");
        public static final TagKey<Item> IRIDIUM_ALLOY_INGOTS = createCommonTag("iridium_alloy_ingots");
        public static final TagKey<Item> IRIDIUM_ALLOY_BLOCKS = createCommonTag("iridium_alloy_blocks");

        public static final TagKey<Item> RAW_ELECTRUM_ORES = createCommonTag("raw_electrum_ores");
        public static final TagKey<Item> RAW_ELECTRUM_BLOCKS = createCommonTag("raw_electrum_blocks");
        public static final TagKey<Item> ELECTRUM_DUSTS = createCommonTag("electrum_dusts");
        public static final TagKey<Item> ELECTRUM_INGOTS = createCommonTag("electrum_ingots");
        public static final TagKey<Item> ELECTRUM_BLOCKS = createCommonTag("electrum_blocks");

        public static final TagKey<Item> RAW_SIGNALUM_ORES = createCommonTag("raw_signalum_ores");
        public static final TagKey<Item> RAW_SIGNALUM_BLOCKS = createCommonTag("raw_signalum_blocks");
        public static final TagKey<Item> SIGNALUM_DUSTS = createCommonTag("signalum_dusts");
        public static final TagKey<Item> SIGNALUM_INGOTS = createCommonTag("signalum_ingots");
        public static final TagKey<Item> SIGNALUM_BLOCKS = createCommonTag("signalum_blocks");

        public static final TagKey<Item> RAW_LUMIUM_ORES = createCommonTag("raw_lumium_ores");
        public static final TagKey<Item> RAW_LUMIUM_BLOCKS = createCommonTag("raw_lumium_blocks");
        public static final TagKey<Item> LUMIUM_DUSTS = createCommonTag("lumium_dusts");
        public static final TagKey<Item> LUMIUM_INGOTS = createCommonTag("lumium_ingots");
        public static final TagKey<Item> LUMIUM_BLOCKS = createCommonTag("lumium_blocks");

        public static final TagKey<Item> RAW_ENDERIUM_ORES = createCommonTag("raw_enderium_ores");
        public static final TagKey<Item> RAW_ENDERIUM_BLOCKS = createCommonTag("raw_enderium_blocks");
        public static final TagKey<Item> ENDERIUM_DUSTS = createCommonTag("enderium_dusts");
        public static final TagKey<Item> ENDERIUM_INGOTS = createCommonTag("enderium_ingots");
        public static final TagKey<Item> ENDERIUM_BLOCKS = createCommonTag("enderium_blocks");

        public static final TagKey<Item> MAGISTEEL_DUSTS = createCommonTag("magisteel_dusts");
        public static final TagKey<Item> MAGISTEEL_INGOTS = createCommonTag("magisteel_ingots");
        public static final TagKey<Item> MAGISTEEL_BLOCKS = createCommonTag("magisteel_blocks");

        public static final TagKey<Item> ORICHALCUM_DUSTS = createCommonTag("orichalcum_dusts");
        public static final TagKey<Item> ORICHALCUM_INGOTS = createCommonTag("orichalcum_ingots");
        public static final TagKey<Item> ORICHALCUM_BLOCKS = createCommonTag("orichalcum_blocks");

        public static final TagKey<Item> MITHRIL_DUSTS = createCommonTag("mithril_dusts");
        public static final TagKey<Item> MITHRIL_INGOTS = createCommonTag("mithril_ingots");
        public static final TagKey<Item> MITHRIL_BLOCKS = createCommonTag("mithril_blocks");

        public static final TagKey<Item> EMETAL_DUSTS = createCommonTag("emetal_dusts");
        public static final TagKey<Item> EMETAL_INGOTS = createCommonTag("emetal_ingots");
        public static final TagKey<Item> EMETAL_BLOCKS = createCommonTag("emetal_blocks");

        public static final TagKey<Item> DARK_ALLOY_DUSTS = createCommonTag("dark_alloy_dusts");
        public static final TagKey<Item> DARK_ALLOY_INGOTS = createCommonTag("dark_alloy_ingots");
        public static final TagKey<Item> DARK_ALLOY_BLOCKS = createCommonTag("dark_alloy_blocks");


        public static final TagKey<Item> SAPPHIRE_ORES = createCommonTag("sapphire_ores");
        public static final TagKey<Item> SAPPHIRE_BLOCKS = createCommonTag("sapphire_blocks");
        public static final TagKey<Item> SAPPHIRES = createCommonTag("sapphires");
        public static final TagKey<Item> SAPPHIRE_DUSTS = createCommonTag("sapphire_dusts");

        public static final TagKey<Item> RUBY_ORES = createCommonTag("ruby_ores");
        public static final TagKey<Item> RUBY_BLOCKS = createCommonTag("ruby_blocks");
        public static final TagKey<Item> RUBIES = createCommonTag("rubies");
        public static final TagKey<Item> RUBY_DUSTS = createCommonTag("ruby_dusts");

        public static final TagKey<Item> MANATITE_ORES = createCommonTag("manatite_ores");
        public static final TagKey<Item> MANATITES = createCommonTag("manatite_ores");
        public static final TagKey<Item> MANATITE_BLOCKS = createCommonTag("manatite_blocks");
        public static final TagKey<Item> MANATITE_DUSTS = createCommonTag("manatite_dusts");


        public static final TagKey<Item> WINDSTORM_STAFFS = createTag("windstorm_staffs");
        public static final TagKey<Item> VIRIDIAN_STAFFS = createTag("viridian_staffs");
        public static final TagKey<Item> ABYSS_STAFFS = createTag("abyss_staffs");
        public static final TagKey<Item> VOLCANIC_STAFFS = createTag("volcanic_staffs");
        public static final TagKey<Item> SUNLIGHT_STAFFS = createTag("sunlight_staffs");
        public static final TagKey<Item> NOVILUNIUM_STAFFS = createTag("novilunium_staffs");
        public static final TagKey<Item> THUNDERBOLT_STAFFS = createTag("thunderbolt_staffs");
        public static final TagKey<Item> TERRA_STAFFS = createTag("terra_staffs");
        public static final TagKey<Item> GLACIAL_STAFFS = createTag("glacial_staffs");
        public static final TagKey<Item> FERRUM_STAFFS = createTag("ferrum_staffs");
        public static final TagKey<Item> CRIMSON_STAFFS = createTag("crimson_staffs");

        public static final TagKey<Item> ASH_LOGS = createTag("ash_logs");
        public static final TagKey<Item> ASH_PLANKS = createTag("ash_logs");

        public static final TagKey<Item> LEVEL_3_PICKAXES = createTag("level_3_pickaxes");

        public static final TagKey<Item> MANA_GEMS = createTag("mana_gems");
        public static final TagKey<Item> PRECIOUS_GEMS = createTag("precious_gem");
        public static final TagKey<Item> ATTUNED_MANATITES = createTag("attuned_manatites");

        public static final TagKey<Item> MOB_SOULS = createTag("mob_souls");

        public static final TagKey<Item> FUEL_CELLS = createTag("fuel_cells");

        public static final TagKey<Item> LASER_FOCI = createTag("laser_foci");

        public static final TagKey<Item> SPARK_TRINKETS = createTag("spark_trinkets");
        public static final TagKey<Item> FRAGMENT_TRINKETS = createTag("fragment_trinkets");
        public static final TagKey<Item> DUST_TRINKETS = createTag("dust_trinkets");

    }
}