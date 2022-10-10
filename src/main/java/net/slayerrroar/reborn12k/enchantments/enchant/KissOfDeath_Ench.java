package net.slayerrroar.reborn12k.enchantments.enchant;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.sound.SoundEvents;

import java.util.Random;

public class KissOfDeath_Ench extends Enchantment {
    public KissOfDeath_Ench(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return true;
    }

    @Override
    protected boolean canAccept(Enchantment other) {

        return super.canAccept(other) && other != Enchantments.SHARPNESS && other != Enchantments.SMITE && other != Enchantments.BANE_OF_ARTHROPODS;
    }

    @Override
    public int getMinPower(int level) {
        return 20 + (5*level);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {

            Random rand = new Random();
            int upperbound = 100 - (15 * (level - 1));
            int int_random = rand.nextInt(upperbound);
            if (int_random == 0) {
                target.playSound(SoundEvents.ENTITY_WITHER_AMBIENT , 0.25f, 1.0f);
                target.kill();
            }
        }
    }
}