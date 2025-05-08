package com.bigdious.dn.init;

import com.bigdious.dn.DN;
import com.bigdious.dn.blocks.entity.DisplayNotchBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DNBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, DN.MODID);

	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DisplayNotchBlockEntity>> DISPLAY_NOTCH = BLOCK_ENTITIES.register("display_notch", () -> BlockEntityType.Builder.of(DisplayNotchBlockEntity::new, Blocks.SHULKER_BOX,
			DNBlocks.DISPLAY_NOTCH.get(),
			DNBlocks.BLUE_DISPLAY_NOTCH.get(),
			DNBlocks.BROWN_DISPLAY_NOTCH.get(),
			DNBlocks.CYAN_DISPLAY_NOTCH.get(),
			DNBlocks.GRAY_DISPLAY_NOTCH.get(),
			DNBlocks.GREEN_DISPLAY_NOTCH.get(),
			DNBlocks.LIGHT_BLUE_DISPLAY_NOTCH.get(),
			DNBlocks.LIGHT_GRAY_DISPLAY_NOTCH.get(),
			DNBlocks.LIME_DISPLAY_NOTCH.get(),
			DNBlocks.MAGENTA_DISPLAY_NOTCH.get(),
			DNBlocks.ORANGE_DISPLAY_NOTCH.get(),
			DNBlocks.PINK_DISPLAY_NOTCH.get(),
			DNBlocks.PURPLE_DISPLAY_NOTCH.get(),
			DNBlocks.RED_DISPLAY_NOTCH.get(),
			DNBlocks.WHITE_DISPLAY_NOTCH.get(),
			DNBlocks.YELLOW_DISPLAY_NOTCH.get())
		.build(null));
}
