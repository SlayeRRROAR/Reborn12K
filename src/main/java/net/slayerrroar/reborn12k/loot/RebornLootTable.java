package net.slayerrroar.reborn12k.loot;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.*;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.*;
import net.slayerrroar.reborn12k.items.*;

@SuppressWarnings("unused")

public class RebornLootTable {

    //Blocks

    private static final Identifier JUNGLE_LEAVES_ID
            = new Identifier("minecraft", "blocks/jungle_leaves");
    private static final Identifier CHERRY_LEAVES_ID
            = new Identifier("minecraft", "blocks/cherry_leaves");

    //Chests

    private static final Identifier ABANDONED_MINESHAFT_ID
            = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier ANCIENT_CITY_ID
            = new Identifier("minecraft", "chests/ancient_city");
    private static final Identifier BASTION_TREASURE_ID
            = new Identifier("minecraft", "chests/bastion_treasure");
    private static final Identifier BURIED_TREASURE_ID
            = new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier DESERT_PYRAMID_ID
            = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier END_CITY_TREASURE_ID
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier JUNGLE_TEMPLE_ID
            = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier NETHER_BRIDGE_ID
            = new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier STRONGHOLD_LIBRARY_ID
            = new Identifier("minecraft", "chests/stronghold_library");
    private static final Identifier WOODLAND_MANSION_ID
            = new Identifier("minecraft", "chests/woodland_mansion");

    //Entities

    private static final Identifier WARDEN_ID
            = new Identifier("minecraft", "entities/warden");
    private static final Identifier WITHER_ID
            = new Identifier("minecraft", "entities/wither");


