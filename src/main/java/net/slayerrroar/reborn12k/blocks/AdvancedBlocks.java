package net.slayerrroar.reborn12k.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.custom_blocks.*;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class AdvancedBlocks {

    public static final Block MARKET_TABLE = registerBlock("market_table", new MarketBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE)), Reborn12KItemGroup.REBORN12K);

    public static final Block FANCY_LAMP = registerBlock("fancy_lamp", new FancyLampBlock(FabricBlockSettings.copy(Blocks.STONE).sounds(BlockSoundGroup.STONE).hardness(5.0f).resistance(6.0f).nonOpaque().luminance(blockstate ->30)), Reborn12KItemGroup.REBORN12K);

    public static final Block ARCANE_PEDESTAL = registerBlock("arcane_pedestal", new ArcanePedestalBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).hardness(2.0f).resistance(20.0f).nonOpaque()), Reborn12KItemGroup.REBORN12K);

    public static final Block ARCANE_ARTIFACT = registerBlock("arcane_artifact", new ArcaneArtifactBlock(FabricBlockSettings.copyOf(Blocks.STONE).hardness(20.0f).resistance(1200.0f).nonOpaque()), Reborn12KItemGroup.REBORN12K);

    public static final Block MINERAL_MANUFACTORY = registerBlock("mineral_manufactory", new MineralManufactoryBlock(FabricBlockSettings.copyOf(Blocks.STONE).hardness(8.0f).resistance(20.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block MELTER = registerBlock("melter", new MelterBlock(FabricBlockSettings.copyOf(Blocks.STONE).hardness(8.0f).resistance(20.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block BASIC_LASER_QUARRY = registerBlock("basic_laser_quarry", new BasicQuarryBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).hardness(12.0f).resistance(200.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block ADVANCED_LASER_QUARRY = registerBlock("advanced_laser_quarry", new AdvancedQuarryBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).hardness(12.0f).resistance(200.0f)), Reborn12KItemGroup.REBORN12K);
    public static final Block ULTIMATE_LASER_QUARRY = registerBlock("ultimate_laser_quarry", new UltimateQuarryBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).hardness(12.0f).resistance(200.0f)), Reborn12KItemGroup.REBORN12K);

    public static final Block SYNTHESIS_CHAMBER = registerBlock("synthesis_chamber", new SynthesisChamberBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).hardness(12.0f).resistance(200.0f)), Reborn12KItemGroup.REBORN12K);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Reborn12K.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void register() {
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Advanced Blocks");
    }
}
