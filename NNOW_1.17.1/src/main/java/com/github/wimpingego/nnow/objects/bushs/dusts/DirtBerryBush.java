package com.github.wimpingego.nnow.objects.bushs.dusts;

import com.github.wimpingego.nnow.init.BlockList;
import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.objects.bushs.BaseBerryBush;
import com.github.wimpingego.nnow.util.config.ModConfigs;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;


public class DirtBerryBush extends BaseBerryBush
{
	   int Dust = ModConfigs.DIRT_DUST.get();
	   
	   public DirtBerryBush(Block.Properties properties) {
	      super(properties);
	      this.registerDefaultState(this.stateDefinition.any().setValue(AGE, Integer.valueOf(0)));
	   }

	   public ItemStack getCloneItemStack(BlockGetter worldIn, BlockPos pos, BlockState state) {
		      return new ItemStack(BlockList.DIRT_BERRY_BUSH.get());
		   }
	   
	   @Override
		public InteractionResult use(BlockState p_225533_1_, Level p_225533_2_, BlockPos p_225533_3_, Player p_225533_4_, InteractionHand p_225533_5_, BlockHitResult p_225533_6_) {
		      int i = p_225533_1_.getValue(AGE);
		      boolean flag = i == 3;
		      if (!flag && p_225533_4_.getItemInHand(p_225533_5_).getItem() == Items.BONE_MEAL) {
		         return InteractionResult.PASS;
		      } else if (i > 1) {
		    	 int j = Dust + p_225533_2_.random.nextInt(2);
		         popResource(p_225533_2_, p_225533_3_, new ItemStack(ItemList.DIRT_DUST.get(), j + (flag ? 1 : 0)));
		         p_225533_2_.playSound((Player)null, p_225533_3_, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_225533_2_.random.nextFloat() * 0.4F);
		         p_225533_2_.setBlock(p_225533_3_, p_225533_1_.setValue(AGE, Integer.valueOf(1)), 2);
		         return InteractionResult.SUCCESS;
		      } else {
		         return super.use(p_225533_1_, p_225533_2_, p_225533_3_, p_225533_4_, p_225533_5_, p_225533_6_);
		      }
		   }
}
	   
	   
	   

