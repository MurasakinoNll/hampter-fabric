package net.harak.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.harak.block.HampterBlocks;
import net.harak.item.HampterItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(HampterBlocks.HAMPTERIUM_NETHERRACK);
        blockStateModelGenerator.registerSimpleCubeAll(HampterBlocks.HAMPTERIUM_ENDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(HampterBlocks.HAMPTERIUM);
        blockStateModelGenerator.registerSimpleCubeAll(HampterBlocks.HAMPTERIUM_deepslate);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(HampterItems.HAMPTER, Models.GENERATED);
        itemModelGenerator.register(HampterItems.HAMPTER_INGOT, Models.GENERATED);
        itemModelGenerator.register(HampterItems.COOKED_HAMPTER, Models.GENERATED);
        itemModelGenerator.register(HampterItems.MAD_HAMPTER, Models.GENERATED);
    }
}
