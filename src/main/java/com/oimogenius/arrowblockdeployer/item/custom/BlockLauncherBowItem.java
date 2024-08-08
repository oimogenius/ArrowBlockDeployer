package com.oimogenius.arrowblockdeployer.item.custom;

import com.oimogenius.arrowblockdeployer.item.ABDItems;
import com.oimogenius.arrowblockdeployer.tag.ABDTags;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.ForgeEventFactory;

import java.util.function.Predicate;

public class BlockLauncherBowItem extends BowItem {
    public static final Predicate<ItemStack> ARROWS_AND_BLOCK_LAUNCHER_ARROWS =
            (itemStack) -> itemStack.is(ABDTags.Items.BLOCK_LAUNCHER_ARROWS)
                    || itemStack.is(ItemTags.ARROWS);

    public BlockLauncherBowItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public Predicate<ItemStack> getAllSupportedProjectiles() {
        return ARROWS_AND_BLOCK_LAUNCHER_ARROWS;
    }

}
