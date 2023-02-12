package net.slayerrroar.reborn12k.items.item_class.charms.cape;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class AngelWings extends TrinketItem implements Trinket {
    public AngelWings(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.angel_wings.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.angel_wings.tooltip2"));
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            if (!player.getAbilities().allowFlying) {
                allowFlight(player);
            }
        }
        super.tick(stack, slot, entity);
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity) {
            allowFlight((PlayerEntity) entity);
        }
        super.onEquip(stack, slot, entity);
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity) {
            revokeFlight((PlayerEntity) entity);
        }
        super.onUnequip(stack, slot, entity);
    }

    private void allowFlight(PlayerEntity player) {
        if (!player.isCreative() && !player.isSpectator()) {
            player.getAbilities().allowFlying = true;
            player.sendAbilitiesUpdate();
        }
    }

    private void revokeFlight(PlayerEntity player) {
        if (!player.isCreative() && !player.isSpectator()) {
            player.getAbilities().flying = false;
            player.getAbilities().allowFlying = false;
            player.sendAbilitiesUpdate();
        }
    }

}
