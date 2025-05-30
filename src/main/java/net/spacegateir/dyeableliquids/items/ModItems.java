package net.spacegateir.dyeableliquids.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spacegateir.dyeableliquids.DyeableLiquids;
import net.spacegateir.dyeableliquids.fluid.ModFluids;

public class ModItems {

// Water

    public static final Item WHITE_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "white_water_bucket"), new BucketItem(ModFluids.STILL_WHITE_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item LIGHT_GRAY_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "light_gray_water_bucket"), new BucketItem(ModFluids.STILL_LIGHT_GRAY_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item GRAY_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "gray_water_bucket"), new BucketItem(ModFluids.STILL_GRAY_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item BLACK_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "black_water_bucket"), new BucketItem(ModFluids.STILL_BLACK_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item BROWN_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "brown_water_bucket"), new BucketItem(ModFluids.STILL_BROWN_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item RED_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "red_water_bucket"), new BucketItem(ModFluids.STILL_RED_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item ORANGE_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "orange_water_bucket"), new BucketItem(ModFluids.STILL_ORANGE_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item YELLOW_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "yellow_water_bucket"), new BucketItem(ModFluids.STILL_YELLOW_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item LIME_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "lime_water_bucket"), new BucketItem(ModFluids.STILL_LIME_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item GREEN_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "green_water_bucket"), new BucketItem(ModFluids.STILL_GREEN_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item CYAN_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "cyan_water_bucket"), new BucketItem(ModFluids.STILL_CYAN_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item LIGHT_BLUE_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "light_blue_water_bucket"), new BucketItem(ModFluids.STILL_LIGHT_BLUE_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item BLUE_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "blue_water_bucket"), new BucketItem(ModFluids.STILL_BLUE_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item PURPLE_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "purple_water_bucket"), new BucketItem(ModFluids.STILL_PURPLE_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item MAGENTA_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "magenta_water_bucket"), new BucketItem(ModFluids.STILL_MAGENTA_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item PINK_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "pink_water_bucket"), new BucketItem(ModFluids.STILL_PINK_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));




// Lava

    public static final Item WHITE_LAVA_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "white_lava_bucket"), new BucketItem(ModFluids.STILL_WHITE_LAVA,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item LIGHT_GRAY_LAVA_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "light_gray_lava_bucket"), new BucketItem(ModFluids.STILL_LIGHT_GRAY_LAVA,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item GRAY_LAVA_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "gray_lava_bucket"), new BucketItem(ModFluids.STILL_GRAY_LAVA,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item BLACK_LAVA_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "black_lava_bucket"), new BucketItem(ModFluids.STILL_BLACK_LAVA,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item BROWN_LAVA_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "brown_lava_bucket"), new BucketItem(ModFluids.STILL_BROWN_LAVA,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item RED_LAVA_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "red_lava_bucket"), new BucketItem(ModFluids.STILL_RED_LAVA,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item ORANGE_LAVA_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "orange_lava_bucket"), new BucketItem(ModFluids.STILL_ORANGE_LAVA,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item YELLOW_LAVA_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "yellow_lava_bucket"), new BucketItem(ModFluids.STILL_YELLOW_LAVA,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item LIME_LAVA_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "lime_lava_bucket"), new BucketItem(ModFluids.STILL_LIME_LAVA,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item GREEN_LAVA_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "green_lava_bucket"), new BucketItem(ModFluids.STILL_GREEN_LAVA,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item CYAN_LAVA_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "cyan_lava_bucket"), new BucketItem(ModFluids.STILL_CYAN_LAVA,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item LIGHT_BLUE_LAVA_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "light_blue_lava_bucket"), new BucketItem(ModFluids.STILL_LIGHT_BLUE_LAVA,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item BLUE_LAVA_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "blue_lava_bucket"), new BucketItem(ModFluids.STILL_BLUE_LAVA,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item PURPLE_LAVA_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "purple_lava_bucket"), new BucketItem(ModFluids.STILL_PURPLE_LAVA,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item MAGENTA_LAVA_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "magenta_lava_bucket"), new BucketItem(ModFluids.STILL_MAGENTA_LAVA,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item PINK_LAVA_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "pink_lava_bucket"), new BucketItem(ModFluids.STILL_PINK_LAVA,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));














    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DyeableLiquids.LOGGER.info("Registering Mod Items for " + DyeableLiquids.MOD_ID);

    }
}