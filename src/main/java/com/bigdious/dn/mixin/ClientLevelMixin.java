package com.bigdious.dn.mixin;

import com.bigdious.dn.init.DNBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(ClientLevel.class)
public abstract class ClientLevelMixin {
	//thanks for the help TelephaticGrunt

	@Inject(method = "getMarkerParticleTarget()Lnet/minecraft/world/level/block/Block;",
		at = @At(value = "RETURN"),
		cancellable = true)
	private void dn$showDarknessInSurvival(CallbackInfoReturnable<Block> cir) {
		Player player = Minecraft.getInstance().player;
		if (player != null) {
			if (player.getMainHandItem().is(DNBlocks.DISPLAY_NOTCH.asItem())) {
				cir.setReturnValue(DNBlocks.INVISIBLE_DISPLAY_NOTCH.value());
			}
		}
	}
}
