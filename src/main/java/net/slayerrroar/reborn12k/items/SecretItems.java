package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.item_class.FocusItem;
import net.slayerrroar.reborn12k.items.item_class.FuelCell;
import net.slayerrroar.reborn12k.items.item_class.RunicSnareItem;
import net.slayerrroar.reborn12k.items.item_class.catalyst.*;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class SecretItems {

    public static final Item YAMATO_BLADE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item KATANA_TSUBA = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item KATANA_TSUKA = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item QUEEN_BLADE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item RED_ENGINE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item CRYPTOBLADE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item CRYPTOBLADE_PIECE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item CASING_MK237 = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item CERAMITE_PLATE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "yamato_blade"), YAMATO_BLADE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "katana_tsuba"), KATANA_TSUBA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "katana_tsuka"), KATANA_TSUKA);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "queen_blade"), QUEEN_BLADE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "red_engine"), RED_ENGINE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cryptoblade_piece"), CRYPTOBLADE_PIECE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cryptoblade"), CRYPTOBLADE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "casing_mk237"), CASING_MK237);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ceramite_plate"), CERAMITE_PLATE);

    }

}