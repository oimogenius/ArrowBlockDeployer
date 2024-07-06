package com.oimogenius.arrowblockdeployer.datagen;

import com.oimogenius.arrowblockdeployer.ArrowBlockDeployer;
import com.oimogenius.arrowblockdeployer.item.ModItems;
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
        withExistingParent(ModItems.BLOCKSHOT_ARROW.getId().getPath(),
                new ResourceLocation("item/arrow"));
        withExistingParent(ModItems.BLOCKSHOT_BOW.getId().getPath(),
                new ResourceLocation("item/bow"));
    }
}
