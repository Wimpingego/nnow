package com.github.wimpingego.nnow.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodList {

	public static final Food PEPPER = (new Food.Builder().hunger(2).saturation(0.2F).setAlwaysEdible()).build();
	
	public static final Food BERRY = (new Food.Builder().hunger(2).saturation(0.2f).setAlwaysEdible().fastToEat()).build();
	
	@SuppressWarnings("deprecation")
	public static final Food DEATH_POTATO = (new Food.Builder()).hunger(4).saturation(1.2F).effect(new EffectInstance(Effects.REGENERATION, 100, 0), 0.6F).effect(new EffectInstance(Effects.NAUSEA, 240, 1), 1.0F).setAlwaysEdible().build();
	@SuppressWarnings("deprecation")
	public static final Food WEETABIX = (new Food.Builder()).hunger(5).saturation(1.2F).effect(new EffectInstance(Effects.STRENGTH, 600, 0), 1.0F).setAlwaysEdible().build();
	
	
}
