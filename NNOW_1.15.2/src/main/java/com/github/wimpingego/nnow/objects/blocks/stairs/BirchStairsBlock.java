package com.github.wimpingego.nnow.objects.blocks.stairs;

import javax.annotation.Nullable;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ILightReader;

public class BirchStairsBlock extends StairsBlock
{

	@SuppressWarnings("deprecation")
	public BirchStairsBlock(BlockState state, Properties properties)
	{
		super(state, properties);
	}
	
	public static class ColorHandler implements IBlockColor 
	{
		public int getColor(BlockState state, @Nullable ILightReader reader , @Nullable BlockPos blockPos, int tintIndex)
		{
			return getBirch();
		}
	}
	
	public static int getBirch() {
		return 8431445;
	}
}
