package net.slayerrroar.reborn12k.items.custom.tech.chips;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class SeveringChip extends Item {
    public SeveringChip(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.severing_chip.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.severing_chip.tooltip2"));
    }

}
