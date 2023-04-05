package net.slayerrroar.reborn12k.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.custom.*;
import net.slayerrroar.reborn12k.blocks.custom.minecraft.*;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;
import net.slayerrroar.reborn12k.world.features.tree.AshSaplingGenerator;
import net.slayerrroar.reborn12k.world.features.tree.CherrySaplingGenerator;
import net.slayerrroar.reborn12k.world.features.tree.SlimySaplingGenerator;

@SuppressWarnings("unused")

public class BlockGenerics {

    private static ButtonBlock createWoodenButtonBlock() {
        SoundEvent clickOffSound = SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF;
        SoundEvent clickOnSound = SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON;
        BlockSoundGroup soundGroup = BlockSoundGroup.WOOD;
        return new ButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5F).sounds(soundGroup), 30, true, clickOffSound, clickOnSound);
    }

    public static final Block ASH_LOG = registerBlock("ash_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)), Reborn12KItemGroup.REBORN12K);
    public static final Block CHERRY_LOG = registerBlock("cherry_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)), Reborn12KItemGroup.REBORN12K);
    public static final Block SLIMY_LOG = registerBlock("slimy_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.SLIME_BLOCK).hardness(2.0f).resistance(2.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block ASH_WOOD = registerBlock("ash_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)), Reborn12KItemGroup.REBORN12K);
    public static final Block CHERRY_WOOD = registerBlock("cherry_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)), Reborn12KItemGroup.REBORN12K);

    public static final Block STRIPPED_ASH_LOG = registerBlock("stripped_ash_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)), Reborn12KItemGroup.REBORN12K);
    public static final Block STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)), Reborn12KItemGroup.REBORN12K);

    public static final Block STRIPPED_ASH_WOOD = registerBlock("stripped_ash_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)), Reborn12KItemGroup.REBORN12K);
    public static final Block STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)), Reborn12KItemGroup.REBORN12K);

    public static final Block ASH_PLANKS = registerBlock("ash_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), Reborn12KItemGroup.REBORN12K);
    public static final Block CHERRY_PLANKS = registerBlock("cherry_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), Reborn12KItemGroup.REBORN12K);

    public static final Block ASH_LEAVES = registerBlock("ash_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)), Reborn12KItemGroup.REBORN12K);
    public static final Block CHERRY_LEAVES = registerBlock("cherry_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)), Reborn12KItemGroup.REBORN12K);
    public static final Block SLIMY_LEAVES = registerBlock("slimy_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SLIME_BLOCK).hardness(0.2f).resistance(0.2f)), Reborn12KItemGroup.REBORN12K);

    public static final Block ASH_SAPLING = registerBlock("ash_sapling", new CustomSaplingBlock(new AshSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).noCollision().nonOpaque().breakInstantly()), Reborn12KItemGroup.REBORN12K);
    public static final Block CHERRY_SAPLING = registerBlock("cherry_sapling", new CustomSaplingBlock(new CherrySaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).noCollision().nonOpaque().breakInstantly()), Reborn12KItemGroup.REBORN12K);
    public static final Block SLIMY_SAPLING = registerBlock("slimy_sapling", new CustomSaplingBlock(new SlimySaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).noCollision().nonOpaque().breakInstantly()), Reborn12KItemGroup.REBORN12K);

    public static final Block ASH_STAIRS = registerBlock("ash_stairs", new StairBlock(BlockGenerics.ASH_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)), Reborn12KItemGroup.REBORN12K);
    public static final Block CHERRY_STAIRS = registerBlock("cherry_stairs", new StairBlock(BlockGenerics.CHERRY_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)), Reborn12KItemGroup.REBORN12K);

    public static final Block ASH_SLAB = registerBlock("ash_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)), Reborn12KItemGroup.REBORN12K);
    public static final Block CHERRY_SLAB = registerBlock("cherry_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)), Reborn12KItemGroup.REBORN12K);

    public static final Block ASH_FENCE = registerBlock("ash_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)), Reborn12KItemGroup.REBORN12K);
    public static final Block CHERRY_FENCE = registerBlock("cherry_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)), Reborn12KItemGroup.REBORN12K);

    public static final Block ASH_FENCE_GATE = registerBlock("ash_fence_gate", new FenceGateBlocks(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)), Reborn12KItemGroup.REBORN12K);
    public static final Block CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate", new FenceGateBlocks(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)), Reborn12KItemGroup.REBORN12K);

    public static final Block ASH_BUTTON = registerBlock("ash_button", new WoodenButtonBlocks(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), Reborn12KItemGroup.REBORN12K);
    public static final Block CHERRY_BUTTON = registerBlock("cherry_button", createWoodenButtonBlock(), Reborn12KItemGroup.REBORN12K);

    public static final Block ASH_PRESSURE_PLATE = registerBlock("ash_pressure_plate", new WoodenPressurePlateBlocks(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE)), Reborn12KItemGroup.REBORN12K);
    public static final Block CHERRY_PRESSURE_PLATE = registerBlock("cherry_pressure_plate", new WoodenPressurePlateBlocks(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE)), Reborn12KItemGroup.REBORN12K);

    public static final Block ASH_DOOR = registerBlock("ash_door", new DoorBlocks(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).nonOpaque()), Reborn12KItemGroup.REBORN12K);
    public static final Block CHERRY_DOOR = registerBlock("cherry_door", new DoorBlocks(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).nonOpaque()), Reborn12KItemGroup.REBORN12K);

    public static final Block ASH_TRAPDOOR = registerBlock("ash_trapdoor", new WoodenTrapdoorBlocks(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).nonOpaque()), Reborn12KItemGroup.REBORN12K);
    public static final Block CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor", new WoodenTrapdoorBlocks(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).nonOpaque()), Reborn12KItemGroup.REBORN12K);


    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block SMALL_STONE_BRICKS = registerBlock("small_stone_bricks", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block SMALL_DIORITE_BRICKS = registerBlock("small_diorite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block SMALL_GRANITE_BRICKS = registerBlock("small_granite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block SMALL_ANDESITE_BRICKS = registerBlock("small_andesite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);


    public static final Block DIORITE_BRICKS_STAIRS = registerBlock("diorite_bricks_stairs", new StairBlock(BlockGenerics.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block GRANITE_BRICKS_STAIRS = registerBlock("granite_bricks_stairs", new StairBlock(BlockGenerics.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block ANDESITE_BRICKS_STAIRS = registerBlock("andesite_bricks_stairs", new StairBlock(BlockGenerics.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block SMALL_STONE_BRICKS_STAIRS = registerBlock("small_stone_bricks_stairs", new StairBlock(BlockGenerics.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block SMALL_DIORITE_BRICKS_STAIRS = registerBlock("small_diorite_bricks_stairs", new StairBlock(BlockGenerics.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block SMALL_GRANITE_BRICKS_STAIRS = registerBlock("small_granite_bricks_stairs", new StairBlock(BlockGenerics.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block SMALL_ANDESITE_BRICKS_STAIRS = registerBlock("small_andesite_bricks_stairs", new StairBlock(BlockGenerics.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block DIORITE_BRICKS_SLAB = registerBlock("diorite_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block GRANITE_BRICKS_SLAB = registerBlock("granite_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block ANDESITE_BRICKS_SLAB = registerBlock("andesite_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block SMALL_STONE_BRICKS_SLAB = registerBlock("small_stone_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block SMALL_DIORITE_BRICKS_SLAB = registerBlock("small_diorite_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block SMALL_GRANITE_BRICKS_SLAB = registerBlock("small_granite_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block SMALL_ANDESITE_BRICKS_SLAB = registerBlock("small_andesite_bricks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool().sounds(BlockSoundGroup.STONE).hardness(1.5f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_LEAD_BLOCK = registerBlock("raw_lead_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_CHROME_BLOCK = registerBlock("raw_chrome_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8.0f).resistance(8.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_VANADIUM_BLOCK = registerBlock("raw_vanadium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8.0f).resistance(8.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_NEODYMIUM_BLOCK = registerBlock("raw_neodymium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8.0f).resistance(8.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block", new UraniumBlocks(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8.0f).resistance(8.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block RAW_COBALT_BLOCK = registerBlock("raw_cobalt_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(9.0f).resistance(18.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_OSMIUM_BLOCK = registerBlock("raw_osmium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(10.0f).resistance(30.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(10.0f).resistance(30.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_IRIDIUM_BLOCK = registerBlock("raw_iridium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(10.0f).resistance(30.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block RAW_BRONZE_BLOCK = registerBlock("raw_bronze_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_CONSTANTAN_BLOCK = registerBlock("raw_constantan_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_INVAR_BLOCK = registerBlock("raw_invar_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_ELECTRUM_BLOCK = registerBlock("raw_electrum_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_SIGNALUM_BLOCK = registerBlock("raw_signalum_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8.0f).resistance(200.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_LUMIUM_BLOCK = registerBlock("raw_lumium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).luminance(15).hardness(8.0f).resistance(9.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_ENDERIUM_BLOCK = registerBlock("raw_enderium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).luminance(9).hardness(50.0f).resistance(1200.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_STEEL_BLOCK = registerBlock("raw_steel_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8.0f).resistance(20.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_TUNGSTENSTEEL_BLOCK = registerBlock("raw_tungstensteel_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(12.0f).resistance(200.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_ADVANCED_ALLOY_BLOCK = registerBlock("raw_advanced_alloy_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(12.0f).resistance(200.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_IRIDIUM_ALLOY_BLOCK = registerBlock("raw_iridium_alloy_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(50.0f).resistance(1200.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_ARCHEOSITE_BLOCK = registerBlock("raw_archeosite_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(50.0f).resistance(1200.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RAW_THELOSITE_BLOCK = registerBlock("raw_thelosite_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(50.0f).resistance(1200.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block RAW_NICHIRIN_BLOCK = registerBlock("raw_nichirin_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block TIN_BLOCK = registerBlock("tin_block", new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(3.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block ALUMINUM_BLOCK = registerBlock("aluminum_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(3.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block SILVER_BLOCK = registerBlock("silver_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block LEAD_BLOCK = registerBlock("lead_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block NICKEL_BLOCK = registerBlock("nickel_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block CHROME_BLOCK = registerBlock("chrome_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(4.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block SUNSTONE_BLOCK = registerBlock("sunstone_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.METAL).hardness(8.0f).resistance(10.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block MOONSTONE_BLOCK = registerBlock("moonstone_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.METAL).hardness(8.0f).resistance(10.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block MANATITE_BLOCK = registerBlock("manatite_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.METAL).luminance(8).hardness(8.0f).resistance(10.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block TUNGSTEN_BLOCK = registerBlock("tungsten_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8.0f).resistance(8.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block VANADIUM_BLOCK = registerBlock("vanadium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8.0f).resistance(8.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block NEODYMIUM_BLOCK = registerBlock("neodymium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(7.0f).resistance(8.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block URANIUM_BLOCK = registerBlock("uranium_block", new UraniumBlocks(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8.0f).resistance(8.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block COBALT_BLOCK = registerBlock("cobalt_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(9.0f).resistance(18.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block OSMIUM_BLOCK = registerBlock("osmium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(10.0f).resistance(30.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(10.0f).resistance(30.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block IRIDIUM_BLOCK = registerBlock("iridium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(10.0f).resistance(30.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block BRONZE_BLOCK = registerBlock("bronze_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block CONSTANTAN_BLOCK = registerBlock("constantan_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block INVAR_BLOCK = registerBlock("invar_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block ELECTRUM_BLOCK = registerBlock("electrum_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block SIGNALUM_BLOCK = registerBlock("signalum_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(8.0f).resistance(200.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block LUMIUM_BLOCK = registerBlock("lumium_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).luminance(15).hardness(8.0f).resistance(9.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block ENDERIUM_BLOCK = registerBlock("enderium_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).luminance(9).hardness(50.0f).resistance(1200.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block STEEL_BLOCK = registerBlock("steel_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8.0f).resistance(20.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block TUNGSTENSTEEL_BLOCK = registerBlock("tungstensteel_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(12.0f).resistance(200.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block ADVANCED_ALLOY_BLOCK = registerBlock("advanced_alloy_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(12.0f).resistance(200.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block IRIDIUM_ALLOY_BLOCK = registerBlock("iridium_alloy_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(50.0f).resistance(1200.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block ARCHEOSITE_BLOCK = registerBlock("archeosite_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(50.0f).resistance(1200.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block THELOSITE_BLOCK = registerBlock("thelosite_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(50.0f).resistance(1200.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block MAGISTEEL_BLOCK = registerBlock("magisteel_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).hardness(8.0f).resistance(12.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block NICHIRIN_BLOCK = registerBlock("nichirin_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).hardness(5.0f).resistance(6.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block ORICHALCUM_BLOCK = registerBlock("orichalcum_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).hardness(8.0f).resistance(12.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block MITHRIL_BLOCK = registerBlock("mithril_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).hardness(12.0f).resistance(30.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block DEMONIC_METAL_BLOCK = registerBlock("demonic_metal_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).hardness(12.0f).resistance(30.0f)), Reborn12KItemGroup.REBORN12K);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Reborn12K.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void register() {
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Ore Blocks");
    }
}