package net.slayerrroar.reborn12k.items.item_class.staffs.terra;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
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

public class TerraScepter extends Item {

    public TerraScepter(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        tooltip.add(Text.translatable("item.reborn12k.terra.tooltip"));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

        world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_EVOKER_PREPARE_SUMMON, SoundCategory.PLAYERS, 0.25f, 1.0f);
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*20,  0, false, false));

        for (Entity e : world.getOtherEntities(playerEntity, Box.of(playerEntity.getPos(), 30, 30, 30))) {
            if (e instanceof LivingEntity livingEntity) {
                if (playerEntity.distanceTo(livingEntity) < 30) {
                    livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*20, 0, false, false));
                }
            }
        }

        playerEntity.getItemCooldownManager().set(this, 20*25);

        return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));

    }
}
