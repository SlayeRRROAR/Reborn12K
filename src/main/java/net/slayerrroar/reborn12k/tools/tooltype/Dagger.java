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
import net.slayerrroar.reborn12k.items.AdvancedItems;
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
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        Random rand = new Random();
        int upperbound = 100;
        int int_random = rand.nextInt(upperbound);
            if (target != attacker) {
            if(target.hasStatusEffect(CustomStatusEffects.FRAIL)) {
                if(target instanceof EndermanEntity
                || target instanceof EndermiteEntity
                || target instanceof ShulkerEntity) {
                    target.dropItem(AdvancedItems.CURSED_ENDER_DOLL, 1);
                }
                else if(target instanceof StriderEntity
                     || target instanceof PiglinEntity
                     || target instanceof PiglinBruteEntity
                     || target instanceof ZombifiedPiglinEntity
                     || target instanceof HoglinEntity
                     || target instanceof ZoglinEntity
                     || target instanceof GhastEntity
                     || target instanceof BlazeEntity
                     || target instanceof MagmaCubeEntity
                     || target instanceof WitherSkeletonEntity) {
                    target.dropItem(AdvancedItems.CURSED_NETHER_DOLL, 1);
                }
                else if(target instanceof CreeperEntity
                     || target instanceof GuardianEntity
                     || target instanceof SpiderEntity
                     || target instanceof PhantomEntity
                     || target instanceof SlimeEntity
                     || target instanceof StrayEntity
                     || target instanceof WitchEntity
                     || target instanceof ZombieEntity) {
                    target.dropItem(AdvancedItems.CURSED_DOLL, 1);
                }
                else if(target instanceof ChickenEntity
                     || target instanceof CowEntity
                     || target instanceof PigEntity
                     || target instanceof SheepEntity
                     || target instanceof SquidEntity
                     || target instanceof RabbitEntity
                     || target instanceof CodEntity
                     || target instanceof PufferfishEntity
                     || target instanceof SalmonEntity
                     || target instanceof TropicalFishEntity) {
                    target.dropItem(AdvancedItems.BLESSED_DOLL, 1);
                }
                target.removeStatusEffect(CustomStatusEffects.FRAIL);
            } else if(target instanceof EnderDragonEntity && int_random < 8) {
                target.dropItem(AdvancedItems.DRACONIC_DOLL, 1);
            } else if(target instanceof WitherEntity && int_random < 5) {
                target.dropItem(AdvancedItems.WITHERED_DOLL, 1);
            }
        }

        stack.damage(1, attacker, livingEntity -> livingEntity.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return true;
    }
}
