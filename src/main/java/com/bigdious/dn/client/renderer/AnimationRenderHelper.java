package com.bigdious.dn.client.renderer;

public class AnimationRenderHelper {
	public static int rotation;

	public static void animate() {
		tickRotation();
	}
	private static void tickRotation() {
		if (rotation >1728000) rotation = 0; else rotation++;
	}
}
