package com.oimogenius.arrowblockdeployer.item.entity;

import com.oimogenius.arrowblockdeployer.block.ABDBlocks;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class GlowingDirtAttachedArrow extends AbstractBlockShotArrow {
    public GlowingDirtAttachedArrow(Level pLevel, LivingEntity pShooter, Item item) {
        super(pLevel, pShooter, ABDBlocks.GLOWING_DIRT.get(), item);
    }
}
