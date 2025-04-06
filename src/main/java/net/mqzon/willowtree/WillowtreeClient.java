package net.mqzon.willowtree;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.mqzon.willowtree.block.ModBlocks;
import net.mqzon.willowtree.boat.ModBoats;

public class WillowtreeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) ->
                world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : -12012264, ModBlocks.WILLOW_LEAVES);

        TerraformBoatClientHelper.registerModelLayers(ModBoats.WILLOW);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WILLOW_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_WILLOW_SAPLING, RenderLayer.getCutout());

    }
}
