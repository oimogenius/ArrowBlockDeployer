package com.oimogenius.arrowblockdeployer.datagen.client;

import com.oimogenius.arrowblockdeployer.ArrowBlockDeployer;
import com.oimogenius.arrowblockdeployer.block.ModBlocks;
import com.oimogenius.arrowblockdeployer.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class ENUSLanguageProvider extends LanguageProvider {
    public ENUSLanguageProvider(PackOutput output) {
        super(output, ArrowBlockDeployer.MOD_ID, Locale.US.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        add("creative_tab:abd_tab", "Arrow Block Deployer");
        addItem(ModItems.GLOWBERRY_ATTACHED_ARROW, "Blockshot Arrow");
        addItem(ModItems.BLOCKSHOT_BOW, "Blockshot Bow");

        addBlock(ModBlocks.GLOWING_DIRT, "Glowing Dirt");
    }
}
