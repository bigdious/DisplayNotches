package com.bigdious.dn.client;

import com.bigdious.dn.client.renderer.AnimationRenderHelper;
import com.bigdious.dn.client.renderer.DisplayNotchRenderer;
import com.bigdious.dn.init.DNBlockEntities;
import net.minecraft.client.Minecraft;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.common.NeoForge;

public class DNClientEvents {
	public static void initEvents(IEventBus bus) {
		bus.addListener(DNClientEvents::registerEntityRenderers);
		NeoForge.EVENT_BUS.addListener(DNClientEvents::clientTick);
	}
	private static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(DNBlockEntities.DISPLAY_NOTCH.get(), DisplayNotchRenderer::new);
	}

	private static void clientTick(ClientTickEvent.Post event) {
		Minecraft mc = Minecraft.getInstance();

		if (!mc.isPaused()) {
			AnimationRenderHelper.animate();
		}
	}
}
