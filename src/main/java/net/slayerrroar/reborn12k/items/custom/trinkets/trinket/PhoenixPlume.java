package net.slayerrroar.reborn12k.items.custom.trinkets.trinket;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PhoenixPlume extends TrinketItem implements Trinket {
    public PhoenixPlume(Settings settings) {
        super(settings);
    }

    static final String COOLDOWN = "Cooldown State";

    public enum CooldownState {
        ON(true), OFF(false);
        final boolean state;
        CooldownState(boolean state) {
            this.state = state;
        }
        public boolean getBoolean() {
            return state;
        }
    }

    private void checkTag(ItemStack stack) {
        if(!stack.isEmpty()) {
            if(!stack.hasNbt()) {
                stack.setNbt(new NbtCompound());
            }
            NbtCompound nbt = stack.getNbt();
            assert nbt != null;
            if(!nbt.contains(COOLDOWN)) {
                nbt.putBoolean(COOLDOWN, false);
            }
        }
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if(entity instanceof PlayerEntity player) {
            if(!player.getItemCooldownManager().isCoolingDown(stack.getItem())) {
                this.setCooldownState(stack, CooldownState.OFF);
            }
        }
    }

    private CooldownState getCooldownState(ItemStack stack) {
        if(!stack.isEmpty()) {
            checkTag(stack);
            assert stack.getNbt() != null;
            return stack.getNbt().getBoolean(COOLDOWN) ? CooldownState.ON : CooldownState.OFF;
        }
        return CooldownState.OFF;
    }

    private void setCooldownState(ItemStack stack, CooldownState mode) {
        checkTag(stack);
        assert stack.getNbt() != null;
        stack.getNbt().putBoolean(COOLDOWN, mode.getBoolean());
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return getCooldownState(stack) == CooldownState.OFF;
    }

    public void setCooldown(PlayerEntity player, ItemStack stack) {
        player.getItemCooldownManager().set(this, 1200 * 20);
        this.setCooldownState(stack, CooldownState.ON);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(getCooldownState(stack) == CooldownState.OFF) {
            tooltip.add(Text.translatable("item.reborn12k.phoenix_plume.tooltip1"));
            tooltip.add(Text.translatable("item.reborn12k.phoenix_plume.tooltip2"));
        }
        if(getCooldownState(stack) == CooldownState.ON) {
            tooltip.add(Text.translatable("item.reborn12k.phoenix_plume.tooltip3"));
        }
        tooltip.add(Text.translatable("item.reborn12k.trinket.tooltip"));
    }

}
