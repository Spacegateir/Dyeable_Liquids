package net.spacegateir.dyeableliquids.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.spacegateir.dyeableliquids.items.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.WHITE_LAVA_BUCKET, 20000);
        registry.add(ModItems.ORANGE_LAVA_BUCKET, 20000);
        registry.add(ModItems.MAGENTA_LAVA_BUCKET, 20000);
        registry.add(ModItems.LIGHT_BLUE_LAVA_BUCKET, 20000);
        registry.add(ModItems.YELLOW_LAVA_BUCKET, 20000);
        registry.add(ModItems.LIME_LAVA_BUCKET, 20000);
        registry.add(ModItems.PINK_LAVA_BUCKET, 20000);
        registry.add(ModItems.GRAY_LAVA_BUCKET, 20000);
        registry.add(ModItems.LIGHT_GRAY_LAVA_BUCKET, 20000);
        registry.add(ModItems.CYAN_LAVA_BUCKET, 20000);
        registry.add(ModItems.PURPLE_LAVA_BUCKET, 20000);
        registry.add(ModItems.BLUE_LAVA_BUCKET, 20000);
        registry.add(ModItems.BROWN_LAVA_BUCKET, 20000);
        registry.add(ModItems.GREEN_LAVA_BUCKET, 20000);
        registry.add(ModItems.RED_LAVA_BUCKET, 20000);
        registry.add(ModItems.BLACK_LAVA_BUCKET, 20000);

    }
}