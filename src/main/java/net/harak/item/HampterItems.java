package net.harak.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.harak.Harakhampter;
import net.harak.item.custom.ModFoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class HampterItems {

    public static final Item HAMPTER = registerItem("raw_hampter", new Item(new FabricItemSettings()));
    public static final Item HAMPTER_INGOT = registerItem("hampter_ingot", new Item((new FabricItemSettings())));
    public static final Item COOKED_HAMPTER = registerItem("cooked_hampter", new Item((new FabricItemSettings().food(ModFoodComponents.COOKED_HAMPTER))));
    public static final Item MAD_HAMPTER = registerItem("mad_hampter", new Item((new FabricItemSettings())));


    private static void addItemToIngGroup(FabricItemGroupEntries entries) {


    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Harakhampter.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Harakhampter.LOGGER.info("registering info");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(HampterItems::addItemToIngGroup);
    }
}
