package net.slayerrroar.reborn12k.armors.armor_material;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.slayerrroar.reborn12k.items.SecretItems;

public class PowerArmor implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[]{5, 9, 11, 6};

    // In which A is helmet, B chestplate, C leggings and D boots.
    // For reference, Leather uses {1, 2, 3, 1}, and Diamond/Netherite {3, 6, 8, 3}

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 50;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(SecretItems.CERAMITE_PLATE);
    }

    @Override
    public String getName() {
        return "power";
    }

    @Override
    public float getToughness() {
        return 7;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.4f;
    }

}