package com.oimogenius.arrowblockdeployer.item.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.util.Objects;

public class TorchAttachedArrow extends AbstractBlockShotArrow {
    public TorchAttachedArrow(Level pLevel, LivingEntity pShooter, Item pPickUpItem) {
        super(pLevel, pShooter, Blocks.TORCH, pPickUpItem);
    }

    @Override
    protected void placeBlock(BlockHitResult pResult) {
        super.placeBlock(pResult);
        BlockPos hitPos = pResult.getBlockPos();
        Direction direction = pResult.getDirection();
        BlockPos targetPos = hitPos.relative(direction, 1);
        BlockState state = blockAttached.defaultBlockState();
        if (this.getOwner() instanceof Player player) {
            if (direction != Direction.DOWN) {
                state = Objects.requireNonNullElse(Blocks.WALL_TORCH.getStateForPlacement(
                        new BlockPlaceContext(player, InteractionHand.MAIN_HAND,
                                new ItemStack(Blocks.WALL_TORCH), pResult)), state);
            }
            if (state.canSurvive(level(), targetPos)) {
                this.level().setBlockAndUpdate(targetPos, state);
                // ブロックが設置できた場合、矢は消滅する
                this.discard();
            }
        }
    }
}
