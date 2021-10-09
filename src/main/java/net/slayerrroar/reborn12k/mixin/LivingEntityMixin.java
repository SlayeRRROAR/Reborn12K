package net.slayerrroar.reborn12k.mixin;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.slayerrroar.reborn12k.armors.Armors;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity{

    @Shadow @Final private DefaultedList <ItemStack> equippedArmor;
    @Shadow public abstract boolean addStatusEffect(StatusEffectInstance effect);

    @Inject(at = @At("HEAD"), method = "tick")
    private void tick(CallbackInfo info) {

        ItemStack helmetStack = equippedArmor.get(3);
        ItemStack chestplateStack = equippedArmor.get(2);
        ItemStack leggingsStack = equippedArmor.get(1);
        ItemStack bootsStack = equippedArmor.get(0);

        if (helmetStack.getItem() == Armors.MAGE_HELMET &&
        chestplateStack.getItem() == Armors.MAGE_CHESTPLATE &&
        leggingsStack.getItem() == Armors.MAGE_LEGGINGS &&
        bootsStack.getItem() == Armors.MAGE_BOOTS) {
            addStatusEffect(new StatusEffectInstance (StatusEffects.HERO_OF_THE_VILLAGE, 20, 0, false, false));
        }
    }

    protected LivingEntityMixin(EntityType<? extends Entity> entityType, World world) {
        super(entityType, world);
    }
}