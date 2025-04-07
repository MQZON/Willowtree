package net.mqzon.willowtree.world.foliage;

import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.mqzon.willowtree.Willowtree;
import net.mqzon.willowtree.mixin.FoliagePlacerTypeInvoker;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> WILLOW_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("willow_foliage_placer", WillowFoliagePlacer.CODEC);
    public static final FoliagePlacerType<?> SPHEROID_SHELL_PLACER = FoliagePlacerTypeInvoker.callRegister("spheroid_shell_placer", SpheroidShellPlacer.CODEC);

    public static void register() {
        Willowtree.LOGGER.info("Registering Foliage Placer for " + Willowtree.MOD_ID);
    }
}
