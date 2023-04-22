package net.slayerrroar.reborn12k.mixin;

import net.minecraft.block.Blocks;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.boss.dragon.EnderDragonFight;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.feature.EndPortalFeature;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.UUID;

@SuppressWarnings("JavaDoc")

@Mixin(EnderDragonFight.class)
public abstract class EnderDragonMixin {

    @Final
    @Shadow
    private ServerBossBar bossBar;

    @Shadow
    private UUID dragonUuid;

    @Shadow
    protected abstract void generateEndPortal(boolean previouslyKilled);

    @Shadow
    protected abstract void generateNewEndGateway();

    @Final
    @Shadow
    private ServerWorld world;

    @Shadow
    private boolean previouslyKilled;

    @Shadow
    private boolean dragonKilled;

    /**
     * @author
     * @reason
     */

    @Overwrite
    public void dragonKilled(EnderDragonEntity dragon) {
        if (dragon.getUuid().equals(this.dragonUuid)) {
            this.bossBar.setPercent(0.0f);
            this.bossBar.setVisible(false);
            this.generateEndPortal(true);
            this.generateNewEndGateway();
            if (!this.previouslyKilled) {
                this.world.setBlockState(this.world.getTopPosition(Heightmap.Type.MOTION_BLOCKING, EndPortalFeature.ORIGIN), Blocks.DRAGON_EGG.getDefaultState());
            } else {
                if (Reborn12K.CONFIG.enableEnderDragonDrops) {
                    this.world.setBlockState(this.world.getTopPosition(Heightmap.Type.MOTION_BLOCKING, EndPortalFeature.ORIGIN), AdvancedBlocks.LEGENDARY_STRONGBOX.getDefaultState());
                }
            }
            this.previouslyKilled = true;
            this.dragonKilled = true;
        }
    }

}
