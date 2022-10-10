package net.slayerrroar.reborn12k.items.item_class;

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

    private int getRemaining(ItemStack itemStack) {
        return itemStack.getMaxDamage() - itemStack.getDamage() + 1;
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        String remaining = Integer.toString(getRemaining(itemStack));

        tooltip.add(Text.translatable("item.reborn12k.fuel_cell.tooltip", remaining));
    }
}
