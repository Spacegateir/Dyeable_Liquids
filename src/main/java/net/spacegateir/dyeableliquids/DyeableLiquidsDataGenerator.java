package net.spacegateir.dyeableliquids;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.spacegateir.dyeableliquids.datagen.ModBlockTagProvider;
import net.spacegateir.dyeableliquids.datagen.ModFluidTagProvider;
import net.spacegateir.dyeableliquids.datagen.ModModelProvider;
import net.spacegateir.dyeableliquids.datagen.ModRecipeGenerator;

public class DyeableLiquidsDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModFluidTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeGenerator::new);

	}
}
