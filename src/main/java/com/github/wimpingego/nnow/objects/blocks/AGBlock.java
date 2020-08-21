package com.github.wimpingego.nnow.objects.blocks;

import com.github.wimpingego.nnow.init.BlockList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

public class AGBlock extends Block {

	public AGBlock(Properties properties) {
    		super(properties);
	}

	@Override
	public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing,
			IPlantable plantable) {
		BlockState plant = plantable.getPlant(world, pos.offset(facing));
		PlantType type = plantable.getPlantType(world, pos.offset(facing));

		if (plant.getBlock() == Blocks.CACTUS)
			return this.getBlock() == Blocks.CACTUS || this.getBlock() == BlockList.AGG_BLOCK.get()
					|| this.getBlock() == BlockList.AGRS_BLOCK.get() || this.getBlock() == BlockList.AGS_BLOCK.get();

		if (plant.getBlock() == Blocks.SUGAR_CANE && this == Blocks.SUGAR_CANE)
			return true;

		switch (type) {
		case Desert:
			return this.getBlock() == BlockList.AGG_BLOCK.get() || this.getBlock() == BlockList.AGRS_BLOCK.get()
					|| this.getBlock() == BlockList.AGS_BLOCK.get();
		case Plains:
			return this.getBlock() == BlockList.AGG_BLOCK.get() || this.getBlock() == BlockList.AGRS_BLOCK.get()
					|| this.getBlock() == BlockList.AGS_BLOCK.get();
		case Water:
			return state.getMaterial() == Material.WATER; // && state.getValue(BlockLiquidWrapper)
		case Beach:
			boolean isBeach = this.getBlock() == BlockList.AGG_BLOCK.get()
					|| this.getBlock() == BlockList.AGRS_BLOCK.get() || this.getBlock() == BlockList.AGS_BLOCK.get();
			boolean hasWater = (world.getBlockState(pos.east()).getMaterial() == Material.WATER
					|| world.getBlockState(pos.west()).getMaterial() == Material.WATER
					|| world.getBlockState(pos.north()).getMaterial() == Material.WATER
					|| world.getBlockState(pos.south()).getMaterial() == Material.WATER
					|| world.getBlockState(pos.down()).getMaterial() == Material.WATER);
			return isBeach && hasWater;
		case Cave:
			break;
		case Crop:
			break;
		case Nether:
			break;
		default:
			break;
		}
		return false;
	}

}
