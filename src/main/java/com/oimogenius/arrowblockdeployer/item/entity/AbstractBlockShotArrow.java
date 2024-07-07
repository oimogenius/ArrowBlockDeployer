package com.oimogenius.arrowblockdeployer.item.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.BlockHitResult;

public abstract class AbstractBlockShotArrow extends Arrow {
    protected final Block BLOCK_ATTACHED;

    public AbstractBlockShotArrow(Level pLevel, LivingEntity pShooter, Block blockAttached) {
        super(pLevel, pShooter);
        BLOCK_ATTACHED = blockAttached;
    }

    @Override
    protected ItemStack getPickupItem() {
        return new ItemStack(this.BLOCK_ATTACHED);
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        super.onHitBlock(pResult);
        BlockPos hitPos = pResult.getBlockPos();
        Direction direction = pResult.getDirection();
        BlockPos targetPos = hitPos.relative(direction, 1);
        if (BLOCK_ATTACHED.defaultBlockState().canSurvive(level(), targetPos)) {
            this.level().setBlockAndUpdate(targetPos, BLOCK_ATTACHED.defaultBlockState());
            // ブロックが設置できた場合、矢は消滅する
            this.discard();
        }
    }
}
