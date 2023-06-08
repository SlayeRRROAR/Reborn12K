package net.slayerrroar.reborn12k.items.custom.trinkets.trinket.elemental_trinkets;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.items.TrinketItems;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("OptionalGetWithoutIsPresent")

public class LeviathanEye extends TrinketItem implements Trinket {
    public LeviathanEye(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        return TrinketsApi.getTrinketComponent(entity).get().isEquipped(TrinketItems.WATER_SIGIL);
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity.getHealth() >= 20f) {
            entity.setHealth(entity.getHealth() + 4f);
        }
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity.getHealth() > 20f) {
            entity.setHealth(entity.getMaxHealth());
        }
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        World world = entity.getWorld();
        if (!world.isClient) {
            if (!TrinketsApi.getTrinketComponent(entity).get().isEquipped(TrinketItems.WATER_SIGIL)) {
                stack.decrement(1);
                entity.dropItem(this);
            }
        }
        super.tick(stack, slot, entity);
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(uuid, "generic.max_health", 2, EntityAttributeModifier.Operation.ADDITION));
        modifiers.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(uuid, "generic.attack_speed", 0.1, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        modifiers.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(uuid, "generic.attack_damage", 0.1, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        modifiers.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(uuid, "generic.movement_speed", 0.1, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        return modifiers;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.trinket.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.leviathan_eye.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.leviathan_eye.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.water.tooltip"));
    }

}
