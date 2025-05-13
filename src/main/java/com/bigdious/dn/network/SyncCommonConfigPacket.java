package com.bigdious.dn.network;

import com.bigdious.dn.DN;
import com.bigdious.dn.config.DNConfig;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public record SyncCommonConfigPacket(DNConfig.SpinningSource drop) implements CustomPacketPayload {
	public static final Type<SyncCommonConfigPacket> TYPE = new Type<>(DN.prefix("sync_common_config"));
	public static final StreamCodec<RegistryFriendlyByteBuf, SyncCommonConfigPacket> STREAM_CODEC = StreamCodec.composite(DNConfig.SpinningSource.STREAM_CODEC, SyncCommonConfigPacket::drop, SyncCommonConfigPacket::new);

	@Override
	public Type<? extends CustomPacketPayload> type() {
		return TYPE;
	}

	public static void handle(SyncCommonConfigPacket message, IPayloadContext context) {
		context.enqueueWork(() -> {
			DNConfig.spinningSource = message.drop();
		});
	}
}
