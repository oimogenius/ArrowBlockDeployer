package com.oimogenius.arrowblockdeployer.datagen.client;

import com.oimogenius.arrowblockdeployer.ArrowBlockDeployer;
import com.oimogenius.arrowblockdeployer.block.ModBlocks;
import com.oimogenius.arrowblockdeployer.item.ModItems;
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
        addItem(ModItems.GLOWBERRY_ATTACHED_ARROW, "ブロック射撃矢");
        addItem(ModItems.BLOCKSHOT_BOW, "ブロック射撃弓");

        addBlock(ModBlocks.GLOWING_DIRT, "発光する土");
    }
}
