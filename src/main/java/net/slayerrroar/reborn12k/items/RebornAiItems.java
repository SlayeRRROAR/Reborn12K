package net.slayerrroar.reborn12k.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.items.item_class.RechargeableBattery;
import net.slayerrroar.reborn12k.items.item_class.ai_stuff.*;
import net.slayerrroar.reborn12k.items.item_class.ai_stuff.chips.*;
import net.slayerrroar.reborn12k.items.item_class.usable.experience_data_card.ExpCard;
import net.slayerrroar.reborn12k.items.item_class.usable.experience_data_card.ExpCardV2;
import net.slayerrroar.reborn12k.items.item_class.usable.experience_data_card.ExpCardV237;
import net.slayerrroar.reborn12k.items.item_class.usable.experience_data_card.ExpCardV3;
import net.slayerrroar.reborn12k.util.Reborn12KItemGroup;

public class RebornAiItems {

    public static final Item EMPTY_BATTERY = registerItem("empty_battery", new Item(new FabricItemSettings()));
    public static final Item LV_BATTERY = registerItem("lv_battery", new RechargeableBattery(new FabricItemSettings().maxDamage(12)));
    public static final Item MV_BATTERY = registerItem("mv_battery", new RechargeableBattery(new FabricItemSettings().maxDamage(28)));
    public static final Item HV_BATTERY = registerItem("hv_battery", new RechargeableBattery(new FabricItemSettings().maxDamage(64)));


    public static final Item BASIC_AI_MODULE = registerItem("basic_ai_module", new BasicAiModule(new FabricItemSettings()));
    public static final Item ADVANCED_AI_MODULE = registerItem("advanced_ai_module", new AdvancedAiModule(new FabricItemSettings()));
    public static final Item ULTIMATE_AI_MODULE = registerItem("ultimate_ai_module", new UltimateAiModule(new FabricItemSettings()));
    public static final Item SPECIAL_AI_MODULE = registerItem("special_ai_module", new SpecialAiModule(new FabricItemSettings()));

    public static final Item BEE_AI_MODULE = registerItem("bee_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item CHICKEN_AI_MODULE = registerItem("chicken_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item COW_AI_MODULE = registerItem("cow_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item FISH_AI_MODULE = registerItem("fish_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item PIG_AI_MODULE = registerItem("pig_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item RABBIT_AI_MODULE = registerItem("rabbit_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item SHEEP_AI_MODULE = registerItem("sheep_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item SQUID_AI_MODULE = registerItem("squid_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item CREEPER_AI_MODULE = registerItem("creeper_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item ZOMBIE_AI_MODULE = registerItem("zombie_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item SLIME_AI_MODULE = registerItem("slime_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item SKELETON_AI_MODULE = registerItem("skeleton_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item WITCH_AI_MODULE = registerItem("witch_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item SPIDER_AI_MODULE = registerItem("spider_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item IRON_GOLEM_AI_MODULE = registerItem("iron_golem_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item ILLAGER_AI_MODULE = registerItem("illager_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item GUARDIAN_AI_MODULE = registerItem("guardian_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item ENDERMAN_AI_MODULE = registerItem("enderman_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item SHULKER_AI_MODULE = registerItem("shulker_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item GHAST_AI_MODULE = registerItem("ghast_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item BLAZE_AI_MODULE = registerItem("blaze_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item WITHER_SKELETON_AI_MODULE = registerItem("wither_skeleton_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item PHANTOM_AI_MODULE = registerItem("phantom_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item WITHER_AI_MODULE = registerItem("wither_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));
    public static final Item ENDER_DRAGON_AI_MODULE = registerItem("ender_dragon_ai_module", new CompleteAiModule(new FabricItemSettings().maxCount(1)));


    public static final Item INSTRUCTION_CHIP = registerItem("instruction_chip", new InstructionChip(new FabricItemSettings().maxCount(1)));

    public static final Item BUTCHERING_CHIP = registerItem("butchering_chip", new ButcheringChip(new FabricItemSettings().maxCount(1)));
    public static final Item SHEARING_CHIP = registerItem("shearing_chip", new ShearingChip(new FabricItemSettings().maxCount(1)));
    public static final Item SEVERING_CHIP = registerItem("severing_chip", new SeveringChip(new FabricItemSettings().maxCount(1)));
    public static final Item EXTRACTION_CHIP = registerItem("extraction_chip", new ExtractionChip(new FabricItemSettings().maxCount(1)));
    public static final Item DECAPITATION_CHIP = registerItem("decapitation_chip", new DecapitationChip(new FabricItemSettings().maxCount(1)));
    public static final Item RECOMBINATION_CHIP = registerItem("recombination_chip", new RecombinationChip(new FabricItemSettings().maxCount(1)));
    public static final Item EXP_DRAIN_CHIP = registerItem("exp_drain_chip", new ExpDrainChip(new FabricItemSettings().maxCount(1)));
    public static final Item S_REP_CHIP = registerItem("s_rep_chip", new SRepChip(new FabricItemSettings().maxCount(1)));


    public static final Item EXPERIENCE_DATA_CARD = registerItem("experience_data_card", new ExpCard(new FabricItemSettings()));
    public static final Item EXPERIENCE_DATA_CARD_V2 = registerItem("experience_data_card_v2", new ExpCardV2(new FabricItemSettings()));
    public static final Item EXPERIENCE_DATA_CARD_V3 = registerItem("experience_data_card_v3", new ExpCardV3(new FabricItemSettings()));
    public static final Item EXPERIENCE_DATA_CARD_V237 = registerItem("experience_data_card_v237", new ExpCardV237(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reborn12K.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(Reborn12KItemGroup.REBORN12K, EMPTY_BATTERY);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, LV_BATTERY);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, MV_BATTERY);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, HV_BATTERY);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, BASIC_AI_MODULE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ADVANCED_AI_MODULE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, ULTIMATE_AI_MODULE);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, SPECIAL_AI_MODULE);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, INSTRUCTION_CHIP);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, BUTCHERING_CHIP);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, SHEARING_CHIP);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, SEVERING_CHIP);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, EXTRACTION_CHIP);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, DECAPITATION_CHIP);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, RECOMBINATION_CHIP);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, EXP_DRAIN_CHIP);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, S_REP_CHIP);

        addToItemGroup(Reborn12KItemGroup.REBORN12K, EXPERIENCE_DATA_CARD);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, EXPERIENCE_DATA_CARD_V2);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, EXPERIENCE_DATA_CARD_V3);
        addToItemGroup(Reborn12KItemGroup.REBORN12K, EXPERIENCE_DATA_CARD_V237);

    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void register() {
        addItemsToItemGroup();
        Reborn12K.LOGGER.info(Reborn12K.MOD_ID + ": Correctly registered Ai Items");
    }
}