package com.github.wimpingego.nnow.objects.items.hammers;

import java.util.List;

import com.github.wimpingego.nnow.util.config.ModConfigs;
import com.github.wimpingego.nnow.util.helpers.KeyboardHelper;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;

import net.minecraft.world.item.Item.Properties;

public class EmeraldHammer extends HammerBase {

	Double speed = ModConfigs.EMERALD_TIER_TOOL_SPEED_MODIFIER.get();
	static int use = ModConfigs.EMERALD_TIER_TOOL_DURABILITY_MODIFIER.get();

	public EmeraldHammer(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder.durability(use));
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState state) {
		return super.getDestroySpeed(stack, state) / speed.floatValue();
	}

	@Override
	public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == Items.EMERALD;
	}
	
	@Override
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift()) {
			tooltip.add((new TranslatableComponent("item.nnow.hammer.line2")));
		} else {
			tooltip.add(new TextComponent("Hold " + "\u00A75" + "Shift " + "\u00A7r"+ "For More Info"));
		}
	}
}
