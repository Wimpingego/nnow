package com.github.wimpingego.nnow.objects.items.tools;

import com.github.wimpingego.nnow.util.config.ModConfigs;

import net.minecraft.item.ShearsItem;

public class WoodenShears extends ShearsItem {

	static int use = ModConfigs.WOODEN_SHEARS_DURABILITY_MODIFIER.get();

	public WoodenShears(Properties builder) {
		super(builder.maxDamage(use));
	}
}
