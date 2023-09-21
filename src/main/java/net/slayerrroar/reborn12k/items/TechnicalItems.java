package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.custom.tech.*;
import net.slayerrroar.reborn12k.util.ItemGroupUtil;

public class TechnicalItems {

    public static final Item DESTABILIZED_REDSTONE_BUCKET = registerItem("destabilized_redstone_bucket", new DangerousBucketItem(new FabricItemSettings().recipeRemainder(Items.BUCKET)));
    public static final Item ENERGIZED_GLOWSTONE_BUCKET = registerItem("energized_glowstone_bucket", new DangerousBucketItem(new FabricItemSettings().recipeRemainder(Items.BUCKET)));
    public static final Item RESONANT_ENDER_BUCKET = registerItem("resonant_ender_bucket", new DangerousBucketItem(new FabricItemSettings().recipeRemainder(Items.BUCKET)));
    public static final Item LIQUID_MANA_BUCKET = registerItem("liquid_mana_bucket", new DangerousBucketItem(new FabricItemSettings().recipeRemainder(Items.BUCKET)));

    public static final Item MAGNET = registerItem("magnet", new Magnet(new FabricItemSettings().maxCount(1)));

    public static final Item EMPTY_MACHINE_CASING = registerItem("empty_machine_casing", new Item(new FabricItemSettings()));

    public static final Item COOLING_ASSEMBLY = registerItem("cooling_assembly", new Item(new FabricItemSettings()));
    public static final Item POWER_SUPPLY_MODULE = registerItem("power_supply_module", new Item(new FabricItemSettings()));
    public static final Item HFR_COIL = registerItem("hfr_coil", new Item(new FabricItemSettings()));
    public static final Item LIGHT_COLLIMATOR_ARRAY = registerItem("light_collimator_array", new Item(new FabricItemSettings()));
    public static final Item UHF_LASER_EMITTER = registerItem("uhf_laser_emitter", new Item(new FabricItemSettings()));
    public static final Item COLLIMATED_LASER_ARRAY = registerItem("collimated_laser_array", new Item(new FabricItemSettings()));

    public static final Item EMPTY_FUEL_CELL = registerItem("empty_fuel_cell", new Item(new FabricItemSettings()));
    public static final Item FUEL_CELL = registerItem("fuel_cell", new FuelCell(new FabricItemSettings().maxDamage(8)));
    public static final Item CHARGED_FUEL_CELL = registerItem("charged_fuel_cell", new FuelCell(new FabricItemSettings().maxDamage(32)));
    public static final Item SUPERCHARGED_FUEL_CELL = registerItem("supercharged_fuel_cell", new FuelCell(new FabricItemSettings().maxDamage(128)));

    public static final Item BASIC_LASER_FOCUS = registerItem("basic_laser_focus", new UnsetFocusItem(new FabricItemSettings()));
    public static final Item ADVANCED_LASER_FOCUS = registerItem("advanced_laser_focus", new UnsetFocusItem(new FabricItemSettings()));
    public static final Item ULTIMATE_LASER_FOCUS = registerItem("ultimate_laser_focus", new UnsetFocusItem(new FabricItemSettings()));

    public static final Item COAL_LASER_FOCUS = registerItem("coal_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item COPPER_LASER_FOCUS = registerItem("copper_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item IRON_LASER_FOCUS = registerItem("iron_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item GOLD_LASER_FOCUS = registerItem("gold_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item LAPIS_LASER_FOCUS = registerItem("lapis_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item REDSTONE_LASER_FOCUS = registerItem("redstone_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item DIAMOND_LASER_FOCUS = registerItem("diamond_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item EMERALD_LASER_FOCUS = registerItem("emerald_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item AMETHYST_LASER_FOCUS = registerItem("amethyst_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item QUARTZ_LASER_FOCUS = registerItem("quartz_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item NETHERITE_LASER_FOCUS = registerItem("netherite_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item TIN_LASER_FOCUS = registerItem("tin_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item ALUMINUM_LASER_FOCUS = registerItem("aluminum_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item SILVER_LASER_FOCUS = registerItem("silver_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item LEAD_LASER_FOCUS = registerItem("lead_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item NICKEL_LASER_FOCUS = registerItem("nickel_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item CHROME_LASER_FOCUS = registerItem("chrome_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item TITANIUM_LASER_FOCUS = registerItem("titanium_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item SAPPHIRE_LASER_FOCUS = registerItem("sapphire_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item RUBY_LASER_FOCUS = registerItem("ruby_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item MANATITE_LASER_FOCUS = registerItem("manatite_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item TUNGSTEN_LASER_FOCUS = registerItem("tungsten_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item VANADIUM_LASER_FOCUS = registerItem("vanadium_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item NEODYMIUM_LASER_FOCUS = registerItem("neodymium_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item URANIUM_LASER_FOCUS = registerItem("uranium_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item COBALT_LASER_FOCUS = registerItem("cobalt_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item OSMIUM_LASER_FOCUS = registerItem("osmium_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item PLATINUM_LASER_FOCUS = registerItem("platinum_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item IRIDIUM_LASER_FOCUS = registerItem("iridium_laser_focus", new SetFocusItem(new FabricItemSettings().rarity(Rarity.RARE)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(ItemGroupUtil.REBORN12K, DESTABILIZED_REDSTONE_BUCKET);
        addToItemGroup(ItemGroupUtil.REBORN12K, ENERGIZED_GLOWSTONE_BUCKET);
        addToItemGroup(ItemGroupUtil.REBORN12K, RESONANT_ENDER_BUCKET);
        addToItemGroup(ItemGroupUtil.REBORN12K, LIQUID_MANA_BUCKET);

        addToItemGroup(ItemGroupUtil.REBORN12K, MAGNET);

        addToItemGroup(ItemGroupUtil.REBORN12K, EMPTY_MACHINE_CASING);

        addToItemGroup(ItemGroupUtil.REBORN12K, COOLING_ASSEMBLY);
        addToItemGroup(ItemGroupUtil.REBORN12K, POWER_SUPPLY_MODULE);
        addToItemGroup(ItemGroupUtil.REBORN12K, HFR_COIL);
        addToItemGroup(ItemGroupUtil.REBORN12K, LIGHT_COLLIMATOR_ARRAY);
        addToItemGroup(ItemGroupUtil.REBORN12K, UHF_LASER_EMITTER);
        addToItemGroup(ItemGroupUtil.REBORN12K, COLLIMATED_LASER_ARRAY);

        addToItemGroup(ItemGroupUtil.REBORN12K, EMPTY_FUEL_CELL);
        addToItemGroup(ItemGroupUtil.REBORN12K, FUEL_CELL);
        addToItemGroup(ItemGroupUtil.REBORN12K, CHARGED_FUEL_CELL);
        addToItemGroup(ItemGroupUtil.REBORN12K, SUPERCHARGED_FUEL_CELL);

        addToItemGroup(ItemGroupUtil.REBORN12K, BASIC_LASER_FOCUS);
        addToItemGroup(ItemGroupUtil.REBORN12K, ADVANCED_LASER_FOCUS);
        addToItemGroup(ItemGroupUtil.REBORN12K, ULTIMATE_LASER_FOCUS);

    }

    private static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Tech Items");
    }
}