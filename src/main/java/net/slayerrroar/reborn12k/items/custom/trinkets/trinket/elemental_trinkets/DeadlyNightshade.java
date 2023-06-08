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

public class DeadlyNightshade extends TrinketItem implements Trinket {
    public DeadlyNightshade(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        return TrinketsApi.getTrinketComponent(entity).get().isEquipped(TrinketItems.EARTH_SIGIL);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        World world = entity.getWorld();
        if (!world.isClient) {
            if (!TrinketsApi.getTrinketComponent(entity).get().isEquipped(TrinketItems.EARTH_SIGIL)) {
                stack.decrement(1);
                entity.dropItem(this);
            }
        }
        super.tick(stack, slot, entity);
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity.getHealth() >= 20f) {
            entity.setHealth(entity.getHealth() + 14f);
        }
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity.getMaxHealth() > 20f) {
            entity.setHealth(entity.getMaxHealth());
        }
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(uuid, "generic.max_health", 14, EntityAttributeModifier.Operation.ADDITION));
        return modifiers;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.trinket.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.deadly_nightshade.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.deadly_nightshade.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.earth.tooltip"));
    }

}
