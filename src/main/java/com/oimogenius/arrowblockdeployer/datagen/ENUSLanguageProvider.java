package com.oimogenius.arrowblockdeployer.datagen;

import com.oimogenius.arrowblockdeployer.ArrowBlockDeployer;
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
        addItem(ModItems.BLOCKSHOT_ARROW, "Blockshot Arrow");
        addItem(ModItems.BLOCKSHOT_BOW, "Blockshot Bow");
        add("creative_tab:abd_tab", "Arrow Block Deployer");
    }
}
