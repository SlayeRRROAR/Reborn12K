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

public class CrystalizedFire extends TrinketItem implements Trinket {
    public CrystalizedFire(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        return TrinketsApi.getTrinketComponent(entity).get().isEquipped(TrinketItems.FIRE_SIGIL);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        World world = entity.getWorld();
        if (!world.isClient) {
            if (!TrinketsApi.getTrinketComponent(entity).get().isEquipped(TrinketItems.FIRE_SIGIL)) {
                stack.decrement(1);
                entity.dropItem(this);
            }
        }
        super.tick(stack, slot, entity);
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        modifiers.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(uuid, "generic.attack_speed", 0.3, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        return modifiers;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.trinket.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.crystalized_fire.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.fire.tooltip"));
    }

}
