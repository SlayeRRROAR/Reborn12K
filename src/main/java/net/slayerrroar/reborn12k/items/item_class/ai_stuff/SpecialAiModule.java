package net.slayerrroar.reborn12k.items.item_class.ai_stuff;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.items.RebornAiItems;

import java.util.List;

public class SpecialAiModule extends Item {
    public SpecialAiModule(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.special_ai_module.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.special_ai_module.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.special_ai_module.tooltip3"));
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient) {
            if (target instanceof EnderDragonEntity) {
                attacker.getWorld().playSound(null, attacker.getX(), attacker.getY(), attacker.getZ(),
                        SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                stack.setCount(stack.getCount() - 1);
                attacker.dropItem(RebornAiItems.ENDER_DRAGON_AI_MODULE);
            } if (target instanceof WitherEntity) {
                attacker.getWorld().playSound(null, attacker.getX(), attacker.getY(), attacker.getZ(),
                        SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                stack.setCount(stack.getCount() - 1);
                attacker.dropItem(RebornAiItems.WITHER_AI_MODULE);
            }
        }
        return true;
    }
}
