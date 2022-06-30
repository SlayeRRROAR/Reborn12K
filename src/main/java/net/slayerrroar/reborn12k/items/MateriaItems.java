package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.item_class.materia.BlessedMateria;
import net.slayerrroar.reborn12k.items.item_class.materia.CursedMateria;
import net.slayerrroar.reborn12k.items.item_class.materia.EndMateria;
import net.slayerrroar.reborn12k.items.item_class.materia.NetherMateria;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class MateriaItems {

    public static final Item BLESSED_MATERIA = new BlessedMateria(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item CURSED_MATERIA = new CursedMateria(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item CURSED_NETHER_MATERIA = new NetherMateria(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item CURSED_END_MATERIA = new EndMateria(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item WITHERED_MATERIA = new EndMateria(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));
    public static final Item DRACONIC_MATERIA = new EndMateria(new FabricItemSettings().group(Reborn12KItemGroup.REBORN12K).rarity(Rarity.RARE));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "blessed_materia"), BLESSED_MATERIA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cursed_materia"), CURSED_MATERIA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cursed_nether_materia"), CURSED_NETHER_MATERIA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "cursed_end_materia"), CURSED_END_MATERIA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "withered_materia"), WITHERED_MATERIA);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "draconic_materia"), DRACONIC_MATERIA);

        Reborn12K.LOGGER.info("Registering Materia Items for " + Reborn12K.MOD_ID);

    }

}
