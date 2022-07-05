package net.slayerrroar.reborn12k.world.features;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class RebornPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> CHERRY_PLACED =                                                    //CHERRY TREE
            PlacedFeatures.register("cherry_placed",
            RebornConfiguredFeatures.CHERRY_SPAWN,
                    VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));

    public static final RegistryEntry<PlacedFeature> SLIMY_PLACED =                                                     //SLIMY TREE
            PlacedFeatures.register("slimy_placed",
            RebornConfiguredFeatures.SLIMY_SPAWN,
                    VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 1)));


    public static final RegistryEntry<PlacedFeature> TOPAZ_ORE_SMALL_PLACED =                                           //TOPAZ ORES
            PlacedFeatures.register("topaz_ore_small_placed",
            RebornConfiguredFeatures.TOPAZ_ORE_SMALL,
                    RebornOreFeatures.modifiersWithCount(2,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-16), YOffset.aboveBottom(16))));

    public static final RegistryEntry<PlacedFeature> TOPAZ_ORE_LARGE_PLACED =
            PlacedFeatures.register("topaz_ore_large_placed",
                    RebornConfiguredFeatures.TOPAZ_ORE_LARGE,
                    RebornOreFeatures.modifiersWithCount(6,
                            HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-144), YOffset.aboveBottom(16))));


    public static final RegistryEntry<PlacedFeature> OPAL_ORE_SMALL_PLACED =                                            //OPAL ORES
            PlacedFeatures.register("opal_ore_small_placed",
            RebornConfiguredFeatures.OPAL_ORE_SMALL,
                    RebornOreFeatures.modifiersWithCount(2,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-16), YOffset.aboveBottom(16))));

    public static final RegistryEntry<PlacedFeature> OPAL_ORE_LARGE_PLACED =
            PlacedFeatures.register("opal_ore_large_placed",
                    RebornConfiguredFeatures.OPAL_ORE_LARGE,
                    RebornOreFeatures.modifiersWithCount(6,
                            HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-144), YOffset.aboveBottom(16))));


    public static final RegistryEntry<PlacedFeature> RUBY_ORE_SMALL_PLACED =                                            //RUBY ORES
            PlacedFeatures.register("ruby_ore_small_placed",
            RebornConfiguredFeatures.RUBY_ORE_SMALL,
                    RebornOreFeatures.modifiersWithCount(2,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-16), YOffset.aboveBottom(16))));

    public static final RegistryEntry<PlacedFeature> RUBY_ORE_LARGE_PLACED =
            PlacedFeatures.register("ruby_ore_large_placed",
                    RebornConfiguredFeatures.RUBY_ORE_LARGE,
                    RebornOreFeatures.modifiersWithCount(6,
                            HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-144), YOffset.aboveBottom(16))));


    public static final RegistryEntry<PlacedFeature> SAPPHIRE_ORE_SMALL_PLACED =                                        //SAPPHIRE ORES
            PlacedFeatures.register("sapphire_ore_small_placed",
                    RebornConfiguredFeatures.SAPPHIRE_ORE_SMALL,
                    RebornOreFeatures.modifiersWithCount(2,
                            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-16), YOffset.aboveBottom(16))));

    public static final RegistryEntry<PlacedFeature> SAPPHIRE_ORE_LARGE_PLACED =
            PlacedFeatures.register("sapphire_ore_large_placed",
                    RebornConfiguredFeatures.SAPPHIRE_ORE_LARGE,
                    RebornOreFeatures.modifiersWithCount(4,
                            HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-144), YOffset.aboveBottom(16))));


    public static final RegistryEntry<PlacedFeature> MANATITE_ORE_SMALL_PLACED =                                        //MANATITE ORES
            PlacedFeatures.register("manatite_ore_small_placed",
                    RebornConfiguredFeatures.MANATITE_ORE_SMALL,
                    RebornOreFeatures.modifiersWithCount(2,
                            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-16), YOffset.aboveBottom(16))));

    public static final RegistryEntry<PlacedFeature> MANATITE_ORE_LARGE_PLACED =
            PlacedFeatures.register("manatite_ore_large_placed",
                    RebornConfiguredFeatures.MANATITE_ORE_LARGE,
                    RebornOreFeatures.modifiersWithCount(4,
                            HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-144), YOffset.aboveBottom(16))));


    public static final RegistryEntry<PlacedFeature> E115_ORE_PLACED =                                                  //E115 ORES
            PlacedFeatures.register("e115_ore_placed",
                    RebornConfiguredFeatures.E115_ORE,
                    RebornOreFeatures.modifiersWithCount(8,
                            HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-144), YOffset.aboveBottom(16))));


    public static final RegistryEntry<PlacedFeature> TIN_ORE_PLACED =                                                   //TIN ORES
            PlacedFeatures.register("tin_ore_placed",
                    RebornConfiguredFeatures.TIN_ORE,
                    RebornOreFeatures.modifiersWithCount(12,
                            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(32), YOffset.aboveBottom(132))));


    public static final RegistryEntry<PlacedFeature> CHROMITE_ORE_PLACED =                                              //CHROMITE ORES
            PlacedFeatures.register("chromite_ore_placed",
                    RebornConfiguredFeatures.CHROMITE_ORE,
                    RebornOreFeatures.modifiersWithCount(12,
                            HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-48), YOffset.aboveBottom(24))));


    public static final RegistryEntry<PlacedFeature> SILVER_ORE_PLACED =                                                //SILVER ORES
            PlacedFeatures.register("silver_ore_placed",
                    RebornConfiguredFeatures.SILVER_ORE,
                    RebornOreFeatures.modifiersWithCount(10,
                            HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-48), YOffset.aboveBottom(24))));


    public static final RegistryEntry<PlacedFeature> NETHER_CHROMITE_ORE_PLACED =                                        //NETHER URANIUM ORES
            PlacedFeatures.register("nether_chromite_ore_placed",
                    RebornConfiguredFeatures.NETHER_CHROMITE_ORE,
                    RebornOreFeatures.modifiersWithCount(7,
                            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(10), YOffset.aboveBottom(120))));


    public static final RegistryEntry<PlacedFeature> END_COBALT_ORE_PLACED =                                            //END COBALT ORES
            PlacedFeatures.register("end_cobalt_ore_placed",
                    RebornConfiguredFeatures.END_COBALT_ORE, RebornOreFeatures.modifiersWithCount(10,
                            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(32), YOffset.aboveBottom(70))));

}