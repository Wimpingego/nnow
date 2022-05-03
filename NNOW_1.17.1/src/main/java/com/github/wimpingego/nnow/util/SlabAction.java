package com.github.wimpingego.nnow.util;

import com.github.wimpingego.nnow.init.BlockList;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.InteractionResult;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;

public class SlabAction 
{

    @SuppressWarnings("deprecation")
	public static InteractionResult onItemUseSpade(BlockState state,  Level worldIn, BlockPos pos,
            Player playerIn, InteractionHand hand, BlockHitResult p_225533_6_)
    {
		
		UseOnContext context = new UseOnContext(playerIn, hand, p_225533_6_);
		Level world = context.getLevel();
		BlockPos blockpos = context.getClickedPos();
		
		if (context.getClickedFace() != Direction.DOWN && world.getBlockState(blockpos.above()).isAir())
		{
		    BlockState blockstate = BlockList.PATH_SLAB.get().defaultBlockState().setValue(SlabBlock.TYPE, state.getValue(SlabBlock.TYPE)).setValue(SlabBlock.WATERLOGGED, state.getValue(SlabBlock.WATERLOGGED));
		    
		    if (blockstate != null)
		    {
				Player playerentity = context.getPlayer();
				world.playSound(playerentity, blockpos, SoundEvents.SHOVEL_FLATTEN, SoundSource.BLOCKS, 1.0F, 1.0F);			    
				world.setBlockAndUpdate(blockpos, blockstate);
			    if (playerentity != null)
			    {
				context.getItemInHand().hurtAndBreak(1, playerentity, (p_220043_1_) -> {
					    p_220043_1_.broadcastBreakEvent(context.getHand());
					});
			    }
			    return InteractionResult.SUCCESS;
		    }
		}
    	return InteractionResult.FAIL;
    }
}
