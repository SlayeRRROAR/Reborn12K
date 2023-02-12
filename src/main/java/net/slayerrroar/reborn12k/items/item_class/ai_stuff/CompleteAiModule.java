package net.slayerrroar.reborn12k.items.item_class.ai_stuff;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class CompleteAiModule extends Item {
    public CompleteAiModule(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.complete_ai_module.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.complete_ai_module.tooltip2"));
    }

}
