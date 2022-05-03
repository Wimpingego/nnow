package com.github.wimpingego.nnow.objects.blocks.slabs;

import javax.annotation.Nullable;

import com.github.wimpingego.nnow.NNOW;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

@EventBusSubscriber(modid=NNOW.MOD_ID, bus=Bus.MOD, value=Dist.CLIENT)
public class BirchSlab extends SlabBlock
{
	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public BirchSlab(Properties properties)
	{
		super(properties);
		this.registerDefaultState(this.defaultBlockState().setValue(SlabBlock.TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.FALSE));
	}
	
	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) 
	{
		builder.add(SlabBlock.TYPE, WATERLOGGED);
	}

	@Override
	public boolean useShapeForLightOcclusion(BlockState state) {
		return state.getValue(SlabBlock.TYPE) != SlabType.DOUBLE;
	}
	
	public static class ColorHandler implements BlockColor 
	{
		public int getColor(BlockState state, @Nullable BlockAndTintGetter reader , @Nullable BlockPos blockPos, int tintIndex)
		{

			//if(reader != null && blockPos != null)
			//{
				//return BiomeColors.getFoliageColor(reader , blockPos);
			//}
			return getBirch();
		}
	}
	
	public static int getBirch() {
		return 8431445;
	}

}
