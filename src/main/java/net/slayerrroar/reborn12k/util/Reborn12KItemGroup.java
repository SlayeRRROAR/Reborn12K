package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.BaseItems;

public class Reborn12KItemGroup {

    public static final ItemGroup REBORN12K = FabricItemGroupBuilder.build(new Identifier(Reborn12K.MOD_ID, "reborn12k"),
            () -> new ItemStack(BaseItems.STEEL_INGOT));

}
