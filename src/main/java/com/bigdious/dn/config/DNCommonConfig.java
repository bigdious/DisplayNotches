package com.bigdious.dn.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public final class DNCommonConfig {
	final ModConfigSpec.EnumValue<DNConfig.SpinningSource> spinningSource;

	public DNCommonConfig(ModConfigSpec.Builder builder) {
		this.spinningSource = builder
			.translation("config.dn.spinning_source")
			.comment(ConfigComments.SPINNING_SOURCE)
			.defineEnum("spinningSource", DNConfig.SpinningSource.SIGNAL);

	}
}
