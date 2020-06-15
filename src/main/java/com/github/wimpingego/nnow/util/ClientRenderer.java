package com.github.wimpingego.nnow.util;

import com.github.wimpingego.nnow.init.BlockList;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;


public class ClientRenderer {

	public static void registerBlocks() {
		Block[] blocks = { BlockList.SAFE_CHEST.get(), BlockList.BEEKEEPER_BLOCK.get(), BlockList.END_LANTERN.get()};
		
		Block[] leaves = { BlockList.IRONBERRY_BUSH.get(),BlockList.GOLDBERRY_BUSH.get(),BlockList.COALBERRY_BUSH.get(),BlockList.REDSTONEBERRY_BUSH.get(),
				BlockList.QUARTZBERRY_BUSH.get(),BlockList.DIAMONDBERRY_BUSH.get(),BlockList.EMERALDBERRY_BUSH.get(),BlockList.LAPISBERRY_BUSH.get(),BlockList.ICEBERRY_BUSH.get(),
				BlockList.XP_BUSH.get(),BlockList.FIREBERRY_BUSH.get(),BlockList.WOODENBERRY_BUSH.get(),BlockList.SEA_TRADER_POI.get()};
		
		Block[] glass = { BlockList.DARK_GLASS_BLOCK.get()};
		
		for (Block block : blocks) {
			RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
		}

		for (Block block : leaves) {
			RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
		}
		
		for (Block block : glass) {
			RenderTypeLookup.setRenderLayer(block, RenderType.getTranslucent());
		}
		
	}
	
}

// BlockList.BARLEY_CROP.get(), BlockList.PEPPER_CROP.get(),