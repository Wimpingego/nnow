package com.github.wimpingego.nnow.objects.blocks.traps;


import java.util.List;

import javax.annotation.Nullable;

import com.github.wimpingego.nnow.util.IExplosionResistant;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class WitherTrapBlock extends TrapBaseBlock implements IExplosionResistant{
	
	public WitherTrapBlock(Properties properties, TrapType type) {
		super(properties, type);
	}

	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.nnow.witherproof.line1")));
	}  
}