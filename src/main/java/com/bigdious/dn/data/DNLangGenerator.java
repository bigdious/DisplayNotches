package com.bigdious.dn.data;

import com.bigdious.dn.DN;
import com.bigdious.dn.data.helper.DNLangProvider;
import com.bigdious.dn.init.DNBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.DyeColor;
import org.apache.commons.lang3.text.WordUtils;


public class DNLangGenerator extends DNLangProvider {

	public DNLangGenerator(PackOutput output) {
		super(output);
	}
	@Override
	protected void addTranslations() {
		this.addBlock(DNBlocks.DISPLAY_NOTCH, "Display Notch");
		for (DyeColor color : DyeColor.values()) {
			if (color != DyeColor.BLACK) {
				this.add("block.risus." + color.getName() + "_display_notch", WordUtils.capitalize(color.getName().replace('_', ' ')) + " Display Notch");
			}
		}
	}
}
