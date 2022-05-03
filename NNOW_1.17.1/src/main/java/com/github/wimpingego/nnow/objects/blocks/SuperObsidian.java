package com.github.wimpingego.nnow.objects.blocks;
import java.util.List;

import javax.annotation.Nullable;

import com.github.wimpingego.nnow.util.IExplosionResistant;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.BlockGetter;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

/*
  @author: Naxanria
*/
public class SuperObsidian extends Block implements IExplosionResistant
{
  public SuperObsidian() {
      super(Properties.of(Material.METAL).sound(SoundType.METAL).strength(0.5f, 3600000.0F));
  }
  
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslatableComponent("item.nnow.witherproof.line1")));
	}
}
