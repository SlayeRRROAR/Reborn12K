package net.slayerrroar.reborn12k.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.enchantments.enchant.DeathsKiss_Ench;
import net.slayerrroar.reborn12k.enchantments.enchant.MagicProt_Ench;

public class Enchantments {

    private static final Enchantment DEATHSKISS = new DeathsKiss_Ench(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    private static final Enchantment MAGIC_PROTECTION = new MagicProt_Ench(Enchantment.Rarity.COMMON, EnchantmentTarget.ARMOR, new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET});


    public static void register() {

        Registry.register(Registry.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "deathskiss"), DEATHSKISS);
        Registry.register(Registry.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "magic_protection"), MAGIC_PROTECTION);

        Reborn12K.LOGGER.info("Registering Enchantments for " + Reborn12K.MOD_ID);

    }

}
