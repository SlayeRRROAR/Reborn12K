package net.slayerrroar.reborn12k.items.item_class.ai_stuff;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.HoglinEntity;
import net.minecraft.entity.mob.ZoglinEntity;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.items.RebornAiItems;

import java.util.List;

public class BasicAiModule extends Item {
    public BasicAiModule(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.basic_ai_module.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.ai_module.tooltip1"));
    }

    @Override
    public ActionResult useOnEntity(ItemStack itemStack, PlayerEntity user, LivingEntity entity, Hand hand) {

        if (!user.getWorld().isClient && hand == Hand.MAIN_HAND) {
            if (entity instanceof ChickenEntity) {
                entity.remove(Entity.RemovalReason.DISCARDED);
                entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                        SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(RebornAiItems.CHICKEN_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if (entity instanceof CowEntity) {
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(RebornAiItems.COW_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if (entity instanceof PigEntity || entity instanceof HoglinEntity || entity instanceof ZoglinEntity) {
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(RebornAiItems.PIG_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if (entity instanceof SheepEntity) {
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(RebornAiItems.SHEEP_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if (entity instanceof SquidEntity) {
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(RebornAiItems.SQUID_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if (entity instanceof FishEntity) {
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(RebornAiItems.FISH_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if (entity instanceof RabbitEntity) {
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(RebornAiItems.RABBIT_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if (entity instanceof BeeEntity) {
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(RebornAiItems.BEE_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            }
        }

        user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip3"), true);
        return ActionResult.FAIL;
    }
}
