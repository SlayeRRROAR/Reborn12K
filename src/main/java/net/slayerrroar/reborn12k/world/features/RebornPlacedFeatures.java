package net.slayerrroar.reborn12k.world.features;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.slayerrroar.reborn12k.Reborn12K;
import net.slayerrroar.reborn12k.blocks.GenericBlocks;

import java.util.List;

@SuppressWarnings("unused")

public class RebornPlacedFeatures {

    public static final RegistryKey<PlacedFeature> ASH_CHECKED_KEY = registerKey("ash_checked");
    public static final RegistryKey<PlacedFeature> ASH_PLACED_KEY = registerKey("ash_placed");

    public static final RegistryKey<PlacedFeature> SLIMY_CHECKED_KEY = registerKey("slimy_checked");
    public static final RegistryKey<PlacedFeature> SLIMY_PLACED_KEY = registerKey("slimy_placed");

    public static final RegistryKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final RegistryKey<PlacedFeature> ALUMINUM_ORE_PLACED_KEY = registerKey("aluminum_ore_placed");
    public static final RegistryKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
    public static final RegistryKey<PlacedFeature> LEAD_ORE_PLACED_KEY = registerKey("lead_ore_placed");
    public static final RegistryKey<PlacedFeature> NICKEL_ORE_PLACED_KEY = registerKey("nickel_ore_placed");
    public static final RegistryKey<PlacedFeature> CHROMITE_ORE_PLACED_KEY = registerKey("chromite_ore_placed");
    public static final RegistryKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY = registerKey("titanium_ore_placed");

    public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
    public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_LARGE_PLACED_KEY = registerKey("sapphire_ore_large_placed");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_LARGE_PLACED_KEY = registerKey("ruby_ore_large_placed");
    public static final RegistryKey<PlacedFeature> MANATITE_ORE_PLACED_KEY = registerKey("manatite_ore_placed");
    public static final RegistryKey<PlacedFeature> MANATITE_ORE_LARGE_PLACED_KEY = registerKey("manatite_ore_large_placed");

    public static final RegistryKey<PlacedFeature> NETHER_TUNGSTEN_ORE_PLACED_KEY = registerKey("nether_tungsten_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_VANADIUM_ORE_PLACED_KEY = registerKey("nether_vanadium_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_NEODYMIUM_ORE_PLACED_KEY = registerKey("nether_neodymium_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_URANIUM_ORE_PLACED_KEY = registerKey("nether_uranium_ore_placed");

    public static final RegistryKey<PlacedFeature> END_COBALT_ORE_PLACED_KEY = registerKey("end_cobalt_ore_placed");
    public static final RegistryKey<PlacedFeature> END_OSMIUM_ORE_PLACED_KEY = registerKey("end_osmium_ore_placed");
    public static final RegistryKey<PlacedFeature> END_PLATINUM_ORE_PLACED_KEY = registerKey("end_platinum_ore_placed");
    public static final RegistryKey<PlacedFeature> END_IRIDIUM_ORE_PLACED_KEY = registerKey("end_iridium_ore_placed");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, ASH_CHECKED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.ASH_KEY),
                List.of(PlacedFeatures.wouldSurvive(GenericBlocks.ASH_SAPLING)));
        register(context, ASH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.ASH_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 2),
                        GenericBlocks.ASH_SAPLING));

        register(context, SLIMY_CHECKED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.SLIMY_KEY),
                List.of(PlacedFeatures.wouldSurvive(GenericBlocks.SLIMY_SAPLING)));
        register(context, SLIMY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.SLIMY_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 1),
                        GenericBlocks.SLIMY_SAPLING));


        register(context, TIN_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.TIN_ORE_KEY),
                modifiersWithCount(12, // VeinsPerChunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(24), YOffset.aboveBottom(124))));

        register(context, ALUMINUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.ALUMINUM_ORE_KEY),
                modifiersWithCount(9, // VeinsPerChunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-16), YOffset.aboveBottom(64))));

        register(context, SILVER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.SILVER_ORE_KEY),
                modifiersWithCount(7, // VeinsPerChunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-48), YOffset.aboveBottom(16))));

        register(context, LEAD_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.LEAD_ORE_KEY),
                modifiersWithCount(6, // VeinsPerChunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-32), YOffset.aboveBottom(32))));

        register(context, NICKEL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.NICKEL_ORE_KEY),
                modifiersWithCount(5, // VeinsPerChunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.aboveBottom(0))));

        register(context, CHROMITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.CHROMITE_ORE_KEY),
                modifiersWithCount(9, // VeinsPerChunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.aboveBottom(48))));

        register(context, TITANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.TITANIUM_ORE_KEY),
                modifiersWithCount(6, // VeinsPerChunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-72), YOffset.aboveBottom(24))));


        register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.SAPPHIRE_ORE_KEY),
                modifiersWithCount(2, // VeinsPerChunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-16), YOffset.aboveBottom(16))));

        register(context, SAPPHIRE_ORE_LARGE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.SAPPHIRE_ORE_LARGE_KEY),
                modifiersWithCount(5, // VeinsPerChunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-144), YOffset.aboveBottom(16))));

        register(context, RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.RUBY_ORE_KEY),
                modifiersWithCount(2, // VeinsPerChunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-16), YOffset.aboveBottom(16))));

        register(context, RUBY_ORE_LARGE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.RUBY_ORE_LARGE_KEY),
                modifiersWithCount(5, // VeinsPerChunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-144), YOffset.aboveBottom(16))));

        register(context, MANATITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.MANATITE_ORE_KEY),
                modifiersWithCount(2, // VeinsPerChunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-16), YOffset.aboveBottom(16))));

        register(context, MANATITE_ORE_LARGE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.MANATITE_ORE_LARGE_KEY),
                modifiersWithCount(4, // VeinsPerChunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-144), YOffset.aboveBottom(16))));


        register(context, NETHER_TUNGSTEN_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.NETHER_TUNGSTEN_ORE_KEY),
                modifiersWithCount(11, // VeinsPerChunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-8), YOffset.aboveBottom(40))));

        register(context, NETHER_VANADIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.NETHER_VANADIUM_ORE_KEY),
                modifiersWithCount(13, // VeinsPerChunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(10), YOffset.aboveBottom(60))));

        register(context, NETHER_NEODYMIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.NETHER_NEODYMIUM_ORE_KEY),
                modifiersWithCount(3, // VeinsPerChunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(10), YOffset.aboveBottom(20))));

        register(context, NETHER_URANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.NETHER_URANIUM_ORE_KEY),
                modifiersWithCount(7, // VeinsPerChunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0), YOffset.aboveBottom(32))));


        register(context, END_COBALT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.END_COBALT_ORE_KEY),
                modifiersWithCount(10, // VeinsPerChunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(32), YOffset.aboveBottom(72))));

        register(context, END_OSMIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.END_OSMIUM_ORE_KEY),
                modifiersWithCount(6, // VeinsPerChunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(52), YOffset.aboveBottom(68))));

        register(context, END_PLATINUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.END_PLATINUM_ORE_KEY),
                modifiersWithCount(7, // VeinsPerChunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(48), YOffset.aboveBottom(64))));

        register(context, END_IRIDIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(RebornConfiguredFeatures.END_IRIDIUM_ORE_KEY),
                modifiersWithCount(5, // VeinsPerChunk
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(56), YOffset.aboveBottom(72))));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Reborn12K.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}