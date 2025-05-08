package com.bigdious.dn.data;

import com.bigdious.dn.init.DNBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class DNBlockLootTables extends BlockLootSubProvider {
	protected DNBlockLootTables(HolderLookup.Provider provider) {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
	}

	@Override
	protected void generate() {
		dropSelf(DNBlocks.DISPLAY_NOTCH.get());
		dropOther(DNBlocks.GRAY_DISPLAY_NOTCH.get(), DNBlocks.DISPLAY_NOTCH);
		dropOther(DNBlocks.LIGHT_GRAY_DISPLAY_NOTCH.get(), DNBlocks.DISPLAY_NOTCH);
		dropOther(DNBlocks.WHITE_DISPLAY_NOTCH.get(), DNBlocks.DISPLAY_NOTCH);
		dropOther(DNBlocks.RED_DISPLAY_NOTCH.get(), DNBlocks.DISPLAY_NOTCH);
		dropOther(DNBlocks.ORANGE_DISPLAY_NOTCH.get(), DNBlocks.DISPLAY_NOTCH);
		dropOther(DNBlocks.YELLOW_DISPLAY_NOTCH.get(), DNBlocks.DISPLAY_NOTCH);
		dropOther(DNBlocks.GREEN_DISPLAY_NOTCH.get(), DNBlocks.DISPLAY_NOTCH);
		dropOther(DNBlocks.LIME_DISPLAY_NOTCH.get(), DNBlocks.DISPLAY_NOTCH);
		dropOther(DNBlocks.BLUE_DISPLAY_NOTCH.get(), DNBlocks.DISPLAY_NOTCH);
		dropOther(DNBlocks.CYAN_DISPLAY_NOTCH.get(), DNBlocks.DISPLAY_NOTCH);
		dropOther(DNBlocks.LIGHT_BLUE_DISPLAY_NOTCH.get(), DNBlocks.DISPLAY_NOTCH);
		dropOther(DNBlocks.PURPLE_DISPLAY_NOTCH.get(), DNBlocks.DISPLAY_NOTCH);
		dropOther(DNBlocks.MAGENTA_DISPLAY_NOTCH.get(), DNBlocks.DISPLAY_NOTCH);
		dropOther(DNBlocks.PINK_DISPLAY_NOTCH.get(), DNBlocks.DISPLAY_NOTCH);
		dropOther(DNBlocks.BROWN_DISPLAY_NOTCH.get(), DNBlocks.DISPLAY_NOTCH);
	}

	@Override
	protected Iterable<Block> getKnownBlocks() {
		return DNBlocks.BLOCKS.getEntries().stream().map(Supplier::get).collect(Collectors.toList());
	}
}
