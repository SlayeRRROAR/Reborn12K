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

        public static final TagKey<Block> QUARTZ_BLOCKS = createCommonTag("quartz_blocks");

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


        public static final TagKey<Block> RAW_BRONZE_BLOCKS = createCommonTag("raw_bronze_blocks");
        public static final TagKey<Block> BRONZE_BLOCKS = createCommonTag("bronze_blocks");

        public static final TagKey<Block> RAW_INVAR_BLOCKS = createCommonTag("raw_invar_blocks");
        public static final TagKey<Block> INVAR_BLOCKS = createCommonTag("invar_blocks");

        public static final TagKey<Block> RAW_CONSTANTAN_BLOCKS = createCommonTag("raw_constantan_blocks");
        public static final TagKey<Block> CONSTANTAN_BLOCKS = createCommonTag("constantan_blocks");

        public static final TagKey<Block> RAW_ELECTRUM_BLOCKS = createCommonTag("raw_electrum_blocks");
        public static final TagKey<Block> ELECTRUM_BLOCKS = createCommonTag("electrum_blocks");

        public static final TagKey<Block> RAW_SIGNALUM_BLOCKS = createCommonTag("raw_signalum_blocks");
        public static final TagKey<Block> SIGNALUM_BLOCKS = createCommonTag("signalum_blocks");

        public static final TagKey<Block> RAW_LUMIUM_BLOCKS = createCommonTag("raw_lumium_blocks");
        public static final TagKey<Block> LUMIUM_BLOCKS = createCommonTag("lumium_blocks");

        public static final TagKey<Block> RAW_ENDERIUM_BLOCKS = createCommonTag("raw_enderium_blocks");
        public static final TagKey<Block> ENDERIUM_BLOCKS = createCommonTag("enderium_blocks");

        public static final TagKey<Block> RAW_STEEL_BLOCKS = createCommonTag("raw_steel_blocks");
        public static final TagKey<Block> STEEL_BLOCKS = createCommonTag("steel_blocks");

        public static final TagKey<Block> RAW_TUNGSTENSTEEL_BLOCKS = createCommonTag("raw_tungstensteel_blocks");
        public static final TagKey<Block> TUNGSTENSTEEL_BLOCKS = createCommonTag("tungstensteel_blocks");

        public static final TagKey<Block> RAW_ADVANCED_ALLOY_BLOCKS = createCommonTag("raw_advanced_alloy_blocks");
        public static final TagKey<Block> ADVANCED_ALLOY_BLOCKS = createCommonTag("advanced_alloy_blocks");

        public static final TagKey<Block> RAW_IRIDIUM_ALLOY_BLOCKS = createCommonTag("raw_iridium_alloy_blocks");
        public static final TagKey<Block> IRIDIUM_ALLOY_BLOCKS = createCommonTag("iridium_alloy_blocks");

        public static final TagKey<Block> RAW_ARCHEOSITE_BLOCKS = createCommonTag("raw_archeosite_blocks");
        public static final TagKey<Block> ARCHEOSITE_BLOCKS = createCommonTag("archeosite_blocks");

        public static final TagKey<Block> RAW_THELOSITE_BLOCKS = createCommonTag("raw_thelosite_blocks");
        public static final TagKey<Block> THELOSITE_BLOCKS = createCommonTag("thelosite_blocks");


        public static final TagKey<Block> SAPPHIRE_ORES = createCommonTag("sapphire_ores");
        public static final TagKey<Block> SAPPHIRE_BLOCKS = createCommonTag("sapphire_blocks");

        public static final TagKey<Block> RUBY_ORES = createCommonTag("ruby_ores");
        public static final TagKey<Block> RUBY_BLOCKS = createCommonTag("ruby_blocks");

        public static final TagKey<Block> MANATITE_ORES = createCommonTag("manatite_ores");


        public static final TagKey<Block> ASH_LOGS = createTag("ash_logs");
        public static final TagKey<Block> ASH_PLANKS = createTag("ash_logs");

        public static final TagKey<Block> CHERRY_LOGS = createTag("cherry_logs");
        public static final TagKey<Block> CHERRY_PLANKS = createTag("cherry_logs");


    }

    public static class Items {


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registries.ITEM.getKey(), new Identifier(Reborn12K.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registries.ITEM.getKey(), new Identifier("c", name));
        }

        public static final TagKey<Item> QUARTZ_BLOCKS = createCommonTag("quartz_blocks");

        public static final TagKey<Item> COAL_DUSTS = createCommonTag("coal_dusts");

        public static final TagKey<Item> TIN_ORES = createCommonTag("tin_ores");
        public static final TagKey<Item> RAW_TIN_ORES = createCommonTag("raw_tin_ores");
        public static final TagKey<Item> RAW_TIN_BLOCKS = createCommonTag("raw_tin_blocks");
        public static final TagKey<Item> TIN_INGOTS = createCommonTag("tin_ingots");
        public static final TagKey<Item> TIN_BLOCKS = createCommonTag("tin_blocks");

        public static final TagKey<Item> ALUMINUM_ORES = createCommonTag("aluminum_ores");
        public static final TagKey<Item> RAW_ALUMINUM_ORES = createCommonTag("raw_aluminum_ores");
        public static final TagKey<Item> RAW_ALUMINUM_BLOCKS = createCommonTag("raw_aluminum_blocks");
        public static final TagKey<Item> ALUMINUM_INGOTS = createCommonTag("aluminum_ingots");
        public static final TagKey<Item> ALUMINUM_BLOCKS = createCommonTag("aluminum_blocks");

        public static final TagKey<Item> SILVER_ORES = createCommonTag("silver_ores");
        public static final TagKey<Item> RAW_SILVER_ORES = createCommonTag("raw_silver_ores");
        public static final TagKey<Item> RAW_SILVER_BLOCKS = createCommonTag("raw_silver_blocks");
        public static final TagKey<Item> SILVER_INGOTS = createCommonTag("silver_ingots");
        public static final TagKey<Item> SILVER_BLOCKS = createCommonTag("silver_blocks");

        public static final TagKey<Item> LEAD_ORES = createCommonTag("lead_ores");
        public static final TagKey<Item> RAW_LEAD_ORES = createCommonTag("raw_lead_ores");
        public static final TagKey<Item> RAW_LEAD_BLOCKS = createCommonTag("raw_lead_blocks");
        public static final TagKey<Item> LEAD_INGOTS = createCommonTag("lead_ingots");
        public static final TagKey<Item> LEAD_BLOCKS = createCommonTag("lead_blocks");

        public static final TagKey<Item> NICKEL_ORES = createCommonTag("nickel_ores");
        public static final TagKey<Item> RAW_NICKEL_ORES = createCommonTag("raw_nickel_ores");
        public static final TagKey<Item> RAW_NICKEL_BLOCKS = createCommonTag("raw_nickel_blocks");
        public static final TagKey<Item> NICKEL_INGOTS = createCommonTag("nickel_ingots");
        public static final TagKey<Item> NICKEL_BLOCKS = createCommonTag("nickel_blocks");

        public static final TagKey<Item> CHROME_ORES = createCommonTag("chrome_ores");
        public static final TagKey<Item> RAW_CHROME_ORES = createCommonTag("raw_chrome_ores");
        public static final TagKey<Item> RAW_CHROME_BLOCKS = createCommonTag("raw_chrome_blocks");
        public static final TagKey<Item> CHROME_INGOTS = createCommonTag("chrome_ingots");
        public static final TagKey<Item> CHROME_BLOCKS = createCommonTag("chrome_blocks");

        public static final TagKey<Item> TITANIUM_ORES = createCommonTag("titanium_ores");
        public static final TagKey<Item> RAW_TITANIUM_ORES = createCommonTag("raw_titanium_ores");
        public static final TagKey<Item> RAW_TITANIUM_BLOCKS = createCommonTag("raw_titanium_blocks");
        public static final TagKey<Item> TITANIUM_INGOTS = createCommonTag("titanium_ingots");
        public static final TagKey<Item> TITANIUM_BLOCKS = createCommonTag("titanium_blocks");

        public static final TagKey<Item> TUNGSTEN_ORES = createCommonTag("tungsten_ores");
        public static final TagKey<Item> RAW_TUNGSTEN_ORES = createCommonTag("raw_tungsten_ores");
        public static final TagKey<Item> RAW_TUNGSTEN_BLOCKS = createCommonTag("raw_tungsten_blocks");
        public static final TagKey<Item> TUNGSTEN_INGOTS = createCommonTag("tungsten_ingots");
        public static final TagKey<Item> TUNGSTEN_BLOCKS = createCommonTag("tungsten_blocks");

        public static final TagKey<Item> VANADIUM_ORES = createCommonTag("vanadium_ores");
        public static final TagKey<Item> RAW_VANADIUM_ORES = createCommonTag("raw_vanadium_ores");
        public static final TagKey<Item> RAW_VANADIUM_BLOCKS = createCommonTag("raw_vanadium_blocks");
        public static final TagKey<Item> VANADIUM_INGOTS = createCommonTag("vanadium_ingots");
        public static final TagKey<Item> VANADIUM_BLOCKS = createCommonTag("vanadium_blocks");

        public static final TagKey<Item> NEODYMIUM_ORES = createCommonTag("neodymium_ores");
        public static final TagKey<Item> RAW_NEODYMIUM_ORES = createCommonTag("raw_neodymium_ores");
        public static final TagKey<Item> RAW_NEODYMIUM_BLOCKS = createCommonTag("raw_neodymium_blocks");
        public static final TagKey<Item> NEODYMIUM_INGOTS = createCommonTag("neodymium_ingots");
        public static final TagKey<Item> NEODYMIUM_BLOCKS = createCommonTag("neodymium_blocks");

        public static final TagKey<Item> URANIUM_ORES = createCommonTag("uranium_ores");
        public static final TagKey<Item> RAW_URANIUM_ORES = createCommonTag("raw_uranium_ores");
        public static final TagKey<Item> RAW_URANIUM_BLOCKS = createCommonTag("raw_uranium_blocks");
        public static final TagKey<Item> URANIUM_INGOTS = createCommonTag("uranium_ingots");
        public static final TagKey<Item> URANIUM_BLOCKS = createCommonTag("uranium_blocks");

        public static final TagKey<Item> COBALT_ORES = createCommonTag("cobalt_ores");
        public static final TagKey<Item> RAW_COBALT_ORES = createCommonTag("raw_cobalt_ores");
        public static final TagKey<Item> RAW_COBALT_BLOCKS = createCommonTag("raw_cobalt_blocks");
        public static final TagKey<Item> COBALT_INGOTS = createCommonTag("cobalt_ingots");
        public static final TagKey<Item> COBALT_BLOCKS = createCommonTag("cobalt_blocks");

        public static final TagKey<Item> OSMIUM_ORES = createCommonTag("osmium_ores");
        public static final TagKey<Item> RAW_OSMIUM_ORES = createCommonTag("raw_osmium_ores");
        public static final TagKey<Item> RAW_OSMIUM_BLOCKS = createCommonTag("raw_osmium_blocks");
        public static final TagKey<Item> OSMIUM_INGOTS = createCommonTag("osmium_ingots");
        public static final TagKey<Item> OSMIUM_BLOCKS = createCommonTag("osmium_blocks");

        public static final TagKey<Item> PLATINUM_ORES = createCommonTag("platinum_ores");
        public static final TagKey<Item> RAW_PLATINUM_ORES = createCommonTag("raw_platinum_ores");
        public static final TagKey<Item> RAW_PLATINUM_BLOCKS = createCommonTag("raw_platinum_blocks");
        public static final TagKey<Item> PLATINUM_INGOTS = createCommonTag("platinum_ingots");
        public static final TagKey<Item> PLATINUM_BLOCKS = createCommonTag("platinum_blocks");

        public static final TagKey<Item> IRIDIUM_ORES = createCommonTag("iridium_ores");
        public static final TagKey<Item> RAW_IRIDIUM_ORES = createCommonTag("raw_iridium_ores");
        public static final TagKey<Item> RAW_IRIDIUM_BLOCKS = createCommonTag("raw_iridium_blocks");
        public static final TagKey<Item> IRIDIUM_INGOTS = createCommonTag("iridium_ingots");
        public static final TagKey<Item> IRIDIUM_BLOCKS = createCommonTag("iridium_blocks");


        public static final TagKey<Item> RAW_BRONZE_ORES = createCommonTag("raw_bronze_ores");
        public static final TagKey<Item> RAW_BRONZE_BLOCKS = createCommonTag("raw_bronze_blocks");
        public static final TagKey<Item> BRONZE_INGOTS = createCommonTag("bronze_ingots");
        public static final TagKey<Item> BRONZE_BLOCKS = createCommonTag("bronze_blocks");

        public static final TagKey<Item> RAW_INVAR_ORES = createCommonTag("raw_invar_ores");
        public static final TagKey<Item> RAW_INVAR_BLOCKS = createCommonTag("raw_invar_blocks");
        public static final TagKey<Item> INVAR_INGOTS = createCommonTag("invar_ingots");
        public static final TagKey<Item> INVAR_BLOCKS = createCommonTag("invar_blocks");

        public static final TagKey<Item> RAW_CONSTANTAN_ORES = createCommonTag("raw_constantan_ores");
        public static final TagKey<Item> RAW_CONSTANTAN_BLOCKS = createCommonTag("raw_constantan_blocks");
        public static final TagKey<Item> CONSTANTAN_INGOTS = createCommonTag("constantan_ingots");
        public static final TagKey<Item> CONSTANTAN_BLOCKS = createCommonTag("constantan_blocks");

        public static final TagKey<Item> RAW_ELECTRUM_ORES = createCommonTag("raw_electrum_ores");
        public static final TagKey<Item> RAW_ELECTRUM_BLOCKS = createCommonTag("raw_electrum_blocks");
        public static final TagKey<Item> ELECTRUM_INGOTS = createCommonTag("electrum_ingots");
        public static final TagKey<Item> ELECTRUM_BLOCKS = createCommonTag("electrum_blocks");

        public static final TagKey<Item> RAW_SIGNALUM_ORES = createCommonTag("raw_signalum_ores");
        public static final TagKey<Item> RAW_SIGNALUM_BLOCKS = createCommonTag("raw_signalum_blocks");
        public static final TagKey<Item> SIGNALUM_INGOTS = createCommonTag("signalum_ingots");
        public static final TagKey<Item> SIGNALUM_BLOCKS = createCommonTag("signalum_blocks");

        public static final TagKey<Item> RAW_LUMIUM_ORES = createCommonTag("raw_lumium_ores");
        public static final TagKey<Item> RAW_LUMIUM_BLOCKS = createCommonTag("raw_lumium_blocks");
        public static final TagKey<Item> LUMIUM_INGOTS = createCommonTag("lumium_ingots");
        public static final TagKey<Item> LUMIUM_BLOCKS = createCommonTag("lumium_blocks");

        public static final TagKey<Item> RAW_ENDERIUM_ORES = createCommonTag("raw_enderium_ores");
        public static final TagKey<Item> RAW_ENDERIUM_BLOCKS = createCommonTag("raw_enderium_blocks");
        public static final TagKey<Item> ENDERIUM_INGOTS = createCommonTag("enderium_ingots");
        public static final TagKey<Item> ENDERIUM_BLOCKS = createCommonTag("enderium_blocks");

        public static final TagKey<Item> RAW_STEEL_ORES = createCommonTag("raw_steel_ores");
        public static final TagKey<Item> RAW_STEEL_BLOCKS = createCommonTag("raw_steel_blocks");
        public static final TagKey<Item> STEEL_INGOTS = createCommonTag("steel_ingots");
        public static final TagKey<Item> STEEL_BLOCKS = createCommonTag("steel_blocks");

        public static final TagKey<Item> RAW_TUNGSTENSTEEL_ORES = createCommonTag("raw_tungstensteel_ores");
        public static final TagKey<Item> RAW_TUNGSTENSTEEL_BLOCKS = createCommonTag("raw_tungstensteel_blocks");
        public static final TagKey<Item> TUNGSTENSTEEL_INGOTS = createCommonTag("tungstensteel_ingots");
        public static final TagKey<Item> TUNGSTENSTEEL_BLOCKS = createCommonTag("tungstensteel_blocks");

        public static final TagKey<Item> RAW_ADVANCED_ALLOY_ORES = createCommonTag("raw_advanced_alloy_ores");
        public static final TagKey<Item> RAW_ADVANCED_ALLOY_BLOCKS = createCommonTag("raw_advanced_alloy_blocks");
        public static final TagKey<Item> ADVANCED_ALLOY_INGOTS = createCommonTag("advanced_alloy_ingots");
        public static final TagKey<Item> ADVANCED_ALLOY_BLOCKS = createCommonTag("advanced_alloy_blocks");

        public static final TagKey<Item> RAW_IRIDIUM_ALLOY_ORES = createCommonTag("raw_iridium_alloy_ores");
        public static final TagKey<Item> RAW_IRIDIUM_ALLOY_BLOCKS = createCommonTag("raw_iridium_alloy_blocks");
        public static final TagKey<Item> IRIDIUM_ALLOY_INGOTS = createCommonTag("iridium_alloy_ingots");
        public static final TagKey<Item> IRIDIUM_ALLOY_BLOCKS = createCommonTag("iridium_alloy_blocks");

        public static final TagKey<Item> RAW_ARCHEOSITE_ORES = createCommonTag("raw_archeosite_ores");
        public static final TagKey<Item> RAW_ARCHEOSITE_BLOCKS = createCommonTag("raw_archeosite_blocks");
        public static final TagKey<Item> ARCHEOSITE_INGOTS = createCommonTag("archeosite_ingots");
        public static final TagKey<Item> ARCHEOSITE_BLOCKS = createCommonTag("archeosite_blocks");

        public static final TagKey<Item> RAW_THELOSITE_ORES = createCommonTag("raw_thelosite_ores");
        public static final TagKey<Item> RAW_THELOSITE_BLOCKS = createCommonTag("raw_thelosite_blocks");
        public static final TagKey<Item> THELOSITE_INGOTS = createCommonTag("thelosite_ingots");
        public static final TagKey<Item> THELOSITE_BLOCKS = createCommonTag("thelosite_blocks");


        public static final TagKey<Item> SAPPHIRE_ORES = createCommonTag("sapphire_ores");
        public static final TagKey<Item> SAPPHIRE_BLOCKS = createCommonTag("sapphire_blocks");
        public static final TagKey<Item> SAPPHIRES = createCommonTag("sapphires");

        public static final TagKey<Item> RUBY_ORES = createCommonTag("ruby_ores");
        public static final TagKey<Item> RUBY_BLOCKS = createCommonTag("ruby_blocks");
        public static final TagKey<Item> RUBIES = createCommonTag("rubies");

        public static final TagKey<Item> MANATITE_ORES = createCommonTag("manatite_ores");



        public static final TagKey<Item> ASH_LOGS = createTag("ash_logs");
        public static final TagKey<Item> ASH_PLANKS = createTag("ash_logs");

        public static final TagKey<Item> CHERRY_LOGS = createTag("cherry_logs");
        public static final TagKey<Item> CHERRY_PLANKS = createTag("cherry_logs");


        public static final TagKey<Item> MANA_GEMS = createTag("mana_gem");
        public static final TagKey<Item> PRECIOUS_GEMS = createTag("precious_gem");
        public static final TagKey<Item> ATTUNED_MANATITES = createTag("attuned_manatites");

        public static final TagKey<Item> BASIC_LASER_FOCI = createTag("basic_laser_foci");
        public static final TagKey<Item> ADVANCED_LASER_FOCI = createTag("advanced_laser_foci");
        public static final TagKey<Item> ULTIMATE_LASER_FOCI = createTag("ultimate_laser_foci");

    }
}