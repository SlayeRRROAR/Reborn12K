package net.slayerrroar.reborn12k;

import net.fabricmc.api.ModInitializer;
import net.slayerrroar.reborn12k.armors.Armors;
import net.slayerrroar.reborn12k.blocks.BaseBlocks;
import net.slayerrroar.reborn12k.blocks.OreBlocks;
import net.slayerrroar.reborn12k.enchantments.Enchantments;
import net.slayerrroar.reborn12k.items.*;
import net.slayerrroar.reborn12k.util.Fuels;
import net.slayerrroar.reborn12k.tools.Tools;
import net.slayerrroar.reborn12k.world.Oregen;

public class Reborn12K implements ModInitializer {

    public static final String MOD_ID = "reborn12k";

    @Override
    public void onInitialize() {


        BaseBlocks.register();
        OreBlocks.register();

        BaseItems.register();
        AdvancedItems.register();

        Rings.register();
        Staffs.register();
        Charms.register();

        Tools.register();
        Armors.register();

        Enchantments.register();

        Oregen.register();

        Fuels.register();

    }
}
