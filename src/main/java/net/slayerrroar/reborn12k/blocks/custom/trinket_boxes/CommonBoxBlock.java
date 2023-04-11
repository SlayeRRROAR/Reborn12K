package net.slayerrroar.reborn12k.blocks.custom.trinket_boxes;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.items.ItemTrinkets;

import java.util.Random;

@SuppressWarnings("deprecation")

public class CommonBoxBlock extends Block {
    public CommonBoxBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(!player.isSneaking()) {
            if(player.getStackInHand(Hand.MAIN_HAND).isOf(ItemTrinkets.STRONGBOX_KEY)) {
                if(player.isCreative()) {
                    world.breakBlock(pos, false, player);
                }
                if(!player.isCreative()) {
                    world.breakBlock(pos, false, player);
                    player.getStackInHand(Hand.MAIN_HAND).decrement(1);
                }
                randomRarityLoot(player);
                return ActionResult.SUCCESS;
            }
            player.sendMessage(Text.translatable("item.reborn12k.locked_strongbox.tooltip"), true);
            return ActionResult.FAIL;
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }

    private void randomRarityLoot(PlayerEntity player) {
        Random rarityRand = new Random();
        int upperbound = 101;
        int rarity_int = rarityRand.nextInt(upperbound);


        if(rarity_int < 80) {
            randomCommon(player);
            player.sendMessage(Text.translatable("item.reborn12k.locked_strongbox.common"), true);
        }
        if(rarity_int < 95 && rarity_int > 79) {
            randomRare(player);
            player.sendMessage(Text.translatable("item.reborn12k.locked_strongbox.rare"), true);
        }
        if(rarity_int < 99 && rarity_int > 94) {
            randomEpic(player);
            player.sendMessage(Text.translatable("item.reborn12k.locked_strongbox.epic"), true);
        }
        if(rarity_int == 100) {
            randomLegendary(player);
            player.sendMessage(Text.translatable("item.reborn12k.locked_strongbox.legendary"), true);
        }
    }

    private void randomCommon(PlayerEntity player) {
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
        if(common_int == 8) {
            player.dropItem(ItemTrinkets.GOLD_POUCH, 1);
        }
        if(common_int == 9) {
            player.dropItem(ItemTrinkets.MAGNET, 1);
        }
    }

    private void randomRare(PlayerEntity player) {
        Random randRare = new Random();
        int upperbound = 8;
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
    }

    private void randomEpic(PlayerEntity player) {
        Random randEpic = new Random();
        int upperbound = 7;
        int epic_int = randEpic.nextInt(upperbound);

        if(epic_int == 0) {
            player.dropItem(ItemTrinkets.CAT_EARS, 1);
        }
        if(epic_int == 1) {
            player.dropItem(ItemTrinkets.COW_EARS, 1);
        }
        if(epic_int == 2) {
            player.dropItem(ItemTrinkets.BUNNY_EARS, 1);
        }
        if(epic_int == 3) {
            player.dropItem(ItemTrinkets.BLACK_BELT, 1);
        }
        if(epic_int == 4) {
            player.dropItem(ItemTrinkets.RUNNING_SHOES, 1);
        }
        if(epic_int == 5) {
            player.dropItem(ItemTrinkets.BEJEWELED_NECKLACE, 1);
        }
        if(epic_int == 6) {
            player.dropItem(ItemTrinkets.BLOODY_ROSE, 1);
        }

    }

    private void randomLegendary(PlayerEntity player) {
        Random randLegend = new Random();
        int upperbound = 13;
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
            player.dropItem(ItemTrinkets.AIR_IMPULSE, 1);
        }
        if(legend_int == 5) {
            player.dropItem(ItemTrinkets.EARTH_IMPULSE, 1);
        }
        if(legend_int == 6) {
            player.dropItem(ItemTrinkets.WATER_IMPULSE, 1);
        }
        if(legend_int == 7) {
            player.dropItem(ItemTrinkets.FIRE_IMPULSE, 1);
        }
        if(legend_int == 8) {
            player.dropItem(ItemTrinkets.LIGHT_IMPULSE, 1);
        }
        if(legend_int == 9) {
            player.dropItem(ItemTrinkets.DARK_IMPULSE, 1);
        }
        if(legend_int == 10) {
            player.dropItem(ItemTrinkets.HEART_PENDANT, 1);
        }
        if(legend_int == 11) {
            player.dropItem(ItemTrinkets.JETPACK, 1);
        }
        if(legend_int == 12) {
            player.dropItem(ItemTrinkets.MAGNIFYING_GLASS, 1);
        }
    }

}
