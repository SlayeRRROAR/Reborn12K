package net.slayerrroar.reborn12k.items.custom.trinkets.trinket.impulses;

import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FireImpulse extends TrinketItem implements Trinket {
    public FireImpulse(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.reborn12k.fire_impulse.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.fire_impulse.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.trinket.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.legendary.tooltip"));
    }
}
