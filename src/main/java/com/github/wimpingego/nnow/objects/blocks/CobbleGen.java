package com.github.wimpingego.nnow.objects.blocks;

import java.util.List;
import javax.annotation.Nullable;
import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.util.ModConfigs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DirectionalBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CobbleGen extends DirectionalBlock {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

	int wcost = ModConfigs.W_COST.get();
	int wreturn = ModConfigs.W_RETURN.get();
	int scost = ModConfigs.S_COST.get();
	int sreturn = ModConfigs.S_RETURN.get();
	int icost = ModConfigs.I_COST.get();
	int ireturn = ModConfigs.I_RETURN.get();
	int gcost = ModConfigs.G_COST.get();
	int greturn = ModConfigs.G_RETURN.get();
	int dcost = ModConfigs.D_COST.get();
	int dreturn = ModConfigs.D_RETURN.get();
	
	public CobbleGen(Properties properties)
	{
		super(properties);		
	}

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
	
	@SuppressWarnings("deprecation")
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
		ItemStack itemstack = player.getHeldItem(hand);

		if (itemstack.getItem() == Items.WOODEN_PICKAXE) {
	        itemstack.damageItem(wcost, player, e -> e.sendBreakAnimation(hand));
			ItemStack itemback;
			itemback = new ItemStack(Items.COBBLESTONE, wreturn);

			if (itemstack.isEmpty()) {
				player.setHeldItem(hand, itemback);

				return ActionResultType.SUCCESS;
			} else if (!player.inventory.addItemStackToInventory(itemback)) {
				player.dropItem(itemback, false);

				return ActionResultType.SUCCESS;
			}
		}
		
		if (itemstack.getItem() == Items.STONE_PICKAXE) {
	        itemstack.damageItem(scost, player, e -> e.sendBreakAnimation(hand));
			ItemStack itemback;
			itemback = new ItemStack(Items.COBBLESTONE, sreturn);

			if (itemstack.isEmpty()) {
				player.setHeldItem(hand, itemback);

				return ActionResultType.SUCCESS;
			} else if (!player.inventory.addItemStackToInventory(itemback)) {
				player.dropItem(itemback, false);

				return ActionResultType.SUCCESS;
			}
		}
		
		if (itemstack.getItem() == Items.IRON_PICKAXE) {
	        itemstack.damageItem(icost, player, e -> e.sendBreakAnimation(hand));
			ItemStack itemback;
			itemback = new ItemStack(Items.COBBLESTONE, ireturn);

			if (itemstack.isEmpty()) {
				player.setHeldItem(hand, itemback);

				return ActionResultType.SUCCESS;
			} else if (!player.inventory.addItemStackToInventory(itemback)) {
				player.dropItem(itemback, false);

				return ActionResultType.SUCCESS;
			}
		}
		
		if (itemstack.getItem() == Items.GOLDEN_PICKAXE) {
			itemstack.damageItem(gcost, player, e -> e.sendBreakAnimation(hand));
			ItemStack itemback;
			itemback = new ItemStack(Items.OBSIDIAN, greturn);

			if (itemstack.isEmpty()) {
				player.setHeldItem(hand, itemback);

				return ActionResultType.SUCCESS;
			} else if (!player.inventory.addItemStackToInventory(itemback)) {
				player.dropItem(itemback, false);

				return ActionResultType.SUCCESS;
			}
		}
		
		if (itemstack.getItem() == Items.DIAMOND_PICKAXE) {
			itemstack.damageItem(dcost, player, e -> e.sendBreakAnimation(hand));
			ItemStack itemback;
			itemback = new ItemStack(Items.COBBLESTONE, dreturn);

			if (itemstack.isEmpty()) {
				player.setHeldItem(hand, itemback);

				return ActionResultType.SUCCESS;
			} else if (!player.inventory.addItemStackToInventory(itemback)) {
				player.dropItem(itemback, false);

				return ActionResultType.SUCCESS;
			}
		}
			
			if (itemstack.getItem() == ItemList.S_HAMMER.get()) {
		        itemstack.damageItem(scost/2, player, e -> e.sendBreakAnimation(hand));
				ItemStack itemback;
				itemback = new ItemStack(Items.COBBLESTONE, sreturn*2);

				if (itemstack.isEmpty()) {
					player.setHeldItem(hand, itemback);

					return ActionResultType.SUCCESS;
				} else if (!player.inventory.addItemStackToInventory(itemback)) {
					player.dropItem(itemback, false);

					return ActionResultType.SUCCESS;
				}
			}
			
			if (itemstack.getItem() == ItemList.I_HAMMER.get()) {
		        itemstack.damageItem(icost/2, player, e -> e.sendBreakAnimation(hand));
				ItemStack itemback;
				itemback = new ItemStack(Items.COBBLESTONE, ireturn*2);

				if (itemstack.isEmpty()) {
					player.setHeldItem(hand, itemback);

					return ActionResultType.SUCCESS;
				} else if (!player.inventory.addItemStackToInventory(itemback)) {
					player.dropItem(itemback, false);

					return ActionResultType.SUCCESS;
				}
			}
			
			if (itemstack.getItem() == ItemList.G_HAMMER.get()) {
				itemstack.damageItem(gcost/2, player, e -> e.sendBreakAnimation(hand));
				ItemStack itemback;
				itemback = new ItemStack(Items.OBSIDIAN, greturn*2);

				if (itemstack.isEmpty()) {
					player.setHeldItem(hand, itemback);

					return ActionResultType.SUCCESS;
				} else if (!player.inventory.addItemStackToInventory(itemback)) {
					player.dropItem(itemback, false);

					return ActionResultType.SUCCESS;
				}
			}
			
			if (itemstack.getItem() == ItemList.D_HAMMER.get()) {
				itemstack.damageItem(dcost/2, player, e -> e.sendBreakAnimation(hand));
				ItemStack itemback;
				itemback = new ItemStack(Items.COBBLESTONE, dreturn*2);

				if (itemstack.isEmpty()) {
					player.setHeldItem(hand, itemback);

					return ActionResultType.SUCCESS;
				} else if (!player.inventory.addItemStackToInventory(itemback)) {
					player.dropItem(itemback, false);

					return ActionResultType.SUCCESS;
				}
		}
		
		   return super.onBlockActivated(state, worldIn, pos, player, hand, hit);
		}

	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.nnow.cobblegen.line1").applyTextStyle(TextFormatting.GREEN)));
		tooltip.add((new TranslationTextComponent("item.nnow.cobblegen.general.line1").applyTextStyle(TextFormatting.YELLOW)));
	}
}