package net.slayerrroar.reborn12k.items.custom.magic.staffs.volcanic;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;

import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.List;

public class VolcanicWand extends Item {

    public VolcanicWand(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        tooltip.add(Text.translatable("item.reborn12k.volcanic.tooltip"));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

        world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_FIREWORK_ROCKET_LARGE_BLAST_FAR, SoundCategory.PLAYERS, 0.25f, 1.0f);

        for(Entity e : world.getOtherEntities(playerEntity, Box.of(playerEntity.getPos(), 20, 20, 20))) {
            if(e instanceof HostileEntity hostileEntity) {
                if(hostileEntity.distanceTo(playerEntity) < 20) {
                    hostileEntity.setOnFireFor(20*5);
                    hostileEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20*10, 0, false, false));
                }
            }
        }

        playerEntity.getItemCooldownManager().set(this, 20*10);

        return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));

    }
}
