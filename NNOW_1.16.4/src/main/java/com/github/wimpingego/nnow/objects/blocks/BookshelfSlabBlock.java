package com.github.wimpingego.nnow.objects.blocks;

import com.github.wimpingego.nnow.init.BlockList;
import com.github.wimpingego.nnow.util.config.ModConfigs;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class BookshelfSlabBlock extends SlabBlock
{

	int value = ModConfigs.ENCHANT_POWER.get();
	
	public BookshelfSlabBlock(Properties properties)
	{
		super(properties);
	}
	
	public float getEnchantPowerBonus(BlockState state, IWorldReader world, BlockPos pos)
	{
		return this.getBlock() == BlockList.BOOKSHELF_SLAB.get() ? value/2: 0;
	}
	
}
