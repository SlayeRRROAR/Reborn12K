package net.slayerrroar.reborn12k.items.custom.trinkets.hat;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class CowEars extends TrinketItem implements Trinket {
    public CowEars(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        World world = entity.world;
        if (!world.isClient) {
            cleanseNegativeEffects(entity);
        }
        super.tick(stack, slot, entity);
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.playSound(SoundEvents.ENTITY_COW_AMBIENT, 0.1f, 1.0f);
    }

    private void cleanseNegativeEffects(LivingEntity entity) {
        entity.removeStatusEffect(StatusEffects.SLOWNESS);
        entity.removeStatusEffect(StatusEffects.POISON);
        entity.removeStatusEffect(StatusEffects.MINING_FATIGUE);
        entity.removeStatusEffect(StatusEffects.HUNGER);
        entity.removeStatusEffect(StatusEffects.NAUSEA);
        entity.removeStatusEffect(StatusEffects.BAD_OMEN);

    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.hat.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.fake_ears.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.fake_ears.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.epic.tooltip"));
    }

}
