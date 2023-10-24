package net.slayerrroar.reborn12k.tools.type.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class ExceedSword extends SwordItem {

    static final String EXCEED_STATE = "Exceed State";

    public ExceedSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public enum ExceedState {
        ACTIVE(true), INACTIVE(false);
        final boolean state;
        ExceedState(boolean state) {
            this.state = state;
        }
        public boolean getBoolean() {
            return state;
        }
    }

    private void setExceedState(ItemStack stack, ExceedState mode) {
        checkTag(stack);
        assert stack.getNbt() != null;
        stack.getNbt().putBoolean(EXCEED_STATE, mode.getBoolean());
    }

    private ExceedState getExceedState(ItemStack stack) {
        if (!stack.isEmpty()) {
            checkTag(stack);

            assert stack.getNbt() != null;
            return stack.getNbt().getBoolean(EXCEED_STATE) ? ExceedState.ACTIVE : ExceedState.INACTIVE;
        }
        return ExceedState.INACTIVE;
    }

    private void ActivateExceed(ItemStack stack) {
        setExceedState(stack, ExceedState.ACTIVE);
    }

    private void DeactivateExceed(ItemStack stack) {
        setExceedState(stack, ExceedState.INACTIVE);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ExceedState currentmode = getExceedState(stack);
        float damage = (float) attacker.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE);
        float bonusDamage = 2f;

        if (currentmode != ExceedState.INACTIVE && target instanceof MobEntity) {
            target.damage(attacker.getDamageSources().generic(), (damage * bonusDamage));
            DeactivateExceed(stack);
        }
        return super.postHit(stack, target, attacker);
    }

    private void checkTag(ItemStack stack) {
        if (!stack.isEmpty()) {

            if (!stack.hasNbt()) {
                stack.setNbt(new NbtCompound());
            }
            NbtCompound nbt = stack.getNbt();

            assert nbt != null;

            if (!nbt.contains(EXCEED_STATE)) {
                nbt.putBoolean(EXCEED_STATE, false);
            }
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        ItemStack stack = playerEntity.getStackInHand(hand);
        ExceedState currentMode = getExceedState(stack);

        if (!world.isClient && !playerEntity.isSneaking()) {
            if (currentMode!= ExceedState.ACTIVE) {
                Random rand = new Random();
                int upperbound = 21;
                int int_random = rand.nextInt(upperbound);

                if (int_random < 6) {
                    ActivateExceed(stack);
                    world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 0.15f, 1f);
                    playerEntity.sendMessage(Text.translatable("item.reborn12k.red_queen.tooltip3"), true);
                }
                else {
                    playerEntity.sendMessage(Text.translatable("item.reborn12k.red_queen.tooltip4"), true);
                }
                return new TypedActionResult<>(ActionResult.SUCCESS, stack);
            }
            playerEntity.sendMessage(Text.translatable("item.reborn12k.red_queen.tooltip5"), true);
        }
        return new TypedActionResult<>(ActionResult.FAIL, stack);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        if (getExceedState(itemStack) != ExceedState.ACTIVE){
            tooltip.add(Text.translatable("item.reborn12k.red_queen.tooltip1"));
        } else {
             tooltip.add(Text.translatable("item.reborn12k.red_queen.tooltip2"));
        }
    }

}