package com.github.wimpingego.nnow.util;

import com.github.wimpingego.nnow.init.LightList;
import com.github.wimpingego.nnow.init.MetalBlockList;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

public class LightBlockClientRenderer {

	public static void registerBlocks() {

		Block[] light = { LightList.LIGHT_BASE_BLOCK.get()};

		for (Block block : light) {
			ItemBlockRenderTypes.setRenderLayer(block, RenderType.translucent());
		}		
	}
}