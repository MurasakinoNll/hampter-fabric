package net.harak.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.harak.Harakhampter;
import net.harak.block.HampterBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class HampterGroup {

    public static final ItemGroup HAMPTER_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Harakhampter.MOD_ID, "hampter"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.hampter"))
                    .icon(() -> new ItemStack(HampterItems.HAMPTER)).entries((displayContext, entries) -> {
                        entries.add(HampterBlocks.HAMPTERIUM);
                        entries.add(HampterBlocks.HAMPTERIUM_NETHERRACK);
                        entries.add(HampterBlocks.HAMPTERIUM_deepslate);
                        entries.add(HampterBlocks.HAMPTERIUM_ENDSTONE);
                        entries.add(HampterItems.HAMPTER);
                        entries.add(HampterItems.HAMPTER_INGOT);
                        entries.add(HampterItems.COOKED_HAMPTER);
                    }).build());

    //    ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
    //    	content.add(CUSTOM_ITEM);
    //    });
    public static void registerItemGroups(){
        Harakhampter.LOGGER.info("hampter registering group");
    }

}
