package com.oimogenius.arrowblockdeployer.item.entity;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

public class GlowBerryAttachedArrow extends AbstractBlockShotArrow {
    public GlowBerryAttachedArrow(Level pLevel, LivingEntity pShooter) {
        super(pLevel, pShooter, Blocks.CAVE_VINES);
    }
}
