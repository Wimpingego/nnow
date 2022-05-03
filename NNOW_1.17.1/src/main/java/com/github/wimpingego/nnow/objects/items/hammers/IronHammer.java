package com.github.wimpingego.nnow.objects.items.hammers;

import com.github.wimpingego.nnow.util.config.ModConfigs;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import net.minecraft.world.item.Item.Properties;

public class IronHammer extends HammerBase {

	Double speed = ModConfigs.IRON_TIER_TOOL_SPEED_MODIFIER.get();
	static int use = ModConfigs.IRON_TIER_TOOL_DURABILITY_MODIFIER.get();

	public IronHammer(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder.durability(use));
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState state) {
		return super.getDestroySpeed(stack, state) / speed.floatValue();
	}

	@Override
	public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == Items.IRON_INGOT;
	}

}
