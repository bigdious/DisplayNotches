package com.bigdious.dn.data;

import com.bigdious.dn.DN;
import com.bigdious.dn.init.DNBlocks;
import com.bigdious.dn.init.DNItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.Objects;

public class DNItemModelGenerator extends ItemModelProvider {
	public DNItemModelGenerator(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
		super(packOutput, DN.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		toBlock(DNBlocks.DISPLAY_NOTCH.get());
	}

	private void toBlock(Block b) {
		toBlockModel(b, DN.prefix("block/" + Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(b)).getPath()));
	}

	private void toBlockModel(Block b, ResourceLocation model) {
		withExistingParent(Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(b)).getPath(), model);
	}
}
