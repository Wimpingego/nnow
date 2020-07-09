package com.github.wimpingego.nnow.util;

import com.github.wimpingego.nnow.init.BlockList;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;


public class ClientRenderer {

	public static void registerBlocks() {
		Block[] blocks = { BlockList.SAFE_CHEST.get(), BlockList.BEEKEEPER_BLOCK.get(), BlockList.END_LANTERN.get(),BlockList.SEA_TRADER_POI.get(),BlockList.RSG_HEAD.get()};
		
		Block[] leaves = { BlockList.IRONBERRY_BUSH.get(),BlockList.GOLDBERRY_BUSH.get(),BlockList.COALBERRY_BUSH.get(),BlockList.REDSTONEBERRY_BUSH.get(),
				BlockList.QUARTZBERRY_BUSH.get(),BlockList.DIAMONDBERRY_BUSH.get(),BlockList.EMERALDBERRY_BUSH.get(),BlockList.LAPISBERRY_BUSH.get(),BlockList.ICEBERRY_BUSH.get(),
				BlockList.XP_BUSH.get(),BlockList.FIREBERRY_BUSH.get(),BlockList.WOODENBERRY_BUSH.get()};
		
		Block[] glass = { BlockList.DARK_GLASS_BLOCK.get()};
		
		Block[] slabs = { BlockList.GRASS_SLAB.get(),BlockList.OAK_LEAVES_SLAB.get(),BlockList.DARK_OAK_LEAVES_SLAB.get(),BlockList.JUNGLE_LEAVES_SLAB.get(),BlockList.ACACIA_LEAVES_SLAB.get(),
				BlockList.SPRUCE_LEAVES_SLAB.get(),BlockList.BIRCH_LEAVES_SLAB.get()};
		
		Block[] stairs = { BlockList.OAK_LEAVES_STAIRS.get(),BlockList.DARK_OAK_LEAVES_STAIRS.get(),BlockList.JUNGLE_LEAVES_STAIRS.get(),BlockList.ACACIA_LEAVES_STAIRS.get(),
				BlockList.SPRUCE_LEAVES_STAIRS.get(),BlockList.BIRCH_LEAVES_STAIRS.get()};
		
		for (Block block : blocks) {
			RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
		}

		for (Block block : leaves) {
			RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
		}
		
		for (Block block : glass) {
			RenderTypeLookup.setRenderLayer(block, RenderType.getTranslucent());
		}
		
		for (Block block : slabs) {
			RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
		}
		
		for (Block block : stairs) {
			RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
		}
	}
	
}

// BlockList.BARLEY_CROP.get(), BlockList.PEPPER_CROP.get(),