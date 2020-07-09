package com.github.wimpingego.nnow.objects.blocks;

import javax.annotation.Nullable;
import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.util.ModConfigs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class RedstoneGolemHead extends Block {
	
	private static final VoxelShape RENDER_SHAPE = VoxelShapes.create(1 / 16f, 1 / 16f, 1 / 16f, 15 / 16f, 15 / 16f, 15 / 16f);
	 
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    double DropChance = ModConfigs.DROP_CHANCE.get();
    
	public RedstoneGolemHead(Properties properties) {
		super(properties);
	}

    @Override
    public VoxelShape getRenderShape(BlockState p_196247_1_, IBlockReader p_196247_2_, BlockPos p_196247_3_) {
        return RENDER_SHAPE;
    }
	
    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }
    
    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    } 
    
	@SuppressWarnings("deprecation")
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
	{
	   ItemStack itemstack = player.getHeldItem(handIn);
	   
	   //DUST TO BLOCK
	   
	   if (itemstack.getItem() == Items.REDSTONE)
	   {
		   itemstack.shrink(1);
		   ItemStack itemstack1;
		   itemstack1 = new ItemStack(Items.REDSTONE, 1 + RANDOM.nextInt(2));
		   
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
	   
	   //NNOW DUST
	   
	   if (itemstack.getItem() == ItemList.STONE_DUST.get())
	   {
		   itemstack.shrink(1);
		   ItemStack itemstack1;
		   itemstack1 = new ItemStack(ItemList.STONE_DUST.get(), 1 + RANDOM.nextInt(2));
	    
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
	   
	   if (itemstack.getItem() == ItemList.SAND_DUST.get())
	   {
		   itemstack.shrink(1);
		   ItemStack itemstack1;
		   itemstack1 = new ItemStack(ItemList.SAND_DUST.get(), 1 + RANDOM.nextInt(2));
	    
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
	   
	   if (itemstack.getItem() == ItemList.DIRT_DUST.get())
	   {
		   itemstack.shrink(1);
		   ItemStack itemstack1;
		   itemstack1 = new ItemStack(ItemList.DIRT_DUST.get(), 1 + RANDOM.nextInt(2));
	    
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
	   
	   if (itemstack.getItem() == ItemList.GRAVEL_DUST.get())
	   {
		   itemstack.shrink(1);
		   ItemStack itemstack1;
		   itemstack1 = new ItemStack(ItemList.GRAVEL_DUST.get(), 1 + RANDOM.nextInt(2));
	    
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
	   
	   if (itemstack.getItem() == ItemList.CLAY_DUST.get())
	   {
		   itemstack.shrink(1);
		   ItemStack itemstack1;
		   itemstack1 = new ItemStack(ItemList.CLAY_DUST.get(), 1 + RANDOM.nextInt(2));
	    
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
	   
	   if (itemstack.getItem() == ItemList.DEATH_POTATO.get())
	   {
		   itemstack.shrink(1);
		   ItemStack itemstack1;
		   itemstack1 = new ItemStack(Items.DIAMOND,1 + RANDOM.nextInt(2));
	    
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
