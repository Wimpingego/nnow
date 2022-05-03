package com.github.wimpingego.nnow.objects.blocks.slabs;

import com.github.wimpingego.nnow.util.IExplosionResistant;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

/*
  @author: Naxanria
*/
public class SuperObsidianSlab extends SlabBlock implements IExplosionResistant
{
  public SuperObsidianSlab() {
      super(Properties.of(Material.METAL).sound(SoundType.METAL).strength(0.5f, 3600000.0F));
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

  @OnlyIn(Dist.CLIENT)
  public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn)
  {
	  super.appendHoverText(stack, worldIn, tooltip, flagIn);
	  tooltip.add((new TranslatableComponent("item.nnow.witherproof.line1")));
  }
}
