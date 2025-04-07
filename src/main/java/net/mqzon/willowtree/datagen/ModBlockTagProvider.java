package net.mqzon.willowtree.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.mqzon.willowtree.block.ModBlocks;
import net.mqzon.willowtree.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {


        getOrCreateTagBuilder(BlockTags.FLOWER_POTS).add(ModBlocks.POTTED_WILLOW_SAPLING);

        getOrCreateTagBuilder(ModTags.Blocks.WILLOW_LEAVES).add(ModBlocks.WILLOW_LEAVES);
        getOrCreateTagBuilder(BlockTags.LEAVES).addTag(ModTags.Blocks.WILLOW_LEAVES);
        getOrCreateTagBuilder(BlockTags.REPLACEABLE_BY_TREES).addTag(ModTags.Blocks.WILLOW_LEAVES);

        getOrCreateTagBuilder(ModTags.Blocks.WILLOW_LOGS)
                .add(ModBlocks.WILLOW_LOG)
                .add(ModBlocks.WILLOW_WOOD)
                .add(ModBlocks.STRIPPED_WILLOW_LOG)
                .add(ModBlocks.STRIPPED_WILLOW_WOOD);

        getOrCreateTagBuilder(BlockTags.OVERWORLD_NATURAL_LOGS).add(ModBlocks.WILLOW_LOG);

        getOrCreateTagBuilder(BlockTags.COMPLETES_FIND_TREE_TUTORIAL)
                .addTag(ModTags.Blocks.WILLOW_LOGS)
                .addTag(ModTags.Blocks.WILLOW_LEAVES);

        getOrCreateTagBuilder(BlockTags.LOGS).addTag(ModTags.Blocks.WILLOW_LOGS);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).addTag(ModTags.Blocks.WILLOW_LOGS);

        getOrCreateTagBuilder(BlockTags.PLANKS).add(ModBlocks.WILLOW_PLANKS);

        getOrCreateTagBuilder(BlockTags.SLABS).add(ModBlocks.WILLOW_SLAB);
        getOrCreateTagBuilder(BlockTags.STAIRS).add(ModBlocks.WILLOW_STAIRS);
        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.WILLOW_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.WILLOW_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.DOORS).add(ModBlocks.WILLOW_DOOR);
        getOrCreateTagBuilder(BlockTags.TRAPDOORS).add(ModBlocks.WILLOW_TRAPDOOR);
        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES).add(ModBlocks.WILLOW_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.BUTTONS).add(ModBlocks.WILLOW_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS).add(ModBlocks.WILLOW_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS).add(ModBlocks.WILLOW_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).add(ModBlocks.WILLOW_FENCE);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS).add(ModBlocks.WILLOW_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS).add(ModBlocks.WILLOW_TRAPDOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.WILLOW_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS).add(ModBlocks.WILLOW_BUTTON);

        getOrCreateTagBuilder(ModTags.Blocks.WILLOW_SIGNS)
                .add(ModBlocks.WILLOW_STANDING_SIGN)
                .add(ModBlocks.WILLOW_WALL_SIGN)
                .add(ModBlocks.WILLOW_HANGING_SIGN)
                .add(ModBlocks.WILLOW_WALL_HANGING_SIGN);

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS).add(ModBlocks.WILLOW_STANDING_SIGN);
        getOrCreateTagBuilder(BlockTags.WALL_SIGNS).add(ModBlocks.WILLOW_WALL_SIGN);
        getOrCreateTagBuilder(BlockTags.SIGNS).add(ModBlocks.WILLOW_STANDING_SIGN).add(ModBlocks.WILLOW_WALL_SIGN);
        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS).add(ModBlocks.WILLOW_HANGING_SIGN);
        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS).add(ModBlocks.WILLOW_WALL_HANGING_SIGN);
        getOrCreateTagBuilder(BlockTags.ALL_HANGING_SIGNS).add(ModBlocks.WILLOW_HANGING_SIGN).add(ModBlocks.WILLOW_WALL_HANGING_SIGN);
        getOrCreateTagBuilder(BlockTags.ALL_SIGNS).addTag(ModTags.Blocks.WILLOW_SIGNS);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE).addTag(ModTags.Blocks.WILLOW_LEAVES);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .addTag(ModTags.Blocks.WILLOW_LOGS)
                .add(ModBlocks.WILLOW_PLANKS)
                .add(ModBlocks.WILLOW_SLAB)
                .add(ModBlocks.WILLOW_STAIRS)
                .add(ModBlocks.WILLOW_FENCE)
                .add(ModBlocks.WILLOW_FENCE_GATE)
                .add(ModBlocks.WILLOW_DOOR)
                .add(ModBlocks.WILLOW_TRAPDOOR)
                .add(ModBlocks.WILLOW_PRESSURE_PLATE)
                .add(ModBlocks.WILLOW_BUTTON)
                .addTag(ModTags.Blocks.WILLOW_SIGNS);
    }
}
