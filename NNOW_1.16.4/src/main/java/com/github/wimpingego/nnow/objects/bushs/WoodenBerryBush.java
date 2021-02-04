package com.github.wimpingego.nnow.objects.bushs;

import com.github.wimpingego.nnow.init.BlockList;
import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.util.config.ModConfigs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
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


public class WoodenBerryBush extends BaseBerryBush
{
	   int Nugget = ModConfigs.WOODEN_NUGGETS.get();
	   
	   public WoodenBerryBush(Block.Properties properties) {
	      super(properties);
	      this.setDefaultState(this.stateContainer.getBaseState().with(AGE, Integer.valueOf(0)));
	   }

	   public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
		      return new ItemStack(BlockList.WOODEN_BERRY_BUSH.get());
		   }
	   
	   @Override
		public ActionResultType onBlockActivated(BlockState p_225533_1_, World p_225533_2_, BlockPos p_225533_3_, PlayerEntity p_225533_4_, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
		      int i = p_225533_1_.get(AGE);
		      boolean flag = i == 3;
		      if (!flag && p_225533_4_.getHeldItem(p_225533_5_).getItem() == Items.BONE_MEAL) {
		         return ActionResultType.PASS;
		      } else if (i > 1) {
		    	 int j = Nugget + p_225533_2_.rand.nextInt(2);
		         spawnAsEntity(p_225533_2_, p_225533_3_, new ItemStack(ItemList.WOODEN_NUGGET.get(), j + (flag ? 1 : 0)));
		         p_225533_2_.playSound((PlayerEntity)null, p_225533_3_, SoundEvents.ITEM_SWEET_BERRIES_PICK_FROM_BUSH, SoundCategory.BLOCKS, 1.0F, 0.8F + p_225533_2_.rand.nextFloat() * 0.4F);
		         p_225533_2_.setBlockState(p_225533_3_, p_225533_1_.with(AGE, Integer.valueOf(1)), 2);
		         return ActionResultType.SUCCESS;
		      } else {
		         return super.onBlockActivated(p_225533_1_, p_225533_2_, p_225533_3_, p_225533_4_, p_225533_5_, p_225533_6_);
		      }
		   }
}