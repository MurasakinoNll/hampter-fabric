package net.harak.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.harak.block.HampterBlocks;
import net.harak.item.HampterItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> HAMPTERINGOT_SMELTABLES = List.of(HampterBlocks.HAMPTERIUM, HampterBlocks.HAMPTERIUM_ENDSTONE,
            HampterBlocks.HAMPTERIUM_deepslate, HampterBlocks.HAMPTERIUM_NETHERRACK, HampterItems.HAMPTER);
    private static final List<ItemConvertible> COOKED_HAMPTER = List.of(HampterItems.HAMPTER_INGOT);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerSmelting(exporter, HAMPTERINGOT_SMELTABLES, RecipeCategory.MISC, HampterItems.HAMPTER_INGOT, 0.7f, 60, "hampter");
        offerBlasting(exporter, HAMPTERINGOT_SMELTABLES, RecipeCategory.MISC, HampterItems.HAMPTER_INGOT, 0.7f, 60, "hampter");

        offerSmelting(exporter, COOKED_HAMPTER, RecipeCategory.FOOD, HampterItems.COOKED_HAMPTER, 1f, 120, "hampter");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, HampterItems.MAD_HAMPTER, 1)
                .pattern("###")
                .pattern("#C#")
                .pattern("###")
                .input('#', HampterItems.HAMPTER_INGOT)
                .input('C', HampterItems.COOKED_HAMPTER)
                .criterion(hasItem(HampterItems.HAMPTER_INGOT), conditionsFromItem(HampterItems.HAMPTER_INGOT))
                .criterion(hasItem(HampterItems.COOKED_HAMPTER), conditionsFromItem(HampterItems.COOKED_HAMPTER))
                .offerTo(exporter, new Identifier(getRecipeName(HampterItems.MAD_HAMPTER)));
    }
}
