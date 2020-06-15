package com.github.wimpingego.nnow.objects.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.github.wimpingego.nnow.util.IExplosionResistant;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class DarkGlass extends StainedGlassBlock implements IExplosionResistant{

	public DarkGlass() {
		super(DyeColor.BLACK, Properties.create(Material.GLASS).sound(SoundType.GLASS).notSolid().hardnessAndResistance(0.3f, 3600000.0F)
	      		.harvestLevel(2));
	}
    
	@Override
    public int getOpacity (BlockState state, IBlockReader world, BlockPos pos) {
        
        return world.getMaxLightLevel();
    }
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.nnow.witherproof.line1").applyTextStyle(TextFormatting.GRAY)));
	}   
}
