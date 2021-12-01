package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.item_class.charms.MirrorCharm;

public class Charms {

    public static final Item MAGIC_MIRROR = new MirrorCharm(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC).maxCount(1).fireproof().maxDamage(16));
    public static final Item ICE_MIRROR = new MirrorCharm(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC).maxCount(1).fireproof().maxDamage(16));
    public static final Item CELL_PHONE = new MirrorCharm(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC).maxCount(1).fireproof().maxDamage(16));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "magic_mirror"), MAGIC_MIRROR);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ice_mirror"), ICE_MIRROR);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cell_phone"), CELL_PHONE);

    }

}