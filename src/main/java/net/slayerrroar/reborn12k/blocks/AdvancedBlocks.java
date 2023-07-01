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
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.custom.*;
import net.slayerrroar.reborn12k.blocks.custom.block_entities.*;
import net.slayerrroar.reborn12k.blocks.custom.trinket_boxes.*;
import net.slayerrroar.reborn12k.util.ItemGroupUtil;

public class AdvancedBlocks {

    public static final Block MARKET_TABLE = registerBlock("market_table", new MarketBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE)), ItemGroupUtil.REBORN12K);
    public static final Block ALCHEMIC_TABLE = registerBlock("alchemic_table", new AlchemicBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)), ItemGroupUtil.REBORN12K);
    public static final Block FANCY_LAMP = registerBlock("fancy_lamp", new FancyLampBlock(FabricBlockSettings.copy(Blocks.STONE).sounds(BlockSoundGroup.STONE).hardness(5f).resistance(6f).nonOpaque().luminance(blockstate ->30)), ItemGroupUtil.REBORN12K);

    public static final Block WORN_STRONGBOX = registerBlock("worn_strongbox", new WornStrongboxBlock(FabricBlockSettings.copy(Blocks.CHEST)), ItemGroupUtil.REBORN12K);
    public static final Block STRONGBOX = registerBlock("strongbox", new StrongboxBlock(FabricBlockSettings.copy(Blocks.CHEST)), ItemGroupUtil.REBORN12K);
    public static final Block PRISTINE_STRONGBOX = registerBlock("pristine_strongbox", new PristineStrongboxBlock(FabricBlockSettings.copy(Blocks.CHEST)), ItemGroupUtil.REBORN12K);
    public static final Block LEGENDARY_STRONGBOX = registerBlock("legendary_strongbox", new LegendaryStrongboxBlock(FabricBlockSettings.copy(Blocks.CHEST)), ItemGroupUtil.REBORN12K);

    public static final Block AIR_GEM = registerBlock("air_gem", new GemBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).hardness(1f).resistance(20f).nonOpaque()), ItemGroupUtil.REBORN12K);
    public static final Block EARTH_GEM = registerBlock("earth_gem", new GemBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).hardness(1f).resistance(20f).nonOpaque()), ItemGroupUtil.REBORN12K);
    public static final Block WATER_GEM = registerBlock("water_gem", new GemBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).hardness(1f).resistance(20f).nonOpaque()), ItemGroupUtil.REBORN12K);
    public static final Block FIRE_GEM = registerBlock("fire_gem", new GemBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).hardness(1f).resistance(20f).nonOpaque()), ItemGroupUtil.REBORN12K);
    public static final Block SUN_GEM = registerBlock("sun_gem", new GemBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).hardness(1f).resistance(20f).nonOpaque()), ItemGroupUtil.REBORN12K);
    public static final Block MOON_GEM = registerBlock("moon_gem", new GemBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).hardness(1f).resistance(20f).nonOpaque()), ItemGroupUtil.REBORN12K);

    public static final Block ARCANE_PEDESTAL = registerBlock("arcane_pedestal", new ArcanePedestalBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).hardness(2f).resistance(20f).nonOpaque()), ItemGroupUtil.REBORN12K);

    public static final Block ARCANE_ARTIFACT = registerBlock("arcane_artifact", new ArcaneArtifactBlock(FabricBlockSettings.copyOf(Blocks.STONE).hardness(20f).resistance(1200f).nonOpaque()), ItemGroupUtil.REBORN12K);
    public static final Block MANA_CONDENSER = registerBlock("mana_condenser", new ManaCondenserBlock(FabricBlockSettings.copyOf(Blocks.STONE).hardness(8f).resistance(20f).nonOpaque()), ItemGroupUtil.REBORN12K);

    public static final Block CRUSHER = registerBlock("crusher", new CrusherBlock(FabricBlockSettings.copyOf(Blocks.STONE).hardness(8f).resistance(20f)), ItemGroupUtil.REBORN12K);
    public static final Block MANUFACTORY = registerBlock("manufactory", new ManufactoryBlock(FabricBlockSettings.copyOf(Blocks.STONE).hardness(8f).resistance(20f)), ItemGroupUtil.REBORN12K);
    public static final Block MELTER = registerBlock("melter", new MelterBlock(FabricBlockSettings.copyOf(Blocks.STONE).hardness(8f).resistance(20f)), ItemGroupUtil.REBORN12K);

    public static final Block BASIC_LASER_QUARRY = registerBlock("basic_laser_quarry", new BasicQuarryBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).hardness(12f).resistance(200f)), ItemGroupUtil.REBORN12K);
    public static final Block ADVANCED_LASER_QUARRY = registerBlock("advanced_laser_quarry", new AdvancedQuarryBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).hardness(12f).resistance(200f)), ItemGroupUtil.REBORN12K);
    public static final Block ULTIMATE_LASER_QUARRY = registerBlock("ultimate_laser_quarry", new UltimateQuarryBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).hardness(12f).resistance(200f)), ItemGroupUtil.REBORN12K);


    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Reborn12K.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, RegistryKey<ItemGroup> group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void register() {
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Advanced Blocks");
    }
}
