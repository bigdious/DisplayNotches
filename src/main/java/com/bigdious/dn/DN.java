package com.bigdious.dn;

import com.bigdious.dn.client.DNClientEvents;
import com.bigdious.dn.data.*;
import com.bigdious.dn.init.DNBlockEntities;
import com.bigdious.dn.init.DNBlocks;
import com.bigdious.dn.init.DNItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

@Mod(DN.MODID)
public class DN {
	public static final String MODID = "dn";

	public static final Logger LOGGER = LogManager.getLogger();

	public DN(IEventBus bus, Dist dist) {
		DNBlockEntities.BLOCK_ENTITIES.register(bus);
		DNBlocks.BLOCKS.register(bus);
		DNItems.ITEMS.register(bus);

		if (dist.isClient()) {
			DNClientEvents.initEvents(bus);
		}

		bus.addListener(this::gatherData);
	}

	private void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		PackOutput packOutput = generator.getPackOutput();
		DatapackBuiltinEntriesProvider datapackProvider = new DNRegistryDataGenerator(packOutput, event.getLookupProvider());
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

		boolean isClient = event.includeClient();
		generator.addProvider(isClient, new DNBlockModelGenerator(packOutput, existingFileHelper));
		generator.addProvider(isClient, new DNItemModelGenerator(packOutput, existingFileHelper));
		generator.addProvider(isClient, new DNLangGenerator(packOutput));

		boolean isServer = event.includeServer();
		DNRegistryDataGenerator registryDataGenerator = new DNRegistryDataGenerator(packOutput, datapackProvider.getRegistryProvider());
		var lookupProvider = registryDataGenerator.getRegistryProvider();
		generator.addProvider(isServer, new DNLootGenerator(packOutput, lookupProvider));
		generator.addProvider(isServer, new DNCraftingGenerator(packOutput, lookupProvider));
		var blocktags = new DNBlockTagGenerator(packOutput, lookupProvider, existingFileHelper);
		generator.addProvider(isServer, blocktags);
	}
	public static ResourceLocation prefix(String name) {
		return ResourceLocation.fromNamespaceAndPath(MODID, name.toLowerCase(Locale.ROOT));
	}

}
