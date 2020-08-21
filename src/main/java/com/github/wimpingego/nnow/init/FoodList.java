package com.github.wimpingego.nnow.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodList {

	//public static final Food PEPPER = (new Food.Builder().hunger(2).saturation(0.2F).setAlwaysEdible()).build();
	public static final Food BERRY = (new Food.Builder().hunger(2).saturation(0.2f).setAlwaysEdible().fastToEat()).build();
	public static final Food WEETABIX = (new Food.Builder()).hunger(5).saturation(0.6F).build();
	
	@SuppressWarnings("deprecation")
	public static final Food DEATH_POTATO = (new Food.Builder()).hunger(4).saturation(1.2F).effect(new EffectInstance(Effects.REGENERATION, 200, 1), 0.6F).effect(new EffectInstance(Effects.NAUSEA, 240, 1), 1.0F).build();
	
	@SuppressWarnings("deprecation")
	public static final Food BOWLOFWEETABIX = (new Food.Builder()).hunger(10).saturation(1.2F).effect(new EffectInstance(Effects.STRENGTH, 600, 2), 1.0F).effect(new EffectInstance(Effects.REGENERATION, 300, 4), 1.0F).build();
		
}
