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
import net.slayerrroar.reborn12k.entity.projectile_entities.SoulThingmabobEntity;

import java.util.List;

public class SoulThingmabobItem extends Item {
    public SoulThingmabobItem(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SPLASH_POTION_THROW, SoundCategory.NEUTRAL, 0.5F, 1F);
		user.getItemCooldownManager().set(this, 5);

        if(!world.isClient) {
            SoulThingmabobEntity thrownEntity = new SoulThingmabobEntity(world, user);
            thrownEntity.setItem(itemStack);
            thrownEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 2.0F, 0F);
            world.spawnEntity(thrownEntity);
        }
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if(!user.isCreative()) {
            itemStack.decrement(1);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.soul_thingmabob.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.soul_thingmabob.tooltip2"));
    }

}
