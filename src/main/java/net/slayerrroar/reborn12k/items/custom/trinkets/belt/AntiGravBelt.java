package net.slayerrroar.reborn12k.items.custom.trinkets.belt;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class AntiGravBelt extends TrinketItem implements Trinket {
    public AntiGravBelt(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if(!entity.isOnGround() && !entity.isSubmergedIn(FluidTags.WATER) && !entity.isSubmergedIn(FluidTags.LAVA)) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 5, 0, false, false));
        }
        super.tick(stack, slot, entity);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.belt.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.antigrav_belt.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.antigrav_belt.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.rare.tooltip"));
    }

}
