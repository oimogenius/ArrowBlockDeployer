package com.oimogenius.arrowblockdeployer.item.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public abstract class AbstractBlockShotArrow extends Arrow {
    protected final Block blockAttached;
    protected final Item pickUpItem;

    public AbstractBlockShotArrow(Level pLevel, LivingEntity pShooter, Block pBlockAttached, Item pPickUpItem) {
        super(pLevel, pShooter);
        this.blockAttached = pBlockAttached;
        this.pickUpItem = pPickUpItem;
    }

    @Override
    protected ItemStack getPickupItem() {
        return new ItemStack(this.pickUpItem);
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        super.onHitBlock(pResult);
        placeBlock(pResult);
    }

    protected void placeBlock(BlockHitResult pResult) {
        BlockPos hitPos = pResult.getBlockPos();
        Direction direction = pResult.getDirection();
        BlockPos targetPos = hitPos.relative(direction, 1);
        BlockState state = blockAttached.defaultBlockState();
        if (state.canSurvive(level(), targetPos)) {
            this.level().setBlockAndUpdate(targetPos, state);
            // ブロックが設置できた場合、矢は消滅する
            this.discard();
        }
    }
}
