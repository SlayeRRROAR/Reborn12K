package net.slayerrroar.reborn12k.tools.type.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
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

public class PowerSword extends SwordItem {

    static final String ACTIVE_STATE = "Active State";

    public PowerSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public enum ActiveState {
        ACTIVE(true), INACTIVE(false);
        final boolean state;
        ActiveState(boolean state) {
            this.state = state;
        }
        public boolean getBoolean() {
            return state;
        }
    }

    private void setActiveState(ItemStack stack, ActiveState mode) {
        checkTag(stack);
        assert stack.getNbt() != null;
        stack.getNbt().putBoolean(ACTIVE_STATE, mode.getBoolean());
    }

    private ActiveState getActiveState(ItemStack stack) {
        if (!stack.isEmpty()) {
            checkTag(stack);

            assert stack.getNbt() != null;
            return stack.getNbt().getBoolean(ACTIVE_STATE) ? ActiveState.ACTIVE : ActiveState.INACTIVE;
        }
        return ActiveState.INACTIVE;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        World world = attacker.getWorld();
        ActiveState currentmode = getActiveState(stack);
        float damage = (float) attacker.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE);
        float bonusDamage = 2f;

        if (!world.isClient()) {
            if (currentmode == ActiveState.ACTIVE) {
            target.damage(attacker.getDamageSources().generic(), (damage * bonusDamage));
            stack.damage(1, attacker, livingEntity -> livingEntity.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
            }
            if (currentmode == ActiveState.INACTIVE)
            target.damage(attacker.getDamageSources().generic(), (damage));
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

            if (!nbt.contains(ACTIVE_STATE)) {
                nbt.putBoolean(ACTIVE_STATE, false);
            }
        }
    }

    private void toggleState(ItemStack stack, PlayerEntity player) {
        World world = player.getWorld();

        if (getActiveState(stack).getBoolean()) {
            setActiveState(stack, ActiveState.INACTIVE);
            world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 0.25f, 0.25f);
            player.getItemCooldownManager().set(this, 10);
            player.sendMessage(Text.translatable("item.reborn12k.power_sword.tooltip3"), true);
            return;
        }
        setActiveState(stack, ActiveState.ACTIVE);
        world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 0.25f, 0.25f);
        player.getItemCooldownManager().set(this, 10);
        player.sendMessage(Text.translatable("item.reborn12k.power_sword.tooltip4"), true);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        ItemStack stack = playerEntity.getStackInHand(hand);

        if (!world.isClient && !playerEntity.isSneaking()) {
            toggleState(stack, playerEntity);
            return new TypedActionResult<>(ActionResult.SUCCESS, stack);
        }
        return new TypedActionResult<>(ActionResult.FAIL, stack);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        if (getActiveState(itemStack) != ActiveState.ACTIVE) {
            tooltip.add(Text.translatable("item.reborn12k.power_sword.tooltip1"));
        } else {
            tooltip.add(Text.translatable("item.reborn12k.power_sword.tooltip2"));
        }
    }

}