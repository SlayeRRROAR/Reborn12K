package net.slayerrroar.reborn12k.items.custom.trinkets.ring;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class WaterRing extends TrinketItem {

    public WaterRing(Settings settings) {
        super(settings);
    }

    @Override

    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.removeStatusEffect(StatusEffects.DOLPHINS_GRACE);
        entity.removeStatusEffect(StatusEffects.CONDUIT_POWER);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if ((entity).isSubmergedIn(FluidTags.WATER)) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 10, 0, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 10, 0, false, false));
        }
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.ring.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.ring_of_water.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.ring_of_water.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.mythical.tooltip"));
    }

}
