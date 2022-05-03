package com.github.wimpingego.nnow.bushes.base;

import com.github.wimpingego.nnow.bushes.BaseBerryBush;
import com.github.wimpingego.nnow.setup.Configs;
import com.github.wimpingego.nnow.setup.Registration;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;


public class StoneBerryBush extends BaseBerryBush
{
	   int Nugget = Configs.STONE_DUST.get();

	   public StoneBerryBush(Properties properties) {
	      super(properties);
	      this.registerDefaultState(this.stateDefinition.any().setValue(AGE, Integer.valueOf(0)));
	   }

	   public ItemStack getCloneItemStack(BlockGetter worldIn, BlockPos pos, BlockState state) {
		      return new ItemStack(Registration.STONE_BERRY_BUSH.get());
		   }
	   
	   @Override
		public InteractionResult use(BlockState p_225533_1_, Level p_225533_2_, BlockPos p_225533_3_, Player p_225533_4_, InteractionHand p_225533_5_, BlockHitResult p_225533_6_) {
		      int i = p_225533_1_.getValue(AGE);
		      boolean flag = i == 3;
		      if (!flag && p_225533_4_.getItemInHand(p_225533_5_).getItem() == Items.BONE_MEAL) {
		         return InteractionResult.PASS;
		      } else if (i > 1) {
		    	 int j = Nugget + p_225533_2_.random.nextInt(2);
		         popResource(p_225533_2_, p_225533_3_, new ItemStack(Registration.STONE_DUST.get(), j + (flag ? 0 : 0)));
		         p_225533_2_.playSound((Player)null, p_225533_3_, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_225533_2_.random.nextFloat() * 0.4F);
		         p_225533_2_.setBlock(p_225533_3_, p_225533_1_.setValue(AGE, Integer.valueOf(1)), 2);
		         return InteractionResult.SUCCESS;
		      } else {
		         return super.use(p_225533_1_, p_225533_2_, p_225533_3_, p_225533_4_, p_225533_5_, p_225533_6_);
		      }
		   }
}
	   
	   
	   

