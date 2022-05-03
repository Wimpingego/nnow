package com.github.wimpingego.nnow.objects.blocks.stairs;

import javax.annotation.Nullable;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BirchStairsBlock extends StairBlock
{

	@SuppressWarnings("deprecation")
	public BirchStairsBlock(BlockState state, Properties properties)
	{
		super(state, properties);
	}
	
	public static class ColorHandler implements BlockColor 
	{
		public int getColor(BlockState state, @Nullable BlockAndTintGetter reader , @Nullable BlockPos blockPos, int tintIndex)
		{
			return getBirch();
		}
	}
	
	public static int getBirch() {
		return 8431445;
	}
}
