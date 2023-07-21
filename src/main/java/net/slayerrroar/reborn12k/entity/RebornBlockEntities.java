package net.slayerrroar.reborn12k.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;
import net.slayerrroar.reborn12k.entity.block_entities.*;

public class RebornBlockEntities {

    public static BlockEntityType<ArcaneArtifactBlockEntity> ARCANE_ARTIFACT;
    public static BlockEntityType<ManaCondenserBlockEntity> MANA_CONDENSER;

    public static BlockEntityType<CrusherBlockEntity> CRUSHER;
    public static BlockEntityType<ManufactoryBlockEntity> MANUFACTORY;
    public static BlockEntityType<MelterBlockEntity> MELTER;

    public static BlockEntityType<LaserQuarryBlockEntity> LASER_QUARRY;

    public static void register(){

        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Block Entities");

        ARCANE_ARTIFACT = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Reborn12K.MOD_ID, "arcane_artifact"),
                FabricBlockEntityTypeBuilder.create(ArcaneArtifactBlockEntity::new,
                        AdvancedBlocks.ARCANE_ARTIFACT).build(null));

        MANA_CONDENSER = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Reborn12K.MOD_ID, "mana_condenser"),
                FabricBlockEntityTypeBuilder.create(ManaCondenserBlockEntity::new,
                        AdvancedBlocks.MANA_CONDENSER).build(null));

        CRUSHER = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Reborn12K.MOD_ID, "crusher"),
                FabricBlockEntityTypeBuilder.create(CrusherBlockEntity::new,
                        AdvancedBlocks.CRUSHER).build(null));

        MANUFACTORY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Reborn12K.MOD_ID, "manufactory"),
                FabricBlockEntityTypeBuilder.create(ManufactoryBlockEntity::new,
                        AdvancedBlocks.MANUFACTORY).build(null));

        MELTER = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Reborn12K.MOD_ID, "melter"),
                FabricBlockEntityTypeBuilder.create(MelterBlockEntity::new,
                        AdvancedBlocks.MELTER).build(null));

        LASER_QUARRY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Reborn12K.MOD_ID, "laser_quarry"),
                FabricBlockEntityTypeBuilder.create(LaserQuarryBlockEntity::new,
                        AdvancedBlocks.LASER_QUARRY).build(null));

    }

}
