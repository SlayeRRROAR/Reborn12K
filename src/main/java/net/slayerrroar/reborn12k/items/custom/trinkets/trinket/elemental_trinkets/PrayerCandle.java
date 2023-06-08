package net.slayerrroar.reborn12k.items.custom.trinkets.trinket.elemental_trinkets;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.items.TrinketItems;

import java.util.List;

@SuppressWarnings("OptionalGetWithoutIsPresent")

public class PrayerCandle extends TrinketItem implements Trinket {
    public PrayerCandle(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        return TrinketsApi.getTrinketComponent(entity).get().isEquipped(TrinketItems.LIGHT_SIGIL);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        World world = entity.getWorld();
        if (!world.isClient) {
            if (!TrinketsApi.getTrinketComponent(entity).get().isEquipped(TrinketItems.LIGHT_SIGIL)) {
                stack.decrement(1);
                entity.dropItem(this);
            }
        }
        super.tick(stack, slot, entity);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.trinket.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.prayer_candle.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.prayer_candle.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.light.tooltip"));
    }

}
