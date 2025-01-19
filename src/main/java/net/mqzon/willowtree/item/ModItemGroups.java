package net.mqzon.willowtree.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mqzon.willowtree.Willowtree;
import net.mqzon.willowtree.block.ModBlocks;
//import net.mqzon.willowtree.boat.ModBoats;

public class ModItemGroups {
    public static final ItemGroup WILLOW_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Willowtree.MOD_ID, "willow_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.WILLOW_SAPLING))
                    .displayName(Text.translatable("itemgroup.willowtree.willow_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.WILLOW_SAPLING);
                        entries.add(ModBlocks.WILLOW_LEAVES);

                        entries.add(ModBlocks.WILLOW_LOG);
                        entries.add(ModBlocks.WILLOW_WOOD);
                        entries.add(ModBlocks.STRIPPED_WILLOW_LOG);
                        entries.add(ModBlocks.STRIPPED_WILLOW_WOOD);
                        entries.add(ModBlocks.WILLOW_PLANKS);
                        entries.add(ModBlocks.WILLOW_SLAB);
                        entries.add(ModBlocks.WILLOW_STAIRS);
                        entries.add(ModBlocks.WILLOW_FENCE);
                        entries.add(ModBlocks.WILLOW_FENCE_GATE);
                        entries.add(ModBlocks.WILLOW_DOOR);
                        entries.add(ModBlocks.WILLOW_TRAPDOOR);
                        entries.add(ModBlocks.WILLOW_PRESSURE_PLATE);
                        entries.add(ModBlocks.WILLOW_BUTTON);
//                        entries.add(ModItems.WILLOW_SIGN);
//                        entries.add(ModItems.WILLOW_HANGING_SIGN);
//                        entries.add(ModBoats.WILLOW_BOAT);
//                        entries.add(ModBoats.WILLOW_CHEST_BOAT);
                    }).build());

    public static void registerItemGroups() {
        Willowtree.LOGGER.info("Registering Item Groups for " + Willowtree.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.WILLOW_SAPLING);
            entries.add(ModBlocks.WILLOW_LEAVES);
            entries.add(ModBlocks.WILLOW_LOG);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.WILLOW_LOG);
            entries.add(ModBlocks.WILLOW_WOOD);
            entries.add(ModBlocks.STRIPPED_WILLOW_LOG);
            entries.add(ModBlocks.STRIPPED_WILLOW_WOOD);
            entries.add(ModBlocks.WILLOW_PLANKS);
            entries.add(ModBlocks.WILLOW_SLAB);
            entries.add(ModBlocks.WILLOW_STAIRS);
            entries.add(ModBlocks.WILLOW_FENCE);
            entries.add(ModBlocks.WILLOW_FENCE_GATE);
            entries.add(ModBlocks.WILLOW_DOOR);
            entries.add(ModBlocks.WILLOW_TRAPDOOR);
            entries.add(ModBlocks.WILLOW_PRESSURE_PLATE);
            entries.add(ModBlocks.WILLOW_BUTTON);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
            entries.add(ModBlocks.WILLOW_FENCE_GATE);
            entries.add(ModBlocks.WILLOW_DOOR);
            entries.add(ModBlocks.WILLOW_TRAPDOOR);
            entries.add(ModBlocks.WILLOW_PRESSURE_PLATE);
            entries.add(ModBlocks.WILLOW_BUTTON);
        });

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
//            entries.add(ModItems.WILLOW_SIGN);
//            entries.add(ModItems.WILLOW_HANGING_SIGN);
//        });

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
//            entries.add(ModBoats.WILLOW_BOAT);
//            entries.add(ModBoats.WILLOW_CHEST_BOAT);
//        });


    }
}
