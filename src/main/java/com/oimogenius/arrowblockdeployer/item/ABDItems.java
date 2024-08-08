package com.oimogenius.arrowblockdeployer.item;

import com.oimogenius.arrowblockdeployer.ArrowBlockDeployer;
import com.oimogenius.arrowblockdeployer.item.custom.BlockLauncherArrowItem;
import com.oimogenius.arrowblockdeployer.item.custom.BlockLauncherBowItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ABDItems {
    // レジストリを作成
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            ArrowBlockDeployer.MOD_ID);

    // レジストリにアイテムを追加
    public static final RegistryObject<Item> BLOCK_LAUNCHER_BOW = ITEMS.register("block_launcher_bow",
            () -> new BlockLauncherBowItem(new Item.Properties().durability(384)));
    public static final RegistryObject<Item> GLOW_BERRY_ATTACHED_ARROW = ITEMS.register(
            "glow_berry_attached_arrow",
            () -> new BlockLauncherArrowItem(new Item.Properties(), BlockLauncherArrowItem.Type.GLOW_BERRY));
    public static final RegistryObject<Item> GLOWING_DIRT_ATTACHED_ARROW = ITEMS.register(
            "glowing_dirt_attached_arrow",
            () -> new BlockLauncherArrowItem(new Item.Properties(), BlockLauncherArrowItem.Type.GLOWING_DIRT));
    public static final RegistryObject<Item> TNT_ATTACHED_ARROW = ITEMS.register(
            "tnt_attached_arrow",
            () -> new BlockLauncherArrowItem(new Item.Properties(), BlockLauncherArrowItem.Type.TNT));
    public static final RegistryObject<Item> TORCH_ATTACHED_ARROW = ITEMS.register(
            "torch_attached_arrow",
            () -> new BlockLauncherArrowItem(new Item.Properties(), BlockLauncherArrowItem.Type.TORCH));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
