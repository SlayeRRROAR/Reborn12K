package net.slayerrroar.reborn12k.blocks.custom.minecraft;

import net.minecraft.block.TrapdoorBlock;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class WoodenTrapdoorBlocks extends TrapdoorBlock {
    private static final SoundEvent closeSound = SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE;
    private static final SoundEvent openSound = SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN;

    public WoodenTrapdoorBlocks(Settings settings) {
        super(settings, closeSound, openSound);
    }
}
