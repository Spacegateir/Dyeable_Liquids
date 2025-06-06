package net.spacegateir.dyeableliquids.block.cauldronblocks;

import net.minecraft.block.AbstractCauldronBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.spacegateir.dyeableliquids.util.interactions.ModCauldronInteractions;

public class BlueLavaCauldronBlock extends AbstractCauldronBlock {

    public BlueLavaCauldronBlock(Settings settings) {
        super(settings, ModCauldronInteractions.BLUE_LAVA_CAULDRON_BEHAVIOR);
    }

    @Override
    protected double getFluidHeight(BlockState state) {
        return 0.9375;
    }

    @Override
    public boolean isFull(BlockState state) {
        return true;
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (this.isEntityTouchingFluid(state, pos, entity)) {
            entity.setOnFireFromLava();
        }
    }

    @Override
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return 3;
    }
}