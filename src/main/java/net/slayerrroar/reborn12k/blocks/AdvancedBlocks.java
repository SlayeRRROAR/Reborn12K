package net.slayerrroar.reborn12k.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.block_class.MarketBlock;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class AdvancedBlocks {

    public static final Block MARKET_TABLE = new MarketBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE).nonOpaque());

    public static void register() {

        //BLOCK

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "market_table"), MARKET_TABLE);

        Reborn12K.LOGGER.info("Registering Advanced Blocks for " + Reborn12K.MOD_ID);

        //ITEM

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "market_table"), new BlockItem(MARKET_TABLE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Reborn12K.LOGGER.info("Registering Advanced Block Items for " + Reborn12K.MOD_ID);

    }
}
