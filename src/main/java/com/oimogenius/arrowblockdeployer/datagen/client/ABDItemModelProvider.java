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
        // TODO:ちゃんとしたモデルとテクスチャ
        withExistingParent(ABDItems.BLOCK_LAUNCHER_BOW.getId().getPath(),
                new ResourceLocation("item/bow"));
        withExistingParent(ABDItems.GLOW_BERRY_ATTACHED_ARROW.getId().getPath(),
                new ResourceLocation("item/arrow"));
        withExistingParent(ABDItems.GLOWING_DIRT_ATTACHED_ARROW.getId().getPath(),
                new ResourceLocation("item/arrow"));
        withExistingParent(ABDItems.TNT_ATTACHED_ARROW.getId().getPath(),
                new ResourceLocation("item/arrow"));
        withExistingParent(ABDItems.TORCH_ATTACHED_ARROW.getId().getPath(),
                new ResourceLocation("item/arrow"));
    }
}
