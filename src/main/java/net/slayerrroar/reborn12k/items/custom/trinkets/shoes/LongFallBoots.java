package net.slayerrroar.reborn12k.items.custom.trinkets.shoes;

import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class LongFallBoots extends TrinketItem implements Trinket {

    public LongFallBoots(Settings settings) {
        super(settings);
    }



    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.long_fall_boots.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.long_fall_boots.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.shoes.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.legendary.tooltip"));
    }

}