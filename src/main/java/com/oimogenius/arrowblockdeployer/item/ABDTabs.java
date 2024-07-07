package com.oimogenius.arrowblockdeployer.item;

import com.oimogenius.arrowblockdeployer.ArrowBlockDeployer;
import com.oimogenius.arrowblockdeployer.block.ABDBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ABDTabs {
    // レジストリを作成
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
                    ArrowBlockDeployer.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FOO =
            TABS.register("abd_tab",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("creative_tab:abd_tab"))
                            .icon(ABDItems.GLOWBERRY_ATTACHED_ARROW.get()::getDefaultInstance)
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ABDItems.BLOCKSHOT_BOW.get());
                                output.accept(ABDItems.GLOWBERRY_ATTACHED_ARROW.get());
                                output.accept(ABDItems.GLOWING_DIRT_ATTACHED_ARROW.get());
                                output.accept(ABDItems.TNT_ATTACHED_ARROW.get());
                                output.accept(ABDItems.TORCH_ATTACHED_ARROW.get());

                                output.accept(ABDBlocks.GLOWING_DIRT.get());
                            }).build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
