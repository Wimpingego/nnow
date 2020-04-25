package com.github.wimpingego.nnow.objects.items;

import java.util.List;

import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.util.helpers.KeyboardHelper;

import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
//import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class PokingStick extends Item {

	public PokingStick(Properties properties) {
		super(properties);
	}
	
	@Override
	public Item asItem() {
		return super.asItem();
	}

	@Override
	public int getBurnTime(ItemStack itemStack) {
	return 600;
	}
		
		public ActionResultType onItemUse(ItemUseContext context) {
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.IRON_ORE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.IRONBERRY.get()));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
			//context.getWorld().addEntity(new ItemEntity(context.getWorld(), context.getPos().getX(),
				//	context.getPos().getY(), context.getPos().getZ(), new ItemStack(ItemList.IRONBERRY.get())));
			//return ActionResultType.SUCCESS;
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.GOLD_ORE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.GOLDBERRY.get()));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.COAL_ORE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.COALBERRY.get()));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.REDSTONE_ORE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.REDSTONEBERRY.get()));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.NETHER_QUARTZ_ORE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.QUARTZBERRY.get()));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}		
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.DIAMOND_ORE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.DIAMONDBERRY.get()));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}

		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.EMERALD_ORE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.EMERALDBERRY.get()));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
			
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.LAPIS_ORE) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.LAPISBERRY.get()));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
				
		return ActionResultType.FAIL;
	}
		
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add((new TranslationTextComponent("item.nnow.poking_stick.line1").applyTextStyle(TextFormatting.YELLOW)));
		} else {
			tooltip.add(new StringTextComponent("Hold " + "\u00A75" + "Shift " + "\u00A7r"+ "For More Info"));
		}
	}	
}	
