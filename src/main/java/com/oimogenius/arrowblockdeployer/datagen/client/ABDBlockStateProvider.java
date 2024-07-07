package com.oimogenius.arrowblockdeployer.datagen.client;

import com.oimogenius.arrowblockdeployer.ArrowBlockDeployer;
import com.oimogenius.arrowblockdeployer.block.ABDBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ABDBlockStateProvider extends BlockStateProvider {
    public ABDBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ArrowBlockDeployer.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithExistingParent(ABDBlocks.GLOWING_DIRT, "block/dirt");
    }

    private void blockWithExistingParent(RegistryObject<Block> block, String parent) {
        simpleBlockWithItem(block.get(), models().getExistingFile(mcLoc(parent)));
    }
}
