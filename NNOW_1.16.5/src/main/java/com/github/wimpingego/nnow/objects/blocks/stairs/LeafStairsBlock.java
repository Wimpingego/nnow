package com.github.wimpingego.nnow.objects.blocks.stairs;

import javax.annotation.Nullable;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.biome.BiomeColors;

public class LeafStairsBlock extends StairsBlock
{

	@SuppressWarnings("deprecation")
	public LeafStairsBlock(BlockState state, Properties properties)
	{
		super(state, properties);
	}
	
	public static class ColorHandler implements IBlockColor 
	{
		public int getColor(BlockState state, @Nullable IBlockDisplayReader reader , @Nullable BlockPos blockPos, int tintIndex)
		{

			if(reader != null && blockPos != null)
			{
				return BiomeColors.getFoliageColor(reader , blockPos);
			}
			return getDefault();
		}
	}
	
	public static int getDefault() {
		return 4764952;
	}
}
