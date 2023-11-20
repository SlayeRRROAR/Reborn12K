package net.slayerrroar.reborn12k.enchantments.enchant.bow;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.slayerrroar.reborn12k.effects.RebornStatusEffects;
import net.slayerrroar.reborn12k.enchantments.RebornEnchantments;

public class BarbedShotEnchantment extends Enchantment {
    public BarbedShotEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return true;
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.FLAME && other != RebornEnchantments.FRIGID_BOLT && other != RebornEnchantments.VENOMOUS_TIP && other != RebornEnchantments.WOUNDING;
    }

    @Override
    public int getMinPower(int level) {
        return 20;
    }

    @Override
    public int getMaxPower(int level) {
        return 50;
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity) {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(RebornStatusEffects.BLEED, 20 * 5, level - 1, true, false));
        }
        super.onTargetDamaged(user, target, level);
    }

}
