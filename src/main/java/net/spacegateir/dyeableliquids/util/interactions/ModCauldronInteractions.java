package net.spacegateir.dyeableliquids.util.interactions;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeveledCauldronBlock;
import net.minecraft.block.cauldron.CauldronBehavior;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.spacegateir.dyeableliquids.block.ModBlocks;
import net.spacegateir.dyeableliquids.items.ModItems;

import java.util.Map;

public class ModCauldronInteractions implements CauldronBehavior {

    public static final Map<Item, CauldronBehavior> WHITE_LAVA_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> WHITE_WATER_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> ORANGE_LAVA_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> ORANGE_WATER_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> MAGENTA_LAVA_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> MAGENTA_WATER_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> LIGHT_BLUE_LAVA_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> LIGHT_BLUE_WATER_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> YELLOW_LAVA_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> YELLOW_WATER_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> LIME_LAVA_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> LIME_WATER_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> PINK_LAVA_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> PINK_WATER_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> GRAY_LAVA_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> GRAY_WATER_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> LIGHT_GRAY_LAVA_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> LIGHT_GRAY_WATER_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> CYAN_LAVA_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> CYAN_WATER_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> PURPLE_LAVA_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> PURPLE_WATER_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> BLUE_LAVA_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> BLUE_WATER_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> BROWN_LAVA_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> BROWN_WATER_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> GREEN_LAVA_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> GREEN_WATER_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> RED_LAVA_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> RED_WATER_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> BLACK_LAVA_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();
    public static final Map<Item, CauldronBehavior> BLACK_WATER_CAULDRON_BEHAVIOR = CauldronBehavior.createMap();


    @Override
    public ActionResult interact(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, ItemStack stack) {
        return null;
    }

    public static void boostrap() {
        String[] colors = {
                "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink",
                "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
        };

        for (String color : colors) {
            final String lavaBucketName = color.toUpperCase() + "_LAVA_BUCKET";
            final String waterBucketName = color.toUpperCase() + "_WATER_BUCKET";
            final String lavaCauldronBlockName = color.toUpperCase() + "_LAVA_CAULDRON_BLOCK";
            final String waterCauldronBlockName = color.toUpperCase() + "_WATER_CAULDRON_BLOCK";

            try {
                Item lavaBucket = (Item) ModItems.class.getField(lavaBucketName).get(null);
                Item waterBucket = (Item) ModItems.class.getField(waterBucketName).get(null);

                BlockState lavaCauldron = ((net.minecraft.block.Block) ModBlocks.class.getField(lavaCauldronBlockName).get(null)).getDefaultState();
                BlockState waterCauldron = ((net.minecraft.block.Block) ModBlocks.class.getField(waterCauldronBlockName).get(null)).getDefaultState();

                EMPTY_CAULDRON_BEHAVIOR.put(lavaBucket, (state, world, pos, player, hand, stack) ->
                        CauldronBehavior.fillCauldron(world, pos, player, hand, stack, lavaCauldron, SoundEvents.ITEM_BUCKET_EMPTY_LAVA));

                EMPTY_CAULDRON_BEHAVIOR.put(waterBucket, (state, world, pos, player, hand, stack) ->
                        CauldronBehavior.fillCauldron(world, pos, player, hand, stack, waterCauldron, SoundEvents.ITEM_BUCKET_EMPTY));

                CauldronBehavior lavaBehavior = (state, world, pos, player, hand, stack) ->
                        CauldronBehavior.emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(lavaBucket), s -> true, SoundEvents.ITEM_BUCKET_FILL_LAVA);

                CauldronBehavior waterBehavior = (state, world, pos, player, hand, stack) ->
                        CauldronBehavior.emptyCauldron(state, world, pos, player, hand, stack, new ItemStack(waterBucket), s -> true, SoundEvents.ITEM_BUCKET_FILL);

                ModCauldronInteractions.class.getField(color.toUpperCase() + "_LAVA_CAULDRON_BEHAVIOR").get(null)
                        .getClass().getMethod("put", Object.class, Object.class).invoke(
                                ModCauldronInteractions.class.getField(color.toUpperCase() + "_LAVA_CAULDRON_BEHAVIOR").get(null), Items.BUCKET, lavaBehavior);

                ModCauldronInteractions.class.getField(color.toUpperCase() + "_WATER_CAULDRON_BEHAVIOR").get(null)
                        .getClass().getMethod("put", Object.class, Object.class).invoke(
                                ModCauldronInteractions.class.getField(color.toUpperCase() + "_WATER_CAULDRON_BEHAVIOR").get(null), Items.BUCKET, waterBehavior);

            } catch (Exception e) {
                System.err.println("Failed to register cauldron behavior for color: " + color);
                e.printStackTrace();
            }
        }
    }
}