package com.oimogenius.arrowblockdeployer.item.custom;

import com.oimogenius.arrowblockdeployer.item.ABDItems;
import com.oimogenius.arrowblockdeployer.item.entity.GlowBerryAttachedArrow;
import com.oimogenius.arrowblockdeployer.item.entity.GlowingDirtAttachedArrow;
import com.oimogenius.arrowblockdeployer.item.entity.TNTAttachedArrow;
import com.oimogenius.arrowblockdeployer.item.entity.TorchAttachedArrow;
import jdk.jshell.spi.ExecutionControl;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BlockLauncherArrowItem extends ArrowItem {
    private final Type type;

    public BlockLauncherArrowItem(Properties pProperties, Type pType) {
        super(pProperties);
        this.type = pType;
    }

    @Override
    public AbstractArrow createArrow(Level pLevel, ItemStack pStack, LivingEntity pShooter) {
        Arrow arrow = switch (this.type) {
            case GLOW_BERRY -> new GlowBerryAttachedArrow(pLevel, pShooter,
                    ABDItems.GLOW_BERRY_ATTACHED_ARROW.get());
            case GLOWING_DIRT -> new GlowingDirtAttachedArrow(pLevel, pShooter,
                    ABDItems.GLOWING_DIRT_ATTACHED_ARROW.get());
            case TNT -> new TNTAttachedArrow(pLevel, pShooter,
                    ABDItems.TNT_ATTACHED_ARROW.get());
            case TORCH -> new TorchAttachedArrow(pLevel, pShooter,
                    ABDItems.TORCH_ATTACHED_ARROW.get());
            default -> {
                try {
                    throw new ExecutionControl.NotImplementedException("There is no applicable" +
                            " BlockLauncherArrow");
                } catch (ExecutionControl.NotImplementedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        arrow.setEffectsFromItem(pStack);
        return arrow;
    }

    @Override
    public boolean isInfinite(ItemStack stack, ItemStack bow, Player player) {
        return false;
    }

    public enum Type {
        GLOW_BERRY,
        TNT,
        GLOWING_DIRT,
        TORCH
    }
}
