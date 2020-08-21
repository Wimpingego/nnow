package com.github.wimpingego.nnow.objects.blocks;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
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
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class LavaWell extends Block {
	
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
	
	public LavaWell(Properties properties)
	{
		super(properties);		
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
	   
	   if (itemstack.getItem() == Items.BUCKET)
	   {
		   itemstack.shrink(1);
		   ItemStack itemstack1;
		   itemstack1 = new ItemStack(Items.LAVA_BUCKET);
	    
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
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.nnow.lavawell.line1")));
		tooltip.add((new TranslationTextComponent("item.nnow.lavawell.general.line1")));
	}
}