    public static void register() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            if (JUNGLE_LEAVES_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE,
                                0.005f,
                                0.0055555557f,
                                0.00625f,
                                0.008333334f,
                                0.025f))
                        .with(ItemEntry.builder(GenericItems.BANANA))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            /*if (CHERRY_LEAVES_LEAVES_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE,
                                0.005f,
                                0.0055555557f,
                                0.00625f,
                                0.008333334f,
                                0.025f))
                        .with(ItemEntry.builder(ItemGenerics.CHERRY))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());
                tableBuilder.pool(poolBuilder.build());
            }*/



            if (Reborn12K.CONFIG.enableChests) {

                if (ABANDONED_MINESHAFT_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(UniformLootNumberProvider.create(0, 1))
                            .conditionally(RandomChanceLootCondition.builder(1f))
                            .with(ItemEntry.builder(AdvancedBlocks.COMMON_STRONGBOX).weight(10))
                            .with(ItemEntry.builder(AdvancedBlocks.RARE_STRONGBOX).weight(3))
                            .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());
                    tableBuilder.pool(poolBuilder.build());
                }

                if (ANCIENT_CITY_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(UniformLootNumberProvider.create(0, 2))
                            .with(ItemEntry.builder(AdvancedBlocks.RARE_STRONGBOX).weight(3))
                            .with(ItemEntry.builder(AdvancedBlocks.EPIC_STRONGBOX).weight(5))
                            .with(ItemEntry.builder(AdvancedBlocks.LEGENDARY_STRONGBOX).weight(1))
                            .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());
                    tableBuilder.pool(poolBuilder.build());
                }

                if (BASTION_TREASURE_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .with(ItemEntry.builder(AdvancedBlocks.RARE_STRONGBOX).weight(3))
                            .with(ItemEntry.builder(AdvancedBlocks.EPIC_STRONGBOX).weight(5))
                            .with(ItemEntry.builder(AdvancedBlocks.LEGENDARY_STRONGBOX).weight(1))
                            .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());
                    tableBuilder.pool(poolBuilder.build());
                }

                if (BURIED_TREASURE_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(UniformLootNumberProvider.create(0, 1))
                            .with(ItemEntry.builder(AdvancedBlocks.RARE_STRONGBOX).weight(20))
                            .with(ItemEntry.builder(AdvancedBlocks.EPIC_STRONGBOX).weight(8))
                            .with(ItemEntry.builder(AdvancedBlocks.LEGENDARY_STRONGBOX).weight(1))
                            .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());
                    tableBuilder.pool(poolBuilder.build());
                }

                if (DESERT_PYRAMID_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(UniformLootNumberProvider.create(0, 1))
                            .with(ItemEntry.builder(AdvancedBlocks.COMMON_STRONGBOX).weight(10))
                            .with(ItemEntry.builder(AdvancedBlocks.RARE_STRONGBOX).weight(3))
                            .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());
                    tableBuilder.pool(poolBuilder.build());
                }

                if (END_CITY_TREASURE_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(UniformLootNumberProvider.create(1, 2))
                            .with(ItemEntry.builder(AdvancedBlocks.EPIC_STRONGBOX).weight(8))
                            .with(ItemEntry.builder(AdvancedBlocks.LEGENDARY_STRONGBOX).weight(5))
                            .with(ItemEntry.builder(AdvancedBlocks.ELEMENTAL_STRONGBOX).weight(1))
                            .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());
                    tableBuilder.pool(poolBuilder.build());
                }

                if (JUNGLE_TEMPLE_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(UniformLootNumberProvider.create(0, 1))
                            .with(ItemEntry.builder(AdvancedBlocks.RARE_STRONGBOX).weight(3))
                            .with(ItemEntry.builder(AdvancedBlocks.EPIC_STRONGBOX).weight(8))
                            .with(ItemEntry.builder(AdvancedBlocks.LEGENDARY_STRONGBOX).weight(1))
                            .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());
                    tableBuilder.pool(poolBuilder.build());
                }

                if (NETHER_BRIDGE_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .with(ItemEntry.builder(AdvancedBlocks.RARE_STRONGBOX).weight(4))
                            .with(ItemEntry.builder(AdvancedBlocks.EPIC_STRONGBOX).weight(1))
                            .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());
                    tableBuilder.pool(poolBuilder.build());
                }

                if (STRONGHOLD_LIBRARY_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(UniformLootNumberProvider.create(1, 2))
                            .with(ItemEntry.builder(AdvancedBlocks.RARE_STRONGBOX).weight(8))
                            .with(ItemEntry.builder(AdvancedBlocks.EPIC_STRONGBOX).weight(5))
                            .with(ItemEntry.builder(AdvancedBlocks.LEGENDARY_STRONGBOX).weight(1))
                            .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());
                    tableBuilder.pool(poolBuilder.build());
                }

                if (WOODLAND_MANSION_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(UniformLootNumberProvider.create(1, 2))
                            .with(ItemEntry.builder(AdvancedBlocks.RARE_STRONGBOX).weight(2))
                            .with(ItemEntry.builder(AdvancedBlocks.EPIC_STRONGBOX).weight(6))
                            .with(ItemEntry.builder(AdvancedBlocks.LEGENDARY_STRONGBOX).weight(1))
                            .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
            }



            if (Reborn12K.CONFIG.enableMobDrops) {

                if (Reborn12K.CONFIG.enableWardenDrops) {
                    if (WARDEN_ID.equals(id)) {
                        LootPool.Builder poolBuilder = LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .with(ItemEntry.builder(AdvancedBlocks.EPIC_STRONGBOX).weight(10))
                                .with(ItemEntry.builder(AdvancedBlocks.LEGENDARY_STRONGBOX).weight(4))
                                .with(ItemEntry.builder(AdvancedBlocks.ELEMENTAL_STRONGBOX).weight(1))
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());
                        tableBuilder.pool(poolBuilder.build());
                    }
                }

                if (Reborn12K.CONFIG.enableWitherDrops) {
                    if (WITHER_ID.equals(id)) {
                        LootPool.Builder poolBuilder = LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .with(ItemEntry.builder(AdvancedBlocks.EPIC_STRONGBOX).weight(10))
                                .with(ItemEntry.builder(AdvancedBlocks.LEGENDARY_STRONGBOX).weight(4))
                                .with(ItemEntry.builder(AdvancedBlocks.ELEMENTAL_STRONGBOX).weight(1))
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());
                        tableBuilder.pool(poolBuilder.build());
                    }
                }

            }

        });
    }
}