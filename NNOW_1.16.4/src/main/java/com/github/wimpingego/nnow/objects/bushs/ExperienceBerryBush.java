package com.github.wimpingego.nnow.objects.bushs;

import com.github.wimpingego.nnow.init.BlockList;
import com.github.wimpingego.nnow.util.config.ModConfigs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;


public class ExperienceBerryBush extends BaseBerryBush
{
	   int  xpPoints = ModConfigs.XP_POINTS.get();
	   
	   public ExperienceBerryBush(Block.Properties properties) {
	      super(properties);
	      this.setDefaultState(this.stateContainer.getBaseState().with(AGE, Integer.valueOf(0)));
	   }

	   public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
		      return new ItemStack(BlockList.XP_BERRY_BUSH.get());
		   }
	   
	   @Override
		 public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		      int i = state.get(AGE);
		         boolean flag = i == 3;
		        if(!flag && player.getHeldItem(handIn).getItem() == Items.BONE_MEAL) {
		             return ActionResultType.PASS;
		         } else if (i > 1) {
		             worldIn.addEntity(new ExperienceOrbEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), xpPoints));
		             worldIn.playSound((PlayerEntity) null, pos, SoundEvents.ITEM_SWEET_BERRIES_PICK_FROM_BUSH, SoundCategory.BLOCKS, 1.0f, 0.8F + worldIn.rand.nextFloat() * 0.4F);
		             worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(1)), 2);
		             return ActionResultType.SUCCESS;
		         } else {
		             return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
		         }
		     }
}
	   
	   
	   

