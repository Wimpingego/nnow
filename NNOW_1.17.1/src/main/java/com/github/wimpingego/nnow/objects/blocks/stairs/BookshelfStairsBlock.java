package com.github.wimpingego.nnow.objects.blocks.stairs;

import com.github.wimpingego.nnow.init.BlockList;
import com.github.wimpingego.nnow.util.config.ModConfigs;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class BookshelfStairsBlock extends StairBlock
{
	int value = ModConfigs.ENCHANT_POWER_STAIRS.get();
	
	@SuppressWarnings("deprecation")
	public BookshelfStairsBlock(BlockState state, Properties properties)
	{
		super(state, properties);
	}
	
	@Override
	public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos)
	{
		return state.getBlock() == BlockList.BOOKSHELF_STAIRS.get() ? value: 0;
	}

}
