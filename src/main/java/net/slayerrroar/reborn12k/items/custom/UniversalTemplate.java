package net.slayerrroar.reborn12k.items.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UniversalTemplate extends Item {
    public UniversalTemplate(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.reborn12k.universal_smithing_template.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.universal_smithing_template.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.universal_smithing_template.tooltip3"));
    }
}
