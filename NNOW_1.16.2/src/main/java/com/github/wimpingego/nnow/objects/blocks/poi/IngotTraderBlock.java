package com.github.wimpingego.nnow.objects.blocks.poi;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;

public class IngotTraderBlock extends Block {
	
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    
	public IngotTraderBlock(Properties properties)
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
}
