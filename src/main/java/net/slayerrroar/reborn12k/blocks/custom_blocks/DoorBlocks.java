package net.slayerrroar.reborn12k.blocks.custom_blocks;

import net.minecraft.block.DoorBlock;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class DoorBlocks extends DoorBlock {
    private static final SoundEvent closeSound = SoundEvents.BLOCK_WOODEN_DOOR_CLOSE;
    private static final SoundEvent openSound = SoundEvents.BLOCK_WOODEN_DOOR_OPEN;

    public DoorBlocks(Settings settings) {
        super(settings, closeSound, openSound);
    }
}
