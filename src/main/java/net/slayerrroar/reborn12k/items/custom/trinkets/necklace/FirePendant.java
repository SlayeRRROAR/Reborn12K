package net.slayerrroar.reborn12k.items.custom.trinkets.necklace;

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
import net.slayerrroar.reborn12k.items.ItemTrinkets;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("OptionalGetWithoutIsPresent")

public class FirePendant extends TrinketItem implements Trinket {
    public FirePendant(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        return TrinketsApi.getTrinketComponent(entity).get().isEquipped(ItemTrinkets.FIRE_IMPULSE);
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.setHealth(entity.getHealth() + 20.0f);
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if(entity.getMaxHealth() > 20.0f) {
            entity.setHealth(20.0f);
        }
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        World world = entity.world;
        if (!world.isClient) {
            if(!TrinketsApi.getTrinketComponent(entity).get().isEquipped(ItemTrinkets.FIRE_IMPULSE)) {
                stack.decrement(1);
                entity.dropItem(this);
            }
        }
        super.tick(stack, slot, entity);
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
            var modifiers = super.getModifiers(stack, slot, entity, uuid);
            modifiers.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(uuid, "reborn12k:max_health", 1.0, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
            return modifiers;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.necklace.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.fire.tooltip"));
    }

}