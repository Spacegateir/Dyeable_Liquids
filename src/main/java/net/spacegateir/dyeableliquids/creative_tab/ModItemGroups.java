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
            new Identifier(DyeableLiquids.MOD_ID,"dyeable_liquids"),
            FabricItemGroup.builder().displayName(Text.translatable("Dyeable Liquids"))
                    .icon(() -> new ItemStack(ModItems.SOAP_WATER_BUCKET)).entries((displayContext, entries) -> {

                        entries.add(ModItems.SOAP_WATER_BUCKET);


                    }).build());

    public static void registerItemGroups() {
        DyeableLiquids.LOGGER.info("registering Fluid Groups for "+ DyeableLiquids.MOD_ID);
    }
}