package com.github.wimpingego.nnow.objects.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.github.wimpingego.nnow.entities.ModTileEntityTypes;
import com.github.wimpingego.nnow.tileentity.SafeChestTileEntity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DirectionalBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.NetworkHooks;

public class SafeChestBlock extends DirectionalBlock {

	public static final DirectionProperty NORTH = DirectionalBlock.FACING;
	public static final DirectionProperty EAST = DirectionalBlock.FACING;
	public static final DirectionProperty SOUTH = DirectionalBlock.FACING;
	public static final DirectionProperty WEST = DirectionalBlock.FACING;
	public static final DirectionProperty UP = DirectionalBlock.FACING;
	public static final DirectionProperty DOWN = DirectionalBlock.FACING;
	
	public SafeChestBlock(Block.Properties builder) {
	super(builder);
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
		builder.add(NORTH );
	}
	
	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return ModTileEntityTypes.SAFE_CHEST.get().create();
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult result) {
		if (!worldIn.isRemote) {
			TileEntity tile = worldIn.getTileEntity(pos);
			if (tile instanceof SafeChestTileEntity) {
				NetworkHooks.openGui((ServerPlayerEntity) player, (SafeChestTileEntity) tile, pos);
				return ActionResultType.SUCCESS;
			}
		}
		return ActionResultType.FAIL;
	}

	@Override
	public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			TileEntity te = worldIn.getTileEntity(pos);
			if (te instanceof SafeChestTileEntity) {
				InventoryHelper.dropItems(worldIn, pos, ((SafeChestTileEntity) te).getItems());
			}
		}
	}
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.nnow.removed.line1").applyTextStyle(TextFormatting.RED)));
	}
}
