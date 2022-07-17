package net.slayerrroar.reborn12k.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class OreBlocks {

    public static final Block TIN_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f));
    public static final Block CHROMITE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f));
    public static final Block SILVER_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f));
    public static final Block TITANIUM_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f));

    public static final Block DEEPSLATE_CHROMITE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f));
    public static final Block DEEPSLATE_SILVER_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f));
    public static final Block DEEPSLATE_TITANIUM_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f));

    public static final Block NETHER_CHROMITE_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE).requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE).hardness(4.5f).resistance(3.0f));
    public static final Block NETHER_ALUMINUM_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE).requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE).hardness(4.5f).resistance(3.0f));

    public static final Block END_COBALT_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(15.0f).resistance(9.0f), UniformIntProvider.create(3, 7));
    public static final Block END_IRIDIUM_ORE = new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(15.0f).resistance(9.0f), UniformIntProvider.create(3, 7));


    public static void register(){

        //BLOCK

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "tin_ore"), TIN_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "chromite_ore"), CHROMITE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "silver_ore"), SILVER_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "titanium_ore"), TITANIUM_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "deepslate_chromite_ore"), DEEPSLATE_CHROMITE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "deepslate_silver_ore"), DEEPSLATE_SILVER_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "deepslate_titanium_ore"), DEEPSLATE_TITANIUM_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "nether_chromite_ore"), NETHER_CHROMITE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "nether_aluminum_ore"), NETHER_ALUMINUM_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "end_cobalt_ore"), END_COBALT_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "end_iridium_ore"), END_IRIDIUM_ORE);


        Reborn12K.LOGGER.info("Registering Ore Blocks for " + Reborn12K.MOD_ID);


        //ITEM

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "tin_ore"), new BlockItem(TIN_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "chromite_ore"), new BlockItem(CHROMITE_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "silver_ore"), new BlockItem(SILVER_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "titanium_ore"), new BlockItem(TITANIUM_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "deepslate_chromite_ore"), new BlockItem(DEEPSLATE_CHROMITE_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "deepslate_silver_ore"), new BlockItem(DEEPSLATE_SILVER_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "deepslate_titanium_ore"), new BlockItem(DEEPSLATE_TITANIUM_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "nether_chromite_ore"), new BlockItem(NETHER_CHROMITE_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "nether_aluminum_ore"), new BlockItem(NETHER_ALUMINUM_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "end_cobalt_ore"), new BlockItem(END_COBALT_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "end_iridium_ore"), new BlockItem(END_IRIDIUM_ORE, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)));

        Reborn12K.LOGGER.info("Registering Ore Block Items for " + Reborn12K.MOD_ID);

    }
}
