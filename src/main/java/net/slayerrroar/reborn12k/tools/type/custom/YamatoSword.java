package net.slayerrroar.reborn12k.tools.type.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class YamatoSword extends SwordItem {

    static final String CONCENTRATION = "Concentration";
    static int timer = 10;

    public YamatoSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return false;
    }

    private enum ConcentrationLevel {
        NONE(0), LOW(1), HIGH(2), MAX(3);
        final int level;
        ConcentrationLevel(int level) {
            this.level = level;
        }
        public int getConcentration() {
            return level;
        }
    }

    private void checkTag(ItemStack stack) {
        if (!stack.isEmpty()) {

            if (!stack.hasNbt()) {
                stack.setNbt(new NbtCompound());
            }
            NbtCompound nbt = stack.getNbt();

            assert nbt != null;

            if (!nbt.contains(CONCENTRATION)) {
                nbt.putInt(CONCENTRATION, 0);
            }
        }
    }

    private void setConcentrationLevel(ItemStack stack, ConcentrationLevel concentrationLevel) {
        checkTag(stack);
        assert stack.getNbt() != null;
        stack.getNbt().putInt(CONCENTRATION, concentrationLevel.getConcentration());
    }

    private ConcentrationLevel getConcentrationLevel(ItemStack stack) {
        if (!stack.isEmpty()) {
            checkTag(stack);

            assert stack.getNbt() != null;
            return switch (stack.getNbt().getInt(CONCENTRATION)) {
                case 0 -> ConcentrationLevel.NONE;
                case 1 -> ConcentrationLevel.LOW;
                case 2 -> ConcentrationLevel.HIGH;
                case 3 -> ConcentrationLevel.MAX;
                default -> ConcentrationLevel.NONE;
            };
        }
        return ConcentrationLevel.NONE;
    }

    private void setConcentrationToNone(ItemStack stack) {
        setConcentrationLevel(stack, ConcentrationLevel.NONE);
    }
    private void setConcentrationToLow(ItemStack stack) {
        setConcentrationLevel(stack, ConcentrationLevel.LOW);
    }
    private void setConcentrationToHigh(ItemStack stack) {
        setConcentrationLevel(stack, ConcentrationLevel.HIGH);
    }
    private void setConcentrationToMax(ItemStack stack) {
        setConcentrationLevel(stack, ConcentrationLevel.MAX);
    }

    private boolean isConcentrationNone(ItemStack stack) {
        return getConcentrationLevel(stack) == ConcentrationLevel.NONE;
    }
    private boolean isConcentrationLow(ItemStack stack) {
        return getConcentrationLevel(stack) == ConcentrationLevel.LOW;
    }
    private boolean isConcentrationHigh(ItemStack stack) {
        return getConcentrationLevel(stack) == ConcentrationLevel.HIGH;
    }
    private boolean isConcentrationMax(ItemStack stack) {
        return getConcentrationLevel(stack) == ConcentrationLevel.MAX;
    }

    private void concentrationUp(ItemStack stack, PlayerEntity playerEntity) {
        if (isConcentrationHigh(stack)) {
            setConcentrationToMax(stack);
            playerEntity.sendMessage(Text.translatable("item.reborn12k.yamato.tooltip6"), true);
        }
        if (isConcentrationLow(stack)) {
            setConcentrationToHigh(stack);
            playerEntity.sendMessage(Text.translatable("item.reborn12k.yamato.tooltip5"), true);
        }
        if (isConcentrationNone(stack)) {
            setConcentrationToLow(stack);
            playerEntity.sendMessage(Text.translatable("item.reborn12k.yamato.tooltip4"), true);
        }
    }
    private void concentrationDown(ItemStack stack, PlayerEntity playerEntity) {
        if (isConcentrationLow(stack)) {
            setConcentrationToNone(stack);
            playerEntity.sendMessage(Text.translatable("item.reborn12k.yamato.tooltip3"), true);
        }
        if (isConcentrationHigh(stack)) {
            setConcentrationToLow(stack);
            playerEntity.sendMessage(Text.translatable("item.reborn12k.yamato.tooltip4"), true);
        }
        if (isConcentrationMax(stack)) {
            setConcentrationToHigh(stack);
            playerEntity.sendMessage(Text.translatable("item.reborn12k.yamato.tooltip5"), true);
        }
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        PlayerEntity playerEntity = (PlayerEntity) attacker;

        float damage = (float) attacker.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE);
        float lowDamage = isConcentrationLow(stack) ? 1.5f : 1f;
        float highDamage = isConcentrationHigh(stack) ? 2f : 1f;
        float maxDamage = isConcentrationMax(stack) ? 3f : 1f;

        target.damage(attacker.getDamageSources().generic(), (damage * (lowDamage * highDamage * maxDamage)));
        concentrationUp(stack, playerEntity);

        return super.postHit(stack, target, attacker);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        LivingEntity livingEntity = (LivingEntity) entity;
        PlayerEntity playerEntity = (PlayerEntity) livingEntity;

        if (!world.isClient()) {
            if (!livingEntity.getStackInHand(Hand.MAIN_HAND).equals(stack)) {
               setConcentrationToNone(stack);
            }
            if (livingEntity.getStackInHand(Hand.MAIN_HAND).equals(stack)) {
                if (livingEntity.isSprinting() || livingEntity.isInFluid() || livingEntity.isFallFlying()) {
                    if (timer > 0) {
                        timer--;
                    }
                    if (timer <= 0) {
                        concentrationDown(stack, playerEntity);
                        timer = 10;
                    }
                }
                if (!livingEntity.isSprinting() && !livingEntity.isInFluid() && !livingEntity.isFallFlying()) {
                    if (timer < 10) {
                        timer++;
                    }
                }
                if (playerEntity.hurtTime == 1) {
                    concentrationDown(stack, playerEntity);
                }
            }
        }
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (!world.isClient()) {
            setConcentrationToNone(stack);
        }
        return super.postMine(stack, world, state, pos, miner);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.yamato.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.yamato.tooltip2"));

        if (isConcentrationNone(stack)) {
            tooltip.add(Text.translatable("item.reborn12k.yamato.tooltip3"));
        }
        if (isConcentrationLow(stack)) {
            tooltip.add(Text.translatable("item.reborn12k.yamato.tooltip4"));
        }
        if (isConcentrationHigh(stack)) {
            tooltip.add(Text.translatable("item.reborn12k.yamato.tooltip5"));
        }
        if (isConcentrationMax(stack)) {
            tooltip.add(Text.translatable("item.reborn12k.yamato.tooltip6"));
        }
    }

}
