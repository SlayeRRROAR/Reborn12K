package net.slayerrroar.reborn12k.items.item_class.staffs.ferrum;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.List;

public class FerrumRod extends Item {

    public FerrumRod(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        tooltip.add(Text.translatable("item.reborn12k.ferrum.tooltip"));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

        world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_EVOKER_PREPARE_SUMMON, SoundCategory.PLAYERS, 0.25f, 1.0f);
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20*15, 0, false, false));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*15, 3, false, false));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 20*15, 0, false, false));

        for (Entity e : world.getOtherEntities(playerEntity, Box.of(playerEntity.getPos(), 20, 20, 20))) {
            if (e instanceof PlayerEntity playerEntities) {
                if (playerEntity.distanceTo(playerEntities) < 20) {
                    playerEntities.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20*15, 0, false, false));
                    playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*15, 3, false, false));
                    playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 20*15, 0, false, false));

                }
            }
        }

        playerEntity.getItemCooldownManager().set(this, 20*30);

        return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));

    }
}
