package com.oimogenius.arrowblockdeployer;

import com.oimogenius.arrowblockdeployer.block.ABDBlocks;
import com.oimogenius.arrowblockdeployer.item.ABDItems;
import com.oimogenius.arrowblockdeployer.item.ABDTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ArrowBlockDeployer.MOD_ID)
public class ArrowBlockDeployer {
    public static final String MOD_ID = "arrowblockdeployer";

    public ArrowBlockDeployer() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // レジストリ
        ABDItems.register(modEventBus);
        ABDTabs.register(modEventBus);
        ABDBlocks.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
