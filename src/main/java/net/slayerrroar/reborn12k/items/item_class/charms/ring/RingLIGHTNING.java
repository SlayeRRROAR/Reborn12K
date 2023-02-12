package net.slayerrroar.reborn12k.items.item_class.charms.ring;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;

public class RingLIGHTNING extends TrinketItem {

    public RingLIGHTNING(Settings settings) {
        super(settings);
    }

    @Override

    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.removeStatusEffect(StatusEffects.HEALTH_BOOST);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 20*20, 0, false, false));
    }
}
