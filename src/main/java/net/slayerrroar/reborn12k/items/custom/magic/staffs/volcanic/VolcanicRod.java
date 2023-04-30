package net.slayerrroar.reborn12k.items.custom.magic.staffs.volcanic;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.entity.projectile_entities.VolcanicEntity;

import java.util.List;

public class VolcanicRod extends Item {

    public VolcanicRod(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);

        if (!world.isClient) {
            VolcanicEntity thrownEntity = new VolcanicEntity(world, player);

            thrownEntity.setVelocity(player, player.getPitch(), player.getYaw(), 0f, 3f, 0f);
            world.spawnEntity(thrownEntity);
        }
        player.getItemCooldownManager().set(this, 20*7);
        player.incrementStat(Stats.USED.getOrCreateStat(this));
        return TypedActionResult.success(stack, world.isClient());
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.volcanic.tooltip"));
    }

}
