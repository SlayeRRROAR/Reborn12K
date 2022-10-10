package net.slayerrroar.reborn12k.fluids;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.fluids.fluidtypes.DestabilizedRedstoneFluid;
import net.slayerrroar.reborn12k.fluids.fluidtypes.EnergizedGlowstoneFluid;
import net.slayerrroar.reborn12k.fluids.fluidtypes.LiquidManaFluid;
import net.slayerrroar.reborn12k.fluids.fluidtypes.ResonantEnderFluid;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class CustomFluids {
    public static FlowableFluid LIQUID_MANA_STILL;
    public static FlowableFluid LIQUID_MANA_FLOWING;
    public static Block LIQUID_MANA_BLOCK;
    public static Item LIQUID_MANA_BUCKET;

    public static FlowableFluid DESTABILIZED_REDSTONE_STILL;
    public static FlowableFluid DESTABILIZED_REDSTONE_FLOWING;
    public static Block DESTABILIZED_REDSTONE_BLOCK;
    public static Item DESTABILIZED_REDSTONE_BUCKET;

    public static FlowableFluid ENERGIZED_GLOWSTONE_STILL;
    public static FlowableFluid ENERGIZED_GLOWSTONE_FLOWING;
    public static Block ENERGIZED_GLOWSTONE_BLOCK;
    public static Item ENERGIZED_GLOWSTONE_BUCKET;

    public static FlowableFluid RESONANT_ENDER_STILL;
    public static FlowableFluid RESONANT_ENDER_FLOWING;
    public static Block RESONANT_ENDER_BLOCK;
    public static Item RESONANT_ENDER_BUCKET;

    public static void register() {

        LIQUID_MANA_STILL = Registry.register(Registry.FLUID,
                new Identifier(Reborn12K.MOD_ID, "liquid_mana_still"), new LiquidManaFluid.Still());
        LIQUID_MANA_FLOWING = Registry.register(Registry.FLUID,
                new Identifier(Reborn12K.MOD_ID, "liquid_mana_flowing"), new LiquidManaFluid.Flowing());

        LIQUID_MANA_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "liquid_mana_block"),
                new FluidBlock(CustomFluids.LIQUID_MANA_STILL, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        LIQUID_MANA_BUCKET = Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "liquid_mana_bucket"),
                new BucketItem(CustomFluids.LIQUID_MANA_STILL, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)
                        .group(ItemGroup.MISC).rarity(Rarity.RARE).recipeRemainder(Items.BUCKET).maxCount(1)));


        DESTABILIZED_REDSTONE_STILL = Registry.register(Registry.FLUID,
                new Identifier(Reborn12K.MOD_ID, "destabilized_redstone_still"), new DestabilizedRedstoneFluid.Still());
        DESTABILIZED_REDSTONE_FLOWING = Registry.register(Registry.FLUID,
                new Identifier(Reborn12K.MOD_ID, "destabilized_redstone_flowing"), new DestabilizedRedstoneFluid.Flowing());

        DESTABILIZED_REDSTONE_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "destabilized_redstone_block"),
                new FluidBlock(CustomFluids.DESTABILIZED_REDSTONE_STILL, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        DESTABILIZED_REDSTONE_BUCKET = Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "destabilized_redstone_bucket"),
                new BucketItem(CustomFluids.DESTABILIZED_REDSTONE_STILL, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)
                        .group(ItemGroup.MISC).recipeRemainder(Items.BUCKET).maxCount(1)));


        ENERGIZED_GLOWSTONE_STILL = Registry.register(Registry.FLUID,
                new Identifier(Reborn12K.MOD_ID, "energized_glowstone_still"), new EnergizedGlowstoneFluid.Still());
        ENERGIZED_GLOWSTONE_FLOWING = Registry.register(Registry.FLUID,
                new Identifier(Reborn12K.MOD_ID, "energized_glowstone_flowing"), new EnergizedGlowstoneFluid.Flowing());

        ENERGIZED_GLOWSTONE_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "energized_glowstone_block"),
                new FluidBlock(CustomFluids.ENERGIZED_GLOWSTONE_STILL, FabricBlockSettings.copyOf(Blocks.WATER).luminance(15)){ });
        ENERGIZED_GLOWSTONE_BUCKET = Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "energized_glowstone_bucket"),
                new BucketItem(CustomFluids.ENERGIZED_GLOWSTONE_STILL, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)
                        .group(ItemGroup.MISC).recipeRemainder(Items.BUCKET).maxCount(1)));


        RESONANT_ENDER_STILL = Registry.register(Registry.FLUID,
                new Identifier(Reborn12K.MOD_ID, "resonant_ender_still"), new ResonantEnderFluid.Still());
        RESONANT_ENDER_FLOWING = Registry.register(Registry.FLUID,
                new Identifier(Reborn12K.MOD_ID, "resonant_ender_flowing"), new ResonantEnderFluid.Flowing());

        RESONANT_ENDER_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Reborn12K.MOD_ID, "resonant_ender_block"),
                new FluidBlock(CustomFluids.RESONANT_ENDER_STILL, FabricBlockSettings.copyOf(Blocks.WATER).luminance(15)){ });
        RESONANT_ENDER_BUCKET = Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "resonant_ender_bucket"),
                new BucketItem(CustomFluids.RESONANT_ENDER_STILL, new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K)
                        .group(ItemGroup.MISC).recipeRemainder(Items.BUCKET).maxCount(1)));

    }

}
