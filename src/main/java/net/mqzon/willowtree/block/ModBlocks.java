package net.mqzon.willowtree.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.mqzon.willowtree.Willowtree;
import net.mqzon.willowtree.world.tree.ModSaplingGenerators;

public class ModBlocks {
    public static final Block WILLOW_SAPLING = registerBlock("willow_sapling",
            new SaplingBlock(ModSaplingGenerators.WILLOW, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_sapling")))
                    .mapColor(MapColor.DARK_GREEN)));

    public static final Block POTTED_WILLOW_SAPLING = registerBlockWithoutBlockItem("potted_willow_sapling",
            new FlowerPotBlock(WILLOW_SAPLING, AbstractBlock.Settings.copy(Blocks.POTTED_OAK_SAPLING)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "potted_willow_sapling")))
            ));

    public static final Block WILLOW_LEAVES = registerBlock("willow_leaves",
        new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)
                .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_leaves")))));

    public static final Block WILLOW_LOG = registerBlock("willow_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).mapColor(MapColor.OAK_TAN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_log")))
            ));
    public static final Block WILLOW_WOOD = registerBlock("willow_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).mapColor(MapColor.OAK_TAN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_wood")))
            ));
    public static final Block STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.OAK_TAN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "stripped_willow_log")))
            ));
    public static final Block STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.OAK_TAN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "stripped_willow_wood")))
            ));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Willowtree.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Willowtree.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Willowtree.MOD_ID, name),
                new BlockItem(block, new Item.Settings() .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Willowtree.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.WILLOW_SAPLING);
            entries.add(ModBlocks.WILLOW_LOG);
            entries.add(ModBlocks.WILLOW_WOOD);
            entries.add(ModBlocks.STRIPPED_WILLOW_LOG);
            entries.add(ModBlocks.STRIPPED_WILLOW_WOOD);
            entries.add(ModBlocks.WILLOW_LEAVES);
        });

        StrippableBlockRegistry.register(WILLOW_LOG, STRIPPED_WILLOW_LOG);
        StrippableBlockRegistry.register(WILLOW_WOOD, STRIPPED_WILLOW_WOOD);

    }
}
