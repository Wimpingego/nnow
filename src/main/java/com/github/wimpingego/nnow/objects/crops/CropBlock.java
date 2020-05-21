package com.github.wimpingego.nnow.objects.crops;


import com.github.wimpingego.nnow.init.ItemList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.item.ItemStack;
//import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class CropBlock extends CropsBlock {
	private String name;

	public CropBlock(Block.Properties builder, String name) {
		super(builder);
		this.name = name;
		this.setDefaultState(this.stateContainer.getBaseState().with(this.getAgeProperty(), Integer.valueOf(0)));
	}

	protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return state.getBlock() instanceof FarmlandBlock;
	}

	//protected IItemProvider getSeedsItem() {
		//switch (name) {
		//case "barley":
		//	return ItemList.BARLEY.get();
		//case "pepper":
		//	return ItemList.PEPPER.get();
		//default:
		//	return ItemList.PEPPER.get();
		//}
	//}

	public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
		switch (name) {
		case "barley":
			return new ItemStack(ItemList.BARLEY_SEEDS.get());
		case "pepper":
			return new ItemStack(ItemList.PEPPER_SEEDS.get());
		default:
			return new ItemStack(ItemList.PEPPER_SEEDS.get());
		}
	}

}
