package net.slayerrroar.reborn12k.items.custom.trinkets.ring;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class EarthRing extends TrinketItem {

    public EarthRing(Settings settings) {
        super(settings);
    }

    @Override

    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.removeStatusEffect(StatusEffects.HASTE);
        entity.removeStatusEffect(StatusEffects.RESISTANCE);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20*20, 2, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*20, 1, false, false));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.ring.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.ring_of_earth.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.ring_of_earth.tooltip2"));
    }

}
