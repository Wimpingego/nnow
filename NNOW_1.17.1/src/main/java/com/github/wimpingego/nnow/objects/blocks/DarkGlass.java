package com.github.wimpingego.nnow.objects.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.github.wimpingego.nnow.util.IExplosionResistant;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StainedGlassBlock;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.BlockGetter;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class DarkGlass extends StainedGlassBlock implements IExplosionResistant{

	public DarkGlass() {
		super(DyeColor.BLACK, Properties.of(Material.GLASS).sound(SoundType.GLASS).noOcclusion().strength(0.3f, 3600000.0F));
	}
    
	@Override
    public int getLightBlock (BlockState state, BlockGetter world, BlockPos pos) {
        
        return world.getMaxLightLevel();
    }
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslatableComponent("item.nnow.witherproof.line1")));
	}   
}
