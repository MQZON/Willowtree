package net.mqzon.willowtree.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.mqzon.willowtree.block.ModBlocks;
//import net.mqzon.willowtree.boat.ModBoats;
//import net.mqzon.willowtree.item.ModItems;
import net.mqzon.willowtree.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {

            public static final Ingredient WILLOW_PLANKS_INGREDIENT = Ingredient.ofItems(ModBlocks.WILLOW_PLANKS.asItem());
            public static final String HAS_WILLOW_PLANKS = hasItem(ModBlocks.WILLOW_PLANKS);
            public final AdvancementCriterion<?> HAS_WILLOW_PLANKS_CRITERION = conditionsFromItem(ModBlocks.WILLOW_PLANKS);
            public static final String HAS_WILLOW_LEAVES = hasItem(ModBlocks.WILLOW_LEAVES);
            public final AdvancementCriterion<?> HAS_WILLOW_LEAVES_CRITERION = conditionsFromItem(ModBlocks.WILLOW_LEAVES);
//            public static final String RED_HAS_WILLOW_LEAVES = hasItem(ModBlocks.RED_WILLOW_LEAVES);
//            public final AdvancementCriterion<?> RED_HAS_WILLOW_LEAVES_CRITERION = conditionsFromItem(ModBlocks.RED_WILLOW_LEAVES);

            @Override
            public void generate() {
                offerBarkBlockRecipe(ModBlocks.WILLOW_WOOD, ModBlocks.WILLOW_LOG);
                offerBarkBlockRecipe(ModBlocks.STRIPPED_WILLOW_WOOD, ModBlocks.STRIPPED_WILLOW_LOG);

                offerPlanksRecipe(ModBlocks.WILLOW_PLANKS, ModTags.Items.WILLOW_LOGS, 4);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WILLOW_SLAB, ModBlocks.WILLOW_PLANKS);
                createStairsRecipe(ModBlocks.WILLOW_STAIRS, WILLOW_PLANKS_INGREDIENT).criterion(HAS_WILLOW_PLANKS, HAS_WILLOW_PLANKS_CRITERION).offerTo(exporter);
                createFenceRecipe(ModBlocks.WILLOW_FENCE, WILLOW_PLANKS_INGREDIENT).criterion(HAS_WILLOW_PLANKS, HAS_WILLOW_PLANKS_CRITERION).offerTo(exporter);
                createFenceGateRecipe(ModBlocks.WILLOW_FENCE_GATE, WILLOW_PLANKS_INGREDIENT).criterion(HAS_WILLOW_PLANKS, HAS_WILLOW_PLANKS_CRITERION).offerTo(exporter);
                createDoorRecipe(ModBlocks.WILLOW_DOOR, WILLOW_PLANKS_INGREDIENT).criterion(HAS_WILLOW_PLANKS, HAS_WILLOW_PLANKS_CRITERION).offerTo(exporter);
                createTrapdoorRecipe(ModBlocks.WILLOW_TRAPDOOR, WILLOW_PLANKS_INGREDIENT).criterion(HAS_WILLOW_PLANKS, HAS_WILLOW_PLANKS_CRITERION).offerTo(exporter);
                offerPressurePlateRecipe(ModBlocks.WILLOW_PRESSURE_PLATE, ModBlocks.WILLOW_PLANKS);
                offerShapelessRecipe(ModBlocks.WILLOW_BUTTON, ModBlocks.WILLOW_PLANKS, "wooden_button", 1);
//                createSignRecipe(ModItems.WILLOW_SIGN, WILLOW_PLANKS_INGREDIENT).criterion(HAS_WILLOW_PLANKS, HAS_WILLOW_PLANKS_CRITERION).offerTo(exporter);
//                offerHangingSignRecipe(ModItems.WILLOW_HANGING_SIGN, ModBlocks.STRIPPED_WILLOW_LOG);
//                offerBoatRecipe(ModBoats.WILLOW_BOAT, ModBlocks.WILLOW_PLANKS);
//                offerChestBoatRecipe(ModBoats.WILLOW_CHEST_BOAT, ModBoats.WILLOW_BOAT);
             }
        };
    }

    @Override
    public String getName() {
        return "Willowtree Recipes";
    }
}
