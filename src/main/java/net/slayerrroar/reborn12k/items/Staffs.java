package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.items.item_class.weapons.abyss.AbyssRod;
import net.slayerrroar.reborn12k.items.item_class.weapons.abyss.AbyssScepter;
import net.slayerrroar.reborn12k.items.item_class.weapons.abyss.AbyssStaff;
import net.slayerrroar.reborn12k.items.item_class.weapons.abyss.AbyssWand;
import net.slayerrroar.reborn12k.items.item_class.weapons.crimson.CrimsonRod;
import net.slayerrroar.reborn12k.items.item_class.weapons.crimson.CrimsonScepter;
import net.slayerrroar.reborn12k.items.item_class.weapons.crimson.CrimsonStaff;
import net.slayerrroar.reborn12k.items.item_class.weapons.crimson.CrimsonWand;
import net.slayerrroar.reborn12k.items.item_class.weapons.novilunium.NoviluniumRod;
import net.slayerrroar.reborn12k.items.item_class.weapons.novilunium.NoviluniumScepter;
import net.slayerrroar.reborn12k.items.item_class.weapons.novilunium.NoviluniumStaff;
import net.slayerrroar.reborn12k.items.item_class.weapons.novilunium.NoviluniumWand;
import net.slayerrroar.reborn12k.items.item_class.weapons.sunlight.SunlightRod;
import net.slayerrroar.reborn12k.items.item_class.weapons.sunlight.SunlightScepter;
import net.slayerrroar.reborn12k.items.item_class.weapons.sunlight.SunlightStaff;
import net.slayerrroar.reborn12k.items.item_class.weapons.sunlight.SunlightWand;

public class Staffs {

    public static final Item WOODEN_WAND = new Item(new FabricItemSettings().group(ItemGroup.BREWING));
    public static final Item SILVER_SCEPTER = new Item(new FabricItemSettings().group(ItemGroup.BREWING));
    public static final Item GOLDEN_ROD = new Item(new FabricItemSettings().group(ItemGroup.BREWING));
    public static final Item MAGICAL_WOOD_STAFF = new Item(new FabricItemSettings().group(ItemGroup.BREWING));


    public static final Item ABYSS_WAND = new AbyssWand(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1).fireproof());
    public static final Item ABYSS_SCEPTER = new AbyssScepter(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item ABYSS_ROD = new AbyssRod(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1).fireproof().rarity(Rarity.RARE));
    public static final Item ABYSS_STAFF = new AbyssStaff(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1).fireproof().rarity(Rarity.EPIC));

    public static final Item SUNLIGHT_WAND = new SunlightWand(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1).fireproof());
    public static final Item SUNLIGHT_SCEPTER = new SunlightScepter(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item SUNLIGHT_ROD = new SunlightRod(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1).fireproof().rarity(Rarity.RARE));
    public static final Item SUNLIGHT_STAFF = new SunlightStaff(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1).fireproof().rarity(Rarity.EPIC));

    public static final Item NOVILUNIUM_WAND = new NoviluniumWand(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1).fireproof());
    public static final Item NOVILUNIUM_SCEPTER = new NoviluniumScepter(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item NOVILUNIUM_ROD = new NoviluniumRod(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1).fireproof().rarity(Rarity.RARE));
    public static final Item NOVILUNIUM_STAFF = new NoviluniumStaff(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1).fireproof().rarity(Rarity.EPIC));

    public static final Item CRIMSON_WAND = new CrimsonWand(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1).fireproof());
    public static final Item CRIMSON_SCEPTER = new CrimsonScepter(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item CRIMSON_ROD = new CrimsonRod(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1).fireproof().rarity(Rarity.RARE));
    public static final Item CRIMSON_STAFF = new CrimsonStaff(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(1).fireproof().rarity(Rarity.EPIC));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier("reborn12k", "wooden_wand"), WOODEN_WAND);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "silver_scepter"), SILVER_SCEPTER);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "golden_rod"), GOLDEN_ROD);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "magical_wood_staff"), MAGICAL_WOOD_STAFF);

        Registry.register(Registry.ITEM, new Identifier("reborn12k", "abyss_wand"), ABYSS_WAND);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "abyss_scepter"), ABYSS_SCEPTER);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "abyss_rod"), ABYSS_ROD);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "abyss_staff"), ABYSS_STAFF);

        Registry.register(Registry.ITEM, new Identifier("reborn12k", "sunlight_wand"), SUNLIGHT_WAND);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "sunlight_scepter"), SUNLIGHT_SCEPTER);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "sunlight_rod"), SUNLIGHT_ROD);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "sunlight_staff"), SUNLIGHT_STAFF);

        Registry.register(Registry.ITEM, new Identifier("reborn12k", "novilunium_wand"), NOVILUNIUM_WAND);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "novilunium_scepter"), NOVILUNIUM_SCEPTER);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "novilunium_rod"), NOVILUNIUM_ROD);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "novilunium_staff"), NOVILUNIUM_STAFF);

        Registry.register(Registry.ITEM, new Identifier("reborn12k", "crimson_wand"), CRIMSON_WAND);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "crimson_scepter"), CRIMSON_SCEPTER);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "crimson_rod"), CRIMSON_ROD);
        Registry.register(Registry.ITEM, new Identifier("reborn12k", "crimson_staff"), CRIMSON_STAFF);
    }

}

