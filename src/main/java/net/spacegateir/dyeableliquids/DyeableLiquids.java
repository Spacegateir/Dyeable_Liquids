package net.spacegateir.dyeableliquids;

import net.fabricmc.api.ModInitializer;

import net.spacegateir.dyeableliquids.creative_tab.ModItemGroups;
import net.spacegateir.dyeableliquids.fluid.ModFluids;
import net.spacegateir.dyeableliquids.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DyeableLiquids implements ModInitializer {

	public static final String MOD_ID = "dyeable_liquids";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModFluids.registerFluids();
		ModItemGroups.registerItemGroups();

		LOGGER.info("Hello Fabric world!");
	}
}