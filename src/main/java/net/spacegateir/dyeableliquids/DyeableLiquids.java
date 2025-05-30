package net.spacegateir.dyeableliquids;

import net.fabricmc.api.ModInitializer;

import net.spacegateir.dyeableliquids.block.ModBlocks;
import net.spacegateir.dyeableliquids.creative_tab.ModItemGroups;
import net.spacegateir.dyeableliquids.fluid.ModFluids;
import net.spacegateir.dyeableliquids.items.ModItems;
import net.spacegateir.dyeableliquids.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DyeableLiquids implements ModInitializer {

	public static final String MOD_ID = "dyeableliquids";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModFluids.registerFluids();
		ModItemGroups.registerItemGroups();

		ModRegistries.registerModStuffs();





		LOGGER.info("Hello Fabric world!");
	}
}