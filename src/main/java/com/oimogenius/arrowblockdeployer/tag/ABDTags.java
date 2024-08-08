package com.oimogenius.arrowblockdeployer.tag;

import com.oimogenius.arrowblockdeployer.ArrowBlockDeployer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;

public class ABDTags {
    public static class Items {
        public static final TagKey<Item> BLOCK_LAUNCHER_ARROWS = tag("blockshot_arrows");
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(
                    ArrowBlockDeployer.MOD_ID, name));
        }
    }

}
