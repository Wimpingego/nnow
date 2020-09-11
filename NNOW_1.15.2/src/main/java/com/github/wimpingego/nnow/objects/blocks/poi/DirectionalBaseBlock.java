package com.github.wimpingego.nnow.objects.blocks.poi;

import javax.annotation.Nullable;
import com.github.wimpingego.nnow.util.ModConfigs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DirectionalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;

public class DirectionalBaseBlock extends DirectionalBlock {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

	int wcost = ModConfigs.W_COST.get();
	int wreturn = ModConfigs.W_RETURN.get();
	int scost = ModConfigs.S_COST.get();
	int sreturn = ModConfigs.S_RETURN.get();
	int icost = ModConfigs.I_COST.get();
	int ireturn = ModConfigs.I_RETURN.get();
	int gcost = ModConfigs.G_COST.get();
	int greturn = ModConfigs.G_RETURN.get();
	int dcost = ModConfigs.D_COST.get();
	int dreturn = ModConfigs.D_RETURN.get();
	
	public DirectionalBaseBlock(Properties properties)
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