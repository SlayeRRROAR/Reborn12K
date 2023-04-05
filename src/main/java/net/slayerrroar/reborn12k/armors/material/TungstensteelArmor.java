package net.slayerrroar.reborn12k.armors.material;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.slayerrroar.reborn12k.items.ItemGenerics;

public class TungstensteelArmor implements ArmorMaterial {

	private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
	private static final int[] PROTECTION_VALUES = new int[] {3, 6, 8, 3};

    // In which A is helmet, B chestplate, C leggings and D boots. 
	// For reference, Leather uses {1, 2, 3, 1}, and Diamond/Netherite {3, 6, 8, 3}

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()]*37;
    }
    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }
    @Override
    public int getEnchantability() {
        return 8;
    }
    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemGenerics.TUNGSTENSTEEL_INGOT);
    }
    @Override
    public String getName() {
        return "tungstensteel";
    }
    @Override
    public float getToughness() {
        return 4;
    }
    @Override
    public float getKnockbackResistance() {
        return 0.2f;
    }

}