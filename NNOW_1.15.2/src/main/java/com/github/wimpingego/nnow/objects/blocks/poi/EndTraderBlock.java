package com.github.wimpingego.nnow.objects.blocks.poi;

import com.github.wimpingego.nnow.init.ItemList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class EndTraderBlock extends Block {
    
	public EndTraderBlock(Properties properties) {
		super(properties);
	}
    
	@SuppressWarnings("deprecation")
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
	{
	   ItemStack itemstack = player.getHeldItem(handIn);
	   
	   if (itemstack.getItem() == ItemList.DEATH_POTATO.get())
	   {
		   itemstack.shrink(1);
		   ItemStack itemstack1;
		   itemstack1 = new ItemStack(Items.ENDER_PEARL,8 + RANDOM.nextInt(4));
	    
		   if (itemstack.isEmpty())
	       {
	           player.setHeldItem(handIn, itemstack1);
	           
	           return ActionResultType.SUCCESS;
	       }
	       else if (!player.inventory.addItemStackToInventory(itemstack1))
	       {
	    	   player.dropItem(itemstack1, false);
        
	    	   return ActionResultType.SUCCESS;
	       } 
	   }
	   
	   if (itemstack.getItem() == Items.STONE)
	   {
		   itemstack.shrink(1);
		   ItemStack itemstack1;
		   itemstack1 = new ItemStack(Items.END_STONE,1 + RANDOM.nextInt(2));
	    
		   if (itemstack.isEmpty())
	       {
	           player.setHeldItem(handIn, itemstack1);
	           
	           return ActionResultType.SUCCESS;
	       }
	       else if (!player.inventory.addItemStackToInventory(itemstack1))
	       {
	    	   player.dropItem(itemstack1, false);
        
	    	   return ActionResultType.SUCCESS;
	       } 
	   }
	   
	   if (itemstack.getItem() == Items.STONE_BRICKS)
	   {
		   itemstack.shrink(1);
		   ItemStack itemstack1;
		   itemstack1 = new ItemStack(Items.END_STONE_BRICKS,1 + RANDOM.nextInt(2));
	    
		   if (itemstack.isEmpty())
	       {
	           player.setHeldItem(handIn, itemstack1);
	           
	           return ActionResultType.SUCCESS;
	       }
	       else if (!player.inventory.addItemStackToInventory(itemstack1))
	       {
	    	   player.dropItem(itemstack1, false);
        
	    	   return ActionResultType.SUCCESS;
	       } 
	   }
	   
	   return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
	}
	
}
