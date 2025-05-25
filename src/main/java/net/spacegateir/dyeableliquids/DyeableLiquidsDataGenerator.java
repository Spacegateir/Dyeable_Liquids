package net.spacegateir.dyeableliquids;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.spacegateir.dyeableliquids.datagen.ModFluidTagProvider;
import net.spacegateir.dyeableliquids.datagen.ModModelProvider;

public class DyeableLiquidsDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModFluidTagProvider::new);
		pack.addProvider(ModModelProvider::new);

	}
}
