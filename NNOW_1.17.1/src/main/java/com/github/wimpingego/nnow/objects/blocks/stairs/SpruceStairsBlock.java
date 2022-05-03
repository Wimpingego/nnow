package com.github.wimpingego.nnow.objects.blocks.stairs;

import javax.annotation.Nullable;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SpruceStairsBlock extends StairBlock
{

	@SuppressWarnings("deprecation")
	public SpruceStairsBlock(BlockState state, Properties properties)
	{
		super(state, properties);
	}
	
	public static class ColorHandler implements BlockColor 
	{
		public int getColor(BlockState state, @Nullable BlockAndTintGetter reader , @Nullable BlockPos blockPos, int tintIndex)
		{
			return getSpruce();
		}
	}
	
	public static int getSpruce() {
		return 6396257;
	}
}
