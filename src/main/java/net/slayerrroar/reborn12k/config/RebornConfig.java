package net.slayerrroar.reborn12k.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "reborn12k")
@Config.Gui.Background("reborn12k:textures/block/ash_planks.png")

public class RebornConfig implements ConfigData {

    @ConfigEntry.Category("ore_generation")
    @Comment("When disabled, no Ore will spawn, regardless of other settings")
        public boolean enableOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Ores will generate in the Overworld")
    public boolean enableOverworldGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Ores will generate in the End")
    public boolean enableNetherGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Ores will generate in the End")
    public boolean enableEndGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Tin Ores will generate")
        public boolean enableTinOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Aluminum Ores will generate")
        public boolean enableAluminumOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Silver Ores will generate")
    public boolean enableSilverOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Lead Ores will generate")
    public boolean enableLeadOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Nickel Ores will generate")
    public boolean enableNickelOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Chromite Ores will generate")
    public boolean enableChromiteOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Titanium Ores will generate")
    public boolean enableTitaniumOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Sapphire Ores will generate")
    public boolean enableSapphireOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Ruby Ores will generate")
    public boolean enableRubyOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Manatite Ores will generate")
    public boolean enableManatiteOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Tungsten Ores will generate")
    public boolean enableTungstenOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Vanadium Ores will generate")
    public boolean enableVanadiumOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Neodymium Ores will generate")
    public boolean enableNeodymiumOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Uranium Ores will generate")
    public boolean enableUraniumOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Cobalt Ores will generate")
    public boolean enableCobaltOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Osmium Ores will generate")
    public boolean enableOsmiumOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Platinum Ores will generate")
    public boolean enablePlatinumOreGeneration = true;

    @ConfigEntry.Category("ore_generation")
    @Comment("When enabled, Iridium Ores will generate")
    public boolean enableIridiumOreGeneration = true;

    @ConfigEntry.Category("tree_generation")
    @Comment("When disabled, no Tree will spawn, regardless of other settings")
    public boolean enableTreeGeneration = true;

    @ConfigEntry.Category("tree_generation")
    @Comment("When enabled, Cherry Trees will generate")
    public boolean enableCherryTreeGeneration = true;

    @ConfigEntry.Category("tree_generation")
    @Comment("When enabled, Ash Trees will generate")
    public boolean enableAshTreeGeneration = true;

    @ConfigEntry.Category("tree_generation")
    @Comment("When enabled, Slimy Trees will generate")
    public boolean enableSlimyTreeGeneration = true;

}
