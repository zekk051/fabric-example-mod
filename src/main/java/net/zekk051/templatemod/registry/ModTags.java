package net.zekk051.templatemod.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zekk051.templatemod.TemplateMod;

//No need to register in main(TemplateMod) class
public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> TEMPLATE_BLOCK_TAG = createTag("template_block_tag");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(TemplateMod.MOD_ID, name));
        }

        private static TagKey<Block> createCommonTag(String name){
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TEMPLATE_ITEM_TAG = createCommonTag("template_item_tag");

        private static TagKey<Item> createTag(String name){
            return TagKey.of(Registry.ITEM_KEY, new Identifier(TemplateMod.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name){
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}
