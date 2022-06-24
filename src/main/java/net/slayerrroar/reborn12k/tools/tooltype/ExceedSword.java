package net.slayerrroar.reborn12k.tools.tooltype;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
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

    private void setExceedState(ItemStack red_queen, ExceedState mode) {
        checkTag(red_queen);
        assert red_queen.getNbt() != null;
        red_queen.getNbt().putBoolean(EXCEED_STATE, mode.getBoolean());
    }

    private ExceedState getExceedState(ItemStack red_queen) {
        if(!red_queen.isEmpty()) {
            checkTag(red_queen);

            assert red_queen.getNbt() != null;
            return red_queen.getNbt().getBoolean(EXCEED_STATE) ? ExceedState.ACTIVE : ExceedState.INACTIVE;
        }
        return ExceedState.INACTIVE;
    }

    private void ActivateExceed(ItemStack red_queen) {
        setExceedState(red_queen, ExceedState.ACTIVE);
    }

    private void DeactivateExceed(ItemStack red_queen) {
        setExceedState(red_queen, ExceedState.INACTIVE);
    }

    @Override
    public boolean postHit(ItemStack red_queen, LivingEntity target, LivingEntity attacker) {
        ExceedState currentmode = getExceedState(red_queen);
        if(currentmode != ExceedState.INACTIVE && target instanceof MobEntity) {
            if(target.getGroup() == EntityGroup.UNDEAD) {
                target.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 2,2));
                DeactivateExceed(red_queen);
            }
            else if (target.getGroup() != EntityGroup.UNDEAD) {
                target.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 2, 2));
                DeactivateExceed(red_queen);
            }
        }
        return false;
    }

    private void checkTag(ItemStack red_queen) {
        if(!red_queen.isEmpty()) {

            if(!red_queen.hasNbt()) {
                red_queen.setNbt(new NbtCompound());
            }
            NbtCompound nbt = red_queen.getNbt();

            assert nbt != null;

            if(!nbt.contains(EXCEED_STATE)) {
                nbt.putBoolean(EXCEED_STATE, false);
            }
        }
    }



    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        ItemStack red_queen = playerEntity.getStackInHand(hand);
        ExceedState currentMode = getExceedState(red_queen);

        if(!world.isClient && !playerEntity.isSneaking()) {
            if(currentMode!= ExceedState.ACTIVE) {
                Random rand = new Random();
                int upperbound = 21;
                int int_random = rand.nextInt(upperbound);

                if(int_random < 6) {
                    ActivateExceed(red_queen);
                    world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 0.15F, 0.0F);
                    playerEntity.sendMessage(Text.translatable("item.reborn12k.red_queen.tooltip3"), true);
                }
                else {
                    playerEntity.sendMessage(Text.translatable("item.reborn12k.red_queen.tooltip4"), true);
                }
                return new TypedActionResult<>(ActionResult.SUCCESS, red_queen);
            }
            playerEntity.sendMessage(Text.translatable("item.reborn12k.red_queen.tooltip5"), true);
        }
        return new TypedActionResult<>(ActionResult.FAIL, red_queen);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        if(getExceedState(itemStack) != ExceedState.ACTIVE){
            tooltip.add(Text.translatable("item.reborn12k.red_queen.tooltip1"));
        }

        else {
            tooltip.add(Text.translatable("item.reborn12k.red_queen.tooltip2"));
        }
    }

}