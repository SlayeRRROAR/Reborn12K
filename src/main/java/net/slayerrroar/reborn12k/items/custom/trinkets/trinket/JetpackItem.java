package net.slayerrroar.reborn12k.items.custom.trinkets.trinket;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.util.RebornKeybinds;

import java.util.List;

@SuppressWarnings("OptionalGetWithoutIsPresent")

public class JetpackItem extends TrinketItem implements Trinket {

    public JetpackItem(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if(TrinketsApi.getTrinketComponent(entity).get().isEquipped(this)) {
            if(RebornKeybinds.trinket.isPressed() && !entity.isSneaking()) {
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 2, 6, false, false));
            }
        }
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.playSound(SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.5f, 1.0f);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.jetpack.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.jetpack.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.trinket.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.legendary.tooltip"));
    }

}
