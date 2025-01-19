package net.mqzon.willowtree.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.mqzon.willowtree.Willowtree;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> WILLOW_LEAVES = createTag("willow_leaves");
        public static final TagKey<Block> WILLOW_LOGS = createTag("willow_logs");
        public static final TagKey<Block> WILLOW_SIGNS = createTag("willow_signs");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Willowtree.MOD_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> WILLOW_LEAVES = createTag("willow_leaves");
        public static final TagKey<Item> WILLOW_LOGS = createTag("willow_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Willowtree.MOD_ID, name));
        }
    }
}
