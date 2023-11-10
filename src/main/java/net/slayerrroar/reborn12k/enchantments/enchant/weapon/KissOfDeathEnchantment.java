package net.slayerrroar.reborn12k.enchantments.enchant.weapon;

import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.sound.SoundEvents;
import net.slayerrroar.reborn12k.enchantments.RebornEnchantments;
import net.slayerrroar.reborn12k.items.TrinketItems;

import java.util.Random;

@SuppressWarnings("OptionalGetWithoutIsPresent")
public class KissOfDeathEnchantment extends Enchantment {
    public KissOfDeathEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return true;
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.SHARPNESS && other != Enchantments.SMITE && other != Enchantments.BANE_OF_ARTHROPODS && other != RebornEnchantments.BLOODLUST;
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
        return 3;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity) {

            boolean hasCharm = TrinketsApi.getTrinketComponent(user).get().isEquipped(TrinketItems.WORN_CHARM);
            boolean hasGreaterCharm = TrinketsApi.getTrinketComponent(user).get().isEquipped(TrinketItems.LUCKY_CHARM);
            boolean hasDice = TrinketsApi.getTrinketComponent(user).get().isEquipped(TrinketItems.LOADED_DICE);

            int charm = hasCharm ? 1 : 0;
            int greaterCharm = hasGreaterCharm ? 3 : 0;
            int dice = hasDice ? 5 : 0;

            int lucky = charm + greaterCharm + dice;

            Random rand = new Random();
            int upperbound = 30 - (5 * (level - 1) + lucky);
            int int_random = rand.nextInt(upperbound);
            if (int_random == 0) {
                target.playSound(SoundEvents.ENTITY_WITHER_AMBIENT , 0.25f, 1f);
                target.kill();
            }
        }
    }
}