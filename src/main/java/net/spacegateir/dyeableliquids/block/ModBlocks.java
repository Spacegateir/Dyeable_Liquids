package net.spacegateir.dyeableliquids.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spacegateir.dyeableliquids.DyeableLiquids;
import net.spacegateir.dyeableliquids.block.cauldronblocks.*;

import static net.minecraft.block.Blocks.CAULDRON;

public class ModBlocks {


    // WHITE
    public static final Block WHITE_LAVA_CAULDRON_BLOCK = registerBlock("white_lava_cauldron_block",
            new WhiteLavaCauldronBlock(AbstractBlock.Settings.copy(CAULDRON).luminance(state -> 15)));
    public static final Block WHITE_WATER_CAULDRON_BLOCK = registerBlock("white_water_cauldron_block",
            new WhiteWaterCauldronBlock(AbstractBlock.Settings.copy(CAULDRON)));

    // ORANGE
    public static final Block ORANGE_LAVA_CAULDRON_BLOCK = registerBlock("orange_lava_cauldron_block",
            new OrangeLavaCauldronBlock(AbstractBlock.Settings.copy(CAULDRON).luminance(state -> 15)));
    public static final Block ORANGE_WATER_CAULDRON_BLOCK = registerBlock("orange_water_cauldron_block",
            new OrangeWaterCauldronBlock(AbstractBlock.Settings.copy(CAULDRON)));

    // MAGENTA
    public static final Block MAGENTA_LAVA_CAULDRON_BLOCK = registerBlock("magenta_lava_cauldron_block",
            new MagentaLavaCauldronBlock(AbstractBlock.Settings.copy(CAULDRON).luminance(state -> 15)));
    public static final Block MAGENTA_WATER_CAULDRON_BLOCK = registerBlock("magenta_water_cauldron_block",
            new MagentaWaterCauldronBlock(AbstractBlock.Settings.copy(CAULDRON)));

    // LIGHT BLUE
    public static final Block LIGHT_BLUE_LAVA_CAULDRON_BLOCK = registerBlock("light_blue_lava_cauldron_block",
            new LightBlueLavaCauldronBlock(AbstractBlock.Settings.copy(CAULDRON).luminance(state -> 15)));
    public static final Block LIGHT_BLUE_WATER_CAULDRON_BLOCK = registerBlock("light_blue_water_cauldron_block",
            new LightBlueWaterCauldronBlock(AbstractBlock.Settings.copy(CAULDRON)));

    // YELLOW
    public static final Block YELLOW_LAVA_CAULDRON_BLOCK = registerBlock("yellow_lava_cauldron_block",
            new YellowLavaCauldronBlock(AbstractBlock.Settings.copy(CAULDRON).luminance(state -> 15)));
    public static final Block YELLOW_WATER_CAULDRON_BLOCK = registerBlock("yellow_water_cauldron_block",
            new YellowWaterCauldronBlock(AbstractBlock.Settings.copy(CAULDRON)));

    // LIME
    public static final Block LIME_LAVA_CAULDRON_BLOCK = registerBlock("lime_lava_cauldron_block",
            new LimeLavaCauldronBlock(AbstractBlock.Settings.copy(CAULDRON).luminance(state -> 15)));
    public static final Block LIME_WATER_CAULDRON_BLOCK = registerBlock("lime_water_cauldron_block",
            new LimeWaterCauldronBlock(AbstractBlock.Settings.copy(CAULDRON)));

    // PINK
    public static final Block PINK_LAVA_CAULDRON_BLOCK = registerBlock("pink_lava_cauldron_block",
            new PinkLavaCauldronBlock(AbstractBlock.Settings.copy(CAULDRON).luminance(state -> 15)));
    public static final Block PINK_WATER_CAULDRON_BLOCK = registerBlock("pink_water_cauldron_block",
            new PinkWaterCauldronBlock(AbstractBlock.Settings.copy(CAULDRON)));

    // GRAY
    public static final Block GRAY_LAVA_CAULDRON_BLOCK = registerBlock("gray_lava_cauldron_block",
            new GrayLavaCauldronBlock(AbstractBlock.Settings.copy(CAULDRON).luminance(state -> 15)));
    public static final Block GRAY_WATER_CAULDRON_BLOCK = registerBlock("gray_water_cauldron_block",
            new GrayWaterCauldronBlock(AbstractBlock.Settings.copy(CAULDRON)));

