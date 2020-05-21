package com.github.wimpingego.nnow.init;

import net.minecraft.item.Food;

public class FoodList {

	public static final Food COIN_C = (new Food.Builder().hunger(2).saturation(0.2F).setAlwaysEdible()).build();
	public static final Food PEPPER = (new Food.Builder().hunger(2).saturation(0.2F).setAlwaysEdible()).build();
	public static final Food BERRY = (new Food.Builder().hunger(4).saturation(0.5f).setAlwaysEdible().fastToEat()).build();
}
