package net.slayerrroar.reborn12k.items.custom.trinkets.trinket;

import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BloodyRose extends TrinketItem implements Trinket {
    public BloodyRose(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.reborn12k.trinket.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.bloody_rose.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.bloody_rose.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.epic.tooltip"));
    }

}