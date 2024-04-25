package net.harak;

import net.fabricmc.api.ModInitializer;

import net.harak.block.HampterBlocks;
import net.harak.item.HampterGroup;
import net.harak.item.HampterItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Harakhampter implements ModInitializer {



	public static final String MOD_ID = "harakhampter";
    public static final Logger LOGGER = LoggerFactory.getLogger("harakhampter");

	@Override
	public void onInitialize() {
		HampterItems.registerModItems();
		HampterGroup.registerItemGroups();
		HampterBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");

	}
}