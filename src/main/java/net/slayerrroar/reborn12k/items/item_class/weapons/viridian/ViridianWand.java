package net.slayerrroar.reborn12k.items.item_class.weapons.viridian;

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
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.List;

public class ViridianWand extends Item {

    public ViridianWand(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        tooltip.add(new TranslatableText("item.reborn12k.viridian.tooltip"));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

        world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_EVOKER_PREPARE_SUMMON, SoundCategory.PLAYERS, 0.25f, 1.0f);
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*10, 2));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*10, 1));

        for (Entity e : world.getOtherEntities(playerEntity, Box.of(playerEntity.getPos(), 25, 25, 25))) {
            if (e instanceof PlayerEntity playerEntities) {
                if (playerEntity.distanceTo(playerEntities) < 25) {
                    playerEntities.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*10, 2));
                    playerEntities.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*10, 1));
                }
            }
        }

        playerEntity.getItemCooldownManager().set(this, 20*10);

        return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));

    }
}
