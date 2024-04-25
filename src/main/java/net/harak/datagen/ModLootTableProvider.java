package net.harak.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.harak.block.HampterBlocks;
import net.harak.item.HampterItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(HampterBlocks.HAMPTERIUM, copperLikeOre(HampterBlocks.HAMPTERIUM, HampterItems.HAMPTER));
        addDrop(HampterBlocks.HAMPTERIUM_deepslate, copperLikeOre(HampterBlocks.HAMPTERIUM_deepslate, HampterItems.HAMPTER));
        addDrop(HampterBlocks.HAMPTERIUM_ENDSTONE, copperLikeOre(HampterBlocks.HAMPTERIUM_ENDSTONE, HampterItems.HAMPTER));
        addDrop(HampterBlocks.HAMPTERIUM_NETHERRACK, copperLikeOre(HampterBlocks.HAMPTERIUM_NETHERRACK, HampterItems.HAMPTER));
    }




    public LootTable.Builder copperLikeOre(Block drop, Item item) {
        return BlockLootTableGenerator
                .dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop, ((LeafEntry.Builder) ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 5.0f)))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }

}
