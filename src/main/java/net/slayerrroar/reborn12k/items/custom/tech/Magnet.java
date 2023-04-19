package net.slayerrroar.reborn12k.items.custom.tech;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Equipment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;

public class Magnet extends Item implements Equipment {

    static int magnetRange = 7;
    static final String MAGNET_STATE = "Magnet State";

    public Magnet(Settings settings) {
        super(settings);
    }

    @Override
    public EquipmentSlot getSlotType() {
        return EquipmentSlot.OFFHAND;
    }

    public boolean hasGlint(ItemStack stack) {
        return isActive(stack);
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

    public boolean isActive(ItemStack stack) {
        return getMagnetState(stack).getBoolean();
    }

    private void setMagnetState(ItemStack stack, MagnetState mode) {
        checkTag(stack);
        assert stack.getNbt() != null;
        stack.getNbt().putBoolean(MAGNET_STATE, mode.getBoolean());
    }

    private MagnetState getMagnetState(ItemStack stack) {
        if (!stack.isEmpty()) {
            checkTag(stack);
            assert stack.getNbt() != null;
            return stack.getNbt().getBoolean(MAGNET_STATE) ? MagnetState.ON : MagnetState.OFF;
        }
        return MagnetState.OFF;
    }

    private void toggleMagnet(ItemStack stack, PlayerEntity player) {
        World world = player.getWorld();

        if (getMagnetState(stack).getBoolean()) {
            setMagnetState(stack, MagnetState.OFF);
            world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 0.25F, 0.25F);
            player.getItemCooldownManager().set(this, 10);
            player.sendMessage(Text.translatable("item.reborn12k.magnet.tooltip4"), true);
            return;
        }
        setMagnetState(stack, MagnetState.ON);
        world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 0.25F, 0.25F);
        player.getItemCooldownManager().set(this, 10);
        player.sendMessage(Text.translatable("item.reborn12k.magnet.tooltip5"), true);
    }

    private void checkTag(ItemStack stack) {
        if (!stack.isEmpty()) {
            if (!stack.hasNbt()) {
                stack.setNbt(new NbtCompound());
            }
            NbtCompound nbt = stack.getNbt();
            assert nbt != null;
            if (!nbt.contains(MAGNET_STATE)) {
                nbt.putBoolean(MAGNET_STATE, false);
            }
        }
    }

    private void attractItemAndXp(Entity entity) {
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();

        List<ItemEntity> itemNearby = entity.getEntityWorld().getEntitiesByType(EntityType.ITEM,
                entity.getBoundingBox().expand(magnetRange),
                EntityPredicates.VALID_ENTITY);
        List<ExperienceOrbEntity> xpNearby = entity.getEntityWorld().getEntitiesByType(EntityType.EXPERIENCE_ORB,
                entity.getBoundingBox().expand(magnetRange),
                EntityPredicates.VALID_ENTITY);

        for (ItemEntity item : itemNearby) {
            item.setPickupDelay(0);
            Vec3d itemVector = new Vec3d(item.getX(), item.getY(), item.getZ());
            Vec3d playerVector = new Vec3d(x, y + 0.03, z);
            item.move(null, playerVector.subtract(itemVector).multiply(0.5));
        }
        for (Entity xp : xpNearby) {
            Vec3d itemVector = new Vec3d(xp.getX(), xp.getY(), xp.getZ());
            Vec3d playerVector = new Vec3d(x, y + 0.03, z);
            xp.move(null, playerVector.subtract(itemVector).multiply(0.5));
        }

    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        PlayerEntity player = (PlayerEntity) entity;

        if(!world.isClient && isActive(stack)) {
            if(player.getStackInHand(Hand.OFF_HAND) == stack || player.getStackInHand(Hand.MAIN_HAND) == stack) {
                attractItemAndXp(entity);
            }
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);

        if(!world.isClient && player.isSneaking()) {
            toggleMagnet(stack, player);
            return new TypedActionResult<>(ActionResult.SUCCESS, stack);
        }
        return new TypedActionResult<>(ActionResult.FAIL, stack);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.reborn12k.magnet.tooltip1"));
        tooltip.add(Text.translatable("item.reborn12k.magnet.tooltip2"));
        tooltip.add(Text.translatable("item.reborn12k.magnet.tooltip3"));
        if (getMagnetState(itemStack) != MagnetState.ON){
            tooltip.add(Text.translatable("item.reborn12k.magnet.tooltip6"));
        } else {
            tooltip.add(Text.translatable("item.reborn12k.magnet.tooltip7"));
        }
    }

}