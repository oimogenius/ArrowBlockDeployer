package com.oimogenius.arrowblockdeployer.datagen.server;

import com.oimogenius.arrowblockdeployer.ArrowBlockDeployer;
import com.oimogenius.arrowblockdeployer.item.ABDItems;
import com.oimogenius.arrowblockdeployer.tag.ABDTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ABDItemTagsProvider extends ItemTagsProvider {
    public ABDItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookUpProvider,
                               CompletableFuture<TagLookup<Block>> blockTagLookUp,
                               @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookUpProvider, blockTagLookUp, ArrowBlockDeployer.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ABDTags.Items.BLOCK_LAUNCHER_ARROWS)
                .add(ABDItems.GLOW_BERRY_ATTACHED_ARROW.get())
                .add(ABDItems.GLOWING_DIRT_ATTACHED_ARROW.get())
                .add(ABDItems.TNT_ATTACHED_ARROW.get())
                .add(ABDItems.TORCH_ATTACHED_ARROW.get());
    }
}
