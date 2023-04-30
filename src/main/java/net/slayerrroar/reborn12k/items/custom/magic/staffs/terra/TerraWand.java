package net.slayerrroar.reborn12k.items.custom.magic.staffs.terra;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.entity.projectile_entities.TerraEntity;

import java.util.List;

public class TerraWand extends Item {

    public TerraWand(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);

        if (!world.isClient) {
            TerraEntity thrownEntity = new TerraEntity(world, player);

            thrownEntity.setVelocity(player, player.getPitch(), player.getYaw(), 0f, 3f, 0f);
            world.spawnEntity(thrownEntity);
        }
        player.getItemCooldownManager().set(this, 20*15);
        player.incrementStat(Stats.USED.getOrCreateStat(this));
        return TypedActionResult.success(stack, world.isClient());
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.terra.tooltip"));
    }

}
