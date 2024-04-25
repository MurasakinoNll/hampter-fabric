package net.harak.utils;

import net.harak.Harakhampter;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks{
        public static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Harakhampter.MOD_ID, name));
        }
    }
    public static class Item{
        public static TagKey<net.minecraft.item.Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Harakhampter.MOD_ID, name));
    }
}}

