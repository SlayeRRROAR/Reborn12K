package net.slayerrroar.reborn12k.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class BlockRebornOres {

    public static final Block TIN_ORE = registerBlock("tin_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block ALUMINUM_ORE = registerBlock("aluminum_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(3.0f).resistance(3.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block SILVER_ORE = registerBlock("silver_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block LEAD_ORE = registerBlock("lead_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block NICKEL_ORE = registerBlock("nickel_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block CHROMITE_ORE = registerBlock("chromite_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f), UniformIntProvider.create(1, 5)), Reborn12KItemGroup.REBORN12K);
    public static final Block TITANIUM_ORE = registerBlock("titanium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f), UniformIntProvider.create(2, 6)), Reborn12KItemGroup.REBORN12K);

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f), UniformIntProvider.create(2, 6)), Reborn12KItemGroup.REBORN12K);
    public static final Block RUBY_ORE = registerBlock("ruby_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(3.0f).resistance(3.0f), UniformIntProvider.create(2, 6)), Reborn12KItemGroup.REBORN12K);

    public static final Block MANATITE_ORE = registerBlock("manatite_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(4.5f).resistance(3.0f), UniformIntProvider.create(4, 9)), Reborn12KItemGroup.REBORN12K);

    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block DEEPSLATE_ALUMINUM_ORE = registerBlock("deepslate_aluminum_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block DEEPSLATE_CHROMITE_ORE = registerBlock("deepslate_chromite_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f), UniformIntProvider.create(2, 6)), Reborn12KItemGroup.REBORN12K);
    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f), UniformIntProvider.create(3, 7)), Reborn12KItemGroup.REBORN12K);

    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f), UniformIntProvider.create(3, 7)), Reborn12KItemGroup.REBORN12K);
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(4.5f).resistance(3.0f), UniformIntProvider.create(3, 7)), Reborn12KItemGroup.REBORN12K);

    public static final Block DEEPSLATE_MANATITE_ORE = registerBlock("deepslate_manatite_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.DEEPSLATE).hardness(5.0f).resistance(3.0f), UniformIntProvider.create(5, 10)), Reborn12KItemGroup.REBORN12K);

    public static final Block NETHER_TUNGSTEN_ORE = registerBlock("nether_tungsten_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE).requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE).hardness(4.5f).resistance(3.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block NETHER_VANADIUM_ORE = registerBlock("nether_vanadium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE).requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE).hardness(4.5f).resistance(3.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block NETHER_NEODYMIUM_ORE = registerBlock("nether_neodymium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE).requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE).hardness(4.5f).resistance(3.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block NETHER_URANIUM_ORE = registerBlock("nether_uranium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE).requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE).hardness(4.5f).resistance(3.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block END_COBALT_ORE = registerBlock("end_cobalt_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(9.0f).resistance(9.0f), UniformIntProvider.create(3, 7)), Reborn12KItemGroup.REBORN12K);
    public static final Block END_OSMIUM_ORE = registerBlock("end_osmium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(10.0f).resistance(9.0f), UniformIntProvider.create(3, 7)), Reborn12KItemGroup.REBORN12K);
    public static final Block END_PLATINUM_ORE = registerBlock("end_platinum_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(10.0f).resistance(9.0f), UniformIntProvider.create(3, 7)), Reborn12KItemGroup.REBORN12K);
    public static final Block END_IRIDIUM_ORE = registerBlock("end_iridium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).requiresTool().sounds(BlockSoundGroup.STONE).hardness(10.0f).resistance(9.0f), UniformIntProvider.create(3, 7)), Reborn12KItemGroup.REBORN12K);


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