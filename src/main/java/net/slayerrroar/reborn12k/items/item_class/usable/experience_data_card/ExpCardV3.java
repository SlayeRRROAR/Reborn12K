package net.slayerrroar.reborn12k.items.item_class.usable.experience_data_card;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class ExpCardV3 extends Item {
    public ExpCardV3(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        if(playerEntity.isSneaking()) {
            int currentStack = playerEntity.getStackInHand(hand).getCount();
            playerEntity.addExperience(currentStack * 8);
            playerEntity.getStackInHand(hand).decrement(currentStack);
            world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(),
                    SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 0.25F, 0.25F);
        }
        playerEntity.addExperience(8);
        playerEntity.getStackInHand(hand).decrement(1);
        world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(),
                SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 0.25F, 0.25F);
        return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.exp_card.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.exp_card.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.experience_data_card_v3.tooltip"));
    }
}
