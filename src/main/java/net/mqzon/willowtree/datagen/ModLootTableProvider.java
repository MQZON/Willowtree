package net.mqzon.willowtree.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.mqzon.willowtree.block.ModBlocks;
import net.mqzon.willowtree.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.WILLOW_SAPLING);

        addDrop(ModBlocks.POTTED_WILLOW_SAPLING, pottedPlantDrops(ModBlocks.WILLOW_SAPLING));

        addDrop(ModBlocks.WILLOW_LEAVES, leavesDrops(ModBlocks.WILLOW_LEAVES, ModBlocks.WILLOW_SAPLING, 0.0625f));

        addDrop(ModBlocks.WILLOW_LOG);
        addDrop(ModBlocks.WILLOW_WOOD);
        addDrop(ModBlocks.STRIPPED_WILLOW_LOG);
        addDrop(ModBlocks.STRIPPED_WILLOW_WOOD);

        addDrop(ModBlocks.WILLOW_PLANKS);
        addDrop(ModBlocks.WILLOW_SLAB,slabDrops(ModBlocks.WILLOW_SLAB));
        addDrop(ModBlocks.WILLOW_STAIRS);
        addDrop(ModBlocks.WILLOW_FENCE);
        addDrop(ModBlocks.WILLOW_FENCE_GATE);
        addDrop(ModBlocks.WILLOW_DOOR,doorDrops(ModBlocks.WILLOW_DOOR));
        addDrop(ModBlocks.WILLOW_TRAPDOOR);
        addDrop(ModBlocks.WILLOW_PRESSURE_PLATE);
        addDrop(ModBlocks.WILLOW_BUTTON);

        addDrop(ModBlocks.WILLOW_STANDING_SIGN, drops(ModItems.WILLOW_SIGN));
        addDrop(ModBlocks.WILLOW_HANGING_SIGN, drops(ModItems.WILLOW_HANGING_SIGN));
        addDrop(ModBlocks.WILLOW_WALL_SIGN, drops(ModItems.WILLOW_SIGN));
        addDrop(ModBlocks.WILLOW_WALL_HANGING_SIGN, drops(ModItems.WILLOW_HANGING_SIGN));
    }
}
