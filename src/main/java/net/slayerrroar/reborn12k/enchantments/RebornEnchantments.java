package net.slayerrroar.reborn12k.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.enchantments.enchant.armor.MagicProtectionEnchantment;
import net.slayerrroar.reborn12k.enchantments.enchant.bow.WoundingEnchantment;
import net.slayerrroar.reborn12k.enchantments.enchant.weapon.BloodLustEnchantment;
import net.slayerrroar.reborn12k.enchantments.enchant.weapon.FrostBiteEnchantment;
import net.slayerrroar.reborn12k.enchantments.enchant.weapon.KoDeathEnchantment;
import net.slayerrroar.reborn12k.enchantments.enchant.weapon.ToxicEdgeEnchantment;

public class RebornEnchantments {

    public static final Enchantment MAGIC_PROTECTION = new MagicProtectionEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.ARMOR, new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET});

    public static final Enchantment TOXIC_EDGE = new ToxicEdgeEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    public static final Enchantment FROST_BITE = new FrostBiteEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});

    public static final Enchantment BLOODLUST = new BloodLustEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    public static final Enchantment KISS_OF_DEATH = new KoDeathEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});

    public static final Enchantment VENOM = new WoundingEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.BOW, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    public static final Enchantment WOUNDING = new WoundingEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.BOW, new EquipmentSlot[]{EquipmentSlot.MAINHAND});

    public static void register() {

        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Enchantments");

        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "magic_protection"), MAGIC_PROTECTION);

        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "toxic_edge"), TOXIC_EDGE);
        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "frost_bite"), FROST_BITE);

        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "bloodlust"), BLOODLUST);
        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "kiss_of_death"), KISS_OF_DEATH);

        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "venom"), VENOM);
        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "wounding"), WOUNDING);

    }

}