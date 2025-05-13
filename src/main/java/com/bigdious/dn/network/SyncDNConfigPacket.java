package com.bigdious.dn.network;

import com.bigdious.dn.DN;
import com.bigdious.dn.blocks.DisplayNotchBlock;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;

public record SyncDNConfigPacket(Map<ResourceLocation, DisplayNotchBlock> notches) implements CustomPacketPayload {
	public static final Type<SyncDNConfigPacket> TYPE = new Type<>(DN.prefix("sync_dn_configs"));

	@Override
	public Type<? extends CustomPacketPayload> type() {
		return TYPE;
	}

}
