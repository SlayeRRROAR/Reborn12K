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


    public static final RegistryEntry<PlacedFeature> TIN_ORE_PLACED =                                                   //TIN ORES
            PlacedFeatures.register("tin_ore_placed",
                    RebornConfiguredFeatures.TIN_ORE,
                    RebornOreFeatures.modifiersWithCount(12,
                            HeightRangePlacementModifier.uniform(YOffset.fixed(24), YOffset.fixed(124))));


    public static final RegistryEntry<PlacedFeature> CHROMITE_ORE_PLACED =                                              //CHROMITE ORES
            PlacedFeatures.register("chromite_ore_placed",
                    RebornConfiguredFeatures.CHROMITE_ORE,
                    RebornOreFeatures.modifiersWithCount(6,
                            HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(48))));


    public static final RegistryEntry<PlacedFeature> SILVER_ORE_PLACED =                                                //SILVER ORES
            PlacedFeatures.register("silver_ore_placed",
                    RebornConfiguredFeatures.SILVER_ORE,
                    RebornOreFeatures.modifiersWithCount(7,
                            HeightRangePlacementModifier.uniform(YOffset.fixed(-48), YOffset.fixed(16))));


    public static final RegistryEntry<PlacedFeature> TITANIUM_ORE_PLACED =                                              //TITANIUM ORES
            PlacedFeatures.register("titanium_ore_placed",
                    RebornConfiguredFeatures.TITANIUM_ORE,
                    RebornOreFeatures.modifiersWithCount(4,
                            HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-16))));


    public static final RegistryEntry<PlacedFeature> NETHER_CHROMITE_ORE_PLACED =                                       //NETHER CHROMITE ORES
            PlacedFeatures.register("nether_chromite_ore_placed",
                    RebornConfiguredFeatures.NETHER_CHROMITE_ORE,
                    RebornOreFeatures.modifiersWithCount(11,
                            HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(120))));


    public static final RegistryEntry<PlacedFeature> NETHER_ALUMINUM_ORE_PLACED =                                       //NETHER ALUMINUM ORES
            PlacedFeatures.register("nether_aluminum_ore_placed",
                    RebornConfiguredFeatures.NETHER_ALUMINUM_ORE,
                    RebornOreFeatures.modifiersWithCount(9,
                            HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(120))));


    public static final RegistryEntry<PlacedFeature> END_COBALT_ORE_PLACED =                                            //END COBALT ORES
            PlacedFeatures.register("end_cobalt_ore_placed",
                    RebornConfiguredFeatures.END_COBALT_ORE, RebornOreFeatures.modifiersWithCount(10,
                            HeightRangePlacementModifier.uniform(YOffset.fixed(32), YOffset.fixed(70))));


    public static final RegistryEntry<PlacedFeature> END_IRIDIUM_ORE_PLACED =                                           //END IRIDIUM ORES
            PlacedFeatures.register("end_iridium_ore_placed",
                    RebornConfiguredFeatures.END_IRIDIUM_ORE, RebornOreFeatures.modifiersWithCount(10,
                            HeightRangePlacementModifier.uniform(YOffset.fixed(32), YOffset.fixed(70))));

}