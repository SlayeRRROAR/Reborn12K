package net.slayerrroar.reborn12k.items.item_class.catalyst;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.items.MagicItems;

import java.util.List;

public class IncompleteWitheredCatalyst extends Item {
    public IncompleteWitheredCatalyst(Settings settings) {
        super(settings);
    }

    private int getRemaining(ItemStack itemStack) {
        return 10 - itemStack.getDamage();
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        String remaining = Integer.toString(getRemaining(itemStack));

        tooltip.add(Text.translatable("item.reborn12k.incomplete_generic_catalyst.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.incomplete_generic_catalyst.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.incomplete_withered_catalyst.tooltip", remaining));
    }

    @Override
    public ActionResult useOnEntity(ItemStack itemStack, PlayerEntity user, LivingEntity entity, Hand hand) {

        if(!user.getWorld().isClient && hand == Hand.MAIN_HAND)
            if(itemStack.getDamage() < 9) {
                if(entity instanceof WitherEntity) {
                    entity.remove(Entity.RemovalReason.DISCARDED);
                    entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                            SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                    user.sendMessage(Text.translatable("item.reborn12k.incomplete_generic_catalyst.tooltip3"), true);
                    itemStack.setDamage(itemStack.getDamage()+1);
                    return ActionResult.SUCCESS;
                }
                user.sendMessage(Text.translatable("item.reborn12k.incomplete_generic_catalyst.tooltip4"), true);
            }
        if(itemStack.getDamage() >= 4) {
            user.sendMessage(Text.translatable("item.reborn12k.incomplete_generic_catalyst.tooltip5"), true);
            entity.remove(Entity.RemovalReason.DISCARDED);
            entity.getWorld().playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                    SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
            itemStack.setCount(0);
            user.dropItem(MagicItems.WITHERED_CATALYST);
            return ActionResult.SUCCESS;
        }
        return ActionResult.FAIL;
    }



}
