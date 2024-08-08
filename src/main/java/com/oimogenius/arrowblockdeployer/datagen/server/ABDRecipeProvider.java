package com.oimogenius.arrowblockdeployer.datagen.server;

import com.oimogenius.arrowblockdeployer.block.ABDBlocks;
import com.oimogenius.arrowblockdeployer.item.ABDItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;

public class ABDRecipeProvider extends RecipeProvider {
    public ABDRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ABDBlocks.GLOWING_DIRT.get())
                .pattern(" # ")
                .pattern("#D#")
                .pattern(" # ")
                .define('#', Items.GLOW_LICHEN)
                .define('D', Items.DIRT)
                .unlockedBy(getHasName(Items.GLOW_LICHEN), has(Items.GLOW_LICHEN))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ABDItems.BLOCK_LAUNCHER_BOW.get())
                .pattern("#")
                .pattern("B")
                .define('#', Items.DISPENSER)
                .define('B', Items.BOW)
                .unlockedBy(getHasName(Items.BOW), has(Items.BOW))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ABDItems.GLOW_BERRY_ATTACHED_ARROW.get())
                .requires(Items.ARROW)
                .requires(Items.GLOW_BERRIES)
                .unlockedBy(getHasName(Items.ARROW), has(Items.ARROW))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ABDItems.GLOWING_DIRT_ATTACHED_ARROW.get())
                .requires(Items.ARROW)
                .requires(ABDBlocks.GLOWING_DIRT.get())
                .unlockedBy(getHasName(Items.ARROW), has(Items.ARROW))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ABDItems.TNT_ATTACHED_ARROW.get())
                .requires(Items.ARROW)
                .requires(Items.TNT)
                .unlockedBy(getHasName(Items.ARROW), has(Items.ARROW))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ABDItems.TORCH_ATTACHED_ARROW.get())
                .requires(Items.ARROW)
                .requires(Items.TORCH)
                .unlockedBy(getHasName(Items.ARROW), has(Items.ARROW))
                .save(recipeOutput);

    }
}
