package com.oimogenius.arrowblockdeployer.item.custom;

import com.oimogenius.arrowblockdeployer.item.entity.AbstractBlockShotArrow;
import com.oimogenius.arrowblockdeployer.item.entity.GlowBerryAttachedArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BlockShotArrowItem extends ArrowItem {
    public BlockShotArrowItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public AbstractArrow createArrow(Level pLevel, ItemStack pStack, LivingEntity pShooter) {
        Arrow arrow = new GlowBerryAttachedArrow(pLevel, pShooter);
        arrow.setEffectsFromItem(pStack);
        return arrow;
    }
}
