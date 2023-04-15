package net.slayerrroar.reborn12k.items.custom.magic.staffs.thunderbolt;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class ThunderboltRod extends Item {

    public ThunderboltRod(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        tooltip.add(Text.translatable("item.reborn12k.thunderbolt.tooltip"));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

        HitResult hit = playerEntity.raycast(28f, 0, false);

        if(hit.getType() == HitResult.Type.BLOCK) {

            BlockPos blockPos = ((BlockHitResult) hit).getBlockPos();

            LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(playerEntity.world);

            assert lightningEntity != null;
            lightningEntity.refreshPositionAfterTeleport(blockPos.getX(), blockPos.getY(), blockPos.getZ());
            world.spawnEntity(lightningEntity);
            playerEntity.getItemCooldownManager().set(this, 30*20);

        }
        playerEntity.getItemCooldownManager().set(this, 5*20);
        return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));

    }
}
