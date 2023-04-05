package net.slayerrroar.reborn12k.items.custom.magic;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.util.GrowingUtil;

import java.util.List;

public class YggdrasillItem extends Item {

    static int range = 9; //horizonatal range
    static int rangeVertical = 4; //vertical range
    static int interval = 20*5; //growth ticks interval
    static int intervalCactus = 20*10; //growth ticks interval cacti

    static final String NATURE_STATE = "Tear State";

    public YggdrasillItem(Item.Settings settings)
    {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack)
    {
        return isActive(stack);
    }

    public enum NatureState {
        ON(true), OFF(false);
        final boolean state;
        NatureState(boolean state)
        {
            this.state = state;
        }
        public boolean getBoolean()
        {
            return state;
        }
    }

    public boolean isActive(ItemStack stack)
    {
        return getNatureState(stack).getBoolean();
    }

    private void setNatureState(ItemStack stack, NatureState mode) {
        checkTag(stack);
        assert stack.getNbt() != null;
        stack.getNbt().putBoolean(NATURE_STATE, mode.getBoolean());
    }

    private NatureState getNatureState(ItemStack stack) {
        if(!stack.isEmpty()) {
            checkTag(stack);
            assert stack.getNbt() != null;
            return stack.getNbt().getBoolean(NATURE_STATE) ? NatureState.ON : NatureState.OFF;
        }
        return NatureState.OFF;
    }

    private void toggleMode(ItemStack stack, PlayerEntity player) {
        NatureState currentMode = getNatureState(stack);
        if(currentMode.getBoolean()) {
            setNatureState(stack, NatureState.OFF);
            player.sendMessage(Text.translatable("item.reborn12k.yggdrasill_branch.tooltip1"), true);
            return;
        }
        setNatureState(stack, NatureState.ON);
        player.sendMessage(Text.translatable("item.reborn12k.yggdrasill_branch.tooltip2"), true);
    }

    private void checkTag(ItemStack stack) {
        if(!stack.isEmpty()) {
            if(!stack.hasNbt()) {
                stack.setNbt(new NbtCompound());
            }
            NbtCompound nbt = stack.getNbt();
            assert nbt != null;
            if(!nbt.contains(NATURE_STATE)) {
                nbt.putBoolean(NATURE_STATE, false);
            }
        }
    }

    @Override
    public void inventoryTick(ItemStack itemStack, World world, Entity entity, int par4, boolean par5) {
        if(!(entity instanceof PlayerEntity player) || world.isClient) {
            return;
        }
        if(isActive(itemStack)) {
            GrowingUtil.growCrops(world, player, range, rangeVertical, interval, intervalCactus);
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);
        if(!world.isClient && !player.isSneaking()) {
            toggleMode(stack, player);
            world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 0.25F, 0.25F);
        }
            return new TypedActionResult<>(ActionResult.SUCCESS, stack);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        if(getNatureState(itemStack) != NatureState.ON) {
            tooltip.add(Text.translatable("item.reborn12k.yggdrasill_branch.tooltip1"));
        } else {
            tooltip.add(Text.translatable("item.reborn12k.yggdrasill_branch.tooltip2"));
        }
    }
}