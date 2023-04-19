package net.slayerrroar.reborn12k.items.custom.magic.staffs.crimson;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class CrimsonWand extends Item {

    public CrimsonWand(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        tooltip.add(Text.translatable("item.reborn12k.crimson.tooltip"));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

        HitResult hit = playerEntity.raycast(12f, 0, false);

        if (hit.getType() == HitResult.Type.ENTITY) {
            EntityHitResult entityHit = (EntityHitResult) hit;
            Entity entity = entityHit.getEntity();

            world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(),SoundEvents.ENTITY_LIGHTNING_BOLT_THUNDER, SoundCategory.PLAYERS, 1.0f, 1.0f);
            playerEntity.world.createExplosion(playerEntity, entity.getX(), entity.getY(), entity.getZ(), 2.0F, World.ExplosionSourceType.NONE);
            playerEntity.getItemCooldownManager().set(this, 9*20);

        }
 else if (hit.getType() == HitResult.Type.BLOCK) {

            BlockPos blockPos = ((BlockHitResult) hit).getBlockPos();

            world.playSound(null, blockPos,SoundEvents.ENTITY_LIGHTNING_BOLT_IMPACT, SoundCategory.PLAYERS, 0.5f, 1.0f);
            playerEntity.world.createExplosion(playerEntity, blockPos.getX()+.5, blockPos.getY()+1.1, blockPos.getZ()+.5, 2.0F, World.ExplosionSourceType.NONE);
            playerEntity.getItemCooldownManager().set(this, 9*20);
        }

        return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));

    }
}
