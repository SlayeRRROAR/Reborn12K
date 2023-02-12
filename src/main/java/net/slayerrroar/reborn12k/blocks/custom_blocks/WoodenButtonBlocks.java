package net.slayerrroar.reborn12k.blocks.custom_blocks;

import net.minecraft.block.ButtonBlock;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class WoodenButtonBlocks extends ButtonBlock {
    private static final int pressTicks = 30;
    private static final SoundEvent clickOffSound = SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF;
    private static final SoundEvent clickOnSound = SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON;
    private static final boolean wooden = true;

    public WoodenButtonBlocks(Settings settings) {
        super(settings, pressTicks, wooden, clickOffSound, clickOnSound);
    }
}
