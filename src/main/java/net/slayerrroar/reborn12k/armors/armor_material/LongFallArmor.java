package net.slayerrroar.reborn12k.armors.armor_material;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class LongFallArmor implements ArmorMaterial {

    private static final int[] PROTECTION_VALUES = new int[] {2, 5, 6, 2};

    // In which A is helmet, B chestplate, C leggings and D boots.
    // For reference, Leather uses {1, 2, 3, 1}, and Diamond/Netherite {3, 6, 8, 3}

    @Override
    public int getDurability(EquipmentSlot slot) {
        return 0;
    }
    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }
    @Override
    public int getEnchantability() {
        return 0;
    }
    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.OBSIDIAN);
    }
    @Override
    public String getName() {
        return "long_fall";
    }
    @Override
    public float getToughness() {
        return 1;
    }
    @Override
    public float getKnockbackResistance() {
        return 0.0f;
    }

}