package net.slayerrroar.reborn12k.items.custom.tech.ai_module;

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
import net.slayerrroar.reborn12k.items.ItemTechnical;

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

        if(!user.getWorld().isClient && hand == Hand.MAIN_HAND) {
            if(entity instanceof ChickenEntity) {
                entity.remove(Entity.RemovalReason.DISCARDED);
                entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                        SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(ItemTechnical.CHICKEN_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if(entity instanceof CowEntity) {
                entity.remove(Entity.RemovalReason.DISCARDED);
                entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                        SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(ItemTechnical.COW_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if(entity instanceof PigEntity || entity instanceof HoglinEntity || entity instanceof ZoglinEntity) {
                entity.remove(Entity.RemovalReason.DISCARDED);
                entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                        SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(ItemTechnical.PIG_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if(entity instanceof SheepEntity) {
                entity.remove(Entity.RemovalReason.DISCARDED);
                entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                        SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(ItemTechnical.SHEEP_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if(entity instanceof SquidEntity) {
                entity.remove(Entity.RemovalReason.DISCARDED);
                entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                        SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(ItemTechnical.SQUID_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if(entity instanceof FishEntity) {
                entity.remove(Entity.RemovalReason.DISCARDED);
                entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                        SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(ItemTechnical.FISH_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if(entity instanceof RabbitEntity) {
                entity.remove(Entity.RemovalReason.DISCARDED);
                entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                        SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(ItemTechnical.RABBIT_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if(entity instanceof BeeEntity) {
                entity.remove(Entity.RemovalReason.DISCARDED);
                entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                        SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(ItemTechnical.BEE_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            }
        }

        user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip3"), true);
        return ActionResult.FAIL;
    }
}
