package net.slayerrroar.reborn12k.world.generation;

import net.slayerrroar.reborn12k.Reborn12K;

public class RebornWorldGen {

    public static void generate() {

        if (Reborn12K.CONFIG.enableOreGeneration) {
            RebornOreGen.generateOres();
        }
        if (Reborn12K.CONFIG.enableTreeGeneration) {
            RebornTreeGen.generateTrees();
        }

    }

}
