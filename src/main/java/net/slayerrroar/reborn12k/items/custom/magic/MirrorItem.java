package net.slayerrroar.reborn12k.items.custom.magic;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MirrorItem extends Item {
    public MirrorItem(Settings settings) {
        super(settings);
    }

    public void setPositionAndUpdate(ServerPlayerEntity player, BlockPos pos) {
        player.teleport(pos.getX() + 0.5f, pos.getY() + 0.6F, pos.getZ() + 0.5f);
        player.fallDistance = 0;
    }

    private void teleport(World world, PlayerEntity player) {
        ServerPlayerEntity serverPlayer = (ServerPlayerEntity) player;
        if (serverPlayer.getSpawnPointPosition() != null) {
            BlockPos pos = serverPlayer.getSpawnPointPosition();
            serverPlayer.stopRiding();
            setPositionAndUpdate(serverPlayer, pos);
            world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25f, 0.25f);
            player.sendMessage(Text.translatable("item.reborn12k.magic_mirror.tooltip1"), true);   //tp to last bed
        }
        if (serverPlayer.getSpawnPointPosition() == null) {
            player.sendMessage(Text.translatable("item.reborn12k.magic_mirror.tooltip2"), true);  //bed not set
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        RegistryKey<World> registryKey = world.getRegistryKey();
        if (player.getStackInHand(hand) == itemStack && player.getStackInHand(hand).getDamage() < 16) {
            if (!world.isClient) {
                if (registryKey == World.OVERWORLD) {
                    teleport(world, player);
                    player.getItemCooldownManager().set(this, 20 * 3);
                    player.getStackInHand(hand).damage(1, world.random, null);
                    return new TypedActionResult<>(ActionResult.SUCCESS, player.getStackInHand(hand));
                }
                player.sendMessage(Text.translatable("item.reborn12k.magic_mirror.tooltip3"), true);  //works only in the overworld
            }
        }
        if (player.getStackInHand(hand) == itemStack && player.getStackInHand(hand).getDamage() == 16) {
            player.sendMessage(Text.translatable("item.reborn12k.magic_mirror.tooltip4"), true);  //no uses left
        }
        return new TypedActionResult<>(ActionResult.FAIL, player.getStackInHand(hand));
    }

}