package net.slayerrroar.reborn12k.items.custom.magic;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class MobSoulItem extends Item {
    public MobSoulItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.mob_soul.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.mob_soul.tooltip2"));
    }

}
