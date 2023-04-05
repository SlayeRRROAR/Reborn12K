package net.slayerrroar.reborn12k.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.enchantments.enchant.*;

public class RebornEnchantments {

    public static final Enchantment MAGIC_PROTECTION = new MagicProtection_Ench(Enchantment.Rarity.COMMON, EnchantmentTarget.ARMOR, new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET});
    public static final Enchantment KISS_OF_DEATH = new KissOfDeath_Ench(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    public static final Enchantment TOXIC_THREAD = new ToxicThread_Ench(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    public static final Enchantment FROST_BITE = new FrostBite_Ench(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});

    public static void register() {

        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Enchantments");

        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "magic_protection"), MAGIC_PROTECTION);
        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "kiss_of_death"), KISS_OF_DEATH);
        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "toxic_thread"), TOXIC_THREAD);
        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "frost_bite"), FROST_BITE);

    }

}