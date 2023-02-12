package net.slayerrroar.reborn12k.items.item_class.ai_stuff.chips;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class ExtractionChip extends Item {
    public ExtractionChip(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.extraction_chip.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.extraction_chip.tooltip2"));
    }

}
