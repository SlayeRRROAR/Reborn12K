package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.item_class.GlintedItem;
import net.slayerrroar.reborn12k.items.item_class.rings.RingAIR;
import net.slayerrroar.reborn12k.items.item_class.rings.RingEARTH;
import net.slayerrroar.reborn12k.items.item_class.rings.RingWATER;
import net.slayerrroar.reborn12k.items.item_class.rings.RingFIRE;
import net.slayerrroar.reborn12k.items.item_class.rings.RingLIGHT;
import net.slayerrroar.reborn12k.items.item_class.rings.RingDARK;
import net.slayerrroar.reborn12k.items.item_class.rings.RingSTRENGTH;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class Rings {

    public static final Item GOLDEN_RING = new Item(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).rarity(Rarity.UNCOMMON));
    public static final Item AWAKENED_GOLDEN_RING = new GlintedItem(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof().rarity(Rarity.RARE));

    public static final Item RING_OF_AIR = new RingAIR(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof());
    public static final Item RING_OF_EARTH = new RingEARTH(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof());
    public static final Item RING_OF_WATER = new RingWATER(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof());
    public static final Item RING_OF_FIRE = new RingFIRE(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof());
    public static final Item RING_OF_LIGHT = new RingLIGHT(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof());
    public static final Item RING_OF_DARK = new RingDARK(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof());
    public static final Item RING_OF_STRENGTH = new RingSTRENGTH(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).maxCount(1).fireproof());

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "golden_ring"), GOLDEN_RING);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "awakened_golden_ring"), AWAKENED_GOLDEN_RING);

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ring_of_air"), RING_OF_AIR);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ring_of_earth"), RING_OF_EARTH);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ring_of_water"), RING_OF_WATER);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ring_of_fire"), RING_OF_FIRE);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ring_of_light"), RING_OF_LIGHT);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ring_of_dark"), RING_OF_DARK);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "ring_of_strength"), RING_OF_STRENGTH);

        Reborn12K.LOGGER.info("Registering Rings for " + Reborn12K.MOD_ID);

    }

}