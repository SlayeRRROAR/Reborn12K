package net.slayerrroar.reborn12k.items.custom.trinkets.necklace;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public class FirePendant extends TrinketItem implements Trinket {
    public FirePendant(Settings settings) {
        super(settings);
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity.getHealth() == entity.getMaxHealth()) {
            entity.setHealth(entity.getHealth() + 6.0f);
        }
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity.getHealth() > 20.0f) {
            entity.setHealth(20.0f);
        }
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(uuid, "generic.max_health", 0.3, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        return modifiers;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.reborn12k.necklace.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.fire_pendant.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.fire_pendant.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.legendary.tooltip"));
    }
}
