package com.github.wimpingego.nnow.objects.blocks;

import com.github.wimpingego.nnow.entities.ModTileEntityTypes;
import com.github.wimpingego.nnow.init.BlockList;
import com.github.wimpingego.nnow.tileentity.BookshelfChestTileEntity;
import com.github.wimpingego.nnow.util.ModConfigs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class BookshelfChestBlock extends Block {

	public BookshelfChestBlock(Properties properties) {
		super(properties);
	}
	
	int value = ModConfigs.ENCHANT_POWER.get();

	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return ModTileEntityTypes.BOOKSHELF_CHEST.get().create();
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult result) {
		if (!worldIn.isRemote) {
			TileEntity tile = worldIn.getTileEntity(pos);
			if (tile instanceof BookshelfChestTileEntity) {
				NetworkHooks.openGui((ServerPlayerEntity) player, (BookshelfChestTileEntity) tile, pos);
				return ActionResultType.SUCCESS;
			}
		}
		return ActionResultType.FAIL;
	}

	@Override
	public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			TileEntity te = worldIn.getTileEntity(pos);
			if (te instanceof BookshelfChestTileEntity) {
				InventoryHelper.dropItems(worldIn, pos, ((BookshelfChestTileEntity) te).getItems());
			}
		}
	}

	@Override
	public float getEnchantPowerBonus(BlockState state, IWorldReader world, BlockPos pos)
	{
        return this.getBlock() == BlockList.BOOKSHELF_CHEST.get() ? value: 0;
	}
}