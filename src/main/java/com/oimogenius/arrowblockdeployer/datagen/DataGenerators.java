package com.oimogenius.arrowblockdeployer.datagen;


import com.oimogenius.arrowblockdeployer.ArrowBlockDeployer;
import com.oimogenius.arrowblockdeployer.datagen.client.ABDBlockStateProvider;
import com.oimogenius.arrowblockdeployer.datagen.client.ABDItemModelProvider;
import com.oimogenius.arrowblockdeployer.datagen.client.ENUSLanguageProvider;
import com.oimogenius.arrowblockdeployer.datagen.client.JAJPLanguageProvider;
import com.oimogenius.arrowblockdeployer.datagen.server.ABDBlockTagsProvider;
import com.oimogenius.arrowblockdeployer.datagen.server.ABDItemTagsProvider;
import com.oimogenius.arrowblockdeployer.datagen.server.ABDRecipeProvider;
import com.oimogenius.arrowblockdeployer.datagen.server.loot.ABDLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = ArrowBlockDeployer.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // アイテムモデル
        generator.addProvider(event.includeClient(),
                new ABDItemModelProvider(packOutput, existingFileHelper));
        // ブロックモデル
        generator.addProvider(event.includeClient(),
                new ABDBlockStateProvider(packOutput, existingFileHelper));
        // 言語
        generator.addProvider(event.includeClient(), new ENUSLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new JAJPLanguageProvider(packOutput));
        // タグ
        ABDBlockTagsProvider blockTags = generator.addProvider(event.includeServer(), new ABDBlockTagsProvider(packOutput,
                lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ABDItemTagsProvider(packOutput,
                lookupProvider, blockTags.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), ABDLootTableProvider.create(packOutput));
        generator.addProvider(event.includeServer(), new ABDRecipeProvider(packOutput));

    }
}