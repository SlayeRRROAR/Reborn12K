package net.slayerrroar.reborn12k.blocks.custom.minecraft;

import net.minecraft.block.PressurePlateBlock;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class WoodenPressurePlateBlocks extends PressurePlateBlock {
    private static final SoundEvent depressSound = SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF;
    private static final SoundEvent pressSound = SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON;

    public WoodenPressurePlateBlocks(ActivationRule type, Settings settings) {
        super(type, settings, depressSound, pressSound);
    }
}
