package com.bigdious.dn.config;

import com.bigdious.dn.network.SyncCommonConfigPacket;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ByIdMap;
import net.neoforged.neoforge.common.TranslatableEnum;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.server.ServerLifecycleHooks;

import java.util.Locale;
import java.util.function.IntFunction;

public class DNConfig {
	// -- COMMON CONFIG --
	public static SpinningSource spinningSource = SpinningSource.SIGNAL;

	static void rebakeCommonOptions(DNCommonConfig config) {
		spinningSource = config.spinningSource.get();

		MinecraftServer server = ServerLifecycleHooks.getCurrentServer();
		if (server != null && server.isDedicatedServer()) {
			PacketDistributor.sendToAllPlayers(new SyncCommonConfigPacket(spinningSource));
		}
	}

	public enum SpinningSource implements TranslatableEnum {
		SIGNAL,
		TORCH_ITEM;

		public static final IntFunction<SpinningSource> BY_ID = ByIdMap.continuous(SpinningSource::ordinal, values(), ByIdMap.OutOfBoundsStrategy.WRAP);
		public static final StreamCodec<ByteBuf, SpinningSource> STREAM_CODEC = ByteBufCodecs.idMapper(BY_ID, SpinningSource::ordinal);

		@Override
		public Component getTranslatedName() {
			return Component.translatable("config.dn.spinning_source." + this.name().toLowerCase(Locale.ROOT));
		}
	}
}
