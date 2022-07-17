package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class AdvancedItems {

    public static final Item TIME_SINGULARITY = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "time_singularity"), TIME_SINGULARITY);

        Reborn12K.LOGGER.info("Registering Advanced Items for " + Reborn12K.MOD_ID);

    }

}