package com.github.wimpingego.nnow.objects.items.spade;

import java.util.List;

import com.github.wimpingego.nnow.util.ModConfigs;
import com.github.wimpingego.nnow.util.helpers.KeyboardHelper;

import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class EmeraldSpade extends SpadeBase {

	Double speed = ModConfigs.EMERALD_TIER_TOOL_SPEED_MODIFIER.get();
	static int use = ModConfigs.EMERALD_TIER_TOOL_DURABILITY_MODIFIER.get();

	public EmeraldSpade(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder.maxDamage(use));
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState state) {
		return super.getDestroySpeed(stack, state) / speed.floatValue();
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == Items.EMERALD;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add((new TranslationTextComponent("item.nnow.spade.line3").applyTextStyle(TextFormatting.GREEN)));
		} else {
			tooltip.add(new StringTextComponent("Hold " + "\u00A75" + "Shift " + "\u00A7r"+ "For More Info"));
		}
	}

}
