package net.mqzon.willowtree.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TexturedModel;
import net.minecraft.client.render.item.tint.ConstantTintSource;
import net.minecraft.util.Identifier;
import net.mqzon.willowtree.Willowtree;
import net.mqzon.willowtree.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    private static final BlockStateModelGenerator.CrossType NOT_TINTED = BlockStateModelGenerator.CrossType.NOT_TINTED;

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WILLOW_SAPLING, ModBlocks.POTTED_WILLOW_SAPLING, NOT_TINTED);

        blockStateModelGenerator.registerSingleton(ModBlocks.WILLOW_LEAVES, TexturedModel.LEAVES);

        blockStateModelGenerator.registerTintedItemModel(ModBlocks.WILLOW_LEAVES, Identifier.of(Willowtree.MOD_ID, "block/willow_leaves"), new ConstantTintSource(-12012264));

        blockStateModelGenerator.registerLog(ModBlocks.WILLOW_LOG)
                .log(ModBlocks.WILLOW_LOG).wood(ModBlocks.WILLOW_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_WILLOW_LOG)
                .log(ModBlocks.STRIPPED_WILLOW_LOG).wood(ModBlocks.STRIPPED_WILLOW_WOOD);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModBlocks.WILLOW_SAPLING.asItem(), Models.GENERATED);

    }
}
