package net.mqzon.willowtree.block;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
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
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).mapColor(MapColor.TERRACOTTA_LIME)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_log")))
            ));
    public static final Block WILLOW_WOOD = registerBlock("willow_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).mapColor(MapColor.TERRACOTTA_LIME)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_wood")))
            ));
    public static final Block STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.GREEN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "stripped_willow_log")))
            ));
    public static final Block STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.GREEN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "stripped_willow_wood")))
            ));
    public static final Block WILLOW_PLANKS = registerBlock("willow_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_planks")))
                    .mapColor(MapColor.GREEN)));

    public static final Block WILLOW_SLAB = registerBlock("willow_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.GREEN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_slab")))
            ));
    public static final Block WILLOW_STAIRS = registerBlock("willow_stairs",
            new StairsBlock(WILLOW_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_stairs")))
                    .mapColor(MapColor.GREEN)
            ));
    public static final Block WILLOW_FENCE = registerBlock("willow_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.GREEN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_fence")))
            ));
    public static final Block WILLOW_FENCE_GATE = registerBlock("willow_fence_gate",
            new FenceGateBlock(WoodType.OAK,
                    AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).mapColor(MapColor.GREEN)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_fence_gate")))
            ));
    public static final Block WILLOW_DOOR = registerBlock("willow_door",
            new DoorBlock(WoodType.OAK.setType(),
                    AbstractBlock.Settings.copy(Blocks.OAK_DOOR).mapColor(MapColor.GREEN)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_door")))
            ));
    public static final Block WILLOW_TRAPDOOR = registerBlock("willow_trapdoor",
            new TrapdoorBlock(WoodType.OAK.setType(), AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_trapdoor")))
                    .mapColor(MapColor.GREEN)));
    public static final Block WILLOW_PRESSURE_PLATE = registerBlock("willow_pressure_plate",
            new PressurePlateBlock(WoodType.OAK.setType(), AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_pressure_plate")))
                    .mapColor(MapColor.GREEN)));
    public static final Block WILLOW_BUTTON = registerBlock("willow_button",
            new ButtonBlock(WoodType.OAK.setType(), 15, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_button")))
                    .mapColor(MapColor.GREEN)));

    public static final Identifier WILLOW_SIGN_TEXTURE = Identifier.of(Willowtree.MOD_ID, "entity/signs/willow");
    public static final Identifier WILLOW_HANGING_SIGN_TEXTURE = Identifier.of(Willowtree.MOD_ID, "entity/signs/hanging/willow");
    public static final Identifier WILLOW_HANGING_GUI_SIGN_TEXTURE = Identifier.of(Willowtree.MOD_ID, "textures/gui/hanging_signs/willow");

    public static final Block WILLOW_STANDING_SIGN = registerBlock("willow_standing_sign",
            new TerraformSignBlock(WILLOW_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_standing_sign")))
                    .mapColor(MapColor.GREEN)));
    public static final Block WILLOW_WALL_SIGN = registerBlock("willow_wall_sign",
            new TerraformWallSignBlock(WILLOW_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_wall_sign")))
                    .mapColor(MapColor.GREEN)));
    public static final Block WILLOW_HANGING_SIGN = registerBlockWithoutBlockItem("willow_hanging_sign",
            new TerraformHangingSignBlock(WILLOW_HANGING_SIGN_TEXTURE, WILLOW_HANGING_GUI_SIGN_TEXTURE,
                    AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN).mapColor(MapColor.GREEN)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_hanging_sign")))
            ));
    public static final Block WILLOW_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("willow_wall_hanging_sign",
            new TerraformWallHangingSignBlock(WILLOW_HANGING_SIGN_TEXTURE, WILLOW_HANGING_GUI_SIGN_TEXTURE,
                    AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(MapColor.GREEN)
                            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, "willow_wall_hanging_sign")))
            ));

    public static final BlockFamily WILLOW_FAMILY = BlockFamilies.register(WILLOW_PLANKS)
            .sign(WILLOW_STANDING_SIGN, WILLOW_WALL_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

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
