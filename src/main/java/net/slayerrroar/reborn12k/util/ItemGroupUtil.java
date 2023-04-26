package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.GenericItems;

public class ItemGroupUtil {

    public static ItemGroup REBORN12K;

    public static void registerItemGroups() {
        REBORN12K = FabricItemGroup.builder(new Identifier(Reborn12K.MOD_ID, "reborn12k"))
                .displayName(Text.translatable("itemGroup.reborn12k"))
                .icon(() -> new ItemStack(GenericItems.SAPPHIRE)).build();
    }

}