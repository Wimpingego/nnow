package com.github.wimpingego.nnow.objects.blocks.slabs;

import javax.annotation.Nullable;

import com.github.wimpingego.nnow.NNOW;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ILightReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid=NNOW.MOD_ID, bus=Bus.MOD, value=Dist.CLIENT)
public class SpruceSlab extends SlabBlock
{
	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public SpruceSlab(Properties properties)
	{
		super(properties);
		this.setDefaultState(this.getDefaultState().with(SlabBlock.TYPE, SlabType.BOTTOM).with(WATERLOGGED, Boolean.FALSE));
	}
	
	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) 
	{
		builder.add(SlabBlock.TYPE, WATERLOGGED);
	}

	@Override
	public boolean isTransparent(BlockState state) {
		return state.get(SlabBlock.TYPE) != SlabType.DOUBLE;
	}
	
	public static class ColorHandler implements IBlockColor 
	{
		public int getColor(BlockState state, @Nullable ILightReader reader , @Nullable BlockPos blockPos, int tintIndex)
		{
			//if(reader != null && blockPos != null)
			//{
				//return BiomeColors.getGrassColor(reader, blockPos);
			//}
			return getSpruce();
		}
	}
	
	public static int getSpruce() {
		return 6396257;
	}

}
