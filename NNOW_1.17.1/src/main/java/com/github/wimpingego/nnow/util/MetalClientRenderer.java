package com.github.wimpingego.nnow.util;

import com.github.wimpingego.nnow.init.MetalBlockList;
import net.minecraft.world.level.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class MetalClientRenderer {

	public static void registerBlocks() {
		
		Block[] metal_bushes = {MetalBlockList.NICKEL_BERRY_BUSH.get(),MetalBlockList.SILVER_BERRY_BUSH.get(),
				MetalBlockList.URANIUM_BERRY_BUSH.get(),MetalBlockList.LEAD_BERRY_BUSH.get(),MetalBlockList.ALUMINUM_BERRY_BUSH.get(),MetalBlockList.TIN_BERRY_BUSH.get(),MetalBlockList.OSMIUM_BERRY_BUSH.get(),
				MetalBlockList.BISMUTH_BERRY_BUSH.get(),MetalBlockList.ZINC_BERRY_BUSH.get(),MetalBlockList.PLATINUM_BERRY_BUSH.get(),MetalBlockList.IRIDIUM_BERRY_BUSH.get()};

		for (Block block : metal_bushes) {
			ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
		}		
	}
}