package com.github.wimpingego.nnow.util;

import com.github.wimpingego.nnow.init.BlockList;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class SlabAction 
{

    @SuppressWarnings("deprecation")
	public static ActionResultType onItemUseSpade(BlockState state,  World worldIn, BlockPos pos,
            PlayerEntity playerIn, Hand hand, BlockRayTraceResult p_225533_6_)
    {
		
		ItemUseContext context = new ItemUseContext(playerIn, hand, p_225533_6_);
		World world = context.getWorld();
		BlockPos blockpos = context.getPos();
		
		if (context.getFace() != Direction.DOWN && world.getBlockState(blockpos.up()).isAir())
		{
		    BlockState blockstate = BlockList.PATH_SLAB.get().getDefaultState().with(SlabBlock.TYPE, state.get(SlabBlock.TYPE)).with(SlabBlock.WATERLOGGED, state.get(SlabBlock.WATERLOGGED));
		    
		    if (blockstate != null)
		    {
				PlayerEntity playerentity = context.getPlayer();
				world.playSound(playerentity, blockpos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1.0F, 1.0F);			    
				world.setBlockState(blockpos, blockstate);
			    if (playerentity != null)
			    {
				context.getItem().damageItem(1, playerentity, (p_220043_1_) -> {
					    p_220043_1_.sendBreakAnimation(context.getHand());
					});
			    }
			    return ActionResultType.SUCCESS;
		    }
		}
    	return ActionResultType.FAIL;
    }
}
