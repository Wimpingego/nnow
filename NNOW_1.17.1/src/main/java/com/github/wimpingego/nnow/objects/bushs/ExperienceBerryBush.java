package com.github.wimpingego.nnow.objects.bushs;

import com.github.wimpingego.nnow.init.BlockList;
import com.github.wimpingego.nnow.util.config.ModConfigs;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.ExperienceOrb;
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


public class ExperienceBerryBush extends BaseBerryBush
{
	   int  xpPoints = ModConfigs.XP_POINTS.get();
	   
	   public ExperienceBerryBush(Block.Properties properties) {
	      super(properties);
	      this.registerDefaultState(this.stateDefinition.any().setValue(AGE, Integer.valueOf(0)));
	   }

	   public ItemStack getCloneItemStack(BlockGetter worldIn, BlockPos pos, BlockState state) {
		      return new ItemStack(BlockList.XP_BERRY_BUSH.get());
		   }
	   
	   @Override
		 public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
		      int i = state.getValue(AGE);
		         boolean flag = i == 3;
		        if(!flag && player.getItemInHand(handIn).getItem() == Items.BONE_MEAL) {
		             return InteractionResult.PASS;
		         } else if (i > 1) {
		             worldIn.addFreshEntity(new ExperienceOrb(worldIn, pos.getX(), pos.getY(), pos.getZ(), xpPoints));
		             worldIn.playSound((Player) null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0f, 0.8F + worldIn.random.nextFloat() * 0.4F);
		             worldIn.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);
		             return InteractionResult.SUCCESS;
		         } else {
		             return super.use(state, worldIn, pos, player, handIn, hit);
		         }
		     }
}
	   
	   
	   

