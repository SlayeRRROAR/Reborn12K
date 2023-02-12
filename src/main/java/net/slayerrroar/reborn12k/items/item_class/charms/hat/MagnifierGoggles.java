package net.slayerrroar.reborn12k.items.item_class.charms.hat;

import com.google.common.collect.Multimap;
import com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class MagnifierGoggles extends TrinketItem {
    private static final UUID REACH_MODIFIER_ID = UUID.fromString("0919CA5B-3771-48E9-86B7-E062AE0D709B");
    private static final UUID ATTACK_DISTANCE_MODIFIER_ID = UUID.fromString("DABEB32B-FAC1-48BA-A48D-A31B3B449FA2");

    public MagnifierGoggles(Settings settings) {
        super(settings);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);

        modifiers.put(ReachEntityAttributes.REACH,
                new EntityAttributeModifier(REACH_MODIFIER_ID, "reborn12k:default_reach", 1.0, EntityAttributeModifier.Operation.ADDITION));
        modifiers.put(ReachEntityAttributes.ATTACK_RANGE,
                new EntityAttributeModifier(ATTACK_DISTANCE_MODIFIER_ID, "reborn12k:attack_reach", 1.0, EntityAttributeModifier.Operation.ADDITION));

        return modifiers;
    }

}
