package net.slayerrroar.reborn12k.items.custom.magic;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.entity.projectile_entities.SoulVesselEntity;

import java.util.List;

public class SoulVesselItem extends Item {
    public SoulVesselItem(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SPLASH_POTION_THROW, SoundCategory.NEUTRAL, 0.5f, 1f);
		user.getItemCooldownManager().set(this, 5);

        if (!world.isClient) {
            SoulVesselEntity thrownEntity = new SoulVesselEntity(world, user);
            thrownEntity.setItem(itemStack);
            thrownEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0f, 2f, 0f);
            world.spawnEntity(thrownEntity);
        }
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.isCreative()) {
            itemStack.decrement(1);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.soul_vessel.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.soul_vessel.tooltip2"));
    }

}
