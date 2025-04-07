package net.mqzon.willowtree.item;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.mqzon.willowtree.Willowtree;
import net.mqzon.willowtree.block.ModBlocks;

public class ModItems {
    public static final Item WILLOW_SIGN = registerItem("willow_sign",
            new SignItem(ModBlocks.WILLOW_STANDING_SIGN, ModBlocks.WILLOW_WALL_SIGN, new Item.Settings().maxCount(16)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Willowtree.MOD_ID, "willow_sign")))));
    public static final Item WILLOW_HANGING_SIGN = registerItem("willow_hanging_sign",
            new HangingSignItem(ModBlocks.WILLOW_HANGING_SIGN, ModBlocks.WILLOW_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Willowtree.MOD_ID, "willow_hanging_sign")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Willowtree.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Willowtree.LOGGER.info("Registering Mod Items for " + Willowtree.MOD_ID);
    }
}
