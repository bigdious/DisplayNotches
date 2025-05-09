package com.bigdious.dn.data;

import com.bigdious.dn.DN;
import com.bigdious.dn.init.DNBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class DNBlockTagGenerator extends BlockTagsProvider {
	public DNBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, DN.MODID, existingFileHelper);
	}
	@Override
	protected void addTags(HolderLookup.Provider provider) {
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
				DNBlocks.DISPLAY_NOTCH.get(),
				DNBlocks.INVISIBLE_DISPLAY_NOTCH.get(),
				DNBlocks.RED_DISPLAY_NOTCH.get(),
				DNBlocks.GREEN_DISPLAY_NOTCH.get(),
				DNBlocks.LIGHT_GRAY_DISPLAY_NOTCH.get(),
				DNBlocks.LIGHT_BLUE_DISPLAY_NOTCH.get(),
				DNBlocks.GRAY_DISPLAY_NOTCH.get(),
				DNBlocks.BLUE_DISPLAY_NOTCH.get(),
				DNBlocks.YELLOW_DISPLAY_NOTCH.get(),
				DNBlocks.ORANGE_DISPLAY_NOTCH.get(),
				DNBlocks.PINK_DISPLAY_NOTCH.get(),
				DNBlocks.PURPLE_DISPLAY_NOTCH.get(),
				DNBlocks.MAGENTA_DISPLAY_NOTCH.get(),
				DNBlocks.BROWN_DISPLAY_NOTCH.get(),
				DNBlocks.WHITE_DISPLAY_NOTCH.get(),
				DNBlocks.LIME_DISPLAY_NOTCH.get(),
				DNBlocks.CYAN_DISPLAY_NOTCH.get()
				);
	}
}
