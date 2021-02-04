package com.github.wimpingego.nnow.objects.items.tools;

import com.github.wimpingego.nnow.util.config.ModConfigs;

import net.minecraft.item.ShearsItem;

public class DiamondShears extends ShearsItem {

	static int use = ModConfigs.DIAMOND_SHEARS_DURABILITY_MODIFIER.get();

	public DiamondShears(Properties builder) {
		super(builder.maxDamage(use));
	}
}
