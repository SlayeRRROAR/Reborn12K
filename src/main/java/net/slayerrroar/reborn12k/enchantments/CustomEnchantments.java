package net.slayerrroar.reborn12k.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.enchantments.enchant.KissOfDeath_Ench;
import net.slayerrroar.reborn12k.enchantments.enchant.MagicProtection_Ench;

public class CustomEnchantments {

    private static final Enchantment KISS_OF_DEATH = new KissOfDeath_Ench(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    private static final Enchantment MAGIC_PROTECTION = new MagicProtection_Ench(Enchantment.Rarity.COMMON, EnchantmentTarget.ARMOR, new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET});


    public static void register() {

        Registry.register(Registry.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "kiss_of_death"), KISS_OF_DEATH);
        Registry.register(Registry.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "magic_protection"), MAGIC_PROTECTION);

    }

}