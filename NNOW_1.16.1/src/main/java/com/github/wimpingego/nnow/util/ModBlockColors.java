package com.github.wimpingego.nnow.util;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.init.BlockList;
import com.github.wimpingego.nnow.objects.blocks.slabs.BirchSlab;
import com.github.wimpingego.nnow.objects.blocks.slabs.GrassSlab;
import com.github.wimpingego.nnow.objects.blocks.slabs.LeafSlab;
import com.github.wimpingego.nnow.objects.blocks.slabs.SpruceSlab;
import com.github.wimpingego.nnow.objects.blocks.stairs.BirchStairsBlock;
import com.github.wimpingego.nnow.objects.blocks.stairs.LeafStairsBlock;
import com.github.wimpingego.nnow.objects.blocks.stairs.SpruceStairsBlock;

import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.BlockItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid=NNOW.MOD_ID, bus=Bus.MOD, value=Dist.CLIENT)
public class ModBlockColors
{
	@SubscribeEvent
	public static void registerBlockColorHandler(final ColorHandlerEvent.Block event)
	{
		final BlockColors blockColors = event.getBlockColors();
		
		blockColors.register(new GrassSlab.ColorHandler(), BlockList.GRASS_SLAB.get());
		blockColors.register(new LeafSlab.ColorHandler(), BlockList.OAK_LEAVES_SLAB.get());
		blockColors.register(new LeafSlab.ColorHandler(), BlockList.DARK_OAK_LEAVES_SLAB.get());
		blockColors.register(new LeafSlab.ColorHandler(), BlockList.JUNGLE_LEAVES_SLAB.get());
		blockColors.register(new LeafSlab.ColorHandler(), BlockList.ACACIA_LEAVES_SLAB.get());
		blockColors.register(new SpruceSlab.ColorHandler(), BlockList.SPRUCE_LEAVES_SLAB.get());
		blockColors.register(new BirchSlab.ColorHandler(), BlockList.BIRCH_LEAVES_SLAB.get());
		
		blockColors.register(new LeafStairsBlock.ColorHandler(), BlockList.OAK_LEAVES_STAIRS.get());
		blockColors.register(new LeafStairsBlock.ColorHandler(), BlockList.DARK_OAK_LEAVES_STAIRS.get());
		blockColors.register(new LeafStairsBlock.ColorHandler(), BlockList.JUNGLE_LEAVES_STAIRS.get());
		blockColors.register(new LeafStairsBlock.ColorHandler(), BlockList.ACACIA_LEAVES_STAIRS.get());
		blockColors.register(new SpruceStairsBlock.ColorHandler(), BlockList.SPRUCE_LEAVES_STAIRS.get());
		blockColors.register(new BirchStairsBlock.ColorHandler(), BlockList.BIRCH_LEAVES_STAIRS.get());
	}
	
	@SubscribeEvent
	public static void registerItemColorHandler(final ColorHandlerEvent.Item event)
	{
		BlockColors blockColors = event.getBlockColors();
		ItemColors itemColors = event.getItemColors();
		
		final IItemColor itemBlockColourHandler = (stack, tintIndex) -> {
		    final BlockState state = ((BlockItem) stack.getItem()).getBlock().getDefaultState();
		    return  blockColors.getColor(state, null, null, tintIndex);
		};
		
		itemColors.register(itemBlockColourHandler, BlockList.GRASS_SLAB.get());
		itemColors.register(itemBlockColourHandler, BlockList.OAK_LEAVES_SLAB.get());
		itemColors.register(itemBlockColourHandler, BlockList.DARK_OAK_LEAVES_SLAB.get());
		itemColors.register(itemBlockColourHandler, BlockList.JUNGLE_LEAVES_SLAB.get());
		itemColors.register(itemBlockColourHandler, BlockList.ACACIA_LEAVES_SLAB.get());
		itemColors.register(itemBlockColourHandler, BlockList.SPRUCE_LEAVES_SLAB.get());
		itemColors.register(itemBlockColourHandler, BlockList.BIRCH_LEAVES_SLAB.get());	
		
		itemColors.register(itemBlockColourHandler, BlockList.OAK_LEAVES_STAIRS.get());
		itemColors.register(itemBlockColourHandler, BlockList.DARK_OAK_LEAVES_STAIRS.get());
		itemColors.register(itemBlockColourHandler, BlockList.JUNGLE_LEAVES_STAIRS.get());
		itemColors.register(itemBlockColourHandler, BlockList.ACACIA_LEAVES_STAIRS.get());
		itemColors.register(itemBlockColourHandler, BlockList.SPRUCE_LEAVES_STAIRS.get());
		itemColors.register(itemBlockColourHandler, BlockList.BIRCH_LEAVES_STAIRS.get());	

	}
}
