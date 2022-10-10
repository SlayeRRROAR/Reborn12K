package net.slayerrroar.reborn12k.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class OreBlocks {

    public static final Block TIN_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f));
    public static final Block SILVER_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f));
    public static final Block LEAD_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f));
    public static final Block NICKEL_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f));
    public static final Block TITANIUM_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f), UniformIntProvider.create(2, 6));
    public static final Block CHROMITE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f), UniformIntProvider.create(1, 5));

    public static final Block SAPPHIRE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f), UniformIntProvider.create(2, 6));
    public static final Block RUBY_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f), UniformIntProvider.create(2, 6));
    public static final Block OPAL_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f), UniformIntProvider.create(2, 6));

    public static final Block MANATITE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(4.5f).resistance(3.0f), UniformIntProvider.create(4, 9));

    public static final Block DEEPSLATE_SILVER_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f));
    public static final Block DEEPSLATE_LEAD_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f));
    public static final Block DEEPSLATE_NICKEL_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f));
    public static final Block DEEPSLATE_TITANIUM_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f), UniformIntProvider.create(3, 7));
    public static final Block DEEPSLATE_CHROMITE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f), UniformIntProvider.create(2, 6));

    public static final Block DEEPSLATE_SAPPHIRE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f), UniformIntProvider.create(3, 7));
    public static final Block DEEPSLATE_RUBY_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f), UniformIntProvider.create(3, 7));
    public static final Block DEEPSLATE_OPAL_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f), UniformIntProvider.create(3, 7));

    public static final Block DEEPSLATE_MANATITE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(5.0f).resistance(3.0f), UniformIntProvider.create(5, 10));

    public static final Block NETHER_ALUMINUM_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE).requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE).hardness(4.5f).resistance(3.0f));
    public static final Block NETHER_TUNGSTEN_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE).requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE).hardness(4.5f).resistance(3.0f));
    public static final Block NETHER_URANIUM_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE).requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE).hardness(4.5f).resistance(3.0f));

    public static final Block END_COBALT_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(15.0f).resistance(9.0f), UniformIntProvider.create(3, 7));
    public static final Block END_PLATINUM_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(15.0f).resistance(9.0f), UniformIntProvider.create(3, 7));
    public static final Block END_IRIDIUM_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(15.0f).resistance(9.0f), UniformIntProvider.create(3, 7));


    public static void register(){

        //BLOCK

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "tin_ore"), TIN_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "silver_ore"), SILVER_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "lead_ore"), LEAD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "nickel_ore"), NICKEL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "titanium_ore"), TITANIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "chromite_ore"), CHROMITE_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "opal_ore"), OPAL_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "manatite_ore"), MANATITE_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "deepslate_silver_ore"), DEEPSLATE_SILVER_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "deepslate_lead_ore"), DEEPSLATE_LEAD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "deepslate_nickel_ore"), DEEPSLATE_NICKEL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "deepslate_titanium_ore"), DEEPSLATE_TITANIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "deepslate_chromite_ore"), DEEPSLATE_CHROMITE_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "deepslate_opal_ore"), DEEPSLATE_OPAL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "deepslate_ruby_ore"), DEEPSLATE_RUBY_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "deepslate_sapphire_ore"), DEEPSLATE_SAPPHIRE_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "deepslate_manatite_ore"), DEEPSLATE_MANATITE_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "nether_aluminum_ore"), NETHER_ALUMINUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "nether_tungsten_ore"), NETHER_TUNGSTEN_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "nether_uranium_ore"), NETHER_URANIUM_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "end_cobalt_ore"), END_COBALT_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "end_platinum_ore"), END_PLATINUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "end_iridium_ore"), END_IRIDIUM_ORE);


        //ITEM

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "tin_ore"), new BlockItem(TIN_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "silver_ore"), new BlockItem(SILVER_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "lead_ore"), new BlockItem(LEAD_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "nickel_ore"), new BlockItem(NICKEL_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "titanium_ore"), new BlockItem(TITANIUM_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "chromite_ore"), new BlockItem(CHROMITE_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "sapphire_ore"), new BlockItem(SAPPHIRE_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ruby_ore"), new BlockItem(RUBY_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "opal_ore"), new BlockItem(OPAL_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "manatite_ore"), new BlockItem(MANATITE_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "deepslate_silver_ore"), new BlockItem(DEEPSLATE_SILVER_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "deepslate_lead_ore"), new BlockItem(DEEPSLATE_LEAD_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "deepslate_nickel_ore"), new BlockItem(DEEPSLATE_NICKEL_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "deepslate_titanium_ore"), new BlockItem(DEEPSLATE_TITANIUM_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "deepslate_chromite_ore"), new BlockItem(DEEPSLATE_CHROMITE_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "deepslate_sapphire_ore"), new BlockItem(DEEPSLATE_SAPPHIRE_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "deepslate_ruby_ore"), new BlockItem(DEEPSLATE_RUBY_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "deepslate_opal_ore"), new BlockItem(DEEPSLATE_OPAL_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "deepslate_manatite_ore"), new BlockItem(DEEPSLATE_MANATITE_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "nether_aluminum_ore"), new BlockItem(NETHER_ALUMINUM_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "nether_tungsten_ore"), new BlockItem(NETHER_TUNGSTEN_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "nether_uranium_ore"), new BlockItem(NETHER_URANIUM_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "end_cobalt_ore"), new BlockItem(END_COBALT_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "end_platinum_ore"), new BlockItem(END_PLATINUM_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "end_iridium_ore"), new BlockItem(END_IRIDIUM_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).group(ItemGroup.BUILDING_BLOCKS)));

    }
}
