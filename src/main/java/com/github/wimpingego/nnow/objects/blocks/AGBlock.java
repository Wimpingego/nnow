package com.github.wimpingego.nnow.objects.blocks;

import com.github.wimpingego.nnow.init.BlockList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class AGBlock extends Block {

	public AGBlock(Properties properties) {
    		super(properties);
	}

	   @Override
	   public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, net.minecraftforge.common.IPlantable plantable) {
	      BlockState plant = plantable.getPlant(world, pos.offset(facing));
	      net.minecraftforge.common.PlantType type = plantable.getPlantType(world, pos.offset(facing));

	      if (plant.getBlock() == Blocks.CACTUS)
	         return state.isIn(Blocks.CACTUS) || this.getBlock() == BlockList.AGG_BLOCK.get()
						|| this.getBlock() == BlockList.AGRS_BLOCK.get() || this.getBlock() == BlockList.AGS_BLOCK.get();

	      if (plant.getBlock() == Blocks.SUGAR_CANE && this == Blocks.SUGAR_CANE)
	         return true;

	      //if (plantable instanceof BushBlock && ((BushBlock)plantable).isValidGround(state, world, pos))
	         //return true;

	      if (net.minecraftforge.common.PlantType.DESERT.equals(type)) {
				return this.getBlock() == BlockList.AGG_BLOCK.get() || this.getBlock() == BlockList.AGRS_BLOCK.get() || this.getBlock() == BlockList.AGS_BLOCK.get();
//	      } else if (net.minecraftforge.common.PlantType.NETHER.equals(type)) {
//	         return this.getBlock() == Blocks.SOUL_SAND;
//	      } else if (net.minecraftforge.common.PlantType.CROP.equals(type)) {
//	         return state.isIn(Blocks.FARMLAND);
//	      } else if (net.minecraftforge.common.PlantType.CAVE.equals(type)) {
//	         return Block.hasSolidSide(state, world, pos, Direction.UP);
	      } else if (net.minecraftforge.common.PlantType.PLAINS.equals(type)) {
				return this.getBlock() == BlockList.AGG_BLOCK.get() || this.getBlock() == BlockList.AGRS_BLOCK.get() || this.getBlock() == BlockList.AGS_BLOCK.get();
	      } else if (net.minecraftforge.common.PlantType.WATER.equals(type)) {
	         return state.getMaterial() == net.minecraft.block.material.Material.WATER; //&& state.getValue(BlockLiquidWrapper)
	      } else if (net.minecraftforge.common.PlantType.BEACH.equals(type)) {
	         boolean isBeach = this.getBlock() == BlockList.AGG_BLOCK.get() || this.getBlock() == BlockList.AGRS_BLOCK.get() || this.getBlock() == BlockList.AGS_BLOCK.get();
	         boolean hasWater = false;
	         for (Direction face : Direction.Plane.HORIZONTAL) {
	             BlockState blockState = world.getBlockState(pos.offset(face));
	             net.minecraft.fluid.FluidState fluidState = world.getFluidState(pos.offset(face));
	             hasWater |= blockState.isIn(Blocks.FROSTED_ICE);
	             hasWater |= fluidState.isTagged(net.minecraft.tags.FluidTags.WATER);
	             if (hasWater)
	                break; //No point continuing.
	         }
	         
	         for (Direction face : Direction.Plane.VERTICAL) {
	             BlockState blockState = world.getBlockState(pos.offset(face));
	             net.minecraft.fluid.FluidState fluidState = world.getFluidState(pos.offset(face));
	             hasWater |= blockState.isIn(Blocks.FROSTED_ICE);
	             hasWater |= fluidState.isTagged(net.minecraft.tags.FluidTags.WATER);
	             if (hasWater)
	                break; //No point continuing.
	         }
	         return isBeach && hasWater;
	      }
	      return false;
	  }
}
