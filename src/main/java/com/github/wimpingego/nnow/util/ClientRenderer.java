package com.github.wimpingego.nnow.util;

import com.github.wimpingego.nnow.init.BlockList;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class ClientRenderer {

	public static void registerBlocks() {
		Block[] blocks = { BlockList.BARLEY_CROP.get(), BlockList.PEPPER_CROP.get(), };
		
		Block[] leaves = { BlockList.IRONBERRY_BUSH.get(),BlockList.GOLDBERRY_BUSH.get(),BlockList.COALBERRY_BUSH.get(),BlockList.REDSTONEBERRY_BUSH.get(),
				BlockList.QUARTZBERRY_BUSH.get(),BlockList.DIAMONDBERRY_BUSH.get(),BlockList.EMERALDBERRY_BUSH.get(),BlockList.LAPISBERRY_BUSH.get(),
				BlockList.FROSTBERRY_BUSH.get() };
		
		for (Block block : blocks) {
			RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
		}

		for (Block block : leaves) {
			RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
		}
	}

}