package net.slayerrroar.reborn12k.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.GenericItems;

public class ItemGroupUtil {

    public static final RegistryKey<ItemGroup> REBORN12K = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Reborn12K.MOD_ID, "reborn12k"));

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, REBORN12K, FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.reborn12k"))
                .icon(() -> new ItemStack(GenericItems.SAPPHIRE)).build()
        );
    }

}