package com.oimogenius.arrowblockdeployer.item.entity;

import com.oimogenius.arrowblockdeployer.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;

public class BlockShotArrow extends Arrow {

    public BlockShotArrow(Level pLevel, LivingEntity pShooter) {
        super(pLevel, pShooter);
    }

    @Override
    protected ItemStack getPickupItem() {
        return new ItemStack(ModItems.BLOCKSHOT_ARROW.get());
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        super.onHitBlock(pResult);
        BlockPos hitPos = pResult.getBlockPos();
        Direction direction = pResult.getDirection();
        BlockPos targetPos = hitPos.relative(direction, 1);
        this.level().setBlockAndUpdate(targetPos, Blocks.TNT.defaultBlockState());
    }
}
