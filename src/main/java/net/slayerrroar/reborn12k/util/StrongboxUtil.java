package net.slayerrroar.reborn12k.util;

import net.minecraft.entity.player.PlayerEntity;
import net.slayerrroar.reborn12k.items.ItemTrinkets;

import java.util.Random;

public class StrongboxUtil {

    public static void randomCommon(PlayerEntity player) {
        Random commonRand = new Random();
        int upperbound = 10;
        int common_int = commonRand.nextInt(upperbound);

        if(common_int == 0) {
            player.dropItem(ItemTrinkets.GREEN_BELT, 1);
        }
        if(common_int == 1) {
            player.dropItem(ItemTrinkets.COMFY_LOAFERS, 1);
        }
        if(common_int == 2) {
            player.dropItem(ItemTrinkets.OLD_NECKLACE, 1);
        }
        if(common_int == 3) {
            player.dropItem(ItemTrinkets.VAGUE_BAND_OF_FORTITUDE, 1);
        }
        if(common_int == 4) {
            player.dropItem(ItemTrinkets.VAGUE_BLOODY_CLAW, 1);
        }
        if(common_int == 5) {
            player.dropItem(ItemTrinkets.VAGUE_WAR_MEDALLION, 1);
        }
        if(common_int == 6) {
            player.dropItem(ItemTrinkets.VAGUE_FRENZY_TONIC, 1);
        }
        if(common_int == 7) {
            player.dropItem(ItemTrinkets.VAGUE_LUCKY_CHARM, 1);
        }
        if(common_int == 8) {
            player.dropItem(ItemTrinkets.GOLD_POUCH, 1);
        }
        if(common_int == 9) {
            player.dropItem(ItemTrinkets.MAGNET, 1);
        }
    }

    public static void randomRare(PlayerEntity player) {
        Random randRare = new Random();
        int upperbound = 9;
        int rare_int = randRare.nextInt(upperbound);

        if(rare_int == 0) {
            player.dropItem(ItemTrinkets.SHADES, 1);
        }
        if(rare_int == 1) {
            player.dropItem(ItemTrinkets.RED_BELT, 1);
        }
        if(rare_int == 2) {
            player.dropItem(ItemTrinkets.TRAVELER_SHOES, 1);
        }
        if(rare_int == 3) {
            player.dropItem(ItemTrinkets.GOLDEN_NECKLACE, 1);
        }
        if(rare_int == 4) {
            player.dropItem(ItemTrinkets.MINOR_BAND_OF_FORTITUDE, 1);
        }
        if(rare_int == 5) {
            player.dropItem(ItemTrinkets.MINOR_BLOODY_CLAW, 1);
        }
        if(rare_int == 6) {
            player.dropItem(ItemTrinkets.MINOR_WAR_MEDALLION, 1);
        }
        if(rare_int == 7) {
            player.dropItem(ItemTrinkets.MINOR_FRENZY_TONIC, 1);
        }
        if(rare_int == 8) {
            player.dropItem(ItemTrinkets.MINOR_LUCKY_CHARM, 1);
        }
    }

    public static void randomEpic(PlayerEntity player) {
        Random randEpic = new Random();
        int upperbound = 12;
        int epic_int = randEpic.nextInt(upperbound);

        if(epic_int == 0) {
            player.dropItem(ItemTrinkets.INDELIBLE_BAND_OF_FORTITUDE, 1);
        }
        if(epic_int == 1) {
            player.dropItem(ItemTrinkets.INDELIBLE_BLOODY_CLAW, 1);
        }
        if(epic_int == 2) {
            player.dropItem(ItemTrinkets.INDELIBLE_WAR_MEDALLION, 1);
        }
        if(epic_int == 3) {
            player.dropItem(ItemTrinkets.INDELIBLE_FRENZY_TONIC, 1);
        }
        if(epic_int == 4) {
            player.dropItem(ItemTrinkets.INDELIBLE_LUCKY_CHARM, 1);
        }
        if(epic_int == 5) {
            player.dropItem(ItemTrinkets.CAT_EARS, 1);
        }
        if(epic_int == 6) {
            player.dropItem(ItemTrinkets.COW_EARS, 1);
        }
        if(epic_int == 7) {
            player.dropItem(ItemTrinkets.BUNNY_EARS, 1);
        }
        if(epic_int == 8) {
            player.dropItem(ItemTrinkets.BLACK_BELT, 1);
        }
        if(epic_int == 9) {
            player.dropItem(ItemTrinkets.RUNNING_SHOES, 1);
        }
        if(epic_int == 10) {
            player.dropItem(ItemTrinkets.BEJEWELED_NECKLACE, 1);
        }
        if(epic_int == 11) {
            player.dropItem(ItemTrinkets.BLOODY_ROSE, 1);
        }

    }

