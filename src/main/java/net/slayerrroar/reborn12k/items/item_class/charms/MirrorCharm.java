package net.slayerrroar.reborn12k.items.item_class.charms;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;

public class MirrorCharm extends Item {
    public MirrorCharm(Settings settings) {
        super(settings);
    }

    public void setPositionAndUpdate(ServerPlayerEntity playerEntity, BlockPos bedPos) {
        playerEntity.teleport(bedPos.getX() + 0.5F, bedPos.getY() + 0.6F, bedPos.getZ() + 0.5F);
        playerEntity.fallDistance = 0;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        ItemStack itemStack = playerEntity.getStackInHand(hand);
        RegistryKey<World> registryKey = world.getRegistryKey();

        if(playerEntity.getStackInHand(hand) == itemStack && playerEntity.getStackInHand(hand).getDamage() < 16)
        {
            if (!world.isClient && !playerEntity.isSneaking()) {
                ServerPlayerEntity serverPlayer = (ServerPlayerEntity) playerEntity;

                if (registryKey == World.OVERWORLD) {
                    if (serverPlayer.getSpawnPointPosition() != null)
                        {
                            BlockPos bedPos = serverPlayer.getSpawnPointPosition();
                            serverPlayer.stopRiding();
                            setPositionAndUpdate(serverPlayer, bedPos);
                            world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 0.25F, 0.25F);
                            playerEntity.sendMessage(new TranslatableText("item.reborn12k.magic_mirror.tooltip1"), true);   //tp to last bed
                            playerEntity.getItemCooldownManager().set(this, 20*3);
                            playerEntity.getStackInHand(hand).damage(1, world.random, null);
                        }
                    else
                    {
                        playerEntity.sendMessage(new TranslatableText("item.reborn12k.magic_mirror.tooltip2"), true);  //bed not set
                        return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));
                    }
                }
                else
                {
                    playerEntity.sendMessage(new TranslatableText("item.reborn12k.magic_mirror.tooltip3"), true);  //works only in the overworld
                }
            }
        }
        else
        {
            playerEntity.sendMessage(new TranslatableText("item.reborn12k.magic_mirror.tooltip4"), true);  //no uses left
            return new TypedActionResult<>(ActionResult.FAIL, playerEntity.getStackInHand(hand));
        }

        return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));
    }
}