package com.github.wimpingego.nnow.objects.blocks.slabs;

import com.github.wimpingego.nnow.init.BlockList;
import com.github.wimpingego.nnow.util.config.ModConfigs;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;

public class BookshelfSlabBlock extends SlabBlock
{
	int value = ModConfigs.ENCHANT_POWER_SLABS.get();

	public BookshelfSlabBlock(Properties properties)
	{
		super(properties);
	}

	@Override
	public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos)
	{
		return state.getBlock() == BlockList.BOOKSHELF_SLAB.get() ? value: 0;
	}
	
}
