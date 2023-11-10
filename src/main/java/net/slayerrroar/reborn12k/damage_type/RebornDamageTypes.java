package net.slayerrroar.reborn12k.damage_type;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.slayerrroar.reborn12k.Reborn12K;

public class RebornDamageTypes {

    public static final RegistryKey<DamageType> BLEED = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, new Identifier(Reborn12K.MOD_ID, "bleed"));

    public static DamageSource of(World world, RegistryKey<DamageType> key) {
        return new DamageSource(world.getRegistryManager().get(RegistryKeys.DAMAGE_TYPE).entryOf(key));
    }
}