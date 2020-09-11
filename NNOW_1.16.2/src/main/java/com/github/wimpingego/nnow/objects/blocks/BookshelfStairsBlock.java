package com.github.wimpingego.nnow.objects.blocks;

import com.github.wimpingego.nnow.init.BlockList;
import com.github.wimpingego.nnow.util.config.ModConfigs;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class BookshelfStairsBlock extends StairsBlock
{

	int value = ModConfigs.ENCHANT_POWER.get();
	
	@SuppressWarnings("deprecation")
	public BookshelfStairsBlock(BlockState state, Properties properties)
	{
		super(state, properties);
	}
	
	@Override
	public float getEnchantPowerBonus(BlockState state, IWorldReader world, BlockPos pos)
	{
		return this.getBlock() == BlockList.BOOKSHELF_STAIRS.get() ? value: 0;
	}
	
}
