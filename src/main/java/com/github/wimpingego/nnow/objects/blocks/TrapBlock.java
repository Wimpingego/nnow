package com.github.wimpingego.nnow.objects.blocks;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DirectionalBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class TrapBlock<IBlockState> extends Block {
	public static final VoxelShape NORTH_SHAPE = makeCuboidShape(0.05D * 16, 0.05D * 16, 0.0D * 16, 0.95 * 16,
			0.95D * 16, 0.25D * 16);

	public static final VoxelShape WEST_SHAPE = makeCuboidShape(0.0D * 16, 0.05D * 16, 0.05D * 16, 0.25D * 16,
			0.95D * 16, 0.95D * 16);

	public static final VoxelShape SOUTH_SHAPE = makeCuboidShape(0.05D * 16, 0.05D * 16, 0.75D * 16, 0.95D * 16,
			0.95D * 16, 1.0 * 16);

	public static final VoxelShape EAST_SHAPE = makeCuboidShape(0.75D * 16, 0.05D * 16, 0.05D * 16, 1.0D * 16,
			0.95D * 16, 0.95D * 16);

	public static final VoxelShape UP_SHAPE = makeCuboidShape(0.05D * 16, 0.0D * 16, 0.05D * 16, 0.95D * 16, 0.25D * 16,
			0.95D * 16);

	public static final VoxelShape DOWN_SHAPE = makeCuboidShape(0.05D * 16, 0.75D * 16, 0.1D * 16, 0.9D * 16, 1.0D * 16,
			0.9D * 16);

	public static final DirectionProperty NORTH = DirectionalBlock.FACING;
	public static final DirectionProperty EAST = DirectionalBlock.FACING;
	public static final DirectionProperty SOUTH = DirectionalBlock.FACING;
	public static final DirectionProperty WEST = DirectionalBlock.FACING;
	public static final DirectionProperty UP = DirectionalBlock.FACING;
	public static final DirectionProperty DOWN = DirectionalBlock.FACING;

	public TrapBlock(Properties properties) {
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
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}

	private void setBlockBounds(float f, float g, float h, float i, float j, float k) {
		// TODO Auto-generated method stub

	}

	@Override
	@Deprecated
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		switch (state.get(BlockStateProperties.FACING)) {
		case DOWN:
			return DOWN_SHAPE;
		case EAST:
			return WEST_SHAPE;
		case NORTH:
			return SOUTH_SHAPE;
		case SOUTH:
			return NORTH_SHAPE;
		case UP:
			return UP_SHAPE;
		case WEST:
			return EAST_SHAPE;
		default:
			return VoxelShapes.fullCube();
		}
	}

	public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos,
			ISelectionContext context) {
		return this.getShape(state, worldIn, pos, context);
	}
	
	@Override
	public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
		if (entityIn instanceof LivingEntity && entityIn.getType() != EntityType.PLAYER
				&& entityIn.getType() != EntityType.VILLAGER) {
			entityIn.attackEntityFrom(DamageSource.CRAMMING, 25.F);
		}
	}
}
