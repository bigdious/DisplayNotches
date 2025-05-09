package com.bigdious.dn.data;

import com.bigdious.dn.DN;
import com.bigdious.dn.blocks.DisplayNotchBlock;
import com.bigdious.dn.init.DNBlocks;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class DNBlockModelGenerator extends BlockStateProvider {
	public DNBlockModelGenerator(PackOutput output, ExistingFileHelper helper) {
		super(output, DN.MODID, helper);
	}
	@Override
	protected void registerStatesAndModels() {
		for (var notch : DNBlocks.BLOCKS.getEntries().stream().filter(holder -> holder.getRegisteredName().contains("display_notch")).toList()) {
			this.getVariantBuilder(notch.get()).forAllStatesExcept(state -> {
				boolean normal = notch.get() == DNBlocks.DISPLAY_NOTCH.get();
				ModelFile base = models().withExistingParent(notch.getRegisteredName(), DN.prefix("block/template_display_notch")).texture("texture", blockTexture(normal ? Blocks.BLACK_WOOL : BuiltInRegistries.BLOCK.get(ResourceLocation.withDefaultNamespace(notch.getRegisteredName().replace("dn:", "").replace("display_notch", "wool")))));
				//it's better to call an empty texture, otherwise we get missingtexture block particles
				ModelFile non = models().withExistingParent("empty", "block/block");
				Direction dir = state.getValue(BlockStateProperties.FACING);
				return ConfiguredModel.builder()
					.modelFile(state.getValue(DisplayNotchBlock.INVISIBLE) ? non : base)
					.rotationX(dir == Direction.DOWN ? 180 : dir.getAxis().isHorizontal() ? 90 : 0)
					.rotationY(dir.getAxis().isVertical() ? 0 : (int) (((dir.toYRot()) + 180) % 360))
					.build();
			}, DisplayNotchBlock.ROTATION, DisplayNotchBlock.FLUIDLOGGED);
		}
	}
}
