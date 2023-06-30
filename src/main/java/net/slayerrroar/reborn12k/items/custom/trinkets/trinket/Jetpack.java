package net.slayerrroar.reborn12k.items.custom.trinkets.trinket;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.util.KeybindsUtil;

import java.util.List;

@SuppressWarnings("OptionalGetWithoutIsPresent")

public class Jetpack extends TrinketItem implements Trinket {

    public Jetpack(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        PlayerEntity player = (PlayerEntity) entity;
        World world = player.getWorld();
        if (world.isClient()) {
            if (TrinketsApi.getTrinketComponent(player).get().isEquipped(this)) {
                if (KeybindsUtil.trinketKey.isPressed() && !player.isSneaking() && player.getVelocity().y < 0.7) {
                    player.addVelocity(0, 0.12, 0);
                }
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.trinket.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.jetpack.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.jetpack.tooltip2"));
    }

}
