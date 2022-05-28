package net.slayerrroar.reborn12k.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.block_class.AlloyFurnaceBlock;
import net.slayerrroar.reborn12k.blocks.block_class.MarketBlock;
import net.slayerrroar.reborn12k.blocks.block_class.StarGeneratorBlock;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class AdvancedBlocks {

    public static final Block MARKET_TABLE = new MarketBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE).nonOpaque());
    public static final Block STAR_GENERATOR = new StarGeneratorBlock(FabricBlockSettings.copy(Blocks.STONE).sounds(BlockSoundGroup.STONE).hardness(5.0f).resistance(6.0f).nonOpaque().luminance(blockstate ->30));

    public static final Block ALLOY_FURNACE = new AlloyFurnaceBlock(FabricBlockSettings.copy(Blocks.STONE));

    public static void register() {

        //BLOCK

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "market_table"), MARKET_TABLE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "star_generator"), STAR_GENERATOR);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "alloy_furnace"), ALLOY_FURNACE);

        Reborn12K.LOGGER.info("Registering Advanced Blocks for " + Reborn12K.MOD_ID);

        //ITEM

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "market_table"), new BlockItem(MARKET_TABLE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "star_generator"), new BlockItem(STAR_GENERATOR, new FabricItemSettings().rarity(Rarity.RARE).group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "alloy_furnace"), new BlockItem(ALLOY_FURNACE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Reborn12K.LOGGER.info("Registering Advanced Block Items for " + Reborn12K.MOD_ID);

    }
}
