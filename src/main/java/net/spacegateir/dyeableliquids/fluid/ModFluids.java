package net.spacegateir.dyeableliquids.fluid;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spacegateir.dyeableliquids.DyeableLiquids;

public class ModFluids {

    public static final FlowableFluid STILL_SOAP_WATER = Registry.register(Registries.FLUID,
            new Identifier(DyeableLiquids.MOD_ID, "soap_water"), new SoapWaterFluid.Still());
    public static final FlowableFluid FLOWING_SOAP_WATER = Registry.register(Registries.FLUID,
            new Identifier(DyeableLiquids.MOD_ID, "flowing_soap_water"), new SoapWaterFluid.Flowing());

    public static final Block SOAP_WATER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(DyeableLiquids.MOD_ID,
            "soap_water_block"), new FluidBlock(ModFluids.STILL_SOAP_WATER, FabricBlockSettings.copyOf(Blocks.WATER)
            .replaceable().liquid()));
//    public static final Item SOAP_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(DyeableLiquids.MOD_ID,
//            "soap_water_bucket"), new BucketItem(ModFluids.STILL_SOAP_WATER,
//            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static void registerFluids() {
        DyeableLiquids.LOGGER.info("Registering Fluid for " + DyeableLiquids.MOD_ID);
    }
}
