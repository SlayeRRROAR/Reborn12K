package net.slayerrroar.reborn12k.tools.type;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;

import java.util.Random;

public class Katana extends SwordItem {
    public Katana(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack katana, LivingEntity target, LivingEntity attacker) {

        Random rand = new Random();
        int upperbound = 101;
        int int_random = rand.nextInt(upperbound);

        if (int_random < 26 && target != null) {
            float damage = (float) attacker.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE);
            float critBonus = 1.5F;
            target.damage(DamageSource.GENERIC, (damage * critBonus));
            target.world.playSound(null, target.getX(), target.getY(), target.getZ(),
                    SoundEvents.ENTITY_PLAYER_ATTACK_CRIT, SoundCategory.PLAYERS,1.0F,1.0F);
        }
        katana.damage(1, attacker, livingEntity -> livingEntity.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return super.postHit(katana, target, attacker);
    }
}
