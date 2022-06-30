package net.slayerrroar.reborn12k.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.block_class.AlloyFurnaceBlock;
import net.slayerrroar.reborn12k.blocks.block_class.MarketBlock;
import net.slayerrroar.reborn12k.blocks.block_class.RunicArtifactBlock;
import net.slayerrroar.reborn12k.blocks.block_class.FancyLampBlock;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

import java.util.function.ToIntFunction;

public class AdvancedBlocks {

    private static ToIntFunction<BlockState> createLightLevelFromLitBlockState(int i) {
        return blockState -> blockState.get(Properties.LIT) ? i : 0;
    }

    public static final Block MARKET_TABLE = new MarketBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    public static final Block FANCY_LAMP = new FancyLampBlock(FabricBlockSettings.copy(Blocks.STONE).sounds(BlockSoundGroup.STONE).hardness(5.0f).resistance(6.0f).nonOpaque().luminance(blockstate ->30));

    public static final Block ALLOY_FURNACE = new AlloyFurnaceBlock(FabricBlockSettings.copy(Blocks.STONE).luminance(AdvancedBlocks.createLightLevelFromLitBlockState(13)));
    public static final Block RUNIC_ARTIFACT = new RunicArtifactBlock(FabricBlockSettings.copy(Blocks.STONE).luminance(AdvancedBlocks.createLightLevelFromLitBlockState(10)).nonOpaque());

    public static void register() {

        //BLOCK

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "market_table"), MARKET_TABLE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "fancy_lamp"), FANCY_LAMP);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "alloy_furnace"), ALLOY_FURNACE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "runic_artifact"), RUNIC_ARTIFACT);

        Reborn12K.LOGGER.info("Registering Advanced Blocks for " + Reborn12K.MOD_ID);

        //ITEM

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "market_table"), new BlockItem(MARKET_TABLE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "fancy_lamp"), new BlockItem(FANCY_LAMP, new FabricItemSettings().rarity(Rarity.RARE).group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "alloy_furnace"), new BlockItem(ALLOY_FURNACE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "runic_artifact"), new BlockItem(RUNIC_ARTIFACT, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Reborn12K.LOGGER.info("Registering Advanced Block Items for " + Reborn12K.MOD_ID);

    }
}
