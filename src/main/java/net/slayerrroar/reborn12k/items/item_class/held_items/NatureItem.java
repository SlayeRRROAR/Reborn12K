package net.slayerrroar.reborn12k.items.item_class.held_items;

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

public class NatureItem extends Item {

    static int range = 9; //defines horizonatal range
    static int rangeVertical = 4; //defines vertical range
    static int interval = 20*5; //interval between growth ticks
    static int intervalCactus = 20*10; //interval between cactus growth ticks
    static final String NATURE_STATE = "Tear State";

    public NatureItem(Item.Settings settings)
    {
        super(settings);
    }

    public boolean hasGlint(ItemStack nature_charm)
    {
        return isActive(nature_charm);
    }

    public enum NatureState
    {
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

    public boolean isActive(ItemStack nature_charm)
    {
        return getNatureState(nature_charm).getBoolean();
    }

    private void setNatureState(ItemStack nature_charm, NatureState mode)
    {
        checkTag(nature_charm);
        assert nature_charm.getNbt() != null;
        nature_charm.getNbt().putBoolean(NATURE_STATE, mode.getBoolean());
    }

    private NatureState getNatureState(ItemStack nature_charm)
    {
        if(!nature_charm.isEmpty())
        {
            checkTag(nature_charm);

            assert nature_charm.getNbt() != null;
            return nature_charm.getNbt().getBoolean(NATURE_STATE) ? NatureState.ON : NatureState.OFF;
        }
        return NatureState.OFF;
    }

    private void toggleMode(ItemStack nature_charm, PlayerEntity playerEntity)
    {
        NatureState currentMode = getNatureState(nature_charm);

        if(currentMode.getBoolean())
        {
            setNatureState(nature_charm, NatureState.OFF);
            playerEntity.sendMessage(Text.translatable("item.reborn12k.yggdrasill_branch.tooltip1"), true);

            return;
        }

        setNatureState(nature_charm, NatureState.ON);
        playerEntity.sendMessage(Text.translatable("item.reborn12k.yggdrasill_branch.tooltip2"), true);
    }

    private void checkTag(ItemStack nature_charm)
    {
        if(!nature_charm.isEmpty())
        {

            if(!nature_charm.hasNbt())
            {
                nature_charm.setNbt(new NbtCompound());
            }
            NbtCompound nbt = nature_charm.getNbt();

            assert nbt != null;

            if(!nbt.contains(NATURE_STATE))
            {
                nbt.putBoolean(NATURE_STATE, false);
            }
        }
    }

    @Override
    public void inventoryTick(ItemStack itemStack, World world, Entity entity, int par4, boolean par5)
    {
        if(!(entity instanceof PlayerEntity playerEntity) || world.isClient)
        {
            return;
        }

        if(isActive(itemStack))
        {
            GrowingUtil.growCrops(world, playerEntity, range, rangeVertical, interval, intervalCactus);
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand)
    {
        ItemStack nature_charm = playerEntity.getStackInHand(hand);

        if(!world.isClient && !playerEntity.isSneaking()) {
            toggleMode(nature_charm, playerEntity);
            world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 0.25F, 0.25F);
        }

            return new TypedActionResult<>(ActionResult.SUCCESS, nature_charm);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
        if(getNatureState(itemStack) != NatureState.ON){
            tooltip.add(Text.translatable("item.reborn12k.yggdrasill_branch.tooltip1"));
        }

        else {
            tooltip.add(Text.translatable("item.reborn12k.yggdrasill_branch.tooltip2"));
        }
    }
}