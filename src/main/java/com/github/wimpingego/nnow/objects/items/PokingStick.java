package com.github.wimpingego.nnow.objects.items;

import java.util.List;

import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.util.ModConfigs;
import com.github.wimpingego.nnow.util.helpers.KeyboardHelper;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
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

	static int use = ModConfigs.MAX_USES.get();
	
	public PokingStick(Properties properties) {
		super(properties.maxDamage(use));       
	}
	
	@Override
	public Item asItem() {
		return super.asItem();
	}

	@Override
	public int getBurnTime(ItemStack itemStack) {
	return 300;
	}
		
	//GRASS & DRIT BLOCKS
	
		public ActionResultType onItemUse(ItemUseContext context) {
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.GRASS_BLOCK) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_DUST.get(),0 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.PODZOL) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_DUST.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.DIRT) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_DUST.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}		
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.COARSE_DIRT) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_DUST.get(),2 + random.nextInt(3)));
					context.getItem().damageItem(1, context.getPlayer(), (playerIn) -> {
						playerIn.sendBreakAnimation(context.getHand());
					});
					return ActionResultType.SUCCESS;
				}
			}
		}	
		
		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.MYCELIUM) {
			for (ItemStack stack : context.getPlayer().inventory.mainInventory) {
				if (stack.isEmpty()) {
					context.getPlayer().addItemStackToInventory(new ItemStack(ItemList.STONE_DUST.get(),2 + random.nextInt(3)));
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
