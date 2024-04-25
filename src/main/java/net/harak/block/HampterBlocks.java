package net.harak.block;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.harak.Harakhampter;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class HampterBlocks {

    public static final Block HAMPTERIUM = registerBlock("hampterium",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(7f), UniformIntProvider.create(2, 5)));
    public static final Block HAMPTERIUM_NETHERRACK = registerBlock("hampteriumnetherrack",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(7f), UniformIntProvider.create(2, 5)));
    public static final Block HAMPTERIUM_ENDSTONE = registerBlock("hampteriumendstone",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(7f), UniformIntProvider.create(2, 5)));
    public static final Block HAMPTERIUM_deepslate = registerBlock("hampteriumdeepslate",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(7f), UniformIntProvider.create(2, 5)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Harakhampter.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Harakhampter.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks(){
        Harakhampter.LOGGER.info("registering blocks");

    }
}
