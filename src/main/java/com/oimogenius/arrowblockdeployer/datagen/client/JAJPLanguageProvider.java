package com.oimogenius.arrowblockdeployer.datagen.client;

import com.oimogenius.arrowblockdeployer.ArrowBlockDeployer;
import com.oimogenius.arrowblockdeployer.block.ABDBlocks;
import com.oimogenius.arrowblockdeployer.item.ABDItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class JAJPLanguageProvider extends LanguageProvider {
    public JAJPLanguageProvider(PackOutput output) {
        super(output, ArrowBlockDeployer.MOD_ID, Locale.JAPAN.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        add("creative_tab:abd_tab", "Arrow Block Deployer");
        addItem(ABDItems.BLOCK_LAUNCHER_BOW, "ブロック射出弓");
        addItem(ABDItems.GLOW_BERRY_ATTACHED_ARROW, "グロウベリー付きの矢");
        addItem(ABDItems.GLOWING_DIRT_ATTACHED_ARROW, "発光する土付きの矢");
        addItem(ABDItems.TNT_ATTACHED_ARROW, "TNT付きの矢");
        addItem(ABDItems.TORCH_ATTACHED_ARROW, "松明付きの矢");

        addBlock(ABDBlocks.GLOWING_DIRT, "発光する土");
    }
}
