package net.spacegateir.dyeableliquids.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.spacegateir.dyeableliquids.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static class ModTags {


    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.CAULDRONS)

                .add(ModBlocks.BLACK_LAVA_CAULDRON_BLOCK)
                .add(ModBlocks.BLACK_WATER_CAULDRON_BLOCK)
                .add(ModBlocks.BLUE_LAVA_CAULDRON_BLOCK)
                .add(ModBlocks.BLUE_WATER_CAULDRON_BLOCK)
                .add(ModBlocks.BROWN_LAVA_CAULDRON_BLOCK)
                .add(ModBlocks.BROWN_WATER_CAULDRON_BLOCK)
                .add(ModBlocks.CYAN_LAVA_CAULDRON_BLOCK)
                .add(ModBlocks.CYAN_WATER_CAULDRON_BLOCK)
                .add(ModBlocks.GRAY_LAVA_CAULDRON_BLOCK)
                .add(ModBlocks.GRAY_WATER_CAULDRON_BLOCK)
                .add(ModBlocks.GREEN_LAVA_CAULDRON_BLOCK)
                .add(ModBlocks.GREEN_WATER_CAULDRON_BLOCK)
                .add(ModBlocks.LIGHT_BLUE_LAVA_CAULDRON_BLOCK)
                .add(ModBlocks.LIGHT_BLUE_WATER_CAULDRON_BLOCK)
                .add(ModBlocks.LIGHT_GRAY_LAVA_CAULDRON_BLOCK)
                .add(ModBlocks.LIGHT_GRAY_WATER_CAULDRON_BLOCK)
                .add(ModBlocks.LIME_LAVA_CAULDRON_BLOCK)
                .add(ModBlocks.LIME_WATER_CAULDRON_BLOCK)
                .add(ModBlocks.MAGENTA_LAVA_CAULDRON_BLOCK)
                .add(ModBlocks.MAGENTA_WATER_CAULDRON_BLOCK)
                .add(ModBlocks.ORANGE_LAVA_CAULDRON_BLOCK)
                .add(ModBlocks.ORANGE_WATER_CAULDRON_BLOCK)
                .add(ModBlocks.PINK_LAVA_CAULDRON_BLOCK)
                .add(ModBlocks.PINK_WATER_CAULDRON_BLOCK)
                .add(ModBlocks.PURPLE_LAVA_CAULDRON_BLOCK)
                .add(ModBlocks.PURPLE_WATER_CAULDRON_BLOCK)
                .add(ModBlocks.RED_LAVA_CAULDRON_BLOCK)
                .add(ModBlocks.RED_WATER_CAULDRON_BLOCK)
                .add(ModBlocks.WHITE_LAVA_CAULDRON_BLOCK)
                .add(ModBlocks.WHITE_WATER_CAULDRON_BLOCK)
                .add(ModBlocks.YELLOW_LAVA_CAULDRON_BLOCK)
                .add(ModBlocks.YELLOW_WATER_CAULDRON_BLOCK);

    }
}