package net.slayerrroar.reborn12k.enchantments.enchant.weapon;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.slayerrroar.reborn12k.enchantments.RebornEnchantments;

public class BloodLustEnchantment extends Enchantment {
    public BloodLustEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return true;
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.SHARPNESS && other != Enchantments.SMITE && other != Enchantments.BANE_OF_ARTHROPODS && other != RebornEnchantments.KISS_OF_DEATH;
    }

    public boolean isTreasure() {
        return true;
    }

    public int getMinPower(int level) {
        return level * 25;
    }

    public int getMaxPower(int level) {
        return this.getMinPower(level) + 50;
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (user.getHealth() < user.getMaxHealth() / 2) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10, level, false, false));
        }
    }
}