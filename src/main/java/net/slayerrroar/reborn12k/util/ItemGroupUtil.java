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
import net.slayerrroar.reborn12k.blocks.RebornBlocks;
import net.slayerrroar.reborn12k.items.RebornItems;
import net.slayerrroar.reborn12k.items.TrinketItems;
import net.slayerrroar.reborn12k.tools.RebornTools;

public class ItemGroupUtil {

    public static final RegistryKey<ItemGroup> REBORN_MATERIALS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Reborn12K.MOD_ID, "a-materials"));
    public static final RegistryKey<ItemGroup> REBORN_STUFF = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Reborn12K.MOD_ID, "b-stuff"));
    public static final RegistryKey<ItemGroup> REBORN_BLOCKS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Reborn12K.MOD_ID, "c-blocks"));
    public static final RegistryKey<ItemGroup> REBORN_DECORATIONS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Reborn12K.MOD_ID, "d-decorations"));
    public static final RegistryKey<ItemGroup> REBORN_TRINKETS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Reborn12K.MOD_ID, "e-trinkets"));
    public static final RegistryKey<ItemGroup> REBORN_TOOLS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Reborn12K.MOD_ID, "f-tools"));
    public static final RegistryKey<ItemGroup> REBORN_COMBAT = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Reborn12K.MOD_ID, "g-combat"));

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, REBORN_MATERIALS, FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.a.materials"))
                .icon(() -> new ItemStack(RebornItems.ARCHEOSITE_INGOT)).build()
        );
        Registry.register(Registries.ITEM_GROUP, REBORN_STUFF, FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.b.stuff"))
                .icon(() -> new ItemStack(RebornItems.SAPPHIRE)).build()
        );
        Registry.register(Registries.ITEM_GROUP, REBORN_BLOCKS, FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.c.blocks"))
                .icon(() -> new ItemStack(RebornBlocks.MANATITE_BLOCK)).build()
        );
        Registry.register(Registries.ITEM_GROUP, REBORN_DECORATIONS, FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.d.decorations"))
                .icon(() -> new ItemStack(RebornBlocks.FANCY_LAMP)).build()
        );
        Registry.register(Registries.ITEM_GROUP, REBORN_TOOLS, FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.f.tools"))
                .icon(() -> new ItemStack(RebornTools.ENDERIUM_PAXEL)).build()
        );
        Registry.register(Registries.ITEM_GROUP, REBORN_COMBAT, FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.g.combat"))
                .icon(() -> new ItemStack(RebornTools.IRIDIUM_ALLOY_KATANA)).build()
        );
    }

}