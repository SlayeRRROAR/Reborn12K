package net.slayerrroar.reborn12k.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.enchantments.enchant.DeathsKiss_Ench;
import net.slayerrroar.reborn12k.enchantments.enchant.MagicProt_Ench;

public class Enchantments {

    private static final Enchantment DEATHSKISS = new DeathsKiss_Ench(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    private static final Enchantment MAGIC_PROTECTION = new MagicProt_Ench(Enchantment.Rarity.COMMON, EnchantmentTarget.ARMOR, new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET});


    public static void register() {

        Registry.register(Registry.ENCHANTMENT, new Identifier("reborn12k", "deathskiss"), DEATHSKISS);
        Registry.register(Registry.ENCHANTMENT, new Identifier("reborn12k", "magic_protection"), MAGIC_PROTECTION);

    }

}
