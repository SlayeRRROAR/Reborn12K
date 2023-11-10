package net.slayerrroar.reborn12k.tools.type.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
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
import java.util.Random;

public class ExceedSword extends SwordItem {

    static final String EXCEED = "Exceed";

    public ExceedSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return false;
    }

    private enum ExceedLevel {
        NONE(0), LOW(1), HIGH(2), MAX(3);
        final int level;
        ExceedLevel(int level) {
            this.level = level;
        }
        public int getExceed() {
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

            if (!nbt.contains(EXCEED)) {
                nbt.putInt(EXCEED, 0);
            }
        }
    }

    private void setExceedLevel(ItemStack stack, ExceedSword.ExceedLevel exceedLevel) {
        checkTag(stack);
        assert stack.getNbt() != null;
        stack.getNbt().putInt(EXCEED, exceedLevel.getExceed());
    }

    private ExceedSword.ExceedLevel getExceedLevel(ItemStack stack) {
        if (!stack.isEmpty()) {
            checkTag(stack);

            assert stack.getNbt() != null;
            return switch (stack.getNbt().getInt(EXCEED)) {
                case 0 -> ExceedSword.ExceedLevel.NONE;
                case 1 -> ExceedSword.ExceedLevel.LOW;
                case 2 -> ExceedSword.ExceedLevel.HIGH;
                case 3 -> ExceedSword.ExceedLevel.MAX;
                default -> ExceedSword.ExceedLevel.NONE;
            };
        }
        return ExceedSword.ExceedLevel.NONE;
    }

    private void setExceedToNone(ItemStack stack) {
        setExceedLevel(stack, ExceedSword.ExceedLevel.NONE);
    }
    private void setExceedToLow(ItemStack stack) {
        setExceedLevel(stack, ExceedSword.ExceedLevel.LOW);
    }
    private void setExceedToHigh(ItemStack stack) {
        setExceedLevel(stack, ExceedSword.ExceedLevel.HIGH);
    }
    private void setExceedToMax(ItemStack stack) {
        setExceedLevel(stack, ExceedSword.ExceedLevel.MAX);
    }

    private boolean isExceedNone(ItemStack stack) {
        return getExceedLevel(stack) == ExceedSword.ExceedLevel.NONE;
    }
    private boolean isExceedLow(ItemStack stack) {
        return getExceedLevel(stack) == ExceedSword.ExceedLevel.LOW;
    }
    private boolean isExceedHigh(ItemStack stack) {
        return getExceedLevel(stack) == ExceedSword.ExceedLevel.HIGH;
    }
    private boolean isExceedMax(ItemStack stack) {
        return getExceedLevel(stack) == ExceedSword.ExceedLevel.MAX;
    }

    private void exceedUp(ItemStack stack, PlayerEntity playerEntity) {
        if (isExceedHigh(stack)) {
            setExceedToMax(stack);
            playerEntity.sendMessage(Text.translatable("item.reborn12k.red_queen.tooltip5"), true);
        }
        if (isExceedLow(stack)) {
            setExceedToHigh(stack);
            playerEntity.sendMessage(Text.translatable("item.reborn12k.red_queen.tooltip5"), true);
        }
        if (isExceedNone(stack)) {
            setExceedToLow(stack);
            playerEntity.sendMessage(Text.translatable("item.reborn12k.red_queen.tooltip5"), true);
        }
    }
    private void exceedDown(ItemStack stack) {
        if (isExceedLow(stack)) {
            setExceedToNone(stack);
        }
        if (isExceedHigh(stack)) {
            setExceedToLow(stack);
        }
        if (isExceedMax(stack)) {
            setExceedToHigh(stack);
        }
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        PlayerEntity playerEntity = (PlayerEntity) attacker;

        float damage = (float) attacker.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE);
        float bonusDamage = !isExceedNone(stack) ? 2f : 1f;

        if (!isExceedNone(stack)) {
            playerEntity.sendMessage(Text.translatable("item.reborn12k.red_queen.tooltip6"), true);
        }
        target.damage(attacker.getDamageSources().generic(), (damage * bonusDamage));
        exceedDown(stack);

        return super.postHit(stack, target, attacker);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        ItemStack stack = playerEntity.getStackInHand(hand);

        Random exceedRand = new Random();
        int exceedChance = 21;
        int randomExceedChance = exceedRand.nextInt(exceedChance);

        if (!world.isClient) {
            if (!playerEntity.isSneaking()) {
                if (!isExceedMax(stack)) {
                    if (randomExceedChance < 6) {
                        exceedUp(stack, playerEntity);
                        world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 0.15f, 1f);
                        playerEntity.getItemCooldownManager().set(this, 10);
                        return new TypedActionResult<>(ActionResult.SUCCESS, stack);
                    }
                    playerEntity.sendMessage(Text.translatable("item.reborn12k.red_queen.tooltip4"), true);
                    playerEntity.getItemCooldownManager().set(this, 10);
                    return new TypedActionResult<>(ActionResult.SUCCESS, stack);
                }
                playerEntity.sendMessage(Text.translatable("item.reborn12k.red_queen.tooltip7"), true);
                return new TypedActionResult<>(ActionResult.SUCCESS, stack);
            }
            return new TypedActionResult<>(ActionResult.SUCCESS, stack);
        }
        return new TypedActionResult<>(ActionResult.SUCCESS, stack);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        LivingEntity livingEntity = (LivingEntity) entity;
        PlayerEntity playerEntity = (PlayerEntity) livingEntity;

        if (!world.isClient()) {
            if (playerEntity.hurtTime == 1) {
                    exceedDown(stack);
            }
        }
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        String none = "§4I I I";
        String low = (isExceedLow(stack)) ? "§4I I §7I" : none;
        String high = (isExceedHigh(stack)) ? "§4I §7I I" : low;
        String max = (isExceedMax(stack)) ? "§7I I I" : high;

        tooltip.add(Text.translatable("item.reborn12k.red_queen.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.red_queen.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.red_queen.tooltip3", max));
    }

}