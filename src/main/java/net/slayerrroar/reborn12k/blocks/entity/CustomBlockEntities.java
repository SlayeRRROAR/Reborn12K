package net.slayerrroar.reborn12k.blocks.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.AdvancedBlocks;

public class CustomBlockEntities {

    public static BlockEntityType<AlloyFurnaceBlockEntity> ALLOY_FURNACE;

    public static void register() {

        ALLOY_FURNACE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Reborn12K.MOD_ID, "alloy_furnace"),
                FabricBlockEntityTypeBuilder.create(AlloyFurnaceBlockEntity::new,
                        AdvancedBlocks.ALLOY_FURNACE).build(null));

    }

}
