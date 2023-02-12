package net.slayerrroar.reborn12k.items.item_class.charms.belt;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class FocusBelt extends TrinketItem implements Trinket {

    public FocusBelt(Settings settings) {
        super(settings);
    }

    //public boolean isEnchanted(ItemStack stack) {
        //return !stack.getEnchantments().isEmpty();
    //}

   // @Override
    //public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        //if(!isEnchanted(stack)){
            //stack.addEnchantment(Enchantments.VANISHING_CURSE, 1);
        //}
    //}

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(uuid, "reborn12k:movement_speed", -0.20, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        modifiers.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(uuid, "reborn12k:attack_damage", 0.4, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        modifiers.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(uuid, "reborn12k:attack_speed", 0.4, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        return modifiers;
    }

}