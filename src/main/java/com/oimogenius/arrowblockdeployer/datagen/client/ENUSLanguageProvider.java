package com.oimogenius.arrowblockdeployer.datagen.client;

import com.oimogenius.arrowblockdeployer.ArrowBlockDeployer;
import com.oimogenius.arrowblockdeployer.block.ABDBlocks;
import com.oimogenius.arrowblockdeployer.item.ABDItems;
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
        addItem(ABDItems.BLOCK_LAUNCHER_BOW, "Blockshot Bow");
        addItem(ABDItems.GLOW_BERRY_ATTACHED_ARROW, "Glow Berry Attached Arrow");
        addItem(ABDItems.GLOWING_DIRT_ATTACHED_ARROW, "Glowing Dirt Attached Arrow");
        addItem(ABDItems.TNT_ATTACHED_ARROW, "TNT Attached Arrow");
        addItem(ABDItems.TORCH_ATTACHED_ARROW, "Torch Attached Arrow");

        addBlock(ABDBlocks.GLOWING_DIRT, "Glowing Dirt");
    }
}
