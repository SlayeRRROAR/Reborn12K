package net.slayerrroar.reborn12k.util;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.items.TrinketItems;

import java.util.Random;

import static net.minecraft.block.Block.dropStack;

public class StrongboxUtil {

    //Rarities

    public static void randomCommon(World world, BlockPos pos) {
        Random commonRand = new Random();
        int upperboundCommon = 11;
        int common_int = commonRand.nextInt(upperboundCommon);

        if (common_int == 0) {
            dropStack(world, pos, new ItemStack(TrinketItems.SHADES, 1));
        }
        if (common_int == 1) {
            dropStack(world, pos, new ItemStack(TrinketItems.CAT_EARS, 1));
        }
        if (common_int == 2) {
            dropStack(world, pos, new ItemStack(TrinketItems.COW_EARS, 1));
        }
        if (common_int == 3) {
            dropStack(world, pos, new ItemStack(TrinketItems.BUNNY_EARS, 1));
        }
        if (common_int == 4) {
            dropStack(world, pos, new ItemStack(TrinketItems.BAND_OF_FORTITUDE, 1));
        }
        if (common_int == 5) {
            dropStack(world, pos, new ItemStack(TrinketItems.BLOODY_CLAW, 1));
        }
        if (common_int == 6) {
            dropStack(world, pos, new ItemStack(TrinketItems.MEDALLION, 1));
        }
        if (common_int == 7) {
            dropStack(world, pos, new ItemStack(TrinketItems.FRENZY_TONIC, 1));
        }
        if (common_int == 8) {
            dropStack(world, pos, new ItemStack(TrinketItems.LUCKY_CHARM, 1));
        }
        if (common_int == 9) {
            dropStack(world, pos, new ItemStack(TrinketItems.GOLD_POUCH, 1));
        }
        if (common_int == 10) {
            dropStack(world, pos, new ItemStack(TrinketItems.STRONG_SPRING, 1));
        }
    }

    public static void randomRare(World world, BlockPos pos) {
        Random randRare = new Random();
        int upperboundRare = 9;
        int rare_int = randRare.nextInt(upperboundRare);

        if (rare_int == 0) {
            dropStack(world, pos, new ItemStack(TrinketItems.IRON_CROWN, 1));
        }
        if (rare_int == 1) {
            dropStack(world, pos, new ItemStack(TrinketItems.ANTIGRAV_BELT, 1));
        }
        if (rare_int == 2) {
            dropStack(world, pos, new ItemStack(TrinketItems.INDELIBLE_BAND_OF_FORTITUDE, 1));
        }
        if (rare_int == 3) {
            dropStack(world, pos, new ItemStack(TrinketItems.INDELIBLE_BAND_OF_FORTITUDE, 1));
        }
        if (rare_int == 4) {
            dropStack(world, pos, new ItemStack(TrinketItems.INDELIBLE_BLOODY_CLAW, 1));
        }
        if (rare_int == 5) {
            dropStack(world, pos, new ItemStack(TrinketItems.INDELIBLE_MEDALLION, 1));
        }
        if (rare_int == 6) {
            dropStack(world, pos, new ItemStack(TrinketItems.INDELIBLE_FRENZY_TONIC, 1));
        }
        if (rare_int == 7) {
            dropStack(world, pos, new ItemStack(TrinketItems.INDELIBLE_LUCKY_CHARM, 1));
        }
        if (rare_int == 8) {
            dropStack(world, pos, new ItemStack(TrinketItems.BLOODY_ROSE, 1));
        }
    }

    public static void randomEpic(World world, BlockPos pos) {
        Random randEpic = new Random();
        int upperboundEpic = 9;
        int epic_int = randEpic.nextInt(upperboundEpic);

        if (epic_int == 0) {
            dropStack(world, pos, new ItemStack(TrinketItems.LONG_FALL_BOOTS, 1));
        }
        if (epic_int == 1) {
            dropStack(world, pos, new ItemStack(TrinketItems.ENCHANTED_SPRING, 1));
        }
        if (epic_int == 2) {
            dropStack(world, pos, new ItemStack(TrinketItems.ENDLESS_QUIVER, 1));
        }
        if (epic_int == 3) {
            dropStack(world, pos, new ItemStack(TrinketItems.GRIFFIN_FEATHER, 1));
        }
        if (epic_int == 4) {
            dropStack(world, pos, new ItemStack(TrinketItems.ACONITUM, 1));
        }
        if (epic_int == 5) {
            dropStack(world, pos, new ItemStack(TrinketItems.LEVIATHAN_EYE, 1));
        }
        if (epic_int == 6) {
            dropStack(world, pos, new ItemStack(TrinketItems.CRYSTALIZED_EMBER, 1));
        }
        if (epic_int == 7) {
            dropStack(world, pos, new ItemStack(TrinketItems.LOADED_DICE, 1));
        }
        if (epic_int == 8) {
            dropStack(world, pos, new ItemStack(TrinketItems.BASILISK_FANG, 1));
        }

    }

    public static void randomLegendary(World world, BlockPos pos) {
        Random randLegend = new Random();
        int upperboundLegend = 9;
        int legend_int = randLegend.nextInt(upperboundLegend);

        if (legend_int == 0) {
            dropStack(world, pos, new ItemStack(TrinketItems.WINGED_SHOES, 1));
        }
        if (legend_int == 1) {
            dropStack(world, pos, new ItemStack(TrinketItems.GREATER_BAND_OF_FORTITUDE, 1));
        }
        if (legend_int == 2) {
            dropStack(world, pos, new ItemStack(TrinketItems.GREATER_BLOODY_CLAW, 1));
        }
        if (legend_int == 3) {
            dropStack(world, pos, new ItemStack(TrinketItems.GREATER_MEDALLION, 1));
        }
        if (legend_int == 4) {
            dropStack(world, pos, new ItemStack(TrinketItems.GREATER_FRENZY_TONIC, 1));
        }
        if (legend_int == 5) {
            dropStack(world, pos, new ItemStack(TrinketItems.GREATER_LUCKY_CHARM, 1));
        }
        if (legend_int == 6) {
            dropStack(world, pos, new ItemStack(TrinketItems.JETPACK, 1));
        }
        if (legend_int == 7) {
            dropStack(world, pos, new ItemStack(TrinketItems.MAGNIFYING_GLASS, 1));
        }
        if (legend_int == 8) {
            dropStack(world, pos, new ItemStack(TrinketItems.PHOENIX_PLUME, 1));
        }
    }

}
