package net.slayerrroar.reborn12k.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.enchantments.enchant.DeathsKiss_Ench;

public class Enchantments {

    private static final Enchantment DEATHSKISS = new DeathsKiss_Ench(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});

    public static void register() {

        Registry.register(Registry.ENCHANTMENT, new Identifier("reborn12k", "deathskiss"), DEATHSKISS);
    }

}
