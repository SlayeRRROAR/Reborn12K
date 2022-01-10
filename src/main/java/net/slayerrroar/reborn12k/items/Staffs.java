package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
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
import net.slayerrroar.reborn12k.items.item_class.weapons.viridian.ViridianRod;
import net.slayerrroar.reborn12k.items.item_class.weapons.viridian.ViridianScepter;
import net.slayerrroar.reborn12k.items.item_class.weapons.viridian.ViridianStaff;
import net.slayerrroar.reborn12k.items.item_class.weapons.viridian.ViridianWand;
import net.slayerrroar.reborn12k.items.item_class.weapons.volcanic.VolcanicRod;
import net.slayerrroar.reborn12k.items.item_class.weapons.volcanic.VolcanicScepter;
import net.slayerrroar.reborn12k.items.item_class.weapons.volcanic.VolcanicStaff;
import net.slayerrroar.reborn12k.items.item_class.weapons.volcanic.VolcanicWand;
import net.slayerrroar.reborn12k.items.item_class.weapons.windstorm.WindstormRod;
import net.slayerrroar.reborn12k.items.item_class.weapons.windstorm.WindstormScepter;
import net.slayerrroar.reborn12k.items.item_class.weapons.windstorm.WindstormStaff;
import net.slayerrroar.reborn12k.items.item_class.weapons.windstorm.WindstormWand;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class Staffs {

    public static final Item WOODEN_WAND = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item SILVER_SCEPTER = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item GOLDEN_ROD = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));
    public static final Item MAGICAL_WOOD_STAFF = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K));


    public static final Item WINDSTORM_WAND = new WindstormWand(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof());
    public static final Item WINDSTORM_SCEPTER = new WindstormScepter(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item WINDSTORM_ROD = new WindstormRod(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.RARE));
    public static final Item WINDSTORM_STAFF = new WindstormStaff(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.EPIC));

    public static final Item VIRIDIAN_WAND = new ViridianWand(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof());
    public static final Item VIRIDIAN_SCEPTER = new ViridianScepter(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item VIRIDIAN_ROD = new ViridianRod(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.RARE));
    public static final Item VIRIDIAN_STAFF = new ViridianStaff(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.EPIC));

    public static final Item ABYSS_WAND = new AbyssWand(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof());
    public static final Item ABYSS_SCEPTER = new AbyssScepter(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item ABYSS_ROD = new AbyssRod(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.RARE));
    public static final Item ABYSS_STAFF = new AbyssStaff(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.EPIC));

    public static final Item VOLCANIC_WAND = new VolcanicWand(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof());
    public static final Item VOLCANIC_SCEPTER = new VolcanicScepter(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item VOLCANIC_ROD = new VolcanicRod(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.RARE));
    public static final Item VOLCANIC_STAFF = new VolcanicStaff(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.EPIC));

    public static final Item SUNLIGHT_WAND = new SunlightWand(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof());
    public static final Item SUNLIGHT_SCEPTER = new SunlightScepter(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item SUNLIGHT_ROD = new SunlightRod(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.RARE));
    public static final Item SUNLIGHT_STAFF = new SunlightStaff(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.EPIC));

    public static final Item NOVILUNIUM_WAND = new NoviluniumWand(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof());
    public static final Item NOVILUNIUM_SCEPTER = new NoviluniumScepter(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item NOVILUNIUM_ROD = new NoviluniumRod(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.RARE));
    public static final Item NOVILUNIUM_STAFF = new NoviluniumStaff(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.EPIC));

    public static final Item CRIMSON_WAND = new CrimsonWand(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof());
    public static final Item CRIMSON_SCEPTER = new CrimsonScepter(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item CRIMSON_ROD = new CrimsonRod(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.RARE));
    public static final Item CRIMSON_STAFF = new CrimsonStaff(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.EPIC));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "wooden_wand"), WOODEN_WAND);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "silver_scepter"), SILVER_SCEPTER);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "golden_rod"), GOLDEN_ROD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "magical_wood_staff"), MAGICAL_WOOD_STAFF);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "windstorm_wand"), WINDSTORM_WAND);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "windstorm_scepter"), WINDSTORM_SCEPTER);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "windstorm_rod"), WINDSTORM_ROD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "windstorm_staff"), WINDSTORM_STAFF);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "viridian_wand"), VIRIDIAN_WAND);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "viridian_scepter"), VIRIDIAN_SCEPTER);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "viridian_rod"), VIRIDIAN_ROD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "viridian_staff"), VIRIDIAN_STAFF);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "abyss_wand"), ABYSS_WAND);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "abyss_scepter"), ABYSS_SCEPTER);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "abyss_rod"), ABYSS_ROD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "abyss_staff"), ABYSS_STAFF);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "volcanic_wand"), VOLCANIC_WAND);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "volcanic_scepter"), VOLCANIC_SCEPTER);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "volcanic_rod"), VOLCANIC_ROD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "volcanic_staff"), VOLCANIC_STAFF);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "sunlight_wand"), SUNLIGHT_WAND);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "sunlight_scepter"), SUNLIGHT_SCEPTER);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "sunlight_rod"), SUNLIGHT_ROD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "sunlight_staff"), SUNLIGHT_STAFF);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "novilunium_wand"), NOVILUNIUM_WAND);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "novilunium_scepter"), NOVILUNIUM_SCEPTER);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "novilunium_rod"), NOVILUNIUM_ROD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "novilunium_staff"), NOVILUNIUM_STAFF);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "crimson_wand"), CRIMSON_WAND);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "crimson_scepter"), CRIMSON_SCEPTER);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "crimson_rod"), CRIMSON_ROD);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "crimson_staff"), CRIMSON_STAFF);
    }

}
