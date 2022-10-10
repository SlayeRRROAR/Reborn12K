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
import net.slayerrroar.reborn12k.items.item_class.materia.BlessedMateria;
import net.slayerrroar.reborn12k.items.item_class.materia.CursedMateria;
import net.slayerrroar.reborn12k.items.item_class.materia.EndMateria;
import net.slayerrroar.reborn12k.items.item_class.materia.NetherMateria;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class MagicItems {

    public static final Item MANAWEAVE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item REFINED_MANATITE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));

    public static final Item BLANK_RUNE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item RUNE_OF_AIR = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item RUNE_OF_EARTH = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item RUNE_OF_WATER = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item RUNE_OF_FIRE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item RUNE_OF_LIGHT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item RUNE_OF_DARKNESS= new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item RUNE_OF_IRON = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    //public static final Item RUNE_OF_ICE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    //public static final Item RUNE_OF_THUNDER = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    //public static final Item RUNE_OF_DROUGHT = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item RUNE_OF_NATURE = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item RUNE_OF_ORDER = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item RUNE_OF_CHAOS = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item RUNE_OF_STRENGTH = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item WINDSTORM_MANATITE = new Item(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));
    public static final Item VIRIDIAN_MANATITE = new Item(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));
    public static final Item ABYSS_MANATITE = new Item(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));
    public static final Item VOLCANIC_MANATITE = new Item(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));
    public static final Item SUNLIGHT_MANATITE = new Item(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));
    public static final Item NOVILUNIUM_MANATITE = new Item(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));
    public static final Item CRIMSON_MANATITE = new Item(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));

    public static final Item RUNIC_SNARE = new RunicSnareItem(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item INCOMPLETE_BLESSED_CATALYST = new IncompleteBlessedCatalyst(new FabricItemSettings().maxCount(1).maxDamage(63).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.UNCOMMON));
    public static final Item INCOMPLETE_CURSED_CATALYST = new IncompleteCursedCatalyst(new FabricItemSettings().maxCount(1).maxDamage(63).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.UNCOMMON));
    public static final Item INCOMPLETE_NETHER_CATALYST = new IncompleteNetherCatalyst(new FabricItemSettings().maxCount(1).maxDamage(63).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.UNCOMMON));
    public static final Item INCOMPLETE_ENDER_CATALYST = new IncompleteEnderCatalyst(new FabricItemSettings().maxCount(1).maxDamage(63).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.UNCOMMON));
    public static final Item INCOMPLETE_WITHERED_CATALYST = new IncompleteWitheredCatalyst(new FabricItemSettings().maxCount(1).maxDamage(9).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item INCOMPLETE_DRACONIC_CATALYST = new Item(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));

    public static final Item BLESSED_CATALYST = new Catalyst(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item CURSED_CATALYST = new Catalyst(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item NETHER_CATALYST = new Catalyst(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item ENDER_CATALYST = new Catalyst(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item WITHERED_CATALYST = new Catalyst(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));
    public static final Item DRACONIC_CATALYST = new Catalyst(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.EPIC));

    public static final Item BLESSED_MATERIA = new BlessedMateria(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item CURSED_MATERIA = new CursedMateria(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item NETHER_MATERIA = new NetherMateria(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item END_MATERIA = new EndMateria(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item WITHERED_MATERIA = new EndMateria(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item DRACONIC_MATERIA = new EndMateria(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "manaweave"), MANAWEAVE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "refined_manatite"), REFINED_MANATITE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blank_rune"), BLANK_RUNE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_air"), RUNE_OF_AIR);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_earth"), RUNE_OF_EARTH);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_water"), RUNE_OF_WATER);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_fire"), RUNE_OF_FIRE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_light"), RUNE_OF_LIGHT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_darkness"), RUNE_OF_DARKNESS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_iron"), RUNE_OF_IRON);
        //Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_ice"), RUNE_OF_ICE);
        //Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_thunder"), RUNE_OF_THUNDER);
        //Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_drought"), RUNE_OF_DROUGHT);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_nature"), RUNE_OF_NATURE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_order"), RUNE_OF_ORDER);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_chaos"), RUNE_OF_CHAOS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "rune_of_strength"), RUNE_OF_STRENGTH);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "windstorm_manatite"), WINDSTORM_MANATITE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "viridian_manatite"), VIRIDIAN_MANATITE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "abyss_manatite"), ABYSS_MANATITE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "volcanic_manatite"), VOLCANIC_MANATITE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "sunlight_manatite"), SUNLIGHT_MANATITE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "novilunium_manatite"), NOVILUNIUM_MANATITE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "crimson_manatite"), CRIMSON_MANATITE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "runic_snare"), RUNIC_SNARE);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "incomplete_blessed_catalyst"), INCOMPLETE_BLESSED_CATALYST);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "incomplete_cursed_catalyst"), INCOMPLETE_CURSED_CATALYST);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "incomplete_nether_catalyst"), INCOMPLETE_NETHER_CATALYST);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "incomplete_ender_catalyst"), INCOMPLETE_ENDER_CATALYST);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "incomplete_withered_catalyst"), INCOMPLETE_WITHERED_CATALYST);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "incomplete_draconic_catalyst"), INCOMPLETE_DRACONIC_CATALYST);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blessed_catalyst"), BLESSED_CATALYST);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cursed_catalyst"), CURSED_CATALYST);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "nether_catalyst"), NETHER_CATALYST);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ender_catalyst"), ENDER_CATALYST);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "withered_catalyst"), WITHERED_CATALYST);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "draconic_catalyst"), DRACONIC_CATALYST);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blessed_materia"), BLESSED_MATERIA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cursed_materia"), CURSED_MATERIA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "nether_materia"), NETHER_MATERIA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "end_materia"), END_MATERIA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "withered_materia"), WITHERED_MATERIA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "draconic_materia"), DRACONIC_MATERIA);

    }

}