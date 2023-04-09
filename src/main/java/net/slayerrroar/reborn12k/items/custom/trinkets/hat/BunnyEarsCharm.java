package net.slayerrroar.reborn12k.items.custom.trinkets.hat;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BunnyEarsCharm extends TrinketItem implements Trinket {
    public BunnyEarsCharm(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20*20, 2, false, false));
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.removeStatusEffect(StatusEffects.JUMP_BOOST);
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.playSound(SoundEvents.ENTITY_RABBIT_AMBIENT, 1.0f, 1.0f);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.fake_ears.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.fake_ears.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.hat.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.epic.tooltip"));
    }

}
