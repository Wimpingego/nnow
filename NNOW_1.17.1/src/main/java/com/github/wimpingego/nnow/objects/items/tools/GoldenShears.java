package com.github.wimpingego.nnow.objects.items.tools;

import com.github.wimpingego.nnow.util.config.ModConfigs;

import net.minecraft.world.item.ShearsItem;

import net.minecraft.world.item.Item.Properties;

public class GoldenShears extends ShearsItem {

	static int use = ModConfigs.GOLDEN_SHEARS_DURABILITY_MODIFIER.get();

	public GoldenShears(Properties builder) {
		super(builder.durability(use));
	}
}
