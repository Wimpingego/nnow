package com.github.wimpingego.nnow.objects.blocks.slabs;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.init.BlockList;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.SlabBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import javax.annotation.Nullable;

@EventBusSubscriber(modid=NNOW.MOD_ID, bus=Bus.MOD, value=Dist.CLIENT)
public class PathSlab extends SlabBlock implements IWaterLoggable
{
	
	private static final VoxelShape BOTTOM_SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
	private static final VoxelShape TOP_SHAPE = Block.makeCuboidShape(0.0D, 8.0D, 0.0D, 16.0D, 15.0D, 16.0D);
	private static final VoxelShape DOUBLE_SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D);
	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	
	public PathSlab()
	{
		super(Block.Properties.from(Blocks.GRASS_PATH));
		this.setDefaultState(this.getDefaultState().with(SlabBlock.TYPE, SlabType.BOTTOM).with(WATERLOGGED, Boolean.FALSE));
	}
	
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) 
	{
		builder.add(SlabBlock.TYPE, WATERLOGGED);
	}

	@Override
	public boolean isTransparent(BlockState state) {
		return state.get(SlabBlock.TYPE) != SlabType.DOUBLE;
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
	{
		SlabType slabtype = state.get(SlabBlock.TYPE);
		switch (slabtype)
		{
			case DOUBLE:
				return PathSlab.DOUBLE_SHAPE;
			case TOP:
				return PathSlab.TOP_SHAPE;
			default:
				return PathSlab.BOTTOM_SHAPE;
		}
	}
	
	@Override
	@Nullable
	public BlockState getStateForPlacement(BlockItemUseContext context)
	{

		BlockPos blockpos = context.getPos();
		BlockState blockstate = context.getWorld().getBlockState(blockpos);
		
		SlabType slabtype = null;
		if(blockstate.getProperties().contains(SlabBlock.TYPE))
			slabtype = blockstate.get(SlabBlock.TYPE);
		
		if (blockstate.getBlock() == this || slabtype == SlabType.BOTTOM
				&&(blockstate.getBlock() == BlockList.DIRT_SLAB.get()
				|| blockstate.getBlock() == BlockList.GRASS_SLAB.get()
				|| blockstate.getBlock() == BlockList.COARSEDIRT_SLAB.get()))
		{
			return Blocks.GRASS_PATH.getDefaultState();
		}
		else if (slabtype == SlabType.TOP && blockstate.getBlock() == BlockList.DIRT_SLAB.get())
		{
			return Blocks.DIRT.getDefaultState();
		}
		else if (slabtype == SlabType.TOP && blockstate.getBlock() == BlockList.GRASS_SLAB.get())
		{
			return Blocks.GRASS_BLOCK.getDefaultState();
		}
		else if (slabtype == SlabType.TOP && blockstate.getBlock() == BlockList.COARSEDIRT_SLAB.get())
		{
			return Blocks.COARSE_DIRT.getDefaultState();
		}
		else
		{
			IFluidState ifluidstate = context.getWorld().getFluidState(blockpos);
			BlockState blockstate1 = this.getDefaultState().with(SlabBlock.TYPE, SlabType.BOTTOM).with(WATERLOGGED, ifluidstate.getFluid() == Fluids.WATER);
			Direction direction = context.getFace();
			return direction != Direction.DOWN && (direction == Direction.UP || !(context.getHitVec().y - (double) blockpos.getY() > 0.5D)) ? blockstate1 : blockstate1.with(SlabBlock.TYPE, SlabType.TOP);
		}
	}
	
	@Override
	public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
		BlockState blockstate = worldIn.getBlockState(pos.up());
		return !blockstate.getMaterial().isSolid() || blockstate.getBlock() instanceof FenceGateBlock;
	}
	
	public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
		return false;
	}

	@OnlyIn(Dist.CLIENT)
	public boolean func_229870_f_(BlockState p_229870_1_, IBlockReader p_229870_2_, BlockPos p_229870_3_) {
		return true;
	}
	
	@Override
	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
		if (facing == Direction.UP && !stateIn.isValidPosition(worldIn, currentPos)) {
			worldIn.getPendingBlockTicks().scheduleTick(currentPos, this, 1);
		}

		return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	}
}