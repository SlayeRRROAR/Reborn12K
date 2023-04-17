package net.slayerrroar.reborn12k.items.custom.trinkets.belt;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class AntiGravBelt extends TrinketItem implements Trinket {
    public AntiGravBelt(Settings settings) {
        super(settings);
    }

    private int tickDelay = 15;

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        PlayerEntity player = (PlayerEntity) entity;

        if(player.isOnGround() || player.isSubmergedInWater() || player.hasVehicle()) {
            tickDelay = 15;
        }
        if(!player.isOnGround() && !player.isSubmergedInWater() && !player.isFallFlying() && !player.getAbilities().flying) {
            tickDelay--;
            if(tickDelay <= 0) {
                player.addVelocity(0, 0.03, 0);
                player.fallDistance *= 0.5;
            }
        }
        super.tick(stack, slot, entity);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.belt.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.antigrav_belt.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.antigrav_belt.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.rare.tooltip"));
    }

}
