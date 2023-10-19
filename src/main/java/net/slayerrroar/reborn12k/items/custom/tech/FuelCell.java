package net.slayerrroar.reborn12k.items.custom.tech;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class FuelCell extends Item {
    public FuelCell(Settings settings) {
        super(settings);
    }

    private int getRemainingPercent(ItemStack stack) {
        return ((stack.getMaxDamage() - stack.getDamage()) * 100) / stack.getMaxDamage();
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        String remaining = getRemainingPercent(itemStack) + "%";

        tooltip.add(Text.translatable("item.reborn12k.fuel_cell.tooltip", remaining));
    }
}
