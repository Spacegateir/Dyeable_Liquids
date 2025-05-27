package net.spacegateir.dyeableliquids.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.spacegateir.dyeableliquids.items.ModItems;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.SOAP_WATER_BUCKET, Models.GENERATED);

        itemModelGenerator.register(ModItems.WHITE_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_GRAY_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROWN_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_BLUE_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGENTA_WATER_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_WATER_BUCKET, Models.GENERATED);

        itemModelGenerator.register(ModItems.WHITE_LAVA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_GRAY_LAVA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_LAVA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_LAVA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROWN_LAVA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_LAVA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_LAVA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_LAVA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME_LAVA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_LAVA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_LAVA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_BLUE_LAVA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_LAVA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_LAVA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGENTA_LAVA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_LAVA_BUCKET, Models.GENERATED);



    }
}
