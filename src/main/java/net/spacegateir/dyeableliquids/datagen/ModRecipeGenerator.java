package net.spacegateir.dyeableliquids.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.spacegateir.dyeableliquids.items.ModItems;

import java.util.Map;
import java.util.function.Consumer;

import static java.util.Map.entry;

public class ModRecipeGenerator extends FabricRecipeProvider {

    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        // Lava Bucket Outputs
        Map<String, Item> dyeToLavaBucket = Map.ofEntries(
                entry("white", ModItems.WHITE_LAVA_BUCKET),
                entry("orange", ModItems.ORANGE_LAVA_BUCKET),
                entry("magenta", ModItems.MAGENTA_LAVA_BUCKET),
                entry("light_blue", ModItems.LIGHT_BLUE_LAVA_BUCKET),
                entry("yellow", ModItems.YELLOW_LAVA_BUCKET),
                entry("lime", ModItems.LIME_LAVA_BUCKET),
                entry("pink", ModItems.PINK_LAVA_BUCKET),
                entry("gray", ModItems.GRAY_LAVA_BUCKET),
                entry("light_gray", ModItems.LIGHT_GRAY_LAVA_BUCKET),
                entry("cyan", ModItems.CYAN_LAVA_BUCKET),
                entry("purple", ModItems.PURPLE_LAVA_BUCKET),
                entry("blue", ModItems.BLUE_LAVA_BUCKET),
                entry("brown", ModItems.BROWN_LAVA_BUCKET),
                entry("green", ModItems.GREEN_LAVA_BUCKET),
                entry("red", ModItems.RED_LAVA_BUCKET),
                entry("black", ModItems.BLACK_LAVA_BUCKET)
        );

        // Water Bucket Outputs
        Map<String, Item> dyeToWaterBucket = Map.ofEntries(
                entry("white", ModItems.WHITE_WATER_BUCKET),
                entry("orange", ModItems.ORANGE_WATER_BUCKET),
                entry("magenta", ModItems.MAGENTA_WATER_BUCKET),
                entry("light_blue", ModItems.LIGHT_BLUE_WATER_BUCKET),
                entry("yellow", ModItems.YELLOW_WATER_BUCKET),
                entry("lime", ModItems.LIME_WATER_BUCKET),
                entry("pink", ModItems.PINK_WATER_BUCKET),
                entry("gray", ModItems.GRAY_WATER_BUCKET),
                entry("light_gray", ModItems.LIGHT_GRAY_WATER_BUCKET),
                entry("cyan", ModItems.CYAN_WATER_BUCKET),
                entry("purple", ModItems.PURPLE_WATER_BUCKET),
                entry("blue", ModItems.BLUE_WATER_BUCKET),
                entry("brown", ModItems.BROWN_WATER_BUCKET),
                entry("green", ModItems.GREEN_WATER_BUCKET),
                entry("red", ModItems.RED_WATER_BUCKET),
                entry("black", ModItems.BLACK_WATER_BUCKET)
        );

        // Dye Inputs
        Map<String, Item> dyeItems = Map.ofEntries(
                entry("white", Items.WHITE_DYE),
                entry("orange", Items.ORANGE_DYE),
                entry("magenta", Items.MAGENTA_DYE),
                entry("light_blue", Items.LIGHT_BLUE_DYE),
                entry("yellow", Items.YELLOW_DYE),
                entry("lime", Items.LIME_DYE),
                entry("pink", Items.PINK_DYE),
                entry("gray", Items.GRAY_DYE),
                entry("light_gray", Items.LIGHT_GRAY_DYE),
                entry("cyan", Items.CYAN_DYE),
                entry("purple", Items.PURPLE_DYE),
                entry("blue", Items.BLUE_DYE),
                entry("brown", Items.BROWN_DYE),
                entry("green", Items.GREEN_DYE),
                entry("red", Items.RED_DYE),
                entry("black", Items.BLACK_DYE)
        );

        // Lava Recipes
        dyeToLavaBucket.forEach((color, bucketItem) -> {
            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, bucketItem)
                    .input(Items.LAVA_BUCKET)
                    .input(dyeItems.get(color))
                    .criterion("has_lava_bucket", conditionsFromItem(Items.LAVA_BUCKET))
                    .criterion("has_dye", conditionsFromItem(dyeItems.get(color)))
                    .offerTo(consumer, new Identifier("dyeableliquids", color + "_lava_bucket"));
        });

        // Water Recipes
        dyeToWaterBucket.forEach((color, bucketItem) -> {
            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, bucketItem)
                    .input(Items.WATER_BUCKET)
                    .input(Items.BUCKET)
                    .input(dyeItems.get(color))
                    .criterion("has_water_bucket", conditionsFromItem(Items.WATER_BUCKET))
                    .criterion("has_dye", conditionsFromItem(dyeItems.get(color)))
                    .offerTo(consumer, new Identifier("dyeableliquids", color + "_water_bucket"));
        });

        // Lava Bucket Smithing Recipes
        dyeToLavaBucket.forEach((color, bucketItem) -> {
            SmithingTransformRecipeJsonBuilder.create(
                            Ingredient.ofItems(Items.LAVA_BUCKET),                           // base item
                            Ingredient.ofItems(dyeItems.get(color)),                         // addition (dye)
                            Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),   // template (none)
                            RecipeCategory.MISC,
                            bucketItem
                    )
                    .criterion("has_lava_bucket", conditionsFromItem(Items.LAVA_BUCKET))
                    .criterion("has_dye", conditionsFromItem(dyeItems.get(color)))
                    .offerTo(consumer, new Identifier("dyeableliquids", color + "_lava_bucket_smithing"));
        });

        // Water Bucket Smithing Recipes
        dyeToWaterBucket.forEach((color, bucketItem) -> {
            SmithingTransformRecipeJsonBuilder.create(
                            Ingredient.ofItems(Items.WATER_BUCKET),                          // base item
                            Ingredient.ofItems(dyeItems.get(color)),                         // addition (dye)
                            Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),   // template (none)
                            RecipeCategory.MISC,
                            bucketItem
                    )
                    .criterion("has_water_bucket", conditionsFromItem(Items.WATER_BUCKET))
                    .criterion("has_dye", conditionsFromItem(dyeItems.get(color)))
                    .offerTo(consumer, new Identifier("dyeableliquids", color + "_water_bucket_smithing"));
        });
    }
}
