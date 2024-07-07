package com.oimogenius.arrowblockdeployer.item.entity;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

public class TNTAttachedArrow extends AbstractBlockShotArrow {
    public TNTAttachedArrow(Level pLevel, LivingEntity pShooter, Item item) {
        super(pLevel, pShooter, Blocks.TNT, item);
    }
}
