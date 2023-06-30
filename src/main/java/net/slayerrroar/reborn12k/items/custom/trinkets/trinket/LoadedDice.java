package net.slayerrroar.reborn12k.items.custom.trinkets.trinket;

import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class LoadedDice extends TrinketItem implements Trinket {
    public LoadedDice(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.trinket.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.loaded_dice.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.loaded_dice.tooltip2"));
    }

}
