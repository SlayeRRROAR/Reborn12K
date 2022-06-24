package net.slayerrroar.reborn12k.items.item_class.charms;

import java.util.List;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class MagnetCharm extends Item {

    static int setRange = 12; //defines range of magnet
    static final String MAGNET_STATE = "Magnet State";

    public MagnetCharm(Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack magnet_charm) {
        return isActive(magnet_charm);
    }

    public enum MagnetState {
        ON(true), OFF(false);
        final boolean state;
        MagnetState(boolean state) {
            this.state = state;
        }
        public boolean getBoolean() {
            return state;
        }
    }

    public boolean isActive(ItemStack magnet_charm) {
        return getMagnetState(magnet_charm).getBoolean();
    }

    private void setMagnetState(ItemStack magnet_charm, MagnetState mode) {
        checkTag(magnet_charm);
        assert magnet_charm.getNbt() != null;
        magnet_charm.getNbt().putBoolean(MAGNET_STATE, mode.getBoolean());
    }

    private MagnetState getMagnetState(ItemStack magnet_charm) {
        if(!magnet_charm.isEmpty()) {
            checkTag(magnet_charm);

            assert magnet_charm.getNbt() != null;
            return magnet_charm.getNbt().getBoolean(MAGNET_STATE) ? MagnetState.ON : MagnetState.OFF;
        }
        return MagnetState.OFF;
    }

    private void toggleMode(ItemStack magnet_charm, PlayerEntity playerEntity) {
        MagnetState currentMode = getMagnetState(magnet_charm);

        if(currentMode.getBoolean()) {
            setMagnetState(magnet_charm, MagnetState.OFF);
            playerEntity.sendMessage(Text.translatable("item.reborn12k.magnet.tooltip1"), true);

            return;
        }

        setMagnetState(magnet_charm, MagnetState.ON);
        playerEntity.sendMessage(Text.translatable("item.reborn12k.magnet.tooltip2"), true);
    }

    private void checkTag(ItemStack magnet_charm) {
        if(!magnet_charm.isEmpty()) {

            if(!magnet_charm.hasNbt()) {
                magnet_charm.setNbt(new NbtCompound());
            }
            NbtCompound nbt = magnet_charm.getNbt();

            assert nbt != null;

            if(!nbt.contains(MAGNET_STATE)) {
                nbt.putBoolean(MAGNET_STATE, false);
            }
        }
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected)
    {

        if(!world.isClient && isActive(stack))
        {
            ServerPlayerEntity playerEntity = (ServerPlayerEntity) entity;

            List<ItemEntity> entityItems = playerEntity.getWorld().getEntitiesByClass(ItemEntity.class, playerEntity.getBoundingBox().expand(setRange), EntityPredicates.VALID_ENTITY);
            for (ItemEntity entityItemNearby : entityItems)
            {
                entityItemNearby.onPlayerCollision(playerEntity);
            }

            List<ExperienceOrbEntity> entityXP = playerEntity.getWorld().getEntitiesByClass(ExperienceOrbEntity.class, playerEntity.getBoundingBox().expand(setRange), EntityPredicates.VALID_ENTITY);
            for (Entity entityXPNearby : entityXP)
            {
                entityXPNearby.onPlayerCollision(playerEntity);
            }
        }
    }



    @Override
    public TypedActionResult<ItemStack> use( World world, PlayerEntity playerEntity, Hand hand) {
        ItemStack magnet_charm = playerEntity.getStackInHand(hand);

        if(!world.isClient && !playerEntity.isSneaking()) {
            toggleMode(magnet_charm, playerEntity);
            world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 0.25F, 0.25F);
        }

        return new TypedActionResult<>(ActionResult.SUCCESS, magnet_charm);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        if(getMagnetState(itemStack) != MagnetState.ON){
            tooltip.add(Text.translatable("item.reborn12k.magnet.tooltip1"));
        }

        else {
            tooltip.add(Text.translatable("item.reborn12k.magnet.tooltip2"));
        }
    }

}