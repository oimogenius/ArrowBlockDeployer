package com.oimogenius.arrowblockdeployer.datagen.server;

import com.oimogenius.arrowblockdeployer.ArrowBlockDeployer;
import com.oimogenius.arrowblockdeployer.block.ABDBlocks;
import com.oimogenius.arrowblockdeployer.item.ABDItems;
import com.oimogenius.arrowblockdeployer.tag.ABDTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ABDBlockTagsProvider extends BlockTagsProvider {
    public ABDBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ArrowBlockDeployer.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.DIRT)
                .add(ABDBlocks.GLOWING_DIRT.get());
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ABDBlocks.GLOWING_DIRT.get());
    }
}
