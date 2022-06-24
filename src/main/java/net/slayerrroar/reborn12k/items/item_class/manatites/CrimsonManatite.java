package net.slayerrroar.reborn12k.items.item_class.manatites;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class CrimsonManatite extends Item {
    public CrimsonManatite(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        tooltip.add(Text.translatable("item.reborn12k.crimson_manatite.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.crimson_manatite2.tooltip"));
    }
}
