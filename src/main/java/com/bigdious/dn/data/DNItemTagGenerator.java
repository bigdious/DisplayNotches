package com.bigdious.dn.data;

import com.bigdious.dn.DN;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class DNItemTagGenerator extends ItemTagsProvider {

	public DNItemTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTagLookup, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, blockTagLookup, DN.MODID, existingFileHelper);
	}
	@Override
	protected void addTags(HolderLookup.Provider provider) {

	}
}
