package com.oimogenius.arrowblockdeployer.event;

import com.oimogenius.arrowblockdeployer.ArrowBlockDeployer;
import com.oimogenius.arrowblockdeployer.item.entity.BlockShotArrow;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.level.ExplosionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = ArrowBlockDeployer.MOD_ID)
public class ModEvent {
    @SubscribeEvent
    public static void explosionEventHandler(ExplosionEvent.Detonate event) {
        List<Entity> affectedEntities = event.getAffectedEntities();
        for (Entity entity : affectedEntities) {
            if (entity instanceof BlockShotArrow) {
                entity.discard();
            }
        }
    }
}