    // LIGHT GRAY
    public static final Block LIGHT_GRAY_LAVA_CAULDRON_BLOCK = registerBlock("light_gray_lava_cauldron_block",
            new LightGrayLavaCauldronBlock(AbstractBlock.Settings.copy(CAULDRON).luminance(state -> 15)));
    public static final Block LIGHT_GRAY_WATER_CAULDRON_BLOCK = registerBlock("light_gray_water_cauldron_block",
            new LightGrayWaterCauldronBlock(AbstractBlock.Settings.copy(CAULDRON)));

    // CYAN
    public static final Block CYAN_LAVA_CAULDRON_BLOCK = registerBlock("cyan_lava_cauldron_block",
            new CyanLavaCauldronBlock(AbstractBlock.Settings.copy(CAULDRON).luminance(state -> 15)));
    public static final Block CYAN_WATER_CAULDRON_BLOCK = registerBlock("cyan_water_cauldron_block",
            new CyanWaterCauldronBlock(AbstractBlock.Settings.copy(CAULDRON)));

    // PURPLE
    public static final Block PURPLE_LAVA_CAULDRON_BLOCK = registerBlock("purple_lava_cauldron_block",
            new PurpleLavaCauldronBlock(AbstractBlock.Settings.copy(CAULDRON).luminance(state -> 15)));
    public static final Block PURPLE_WATER_CAULDRON_BLOCK = registerBlock("purple_water_cauldron_block",
            new PurpleWaterCauldronBlock(AbstractBlock.Settings.copy(CAULDRON)));

    // BLUE
    public static final Block BLUE_LAVA_CAULDRON_BLOCK = registerBlock("blue_lava_cauldron_block",
            new BlueLavaCauldronBlock(AbstractBlock.Settings.copy(CAULDRON).luminance(state -> 15)));
    public static final Block BLUE_WATER_CAULDRON_BLOCK = registerBlock("blue_water_cauldron_block",
            new BlueWaterCauldronBlock(AbstractBlock.Settings.copy(CAULDRON)));

    // BROWN
    public static final Block BROWN_LAVA_CAULDRON_BLOCK = registerBlock("brown_lava_cauldron_block",
            new BrownLavaCauldronBlock(AbstractBlock.Settings.copy(CAULDRON).luminance(state -> 15)));
    public static final Block BROWN_WATER_CAULDRON_BLOCK = registerBlock("brown_water_cauldron_block",
            new BrownWaterCauldronBlock(AbstractBlock.Settings.copy(CAULDRON)));

    // GREEN
    public static final Block GREEN_LAVA_CAULDRON_BLOCK = registerBlock("green_lava_cauldron_block",
            new GreenLavaCauldronBlock(AbstractBlock.Settings.copy(CAULDRON).luminance(state -> 15)));
    public static final Block GREEN_WATER_CAULDRON_BLOCK = registerBlock("green_water_cauldron_block",
            new GreenWaterCauldronBlock(AbstractBlock.Settings.copy(CAULDRON)));

    // RED
    public static final Block RED_LAVA_CAULDRON_BLOCK = registerBlock("red_lava_cauldron_block",
            new RedLavaCauldronBlock(AbstractBlock.Settings.copy(CAULDRON).luminance(state -> 15)));
    public static final Block RED_WATER_CAULDRON_BLOCK = registerBlock("red_water_cauldron_block",
            new RedWaterCauldronBlock(AbstractBlock.Settings.copy(CAULDRON)));

    // BLACK
    public static final Block BLACK_LAVA_CAULDRON_BLOCK = registerBlock("black_lava_cauldron_block",
            new BlackLavaCauldronBlock(AbstractBlock.Settings.copy(CAULDRON).luminance(state -> 15)));
    public static final Block BLACK_WATER_CAULDRON_BLOCK = registerBlock("black_water_cauldron_block",
            new BlackWaterCauldronBlock(AbstractBlock.Settings.copy(CAULDRON)));












    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(DyeableLiquids.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        DyeableLiquids.LOGGER.info("Registering ModBlocks for " + DyeableLiquids.MOD_ID);
    }
}