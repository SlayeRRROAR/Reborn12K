package net.slayerrroar.reborn12k.enchantments.enchant.armor;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;

public class MagicProtectionEnchantment extends Enchantment {
    public MagicProtectionEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return true;
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.PROTECTION && other != Enchantments.BLAST_PROTECTION && other != Enchantments.FIRE_PROTECTION && other != Enchantments.PROJECTILE_PROTECTION;
    }

    @Override
    public int getMinPower(int level) { return (level-1)*10; }

    @Override
    public int getMaxLevel() {
        return 4;
    }

    @Override
    public int getProtectionAmount(int level, DamageSource source) {
        if (source.bypassesArmor() || source.isUnblockable()) {
            return level;
        } else
            return 0;
    }
}