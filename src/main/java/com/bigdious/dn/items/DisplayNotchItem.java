package com.bigdious.dn.items;

import com.bigdious.dn.config.DNConfig;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;

import java.util.List;

public class DisplayNotchItem extends BlockItem {
	public DisplayNotchItem(Block block, Properties properties) {
		super(block, properties);
	}

	@Override
	public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag isAdvanced) {
		if (Screen.hasShiftDown()) {
			tooltipComponents.add(Component.translatable("tooltip.dn.start").withStyle(ChatFormatting.GRAY));
			tooltipComponents.add(Component.translatable("tooltip.dn.axe").withStyle(ChatFormatting.GRAY));
			tooltipComponents.add(Component.translatable("tooltip.dn.shovel").withStyle(ChatFormatting.GRAY));
			tooltipComponents.add(Component.translatable("tooltip.dn.pickaxe").withStyle(ChatFormatting.GRAY));
			tooltipComponents.add(Component.translatable("tooltip.dn.glow_ink_sac").withStyle(ChatFormatting.GRAY));
			tooltipComponents.add(Component.translatable("tooltip.dn.dye").withStyle(ChatFormatting.GRAY));
			tooltipComponents.add(Component.translatable("tooltip.dn.phantom_membrane").withStyle(ChatFormatting.GRAY));
			tooltipComponents.add(Component.translatable("tooltip.dn.tripwire_hook").withStyle(ChatFormatting.GRAY));
			tooltipComponents.add(Component.translatable("tooltip.dn.glass").withStyle(ChatFormatting.GRAY));
			if (DNConfig.spinningSource == DNConfig.SpinningSource.SIGNAL) {
				tooltipComponents.add(Component.translatable("tooltip.dn.signal").withStyle(ChatFormatting.GRAY));
			} else {
				tooltipComponents.add(Component.translatable("tooltip.dn.redstone_torch").withStyle(ChatFormatting.GRAY));
			}
		} else {
			tooltipComponents.add(Component.translatable("tooltip.dn.hidden").withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
		}

		super.appendHoverText(stack, context, tooltipComponents, isAdvanced);
	}
}
