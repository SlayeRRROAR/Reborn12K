package net.slayerrroar.reborn12k.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.blocks.block_class.UraniumBlocks;

public class OreBlocks {

    public static final Block TOPAZ_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f));
    public static final Block OPAL_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f));
    public static final Block RUBY_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f));
    public static final Block SAPPHIRE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f));
    public static final Block DEEPSLATE_TOPAZ_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f));
    public static final Block DEEPSLATE_OPAL_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f));
    public static final Block DEEPSLATE_RUBY_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f));
    public static final Block DEEPSLATE_SAPPHIRE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f));

    public static final Block MANATITE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).hardness(4.5f).resistance(3.0f));
    public static final Block DEEPSLATE_MANATITE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.DEEPSLATE).hardness(5.0f).resistance(3.0f));

    public static final Block CHROMITE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f));
    public static final Block DEEPSLATE_URANIUM_ORE = new UraniumBlocks(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f));
    public static final Block NETHER_URANIUM_ORE = new UraniumBlocks(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).sounds(BlockSoundGroup.NETHER_GOLD_ORE).hardness(5.0f).resistance(3.0f));
    public static final Block END_COBALT_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 4).sounds(BlockSoundGroup.STONE).hardness(15.0f).resistance(9.0f));
    
    public static final Block TIN_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1).sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f));
    public static final Block SILVER_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f));
    public static final Block DEEPSLATE_SILVER_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f));
    

    public static void register(){

    //BLOCK
    
    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "topaz_ore"), TOPAZ_ORE);
    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "opal_ore"), OPAL_ORE);
    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "ruby_ore"), RUBY_ORE);
    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "sapphire_ore"), SAPPHIRE_ORE);
    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "deepslate_topaz_ore"), DEEPSLATE_TOPAZ_ORE);
    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "deepslate_opal_ore"), DEEPSLATE_OPAL_ORE);
    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "deepslate_ruby_ore"), DEEPSLATE_RUBY_ORE);
    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "deepslate_sapphire_ore"), DEEPSLATE_SAPPHIRE_ORE);

    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "manatite_ore"), MANATITE_ORE);
    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "deepslate_manatite_ore"), DEEPSLATE_MANATITE_ORE);

    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "chromite_ore"), CHROMITE_ORE);
    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "deepslate_uranium_ore"), DEEPSLATE_URANIUM_ORE);
    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "nether_uranium_ore"), NETHER_URANIUM_ORE);
    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "end_cobalt_ore"), END_COBALT_ORE);

    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "tin_ore"), TIN_ORE);
    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "silver_ore"), SILVER_ORE);
    Registry.register(Registry.BLOCK, new Identifier("reborn12k", "deepslate_silver_ore"), DEEPSLATE_SILVER_ORE);


    //ITEM

    Registry.register(Registry.ITEM, new Identifier("reborn12k", "topaz_ore"), new BlockItem(TOPAZ_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "opal_ore"), new BlockItem(OPAL_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "ruby_ore"), new BlockItem(RUBY_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "sapphire_ore"), new BlockItem(SAPPHIRE_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "deepslate_topaz_ore"), new BlockItem(DEEPSLATE_TOPAZ_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "deepslate_opal_ore"), new BlockItem(DEEPSLATE_OPAL_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "deepslate_ruby_ore"), new BlockItem(DEEPSLATE_RUBY_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "deepslate_sapphire_ore"), new BlockItem(DEEPSLATE_SAPPHIRE_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

    Registry.register(Registry.ITEM, new Identifier("reborn12k", "manatite_ore"), new BlockItem(MANATITE_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "deepslate_manatite_ore"), new BlockItem(DEEPSLATE_MANATITE_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

    Registry.register(Registry.ITEM, new Identifier("reborn12k", "chromite_ore"), new BlockItem(CHROMITE_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "deepslate_uranium_ore"), new BlockItem(DEEPSLATE_URANIUM_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "nether_uranium_ore"), new BlockItem(NETHER_URANIUM_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "end_cobalt_ore"), new BlockItem(END_COBALT_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "tin_ore"), new BlockItem(TIN_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "silver_ore"), new BlockItem(SILVER_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    Registry.register(Registry.ITEM, new Identifier("reborn12k", "deepslate_silver_ore"), new BlockItem(DEEPSLATE_SILVER_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    

    }
}