    public static void randomLegendary(PlayerEntity player) {
        Random randLegend = new Random();
        int upperbound = 14;
        int legend_int = randLegend.nextInt(upperbound);

        if(legend_int == 0) {
            player.dropItem(ItemTrinkets.GREATER_BAND_OF_FORTITUDE, 1);
        }
        if(legend_int == 1) {
            player.dropItem(ItemTrinkets.GREATER_BLOODY_CLAW, 1);
        }
        if(legend_int == 2) {
            player.dropItem(ItemTrinkets.GREATER_WAR_MEDALLION, 1);
        }
        if(legend_int == 3) {
            player.dropItem(ItemTrinkets.GREATER_FRENZY_TONIC, 1);
        }
        if(legend_int == 4) {
            player.dropItem(ItemTrinkets.GREATER_FRENZY_TONIC, 1);
        }
        if(legend_int == 5) {
            player.dropItem(ItemTrinkets.AIR_IMPULSE, 1);
        }
        if(legend_int == 6) {
            player.dropItem(ItemTrinkets.EARTH_IMPULSE, 1);
        }
        if(legend_int == 7) {
            player.dropItem(ItemTrinkets.WATER_IMPULSE, 1);
        }
        if(legend_int == 8) {
            player.dropItem(ItemTrinkets.FIRE_IMPULSE, 1);
        }
        if(legend_int == 9) {
            player.dropItem(ItemTrinkets.LIGHT_IMPULSE, 1);
        }
        if(legend_int == 10) {
            player.dropItem(ItemTrinkets.DARK_IMPULSE, 1);
        }
        if(legend_int == 11) {
            player.dropItem(ItemTrinkets.HEART_PENDANT, 1);
        }
        if(legend_int == 12) {
            player.dropItem(ItemTrinkets.JETPACK, 1);
        }
        if(legend_int == 13) {
            player.dropItem(ItemTrinkets.MAGNIFYING_GLASS, 1);
        }
    }

    public static void randomMythical(PlayerEntity player) {
        Random randMythic = new Random();
        int upperbound = 2;
        int mythic_int = randMythic.nextInt(upperbound);

        if(mythic_int == 0) {
            player.dropItem(ItemTrinkets.ANGEL_WINGS, 1);
        }
        if(mythic_int == 1) {
            player.dropItem(ItemTrinkets.PHOENIX_PLUME, 1);
        }
    }

    public static void randomAir(PlayerEntity player) {
        Random randAir = new Random();
        int upperbound = 1;
        int air_int = randAir.nextInt(upperbound);

        if(air_int == 0) {
            player.dropItem(ItemTrinkets.GRIFFIN_FEATHER, 1);
        }
    }

    public static void randomEarth(PlayerEntity player) {
        Random randEarth = new Random();
        int upperbound = 1;
        int earth_int = randEarth.nextInt(upperbound);

        if(earth_int == 0) {
            player.dropItem(ItemTrinkets.GOLEM_CORE, 1);
        }
    }

    public static void randomWater(PlayerEntity player) {
        Random randWater = new Random();
        int upperbound = 1;
        int water_int = randWater.nextInt(upperbound);

        if(water_int == 0) {
            player.dropItem(ItemTrinkets.LEVIATHAN_EYE, 1);
        }
    }

    public static void randomFire(PlayerEntity player) {
        Random randFire = new Random();
        int upperbound = 1;
        int fire_int = randFire.nextInt(upperbound);

        if(fire_int == 0) {
            player.dropItem(ItemTrinkets.DRAGON_FANG, 1);
        }
    }

    public static void randomLight(PlayerEntity player) {
        Random randLight = new Random();
        int upperbound = 1;
        int light_int = randLight.nextInt(upperbound);

        if(light_int == 0) {
            player.dropItem(ItemTrinkets.ANGEL_TEAR, 1);
        }
    }

    public static void randomDark(PlayerEntity player) {
        Random randDark = new Random();
        int upperbound = 1;
        int dark_int = randDark.nextInt(upperbound);

        if(dark_int == 0) {
            player.dropItem(ItemTrinkets.BASILISK_TOOTH, 1);
        }
    }

}