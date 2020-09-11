package com.github.wimpingego.nnow.objects.blocks;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class HydroTank extends Block {
	    
    public HydroTank(Properties properties) {
		super(properties);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return Fluids.WATER.getFlowingFluidState(2, false);
    }

    @Override
    public boolean isReplaceable(BlockState state, BlockItemUseContext useContext) {
        return false;
    }
    
	public static class ColorHandler implements IBlockColor 
	{
		public int getColor(BlockState state, @Nullable IBlockDisplayReader reader , @Nullable BlockPos blockPos, int tintIndex)
		{
			return getWaterBase();
		}
	}
	
	public static int getWaterBase() {
		return 4159182;
	}
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.nnow.hydrotank.line1")));
		tooltip.add((new TranslationTextComponent("item.nnow.hydrotank.line2")));
	}
	
//    @Override
//    public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
//        return 15;
//    }
	
}