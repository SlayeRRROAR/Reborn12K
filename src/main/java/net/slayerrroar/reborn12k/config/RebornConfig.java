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

    @ConfigEntry.Category("tree_generation")
    @Comment("When disabled, no Tree will spawn, regardless of other settings")
    public boolean enableTreeGeneration = true;

    @ConfigEntry.Category("tree_generation")
    @Comment("When enabled, Ash Trees will generate")
    public boolean enableAshTreeGeneration = true;

    @ConfigEntry.Category("tree_generation")
    @Comment("When enabled, Slimy Trees will generate")
    public boolean enableSlimyTreeGeneration = true;


    @ConfigEntry.Category("loot_generation")
    @Comment("When enabled, vanilla chest have additional loot")
    public boolean enableChests = true;

    @ConfigEntry.Category("loot_generation")
    @Comment("When disabled, mobs will not drop additional loot, regardless of other settings")
    public boolean enableMobDrops = true;

    @ConfigEntry.Category("loot_generation")
    @Comment("When enabled, Ender Dragons will drop additional loot")
    public boolean enableEnderDragonDrops = true;

    @ConfigEntry.Category("loot_generation")
    @Comment("When enabled, Wardens will drop additional loot")
    public boolean enableWardenDrops = true;

    @ConfigEntry.Category("loot_generation")
    @Comment("When enabled, Withers will drop additional loot")
    public boolean enableWitherDrops = true;

}
