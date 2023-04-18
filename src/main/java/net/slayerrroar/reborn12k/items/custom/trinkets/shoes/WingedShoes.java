package net.slayerrroar.reborn12k.items.custom.trinkets.shoes;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class WingedShoes extends TrinketItem implements Trinket {

    public WingedShoes(Settings settings) {
        super(settings);
    }

    private static int additionalJumps = 1;
    private static int timesJumped = 0;

    private boolean isOnCooldown(PlayerEntity player, ItemStack stack) {
        return player.getItemCooldownManager().isCoolingDown(stack.getItem());
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        PlayerEntity player = (PlayerEntity) entity;
        World world = entity.world;

        if(world.isClient()) {
            if(player.isOnGround() || player.isSubmergedInWater() || player.hasVehicle()) {
                additionalJumps = 1;
                timesJumped = 0;
                player.getItemCooldownManager().set(this, 6);
            }
            if(MinecraftClient.getInstance().options.jumpKey.isPressed() && timesJumped < additionalJumps) {
                if(!player.isOnGround() && !player.isSubmergedInWater() && !player.isFallFlying() && !player.getAbilities().flying && !isOnCooldown(player, stack)) {
                    player.jump();
                    timesJumped++;
                    player.getItemCooldownManager().set(this, 6);
                }
            }
        }
        super.tick(stack, slot, entity);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.shoes.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.epic.tooltip"));
    }

}