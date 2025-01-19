package net.mqzon.willowtree.world.tree;

import net.minecraft.block.SaplingGenerator;
import net.mqzon.willowtree.Willowtree;
import net.mqzon.willowtree.world.ModConfiguredFeatures;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator WILLOW = new SaplingGenerator(Willowtree.MOD_ID + ":willow",
            Optional.empty(),
                        Optional.of(ModConfiguredFeatures.WILLOW),
                        Optional.of(ModConfiguredFeatures.WILLOW_BEES_005));
}
