package net.slayerrroar.reborn12k.util;

import net.minecraft.entity.player.PlayerEntity;
import net.slayerrroar.reborn12k.items.TrinketItems;

import java.util.Random;

public class StrongboxUtil {

    //Rarities

    public static void randomCommon(PlayerEntity player) {
        Random commonRand = new Random();
        int upperbound = 9;
        int common_int = commonRand.nextInt(upperbound);

        if (common_int == 0) {
            player.dropItem(TrinketItems.GREEN_BELT, 1);
        }
        if (common_int == 1) {
            player.dropItem(TrinketItems.COMFY_LOAFERS, 1);
        }
        if (common_int == 2) {
            player.dropItem(TrinketItems.OLD_NECKLACE, 1);
        }
        if (common_int == 3) {
            player.dropItem(TrinketItems.VAGUE_BAND_OF_FORTITUDE, 1);
        }
        if (common_int == 4) {
            player.dropItem(TrinketItems.VAGUE_BLOODY_CLAW, 1);
        }
        if (common_int == 5) {
            player.dropItem(TrinketItems.VAGUE_MEDALLION, 1);
        }
        if (common_int == 6) {
            player.dropItem(TrinketItems.VAGUE_FRENZY_TONIC, 1);
        }
        if (common_int == 7) {
            player.dropItem(TrinketItems.VAGUE_LUCKY_CHARM, 1);
        }
        if (common_int == 8) {
            player.dropItem(TrinketItems.GOLD_POUCH, 1);
        }
    }

    public static void randomRare(PlayerEntity player) {
        Random randRare = new Random();
        int upperbound = 11;
        int rare_int = randRare.nextInt(upperbound);

        if (rare_int == 0) {
            player.dropItem(TrinketItems.SHADES, 1);
        }
        if (rare_int == 1) {
            player.dropItem(TrinketItems.RED_BELT, 1);
        }
        if (rare_int == 2) {
            player.dropItem(TrinketItems.ANTIGRAV_BELT, 1);
        }
        if (rare_int == 3) {
            player.dropItem(TrinketItems.TRAVELER_SHOES, 1);
        }
        if (rare_int == 4) {
            player.dropItem(TrinketItems.GOLDEN_NECKLACE, 1);
        }
        if (rare_int == 5) {
            player.dropItem(TrinketItems.MINOR_BAND_OF_FORTITUDE, 1);
        }
        if (rare_int == 6) {
            player.dropItem(TrinketItems.MINOR_BLOODY_CLAW, 1);
        }
        if (rare_int == 7) {
            player.dropItem(TrinketItems.MINOR_MEDALLION, 1);
        }
        if (rare_int == 8) {
            player.dropItem(TrinketItems.MINOR_FRENZY_TONIC, 1);
        }
        if (rare_int == 9) {
            player.dropItem(TrinketItems.MINOR_LUCKY_CHARM, 1);
        }
        if (rare_int == 10) {
            player.dropItem(TrinketItems.WEAK_SPRING, 1);
        }
    }

    public static void randomEpic(PlayerEntity player) {
        Random randEpic = new Random();
        int upperbound = 14;
        int epic_int = randEpic.nextInt(upperbound);

        if (epic_int == 0) {
            player.dropItem(TrinketItems.INDELIBLE_BAND_OF_FORTITUDE, 1);
        }
        if (epic_int == 1) {
            player.dropItem(TrinketItems.INDELIBLE_BLOODY_CLAW, 1);
        }
        if (epic_int == 2) {
            player.dropItem(TrinketItems.INDELIBLE_MEDALLION, 1);
        }
        if (epic_int == 3) {
            player.dropItem(TrinketItems.INDELIBLE_FRENZY_TONIC, 1);
        }
        if (epic_int == 4) {
            player.dropItem(TrinketItems.INDELIBLE_LUCKY_CHARM, 1);
        }
        if (epic_int == 5) {
            player.dropItem(TrinketItems.CAT_EARS, 1);
        }
        if (epic_int == 6) {
            player.dropItem(TrinketItems.COW_EARS, 1);
        }
        if (epic_int == 7) {
            player.dropItem(TrinketItems.BUNNY_EARS, 1);
        }
        if (epic_int == 8) {
            player.dropItem(TrinketItems.BLACK_BELT, 1);
        }
        if (epic_int == 9) {
            player.dropItem(TrinketItems.RUNNING_SHOES, 1);
        }
        if (epic_int == 10) {
            player.dropItem(TrinketItems.WINGED_SHOES, 1);
        }
        if (epic_int == 11) {
            player.dropItem(TrinketItems.BEJEWELED_NECKLACE, 1);
        }
        if (epic_int == 12) {
            player.dropItem(TrinketItems.STRONG_SPRING, 1);
        }
        if (epic_int == 13) {
            player.dropItem(TrinketItems.BLOODY_ROSE, 1);
        }

    }

