package com.github.wimpingego.nnow.objects.blocks;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.BlockGetter;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class HydroTank extends Block {
	    
    public HydroTank(Properties properties) {
		super(properties);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return Fluids.WATER.getFlowing(2, false);
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext useContext) {
        return false;
    }
    
	public static class ColorHandler implements BlockColor 
	{
		public int getColor(BlockState state, @Nullable BlockAndTintGetter reader , @Nullable BlockPos blockPos, int tintIndex)
		{
			return getWaterBase();
		}
	}
	
	public static int getWaterBase() {
		return 4159182;
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslatableComponent("item.nnow.hydrotank.line1")));
		tooltip.add((new TranslatableComponent("item.nnow.hydrotank.line2")));
	}
	
}