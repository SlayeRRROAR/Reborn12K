package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.item_class.CustomDiscItem;
import net.slayerrroar.reborn12k.sounds.SoundClass;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class DiscItem {

    public static final Item Z115 = new CustomDiscItem(15, SoundClass.Z115, new FabricItemSettings()
            .group(Reborn12KItemGroup.REBORN12K).maxCount(1).rarity(Rarity.EPIC));
    public static final Item DEVIL_TRIGGER_DISC = new CustomDiscItem(15, SoundClass.DEVIL_TRIGGER, new FabricItemSettings()
            .group(Reborn12KItemGroup.REBORN12K).maxCount(1).rarity(Rarity.EPIC));

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "z115"), Z115);
        Registry.register(Registry.ITEM, new Identifier(Reborn12K.MOD_ID, "devil_trigger_disc"), DEVIL_TRIGGER_DISC);

    }

}
