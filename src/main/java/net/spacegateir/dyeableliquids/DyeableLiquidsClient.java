package net.spacegateir.dyeableliquids;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.spacegateir.dyeableliquids.fluid.ModFluids;
import net.spacegateir.dyeableliquids.util.render_handler.ModClient;

public class DyeableLiquidsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ModClient.registerFluidRenderers();

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_WHITE_WATER, ModFluids.FLOWING_WHITE_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA1FFFFFF));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_WHITE_WATER, ModFluids.FLOWING_WHITE_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LIGHT_GRAY_WATER, ModFluids.FLOWING_LIGHT_GRAY_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA1BEBEBE));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_LIGHT_GRAY_WATER, ModFluids.FLOWING_LIGHT_GRAY_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GRAY_WATER, ModFluids.FLOWING_GRAY_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA1808080));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_GRAY_WATER, ModFluids.FLOWING_GRAY_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BLACK_WATER, ModFluids.FLOWING_BLACK_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA1191919));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_BLACK_WATER, ModFluids.FLOWING_BLACK_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BROWN_WATER, ModFluids.FLOWING_BROWN_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA1804A2C));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_BROWN_WATER, ModFluids.FLOWING_BROWN_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_RED_WATER, ModFluids.FLOWING_RED_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA1FF0000));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_RED_WATER, ModFluids.FLOWING_RED_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_ORANGE_WATER, ModFluids.FLOWING_ORANGE_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA1FFA500));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_ORANGE_WATER, ModFluids.FLOWING_ORANGE_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_YELLOW_WATER, ModFluids.FLOWING_YELLOW_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA1FFFF00));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_YELLOW_WATER, ModFluids.FLOWING_YELLOW_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LIME_WATER, ModFluids.FLOWING_LIME_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA15DFF07));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_LIME_WATER, ModFluids.FLOWING_LIME_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GREEN_WATER, ModFluids.FLOWING_GREEN_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA1008000));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_GREEN_WATER, ModFluids.FLOWING_GREEN_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CYAN_WATER, ModFluids.FLOWING_CYAN_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA100FFFF));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_CYAN_WATER, ModFluids.FLOWING_CYAN_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LIGHT_BLUE_WATER, ModFluids.FLOWING_LIGHT_BLUE_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA1ADD8E6));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_LIGHT_BLUE_WATER, ModFluids.FLOWING_LIGHT_BLUE_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BLUE_WATER, ModFluids.FLOWING_BLUE_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA10000FF));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_BLUE_WATER, ModFluids.FLOWING_BLUE_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_PURPLE_WATER, ModFluids.FLOWING_PURPLE_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA18000FF));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_PURPLE_WATER, ModFluids.FLOWING_PURPLE_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_MAGENTA_WATER, ModFluids.FLOWING_MAGENTA_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA1FF00FF));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_MAGENTA_WATER, ModFluids.FLOWING_MAGENTA_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_PINK_WATER, ModFluids.FLOWING_PINK_WATER,
                SimpleFluidRenderHandler.coloredWater(0xA1FFC0CB));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_PINK_WATER, ModFluids.FLOWING_PINK_WATER);



        BlockRenderLayerMap.INSTANCE.putBlock(ModFluids.WHITE_LAVA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_WHITE_LAVA, ModFluids.FLOWING_WHITE_LAVA);

        BlockRenderLayerMap.INSTANCE.putBlock(ModFluids.LIGHT_GRAY_LAVA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_LIGHT_GRAY_LAVA, ModFluids.FLOWING_LIGHT_GRAY_LAVA);

        BlockRenderLayerMap.INSTANCE.putBlock(ModFluids.GRAY_LAVA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_GRAY_LAVA, ModFluids.FLOWING_GRAY_LAVA);

        BlockRenderLayerMap.INSTANCE.putBlock(ModFluids.BLACK_LAVA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_BLACK_LAVA, ModFluids.FLOWING_BLACK_LAVA);

        BlockRenderLayerMap.INSTANCE.putBlock(ModFluids.BROWN_LAVA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_BROWN_LAVA, ModFluids.FLOWING_BROWN_LAVA);

        BlockRenderLayerMap.INSTANCE.putBlock(ModFluids.RED_LAVA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_RED_LAVA, ModFluids.FLOWING_RED_LAVA);

        BlockRenderLayerMap.INSTANCE.putBlock(ModFluids.ORANGE_LAVA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_ORANGE_LAVA, ModFluids.FLOWING_ORANGE_LAVA);

        BlockRenderLayerMap.INSTANCE.putBlock(ModFluids.YELLOW_LAVA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_YELLOW_LAVA, ModFluids.FLOWING_YELLOW_LAVA);

        BlockRenderLayerMap.INSTANCE.putBlock(ModFluids.LIME_LAVA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_LIME_LAVA, ModFluids.FLOWING_LIME_LAVA);

        BlockRenderLayerMap.INSTANCE.putBlock(ModFluids.GREEN_LAVA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_GREEN_LAVA, ModFluids.FLOWING_GREEN_LAVA);

        BlockRenderLayerMap.INSTANCE.putBlock(ModFluids.CYAN_LAVA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_CYAN_LAVA, ModFluids.FLOWING_CYAN_LAVA);

        BlockRenderLayerMap.INSTANCE.putBlock(ModFluids.LIGHT_BLUE_LAVA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_LIGHT_BLUE_LAVA, ModFluids.FLOWING_LIGHT_BLUE_LAVA);

        BlockRenderLayerMap.INSTANCE.putBlock(ModFluids.BLUE_LAVA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_BLUE_LAVA, ModFluids.FLOWING_BLUE_LAVA);

        BlockRenderLayerMap.INSTANCE.putBlock(ModFluids.PURPLE_LAVA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_PURPLE_LAVA, ModFluids.FLOWING_PURPLE_LAVA);

        BlockRenderLayerMap.INSTANCE.putBlock(ModFluids.MAGENTA_LAVA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_MAGENTA_LAVA, ModFluids.FLOWING_MAGENTA_LAVA);

        BlockRenderLayerMap.INSTANCE.putBlock(ModFluids.PINK_LAVA_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluids.STILL_PINK_LAVA, ModFluids.FLOWING_PINK_LAVA);








    }
}
