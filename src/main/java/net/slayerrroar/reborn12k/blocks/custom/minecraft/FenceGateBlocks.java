package net.slayerrroar.reborn12k.blocks.custom.minecraft;

import net.minecraft.block.FenceGateBlock;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class FenceGateBlocks extends FenceGateBlock {
    private static final SoundEvent closeSound = SoundEvents.BLOCK_FENCE_GATE_CLOSE;
    private static final SoundEvent openSound = SoundEvents.BLOCK_FENCE_GATE_OPEN;

    public FenceGateBlocks(Settings settings) {
        super(settings, closeSound, openSound);
    }
}
