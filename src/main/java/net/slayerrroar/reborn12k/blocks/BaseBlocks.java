package net.slayerrroar.reborn12k.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.block_class.*;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;
import net.slayerrroar.reborn12k.world.features.tree.CherrySaplingGenerator;
import net.slayerrroar.reborn12k.world.features.tree.SlimySaplingGenerator;

public class BaseBlocks {

    public static final Block CHERRY_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG));
    public static final Block CHERRY_WOOD = new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD));
    public static final Block STRIPPED_CHERRY_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_CHERRY_WOOD = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD));
    public static final Block CHERRY_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS));

    public static final Block CHERRY_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Block CHERRY_SAPLING = new CustomSaplingBlock(new CherrySaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).noCollision().nonOpaque().breakInstantly());

    public static final Block CHERRY_STAIRS = new StairBlock(BaseBlocks.CHERRY_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS));
    public static final Block CHERRY_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB));
    public static final Block CHERRY_FENCE = new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE));
    public static final Block CHERRY_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE));
    public static final Block CHERRY_BUTTON = new WoodButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON));
    public static final Block CHERRY_PRESSURE_PLATE = new PressurePlateBlocks(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE));
    public static final Block CHERRY_DOOR = new DoorBlocks(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).nonOpaque());
    public static final Block CHERRY_TRAPDOOR = new TrapdoorBlocks(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).nonOpaque());


    public static final Block SLIMY_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.SLIME_BLOCK).hardness(2.0f).resistance(2.0f));
    public static final Block SLIMY_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SLIME_BLOCK).hardness(0.2f).resistance(0.2f));
    public static final Block SLIMY_SAPLING = new CustomSaplingBlock(new SlimySaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).noCollision().nonOpaque().breakInstantly());


    public static final Block DIORITE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_DIORITE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block GRANITE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_GRANITE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block ANDESITE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_ANDESITE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_STONE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));


    public static final Block DIORITE_BRICKS_STAIRS = new StairBlock(BaseBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_DIORITE_BRICKS_STAIRS = new StairBlock(BaseBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block GRANITE_BRICKS_STAIRS = new StairBlock(BaseBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_GRANITE_BRICKS_STAIRS = new StairBlock(BaseBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block ANDESITE_BRICKS_STAIRS = new StairBlock(BaseBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_ANDESITE_BRICKS_STAIRS = new StairBlock(BaseBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_STONE_BRICKS_STAIRS = new StairBlock(BaseBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));

    public static final Block DIORITE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_DIORITE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block GRANITE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_GRANITE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block ANDESITE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_ANDESITE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));
    public static final Block SMALL_STONE_BRICKS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f));

    public static final Block RAW_TIN_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));
    public static final Block RAW_SILVER_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));
    public static final Block RAW_TITANIUM_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));

    public static final Block RAW_ALUMINUM_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(3.0f).resistance(4.0f));

    public static final Block RAW_COBALT_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(20.0f).resistance(30.0f));
    public static final Block RAW_IRIDIUM_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(25.0f).resistance(50.0f));

    public static final Block RAW_BRONZE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));

    public static final Block RAW_ELECTRUM_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(15.0f).resistance(10.0f));
    public static final Block RAW_STEEL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(15.0f).resistance(10.0f));

    public static final Block RAW_SIGNALUM_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(50.0f).resistance(1200.0f));

    public static final Block TIN_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(3.0f).resistance(6.0f));
    public static final Block SILVER_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(3.0f).resistance(6.0f));
    public static final Block CHROME_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));
    public static final Block TITANIUM_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));

    public static final Block ALUMINUM_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(3.0f).resistance(4.0f));

    public static final Block COBALT_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(20.0f).resistance(30.0f));
    public static final Block IRIDIUM_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(25.0f).resistance(50.0f));

    public static final Block BRONZE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f));

    public static final Block ELECTRUM_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(15.0f).resistance(10.0f));
    public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(15.0f).resistance(10.0f));

    public static final Block SIGNALUM_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(50.0f).resistance(1200.0f));
    public static final Block ADVANCED_ALLOY_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(50.0f).resistance(1200.0f));
    public static final Block BLAZING_STEEL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(50.0f).resistance(1200.0f));

    public static final Block ENDERIUM_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(80.0f).resistance(6000.0f));
    public static final Block IRIDIUM_ALLOY_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(80.0f).resistance(6000.0f));
    public static final Block THELOSITE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(80.0f).resistance(6000.0f));
    public static final Block ARCHEOSITE_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(80.0f).resistance(6000.0f));


    public static void register(){

        //BLOCK

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "cherry_log"), CHERRY_LOG);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "cherry_wood"), CHERRY_WOOD);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "stripped_cherry_log"), STRIPPED_CHERRY_LOG);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "stripped_cherry_wood"), STRIPPED_CHERRY_WOOD);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "cherry_planks"), CHERRY_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "cherry_stairs"), CHERRY_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "cherry_slab"), CHERRY_SLAB);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "cherry_leaves"), CHERRY_LEAVES);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "cherry_sapling"), CHERRY_SAPLING);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "cherry_fence"), CHERRY_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "cherry_fence_gate"), CHERRY_FENCE_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "cherry_button"), CHERRY_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "cherry_pressure_plate"), CHERRY_PRESSURE_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "cherry_door"), CHERRY_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "cherry_trapdoor"), CHERRY_TRAPDOOR);


        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "slimy_log"), SLIMY_LOG);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "slimy_leaves"), SLIMY_LEAVES);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "slimy_sapling"), SLIMY_SAPLING);


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


        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "raw_tin_block"), RAW_TIN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "raw_silver_block"), RAW_SILVER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "raw_titanium_block"), RAW_TITANIUM_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "raw_aluminum_block"), RAW_ALUMINUM_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "raw_cobalt_block"), RAW_COBALT_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "raw_iridium_block"), RAW_IRIDIUM_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "raw_bronze_block"), RAW_BRONZE_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "raw_electrum_block"), RAW_ELECTRUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "raw_steel_block"), RAW_STEEL_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "raw_signalum_block"), RAW_SIGNALUM_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "tin_block"), TIN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "silver_block"), SILVER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "chrome_block"), CHROME_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "titanium_block"), TITANIUM_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "aluminum_block"), ALUMINUM_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "cobalt_block"), COBALT_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "iridium_block"), IRIDIUM_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "bronze_block"), BRONZE_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "electrum_block"), ELECTRUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "advanced_alloy_block"), ADVANCED_ALLOY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "steel_block"), STEEL_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "signalum_block"), SIGNALUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "blazing_steel_block"), BLAZING_STEEL_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "enderium_block"), ENDERIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "iridium_alloy_block"), IRIDIUM_ALLOY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "archeosite_block"), ARCHEOSITE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "thelosite_block"), THELOSITE_BLOCK);

        Reborn12K.LOGGER.info("Registering Base Blocks for " + Reborn12K.MOD_ID);
    
        //ITEM

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cherry_log"), new BlockItem(CHERRY_LOG, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cherry_wood"), new BlockItem(CHERRY_WOOD, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "stripped_cherry_log"), new BlockItem(STRIPPED_CHERRY_LOG, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "stripped_cherry_wood"), new BlockItem(STRIPPED_CHERRY_WOOD, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cherry_planks"), new BlockItem(CHERRY_PLANKS, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cherry_stairs"), new BlockItem(CHERRY_STAIRS, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cherry_slab"), new BlockItem(CHERRY_SLAB, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cherry_leaves"), new BlockItem(CHERRY_LEAVES, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cherry_sapling"), new BlockItem(CHERRY_SAPLING, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cherry_fence"), new BlockItem(CHERRY_FENCE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cherry_fence_gate"), new BlockItem(CHERRY_FENCE_GATE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cherry_button"), new BlockItem(CHERRY_BUTTON, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cherry_pressure_plate"), new BlockItem(CHERRY_PRESSURE_PLATE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cherry_door"), new BlockItem(CHERRY_DOOR, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cherry_trapdoor"), new BlockItem(CHERRY_TRAPDOOR, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));


        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "slimy_log"), new BlockItem(SLIMY_LOG, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "slimy_leaves"), new BlockItem(SLIMY_LEAVES, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "slimy_sapling"), new BlockItem(SLIMY_SAPLING, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));


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


        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_tin_block"), new BlockItem(RAW_TIN_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_silver_block"), new BlockItem(RAW_SILVER_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_titanium_block"), new BlockItem(RAW_TITANIUM_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_aluminum_block"), new BlockItem(RAW_ALUMINUM_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_cobalt_block"), new BlockItem(RAW_COBALT_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_iridium_block"), new BlockItem(RAW_IRIDIUM_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_bronze_block"), new BlockItem(RAW_BRONZE_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_electrum_block"), new BlockItem(RAW_ELECTRUM_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_steel_block"), new BlockItem(RAW_STEEL_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "raw_signalum_block"), new BlockItem(RAW_SIGNALUM_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "tin_block"), new BlockItem(TIN_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "silver_block"), new BlockItem(SILVER_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "chrome_block"), new BlockItem(CHROME_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "titanium_block"), new BlockItem(TITANIUM_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "aluminum_block"), new BlockItem(ALUMINUM_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cobalt_block"), new BlockItem(COBALT_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "iridium_block"), new BlockItem(IRIDIUM_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "bronze_block"), new BlockItem(BRONZE_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "electrum_block"), new BlockItem(ELECTRUM_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "steel_block"), new BlockItem(STEEL_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "signalum_block"), new BlockItem(SIGNALUM_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "advanced_alloy_block"), new BlockItem(ADVANCED_ALLOY_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blazing_steel_block"), new BlockItem(BLAZING_STEEL_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "enderium_block"), new BlockItem(ENDERIUM_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "iridium_alloy_block"), new BlockItem(IRIDIUM_ALLOY_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "archeosite_block"), new BlockItem(ARCHEOSITE_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "thelosite_block"), new BlockItem(THELOSITE_BLOCK, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Reborn12K.LOGGER.info("Registering Base Block Items for " + Reborn12K.MOD_ID);


        }
}
