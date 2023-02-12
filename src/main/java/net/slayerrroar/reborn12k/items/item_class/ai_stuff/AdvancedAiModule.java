package net.slayerrroar.reborn12k.items.item_class.ai_stuff;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.*;
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

public class AdvancedAiModule extends Item {
    public AdvancedAiModule(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.advanced_ai_module.tooltip"));
        tooltip.add(Text.translatable("item.reborn12k.ai_module.tooltip1"));
    }

    @Override
    public ActionResult useOnEntity(ItemStack itemStack, PlayerEntity user, LivingEntity entity, Hand hand) {

        if (!user.getWorld().isClient && hand == Hand.MAIN_HAND) {
            if (entity instanceof ZombieEntity) {
                    entity.remove(Entity.RemovalReason.DISCARDED);
                    entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                            SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(RebornAiItems.ZOMBIE_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if (entity instanceof CreeperEntity) {
                    entity.remove(Entity.RemovalReason.DISCARDED);
                    entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                            SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(RebornAiItems.CREEPER_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if (entity instanceof SkeletonEntity || entity instanceof StrayEntity) {
                    entity.remove(Entity.RemovalReason.DISCARDED);
                    entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                            SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(RebornAiItems.SKELETON_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if (entity instanceof PhantomEntity) {
                    entity.remove(Entity.RemovalReason.DISCARDED);
                    entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                            SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(RebornAiItems.PHANTOM_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if (entity instanceof SlimeEntity) {
                    entity.remove(Entity.RemovalReason.DISCARDED);
                    entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                            SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(RebornAiItems.SLIME_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if (entity instanceof GuardianEntity) {
                    entity.remove(Entity.RemovalReason.DISCARDED);
                    entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                            SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(RebornAiItems.ILLAGER_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if (entity instanceof IronGolemEntity) {
                    entity.remove(Entity.RemovalReason.DISCARDED);
                    entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                            SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.dropItem(RebornAiItems.IRON_GOLEM_AI_MODULE);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                return ActionResult.SUCCESS;
            } if (entity instanceof SpiderEntity) {
                    entity.remove(Entity.RemovalReason.DISCARDED);
                    entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                            SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                user.dropItem(RebornAiItems.SPIDER_AI_MODULE);
                return ActionResult.SUCCESS;
            } if (entity instanceof WitchEntity) {
                    entity.remove(Entity.RemovalReason.DISCARDED);
                    entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                            SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                itemStack.setCount(itemStack.getCount() - 1);
                user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip2"), true);
                user.dropItem(RebornAiItems.WITCH_AI_MODULE);
                return ActionResult.SUCCESS;
            }
        }

        user.sendMessage(Text.translatable("item.reborn12k.ai_module.tooltip3"), true);
        return ActionResult.FAIL;
    }
}
