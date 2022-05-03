package com.github.wimpingego.nnow.objects.blocks.poi;

import com.github.wimpingego.nnow.init.ItemList;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class EndTraderBlock extends Block {
    
	public EndTraderBlock(Properties properties) {
		super(properties);
	}

	public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit)
	{
		ItemStack itemstack = player.getItemInHand(handIn);

		if (itemstack.getItem() == ItemList.DEATH_POTATO.get())
		{
			itemstack.shrink(1);
			ItemStack itemstack1;
			itemstack1 = new ItemStack(Items.ENDER_PEARL, 8);

			if (itemstack.isEmpty())
			{
				player.setItemInHand(handIn, itemstack1);

				return InteractionResult.SUCCESS;
			}
			else if (!player.getInventory().add(itemstack1))
			{
				player.drop(itemstack1, false);

				return InteractionResult.SUCCESS;
			}
		}
//
//		if (itemstack.getItem() == Items.STONE)
//		{
//			itemstack.shrink(1);
//			ItemStack itemstack1;
//			itemstack1 = new ItemStack(Items.END_STONE, 8);
//
//			if (itemstack.isEmpty())
//			{
//				player.setItemInHand(handIn, itemstack1);
//
//				return InteractionResult.SUCCESS;
//			}
//			else if (!player.getInventory().add(itemstack1))
//			{
//				player.drop(itemstack1, false);
//
//				return InteractionResult.SUCCESS;
//			}
//		}
//
//		if (itemstack.getItem() == Items.STONE_BRICKS)
//		{
//			itemstack.shrink(1);
//			ItemStack itemstack1;
//			itemstack1 = new ItemStack(Items.END_STONE_BRICKS, 8);
//
//			if (itemstack.isEmpty())
//			{
//				player.setItemInHand(handIn, itemstack1);
//
//				return InteractionResult.SUCCESS;
//			}
//			else if (!player.getInventory().add(itemstack1))
//			{
//				player.drop(itemstack1, false);
//
//				return InteractionResult.SUCCESS;
//			}
//		}
		return super.use(state, worldIn, pos, player, handIn, hit);
	}
	
}
