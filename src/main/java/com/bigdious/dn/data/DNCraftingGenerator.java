package com.bigdious.dn.data;

import com.bigdious.dn.DN;
import com.bigdious.dn.init.DNBlocks;
import com.bigdious.dn.init.DNItems;
import com.bigdious.dn.init.DNTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class DNCraftingGenerator extends RecipeProvider {
	public DNCraftingGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider) {
		super(packOutput, provider);
	}

	@Override
	protected void buildRecipes(RecipeOutput consumer) {
		ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, DNBlocks.DISPLAY_NOTCH.asItem(), 1)
			.requires(Ingredient.of(DNTags.Items.ITEM_FRAMES))
			.requires(Ingredient.of(Items.BLACKSTONE))
			.unlockedBy("has_item", has(Items.LEATHER))
			.unlockedBy("has_item", has(Items.ITEM_FRAME))
			.save(consumer, "dn_recipe");
	}

}
