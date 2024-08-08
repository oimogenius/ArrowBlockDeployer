package com.oimogenius.arrowblockdeployer.datagen.client;

import com.oimogenius.arrowblockdeployer.ArrowBlockDeployer;
import com.oimogenius.arrowblockdeployer.item.ABDItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ABDItemModelProvider extends ItemModelProvider {
    public ABDItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ArrowBlockDeployer.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ABDItems.BLOCK_LAUNCHER_BOW.get());
        basicItem(ABDItems.GLOW_BERRY_ATTACHED_ARROW.get());
        basicItem(ABDItems.GLOWING_DIRT_ATTACHED_ARROW.get());
        basicItem(ABDItems.TNT_ATTACHED_ARROW.get());
        basicItem(ABDItems.TORCH_ATTACHED_ARROW.get());
        withExistingParent("glowing_dirt",
                new ResourceLocation(ArrowBlockDeployer.MOD_ID, "block/glowing_dirt_inventory"));
    }
}
