package com.github.wimpingego.nnow.objects.blocks.traps;


import javax.annotation.Nullable;

import com.github.wimpingego.nnow.util.NNOWFakePlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

/*
@author: Naxanria 

@edits: Wimpingego
*/
public class TrapBaseBlock extends Block{
	
	public static final VoxelShape NORTH_SHAPE = box(0.05D * 16, 0.05D * 16, 0.0D * 16, 0.95 * 16,
			0.95D * 16, 0.25D * 16);

	public static final VoxelShape WEST_SHAPE = box(0.0D * 16, 0.05D * 16, 0.05D * 16, 0.25D * 16,
			0.95D * 16, 0.95D * 16);

	public static final VoxelShape SOUTH_SHAPE = box(0.05D * 16, 0.05D * 16, 0.75D * 16, 0.95D * 16,
			0.95D * 16, 1.0 * 16);

	public static final VoxelShape EAST_SHAPE = box(0.75D * 16, 0.05D * 16, 0.05D * 16, 1.0D * 16,
			0.95D * 16, 0.95D * 16);

	public static final VoxelShape UP_SHAPE = box(0.05D * 16, 0.0D * 16, 0.05D * 16, 0.95D * 16, 0.25D * 16,
			0.95D * 16);

	public static final VoxelShape DOWN_SHAPE = box(0.05D * 16, 0.75D * 16, 0.1D * 16, 0.9D * 16, 1.0D * 16,
			0.9D * 16);

	public static final DirectionProperty NORTH = DirectionalBlock.FACING;
	public static final DirectionProperty EAST = DirectionalBlock.FACING;
	public static final DirectionProperty SOUTH = DirectionalBlock.FACING;
	public static final DirectionProperty WEST = DirectionalBlock.FACING;
	public static final DirectionProperty UP = DirectionalBlock.FACING;
	public static final DirectionProperty DOWN = DirectionalBlock.FACING;


private final TrapType type;

public TrapBaseBlock(Properties properties, TrapType type)
{
  super(properties);
  this.type = type;
}

@Nullable
@Override
public BlockState getStateForPlacement(BlockPlaceContext context) {
	return this.defaultBlockState().setValue(NORTH, context.getNearestLookingDirection().getOpposite());
}

@Override
public BlockState rotate(BlockState state, LevelAccessor world, BlockPos pos, Rotation direction) {
	return state.setValue(NORTH, direction.rotate(state.getValue(SOUTH)));
}

@Override
protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
	builder.add(NORTH);
}

//public void stepOn(Level p_152431_, BlockPos p_152432_, BlockState p_152433_, Entity p_152434_) {
//}

public void stepOn(Level p_152431_, BlockPos p_152432_, BlockState p_152433_,Entity p_152434_) {
	if (p_152434_ instanceof LivingEntity && p_152434_.getType() != EntityType.PLAYER
	&& p_152434_.getType() != EntityType.VILLAGER)

  if (!p_152431_.isClientSide)
  {
    if (p_152434_ instanceof LivingEntity)
    {
      LivingEntity livingEntity = (LivingEntity) p_152434_;
      if (type.lethal || livingEntity.getHealth() > 1f)
      {
    	TrapDamageSource spikeDmgSource = new TrapDamageSource(type);
        if (type.isPlayer)
        {
        	NNOWFakePlayer fakePlayer = NNOWFakePlayer.getInstance((ServerLevel) p_152431_).get();

          if (fakePlayer != null)
          {
            spikeDmgSource.setSource(fakePlayer);
          }
        }

        livingEntity.hurt(spikeDmgSource, type.damage);
      }
    }
  }
}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		switch (state.getValue(BlockStateProperties.FACING)) {
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
			return NORTH_SHAPE;
		}
	}	
}