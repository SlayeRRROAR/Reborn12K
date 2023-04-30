package net.slayerrroar.reborn12k.items.custom.magic.staffs.abyss;

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

public class AbyssScepter extends Item {

    public AbyssScepter(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

        world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_EVOKER_PREPARE_SUMMON, SoundCategory.PLAYERS, 0.25f, 1f);
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 20*30, 0, false, false));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 20*30, 0, false, false));

        for (Entity e : world.getOtherEntities(playerEntity, Box.of(playerEntity.getPos(), 10, 10, 10))) {
            if (e instanceof LivingEntity livingEntity) {
                if (playerEntity.distanceTo(livingEntity) < 10) {
                    livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 20*30, 0, false, false));
                    livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 20*30, 0, false, false));
                }
            }
        }
        playerEntity.getItemCooldownManager().set(this, 20*30);
        return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.abyss.tooltip"));
    }

}
