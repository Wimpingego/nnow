package com.github.wimpingego.nnow.objects.blocks.poi;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import javax.annotation.Nullable;

public class DoubleHighBlock extends Block {

    /**
     * We provide a slightly smaller render shape to prevent neighbour blocks from being culled.
     */

	private static final VoxelShape RENDER_SHAPE = VoxelShapes.create(1 / 16f, 1 / 16f, 1 / 16f, 15 / 16f, 15 / 16f, 15 / 16f);
	 
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;

    public DoubleHighBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getRenderShape(BlockState p_196247_1_, IBlockReader p_196247_2_, BlockPos p_196247_3_) {
        return RENDER_SHAPE;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
        builder.add(HALF);
    }

    @SuppressWarnings("deprecation")
	@Override
    public boolean isValidPosition(BlockState state, IWorldReader world, BlockPos pos) {
        // Do not allow placing directly on top of another
        Block blockBelow = world.getBlockState(pos.down()).getBlock();
        if (blockBelow == this) {
            return false;
        }

        // Do not allow placing directly below of another
        Block blockTwoAbove = world.getBlockState(pos.up(2)).getBlock();
        BlockState stateAbove = world.getBlockState(pos.up());
        return blockTwoAbove != this && stateAbove.isAir(world, pos.up());
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite()).with(HALF, DoubleBlockHalf.LOWER);
    }
    
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
        worldIn.setBlockState(pos.up(), state.with(HALF, DoubleBlockHalf.UPPER), 3);
     }

    @Override
    public void onReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean isMoving) {
        // Also destroy the connect upper or lower block
        if (world.getBlockState(pos.up()).getBlock() == this) {
            world.removeBlock(pos.up(), false);
        } else if (world.getBlockState(pos.down()).getBlock() == this) {
            world.removeBlock(pos.down(), false);
        }
    }

}