package net.slayerrroar.reborn12k.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;
import net.slayerrroar.reborn12k.blocks.block_entities.*;

public class CustomBlockEntities {

    public static BlockEntityType<RunicArtifactBlockEntity> RUNIC_ARTIFACT;

    public static BlockEntityType<MelterBlockEntity> MELTER;

    public static BlockEntityType<BasicQuarryBlockEntity> BASIC_QUARRY;
    public static BlockEntityType<AdvancedQuarryBlockEntity> ADVANCED_QUARRY;
    public static BlockEntityType<UltimateQuarryBlockEntity> ULTIMATE_QUARRY;

    public static void register(){

        RUNIC_ARTIFACT = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Reborn12K.MOD_ID, "runic_artifact"),
                FabricBlockEntityTypeBuilder.create(RunicArtifactBlockEntity::new,
                        AdvancedBlocks.RUNIC_ARTIFACT).build(null));

        MELTER = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Reborn12K.MOD_ID, "melter"),
                FabricBlockEntityTypeBuilder.create(MelterBlockEntity::new,
                        AdvancedBlocks.MELTER).build(null));

        BASIC_QUARRY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Reborn12K.MOD_ID, "basic_laser_quarry"),
                FabricBlockEntityTypeBuilder.create(BasicQuarryBlockEntity::new,
                        AdvancedBlocks.BASIC_LASER_QUARRY).build(null));

        ADVANCED_QUARRY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Reborn12K.MOD_ID, "advanced_laser_quarry"),
                FabricBlockEntityTypeBuilder.create(AdvancedQuarryBlockEntity::new,
                        AdvancedBlocks.ADVANCED_LASER_QUARRY).build(null));

        ULTIMATE_QUARRY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Reborn12K.MOD_ID, "ultimate_laser_quarry"),
                FabricBlockEntityTypeBuilder.create(UltimateQuarryBlockEntity::new,
                        AdvancedBlocks.ULTIMATE_LASER_QUARRY).build(null));

    }

}
