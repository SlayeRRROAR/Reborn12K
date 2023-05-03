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

    public static BlockEntityType<BasicQuarryBlockEntity> BASIC_QUARRY;
    public static BlockEntityType<AdvancedQuarryBlockEntity> ADVANCED_QUARRY;
    public static BlockEntityType<UltimateQuarryBlockEntity> ULTIMATE_QUARRY;

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

        BASIC_QUARRY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Reborn12K.MOD_ID, "basic_laser_quarry"),
                FabricBlockEntityTypeBuilder.create(BasicQuarryBlockEntity::new,
                        AdvancedBlocks.BASIC_LASER_QUARRY).build(null));

        ADVANCED_QUARRY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Reborn12K.MOD_ID, "advanced_laser_quarry"),
                FabricBlockEntityTypeBuilder.create(AdvancedQuarryBlockEntity::new,
                        AdvancedBlocks.ADVANCED_LASER_QUARRY).build(null));

        ULTIMATE_QUARRY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Reborn12K.MOD_ID, "ultimate_laser_quarry"),
                FabricBlockEntityTypeBuilder.create(UltimateQuarryBlockEntity::new,
                        AdvancedBlocks.ULTIMATE_LASER_QUARRY).build(null));

    }

}
