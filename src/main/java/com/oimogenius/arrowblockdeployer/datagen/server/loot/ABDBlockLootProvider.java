package com.oimogenius.arrowblockdeployer.datagen.server.loot;

import com.oimogenius.arrowblockdeployer.block.ABDBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ABDBlockLootProvider extends BlockLootSubProvider {
    protected ABDBlockLootProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ABDBlocks.GLOWING_DIRT.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ABDBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
