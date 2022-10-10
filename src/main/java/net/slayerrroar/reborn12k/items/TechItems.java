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

public class TechItems {

    public static final Item EMPTY_FUEL_CELL = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item FUEL_CELL = new FuelCell(new FabricItemSettings().maxDamage(63).group(Reborn12KItemGroup.REBORN12K));
    public static final Item CHARGED_FUEL_CELL = new FuelCell(new FabricItemSettings().maxDamage(139).group(Reborn12KItemGroup.REBORN12K));
    public static final Item SUPERCHARGED_FUEL_CELL = new FuelCell(new FabricItemSettings().maxDamage(319).group(Reborn12KItemGroup.REBORN12K));

    public static final Item BASIC_LASER_FOCUS = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ADVANCED_LASER_FOCUS = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item ULTIMATE_LASER_FOCUS = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));

    public static final Item COAL_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item COPPER_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item IRON_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item GOLD_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item LAPIS_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item REDSTONE_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item DIAMOND_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item EMERALD_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item AMETHYST_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));

    public static final Item QUARTZ_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item NETHERITE_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));

    public static final Item TIN_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item SILVER_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item LEAD_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item NICKEL_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item TITANIUM_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item CHROME_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));

    public static final Item SAPPHIRE_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item RUBY_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item OPAL_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));

    public static final Item MANATITE_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));

    public static final Item ALUMINUM_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item TUNGSTEN_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item URANIUM_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));

    public static final Item COBALT_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item PLATINUM_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));
    public static final Item IRIDIUM_LASER_FOCUS = new FocusItem(new FabricItemSettings().maxCount(1).group(Reborn12KItemGroup.REBORN12K));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "empty_fuel_cell"), EMPTY_FUEL_CELL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "fuel_cell"), FUEL_CELL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "charged_fuel_cell"), CHARGED_FUEL_CELL);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "supercharged_fuel_cell"), SUPERCHARGED_FUEL_CELL);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "basic_laser_focus"), BASIC_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "advanced_laser_focus"), ADVANCED_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ultimate_laser_focus"), ULTIMATE_LASER_FOCUS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "coal_laser_focus"), COAL_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "copper_laser_focus"), COPPER_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "iron_laser_focus"), IRON_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "gold_laser_focus"), GOLD_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "lapis_laser_focus"), LAPIS_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "redstone_laser_focus"), REDSTONE_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "diamond_laser_focus"), DIAMOND_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "emerald_laser_focus"), EMERALD_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "amethyst_laser_focus"), AMETHYST_LASER_FOCUS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "quartz_laser_focus"), QUARTZ_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "netherite_laser_focus"), NETHERITE_LASER_FOCUS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "tin_laser_focus"), TIN_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "silver_laser_focus"), SILVER_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "lead_laser_focus"), LEAD_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "nickel_laser_focus"), NICKEL_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "titanium_laser_focus"), TITANIUM_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "chrome_laser_focus"), CHROME_LASER_FOCUS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "sapphire_laser_focus"), SAPPHIRE_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ruby_laser_focus"), RUBY_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "opal_laser_focus"), OPAL_LASER_FOCUS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "manatite_laser_focus"), MANATITE_LASER_FOCUS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "aluminum_laser_focus"), ALUMINUM_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "tungsten_laser_focus"), TUNGSTEN_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "uranium_laser_focus"), URANIUM_LASER_FOCUS);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cobalt_laser_focus"), COBALT_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "platinum_laser_focus"), PLATINUM_LASER_FOCUS);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "iridium_laser_focus"), IRIDIUM_LASER_FOCUS);

    }

}