    public static void randomLegendary(PlayerEntity player) {
        Random randLegend = new Random();
        int upperbound = 11;
        int legend_int = randLegend.nextInt(upperbound);

        if (legend_int == 0) {
            player.dropItem(TrinketItems.FOCUS_BELT, 1);
        }
        if (legend_int == 1) {
            player.dropItem(TrinketItems.EXPERT_BELT, 1);
        }
        if (legend_int == 2) {
            player.dropItem(TrinketItems.GREATER_BAND_OF_FORTITUDE, 1);
        }
        if (legend_int == 3) {
            player.dropItem(TrinketItems.GREATER_BLOODY_CLAW, 1);
        }
        if (legend_int == 4) {
            player.dropItem(TrinketItems.GREATER_MEDALLION, 1);
        }
        if (legend_int == 5) {
            player.dropItem(TrinketItems.GREATER_FRENZY_TONIC, 1);
        }
        if (legend_int == 6) {
            player.dropItem(TrinketItems.GREATER_LUCKY_CHARM, 1);
        }
        if (legend_int == 7) {
            player.dropItem(TrinketItems.HEART_PENDANT, 1);
        }
        if (legend_int == 8) {
            player.dropItem(TrinketItems.JETPACK, 1);
        }
        if (legend_int == 9) {
            player.dropItem(TrinketItems.ENCHANTED_SPRING, 1);
        }
        if (legend_int == 10) {
            player.dropItem(TrinketItems.MAGNIFYING_GLASS, 1);
        }
    }

    public static void randomMythical(PlayerEntity player) {
        Random randMythic = new Random();
        int upperbound = 2;
        int mythic_int = randMythic.nextInt(upperbound);

        if (mythic_int == 0) {
            player.dropItem(TrinketItems.ANGEL_WINGS, 1);
        }
        if (mythic_int == 1) {
            player.dropItem(TrinketItems.PHOENIX_PLUME, 1);
        }
    }

    //Elemental

    public static void randomAir(PlayerEntity player) {
        Random randAir = new Random();
        int upperbound = 2;
        int air_int = randAir.nextInt(upperbound);

        if (air_int == 0) {
            player.dropItem(TrinketItems.GRIFFIN_FEATHER, 1);
        }
        if (air_int == 1) {
            player.dropItem(TrinketItems.AIR_PENDANT, 1);
        }
    }

    public static void randomEarth(PlayerEntity player) {
        Random randEarth = new Random();
        int upperbound = 2;
        int earth_int = randEarth.nextInt(upperbound);

        if (earth_int == 0) {
            player.dropItem(TrinketItems.DEADLY_NIGHTSHADE, 1);
        }
        if (earth_int == 1) {
            player.dropItem(TrinketItems.EARTH_PENDANT, 1);
        }
    }

    public static void randomWater(PlayerEntity player) {
        Random randWater = new Random();
        int upperbound = 2;
        int water_int = randWater.nextInt(upperbound);

        if (water_int == 0) {
            player.dropItem(TrinketItems.LEVIATHAN_EYE, 1);
        }
        if (water_int == 1) {
            player.dropItem(TrinketItems.WATER_PENDANT, 1);
        }
    }

    public static void randomFire(PlayerEntity player) {
        Random randFire = new Random();
        int upperbound = 2;
        int fire_int = randFire.nextInt(upperbound);

        if (fire_int == 0) {
            player.dropItem(TrinketItems.CRYSTALIZED_FIRE, 1);
        }
        if (fire_int == 1) {
            player.dropItem(TrinketItems.FIRE_PENDANT, 1);
        }
    }

    public static void randomLight(PlayerEntity player) {
        Random randLight = new Random();
        int upperbound = 2;
        int light_int = randLight.nextInt(upperbound);

        if (light_int == 0) {
            player.dropItem(TrinketItems.PRAYER_CANDLE, 1);
        }
        if (light_int == 1) {
            player.dropItem(TrinketItems.LIGHT_PENDANT, 1);
        }
    }

    public static void randomDark(PlayerEntity player) {
        Random randDark = new Random();
        int upperbound = 2;
        int dark_int = randDark.nextInt(upperbound);

        if (dark_int == 0) {
            player.dropItem(TrinketItems.BASILISK_FANG, 1);
        }
        if (dark_int == 1) {
            player.dropItem(TrinketItems.DARK_PENDANT, 1);
        }
    }

}
