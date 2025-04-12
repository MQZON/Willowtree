package net.mqzon.willowtree.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.mqzon.willowtree.Willowtree;
import net.mqzon.willowtree.block.ModBlocks;
import net.mqzon.willowtree.world.foliage.SpheroidShellPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> WILLOW = registryKey("willow");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WILLOW_BEES_005 = registryKey("willow_bees_005");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, WILLOW, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.WILLOW_LOG),
                new LargeOakTrunkPlacer(12, 3, 0),
                BlockStateProvider.of(ModBlocks.WILLOW_LEAVES),
                DefaultWillowFoliage(),
                new TwoLayersFeatureSize(1, 0, 2)
        ).build());

        register(context, WILLOW_BEES_005, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.WILLOW_LOG),
                new LargeOakTrunkPlacer(12, 3, 0),
                BlockStateProvider.of(ModBlocks.WILLOW_LEAVES),
                DefaultWillowFoliage(),
                new TwoLayersFeatureSize(1, 0, 2)
        ).decorators(List.of(new BeehiveTreeDecorator(0.05F))).build());
    }


    private static SpheroidShellPlacer DefaultWillowFoliage() {
        return new SpheroidShellPlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), 6);
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Willowtree.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
