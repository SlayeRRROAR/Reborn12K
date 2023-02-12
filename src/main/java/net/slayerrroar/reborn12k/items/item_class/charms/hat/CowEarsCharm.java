package net.slayerrroar.reborn12k.items.item_class.charms.hat;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class CowEarsCharm extends TrinketItem implements Trinket {
    public CowEarsCharm(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        World world = entity.getWorld();
        if (!world.isClient) {
            cleanseNegativeEffects(entity);
        }
    }

    private void cleanseNegativeEffects(LivingEntity entity) {
        entity.removeStatusEffect(StatusEffects.SLOWNESS);
        entity.removeStatusEffect(StatusEffects.WEAKNESS);
        entity.removeStatusEffect(StatusEffects.POISON);
        entity.removeStatusEffect(StatusEffects.BLINDNESS);
        entity.removeStatusEffect(StatusEffects.DARKNESS);
        entity.removeStatusEffect(StatusEffects.MINING_FATIGUE);
        entity.removeStatusEffect(StatusEffects.HUNGER);
        entity.removeStatusEffect(StatusEffects.NAUSEA);
        entity.removeStatusEffect(StatusEffects.UNLUCK);
        entity.removeStatusEffect(StatusEffects.WITHER);
        entity.removeStatusEffect(StatusEffects.LEVITATION);
        entity.removeStatusEffect(StatusEffects.BAD_OMEN);

    }



    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.fake_ears.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.fake_ears.tooltip2"));
    }

}
