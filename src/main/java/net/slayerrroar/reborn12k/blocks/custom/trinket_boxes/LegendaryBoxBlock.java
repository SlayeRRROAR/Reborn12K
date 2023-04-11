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

public class LegendaryBoxBlock extends Block {
    public LegendaryBoxBlock(Settings settings) {
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
        int upperbound = 6;
        int rarity_int = rarityRand.nextInt(upperbound);


        if(rarity_int != 0) {
            randomLegendary(player);
            player.sendMessage(Text.translatable("item.reborn12k.locked_strongbox.epic"), true);
        }
        if(rarity_int == 0) {
            randomMythical(player);
            player.sendMessage(Text.translatable("item.reborn12k.locked_strongbox.mythicary"), true);
        }
    }

    private void randomLegendary(PlayerEntity player) {
        Random randLegend = new Random();
        int upperbound = 15;
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
            player.dropItem(ItemTrinkets.FOCUS_BELT, 1);
        }
        if(legend_int == 12) {
            player.dropItem(ItemTrinkets.EXPERT_BELT, 1);
        }
        if(legend_int == 13) {
            player.dropItem(ItemTrinkets.JETPACK, 1);
        }
        if(legend_int == 14) {
            player.dropItem(ItemTrinkets.MAGNIFYING_GLASS, 1);
        }
    }

    private void randomMythical(PlayerEntity player) {
        Random randMythic = new Random();
        int upperbound = 7;
        int mythic_int = randMythic.nextInt(upperbound);

        if(mythic_int == 0) {
            player.dropItem(ItemTrinkets.GRIFFIN_FEATHER, 1);
        }
        if(mythic_int == 1) {
            player.dropItem(ItemTrinkets.GOLEM_CORE, 1);
        }
        if(mythic_int == 2) {
            player.dropItem(ItemTrinkets.LEVIATHAN_EYE, 1);
        }
        if(mythic_int == 3) {
            player.dropItem(ItemTrinkets.DRAGON_FANG, 1);
        }
        if(mythic_int == 4) {
            player.dropItem(ItemTrinkets.ANGEL_TEAR, 1);
        }
        if(mythic_int == 5) {
            player.dropItem(ItemTrinkets.BASILISK_TOOTH, 1);
        }
        if(mythic_int == 6) {
            player.dropItem(ItemTrinkets.PHOENIX_PLUME, 1);
        }
    }

}
