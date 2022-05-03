package com.github.wimpingego.nnow.objects.blocks.slabs;

import javax.annotation.Nullable;

import com.github.wimpingego.nnow.NNOW;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.Level;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import com.github.wimpingego.nnow.util.SlabAction;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

@EventBusSubscriber(modid=NNOW.MOD_ID, bus=Bus.MOD, value=Dist.CLIENT)
public class GrassSlab extends SlabBlock
{
	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public GrassSlab(Properties properties)
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

			if(reader != null && blockPos != null)
			{
				return BiomeColors.getAverageGrassColor(reader, blockPos);
			}
			return GrassColor.get(0.5D, 1.0D);
		}
	}

    @Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos,
            Player playerIn, InteractionHand hand, BlockHitResult p_225533_6_)
    {
    	
		ItemStack itemStack = playerIn.getItemInHand(hand);
			
		if (itemStack.getItem() instanceof ShovelItem)
			return SlabAction.onItemUseSpade(state, worldIn, pos, playerIn, hand, p_225533_6_);

        return InteractionResult.FAIL;
        
    }
	
}
