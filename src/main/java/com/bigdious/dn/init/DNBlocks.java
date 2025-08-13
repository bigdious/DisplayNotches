package com.bigdious.dn.init;

import com.bigdious.dn.DN;
import com.bigdious.dn.blocks.DisplayNotchBlock;
import com.bigdious.dn.blocks.interfaces.SimpleMultiloggedBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class DNBlocks {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DN.MODID);

	public static final DeferredBlock<Block> DISPLAY_NOTCH = register("display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(1.5F, 6.0F).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));
	public static final DeferredBlock<Block> GRAY_DISPLAY_NOTCH = register("gray_display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).strength(1.5F, 6.0F).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));
	public static final DeferredBlock<Block> LIGHT_GRAY_DISPLAY_NOTCH = register("light_gray_display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(1.5F, 6.0F).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));
	public static final DeferredBlock<Block> WHITE_DISPLAY_NOTCH = register("white_display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).strength(1.5F, 6.0F).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));
	public static final DeferredBlock<Block> RED_DISPLAY_NOTCH = register("red_display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(1.5F, 6.0F).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));
	public static final DeferredBlock<Block> ORANGE_DISPLAY_NOTCH = register("orange_display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(1.5F, 6.0F).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));
	public static final DeferredBlock<Block> YELLOW_DISPLAY_NOTCH = register("yellow_display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(1.5F, 6.0F).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));
	public static final DeferredBlock<Block> GREEN_DISPLAY_NOTCH = register("green_display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(1.5F, 6.0F).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));
	public static final DeferredBlock<Block> LIME_DISPLAY_NOTCH = register("lime_display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(1.5F, 6.0F).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));
	public static final DeferredBlock<Block> BLUE_DISPLAY_NOTCH = register("blue_display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(1.5F, 6.0F).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));
	public static final DeferredBlock<Block> CYAN_DISPLAY_NOTCH = register("cyan_display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));
	public static final DeferredBlock<Block> LIGHT_BLUE_DISPLAY_NOTCH = register("light_blue_display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).strength(1.5F, 6.0F).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));
	public static final DeferredBlock<Block> PURPLE_DISPLAY_NOTCH = register("purple_display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(1.5F, 6.0F).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));
	public static final DeferredBlock<Block> MAGENTA_DISPLAY_NOTCH = register("magenta_display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).strength(1.5F, 6.0F).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));
	public static final DeferredBlock<Block> PINK_DISPLAY_NOTCH = register("pink_display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(1.5F, 6.0F).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));
	public static final DeferredBlock<Block> BROWN_DISPLAY_NOTCH = register("brown_display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(1.5F, 6.0F).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));
	public static final DeferredBlock<Block> INVISIBLE_DISPLAY_NOTCH = register("invisible_display_notch", DisplayNotchBlock::new, () -> BlockBehaviour.Properties.of().mapColor(MapColor.NONE).strength(1.5F, 6.0F).lightLevel(state -> state.getValue(SimpleMultiloggedBlock.MultiloggingEnum.FLUIDLOGGED) == SimpleMultiloggedBlock.MultiloggingEnum.LAVA ? 15 : 0));

	public static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties) {
		return BLOCKS.register(name, () -> block.apply(properties.get()));
	}
}
