package net.slayerrroar.reborn12k.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.enchantments.enchant.armor.*;
import net.slayerrroar.reborn12k.enchantments.enchant.bow.*;
import net.slayerrroar.reborn12k.enchantments.enchant.weapon.*;

public class RebornEnchantments {

    public static final Enchantment MAGIC_PROTECTION = new MagicProtectionEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.ARMOR, new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET});

    public static final Enchantment FROST_BITE = new FrostBiteEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    public static final Enchantment JAGGED_TEETH = new ToxicEdgeEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    public static final Enchantment TOXIC_EDGE = new ToxicEdgeEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});

    public static final Enchantment BLOODLUST = new BloodLustEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    public static final Enchantment KISS_OF_DEATH = new KissOfDeathEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});

    public static final Enchantment FRIGID_BOLT = new FrigidBoltEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.BOW, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    public static final Enchantment BARBED_SHOT = new BarbedShotEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.BOW, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    public static final Enchantment VENOMOUS_TIP = new VenomousTipEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.BOW, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    public static final Enchantment WOUNDING = new WoundingEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.BOW, new EquipmentSlot[]{EquipmentSlot.MAINHAND});

    public static void register() {

        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Enchantments");

        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "magic_protection"), MAGIC_PROTECTION);

        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "frost_bite"), FROST_BITE);
        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "jagged_teeth"), JAGGED_TEETH);
        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "toxic_edge"), TOXIC_EDGE);

        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "bloodlust"), BLOODLUST);
        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "kiss_of_death"), KISS_OF_DEATH);

        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "frigid_bolt"), FRIGID_BOLT);
        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "barbed_shot"), BARBED_SHOT);
        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "venomous_tip"), VENOMOUS_TIP);
        Registry.register(Registries.ENCHANTMENT, new Identifier(Reborn12K.MOD_ID, "wounding"), WOUNDING);

    }

}