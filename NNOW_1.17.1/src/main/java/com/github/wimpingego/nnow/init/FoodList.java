package com.github.wimpingego.nnow.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

public class FoodList {

	//public static final Food PEPPER = (new Food.Builder().hunger(2).saturation(0.2F).setAlwaysEdible()).build();
	public static final FoodProperties BERRY = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).alwaysEat().fast()).build();
	
	@SuppressWarnings("deprecation")
	public static final FoodProperties DEATH_POTATO = (new FoodProperties.Builder()).nutrition(4).saturationMod(1.2F).effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 0.6F).effect(new MobEffectInstance(MobEffects.CONFUSION, 240, 1), 1.0F).build();

}
