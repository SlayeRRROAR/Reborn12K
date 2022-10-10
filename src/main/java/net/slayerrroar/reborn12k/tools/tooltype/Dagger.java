package net.slayerrroar.reborn12k.tools.tooltype;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.passive.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.items.MagicItems;
import net.slayerrroar.reborn12k.statuses.CustomStatusEffects;

import java.util.List;
import java.util.Random;

public class Dagger extends SwordItem {
    public Dagger(ToolMaterial toolMaterial, int i, float f, Settings settings) {
        super(toolMaterial, i, f, settings);
    }

    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.dagger.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.dagger.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.dagger.tooltip3"));
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity entity, LivingEntity attacker) {
        Random rand = new Random();
        int upperbound = 100;
        int int_random = rand.nextInt(upperbound);
            if (entity != attacker) {
            if(entity.hasStatusEffect(CustomStatusEffects.FRAIL)) {
                if(entity instanceof EndermanEntity
                || entity instanceof EndermiteEntity
                || entity instanceof ShulkerEntity) {
                    entity.dropItem(MagicItems.INCOMPLETE_ENDER_CATALYST, 1);
                }
                else if(entity instanceof StriderEntity
                     || entity instanceof PiglinEntity
                     || entity instanceof PiglinBruteEntity
                     || entity instanceof ZombifiedPiglinEntity
                     || entity instanceof HoglinEntity
                     || entity instanceof ZoglinEntity
                     || entity instanceof GhastEntity
                     || entity instanceof BlazeEntity
                     || entity instanceof MagmaCubeEntity
                     || entity instanceof WitherSkeletonEntity) {
                    entity.dropItem(MagicItems.INCOMPLETE_NETHER_CATALYST, 1);
                }
                else if(entity instanceof CreeperEntity
                     || entity instanceof GuardianEntity
                     || entity instanceof SpiderEntity
                     || entity instanceof PhantomEntity
                     || entity instanceof SlimeEntity
                     || entity instanceof SkeletonEntity
                     || entity instanceof StrayEntity
                     || entity instanceof WitchEntity
                     || entity instanceof ZombieEntity) {
                    entity.dropItem(MagicItems.INCOMPLETE_CURSED_CATALYST, 1);
                }
                else if(entity instanceof ChickenEntity
                     || entity instanceof CowEntity
                     || entity instanceof PigEntity
                     || entity instanceof SheepEntity
                     || entity instanceof SquidEntity
                     || entity instanceof RabbitEntity
                     || entity instanceof FrogEntity
                     || entity instanceof BeeEntity
                     || entity instanceof HorseEntity
                     || entity instanceof TurtleEntity
                     || entity instanceof PolarBearEntity
                     || entity instanceof CodEntity
                     || entity instanceof PufferfishEntity
                     || entity instanceof SalmonEntity
                     || entity instanceof TropicalFishEntity) {
                    entity.dropItem(MagicItems.INCOMPLETE_BLESSED_CATALYST, 1);
                }
                entity.removeStatusEffect(CustomStatusEffects.FRAIL);
            } else if(entity instanceof EnderDragonEntity && int_random < 24) {
                entity.dropItem(MagicItems.INCOMPLETE_DRACONIC_CATALYST, 1);
            } else if(entity instanceof WitherEntity && int_random < 19) {
                entity.dropItem(MagicItems.INCOMPLETE_WITHERED_CATALYST, 1);
            }
        }

        stack.damage(1, attacker, livingEntity -> livingEntity.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return true;
    }
}
