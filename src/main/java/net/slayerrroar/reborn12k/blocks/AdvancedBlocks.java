package net.slayerrroar.reborn12k.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.block_entities.*;
import net.slayerrroar.reborn12k.blocks.custom_blocks.*;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class AdvancedBlocks {

    public static final Block MARKET_TABLE = new MarketBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));

    public static final Block FANCY_LAMP = new FancyLampBlock(FabricBlockSettings.copy(Blocks.STONE).sounds(BlockSoundGroup.STONE).hardness(5.0f).resistance(6.0f).nonOpaque().luminance(blockstate ->30));

    public static final Block RUNIC_ARTIFACT = new RunicArtifactBlock(FabricBlockSettings.copyOf(Blocks.STONE).nonOpaque());

    public static final Block MELTER = new MelterBlock(FabricBlockSettings.copyOf(Blocks.STONE));

    public static final Block BASIC_LASER_QUARRY = new BasicQuarryBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
    public static final Block ADVANCED_LASER_QUARRY = new AdvancedQuarryBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
    public static final Block ULTIMATE_LASER_QUARRY = new UltimateQuarryBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));


    public static void register() {

        //BLOCK

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "market_table"), MARKET_TABLE);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "fancy_lamp"), FANCY_LAMP);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "runic_artifact"), RUNIC_ARTIFACT);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "melter"), MELTER);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "basic_laser_quarry"), BASIC_LASER_QUARRY);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "advanced_laser_quarry"), ADVANCED_LASER_QUARRY);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "ultimate_laser_quarry"), ULTIMATE_LASER_QUARRY);

        //ITEM

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "market_table"), new BlockItem(MARKET_TABLE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.DECORATIONS)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "fancy_lamp"), new BlockItem(FANCY_LAMP, new FabricItemSettings().rarity(Rarity.RARE).group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.DECORATIONS)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "runic_artifact"), new BlockItem(RUNIC_ARTIFACT, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.DECORATIONS)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "melter"), new BlockItem(MELTER, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.DECORATIONS)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "basic_laser_quarry"), new BlockItem(BASIC_LASER_QUARRY, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "advanced_laser_quarry"), new BlockItem(ADVANCED_LASER_QUARRY, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ultimate_laser_quarry"), new BlockItem(ULTIMATE_LASER_QUARRY, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.DECORATIONS)));

    }
}
