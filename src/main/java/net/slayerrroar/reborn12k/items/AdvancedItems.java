package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.item_class.GlintedItem;
import net.slayerrroar.reborn12k.items.item_class.PhilosopherStone;
import net.slayerrroar.reborn12k.items.item_class.manatites.*;

public class AdvancedItems {

    public static final Item YAMATO_BLADE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item KATANA_TSUBA = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item KATANA_TSUKA = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item CRYPTOBLADE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item CRYPTOBLADE_PIECE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item CASING_MK237 = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item CERAMITE_PLATE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));


    public static final Item MANAWEAVE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item REFINED_MANATITE = new GlintedItem(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));

    public static final Item WINDSTORM_MANATITE = new WindstormManatite(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));
    public static final Item VIRIDIAN_MANATITE = new ViridianManatite(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));
    public static final Item ABYSS_MANATITE = new AbyssManatite(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));
    public static final Item VOLCANIC_MANATITE = new VolcanicManatite(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));
    public static final Item SUNLIGHT_MANATITE = new SunlightManatite(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));
    public static final Item NOVILUNIUM_MANATITE = new NoviluniumManatite(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));
    public static final Item CRIMSON_MANATITE = new CrimsonManatite(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));

    public static final Item BLANK_RUNE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item RUNE_OF_AIR = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(16));
    public static final Item RUNE_OF_EARTH = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(16));
    public static final Item RUNE_OF_WATER = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(16));
    public static final Item RUNE_OF_FIRE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(16));
    public static final Item RUNE_OF_LIGHT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(16));
    public static final Item RUNE_OF_DARK = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(16));
    public static final Item RUNE_OF_STRENGTH = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(16));

    public static final Item WEAK_PHILOSOPHER_STONE = new PhilosopherStone(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.UNCOMMON).maxCount(1).fireproof());
    public static final Item ADVANCED_PHILOSOPHER_STONE = new PhilosopherStone(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE).maxCount(1).fireproof());
    public static final Item MASTER_PHILOSOPHER_STONE = new PhilosopherStone(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC).maxCount(1).fireproof());


    public static void register() {

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "yamato_blade"), YAMATO_BLADE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "katana_tsuba"), KATANA_TSUBA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "katana_tsuka"), KATANA_TSUKA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cryptoblade_piece"), CRYPTOBLADE_PIECE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cryptoblade"), CRYPTOBLADE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "casing_mk237"), CASING_MK237);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ceramite_plate"), CERAMITE_PLATE);


        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "manaweave"), MANAWEAVE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "refined_manatite"), REFINED_MANATITE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "windstorm_manatite"), WINDSTORM_MANATITE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "viridian_manatite"), VIRIDIAN_MANATITE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "abyss_manatite"), ABYSS_MANATITE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "volcanic_manatite"), VOLCANIC_MANATITE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "sunlight_manatite"), SUNLIGHT_MANATITE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "novilunium_manatite"), NOVILUNIUM_MANATITE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "crimson_manatite"), CRIMSON_MANATITE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blank_rune"), BLANK_RUNE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_air"), RUNE_OF_AIR);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_earth"), RUNE_OF_EARTH);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_water"), RUNE_OF_WATER);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_fire"), RUNE_OF_FIRE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_light"), RUNE_OF_LIGHT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_dark"), RUNE_OF_DARK);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_strength"), RUNE_OF_STRENGTH);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "weak_philosopher_stone"), WEAK_PHILOSOPHER_STONE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "advanced_philosopher_stone"), ADVANCED_PHILOSOPHER_STONE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "master_philosopher_stone"), MASTER_PHILOSOPHER_STONE);

    }
    
}
