package net.spacegateir.dyeableliquids.util.render_handler;

import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.minecraft.util.Identifier;
import net.spacegateir.dyeableliquids.fluid.ModFluids;

public class ModClient {

    public static void registerFluidRenderers() {
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluids.STILL_WHITE_LAVA, ModFluids.FLOWING_WHITE_LAVA,
                ModFluidRenderHandler.coloredLava(
                        0xA1FFFFFF,  // White tint
                        new Identifier("dyeableliquids", "block/white_lava_still"),
                        new Identifier("dyeableliquids", "block/white_lava_flow")
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluids.STILL_LIGHT_GRAY_LAVA, ModFluids.FLOWING_LIGHT_GRAY_LAVA,
                ModFluidRenderHandler.coloredLava(
                        0xFFA0A0A0,  // Light Gray tint example
                        new Identifier("dyeableliquids", "block/light_gray_lava_still"),
                        new Identifier("dyeableliquids", "block/light_gray_lava_flow")
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluids.STILL_GRAY_LAVA, ModFluids.FLOWING_GRAY_LAVA,
                ModFluidRenderHandler.coloredLava(
                        0xFF808080,  // Gray tint example
                        new Identifier("dyeableliquids", "block/gray_lava_still"),
                        new Identifier("dyeableliquids", "block/gray_lava_flow")
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluids.STILL_BLACK_LAVA, ModFluids.FLOWING_BLACK_LAVA,
                ModFluidRenderHandler.coloredLava(
                        0xA1DDD4CB,  // Black tint
                        new Identifier("dyeableliquids", "block/black_lava_still"),
                        new Identifier("dyeableliquids", "block/black_lava_flow")
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluids.STILL_BROWN_LAVA, ModFluids.FLOWING_BROWN_LAVA,
                ModFluidRenderHandler.coloredLava(
                        0xFF8B4513,  // Brown tint
                        new Identifier("dyeableliquids", "block/brown_lava_still"),
                        new Identifier("dyeableliquids", "block/brown_lava_flow")
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluids.STILL_RED_LAVA, ModFluids.FLOWING_RED_LAVA,
                ModFluidRenderHandler.coloredLava(
                        0xFFFF0000,  // Red tint
                        new Identifier("dyeableliquids", "block/red_lava_still"),
                        new Identifier("dyeableliquids", "block/red_lava_flow")
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluids.STILL_ORANGE_LAVA, ModFluids.FLOWING_ORANGE_LAVA,
                ModFluidRenderHandler.coloredLava(
                        0xFFFFA500,  // Orange tint
                        new Identifier("dyeableliquids", "block/orange_lava_still"),
                        new Identifier("dyeableliquids", "block/orange_lava_flow")
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluids.STILL_YELLOW_LAVA, ModFluids.FLOWING_YELLOW_LAVA,
                ModFluidRenderHandler.coloredLava(
                        0xFFFFFF00,  // Yellow tint
                        new Identifier("dyeableliquids", "block/yellow_lava_still"),
                        new Identifier("dyeableliquids", "block/yellow_lava_flow")
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluids.STILL_LIME_LAVA, ModFluids.FLOWING_LIME_LAVA,
                ModFluidRenderHandler.coloredLava(
                        0xA15DFF07,  // Lime tint
                        new Identifier("dyeableliquids", "block/lime_lava_still"),
                        new Identifier("dyeableliquids", "block/lime_lava_flow")
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluids.STILL_GREEN_LAVA, ModFluids.FLOWING_GREEN_LAVA,
                ModFluidRenderHandler.coloredLava(
                        0xFF008000,  // Green tint
                        new Identifier("dyeableliquids", "block/green_lava_still"),
                        new Identifier("dyeableliquids", "block/green_lava_flow")
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluids.STILL_CYAN_LAVA, ModFluids.FLOWING_CYAN_LAVA,
                ModFluidRenderHandler.coloredLava(
                        0xFF00FFFF,  // Cyan tint
                        new Identifier("dyeableliquids", "block/cyan_lava_still"),
                        new Identifier("dyeableliquids", "block/cyan_lava_flow")
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluids.STILL_LIGHT_BLUE_LAVA, ModFluids.FLOWING_LIGHT_BLUE_LAVA,
                ModFluidRenderHandler.coloredLava(
                        0xFFADD8E6,  // Light Blue tint
                        new Identifier("dyeableliquids", "block/light_blue_lava_still"),
                        new Identifier("dyeableliquids", "block/light_blue_lava_flow")
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluids.STILL_BLUE_LAVA, ModFluids.FLOWING_BLUE_LAVA,
                ModFluidRenderHandler.coloredLava(
                        0xFF0000FF,  // Blue tint
                        new Identifier("dyeableliquids", "block/blue_lava_still"),
                        new Identifier("dyeableliquids", "block/blue_lava_flow")
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluids.STILL_PURPLE_LAVA, ModFluids.FLOWING_PURPLE_LAVA,
                ModFluidRenderHandler.coloredLava(
                        0xFF800080,  // Purple tint
                        new Identifier("dyeableliquids", "block/purple_lava_still"),
                        new Identifier("dyeableliquids", "block/purple_lava_flow")
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluids.STILL_MAGENTA_LAVA, ModFluids.FLOWING_MAGENTA_LAVA,
                ModFluidRenderHandler.coloredLava(
                        0xFFFF00FF,  // Magenta tint
                        new Identifier("dyeableliquids", "block/magenta_lava_still"),
                        new Identifier("dyeableliquids", "block/magenta_lava_flow")
                )
        );
        FluidRenderHandlerRegistry.INSTANCE.register(
                ModFluids.STILL_PINK_LAVA, ModFluids.FLOWING_PINK_LAVA,
                ModFluidRenderHandler.coloredLava(
                        0xFFFFC0CB,  // Pink tint
                        new Identifier("dyeableliquids", "block/pink_lava_still"),
                        new Identifier("dyeableliquids", "block/pink_lava_flow")
                )
        );
    }
}