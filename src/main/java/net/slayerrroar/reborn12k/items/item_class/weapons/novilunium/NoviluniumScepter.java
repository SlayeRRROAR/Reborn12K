package net.slayerrroar.reborn12k.items.item_class.weapons.novilunium;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.MobEntity;
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

public class NoviluniumScepter extends Item {

    public NoviluniumScepter(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        tooltip.add(new TranslatableText("item.reborn12k.novilunium.tooltip"));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

        world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_ILLUSIONER_PREPARE_BLINDNESS, SoundCategory.PLAYERS, 0.5f, 1.0f);
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 20*30, 0, false, false));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 20*30));

        for (Entity e : world.getOtherEntities(playerEntity, Box.of(playerEntity.getPos(), 40, 40, 40))) {
            if (e instanceof MobEntity mobEntity) {
                if (playerEntity.distanceTo(mobEntity) < 40) {
                    mobEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20*30));
                }
            }
        }

        playerEntity.getItemCooldownManager().set(this, 20*30);

        return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));

    }
}
