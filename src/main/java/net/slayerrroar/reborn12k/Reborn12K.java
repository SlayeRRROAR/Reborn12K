package net.slayerrroar.reborn12k;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.slayerrroar.reborn12k.armors.RebornArmors;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;
import net.slayerrroar.reborn12k.blocks.GenericBlocks;
import net.slayerrroar.reborn12k.blocks.OreBlocks;
import net.slayerrroar.reborn12k.config.RebornConfig;
import net.slayerrroar.reborn12k.enchantments.RebornEnchantments;
import net.slayerrroar.reborn12k.entity.RebornBlockEntities;
import net.slayerrroar.reborn12k.entity.RebornProjectileEntities;
import net.slayerrroar.reborn12k.items.*;
import net.slayerrroar.reborn12k.loot.RebornLootTable;
import net.slayerrroar.reborn12k.recipe.RebornRecipes;
import net.slayerrroar.reborn12k.screen.RebornScreenRegistry;
import net.slayerrroar.reborn12k.sounds.RebornSounds;
import net.slayerrroar.reborn12k.tools.RebornTools;
import net.slayerrroar.reborn12k.util.FuelUtil;
import net.slayerrroar.reborn12k.util.ItemGroupUtil;
import net.slayerrroar.reborn12k.util.StrippableUtil;
import net.slayerrroar.reborn12k.villagers.RebornTrades;
import net.slayerrroar.reborn12k.world.generation.RebornWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reborn12K implements ModInitializer {

    public static final String MOD_ID = "reborn12k";
    public static final Logger LOGGER = LoggerFactory.getLogger("reborn12k");
    public static RebornConfig CONFIG;

    @Override
    public void onInitialize() {

        AutoConfig.register(RebornConfig.class, GsonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(RebornConfig.class).getConfig();
        ServerLifecycleEvents.SERVER_STARTED.register(server->server.setFlightEnabled(true));

        ItemGroupUtil.registerItemGroups();

        RebornSounds.register();

        OreBlocks.register();
        GenericBlocks.register();
        AdvancedBlocks.register();

        GenericItems.register();

        FuelUtil.register();

        TechnicalItems.register();
        MagicItems.register();

        TrinketItems.register();

        DiscItems.register();

        RebornTools.register();
        RebornArmors.register();

        RebornEnchantments.register();

        RebornWorldGen.generate();

        StrippableUtil.register();

        RebornTrades.register();

        RebornBlockEntities.register();
        RebornProjectileEntities.register();

        RebornScreenRegistry.register();

        RebornRecipes.register();

        RebornLootTable.register();

    }
}
