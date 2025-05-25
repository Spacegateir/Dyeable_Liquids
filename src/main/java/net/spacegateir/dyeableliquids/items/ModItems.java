package net.spacegateir.dyeableliquids.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spacegateir.dyeableliquids.DyeableLiquids;
import net.spacegateir.dyeableliquids.fluid.ModFluids;

public class ModItems {

    public static final Item SOAP_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
            "soap_water_bucket"), new BucketItem(ModFluids.STILL_SOAP_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DyeableLiquids.LOGGER.info("Registering Mod Items for " + DyeableLiquids.MOD_ID);

    }
}