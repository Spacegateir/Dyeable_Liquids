package net.spacegateir.dyeableliquids.creative_tab;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.spacegateir.dyeableliquids.DyeableLiquids;
import net.spacegateir.dyeableliquids.items.ModItems;

public class ModItemGroups {

    public static final ItemGroup DYEABLE_LIQUIDS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DyeableLiquids.MOD_ID,"dyeableliquids"),
            FabricItemGroup.builder().displayName(Text.translatable("Dyeable Liquids"))
                    .icon(() -> new ItemStack(ModItems.SOAP_WATER_BUCKET)).entries((displayContext, entries) -> {

                        entries.add(ModItems.SOAP_WATER_BUCKET);

                        entries.add(ModItems.WHITE_WATER_BUCKET);
                        entries.add(ModItems.LIGHT_GRAY_WATER_BUCKET);
                        entries.add(ModItems.GRAY_WATER_BUCKET);
                        entries.add(ModItems.BLACK_WATER_BUCKET);
                        entries.add(ModItems.BROWN_WATER_BUCKET);
                        entries.add(ModItems.RED_WATER_BUCKET);
                        entries.add(ModItems.ORANGE_WATER_BUCKET);
                        entries.add(ModItems.YELLOW_WATER_BUCKET);
                        entries.add(ModItems.LIME_WATER_BUCKET);
                        entries.add(ModItems.GREEN_WATER_BUCKET);
                        entries.add(ModItems.CYAN_WATER_BUCKET);
                        entries.add(ModItems.LIGHT_BLUE_WATER_BUCKET);
                        entries.add(ModItems.BLUE_WATER_BUCKET);
                        entries.add(ModItems.PURPLE_WATER_BUCKET);
                        entries.add(ModItems.MAGENTA_WATER_BUCKET);
                        entries.add(ModItems.PINK_WATER_BUCKET);

                        entries.add(ModItems.WHITE_LAVA_BUCKET);
                        entries.add(ModItems.LIGHT_GRAY_LAVA_BUCKET);
                        entries.add(ModItems.GRAY_LAVA_BUCKET);
                        entries.add(ModItems.BLACK_LAVA_BUCKET);
                        entries.add(ModItems.BROWN_LAVA_BUCKET);
                        entries.add(ModItems.RED_LAVA_BUCKET);
                        entries.add(ModItems.ORANGE_LAVA_BUCKET);
                        entries.add(ModItems.YELLOW_LAVA_BUCKET);
                        entries.add(ModItems.LIME_LAVA_BUCKET);
                        entries.add(ModItems.GREEN_LAVA_BUCKET);
                        entries.add(ModItems.CYAN_LAVA_BUCKET);
                        entries.add(ModItems.LIGHT_BLUE_LAVA_BUCKET);
                        entries.add(ModItems.BLUE_LAVA_BUCKET);
                        entries.add(ModItems.PURPLE_LAVA_BUCKET);
                        entries.add(ModItems.MAGENTA_LAVA_BUCKET);
                        entries.add(ModItems.PINK_LAVA_BUCKET);




                    }).build());

    public static void registerItemGroups() {
        DyeableLiquids.LOGGER.info("registering Fluid Groups for "+ DyeableLiquids.MOD_ID);
    }
}