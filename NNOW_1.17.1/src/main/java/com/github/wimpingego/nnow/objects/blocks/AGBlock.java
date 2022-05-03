package com.github.wimpingego.nnow.objects.blocks;

import com.github.wimpingego.nnow.init.BlockList;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class AGBlock extends Block {

	public AGBlock(Properties properties) {
    		super(properties);
	}

	   @Override
	   public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, net.minecraftforge.common.IPlantable plantable) {
	      BlockState plant = plantable.getPlant(world, pos.relative(facing));
	      net.minecraftforge.common.PlantType type = plantable.getPlantType(world, pos.relative(facing));

	      if (plant.getBlock() == Blocks.CACTUS)
	         return state.is(Blocks.CACTUS) || this == BlockList.AGG_BLOCK.get()
						|| this == BlockList.AGRS_BLOCK.get() || this == BlockList.AGS_BLOCK.get();

	      if (plant.getBlock() == Blocks.SUGAR_CANE && this == Blocks.SUGAR_CANE)
	         return true;

	      //if (plantable instanceof BushBlock && ((BushBlock)plantable).isValidGround(state, world, pos))
	         //return true;

	      if (net.minecraftforge.common.PlantType.DESERT.equals(type)) {
				return this == BlockList.AGG_BLOCK.get() || this == BlockList.AGRS_BLOCK.get() || this == BlockList.AGS_BLOCK.get();
//	      } else if (net.minecraftforge.common.PlantType.NETHER.equals(type)) {
//	         return this.getBlock() == Blocks.SOUL_SAND;
//	      } else if (net.minecraftforge.common.PlantType.CROP.equals(type)) {
//	         return state.isIn(Blocks.FARMLAND);
//	      } else if (net.minecraftforge.common.PlantType.CAVE.equals(type)) {
//	         return Block.hasSolidSide(state, world, pos, Direction.UP);
	      } else if (net.minecraftforge.common.PlantType.PLAINS.equals(type)) {
				return this == BlockList.AGG_BLOCK.get() || this == BlockList.AGRS_BLOCK.get() || this == BlockList.AGS_BLOCK.get();
	      } else if (net.minecraftforge.common.PlantType.WATER.equals(type)) {
	         return state.getMaterial() == net.minecraft.world.level.material.Material.WATER; //&& state.getValue(BlockLiquidWrapper)
	      } else if (net.minecraftforge.common.PlantType.BEACH.equals(type)) {
	         boolean isBeach = this == BlockList.AGG_BLOCK.get() || this == BlockList.AGRS_BLOCK.get() || this == BlockList.AGS_BLOCK.get();
	         boolean hasWater = false;
	         for (Direction face : Direction.Plane.HORIZONTAL) {
	             BlockState blockState = world.getBlockState(pos.relative(face));
	             net.minecraft.world.level.material.FluidState fluidState = world.getFluidState(pos.relative(face));
	             hasWater |= blockState.is(Blocks.FROSTED_ICE);
	             hasWater |= fluidState.is(net.minecraft.tags.FluidTags.WATER);
	             if (hasWater)
	                break; //No point continuing.
	         }

	         for (Direction face : Direction.Plane.VERTICAL) {
	             BlockState blockState = world.getBlockState(pos.relative(face));
	             net.minecraft.world.level.material.FluidState fluidState = world.getFluidState(pos.relative(face));
	             hasWater |= blockState.is(Blocks.FROSTED_ICE);
	             hasWater |= fluidState.is(net.minecraft.tags.FluidTags.WATER);
	             if (hasWater)
	                break; //No point continuing.
	         }
	         return isBeach && hasWater;
	      }
	      return false;
	  }
}
