package net.slayerrroar.reborn12k.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.block_class.StairBlock;
import net.slayerrroar.reborn12k.blocks.block_class.UraniumBlocks;
import net.slayerrroar.reborn12k.items.Reborn12KItemGroup;

public class BaseBlocks {

    public static final Block DIORITE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_DIORITE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block GRANITE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_GRANITE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block ANDESITE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_ANDESITE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_STONE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));


    public static final Block DIORITE_BRICKS_STAIRS = new StairBlock(BaseBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_DIORITE_BRICKS_STAIRS = new StairBlock(BaseBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block GRANITE_BRICKS_STAIRS = new StairBlock(BaseBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_GRANITE_BRICKS_STAIRS = new StairBlock(BaseBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block ANDESITE_BRICKS_STAIRS = new StairBlock(BaseBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_ANDESITE_BRICKS_STAIRS = new StairBlock(BaseBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_STONE_BRICKS_STAIRS = new StairBlock(BaseBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));

    public static final Block DIORITE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_DIORITE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block GRANITE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_GRANITE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block ANDESITE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_ANDESITE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_STONE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));

    public static final Block TOPAZ_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));
    public static final Block OPAL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));
    public static final Block SAPPHIRE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));
    
    public static final Block CHROME_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));
    public static final Block URANIUM_BLOCK = new UraniumBlocks(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).sounds(BlockSoundGroup.METAL).hardness(10.0f).resistance(9.0f));
    public static final Block COBALT_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 4).sounds(BlockSoundGroup.METAL).hardness(25.0f).resistance(9.0f));
    
    public static final Block RAW_TIN_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1).sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));
    public static final Block RAW_SILVER_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));
    public static final Block RAW_BRONZE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1).sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));
    public static final Block RAW_STEEL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));
    
    public static final Block TIN_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1).sounds(BlockSoundGroup.METAL).hardness(3.0f).resistance(6.0f));
    public static final Block SILVER_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.METAL).hardness(3.0f).resistance(6.0f));
    public static final Block BRONZE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1).sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));
    
    public static final Block CARBON_STEEL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));
    public static final Block BLAZING_STEEL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).sounds(BlockSoundGroup.NETHERITE).hardness(50.0f).resistance(1200.0f));
    
    public static final Block THELOSITE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 4).sounds(BlockSoundGroup.NETHERITE).hardness(80.0f).resistance(6000.0f));
    public static final Block ARCHEOSITE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 4).sounds(BlockSoundGroup.NETHERITE).hardness(80.0f).resistance(6000.0f));
    
    
    public static void register(){

        //BLOCK

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "diorite_bricks"), DIORITE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "small_diorite_bricks"), SMALL_DIORITE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "granite_bricks"), GRANITE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "small_granite_bricks"), SMALL_GRANITE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "andesite_bricks"), ANDESITE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "small_andesite_bricks"), SMALL_ANDESITE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "small_stone_bricks"), SMALL_STONE_BRICKS);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "diorite_bricks_stairs"), DIORITE_BRICKS_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "small_diorite_bricks_stairs"), SMALL_DIORITE_BRICKS_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "granite_bricks_stairs"), GRANITE_BRICKS_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "small_granite_bricks_stairs"), SMALL_GRANITE_BRICKS_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "andesite_bricks_stairs"), ANDESITE_BRICKS_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "small_andesite_bricks_stairs"), SMALL_ANDESITE_BRICKS_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "small_stone_bricks_stairs"), SMALL_STONE_BRICKS_STAIRS);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "diorite_bricks_slab"), DIORITE_BRICKS_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "small_diorite_bricks_slab"), SMALL_DIORITE_BRICKS_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "granite_bricks_slab"), GRANITE_BRICKS_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "small_granite_bricks_slab"), SMALL_GRANITE_BRICKS_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "andesite_bricks_slab"), ANDESITE_BRICKS_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "small_andesite_bricks_slab"), SMALL_ANDESITE_BRICKS_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "small_stone_bricks_slab"), SMALL_STONE_BRICKS_SLAB);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "topaz_block"), TOPAZ_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "opal_block"), OPAL_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "sapphire_block"), SAPPHIRE_BLOCK);
        
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "chrome_block"), CHROME_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "uranium_block"), URANIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "cobalt_block"), COBALT_BLOCK);
        
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "raw_tin_block"), RAW_TIN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "raw_silver_block"), RAW_SILVER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "raw_bronze_block"), RAW_BRONZE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "raw_steel_block"), RAW_STEEL_BLOCK);
        
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "tin_block"), TIN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "silver_block"), SILVER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "bronze_block"), BRONZE_BLOCK);
        
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "carbon_steel_block"), CARBON_STEEL_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "blazing_steel_block"), BLAZING_STEEL_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "archeosite_block"), ARCHEOSITE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "thelosite_block"), THELOSITE_BLOCK);
    
        //ITEM

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "diorite_bricks"), new BlockItem(DIORITE_BRICKS, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "small_diorite_bricks"), new BlockItem(SMALL_DIORITE_BRICKS, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "granite_bricks"), new BlockItem(GRANITE_BRICKS, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "small_granite_bricks"), new BlockItem(SMALL_GRANITE_BRICKS, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "andesite_bricks"), new BlockItem(ANDESITE_BRICKS, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "small_andesite_bricks"), new BlockItem(SMALL_ANDESITE_BRICKS, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "small_stone_bricks"), new BlockItem(SMALL_STONE_BRICKS, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "diorite_bricks_stairs"), new BlockItem(DIORITE_BRICKS_STAIRS, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "small_diorite_bricks_stairs"), new BlockItem(SMALL_DIORITE_BRICKS_STAIRS, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "granite_bricks_stairs"), new BlockItem(GRANITE_BRICKS_STAIRS, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "small_granite_bricks_stairs"), new BlockItem(SMALL_GRANITE_BRICKS_STAIRS, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "andesite_bricks_stairs"), new BlockItem(ANDESITE_BRICKS_STAIRS, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "small_andesite_bricks_stairs"), new BlockItem(SMALL_ANDESITE_BRICKS_STAIRS, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "small_stone_bricks_stairs"), new BlockItem(SMALL_STONE_BRICKS_STAIRS, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "diorite_bricks_slab"), new BlockItem(DIORITE_BRICKS_SLAB, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "small_diorite_bricks_slab"), new BlockItem(SMALL_DIORITE_BRICKS_SLAB, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "granite_bricks_slab"), new BlockItem(GRANITE_BRICKS_SLAB, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "small_granite_bricks_slab"), new BlockItem(SMALL_GRANITE_BRICKS_SLAB, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "andesite_bricks_slab"), new BlockItem(ANDESITE_BRICKS_SLAB, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "small_andesite_bricks_slab"), new BlockItem(SMALL_ANDESITE_BRICKS_SLAB, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "small_stone_bricks_slab"), new BlockItem(SMALL_STONE_BRICKS_SLAB, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "topaz_block"), new BlockItem(TOPAZ_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "opal_block"), new BlockItem(OPAL_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ruby_block"), new BlockItem(RUBY_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "sapphire_block"), new BlockItem(SAPPHIRE_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "chrome_block"), new BlockItem(CHROME_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "uranium_block"), new BlockItem(URANIUM_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cobalt_block"), new BlockItem(COBALT_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_tin_block"), new BlockItem(RAW_TIN_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_silver_block"), new BlockItem(RAW_SILVER_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_bronze_block"), new BlockItem(RAW_BRONZE_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_steel_block"), new BlockItem(RAW_STEEL_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "tin_block"), new BlockItem(TIN_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "silver_block"), new BlockItem(SILVER_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_block"), new BlockItem(BRONZE_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "carbon_steel_block"), new BlockItem(CARBON_STEEL_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_block"), new BlockItem(BLAZING_STEEL_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_block"), new BlockItem(ARCHEOSITE_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_block"), new BlockItem(THELOSITE_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        
    
        }
}
