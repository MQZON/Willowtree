package net.mqzon.willowtree.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.mqzon.willowtree.block.ModBlocks;
import net.mqzon.willowtree.boat.ModBoats;
import net.mqzon.willowtree.item.ModItems;
import net.mqzon.willowtree.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.WILLOW_LEAVES).add(ModBlocks.WILLOW_LEAVES.asItem());

        getOrCreateTagBuilder(ModTags.Items.WILLOW_LOGS)
                .add(ModBlocks.WILLOW_LOG.asItem())
                .add(ModBlocks.WILLOW_WOOD.asItem())
                .add(ModBlocks.STRIPPED_WILLOW_LOG.asItem())
                .add(ModBlocks.STRIPPED_WILLOW_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.COMPLETES_FIND_TREE_TUTORIAL)
                .addTag(ModTags.Items.WILLOW_LEAVES)
                .addTag(ModTags.Items.WILLOW_LOGS);

        getOrCreateTagBuilder(ItemTags.SAPLINGS).add(ModBlocks.WILLOW_SAPLING.asItem());
        getOrCreateTagBuilder(ItemTags.LEAVES).addTag(ModTags.Items.WILLOW_LEAVES);

        getOrCreateTagBuilder(ItemTags.LOGS).addTag(ModTags.Items.WILLOW_LOGS);
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN).addTag(ModTags.Items.WILLOW_LOGS);

        getOrCreateTagBuilder(ItemTags.PLANKS).add(ModBlocks.WILLOW_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS).add(ModBlocks.WILLOW_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.STAIRS).add(ModBlocks.WILLOW_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.FENCES).add(ModBlocks.WILLOW_FENCE.asItem());
        getOrCreateTagBuilder(ItemTags.FENCE_GATES).add(ModBlocks.WILLOW_FENCE_GATE.asItem());
        getOrCreateTagBuilder(ItemTags.DOORS).add(ModBlocks.WILLOW_DOOR.asItem());
        getOrCreateTagBuilder(ItemTags.TRAPDOORS).add(ModBlocks.WILLOW_TRAPDOOR.asItem());
        getOrCreateTagBuilder(ItemTags.BUTTONS).add(ModBlocks.WILLOW_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS).add(ModBlocks.WILLOW_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS).add(ModBlocks.WILLOW_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES).add(ModBlocks.WILLOW_FENCE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS).add(ModBlocks.WILLOW_DOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS).add(ModBlocks.WILLOW_TRAPDOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.WILLOW_PRESSURE_PLATE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS).add(ModBlocks.WILLOW_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.SIGNS).add(ModItems.WILLOW_SIGN);
        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS).add(ModItems.WILLOW_HANGING_SIGN);

        getOrCreateTagBuilder(ItemTags.BOATS).add(ModBoats.WILLOW_BOAT);
        getOrCreateTagBuilder(ItemTags.CHEST_BOATS).add(ModBoats.WILLOW_CHEST_BOAT);
    }
}
