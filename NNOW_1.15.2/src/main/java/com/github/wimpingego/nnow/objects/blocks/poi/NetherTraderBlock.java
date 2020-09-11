package com.github.wimpingego.nnow.objects.blocks.poi;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DirectionalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;



public class NetherTraderBlock<IBlockState> extends Block {
	public static final VoxelShape NORTHS = makeCuboidShape(0.0D*16, 0.0D*16, 0.0D*16, 1.0D*16, 1.0D*16, 1.0D*16);
	public static final VoxelShape WESTS = makeCuboidShape(0.0D*16, 0.0D*16, 0.0D*16, 1.0D*16, 1.0D*16, 1.0D*16);
	public static final VoxelShape SOUTHS = makeCuboidShape(0.0D*16, 0.0D*16, 0.0D*16, 1.0D*16, 1.0D*16, 1.0D*16);
	public static final VoxelShape EASTS = makeCuboidShape(0.0D*16, 0.0D*16, 0.0D*16, 1.0D*16, 1.0D*16, 1.0D*16);
	public static final VoxelShape UPS = makeCuboidShape(0.0D*16, 0.0D*16, 0.0D*16, 1.0D*16, 1.0D*16, 1.0D*16);
	public static final VoxelShape DOWNS = makeCuboidShape(0.0D*16, 0.0D*16, 0.0D*16, 1.0D*16, 1.0D*16, 1.0D*16);
	
	public static final DirectionProperty NORTH = DirectionalBlock.FACING;
	public static final DirectionProperty EAST = DirectionalBlock.FACING;
	public static final DirectionProperty SOUTH = DirectionalBlock.FACING;
	public static final DirectionProperty WEST = DirectionalBlock.FACING;
	public static final DirectionProperty UP = DirectionalBlock.FACING;
	public static final DirectionProperty DOWN = DirectionalBlock.FACING;

	public NetherTraderBlock(Properties properties) {
		super(properties);
}

	@Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
       return this.getDefaultState().with(NORTH, context.getNearestLookingDirection().getOpposite());
    }

	@Override
    public BlockState rotate(BlockState state, IWorld world, BlockPos pos, Rotation direction) {
        return state.with(NORTH, direction.rotate(state.get(SOUTH)));
    }

	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		builder.add(NORTH);
	}
	
	public void setBlockBoundsForItemRender() {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
    }

	private void setBlockBounds(float f, float g, float h, float i, float j, float k) {		
	}

	@Override
	@Deprecated
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		switch(state.get(BlockStateProperties.FACING)) {
		case DOWN:
			return DOWNS;
		case EAST:
			return EASTS;
		case NORTH:
			return NORTHS;
		case SOUTH:
			return SOUTHS;
		case UP:
			return UPS;
		case WEST:
			return WESTS;
		default:
			return NORTHS;
		}
	}

	public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return this.getShape(state, worldIn, pos, context);
	}
}
