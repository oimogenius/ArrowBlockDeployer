package com.oimogenius.arrowblockdeployer.item;

import com.oimogenius.arrowblockdeployer.ArrowBlockDeployer;
import com.oimogenius.arrowblockdeployer.item.custom.BlockShotArrowItem;
import com.oimogenius.arrowblockdeployer.item.custom.BlockShotBowItem;
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
    // TODO: ブロックを添付した矢の追加
    public static final RegistryObject<Item> BLOCKSHOT_BOW = ITEMS.register("blockshot_bow",
            () -> new BlockShotBowItem(new Item.Properties()));
    public static final RegistryObject<Item> GLOWBERRY_ATTACHED_ARROW = ITEMS.register(
            "glowberry_attached_arrow",
            () -> new BlockShotArrowItem(new Item.Properties(), BlockShotArrowItem.Type.GLOWBERRY));
    public static final RegistryObject<Item> GLOWING_DIRT_ATTACHED_ARROW = ITEMS.register(
            "glowing_dirt_attached_arrow",
            () -> new BlockShotArrowItem(new Item.Properties(), BlockShotArrowItem.Type.GLOWING_DIRT));
    public static final RegistryObject<Item> TNT_ATTACHED_ARROW = ITEMS.register(
            "tnt_attached_arrow",
            () -> new BlockShotArrowItem(new Item.Properties(), BlockShotArrowItem.Type.TNT));
    public static final RegistryObject<Item> TORCH_ATTACHED_ARROW = ITEMS.register(
            "torch_attached_arrow",
            () -> new BlockShotArrowItem(new Item.Properties(), BlockShotArrowItem.Type.TORCH));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
