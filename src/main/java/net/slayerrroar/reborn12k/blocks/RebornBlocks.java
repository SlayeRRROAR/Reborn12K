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
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.custom.*;
import net.slayerrroar.reborn12k.blocks.custom.entities.*;
import net.slayerrroar.reborn12k.blocks.custom.trinket_boxes.LegendaryStrongboxBlock;
import net.slayerrroar.reborn12k.blocks.custom.trinket_boxes.PristineStrongboxBlock;
import net.slayerrroar.reborn12k.blocks.custom.trinket_boxes.StrongboxBlock;
import net.slayerrroar.reborn12k.blocks.custom.trinket_boxes.WornStrongboxBlock;
import net.slayerrroar.reborn12k.util.ItemGroupUtil;
import net.slayerrroar.reborn12k.world.features.tree.*;

@SuppressWarnings({"unused", "SameParameterValue"})
public class RebornBlocks {

    public static final Block TIN_BLOCK = registerBlock("tin_block", new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(3f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block ALUMINUM_BLOCK = registerBlock("aluminum_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(3f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block SILVER_BLOCK = registerBlock("silver_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block LEAD_BLOCK = registerBlock("lead_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block NICKEL_BLOCK = registerBlock("nickel_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block CHROME_BLOCK = registerBlock("chrome_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(4f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block TUNGSTEN_BLOCK = registerBlock("tungsten_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8f).resistance(8f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block VANADIUM_BLOCK = registerBlock("vanadium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8f).resistance(8f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block NEODYMIUM_BLOCK = registerBlock("neodymium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(7f).resistance(8f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block URANIUM_BLOCK = registerBlock("uranium_block", new UraniumBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8f).resistance(8f)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block COBALT_BLOCK = registerBlock("cobalt_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(9f).resistance(18f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block OSMIUM_BLOCK = registerBlock("osmium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(10f).resistance(30f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(10f).resistance(30f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block IRIDIUM_BLOCK = registerBlock("iridium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(10f).resistance(30f)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block ARCHEOSITE_BLOCK = registerBlock("archeosite_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(50f).resistance(1200f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block CONSTANTAN_BLOCK = registerBlock("constantan_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block INVAR_BLOCK = registerBlock("invar_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block STEEL_BLOCK = registerBlock("steel_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8f).resistance(20f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block TUNGSTENSTEEL_BLOCK = registerBlock("tungstensteel_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(12f).resistance(200f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block THELOSITE_BLOCK = registerBlock("thelosite_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(50f).resistance(1200f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block ADVANCED_ALLOY_BLOCK = registerBlock("advanced_alloy_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(12f).resistance(200f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block IRIDIUM_ALLOY_BLOCK = registerBlock("iridium_alloy_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(50f).resistance(1200f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block ELECTRUM_BLOCK = registerBlock("electrum_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block SIGNALUM_BLOCK = registerBlock("signalum_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).hardness(8f).resistance(200f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block LUMIUM_BLOCK = registerBlock("lumium_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).luminance(15).hardness(8f).resistance(9f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block ENDERIUM_BLOCK = registerBlock("enderium_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).luminance(9).hardness(50f).resistance(1200f)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block YELLOWCAKE_URANIUM_BLOCK = registerBlock("yellowcake_uranium_block", new UraniumBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool().sounds(BlockSoundGroup.NETHERITE).luminance(7).hardness(8f).resistance(200f)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block MAGISTEEL_BLOCK = registerBlock("magisteel_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).hardness(8f).resistance(12f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block ORICHALCUM_BLOCK = registerBlock("orichalcum_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).hardness(8f).resistance(12f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block MITHRIL_BLOCK = registerBlock("mithril_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).hardness(12f).resistance(30f)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block EMETAL_BLOCK = registerBlock("emetal_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).hardness(12f).resistance(30f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block DARK_ALLOY_BLOCK = registerBlock("dark_alloy_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).hardness(12f).resistance(30f)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block MANATITE_BLOCK = registerBlock("manatite_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.METAL).luminance(8).hardness(8f).resistance(10f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block SUNSTONE_BLOCK = registerBlock("sunstone_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.METAL).hardness(8f).resistance(10f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block MOONSTONE_BLOCK = registerBlock("moonstone_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.METAL).hardness(8f).resistance(10f)), ItemGroupUtil.REBORN_BLOCKS);


    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_LEAD_BLOCK = registerBlock("raw_lead_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_CHROME_BLOCK = registerBlock("raw_chrome_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8f).resistance(8f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_VANADIUM_BLOCK = registerBlock("raw_vanadium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8f).resistance(8f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_NEODYMIUM_BLOCK = registerBlock("raw_neodymium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8f).resistance(8f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block", new UraniumBlock(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8f).resistance(8f)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block RAW_COBALT_BLOCK = registerBlock("raw_cobalt_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(9f).resistance(18f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_OSMIUM_BLOCK = registerBlock("raw_osmium_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(10f).resistance(30f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(10f).resistance(30f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_IRIDIUM_BLOCK = registerBlock("raw_iridium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(10f).resistance(30f)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block RAW_ARCHEOSITE_BLOCK = registerBlock("raw_archeosite_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(50f).resistance(1200f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_BRONZE_BLOCK = registerBlock("raw_bronze_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_CONSTANTAN_BLOCK = registerBlock("raw_constantan_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_INVAR_BLOCK = registerBlock("raw_invar_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_STEEL_BLOCK = registerBlock("raw_steel_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8f).resistance(20f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_TUNGSTENSTEEL_BLOCK = registerBlock("raw_tungstensteel_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(12f).resistance(200f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_THELOSITE_BLOCK = registerBlock("raw_thelosite_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(50f).resistance(1200f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_ADVANCED_ALLOY_BLOCK = registerBlock("raw_advanced_alloy_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(12f).resistance(200f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_IRIDIUM_ALLOY_BLOCK = registerBlock("raw_iridium_alloy_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(50f).resistance(1200f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_ELECTRUM_BLOCK = registerBlock("raw_electrum_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(5f).resistance(6f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_SIGNALUM_BLOCK = registerBlock("raw_signalum_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).hardness(8f).resistance(200f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_LUMIUM_BLOCK = registerBlock("raw_lumium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).luminance(15).hardness(8f).resistance(9f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block RAW_ENDERIUM_BLOCK = registerBlock("raw_enderium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).luminance(9).hardness(50f).resistance(1200f)), ItemGroupUtil.REBORN_BLOCKS);


    public static final Block SLIMY_LOG = registerBlock("slimy_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.SLIME_BLOCK).hardness(2f).resistance(2f)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block ASH_LOG = registerBlock("ash_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block ASH_WOOD = registerBlock("ash_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block STRIPPED_ASH_LOG = registerBlock("stripped_ash_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block STRIPPED_ASH_WOOD = registerBlock("stripped_ash_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block ASH_PLANKS = registerBlock("ash_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block ASH_LEAVES = registerBlock("ash_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)), ItemGroupUtil.REBORN_BLOCKS);
    public static final Block SLIMY_LEAVES = registerBlock("slimy_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SLIME_BLOCK).hardness(0.2f).resistance(0.2f)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block ASH_STAIRS = registerBlock("ash_stairs", new StairsBlock(RebornBlocks.ASH_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block ASH_SLAB = registerBlock("ash_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block ASH_FENCE = registerBlock("ash_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block ASH_FENCE_GATE = registerBlock("ash_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block ASH_BUTTON = registerBlock("ash_button", new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK, 30, true), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block ASH_PRESSURE_PLATE = registerBlock("ash_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block ASH_DOOR = registerBlock("ash_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).nonOpaque(), BlockSetType.OAK), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block ASH_TRAPDOOR = registerBlock("ash_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).nonOpaque(), BlockSetType.OAK), ItemGroupUtil.REBORN_BLOCKS);

    public static final Block SLIMY_SAPLING = registerBlock("slimy_sapling", new SaplingBlock(new SlimySaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).noCollision().nonOpaque().breakInstantly()), ItemGroupUtil.REBORN_DECORATIONS);
    public static final Block ASH_SAPLING = registerBlock("ash_sapling", new SaplingBlock(new AshSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).noCollision().nonOpaque().breakInstantly()), ItemGroupUtil.REBORN_DECORATIONS);

    public static final Block POTTED_SLIMY_SAPLING = registerBlockWithoutItem("potted_slimy_sapling", new FlowerPotBlock(SLIMY_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));
    public static final Block POTTED_ASH_SAPLING = registerBlockWithoutItem("potted_ash_sapling", new FlowerPotBlock(ASH_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));


    public static final Block MARKET_TABLE = registerBlock("market_table", new MarketBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE)), ItemGroupUtil.REBORN_DECORATIONS);
    public static final Block ALCHEMIC_TABLE = registerBlock("alchemic_table", new AlchemicTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)), ItemGroupUtil.REBORN_DECORATIONS);
    public static final Block SHADY_TABLE = registerBlock("shady_table", new BlackTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)), ItemGroupUtil.REBORN_DECORATIONS);
    public static final Block FANCY_LAMP = registerBlock("fancy_lamp", new FancyLampBlock(FabricBlockSettings.copy(Blocks.STONE).sounds(BlockSoundGroup.STONE).hardness(5f).resistance(6f).nonOpaque().luminance(blockstate ->30)), ItemGroupUtil.REBORN_DECORATIONS);

    public static final Block WORN_STRONGBOX = registerBlock("worn_strongbox", new WornStrongboxBlock(FabricBlockSettings.copy(Blocks.CHEST)), ItemGroupUtil.REBORN_TRINKETS);
    public static final Block STRONGBOX = registerBlock("strongbox", new StrongboxBlock(FabricBlockSettings.copy(Blocks.CHEST)), ItemGroupUtil.REBORN_TRINKETS);
    public static final Block PRISTINE_STRONGBOX = registerBlock("pristine_strongbox", new PristineStrongboxBlock(FabricBlockSettings.copy(Blocks.CHEST)), ItemGroupUtil.REBORN_TRINKETS);
    public static final Block LEGENDARY_STRONGBOX = registerBlock("legendary_strongbox", new LegendaryStrongboxBlock(FabricBlockSettings.copy(Blocks.CHEST)), ItemGroupUtil.REBORN_TRINKETS);

    public static final Block AIR_GEM = registerBlock("air_gem", new GemBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).hardness(1f).resistance(20f).nonOpaque()), ItemGroupUtil.REBORN_DECORATIONS);
    public static final Block EARTH_GEM = registerBlock("earth_gem", new GemBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).hardness(1f).resistance(20f).nonOpaque()), ItemGroupUtil.REBORN_DECORATIONS);
    public static final Block WATER_GEM = registerBlock("water_gem", new GemBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).hardness(1f).resistance(20f).nonOpaque()), ItemGroupUtil.REBORN_DECORATIONS);
    public static final Block FIRE_GEM = registerBlock("fire_gem", new GemBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).hardness(1f).resistance(20f).nonOpaque()), ItemGroupUtil.REBORN_DECORATIONS);
    public static final Block SUN_GEM = registerBlock("sun_gem", new GemBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).hardness(1f).resistance(20f).nonOpaque()), ItemGroupUtil.REBORN_DECORATIONS);
    public static final Block MOON_GEM = registerBlock("moon_gem", new GemBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).hardness(1f).resistance(20f).nonOpaque()), ItemGroupUtil.REBORN_DECORATIONS);

    public static final Block ARCANE_PEDESTAL = registerBlock("arcane_pedestal", new ArcanePedestalBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).hardness(2f).resistance(20f).nonOpaque()), ItemGroupUtil.REBORN_DECORATIONS);

    public static final Block ARCANE_ARTIFACT = registerBlock("arcane_artifact", new ArcaneArtifactBlock(FabricBlockSettings.copyOf(Blocks.STONE).hardness(20f).resistance(1200f).nonOpaque()), ItemGroupUtil.REBORN_DECORATIONS);
    public static final Block MANA_CONDENSER = registerBlock("mana_condenser", new ManaCondenserBlock(FabricBlockSettings.copyOf(Blocks.STONE).hardness(8f).resistance(20f).nonOpaque()), ItemGroupUtil.REBORN_DECORATIONS);

    public static final Block CRUSHER = registerBlock("crusher", new CrusherBlock(FabricBlockSettings.copyOf(Blocks.STONE).hardness(8f).resistance(20f)), ItemGroupUtil.REBORN_DECORATIONS);
    public static final Block MANUFACTORY = registerBlock("manufactory", new ManufactoryBlock(FabricBlockSettings.copyOf(Blocks.STONE).hardness(8f).resistance(20f)), ItemGroupUtil.REBORN_DECORATIONS);
    public static final Block MELTER = registerBlock("melter", new MelterBlock(FabricBlockSettings.copyOf(Blocks.STONE).hardness(8f).resistance(20f)), ItemGroupUtil.REBORN_DECORATIONS);

    public static final Block QUARRY = registerBlock("quarry", new QuarryBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).hardness(12f).resistance(200f)), ItemGroupUtil.REBORN_DECORATIONS);



    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Reborn12K.MOD_ID, name), block);
    }
    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Reborn12K.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, RegistryKey<ItemGroup> group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void register() {
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Reborn12K Blocks");
    }
}
