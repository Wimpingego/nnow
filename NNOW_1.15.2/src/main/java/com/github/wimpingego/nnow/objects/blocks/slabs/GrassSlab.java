package com.github.wimpingego.nnow.objects.blocks.slabs;

import javax.annotation.Nullable;

import com.github.wimpingego.nnow.NNOW;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.GrassColors;
import net.minecraft.world.ILightReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import com.github.wimpingego.nnow.util.SlabAction;

@EventBusSubscriber(modid=NNOW.MOD_ID, bus=Bus.MOD, value=Dist.CLIENT)
public class GrassSlab extends SlabBlock
{
	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public GrassSlab(Properties properties)
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

			if(reader != null && blockPos != null)
			{
				return BiomeColors.getGrassColor(reader, blockPos);
			}
			return GrassColors.get(0.5D, 1.0D);
		}
	}

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos,
            PlayerEntity playerIn, Hand hand, BlockRayTraceResult p_225533_6_)
    {
    	
		ItemStack itemStack = playerIn.getHeldItem(hand);
			
		if (itemStack.getItem() instanceof ShovelItem)
			return SlabAction.onItemUseSpade(state, worldIn, pos, playerIn, hand, p_225533_6_);

        return ActionResultType.FAIL;
        
    }
	
}
