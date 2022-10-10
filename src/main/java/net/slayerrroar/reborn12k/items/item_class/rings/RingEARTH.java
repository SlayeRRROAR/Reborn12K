package net.slayerrroar.reborn12k.items.item_class.rings;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class RingEARTH extends Item{

    public RingEARTH(Settings settings) {
        super(settings);   
    }

    @Override
    
    public boolean hasGlint(ItemStack stack) { 
        return true;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.SPEED, 10, 2, false, false);
        LivingEntity player = (LivingEntity) entity;
        {player.addStatusEffect(effect);}
    }
    
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(),SoundEvents.ENTITY_EVOKER_CAST_SPELL, SoundCategory.PLAYERS, 1.0f, 1.0f);
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20*60, 4, false, false));
        playerEntity.getItemCooldownManager().set(this, 20*60);

        return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));
    }
}
